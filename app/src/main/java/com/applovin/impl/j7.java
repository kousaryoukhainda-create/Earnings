package com.applovin.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.a5;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
final class j7 {
    private static final byte[] h = {0, 7, 8, Ascii.SI};
    private static final byte[] i = {0, 119, -120, -1};
    private static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private final Paint a;
    private final Paint b;
    private final Canvas c;
    private final b d;
    private final a e;
    private final h f;
    private Bitmap g;

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final int[] b;
        public final int[] c;
        public final int[] d;

        public a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.a = i;
            this.b = iArr;
            this.c = iArr2;
            this.d = iArr3;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final int a;
        public final boolean b;
        public final byte[] c;
        public final byte[] d;

        public c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.a = i;
            this.b = z;
            this.c = bArr;
            this.d = bArr2;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final int a;
        public final int b;
        public final int c;
        public final SparseArray d;

        public d(int i, int i2, int i3, SparseArray sparseArray) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = sparseArray;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {
        public final int a;
        public final int b;

        public e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final SparseArray k;

        public f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray sparseArray) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = i7;
            this.i = i8;
            this.j = i9;
            this.k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray sparseArray = fVar.k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.k.put(sparseArray.keyAt(i), (g) sparseArray.valueAt(i));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class g {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;

        public g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
        }
    }

    /* loaded from: classes.dex */
    public static final class h {
        public final int a;
        public final int b;
        public final SparseArray c = new SparseArray();
        public final SparseArray d = new SparseArray();
        public final SparseArray e = new SparseArray();
        public final SparseArray f = new SparseArray();
        public final SparseArray g = new SparseArray();
        public b h;
        public d i;

        public h(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public void a() {
            this.c.clear();
            this.d.clear();
            this.e.clear();
            this.f.clear();
            this.g.clear();
            this.h = null;
            this.i = null;
        }
    }

    public j7(int i2, int i3) {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new b(719, 575, 0, 719, 0, 575);
        this.e = new a(0, a(), b(), c());
        this.f = new h(i2, i3);
    }

    private static int a(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    private static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = a(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] c() {
        int[] iArr = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = a(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = a(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = a(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = a(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = a(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public void d() {
        this.f.a();
    }

    private static byte[] a(int i2, int i3, zg zgVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) zgVar.a(i3);
        }
        return bArr;
    }

    private static int[] a() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[LOOP:0: B:3:0x0009->B:33:0x0083, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(com.applovin.impl.zg r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 2
            int r4 = r13.a(r3)
            r5 = 1
            if (r4 == 0) goto L14
            r11 = r2
        L12:
            r12 = 1
            goto L61
        L14:
            boolean r4 = r13.f()
            r6 = 3
            if (r4 == 0) goto L28
            int r4 = r13.a(r6)
            int r4 = r4 + r6
            int r3 = r13.a(r3)
        L24:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L61
        L28:
            boolean r4 = r13.f()
            if (r4 == 0) goto L31
            r11 = r2
            r4 = 0
            goto L12
        L31:
            int r4 = r13.a(r3)
            if (r4 == 0) goto L5e
            if (r4 == r5) goto L5a
            if (r4 == r3) goto L4e
            if (r4 == r6) goto L41
            r11 = r2
            r4 = 0
        L3f:
            r12 = 0
            goto L61
        L41:
            r4 = 8
            int r4 = r13.a(r4)
            int r4 = r4 + 29
            int r3 = r13.a(r3)
            goto L24
        L4e:
            r4 = 4
            int r4 = r13.a(r4)
            int r4 = r4 + 12
            int r3 = r13.a(r3)
            goto L24
        L5a:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L61
        L5e:
            r4 = 0
            r11 = 1
            goto L3f
        L61:
            if (r12 == 0) goto L7f
            if (r8 == 0) goto L7f
            if (r15 == 0) goto L69
            r4 = r15[r4]
        L69:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L7f:
            int r10 = r10 + r12
            if (r11 == 0) goto L83
            return r10
        L83:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.j7.a(com.applovin.impl.zg, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[LOOP:0: B:3:0x0009->B:36:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int b(com.applovin.impl.zg r13, int[] r14, byte[] r15, int r16, int r17, android.graphics.Paint r18, android.graphics.Canvas r19) {
        /*
            r0 = r13
            r1 = r17
            r8 = r18
            r9 = 0
            r10 = r16
            r2 = 0
        L9:
            r3 = 4
            int r4 = r13.a(r3)
            r5 = 1
            if (r4 == 0) goto L15
            r11 = r2
        L12:
            r12 = 1
            goto L6e
        L15:
            boolean r4 = r13.f()
            r6 = 3
            if (r4 != 0) goto L2c
            int r3 = r13.a(r6)
            if (r3 == 0) goto L28
            int r3 = r3 + 2
            r11 = r2
            r12 = r3
            r4 = 0
            goto L6e
        L28:
            r4 = 0
            r11 = 1
        L2a:
            r12 = 0
            goto L6e
        L2c:
            boolean r4 = r13.f()
            r7 = 2
            if (r4 != 0) goto L40
            int r4 = r13.a(r7)
            int r4 = r4 + r3
            int r3 = r13.a(r3)
        L3c:
            r11 = r2
            r12 = r4
            r4 = r3
            goto L6e
        L40:
            int r4 = r13.a(r7)
            if (r4 == 0) goto L6b
            if (r4 == r5) goto L67
            if (r4 == r7) goto L5c
            if (r4 == r6) goto L4f
            r11 = r2
            r4 = 0
            goto L2a
        L4f:
            r4 = 8
            int r4 = r13.a(r4)
            int r4 = r4 + 25
            int r3 = r13.a(r3)
            goto L3c
        L5c:
            int r4 = r13.a(r3)
            int r4 = r4 + 9
            int r3 = r13.a(r3)
            goto L3c
        L67:
            r11 = r2
            r4 = 0
            r12 = 2
            goto L6e
        L6b:
            r11 = r2
            r4 = 0
            goto L12
        L6e:
            if (r12 == 0) goto L8c
            if (r8 == 0) goto L8c
            if (r15 == 0) goto L76
            r4 = r15[r4]
        L76:
            r2 = r14[r4]
            r8.setColor(r2)
            float r3 = (float) r10
            float r4 = (float) r1
            int r2 = r10 + r12
            float r6 = (float) r2
            int r2 = r1 + 1
            float r7 = (float) r2
            r2 = r19
            r5 = r6
            r6 = r7
            r7 = r18
            r2.drawRect(r3, r4, r5, r6, r7)
        L8c:
            int r10 = r10 + r12
            if (r11 == 0) goto L90
            return r10
        L90:
            r2 = r11
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.j7.b(com.applovin.impl.zg, int[], byte[], int, int, android.graphics.Paint, android.graphics.Canvas):int");
    }

    private static int c(zg zgVar, int[] iArr, byte[] bArr, int i2, int i3, Paint paint, Canvas canvas) {
        boolean z;
        int a2;
        int i4 = i2;
        boolean z2 = false;
        while (true) {
            byte a3 = zgVar.a(8);
            if (a3 != 0) {
                z = z2;
                a2 = 1;
            } else if (!zgVar.f()) {
                int a4 = zgVar.a(7);
                if (a4 != 0) {
                    z = z2;
                    a2 = a4;
                    a3 = 0;
                } else {
                    a3 = 0;
                    z = true;
                    a2 = 0;
                }
            } else {
                z = z2;
                a2 = zgVar.a(7);
                a3 = zgVar.a(8);
            }
            if (a2 != 0 && paint != null) {
                if (bArr != null) {
                    a3 = bArr[a3];
                }
                paint.setColor(iArr[a3]);
                canvas.drawRect(i4, i3, i4 + a2, i3 + 1, paint);
            }
            i4 += a2;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    private static f c(zg zgVar, int i2) {
        int i3;
        int i4;
        int a2 = zgVar.a(8);
        zgVar.d(4);
        boolean f2 = zgVar.f();
        zgVar.d(3);
        int i5 = 16;
        int a3 = zgVar.a(16);
        int a4 = zgVar.a(16);
        int a5 = zgVar.a(3);
        int a6 = zgVar.a(3);
        int i6 = 2;
        zgVar.d(2);
        int a7 = zgVar.a(8);
        int a8 = zgVar.a(8);
        int a9 = zgVar.a(4);
        int a10 = zgVar.a(2);
        zgVar.d(2);
        int i7 = i2 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i7 > 0) {
            int a11 = zgVar.a(i5);
            int a12 = zgVar.a(i6);
            int a13 = zgVar.a(i6);
            int a14 = zgVar.a(12);
            int i8 = a10;
            zgVar.d(4);
            int a15 = zgVar.a(12);
            int i9 = i7 - 6;
            if (a12 != 1 && a12 != 2) {
                i7 = i9;
                i4 = 0;
                i3 = 0;
                sparseArray.put(a11, new g(a12, a13, a14, a15, i4, i3));
                a10 = i8;
                i6 = 2;
                i5 = 16;
            }
            i7 -= 8;
            i4 = zgVar.a(8);
            i3 = zgVar.a(8);
            sparseArray.put(a11, new g(a12, a13, a14, a15, i4, i3));
            a10 = i8;
            i6 = 2;
            i5 = 16;
        }
        return new f(a2, f2, a3, a4, a5, a6, a7, a8, a9, a10, sparseArray);
    }

    private static void a(c cVar, a aVar, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i2 == 3) {
            iArr = aVar.d;
        } else if (i2 == 2) {
            iArr = aVar.c;
        } else {
            iArr = aVar.b;
        }
        int[] iArr2 = iArr;
        a(cVar.c, iArr2, i2, i3, i4, paint, canvas);
        a(cVar.d, iArr2, i2, i3, i4 + 1, paint, canvas);
    }

    private static c b(zg zgVar) {
        byte[] bArr;
        int a2 = zgVar.a(16);
        zgVar.d(4);
        int a3 = zgVar.a(2);
        boolean f2 = zgVar.f();
        zgVar.d(1);
        byte[] bArr2 = xp.f;
        if (a3 == 1) {
            zgVar.d(zgVar.a(8) * 16);
        } else if (a3 == 0) {
            int a4 = zgVar.a(16);
            int a5 = zgVar.a(16);
            if (a4 > 0) {
                bArr2 = new byte[a4];
                zgVar.b(bArr2, 0, a4);
            }
            if (a5 > 0) {
                bArr = new byte[a5];
                zgVar.b(bArr, 0, a5);
                return new c(a2, f2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(a2, f2, bArr2, bArr);
    }

    private static a a(zg zgVar, int i2) {
        int a2;
        int i3;
        int a3;
        int a4;
        int i4;
        int i5 = 8;
        int a5 = zgVar.a(8);
        zgVar.d(8);
        int i6 = 2;
        int i7 = i2 - 2;
        int[] a6 = a();
        int[] b2 = b();
        int[] c2 = c();
        while (i7 > 0) {
            int a7 = zgVar.a(i5);
            int a8 = zgVar.a(i5);
            int[] iArr = (a8 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? a6 : (a8 & 64) != 0 ? b2 : c2;
            if ((a8 & 1) != 0) {
                a4 = zgVar.a(i5);
                i4 = zgVar.a(i5);
                a2 = zgVar.a(i5);
                a3 = zgVar.a(i5);
                i3 = i7 - 6;
            } else {
                int a9 = zgVar.a(4) << 4;
                a2 = zgVar.a(4) << 4;
                i3 = i7 - 4;
                a3 = zgVar.a(i6) << 6;
                a4 = zgVar.a(6) << i6;
                i4 = a9;
            }
            if (a4 == 0) {
                i4 = 0;
                a2 = 0;
                a3 = 255;
            }
            double d2 = a4;
            double d3 = i4 - 128;
            double d4 = a2 - 128;
            iArr[a7] = a((byte) (255 - (a3 & 255)), xp.a((int) ((1.402d * d3) + d2), 0, 255), xp.a((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 0, 255), xp.a((int) ((d4 * 1.772d) + d2), 0, 255));
            i7 = i3;
            a5 = a5;
            i5 = 8;
            i6 = 2;
        }
        return new a(a5, a6, b2, c2);
    }

    private static d b(zg zgVar, int i2) {
        int a2 = zgVar.a(8);
        int a3 = zgVar.a(4);
        int a4 = zgVar.a(2);
        zgVar.d(2);
        int i3 = i2 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i3 > 0) {
            int a5 = zgVar.a(8);
            zgVar.d(8);
            i3 -= 6;
            sparseArray.put(a5, new e(zgVar.a(16), zgVar.a(16)));
        }
        return new d(a2, a3, a4, sparseArray);
    }

    private static b a(zg zgVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        zgVar.d(4);
        boolean f2 = zgVar.f();
        zgVar.d(3);
        int a2 = zgVar.a(16);
        int a3 = zgVar.a(16);
        if (f2) {
            int a4 = zgVar.a(16);
            int a5 = zgVar.a(16);
            int a6 = zgVar.a(16);
            i3 = zgVar.a(16);
            i2 = a5;
            i5 = a6;
            i4 = a4;
        } else {
            i2 = a2;
            i3 = a3;
            i4 = 0;
            i5 = 0;
        }
        return new b(a2, a3, i4, i2, i5, i3);
    }

    private static void a(zg zgVar, h hVar) {
        f fVar;
        int a2 = zgVar.a(8);
        int a3 = zgVar.a(16);
        int a4 = zgVar.a(16);
        int d2 = zgVar.d() + a4;
        if (a4 * 8 > zgVar.b()) {
            oc.d("DvbParser", "Data field length exceeds limit");
            zgVar.d(zgVar.b());
            return;
        }
        switch (a2) {
            case 16:
                if (a3 == hVar.a) {
                    d dVar = hVar.i;
                    d b2 = b(zgVar, a4);
                    if (b2.c != 0) {
                        hVar.i = b2;
                        hVar.c.clear();
                        hVar.d.clear();
                        hVar.e.clear();
                        break;
                    } else if (dVar != null && dVar.b != b2.b) {
                        hVar.i = b2;
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.i;
                if (a3 == hVar.a && dVar2 != null) {
                    f c2 = c(zgVar, a4);
                    if (dVar2.c == 0 && (fVar = (f) hVar.c.get(c2.a)) != null) {
                        c2.a(fVar);
                    }
                    hVar.c.put(c2.a, c2);
                    break;
                }
                break;
            case 18:
                if (a3 == hVar.a) {
                    a a5 = a(zgVar, a4);
                    hVar.d.put(a5.a, a5);
                    break;
                } else if (a3 == hVar.b) {
                    a a6 = a(zgVar, a4);
                    hVar.f.put(a6.a, a6);
                    break;
                }
                break;
            case 19:
                if (a3 == hVar.a) {
                    c b3 = b(zgVar);
                    hVar.e.put(b3.a, b3);
                    break;
                } else if (a3 == hVar.b) {
                    c b4 = b(zgVar);
                    hVar.g.put(b4.a, b4);
                    break;
                }
                break;
            case 20:
                if (a3 == hVar.a) {
                    hVar.h = a(zgVar);
                    break;
                }
                break;
        }
        zgVar.e(d2 - zgVar.d());
    }

    public List a(byte[] bArr, int i2) {
        int i3;
        int i4;
        SparseArray sparseArray;
        zg zgVar = new zg(bArr, i2);
        while (zgVar.b() >= 48 && zgVar.a(8) == 15) {
            a(zgVar, this.f);
        }
        h hVar = this.f;
        d dVar = hVar.i;
        if (dVar == null) {
            return Collections.emptyList();
        }
        b bVar = hVar.h;
        if (bVar == null) {
            bVar = this.d;
        }
        Bitmap bitmap = this.g;
        if (bitmap == null || bVar.a + 1 != bitmap.getWidth() || bVar.b + 1 != this.g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.a + 1, bVar.b + 1, Bitmap.Config.ARGB_8888);
            this.g = createBitmap;
            this.c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = dVar.d;
        for (int i5 = 0; i5 < sparseArray2.size(); i5++) {
            this.c.save();
            e eVar = (e) sparseArray2.valueAt(i5);
            f fVar = (f) this.f.c.get(sparseArray2.keyAt(i5));
            int i6 = eVar.a + bVar.c;
            int i7 = eVar.b + bVar.e;
            this.c.clipRect(i6, i7, Math.min(fVar.c + i6, bVar.d), Math.min(fVar.d + i7, bVar.f));
            a aVar = (a) this.f.d.get(fVar.g);
            if (aVar == null && (aVar = (a) this.f.f.get(fVar.g)) == null) {
                aVar = this.e;
            }
            SparseArray sparseArray3 = fVar.k;
            int i8 = 0;
            while (i8 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i8);
                g gVar = (g) sparseArray3.valueAt(i8);
                c cVar = (c) this.f.e.get(keyAt);
                c cVar2 = cVar == null ? (c) this.f.g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i4 = i8;
                    sparseArray = sparseArray3;
                    a(cVar2, aVar, fVar.f, gVar.c + i6, i7 + gVar.d, cVar2.b ? null : this.a, this.c);
                } else {
                    i4 = i8;
                    sparseArray = sparseArray3;
                }
                i8 = i4 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.b) {
                int i9 = fVar.f;
                if (i9 == 3) {
                    i3 = aVar.d[fVar.h];
                } else if (i9 == 2) {
                    i3 = aVar.c[fVar.i];
                } else {
                    i3 = aVar.b[fVar.j];
                }
                this.b.setColor(i3);
                this.c.drawRect(i6, i7, fVar.c + i6, fVar.d + i7, this.b);
            }
            arrayList.add(new a5.b().a(Bitmap.createBitmap(this.g, i6, i7, fVar.c, fVar.d)).b(i6 / bVar.a).b(0).a(i7 / bVar.b, 0).a(0).d(fVar.c / bVar.a).a(fVar.d / bVar.b).a());
            this.c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void a(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        zg zgVar = new zg(bArr);
        int i5 = i3;
        int i6 = i4;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (zgVar.b() != 0) {
            int a2 = zgVar.a(8);
            if (a2 != 240) {
                switch (a2) {
                    case 16:
                        if (i2 != 3) {
                            if (i2 != 2) {
                                bArr2 = null;
                            } else if (bArr7 == null) {
                                bArr3 = h;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr7;
                            }
                            i5 = a(zgVar, iArr, bArr2, i5, i6, paint, canvas);
                            zgVar.c();
                            continue;
                        } else if (bArr5 == null) {
                            bArr3 = i;
                            bArr2 = bArr3;
                            i5 = a(zgVar, iArr, bArr2, i5, i6, paint, canvas);
                            zgVar.c();
                            continue;
                        } else {
                            bArr2 = bArr5;
                            i5 = a(zgVar, iArr, bArr2, i5, i6, paint, canvas);
                            zgVar.c();
                            continue;
                        }
                    case 17:
                        if (i2 == 3) {
                            bArr4 = bArr6 == null ? j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i5 = b(zgVar, iArr, bArr4, i5, i6, paint, canvas);
                        zgVar.c();
                        continue;
                    case 18:
                        i5 = c(zgVar, iArr, null, i5, i6, paint, canvas);
                        continue;
                    default:
                        switch (a2) {
                            case 32:
                                bArr7 = a(4, 4, zgVar);
                                continue;
                            case 33:
                                bArr5 = a(4, 8, zgVar);
                                continue;
                            case 34:
                                bArr6 = a(16, 8, zgVar);
                                continue;
                            default:
                                continue;
                        }
                }
            } else {
                i6 += 2;
                i5 = i3;
            }
        }
    }
}
