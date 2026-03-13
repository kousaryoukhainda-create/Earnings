package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes4.dex */
final class D2 extends AbstractC1852z2 {
    private R2 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.R2] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // j$.util.stream.AbstractC1763h2, j$.util.stream.InterfaceC1798o2
    public final void o(long j) {
        ?? r0;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r0 = new X2();
        } else {
            r0 = new X2((int) j);
        }
        this.c = r0;
    }

    @Override // j$.util.stream.AbstractC1763h2, j$.util.stream.InterfaceC1798o2
    public final void n() {
        double[] dArr = (double[]) this.c.e();
        Arrays.sort(dArr);
        InterfaceC1798o2 interfaceC1798o2 = this.a;
        interfaceC1798o2.o(dArr.length);
        int i = 0;
        if (!this.b) {
            int length = dArr.length;
            while (i < length) {
                interfaceC1798o2.accept(dArr[i]);
                i++;
            }
        } else {
            int length2 = dArr.length;
            while (i < length2) {
                double d = dArr[i];
                if (interfaceC1798o2.r()) {
                    break;
                }
                interfaceC1798o2.accept(d);
                i++;
            }
        }
        interfaceC1798o2.n();
    }

    @Override // j$.util.stream.InterfaceC1798o2
    public final void accept(double d) {
        this.c.accept(d);
    }
}
