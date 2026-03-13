package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
/* renamed from: wG  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC3004wG extends Binder implements IInterface {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;

    public BinderC3004wG(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.c = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.b;
        return this;
    }

    public void e(int i, String[] strArr) {
        synchronized (((MultiInstanceInvalidationService) this.c).d) {
            try {
                String str = (String) ((MultiInstanceInvalidationService) this.c).c.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = ((MultiInstanceInvalidationService) this.c).d.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    Integer num = (Integer) ((MultiInstanceInvalidationService) this.c).d.getBroadcastCookie(i2);
                    int intValue = num.intValue();
                    String str2 = (String) ((MultiInstanceInvalidationService) this.c).c.get(num);
                    if (i != intValue && str.equals(str2)) {
                        try {
                            ((FC) ((MultiInstanceInvalidationService) this.c).d.getBroadcastItem(i2)).e(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                }
                ((MultiInstanceInvalidationService) this.c).d.finishBroadcast();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int f(FC fc, String str) {
        if (str == null) {
            return 0;
        }
        synchronized (((MultiInstanceInvalidationService) this.c).d) {
            try {
                MultiInstanceInvalidationService multiInstanceInvalidationService = (MultiInstanceInvalidationService) this.c;
                int i = multiInstanceInvalidationService.b + 1;
                multiInstanceInvalidationService.b = i;
                if (multiInstanceInvalidationService.d.register(fc, Integer.valueOf(i))) {
                    ((MultiInstanceInvalidationService) this.c).c.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = (MultiInstanceInvalidationService) this.c;
                multiInstanceInvalidationService2.b--;
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, FC] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, FC] */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.b) {
            case 0:
                if (i != 1) {
                    if (i != 1598968902) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    parcel2.writeString("com.android.vending.licensing.ILicenseResultListener");
                    return true;
                }
                parcel.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                ((ServiceConnectionC3090xG) this.c).d.K(parcel.readInt(), parcel.readString(), parcel.readString());
                return true;
            default:
                FC fc = null;
                FC fc2 = null;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 1598968902) {
                                return super.onTransact(i, parcel, parcel2, i2);
                            }
                            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                            return true;
                        }
                        parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                        e(parcel.readInt(), parcel.createStringArray());
                        return true;
                    }
                    parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof FC)) {
                            fc2 = (FC) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.b = readStrongBinder;
                            fc2 = obj;
                        }
                    }
                    int readInt = parcel.readInt();
                    synchronized (((MultiInstanceInvalidationService) this.c).d) {
                        ((MultiInstanceInvalidationService) this.c).d.unregister(fc2);
                        ((MultiInstanceInvalidationService) this.c).c.remove(Integer.valueOf(readInt));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                    if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof FC)) {
                        fc = (FC) queryLocalInterface2;
                    } else {
                        ?? obj2 = new Object();
                        obj2.b = readStrongBinder2;
                        fc = obj2;
                    }
                }
                int f = f(fc, parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(f);
                return true;
        }
    }

    public BinderC3004wG(ServiceConnectionC3090xG serviceConnectionC3090xG) {
        this.c = serviceConnectionC3090xG;
        attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
    }
}
