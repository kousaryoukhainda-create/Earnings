package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
/* renamed from: QG  reason: default package */
/* loaded from: classes.dex */
public abstract class QG extends ViewGroup {
    public boolean b;
    public int c;
    public int d;
    public int f;
    public int g;
    public int h;
    public float i;
    public boolean j;
    public int[] k;
    public int[] l;
    public Drawable m;
    public int n;
    public int o;
    public int p;
    public int q;

    public QG(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = true;
        this.c = -1;
        this.d = 0;
        this.g = 8388659;
        int[] iArr = AbstractC3104xU.k;
        YZ E = YZ.E(context, attributeSet, iArr, 0);
        Sb0.k(this, context, iArr, attributeSet, (TypedArray) E.c, 0);
        TypedArray typedArray = (TypedArray) E.c;
        int i = typedArray.getInt(1, -1);
        if (i >= 0) {
            setOrientation(i);
        }
        int i2 = typedArray.getInt(0, -1);
        if (i2 >= 0) {
            setGravity(i2);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.i = typedArray.getFloat(4, -1.0f);
        this.c = typedArray.getInt(3, -1);
        this.j = typedArray.getBoolean(7, false);
        setDividerDrawable(E.A(5));
        this.p = typedArray.getInt(8, 0);
        this.q = typedArray.getDimensionPixelSize(6, 0);
        E.H();
    }

    public final void c(Canvas canvas, int i) {
        this.m.setBounds(getPaddingLeft() + this.q, i, (getWidth() - getPaddingRight()) - this.q, this.o + i);
        this.m.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof PG;
    }

    public final void d(Canvas canvas, int i) {
        this.m.setBounds(i, getPaddingTop() + this.q, this.n + i, (getHeight() - getPaddingBottom()) - this.q);
        this.m.draw(canvas);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [PG, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [PG, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: e */
    public PG generateDefaultLayoutParams() {
        int i = this.f;
        if (i == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [PG, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: f */
    public PG generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [PG, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v3, types: [PG, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r0v4, types: [PG, android.widget.LinearLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    /* renamed from: g */
    public PG generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof PG) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) ((PG) layoutParams));
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LinearLayout.LayoutParams(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.c;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.c == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.d;
            if (this.f == 1 && (i = this.g & 112) != 48) {
                if (i != 16) {
                    if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.h;
                    }
                } else {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.h) / 2;
                }
            }
            return i3 + ((LinearLayout.LayoutParams) ((PG) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.c;
    }

    public Drawable getDividerDrawable() {
        return this.m;
    }

    public int getDividerPadding() {
        return this.q;
    }

    public int getDividerWidth() {
        return this.n;
    }

    public int getGravity() {
        return this.g;
    }

    public int getOrientation() {
        return this.f;
    }

    public int getShowDividers() {
        return this.p;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.i;
    }

    public final boolean h(int i) {
        if (i == 0) {
            if ((this.p & 1) == 0) {
                return false;
            }
            return true;
        } else if (i == getChildCount()) {
            if ((this.p & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.p & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.m == null) {
            return;
        }
        int i2 = 0;
        if (this.f == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && h(i2)) {
                    c(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((PG) childAt.getLayoutParams())).topMargin) - this.o);
                }
                i2++;
            }
            if (h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.o;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((PG) childAt2.getLayoutParams())).bottomMargin;
                }
                c(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z2 = AbstractC2084lc0.a;
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && h(i2)) {
                PG pg = (PG) childAt3.getLayoutParams();
                if (z) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) pg).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) pg).leftMargin) - this.n;
                }
                d(canvas, left2);
            }
            i2++;
        }
        if (h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (z) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i = this.n;
                    right = left - i;
                }
            } else {
                PG pg2 = (PG) childAt4.getLayoutParams();
                if (z) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) pg2).leftMargin;
                    i = this.n;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) pg2).rightMargin;
                }
            }
            d(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a1  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.QG.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x02df, code lost:
        if (((android.widget.LinearLayout.LayoutParams) r13).width == (-1)) goto L175;
     */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.QG.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.b = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.c = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.m) {
            return;
        }
        this.m = drawable;
        boolean z = false;
        if (drawable != null) {
            this.n = drawable.getIntrinsicWidth();
            this.o = drawable.getIntrinsicHeight();
        } else {
            this.n = 0;
            this.o = 0;
        }
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.q = i;
    }

    public void setGravity(int i) {
        if (this.g != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.g = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.g;
        if ((8388615 & i3) != i2) {
            this.g = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.j = z;
    }

    public void setOrientation(int i) {
        if (this.f != i) {
            this.f = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.p) {
            requestLayout();
        }
        this.p = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.g;
        if ((i3 & 112) != i2) {
            this.g = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.i = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
