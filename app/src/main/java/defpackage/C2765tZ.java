package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: tZ  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2765tZ {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public C2765tZ f;
    public C2765tZ g;

    public C2765tZ() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final C2765tZ a() {
        C2765tZ c2765tZ = this.f;
        if (c2765tZ == this) {
            c2765tZ = null;
        }
        C2765tZ c2765tZ2 = this.g;
        Intrinsics.b(c2765tZ2);
        c2765tZ2.f = this.f;
        C2765tZ c2765tZ3 = this.f;
        Intrinsics.b(c2765tZ3);
        c2765tZ3.g = this.g;
        this.f = null;
        this.g = null;
        return c2765tZ;
    }

    public final void b(C2765tZ segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.g = this;
        segment.f = this.f;
        C2765tZ c2765tZ = this.f;
        Intrinsics.b(c2765tZ);
        c2765tZ.g = segment;
        this.f = segment;
    }

    public final C2765tZ c() {
        this.d = true;
        return new C2765tZ(this.a, this.b, this.c, true, false);
    }

    public final void d(C2765tZ sink, int i) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (sink.e) {
            int i2 = sink.c;
            int i3 = i2 + i;
            byte[] bArr = sink.a;
            if (i3 > 8192) {
                if (!sink.d) {
                    int i4 = sink.b;
                    if (i3 - i4 <= 8192) {
                        C2043l5.c(bArr, 0, bArr, i4, i2);
                        sink.c -= sink.b;
                        sink.b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i5 = sink.c;
            int i6 = this.b;
            C2043l5.c(this.a, i5, bArr, i6, i6 + i);
            sink.c += i;
            this.b += i;
            return;
        }
        throw new IllegalStateException("only owner can write");
    }

    public C2765tZ(byte[] data, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.a = data;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
