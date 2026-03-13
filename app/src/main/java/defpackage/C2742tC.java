package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* renamed from: tC  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2742tC implements InterfaceC2914vC {
    public IBinder b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.b;
    }

    public final boolean e(BinderC0352Ik binderC0352Ik, Uri uri, Bundle bundle, ArrayList arrayList) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC2914vC.T7);
            obtain.writeStrongInterface(binderC0352Ik);
            AbstractC2618rm.Z(obtain, uri);
            AbstractC2618rm.Z(obtain, bundle);
            int size = arrayList.size();
            obtain.writeInt(size);
            boolean z = false;
            for (int i = 0; i < size; i++) {
                AbstractC2618rm.Z(obtain, (Parcelable) arrayList.get(i));
            }
            this.b.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean f(BinderC0352Ik binderC0352Ik) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC2914vC.T7);
            obtain.writeStrongInterface(binderC0352Ik);
            boolean z = false;
            this.b.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final int g(BinderC0352Ik binderC0352Ik, String str, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC2914vC.T7);
            obtain.writeStrongInterface(binderC0352Ik);
            obtain.writeString(str);
            AbstractC2618rm.Z(obtain, bundle);
            this.b.transact(8, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean h(BinderC0352Ik binderC0352Ik, Uri uri) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC2914vC.T7);
            obtain.writeStrongInterface(binderC0352Ik);
            AbstractC2618rm.Z(obtain, uri);
            boolean z = false;
            this.b.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean i(BinderC0352Ik binderC0352Ik, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC2914vC.T7);
            obtain.writeStrongInterface(binderC0352Ik);
            AbstractC2618rm.Z(obtain, uri);
            AbstractC2618rm.Z(obtain, bundle);
            boolean z = false;
            this.b.transact(11, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean j(BinderC0352Ik binderC0352Ik, int i, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC2914vC.T7);
            obtain.writeStrongInterface(binderC0352Ik);
            obtain.writeInt(i);
            AbstractC2618rm.Z(obtain, uri);
            AbstractC2618rm.Z(obtain, bundle);
            boolean z = false;
            this.b.transact(9, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean k() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC2914vC.T7);
            obtain.writeLong(0L);
            boolean z = false;
            this.b.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z = true;
            }
            return z;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
