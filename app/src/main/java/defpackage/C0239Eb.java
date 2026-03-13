package defpackage;
/* renamed from: Eb  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239Eb extends C0317Hb {
    public final int g;
    public final int h;

    public C0239Eb(byte[] bArr, int i, int i2) {
        super(bArr);
        C0317Hb.d(i, i + i2, bArr.length);
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.C0317Hb
    public final byte c(int i) {
        int i2 = this.h;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC0324Hi.e(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(AbstractC0324Hi.d(i, i2, "Index > length: ", ", "));
        }
        return this.c[this.g + i];
    }

    @Override // defpackage.C0317Hb
    public final void f(int i, byte[] bArr) {
        System.arraycopy(this.c, this.g, bArr, 0, i);
    }

    @Override // defpackage.C0317Hb
    public final int g() {
        return this.g;
    }

    @Override // defpackage.C0317Hb
    public final byte h(int i) {
        return this.c[this.g + i];
    }

    @Override // defpackage.C0317Hb
    public final int size() {
        return this.h;
    }
}
