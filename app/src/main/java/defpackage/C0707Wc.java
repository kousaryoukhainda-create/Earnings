package defpackage;

import java.nio.ByteBuffer;
/* renamed from: Wc  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0707Wc extends J9 {
    public int[] i;
    public int[] j;

    @Override // defpackage.InterfaceC2217n6
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer j = j(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                j.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        j.flip();
    }

    @Override // defpackage.J9
    public final C2045l6 f(C2045l6 c2045l6) {
        boolean z;
        boolean z2;
        int[] iArr = this.i;
        if (iArr == null) {
            return C2045l6.e;
        }
        if (c2045l6.c == 2) {
            int length = iArr.length;
            int i = c2045l6.b;
            if (i != length) {
                z = true;
            } else {
                z = false;
            }
            for (int i2 = 0; i2 < iArr.length; i2++) {
                int i3 = iArr[i2];
                if (i3 < i) {
                    if (i3 != i2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z |= z2;
                } else {
                    throw new C2131m6(c2045l6);
                }
            }
            if (z) {
                return new C2045l6(c2045l6.a, iArr.length, 2);
            }
            return C2045l6.e;
        }
        throw new C2131m6(c2045l6);
    }

    @Override // defpackage.J9
    public final void g() {
        this.j = this.i;
    }

    @Override // defpackage.J9
    public final void i() {
        this.j = null;
        this.i = null;
    }
}
