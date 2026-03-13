package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.play.core.review.c;
/* renamed from: Jm0  reason: default package */
/* loaded from: classes3.dex */
public final class Jm0 implements Rm0, IInterface {
    public final IBinder b;

    public Jm0(IBinder iBinder) {
        this.b = iBinder;
    }

    @Override // defpackage.Rm0
    public final void a(String str, Bundle bundle, c cVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        obtain.writeString(str);
        int i = AbstractC2705sm0.a;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(cVar);
        try {
            this.b.transact(2, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.b;
    }
}
