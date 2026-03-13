package defpackage;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;
/* renamed from: mE  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2143mE extends AbstractC2007kh {
    public int b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [mE, kh] */
    @Override // defpackage.AbstractC2007kh
    public final int a(L5 l5, L5 l52, Map map) {
        int i = this.b;
        ?? abstractC2007kh = new AbstractC2007kh(l52.a);
        abstractC2007kh.b = i;
        return l52.g(abstractC2007kh);
    }

    @Override // defpackage.AbstractC2007kh
    public final int b() {
        return 3;
    }

    @Override // defpackage.AbstractC2007kh
    public final void c(PrintWriter printWriter) {
        printWriter.print("Integer ");
        printWriter.println(this.b);
    }

    @Override // defpackage.AbstractC2007kh
    public final void d(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(3);
        dataOutputStream.writeInt(this.b);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C2143mE) && ((C2143mE) obj).b == this.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
