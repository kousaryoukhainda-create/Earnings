package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
/* renamed from: KW  reason: default package */
/* loaded from: classes.dex */
public final class KW extends Binder implements KC {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ ResultReceiver b;

    public KW(ResultReceiver resultReceiver) {
        this.b = resultReceiver;
        attachInterface(this, KC.V7);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object obj;
        String str = KC.V7;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        } else if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            int readInt = parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            ResultReceiver resultReceiver = this.b;
            resultReceiver.getClass();
            resultReceiver.a(readInt, (Bundle) obj);
            return true;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
