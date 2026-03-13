package j$.util.stream;

import j$.util.AbstractC1685d;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import j$.util.function.InterfaceC1699l;
import java.util.Arrays;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class R2 extends X2 implements InterfaceC1699l {
    @Override // j$.util.function.InterfaceC1699l
    public final /* synthetic */ InterfaceC1699l l(InterfaceC1699l interfaceC1699l) {
        return j$.com.android.tools.r8.a.a(this, interfaceC1699l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.X2
    public final void v(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        InterfaceC1699l interfaceC1699l = (InterfaceC1699l) obj2;
        while (i < i2) {
            interfaceC1699l.accept(dArr[i]);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.X2
    public final int w(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof InterfaceC1699l) {
            g((InterfaceC1699l) consumer);
        } else if (M3.a) {
            M3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        } else {
            AbstractC1685d.b((Q2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.X2
    protected final Object[] z() {
        return new double[8];
    }

    @Override // j$.util.stream.X2
    public final Object c(int i) {
        return new double[i];
    }

    @Override // j$.util.function.InterfaceC1699l
    public void accept(double d) {
        A();
        int i = this.b;
        this.b = i + 1;
        ((double[]) this.e)[i] = d;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.X2, java.lang.Iterable
    /* renamed from: B */
    public j$.util.E spliterator() {
        return new Q2(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        double[] dArr = (double[]) e();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }
}
