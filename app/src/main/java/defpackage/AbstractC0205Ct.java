package defpackage;

import android.app.Application;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: Ct  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0205Ct {
    public static final C2741tB a = new C2741tB(AbstractC0205Ct.class.getSimpleName(), 8);

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, yt] */
    public static String a(Application application) {
        InterfaceC0153At interfaceC0153At;
        ServiceConnectionC0179Bt serviceConnectionC0179Bt = new ServiceConnectionC0179Bt();
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (application.bindService(intent, serviceConnectionC0179Bt, 1)) {
            try {
                if (!serviceConnectionC0179Bt.b) {
                    serviceConnectionC0179Bt.b = true;
                    IBinder iBinder = (IBinder) serviceConnectionC0179Bt.c.take();
                    int i = AbstractBinderC3314zt.b;
                    if (iBinder == null) {
                        interfaceC0153At = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0153At)) {
                            interfaceC0153At = (InterfaceC0153At) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.b = iBinder;
                            interfaceC0153At = obj;
                        }
                    }
                    C3228yt c3228yt = (C3228yt) interfaceC0153At;
                    c3228yt.getClass();
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    c3228yt.b.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    obtain2.recycle();
                    obtain.recycle();
                    application.unbindService(serviceConnectionC0179Bt);
                    return readString;
                }
                throw new IllegalStateException();
            } catch (Throwable unused) {
                application.unbindService(serviceConnectionC0179Bt);
                return "";
            }
        }
        return "";
    }
}
