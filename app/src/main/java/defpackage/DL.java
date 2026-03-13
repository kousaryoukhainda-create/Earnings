package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.util.Map;
/* renamed from: DL  reason: default package */
/* loaded from: classes2.dex */
public abstract class DL extends AbstractC2007kh {
    public final int b;
    public final int c;

    public DL(int i, int i2, int i3) {
        super(i3);
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.AbstractC2007kh
    public final int a(L5 l5, L5 l52, Map map) {
        return e(l52, ((C0731Xa) l5.c).i(this.b).a(l5, l52, map), ((C0731Xa) l5.c).i(this.c).a(l5, l52, map));
    }

    @Override // defpackage.AbstractC2007kh
    public final void c(PrintWriter printWriter) {
        printWriter.print(f().concat(" #"));
        printWriter.print(this.b);
        printWriter.print(", name&type #");
        printWriter.println(this.c);
    }

    @Override // defpackage.AbstractC2007kh
    public final void d(DataOutputStream dataOutputStream) {
        dataOutputStream.writeByte(b());
        dataOutputStream.writeShort(this.b);
        dataOutputStream.writeShort(this.c);
    }

    public abstract int e(L5 l5, int i, int i2);

    public final boolean equals(Object obj) {
        if (!(obj instanceof DL)) {
            return false;
        }
        DL dl = (DL) obj;
        if (dl.b != this.b || dl.c != this.c || dl.getClass() != getClass()) {
            return false;
        }
        return true;
    }

    public abstract String f();

    public final int hashCode() {
        return (this.b << 16) ^ this.c;
    }

    public DL(DataInputStream dataInputStream, int i) {
        super(i);
        this.b = dataInputStream.readUnsignedShort();
        this.c = dataInputStream.readUnsignedShort();
    }
}
