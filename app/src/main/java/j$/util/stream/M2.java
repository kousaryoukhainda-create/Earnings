package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes4.dex */
final class M2 extends A2 {
    private int[] c;
    private int d;

    @Override // j$.util.stream.AbstractC1768i2, j$.util.stream.InterfaceC1798o2
    public final void o(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new int[(int) j];
    }

    @Override // j$.util.stream.AbstractC1768i2, j$.util.stream.InterfaceC1798o2
    public final void n() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        InterfaceC1798o2 interfaceC1798o2 = this.a;
        interfaceC1798o2.o(this.d);
        if (!this.b) {
            while (i < this.d) {
                interfaceC1798o2.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d && !interfaceC1798o2.r()) {
                interfaceC1798o2.accept(this.c[i]);
                i++;
            }
        }
        interfaceC1798o2.n();
        this.c = null;
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public final void accept(int i) {
        int[] iArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = i;
    }
}
