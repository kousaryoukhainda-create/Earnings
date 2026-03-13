package com.applovin.impl;

import com.applovin.impl.p1;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
final class d3 extends z1 {
    private int[] i;
    private int[] j;

    @Override // com.applovin.impl.p1
    public void a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) b1.a(this.j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer a = a(((limit - position) / this.b.d) * this.c.d);
        while (position < limit) {
            for (int i : iArr) {
                a.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.b.d;
        }
        byteBuffer.position(limit);
        a.flip();
    }

    @Override // com.applovin.impl.z1
    public p1.a b(p1.a aVar) {
        boolean z;
        boolean z2;
        int[] iArr = this.i;
        if (iArr == null) {
            return p1.a.e;
        }
        if (aVar.c == 2) {
            if (aVar.b != iArr.length) {
                z = true;
            } else {
                z = false;
            }
            for (int i = 0; i < iArr.length; i++) {
                int i2 = iArr[i];
                if (i2 < aVar.b) {
                    if (i2 != i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z |= z2;
                } else {
                    throw new p1.b(aVar);
                }
            }
            if (z) {
                return new p1.a(aVar.a, iArr.length, 2);
            }
            return p1.a.e;
        }
        throw new p1.b(aVar);
    }

    @Override // com.applovin.impl.z1
    public void g() {
        this.j = this.i;
    }

    @Override // com.applovin.impl.z1
    public void i() {
        this.j = null;
        this.i = null;
    }

    public void a(int[] iArr) {
        this.i = iArr;
    }
}
