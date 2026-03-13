package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: qg0  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2522qg0 {
    public static final /* synthetic */ int a = 0;

    static {
        AbstractC2522qg0.class.getClassLoader();
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException(AbstractC0324Hi.e(dataAvail, "Parcel data not fully consumed, unread size: "));
    }
}
