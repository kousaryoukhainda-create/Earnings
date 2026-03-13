package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1626ib0 abstractC1626ib0) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC1996kb0 interfaceC1996kb0 = remoteActionCompat.a;
        boolean z = true;
        if (abstractC1626ib0.e(1)) {
            interfaceC1996kb0 = abstractC1626ib0.h();
        }
        remoteActionCompat.a = (IconCompat) interfaceC1996kb0;
        CharSequence charSequence = remoteActionCompat.b;
        if (abstractC1626ib0.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1910jb0) abstractC1626ib0).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (abstractC1626ib0.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1910jb0) abstractC1626ib0).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC1626ib0.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (abstractC1626ib0.e(5)) {
            if (((C1910jb0) abstractC1626ib0).e.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (abstractC1626ib0.e(6)) {
            if (((C1910jb0) abstractC1626ib0).e.readInt() == 0) {
                z = false;
            }
            z3 = z;
        }
        remoteActionCompat.f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1626ib0 abstractC1626ib0) {
        abstractC1626ib0.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        abstractC1626ib0.i(1);
        abstractC1626ib0.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        abstractC1626ib0.i(2);
        Parcel parcel = ((C1910jb0) abstractC1626ib0).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        abstractC1626ib0.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC1626ib0.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        abstractC1626ib0.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        abstractC1626ib0.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
