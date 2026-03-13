package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
/* renamed from: xC  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3086xC implements InterfaceC3258zC {
    public IBinder b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.b;
    }

    public final void e(BinderC0155Av binderC0155Av, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            obtain.writeStrongInterface(binderC0155Av);
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.b.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final void f(BinderC0207Cv binderC0207Cv, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            obtain.writeStrongInterface(binderC0207Cv);
            obtain.writeString(str);
            this.b.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
