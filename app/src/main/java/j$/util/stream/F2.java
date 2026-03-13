package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes4.dex */
final class F2 extends B2 {
    private V2 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [j$.util.stream.V2] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // j$.util.stream.AbstractC1773j2, j$.util.stream.InterfaceC1798o2
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

    @Override // j$.util.stream.AbstractC1773j2, j$.util.stream.InterfaceC1798o2
    public final void n() {
        long[] jArr = (long[]) this.c.e();
        Arrays.sort(jArr);
        InterfaceC1798o2 interfaceC1798o2 = this.a;
        interfaceC1798o2.o(jArr.length);
        int i = 0;
        if (!this.b) {
            int length = jArr.length;
            while (i < length) {
                interfaceC1798o2.accept(jArr[i]);
                i++;
            }
        } else {
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                if (interfaceC1798o2.r()) {
                    break;
                }
                interfaceC1798o2.accept(j);
                i++;
            }
        }
        interfaceC1798o2.n();
    }

    @Override // j$.util.stream.InterfaceC1798o2, j$.util.function.N
    public final void accept(long j) {
        this.c.accept(j);
    }
}
