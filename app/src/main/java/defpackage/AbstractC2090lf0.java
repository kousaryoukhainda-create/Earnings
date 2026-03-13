package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* renamed from: lf0  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2090lf0 implements IInterface {
    public final IBinder b;
    public final String c;

    public AbstractC2090lf0(IBinder iBinder, String str) {
        this.b = iBinder;
        this.c = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.b;
    }

    public final void e(int i, Parcel parcel) {
        try {
            this.b.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
