package defpackage;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;
/* renamed from: u40  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2815u40 extends AbstractC2007kh {
    public int b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [u40, kh] */
    @Override // defpackage.AbstractC2007kh
    public final int a(L5 l5, L5 l52, Map map) {
        int j = l52.j(l5.p(this.b));
        ?? abstractC2007kh = new AbstractC2007kh(l52.a);
        abstractC2007kh.b = j;
        return l52.g(abstractC2007kh);
    }

    @Override // defpackage.AbstractC2007kh
    public final int b() {
        return 8;
    }

    @Override // defpackage.AbstractC2007kh
    public final void c(PrintWriter printWriter) {
        printWriter.print("String #");
        printWriter.println(this.b);
    }

    @Override // defpackage.AbstractC2007kh
    public final void d(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(8);
        dataOutputStream.writeShort(this.b);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C2815u40) && ((C2815u40) obj).b == this.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
