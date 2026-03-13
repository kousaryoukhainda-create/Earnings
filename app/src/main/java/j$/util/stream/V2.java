package j$.util.stream;

import j$.util.AbstractC1685d;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import java.util.Arrays;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class V2 extends X2 implements j$.util.function.N {
    @Override // j$.util.function.N
    public final /* synthetic */ j$.util.function.N f(j$.util.function.N n) {
        return j$.com.android.tools.r8.a.c(this, n);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.X2
    public final void v(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        j$.util.function.N n = (j$.util.function.N) obj2;
        while (i < i2) {
            n.accept(jArr[i]);
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.X2
    public final int w(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof j$.util.function.N) {
            g((j$.util.function.N) consumer);
        } else if (M3.a) {
            M3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        } else {
            AbstractC1685d.h((U2) spliterator(), consumer);
        }
    }

    @Override // j$.util.stream.X2
    protected final Object[] z() {
        return new long[8];
    }

    @Override // j$.util.stream.X2
    public final Object c(int i) {
        return new long[i];
    }

    @Override // j$.util.function.N
    public void accept(long j) {
        A();
        int i = this.b;
        this.b = i + 1;
        ((long[]) this.e)[i] = j;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.h(spliterator());
    }

    @Override // j$.util.stream.X2, java.lang.Iterable
    /* renamed from: B */
    public j$.util.K spliterator() {
        return new U2(this, 0, this.c, 0, this.b);
    }

    public final String toString() {
        long[] jArr = (long[]) e();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }
}
