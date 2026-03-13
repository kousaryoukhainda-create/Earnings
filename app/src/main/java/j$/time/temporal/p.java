package j$.time.temporal;
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements o {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ p(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.o
    public final m z(m mVar) {
        switch (this.a) {
            case 0:
                int n = mVar.n(a.DAY_OF_WEEK);
                int i = this.b;
                if (n == i) {
                    return mVar;
                }
                int i2 = n - i;
                return mVar.e(i2 >= 0 ? 7 - i2 : -i2, b.DAYS);
            default:
                int n2 = mVar.n(a.DAY_OF_WEEK);
                int i3 = this.b;
                if (n2 == i3) {
                    return mVar;
                }
                int i4 = i3 - n2;
                return mVar.l(i4 >= 0 ? 7 - i4 : -i4, b.DAYS);
        }
    }
}
