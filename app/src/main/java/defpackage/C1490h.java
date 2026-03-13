package defpackage;

import java.util.Arrays;
/* renamed from: h  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1490h {
    public static final C1490h b = new C1490h(0);
    public static final C1490h c = new C1490h(1);
    public static final C1490h d = new C1490h(2);
    public static final C1490h e = new C1490h(3);
    public static final C1490h f = new C1490h(4);
    public final int a;

    public C1490h(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1490h.class == obj.getClass() && this.a == ((C1490h) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }
}
