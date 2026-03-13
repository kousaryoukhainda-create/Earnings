package defpackage;

import java.util.Collections;
import java.util.List;
/* renamed from: G50  reason: default package */
/* loaded from: classes.dex */
public final class G50 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public G50(String str, String str2, List list, String str3, List list2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || G50.class != obj.getClass()) {
            return false;
        }
        G50 g50 = (G50) obj;
        if (!this.a.equals(g50.a) || !this.b.equals(g50.b) || !this.c.equals(g50.c) || !this.d.equals(g50.d)) {
            return false;
        }
        return this.e.equals(g50.e);
    }

    public final int hashCode() {
        int b = AbstractC2437ph.b(AbstractC2437ph.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        return this.e.hashCode() + ((this.d.hashCode() + b) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.a + "', onDelete='" + this.b + "', onUpdate='" + this.c + "', columnNames=" + this.d + ", referenceColumnNames=" + this.e + '}';
    }
}
