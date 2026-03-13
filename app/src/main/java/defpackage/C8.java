package defpackage;
/* renamed from: C8  reason: default package */
/* loaded from: classes.dex */
public final class C8 extends AbstractC0257Et {
    public final B8 a;

    public C8(B8 b8) {
        this.a = b8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0257Et) {
            return this.a.equals(((C8) ((AbstractC0257Et) obj)).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.a + "}";
    }
}
