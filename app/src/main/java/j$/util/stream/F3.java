package j$.util.stream;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes4.dex */
abstract class F3 {
    protected final Spliterator a;
    protected final boolean b;
    protected final int c;
    private final long d;
    private final AtomicLong e;

    protected abstract Spliterator v(Spliterator spliterator);

    /* JADX INFO: Access modifiers changed from: package-private */
    public F3(Spliterator spliterator, long j, long j2) {
        this.a = spliterator;
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        this.b = i < 0;
        this.d = i >= 0 ? j2 : 0L;
        this.c = UserVerificationMethods.USER_VERIFY_PATTERN;
        this.e = new AtomicLong(i >= 0 ? j + j2 : j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public F3(Spliterator spliterator, F3 f3) {
        this.a = spliterator;
        this.b = f3.b;
        this.e = f3.e;
        this.d = f3.d;
        this.c = f3.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long u(long j) {
        AtomicLong atomicLong;
        long j2;
        boolean z;
        long min;
        do {
            atomicLong = this.e;
            j2 = atomicLong.get();
            z = this.b;
            if (j2 != 0) {
                min = Math.min(j2, j);
                if (min <= 0) {
                    break;
                }
            } else if (z) {
                return j;
            } else {
                return 0L;
            }
        } while (!atomicLong.compareAndSet(j2, j2 - min));
        if (z) {
            return Math.max(j - min, 0L);
        }
        long j3 = this.d;
        return j2 > j3 ? Math.max(min - (j2 - j3), 0L) : min;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final E3 w() {
        if (this.e.get() > 0) {
            return E3.MAYBE_MORE;
        }
        return this.b ? E3.UNLIMITED : E3.NO_MORE;
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public final Spliterator m40trySplit() {
        Spliterator trySplit;
        if (this.e.get() == 0 || (trySplit = this.a.trySplit()) == null) {
            return null;
        }
        return v(trySplit);
    }

    public final long estimateSize() {
        return this.a.estimateSize();
    }

    public final int characteristics() {
        return this.a.characteristics() & (-16465);
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.N m39trySplit() {
        return (j$.util.N) m40trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.H m37trySplit() {
        return (j$.util.H) m40trySplit();
    }

    /* renamed from: trySplit  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ j$.util.K m38trySplit() {
        return (j$.util.K) m40trySplit();
    }

    public /* bridge */ /* synthetic */ j$.util.E trySplit() {
        return (j$.util.E) m40trySplit();
    }
}
