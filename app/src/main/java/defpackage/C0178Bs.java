package defpackage;

import java.io.InputStream;
/* renamed from: Bs  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0178Bs extends C3141xs {
    public C0178Bs(byte[] bArr) {
        super(bArr);
        this.b.mark(Integer.MAX_VALUE);
    }

    public final void b(long j) {
        int i = this.d;
        if (i > j) {
            this.d = 0;
            this.b.reset();
        } else {
            j -= i;
        }
        a((int) j);
    }

    public C0178Bs(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.b.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
