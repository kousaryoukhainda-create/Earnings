package defpackage;
/* renamed from: I7  reason: default package */
/* loaded from: classes.dex */
public final class I7 extends AbstractC2776tf {
    public final C8 a;

    public I7(C8 c8) {
        EnumC2690sf enumC2690sf = EnumC2690sf.b;
        this.a = c8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2776tf)) {
            return false;
        }
        AbstractC2776tf abstractC2776tf = (AbstractC2776tf) obj;
        if (this.a.equals(((I7) abstractC2776tf).a)) {
            Object obj2 = EnumC2690sf.b;
            ((I7) abstractC2776tf).getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ EnumC2690sf.b.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.a + ", productIdOrigin=" + EnumC2690sf.b + "}";
    }
}
