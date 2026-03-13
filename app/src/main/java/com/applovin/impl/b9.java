package com.applovin.impl;

import com.applovin.impl.p1;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
final class b9 extends z1 {
    private static final int i = Float.floatToIntBits(Float.NaN);

    @Override // com.applovin.impl.p1
    public void a(ByteBuffer byteBuffer) {
        ByteBuffer a;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 == 536870912) {
            a = a((i2 / 3) * 4);
            while (position < limit) {
                a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), a);
                position += 3;
            }
        } else if (i3 == 805306368) {
            a = a(i2);
            while (position < limit) {
                a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), a);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        a.flip();
    }

    @Override // com.applovin.impl.z1
    public p1.a b(p1.a aVar) {
        int i2 = aVar.c;
        if (xp.f(i2)) {
            if (i2 != 4) {
                return new p1.a(aVar.a, aVar.b, 4);
            }
            return p1.a.e;
        }
        throw new p1.b(aVar);
    }

    private static void a(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
