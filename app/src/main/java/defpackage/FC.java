package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: FC  reason: default package */
/* loaded from: classes.dex */
public final class FC implements IInterface {
    public IBinder b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.b;
    }

    public final void e(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
            obtain.writeStringArray(strArr);
            this.b.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
