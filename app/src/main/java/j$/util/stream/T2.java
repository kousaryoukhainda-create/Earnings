package j$.util.stream;

import j$.util.AbstractC1685d;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class T2 extends X2 implements j$.util.function.B {
    @Override // j$.util.function.B
    public final /* synthetic */ j$.util.function.B m(j$.util.function.B b) {
        return j$.com.android.tools.r8.a.b(this, b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.X2
    public final void v(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        j$.util.function.B b = (j$.util.function.B) obj2;
        while (i < i2) {
            b.accept(iArr[i]);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.X2
    public final int w(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof j$.util.function.B) {
            g((j$.util.function.B) consumer);
        } else if (M3.a) {
            M3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            throw null;
        } else {
            AbstractC1685d.f((S2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.X2
    protected final Object[] z() {
        return new int[8];
    }

    @Override // j$.util.stream.X2
    public final Object c(int i) {
        return new int[i];
    }

    @Override // j$.util.function.B
    public void accept(int i) {
        A();
        int i2 = this.b;
        this.b = i2 + 1;
        ((int[]) this.e)[i2] = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.X2, java.lang.Iterable
    /* renamed from: B */
    public j$.util.H spliterator() {
        return new S2(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        int[] iArr = (int[]) e();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }
}
