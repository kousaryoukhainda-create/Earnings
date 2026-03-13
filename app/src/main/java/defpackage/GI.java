package defpackage;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;
/* renamed from: GI  reason: default package */
/* loaded from: classes2.dex */
public final class GI extends AbstractC2007kh {
    public long b;

    @Override // defpackage.AbstractC2007kh
    public final int a(L5 l5, L5 l52, Map map) {
        return l52.i(this.b);
    }

    @Override // defpackage.AbstractC2007kh
    public final int b() {
        return 5;
    }

    @Override // defpackage.AbstractC2007kh
    public final void c(PrintWriter printWriter) {
        printWriter.print("Long ");
        printWriter.println(this.b);
    }

    @Override // defpackage.AbstractC2007kh
    public final void d(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(5);
        dataOutputStream.writeLong(this.b);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof GI) && ((GI) obj).b == this.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }
}
