package defpackage;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;
/* renamed from: Sw  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0623Sw extends AbstractC2007kh {
    public float b;

    @Override // defpackage.AbstractC2007kh
    public final int a(L5 l5, L5 l52, Map map) {
        return l52.f(this.b);
    }

    @Override // defpackage.AbstractC2007kh
    public final int b() {
        return 4;
    }

    @Override // defpackage.AbstractC2007kh
    public final void c(PrintWriter printWriter) {
        printWriter.print("Float ");
        printWriter.println(this.b);
    }

    @Override // defpackage.AbstractC2007kh
    public final void d(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(4);
        dataOutputStream.writeFloat(this.b);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0623Sw) && ((C0623Sw) obj).b == this.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b);
    }
}
