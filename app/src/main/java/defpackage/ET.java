package defpackage;
/* renamed from: ET  reason: default package */
/* loaded from: classes.dex */
public final class ET {
    public final int a;
    public final boolean b;

    public ET(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ET.class != obj.getClass()) {
            return false;
        }
        ET et = (ET) obj;
        if (this.a == et.a && this.b == et.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
