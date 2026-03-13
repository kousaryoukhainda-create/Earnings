package defpackage;

import android.app.Notification;
import android.os.Parcel;
/* renamed from: eP  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1268eP {
    public final String a;
    public final int b;
    public final String c;
    public final Notification d;

    public C1268eP(String str, int i, String str2, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    public final void a(IC ic) {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        GC gc = (GC) ic;
        gc.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(IC.U7);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            Notification notification = this.d;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            gc.b.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        sb.append(this.b);
        sb.append(", tag:");
        return AbstractC0324Hi.h(sb, this.c, "]");
    }
}
