package j$.util.stream;

import java.util.concurrent.CountedCompleter;
/* renamed from: j$.util.stream.y1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C1846y1 extends CountedCompleter {
    protected final J0 a;
    protected final int b;
    public final /* synthetic */ int c;
    private final Object d;

    public C1846y1(J0 j0, Object obj, int i) {
        this.c = i;
        this.a = j0;
        this.b = 0;
        this.d = obj;
    }

    C1846y1(C1846y1 c1846y1, J0 j0, int i, byte b) {
        super(c1846y1);
        this.a = j0;
        this.b = i;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        C1846y1 c1846y1 = this;
        while (c1846y1.a.q() != 0) {
            c1846y1.setPendingCount(c1846y1.a.q() - 1);
            int i = 0;
            int i2 = 0;
            while (i < c1846y1.a.q() - 1) {
                C1846y1 a = c1846y1.a(i, c1846y1.b + i2);
                i2 = (int) (i2 + a.a.count());
                a.fork();
                i++;
            }
            c1846y1 = c1846y1.a(i, c1846y1.b + i2);
        }
        switch (c1846y1.c) {
            case 0:
                ((I0) c1846y1.a).d(c1846y1.d, c1846y1.b);
                break;
            default:
                c1846y1.a.j((Object[]) c1846y1.d, c1846y1.b);
                break;
        }
        c1846y1.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1846y1(C1846y1 c1846y1, J0 j0, int i) {
        this(c1846y1, j0, i, (byte) 0);
        this.c = 1;
        this.d = (Object[]) c1846y1.d;
    }

    final C1846y1 a(int i, int i2) {
        switch (this.c) {
            case 0:
                return new C1846y1(this, ((I0) this.a).a(i), i2);
            default:
                return new C1846y1(this, this.a.a(i), i2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1846y1(C1846y1 c1846y1, I0 i0, int i) {
        this(c1846y1, i0, i, (byte) 0);
        this.c = 0;
        this.d = c1846y1.d;
    }
}
