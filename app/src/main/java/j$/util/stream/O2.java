package j$.util.stream;

import java.util.Arrays;
/* loaded from: classes4.dex */
final class O2 extends C2 {
    private Object[] d;
    private int e;

    @Override // j$.util.stream.AbstractC1778k2, j$.util.stream.InterfaceC1798o2
    public final void o(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }

    @Override // j$.util.stream.AbstractC1778k2, j$.util.stream.InterfaceC1798o2
    public final void n() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        InterfaceC1798o2 interfaceC1798o2 = this.a;
        interfaceC1798o2.o(this.e);
        if (!this.c) {
            while (i < this.e) {
                interfaceC1798o2.accept((InterfaceC1798o2) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e && !interfaceC1798o2.r()) {
                interfaceC1798o2.accept((InterfaceC1798o2) this.d[i]);
                i++;
            }
        }
        interfaceC1798o2.n();
        this.d = null;
    }

    @Override // j$.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }
}
