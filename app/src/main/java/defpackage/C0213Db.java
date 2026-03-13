package defpackage;
/* renamed from: Db  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213Db extends C0291Gb {
    public final int f;
    public final int g;

    public C0213Db(byte[] bArr, int i, int i2) {
        super(bArr);
        C0291Gb.d(i, i + i2, bArr.length);
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.C0291Gb
    public final byte c(int i) {
        int i2 = this.g;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0324Hi.e(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC0324Hi.d(i, i2, "Index > length: ", ", "));
        }
        return this.c[this.f + i];
    }

    @Override // defpackage.C0291Gb
    public final int e() {
        return this.f;
    }

    @Override // defpackage.C0291Gb
    public final byte f(int i) {
        return this.c[this.f + i];
    }

    @Override // defpackage.C0291Gb
    public final int size() {
        return this.g;
    }
}
