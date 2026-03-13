package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* renamed from: hP  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC1526hP implements Handler.Callback, ServiceConnection {
    public final Context b;
    public final Handler c;
    public final HashMap d = new HashMap();
    public HashSet f = new HashSet();

    public ServiceConnectionC1526hP(Context context) {
        this.b = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(C1440gP c1440gP) {
        boolean z;
        ArrayDeque arrayDeque;
        boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = c1440gP.a;
        if (isLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + c1440gP.d.size() + " queued tasks");
        }
        if (c1440gP.d.isEmpty()) {
            return;
        }
        if (c1440gP.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.b;
            boolean bindService = context.bindService(component, this, 33);
            c1440gP.b = bindService;
            if (bindService) {
                c1440gP.e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = c1440gP.b;
        }
        if (z && c1440gP.c != null) {
            while (true) {
                arrayDeque = c1440gP.d;
                C1268eP c1268eP = (C1268eP) arrayDeque.peek();
                if (c1268eP == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + c1268eP);
                    }
                    c1268eP.a(c1440gP.c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + componentName);
                    }
                } catch (RemoteException e) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
                }
            }
            if (!arrayDeque.isEmpty()) {
                b(c1440gP);
                return;
            }
            return;
        }
        b(c1440gP);
    }

    public final void b(C1440gP c1440gP) {
        Handler handler = this.c;
        ComponentName componentName = c1440gP.a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = c1440gP.e;
        int i2 = i + 1;
        c1440gP.e = i2;
        if (i2 > 6) {
            StringBuilder sb = new StringBuilder("Giving up on delivering ");
            ArrayDeque arrayDeque = c1440gP.d;
            sb.append(arrayDeque.size());
            sb.append(" tasks to ");
            sb.append(componentName);
            sb.append(" after ");
            sb.append(c1440gP.e);
            sb.append(" retries");
            Log.w("NotifManCompat", sb.toString());
            arrayDeque.clear();
            return;
        }
        int i3 = (1 << i) * 1000;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, GC] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        IC ic = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    C1440gP c1440gP = (C1440gP) this.d.get((ComponentName) message.obj);
                    if (c1440gP != null) {
                        a(c1440gP);
                    }
                    return true;
                }
                C1440gP c1440gP2 = (C1440gP) this.d.get((ComponentName) message.obj);
                if (c1440gP2 != null) {
                    if (c1440gP2.b) {
                        this.b.unbindService(this);
                        c1440gP2.b = false;
                    }
                    c1440gP2.c = null;
                }
                return true;
            }
            C1354fP c1354fP = (C1354fP) message.obj;
            ComponentName componentName = c1354fP.a;
            IBinder iBinder = c1354fP.b;
            C1440gP c1440gP3 = (C1440gP) this.d.get(componentName);
            if (c1440gP3 != null) {
                int i2 = HC.b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(IC.U7);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof IC)) {
                        ic = (IC) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.b = iBinder;
                        ic = obj;
                    }
                }
                c1440gP3.c = ic;
                c1440gP3.e = 0;
                a(c1440gP3);
            }
            return true;
        }
        C1268eP c1268eP = (C1268eP) message.obj;
        String string = Settings.Secure.getString(this.b.getContentResolver(), "enabled_notification_listeners");
        synchronized (C1612iP.c) {
            if (string != null) {
                try {
                    if (!string.equals(C1612iP.d)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet2.add(unflattenFromString.getPackageName());
                            }
                        }
                        C1612iP.e = hashSet2;
                        C1612iP.d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashSet = C1612iP.e;
        }
        if (!hashSet.equals(this.f)) {
            this.f = hashSet;
            List<ResolveInfo> queryIntentServices = this.b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSet3 = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                    } else {
                        hashSet3.add(componentName2);
                    }
                }
            }
            Iterator it = hashSet3.iterator();
            while (it.hasNext()) {
                ComponentName componentName3 = (ComponentName) it.next();
                if (!this.d.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                    }
                    this.d.put(componentName3, new C1440gP(componentName3));
                }
            }
            Iterator it2 = this.d.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet3.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    C1440gP c1440gP4 = (C1440gP) entry.getValue();
                    if (c1440gP4.b) {
                        this.b.unbindService(this);
                        c1440gP4.b = false;
                    }
                    c1440gP4.c = null;
                    it2.remove();
                }
            }
        }
        for (C1440gP c1440gP5 : this.d.values()) {
            c1440gP5.d.add(c1268eP);
            a(c1440gP5);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.c.obtainMessage(1, new C1354fP(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.c.obtainMessage(2, componentName).sendToTarget();
    }
}
