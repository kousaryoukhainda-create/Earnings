package defpackage;
/* renamed from: qr  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2539qr implements BD {
    public final boolean b;

    public C2539qr(boolean z) {
        this.b = z;
    }

    @Override // defpackage.BD
    public final C2668sO b() {
        return null;
    }

    @Override // defpackage.BD
    public final boolean isActive() {
        return this.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (this.b) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
