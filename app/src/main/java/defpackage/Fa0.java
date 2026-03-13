package defpackage;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;
/* renamed from: Fa0  reason: default package */
/* loaded from: classes2.dex */
public final class Fa0 extends AbstractC2007kh {
    public String b;

    @Override // defpackage.AbstractC2007kh
    public final int a(L5 l5, L5 l52, Map map) {
        return l52.j(this.b);
    }

    @Override // defpackage.AbstractC2007kh
    public final int b() {
        return 1;
    }

    @Override // defpackage.AbstractC2007kh
    public final void c(PrintWriter printWriter) {
        printWriter.print("UTF8 \"");
        printWriter.print(this.b);
        printWriter.println("\"");
    }

    @Override // defpackage.AbstractC2007kh
    public final void d(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(1);
        dataOutputStream.writeUTF(this.b);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Fa0) && ((Fa0) obj).b.equals(this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
