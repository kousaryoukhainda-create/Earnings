package defpackage;
/* renamed from: Gj0  reason: default package */
/* loaded from: classes2.dex */
public final class Gj0 {
    public final int a;
    public final String b;
    public final C2699sj0 c;

    public Gj0(int i, String str, C2699sj0 c2699sj0) {
        this.a = i;
        this.b = str;
        this.c = c2699sj0;
    }

    public final boolean a() {
        int i = this.a;
        if (i >= 200 && i < 300) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder b = Ki0.b("Result{code=");
        b.append(this.a);
        b.append(", response='");
        b.append(this.b);
        b.append('\'');
        b.append(", errorResponse=");
        b.append(this.c);
        b.append(", headers=");
        b.append((Object) null);
        b.append('}');
        return b.toString();
    }
}
