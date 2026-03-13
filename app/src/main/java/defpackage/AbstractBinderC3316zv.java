package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImpl;
/* renamed from: zv  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3316zv extends Binder implements InterfaceC3000wC {
    public AbstractBinderC3316zv() {
        attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
    }

    public void c(Status status, DynamicLinkData dynamicLinkData) {
        throw new UnsupportedOperationException();
    }

    public void d(Status status, ShortDynamicLinkImpl shortDynamicLinkImpl) {
        throw new UnsupportedOperationException();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Status status;
        Status status2;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
        }
        if (i != 1598968902) {
            Object obj = null;
            if (i != 1) {
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                if (parcel.readInt() != 0) {
                    status2 = creator.createFromParcel(parcel);
                } else {
                    status2 = null;
                }
                Status status3 = status2;
                Parcelable.Creator<ShortDynamicLinkImpl> creator2 = ShortDynamicLinkImpl.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator2.createFromParcel(parcel);
                }
                d(status3, (ShortDynamicLinkImpl) obj);
            } else {
                Parcelable.Creator<Status> creator3 = Status.CREATOR;
                if (parcel.readInt() != 0) {
                    status = creator3.createFromParcel(parcel);
                } else {
                    status = null;
                }
                Status status4 = status;
                Parcelable.Creator<DynamicLinkData> creator4 = DynamicLinkData.CREATOR;
                if (parcel.readInt() != 0) {
                    obj = creator4.createFromParcel(parcel);
                }
                c(status4, (DynamicLinkData) obj);
            }
            return true;
        }
        parcel2.writeString("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
