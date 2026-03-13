package defpackage;

import android.net.Uri;
/* renamed from: fi  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1381fi {
    public final Uri a;
    public final boolean b;

    public C1381fi(boolean z, Uri uri) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1381fi.class != obj.getClass()) {
            return false;
        }
        C1381fi c1381fi = (C1381fi) obj;
        if (this.b == c1381fi.b && this.a.equals(c1381fi.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
    }
}
