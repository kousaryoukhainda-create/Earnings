package com.google.android.material.chip;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class ChipGroup extends AbstractC2115lx {
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public final C2858ud k;
    public final ViewGroup$OnHierarchyChangeListenerC3116xd l;
    public int m;
    public boolean n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChipGroup(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            r3 = 2130968794(0x7f0400da, float:1.7546252E38)
            r0 = 2131952645(0x7f130405, float:1.9541739E38)
            android.content.Context r10 = defpackage.AbstractC0957bf.t0(r10, r11, r3, r0)
            r9.<init>(r10, r11, r3)
            r6 = 0
            r9.d = r6
            android.content.res.Resources$Theme r10 = r10.getTheme()
            int[] r0 = defpackage.AbstractC3018wU.h
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r0, r6, r6)
            r7 = 1
            int r0 = r10.getDimensionPixelSize(r7, r6)
            r9.b = r0
            int r0 = r10.getDimensionPixelSize(r6, r6)
            r9.c = r0
            r10.recycle()
            ud r10 = new ud
            r10.<init>(r9)
            r9.k = r10
            xd r10 = new xd
            r10.<init>(r9)
            r9.l = r10
            r8 = -1
            r9.m = r8
            r9.n = r6
            android.content.Context r0 = r9.getContext()
            int[] r2 = defpackage.AbstractC3018wU.c
            r4 = 2131952645(0x7f130405, float:1.9541739E38)
            int[] r5 = new int[r6]
            r1 = r11
            android.content.res.TypedArray r11 = defpackage.AbstractC0957bf.W(r0, r1, r2, r3, r4, r5)
            int r0 = r11.getDimensionPixelOffset(r7, r6)
            r1 = 2
            int r1 = r11.getDimensionPixelOffset(r1, r0)
            r9.setChipSpacingHorizontal(r1)
            r1 = 3
            int r0 = r11.getDimensionPixelOffset(r1, r0)
            r9.setChipSpacingVertical(r0)
            r0 = 5
            boolean r0 = r11.getBoolean(r0, r6)
            r9.setSingleLine(r0)
            r0 = 6
            boolean r0 = r11.getBoolean(r0, r6)
            r9.setSingleSelection(r0)
            r0 = 4
            boolean r0 = r11.getBoolean(r0, r6)
            r9.setSelectionRequired(r0)
            int r0 = r11.getResourceId(r6, r8)
            if (r0 == r8) goto L81
            r9.m = r0
        L81:
            r11.recycle()
            super.setOnHierarchyChangeListener(r10)
            java.lang.reflect.Field r10 = defpackage.Sb0.a
            r9.setImportantForAccessibility(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.m = i;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.m;
                if (i2 != -1 && this.i) {
                    c(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    public final void b(int i) {
        int i2 = this.m;
        if (i == i2) {
            return;
        }
        if (i2 != -1 && this.i) {
            c(i2, false);
        }
        if (i != -1) {
            c(i, true);
        }
        setCheckedId(i);
    }

    public final void c(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.n = true;
            ((Chip) findViewById).setChecked(z);
            this.n = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof C2944vd)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.i) {
            return this.m;
        }
        return -1;
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.i) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.g;
    }

    public int getChipSpacingVertical() {
        return this.h;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.m;
        if (i != -1) {
            c(i, true);
            setCheckedId(this.m);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.d) {
            i = getChipCount();
        } else {
            i = -1;
        }
        int rowCount = getRowCount();
        if (this.i) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(rowCount, i, false, i2));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.g != i) {
            this.g = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.h != i) {
            this.h = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.l.b = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.j = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // defpackage.AbstractC2115lx
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.i != z) {
            this.i = z;
            this.n = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.n = false;
            setCheckedId(-1);
        }
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setOnCheckedChangeListener(InterfaceC3030wd interfaceC3030wd) {
    }
}
