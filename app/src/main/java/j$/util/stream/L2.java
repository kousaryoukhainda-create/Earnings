package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes4.dex */
final class L2 extends AbstractC1852z2 {
    private double[] c;
    private int d;

    @Override // j$.util.stream.AbstractC1763h2, j$.util.stream.InterfaceC1798o2
    public final void o(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new double[(int) j];
    }

    @Override // j$.util.stream.AbstractC1763h2, j$.util.stream.InterfaceC1798o2
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
    public final void accept(double d) {
        double[] dArr = this.c;
        int i = this.d;
        this.d = i + 1;
        dArr[i] = d;
    }
}
