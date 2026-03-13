package defpackage;

import java.nio.ByteBuffer;
/* renamed from: o90  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2310o90 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final C0811a00 b;
    public volatile int c = 0;

    public C2310o90(C0811a00 c0811a00, int i) {
        this.b = c0811a00;
        this.a = i;
    }

    public final int a(int i) {
        HM c = c();
        int a = c.a(16);
        if (a != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) c.d;
            int i2 = a + c.a;
            return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
        }
        return 0;
    }

    public final int b() {
        HM c = c();
        int a = c.a(16);
        if (a != 0) {
            int i = a + c.a;
            return ((ByteBuffer) c.d).getInt(((ByteBuffer) c.d).getInt(i) + i);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [E50, java.lang.Object] */
    public final HM c() {
        ThreadLocal threadLocal = d;
        HM hm = (HM) threadLocal.get();
        HM hm2 = hm;
        if (hm == null) {
            ?? e50 = new E50();
            threadLocal.set(e50);
            hm2 = e50;
        }
        IM im = (IM) this.b.b;
        int a = im.a(6);
        if (a != 0) {
            int i = a + im.a;
            int i2 = (this.a * 4) + ((ByteBuffer) im.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) im.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) im.d;
            hm2.d = byteBuffer;
            if (byteBuffer != null) {
                hm2.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                hm2.b = i4;
                hm2.c = ((ByteBuffer) hm2.d).getShort(i4);
            } else {
                hm2.a = 0;
                hm2.b = 0;
                hm2.c = 0;
            }
        }
        return hm2;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        HM c = c();
        int a = c.a(4);
        if (a != 0) {
            i = ((ByteBuffer) c.d).getInt(a + c.a);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        int b = b();
        for (int i2 = 0; i2 < b; i2++) {
            sb.append(Integer.toHexString(a(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
