package defpackage;

import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.review.c;
/* renamed from: Yl0  reason: default package */
/* loaded from: classes3.dex */
public abstract class Yl0 extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcelable parcelable;
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        c cVar = (c) this;
        if (i == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            int i3 = AbstractC2705sm0.a;
            if (parcel.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(parcel);
            }
            Bundle bundle = (Bundle) parcelable;
            int dataAvail = parcel.dataAvail();
            if (dataAvail <= 0) {
                cVar.zzb(bundle);
                return true;
            }
            throw new BadParcelableException(AbstractC0324Hi.e(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
        return false;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
