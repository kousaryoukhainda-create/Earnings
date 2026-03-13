package defpackage;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;
/* renamed from: Rp  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0590Rp extends AbstractC2007kh {
    public double b;

    @Override // defpackage.AbstractC2007kh
    public final int a(L5 l5, L5 l52, Map map) {
        return l52.d(this.b);
    }

    @Override // defpackage.AbstractC2007kh
    public final int b() {
        return 6;
    }

    @Override // defpackage.AbstractC2007kh
    public final void c(PrintWriter printWriter) {
        printWriter.print("Double ");
        printWriter.println(this.b);
    }

    @Override // defpackage.AbstractC2007kh
    public final void d(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(6);
        dataOutputStream.writeDouble(this.b);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0590Rp) && ((C0590Rp) obj).b == this.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.b);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }
}
