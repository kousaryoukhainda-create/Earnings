package defpackage;

import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;
/* renamed from: Id  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0345Id extends AbstractC2007kh {
    public int b;

    @Override // defpackage.AbstractC2007kh
    public final int a(L5 l5, L5 l52, Map map) {
        String str;
        String p = l5.p(this.b);
        if (map != null && (str = (String) map.get(p)) != null) {
            p = str;
        }
        return l52.c(p);
    }

    @Override // defpackage.AbstractC2007kh
    public final int b() {
        return 7;
    }

    @Override // defpackage.AbstractC2007kh
    public final void c(PrintWriter printWriter) {
        printWriter.print("Class #");
        printWriter.println(this.b);
    }

    @Override // defpackage.AbstractC2007kh
    public final void d(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(7);
        dataOutputStream.writeShort(this.b);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0345Id) && ((C0345Id) obj).b == this.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b;
    }
}
