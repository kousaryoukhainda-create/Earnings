package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.renderscript.RSRuntimeException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.Array;
/* loaded from: classes.dex */
public class f {
    public static Bitmap a(Context context, Bitmap bitmap, g gVar) {
        Bitmap a;
        int i = gVar.a;
        int i2 = gVar.d;
        int i3 = i / i2;
        int i4 = gVar.b / i2;
        int[] iArr = {i3, i4};
        for (int i5 = 0; i5 < 2; i5++) {
            if (iArr[i5] == 0) {
                return null;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = 1.0f / gVar.d;
        canvas.scale(f, f);
        Paint paint = new Paint();
        paint.setFlags(3);
        paint.setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.SRC_ATOP));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            a = a(context, createBitmap, gVar.c);
        } catch (RSRuntimeException unused) {
            a = a(createBitmap, gVar.c, true);
        }
        if (gVar.d == 1) {
            return a;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a, gVar.a, gVar.b, true);
        a.recycle();
        return createScaledBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.renderscript.BaseObj, android.renderscript.ScriptIntrinsicBlur] */
    /* JADX WARN: Type inference failed for: r0v6 */
    @android.annotation.TargetApi(18)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap a(android.content.Context r5, android.graphics.Bitmap r6, int r7) throws android.renderscript.RSRuntimeException {
        /*
            r0 = 0
            android.renderscript.RenderScript r5 = android.renderscript.RenderScript.create(r5)     // Catch: java.lang.Throwable -> L4c
            android.renderscript.RenderScript$RSMessageHandler r1 = new android.renderscript.RenderScript$RSMessageHandler     // Catch: java.lang.Throwable -> L48
            r1.<init>()     // Catch: java.lang.Throwable -> L48
            r5.setMessageHandler(r1)     // Catch: java.lang.Throwable -> L48
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch: java.lang.Throwable -> L48
            r2 = 1
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r5, r6, r1, r2)     // Catch: java.lang.Throwable -> L48
            android.renderscript.Type r2 = r1.getType()     // Catch: java.lang.Throwable -> L43
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createTyped(r5, r2)     // Catch: java.lang.Throwable -> L43
            android.renderscript.Element r3 = android.renderscript.Element.U8_4(r5)     // Catch: java.lang.Throwable -> L3e
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r5, r3)     // Catch: java.lang.Throwable -> L3e
            r0.setInput(r1)     // Catch: java.lang.Throwable -> L3e
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L3e
            r0.setRadius(r7)     // Catch: java.lang.Throwable -> L3e
            r0.forEach(r2)     // Catch: java.lang.Throwable -> L3e
            r2.copyTo(r6)     // Catch: java.lang.Throwable -> L3e
            r5.destroy()
            r1.destroy()
            r2.destroy()
            r0.destroy()
            return r6
        L3e:
            r6 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L50
        L43:
            r6 = move-exception
            r2 = r0
        L45:
            r0 = r5
            r5 = r2
            goto L50
        L48:
            r6 = move-exception
            r1 = r0
            r2 = r1
            goto L45
        L4c:
            r6 = move-exception
            r5 = r0
            r1 = r5
            r2 = r1
        L50:
            if (r0 == 0) goto L55
            r0.destroy()
        L55:
            if (r1 == 0) goto L5a
            r1.destroy()
        L5a:
            if (r2 == 0) goto L5f
            r2.destroy()
        L5f:
            if (r5 == 0) goto L64
            r5.destroy()
        L64:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.f.a(android.content.Context, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static Bitmap a(Bitmap bitmap, int i, boolean z) {
        int[] iArr;
        int i2 = i;
        Bitmap copy = z ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        if (i2 < 1) {
            return null;
        }
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i3 = width * height;
        int[] iArr2 = new int[i3];
        copy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i4 = width - 1;
        int i5 = height - 1;
        int i6 = i2 + i2;
        int i7 = i6 + 1;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[i3];
        int[] iArr5 = new int[i3];
        int[] iArr6 = new int[Math.max(width, height)];
        int i8 = (i6 + 2) >> 1;
        int i9 = i8 * i8;
        int i10 = i9 * UserVerificationMethods.USER_VERIFY_HANDPRINT;
        int[] iArr7 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr7[i11] = i11 / i9;
        }
        int[][] iArr8 = (int[][]) Array.newInstance(Integer.TYPE, i7, 3);
        int i12 = i2 + 1;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < height) {
            Bitmap bitmap2 = copy;
            int i16 = height;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = -i2;
            int i26 = 0;
            while (i25 <= i2) {
                int i27 = i5;
                int[] iArr9 = iArr6;
                int i28 = iArr2[Math.min(i4, Math.max(i25, 0)) + i14];
                int[] iArr10 = iArr8[i25 + i2];
                iArr10[0] = (i28 & 16711680) >> 16;
                iArr10[1] = (i28 & 65280) >> 8;
                iArr10[2] = i28 & 255;
                int abs = i12 - Math.abs(i25);
                int i29 = iArr10[0];
                i18 = (i29 * abs) + i18;
                int i30 = iArr10[1];
                i17 = (i30 * abs) + i17;
                int i31 = iArr10[2];
                i26 += abs * i31;
                if (i25 > 0) {
                    i24 += i29;
                    i23 += i30;
                    i22 += i31;
                } else {
                    i21 += i29;
                    i20 += i30;
                    i19 += i31;
                }
                i25++;
                i5 = i27;
                iArr6 = iArr9;
            }
            int i32 = i5;
            int[] iArr11 = iArr6;
            int i33 = i2;
            int i34 = i26;
            int i35 = 0;
            while (i35 < width) {
                iArr3[i14] = iArr7[i18];
                iArr4[i14] = iArr7[i17];
                iArr5[i14] = iArr7[i34];
                int i36 = i18 - i21;
                int i37 = i17 - i20;
                int i38 = i34 - i19;
                int[] iArr12 = iArr8[((i33 - i2) + i7) % i7];
                int i39 = i21 - iArr12[0];
                int i40 = i20 - iArr12[1];
                int i41 = i19 - iArr12[2];
                if (i13 == 0) {
                    iArr = iArr7;
                    iArr11[i35] = Math.min(i35 + i2 + 1, i4);
                } else {
                    iArr = iArr7;
                }
                int i42 = iArr2[i15 + iArr11[i35]];
                int i43 = (i42 & 16711680) >> 16;
                iArr12[0] = i43;
                int i44 = (i42 & 65280) >> 8;
                iArr12[1] = i44;
                int i45 = i42 & 255;
                iArr12[2] = i45;
                int i46 = i24 + i43;
                int i47 = i23 + i44;
                int i48 = i22 + i45;
                i18 = i36 + i46;
                i17 = i37 + i47;
                i34 = i38 + i48;
                i33 = (i33 + 1) % i7;
                int[] iArr13 = iArr8[i33 % i7];
                int i49 = iArr13[0];
                i21 = i39 + i49;
                int i50 = iArr13[1];
                i20 = i40 + i50;
                int i51 = iArr13[2];
                i19 = i41 + i51;
                i24 = i46 - i49;
                i23 = i47 - i50;
                i22 = i48 - i51;
                i14++;
                i35++;
                iArr7 = iArr;
            }
            i15 += width;
            i13++;
            copy = bitmap2;
            height = i16;
            i5 = i32;
            iArr6 = iArr11;
        }
        int[] iArr14 = iArr7;
        Bitmap bitmap3 = copy;
        int i52 = i5;
        int[] iArr15 = iArr6;
        int i53 = height;
        int i54 = 0;
        while (i54 < width) {
            int i55 = -i2;
            int i56 = i7;
            int[] iArr16 = iArr2;
            int i57 = 0;
            int i58 = 0;
            int i59 = 0;
            int i60 = 0;
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            int i64 = i55;
            int i65 = i55 * width;
            int i66 = 0;
            int i67 = 0;
            while (i64 <= i2) {
                int i68 = width;
                int max = Math.max(0, i65) + i54;
                int[] iArr17 = iArr8[i64 + i2];
                iArr17[0] = iArr3[max];
                iArr17[1] = iArr4[max];
                iArr17[2] = iArr5[max];
                int abs2 = i12 - Math.abs(i64);
                i57 = (iArr3[max] * abs2) + i57;
                i67 = (iArr4[max] * abs2) + i67;
                i66 = (iArr5[max] * abs2) + i66;
                if (i64 > 0) {
                    i61 += iArr17[0];
                    i62 += iArr17[1];
                    i63 += iArr17[2];
                } else {
                    i60 += iArr17[0];
                    i59 += iArr17[1];
                    i58 += iArr17[2];
                }
                int i69 = i52;
                if (i64 < i69) {
                    i65 += i68;
                }
                i64++;
                i52 = i69;
                width = i68;
            }
            int i70 = width;
            int i71 = i52;
            int i72 = i2;
            int i73 = i54;
            int i74 = i53;
            int i75 = 0;
            while (i75 < i74) {
                iArr16[i73] = (iArr16[i73] & (-16777216)) | (iArr14[i57] << 16) | (iArr14[i67] << 8) | iArr14[i66];
                int i76 = i57 - i60;
                int i77 = i67 - i59;
                int i78 = i66 - i58;
                int[] iArr18 = iArr8[((i72 - i2) + i56) % i56];
                int i79 = i60 - iArr18[0];
                int i80 = i59 - iArr18[1];
                int i81 = i58 - iArr18[2];
                if (i54 == 0) {
                    iArr15[i75] = Math.min(i75 + i12, i71) * i70;
                }
                int i82 = iArr15[i75] + i54;
                int i83 = iArr3[i82];
                iArr18[0] = i83;
                int i84 = iArr4[i82];
                iArr18[1] = i84;
                int i85 = iArr5[i82];
                iArr18[2] = i85;
                int i86 = i61 + i83;
                int i87 = i62 + i84;
                int i88 = i63 + i85;
                i57 = i76 + i86;
                i67 = i77 + i87;
                i66 = i78 + i88;
                i72 = (i72 + 1) % i56;
                int[] iArr19 = iArr8[i72];
                int i89 = iArr19[0];
                i60 = i79 + i89;
                int i90 = iArr19[1];
                i59 = i80 + i90;
                int i91 = iArr19[2];
                i58 = i81 + i91;
                i61 = i86 - i89;
                i62 = i87 - i90;
                i63 = i88 - i91;
                i73 += i70;
                i75++;
                i2 = i;
            }
            i54++;
            i2 = i;
            i52 = i71;
            i53 = i74;
            i7 = i56;
            iArr2 = iArr16;
            width = i70;
        }
        int i92 = width;
        bitmap3.setPixels(iArr2, 0, i92, 0, 0, i92, i53);
        return bitmap3;
    }
}
