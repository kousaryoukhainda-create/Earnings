package com.applovin.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import io.flutter.plugins.firebase.auth.Constants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public final class eg {
    private static eg e;
    private final Handler a = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    private final Object c = new Object();
    private int d = 0;

    /* loaded from: classes.dex */
    public static final class b {
        private static volatile boolean a;
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(int i);
    }

    /* loaded from: classes.dex */
    public final class d extends BroadcastReceiver {
        private d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int c = eg.c(context);
            int i = xp.a;
            if (i >= 29 && !b.a && c == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) b1.a((TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE));
                    e eVar = new e();
                    if (i < 31) {
                        telephonyManager.listen(eVar, 1);
                    } else {
                        telephonyManager.listen(eVar, 1048576);
                    }
                    telephonyManager.listen(eVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            eg.this.a(c);
        }
    }

    /* loaded from: classes.dex */
    public class e extends PhoneStateListener {
        private e() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType;
            boolean z;
            int i;
            overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            if (overrideNetworkType != 3 && overrideNetworkType != 4) {
                z = false;
            } else {
                z = true;
            }
            eg egVar = eg.this;
            if (z) {
                i = 10;
            } else {
                i = 5;
            }
            egVar.a(i);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            String serviceState2;
            boolean z;
            int i;
            if (serviceState == null) {
                serviceState2 = "";
            } else {
                serviceState2 = serviceState.toString();
            }
            if (!serviceState2.contains("nrState=CONNECTED") && !serviceState2.contains("nrState=NOT_RESTRICTED")) {
                z = false;
            } else {
                z = true;
            }
            eg egVar = eg.this;
            if (z) {
                i = 10;
            } else {
                i = 5;
            }
            egVar.a(i);
        }
    }

    private eg(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        if (type != 9) {
                            if (type != 4 && type != 5) {
                                if (type == 6) {
                                    return 5;
                                }
                                return 8;
                            }
                        } else {
                            return 7;
                        }
                    } else {
                        return 2;
                    }
                }
                return a(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    public void b(c cVar) {
        b();
        this.b.add(new WeakReference(cVar));
        this.a.post(new RunnableC1290ef0(12, this, cVar));
    }

    private static int a(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return xp.a >= 29 ? 9 : 0;
        }
    }

    private void b() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.b.remove(weakReference);
            }
        }
    }

    public int a() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public static synchronized eg b(Context context) {
        eg egVar;
        synchronized (eg.class) {
            try {
                if (e == null) {
                    e = new eg(context);
                }
                egVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return egVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        cVar.a(a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        synchronized (this.c) {
            try {
                if (this.d == i) {
                    return;
                }
                this.d = i;
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    c cVar = (c) weakReference.get();
                    if (cVar != null) {
                        cVar.a(i);
                    } else {
                        this.b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
