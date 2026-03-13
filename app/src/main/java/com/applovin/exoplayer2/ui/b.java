package com.applovin.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.applovin.exoplayer2.ui.b;
import com.applovin.exoplayer2.ui.i;
import com.applovin.impl.b1;
import com.applovin.impl.xp;
import com.applovin.sdk.R;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public class b extends View implements i {
    private final float A;
    private int B;
    private long C;
    private int D;
    private Rect E;
    private ValueAnimator F;
    private float G;
    private boolean H;
    private boolean I;
    private long J;
    private long K;
    private long L;
    private long M;
    private int N;
    private long[] O;
    private boolean[] P;
    private final Rect a;
    private final Rect b;
    private final Rect c;
    private final Rect d;
    private final Paint f;
    private final Paint g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    private final Paint k;
    private final Drawable l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final StringBuilder v;
    private final Formatter w;
    private final Runnable x;
    private final CopyOnWriteArraySet y;
    private final Point z;

    public b(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    public static /* synthetic */ void b(b bVar) {
        bVar.a();
    }

    private void c(long j) {
        if (this.J == j) {
            return;
        }
        this.J = j;
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).b(this, j);
        }
    }

    private long getPositionIncrement() {
        long j = this.C;
        if (j == -9223372036854775807L) {
            long j2 = this.K;
            if (j2 == -9223372036854775807L) {
                return 0L;
            }
            return j2 / this.B;
        }
        return j;
    }

    private String getProgressText() {
        return xp.a(this.v, this.w, this.L);
    }

    private long getScrubberPosition() {
        if (this.b.width() > 0 && this.K != -9223372036854775807L) {
            return (this.d.width() * this.K) / this.b.width();
        }
        return 0L;
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        c();
    }

    @Override // com.applovin.exoplayer2.ui.i
    public long getPreferredUpdateDelay() {
        int b = b(this.A, this.b.width());
        if (b != 0) {
            long j = this.K;
            if (j != 0 && j != -9223372036854775807L) {
                return j / b;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        b(canvas);
        a(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.I && !z) {
            a(false);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.K <= 0) {
            return;
        }
        if (xp.a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            return;
        }
        accessibilityNodeInfo.addAction(4096);
        accessibilityNodeInfo.addAction(8192);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.a(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.x
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.x
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.I
            if (r0 == 0) goto L30
            r5 = 0
            r4.a(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.b.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8 = i3 - i;
        int i9 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i8 - getPaddingRight();
        if (this.H) {
            i5 = 0;
        } else {
            i5 = this.t;
        }
        if (this.o == 1) {
            i6 = (i9 - getPaddingBottom()) - this.n;
            int i10 = this.m;
            i7 = ((i9 - getPaddingBottom()) - i10) - Math.max(i5 - (i10 / 2), 0);
        } else {
            i6 = (i9 - this.n) / 2;
            i7 = (i9 - this.m) / 2;
        }
        this.a.set(paddingLeft, i6, paddingRight, this.n + i6);
        Rect rect = this.b;
        Rect rect2 = this.a;
        rect.set(rect2.left + i5, i7, rect2.right - i5, this.m + i7);
        if (xp.a >= 29) {
            a(i8, i9);
        }
        b();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.n;
        } else if (mode != 1073741824) {
            size = Math.min(this.n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        c();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.l;
        if (drawable != null && a(drawable, i)) {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0025, code lost:
        if (r3 != 3) goto L32;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.K
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.a(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.I
            if (r8 == 0) goto L76
            int r8 = r7.u
            if (r0 >= r8) goto L3a
            int r8 = r7.D
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r2 = r2 + r8
            float r8 = (float) r2
            r7.a(r8)
            goto L40
        L3a:
            r7.D = r2
            float r8 = (float) r2
            r7.a(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.c(r0)
            r7.b()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.I
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = 1
        L59:
            r7.a(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.a(r8, r0)
            if (r0 == 0) goto L76
            r7.a(r8)
            long r0 = r7.getScrubberPosition()
            r7.b(r0)
            r7.b()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.K <= 0) {
            return false;
        }
        if (i == 8192) {
            if (a(-getPositionIncrement())) {
                a(false);
            }
        } else if (i != 4096) {
            return false;
        } else {
            if (a(getPositionIncrement())) {
                a(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.i.setColor(i);
        invalidate(this.a);
    }

    public void setBufferedColor(int i) {
        this.g.setColor(i);
        invalidate(this.a);
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void setBufferedPosition(long j) {
        if (this.M == j) {
            return;
        }
        this.M = j;
        b();
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void setDuration(long j) {
        if (this.K == j) {
            return;
        }
        this.K = j;
        if (this.I && j == -9223372036854775807L) {
            a(true);
        }
        b();
    }

    @Override // android.view.View, com.applovin.exoplayer2.ui.i
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.I && !z) {
            a(true);
        }
    }

    public void setKeyCountIncrement(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        b1.a(z);
        this.B = i;
        this.C = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        b1.a(z);
        this.B = -1;
        this.C = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.j.setColor(i);
        invalidate(this.a);
    }

    public void setPlayedColor(int i) {
        this.f.setColor(i);
        invalidate(this.a);
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void setPosition(long j) {
        if (this.L == j) {
            return;
        }
        this.L = j;
        setContentDescription(getProgressText());
        b();
    }

    public void setScrubberColor(int i) {
        this.k.setColor(i);
        invalidate(this.a);
    }

    public void setUnplayedColor(int i) {
        this.h.setColor(i);
        invalidate(this.a);
    }

    public b(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        Paint paint = new Paint();
        this.f = paint;
        Paint paint2 = new Paint();
        this.g = paint2;
        Paint paint3 = new Paint();
        this.h = paint3;
        Paint paint4 = new Paint();
        this.i = paint4;
        Paint paint5 = new Paint();
        this.j = paint5;
        Paint paint6 = new Paint();
        this.k = paint6;
        paint6.setAntiAlias(true);
        this.y = new CopyOnWriteArraySet();
        this.z = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.A = f;
        this.u = a(f, -50);
        int a = a(f, 4);
        int a2 = a(f, 26);
        int a3 = a(f, 4);
        int a4 = a(f, 12);
        int a5 = a(f, 0);
        int a6 = a(f, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.AppLovinDefaultTimeBar, i, i2);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.AppLovinDefaultTimeBar_al_scrubber_drawable);
                this.l = drawable;
                if (drawable != null) {
                    a(drawable);
                    a2 = Math.max(drawable.getMinimumHeight(), a2);
                }
                this.m = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_bar_height, a);
                this.n = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_touch_target_height, a2);
                this.o = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_bar_gravity, 0);
                this.p = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_width, a3);
                this.q = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_enabled_size, a4);
                this.r = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_disabled_size, a5);
                this.s = obtainStyledAttributes.getDimensionPixelSize(R.styleable.AppLovinDefaultTimeBar_al_scrubber_dragged_size, a6);
                int i3 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_color, -1);
                int i4 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_scrubber_color, -1);
                int i5 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_buffered_color, -855638017);
                int i6 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_unplayed_color, 872415231);
                int i7 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_ad_marker_color, -1291845888);
                int i8 = obtainStyledAttributes.getInt(R.styleable.AppLovinDefaultTimeBar_al_played_ad_marker_color, 872414976);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.m = a;
            this.n = a2;
            this.o = 0;
            this.p = a3;
            this.q = a4;
            this.r = a5;
            this.s = a6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.l = null;
        }
        StringBuilder sb = new StringBuilder();
        this.v = sb;
        this.w = new Formatter(sb, Locale.getDefault());
        this.x = new C30(this, 7);
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            this.t = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.t = (Math.max(this.r, Math.max(this.q, this.s)) + 1) / 2;
        }
        this.G = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.F = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: Of0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b.this.a(valueAnimator2);
            }
        });
        this.K = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.B = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private static int a(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private static int b(float f, int i) {
        return (int) (i / f);
    }

    public /* synthetic */ void a() {
        a(false);
    }

    private void b(long j) {
        this.J = j;
        this.I = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).a(this, j);
        }
    }

    public /* synthetic */ void a(ValueAnimator valueAnimator) {
        this.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.a);
    }

    private void c() {
        Drawable drawable = this.l;
        if (drawable != null && drawable.isStateful() && this.l.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void a(i.a aVar) {
        b1.a(aVar);
        this.y.add(aVar);
    }

    @Override // com.applovin.exoplayer2.ui.i
    public void a(long[] jArr, boolean[] zArr, int i) {
        b1.a(i == 0 || !(jArr == null || zArr == null));
        this.N = i;
        this.O = jArr;
        this.P = zArr;
        b();
    }

    private void b() {
        this.c.set(this.b);
        this.d.set(this.b);
        long j = this.I ? this.J : this.L;
        if (this.K > 0) {
            int width = (int) ((this.b.width() * this.M) / this.K);
            Rect rect = this.c;
            Rect rect2 = this.b;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((this.b.width() * j) / this.K);
            Rect rect3 = this.d;
            Rect rect4 = this.b;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.c;
            int i = this.b.left;
            rect5.right = i;
            this.d.right = i;
        }
        invalidate(this.a);
    }

    private void a(boolean z) {
        removeCallbacks(this.x);
        this.I = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((i.a) it.next()).a(this, this.J, z);
        }
    }

    private boolean a(long j) {
        long j2 = this.K;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.I ? this.J : this.L;
        long b = xp.b(j3 + j, 0L, j2);
        if (b == j3) {
            return false;
        }
        if (!this.I) {
            b(b);
        } else {
            c(b);
        }
        b();
        return true;
    }

    private void b(Canvas canvas) {
        int height = this.b.height();
        int centerY = this.b.centerY() - (height / 2);
        int i = height + centerY;
        if (this.K <= 0) {
            Rect rect = this.b;
            canvas.drawRect(rect.left, centerY, rect.right, i, this.h);
            return;
        }
        Rect rect2 = this.c;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int max = Math.max(Math.max(this.b.left, i3), this.d.right);
        int i4 = this.b.right;
        if (max < i4) {
            canvas.drawRect(max, centerY, i4, i, this.h);
        }
        int max2 = Math.max(i2, this.d.right);
        if (i3 > max2) {
            canvas.drawRect(max2, centerY, i3, i, this.g);
        }
        if (this.d.width() > 0) {
            Rect rect3 = this.d;
            canvas.drawRect(rect3.left, centerY, rect3.right, i, this.f);
        }
        if (this.N == 0) {
            return;
        }
        long[] jArr = (long[]) b1.a(this.O);
        boolean[] zArr = (boolean[]) b1.a(this.P);
        int i5 = this.p / 2;
        for (int i6 = 0; i6 < this.N; i6++) {
            long b = xp.b(jArr[i6], 0L, this.K);
            Rect rect4 = this.b;
            int min = Math.min(rect4.width() - this.p, Math.max(0, ((int) ((this.b.width() * b) / this.K)) - i5)) + rect4.left;
            canvas.drawRect(min, centerY, min + this.p, i, zArr[i6] ? this.j : this.i);
        }
    }

    private void a(float f) {
        Rect rect = this.d;
        Rect rect2 = this.b;
        rect.right = xp.a((int) f, rect2.left, rect2.right);
    }

    private Point a(MotionEvent motionEvent) {
        this.z.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.z;
    }

    private boolean a(float f, float f2) {
        return this.a.contains((int) f, (int) f2);
    }

    private void a(Canvas canvas) {
        int i;
        if (this.K <= 0) {
            return;
        }
        Rect rect = this.d;
        int a = xp.a(rect.right, rect.left, this.b.right);
        int centerY = this.d.centerY();
        Drawable drawable = this.l;
        if (drawable == null) {
            if (!this.I && !isFocused()) {
                i = isEnabled() ? this.q : this.r;
            } else {
                i = this.s;
            }
            canvas.drawCircle(a, centerY, (int) ((i * this.G) / 2.0f), this.k);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.G)) / 2;
        int intrinsicHeight = ((int) (this.l.getIntrinsicHeight() * this.G)) / 2;
        this.l.setBounds(a - intrinsicWidth, centerY - intrinsicHeight, a + intrinsicWidth, centerY + intrinsicHeight);
        this.l.draw(canvas);
    }

    private void a(int i, int i2) {
        Rect rect = this.E;
        if (rect != null && rect.width() == i && this.E.height() == i2) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i, i2);
        this.E = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    private boolean a(Drawable drawable) {
        return xp.a >= 23 && a(drawable, getLayoutDirection());
    }

    private static boolean a(Drawable drawable, int i) {
        boolean layoutDirection;
        if (xp.a >= 23) {
            layoutDirection = drawable.setLayoutDirection(i);
            if (layoutDirection) {
                return true;
            }
        }
        return false;
    }
}
