package defpackage;

import java.nio.ByteBuffer;
/* renamed from: P60  reason: default package */
/* loaded from: classes.dex */
public final class P60 extends J9 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void k(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // defpackage.InterfaceC2217n6
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer j;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 != 21) {
            if (i3 != 22) {
                if (i3 != 1342177280) {
                    if (i3 == 1610612736) {
                        j = j(i2);
                        while (position < limit) {
                            k((byteBuffer.get(position + 3) & 255) | ((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), j);
                            position += 4;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    j = j((i2 / 3) * 4);
                    while (position < limit) {
                        k(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), j);
                        position += 3;
                    }
                }
            } else {
                j = j(i2);
                while (position < limit) {
                    k((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), j);
                    position += 4;
                }
            }
        } else {
            j = j((i2 / 3) * 4);
            while (position < limit) {
                k(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), j);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        j.flip();
    }

    @Override // defpackage.J9
    public final C2045l6 f(C2045l6 c2045l6) {
        int i2 = c2045l6.c;
        if (i2 != 21 && i2 != 1342177280 && i2 != 22 && i2 != 1610612736 && i2 != 4) {
            throw new C2131m6(c2045l6);
        }
        if (i2 != 4) {
            return new C2045l6(c2045l6.a, c2045l6.b, 4);
        }
        return C2045l6.e;
    }
}
