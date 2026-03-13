package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import com.android.vending.licensing.ILicensingService;
/* renamed from: DC  reason: default package */
/* loaded from: classes.dex */
public final class DC implements ILicensingService {
    public IBinder b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.b;
    }

    @Override // com.android.vending.licensing.ILicensingService
    public final void b(long j, String str, BinderC3004wG binderC3004wG) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
            obtain.writeLong(j);
            obtain.writeString(str);
            obtain.writeStrongBinder(binderC3004wG);
            this.b.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
