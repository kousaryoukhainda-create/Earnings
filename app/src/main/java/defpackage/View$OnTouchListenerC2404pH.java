package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
/* renamed from: pH  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnTouchListenerC2404pH implements View.OnTouchListener {
    public static final int t = ViewConfiguration.getTapTimeout();
    public final C2992w7 b;
    public final AccelerateInterpolator c;
    public final ListView d;
    public DH f;
    public final float[] g;
    public final float[] h;
    public final int i;
    public final int j;
    public final float[] k;
    public final float[] l;
    public final float[] m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public final AbstractC2366oq s;

    /* JADX WARN: Type inference failed for: r1v0, types: [w7, java.lang.Object] */
    public View$OnTouchListenerC2404pH(AbstractC2366oq abstractC2366oq) {
        ?? obj = new Object();
        obj.e = Long.MIN_VALUE;
        obj.g = -1L;
        obj.f = 0L;
        this.b = obj;
        this.c = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.g = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.h = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.k = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.l = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.m = fArr5;
        this.d = abstractC2366oq;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.i = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.j = t;
        obj.a = 500;
        obj.b = 500;
        this.s = abstractC2366oq;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.g
            r0 = r0[r7]
            float[] r1 = r3.h
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            android.view.animation.AccelerateInterpolator r5 = r3.c
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L26
            float r4 = -r4
            float r4 = r5.getInterpolation(r4)
            float r4 = -r4
            goto L2e
        L26:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L37
            float r4 = r5.getInterpolation(r4)
        L2e:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L38
        L37:
            r4 = 0
        L38:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3d
            return r2
        L3d:
            float[] r0 = r3.k
            r0 = r0[r7]
            float[] r1 = r3.l
            r1 = r1[r7]
            float[] r2 = r3.m
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L54
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L54:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.View$OnTouchListenerC2404pH.a(float, float, float, int):float");
    }

    public final float c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.i;
        if (i != 0 && i != 1) {
            if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        } else if (f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.q && i == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.o) {
            this.q = false;
            return;
        }
        C2992w7 c2992w7 = this.b;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - c2992w7.e);
        int i3 = c2992w7.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c2992w7.i = i;
        c2992w7.h = c2992w7.a(currentAnimationTimeMillis);
        c2992w7.g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        AbstractC2366oq abstractC2366oq;
        int count;
        C2992w7 c2992w7 = this.b;
        float f = c2992w7.d;
        int abs = (int) (f / Math.abs(f));
        Math.abs(c2992w7.c);
        if (abs == 0 || (count = (abstractC2366oq = this.s).getCount()) == 0) {
            return false;
        }
        int childCount = abstractC2366oq.getChildCount();
        int firstVisiblePosition = abstractC2366oq.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i >= count && abstractC2366oq.getChildAt(childCount - 1).getBottom() <= abstractC2366oq.getHeight()) {
                return false;
            }
        } else if (abs >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && abstractC2366oq.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r1 != 3) goto L11;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 3
            boolean r1 = r7.r
            r2 = 0
            if (r1 != 0) goto L7
            return r2
        L7:
            int r1 = r9.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 == r3) goto L16
            r4 = 2
            if (r1 == r4) goto L1e
            if (r1 == r0) goto L16
            goto L7b
        L16:
            r7.d()
            goto L7b
        L1a:
            r7.p = r3
            r7.n = r2
        L1e:
            float r1 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.widget.ListView r5 = r7.d
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r1 = r7.a(r1, r4, r6, r2)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r8 = r7.a(r9, r8, r4, r3)
            w7 r9 = r7.b
            r9.c = r1
            r9.d = r8
            boolean r8 = r7.q
            if (r8 != 0) goto L7b
            boolean r8 = r7.e()
            if (r8 == 0) goto L7b
            DH r8 = r7.f
            if (r8 != 0) goto L5f
            DH r8 = new DH
            r8.<init>(r7, r0)
            r7.f = r8
        L5f:
            r7.q = r3
            r7.o = r3
            boolean r8 = r7.n
            if (r8 != 0) goto L74
            int r8 = r7.j
            if (r8 <= 0) goto L74
            DH r9 = r7.f
            long r0 = (long) r8
            java.lang.reflect.Field r8 = defpackage.Sb0.a
            r5.postOnAnimationDelayed(r9, r0)
            goto L79
        L74:
            DH r8 = r7.f
            r8.run()
        L79:
            r7.n = r3
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.View$OnTouchListenerC2404pH.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
