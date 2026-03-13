package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.material.timepicker.e;
import com.ykapps.earnings.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
/* loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int m = 0;
    public final ArrayList b;
    public final IJ c;
    public final VA d;
    public final LinkedHashSet f;
    public final HJ g;
    public Integer[] h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;

    public MaterialButtonToggleGroup(@NonNull Context context, AttributeSet attributeSet) {
        super(AbstractC0957bf.t0(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131952659), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.b = new ArrayList();
        this.c = new IJ(this);
        this.d = new VA(this, 29);
        this.f = new LinkedHashSet();
        this.g = new HJ(this);
        this.i = false;
        TypedArray W = AbstractC0957bf.W(getContext(), attributeSet, AbstractC3018wU.k, R.attr.materialButtonToggleGroupStyle, 2131952659, new int[0]);
        setSingleSelection(W.getBoolean(2, false));
        this.l = W.getResourceId(0, -1);
        this.k = W.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        W.recycle();
        Field field = Sb0.a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && c(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        this.l = i;
        b(i, true);
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            Field field = Sb0.a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.g.add(this.c);
        materialButton.setOnPressedChangeListenerInternal(this.d);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                layoutParams.setMarginEnd(0);
                layoutParams.setMarginStart(-min);
                layoutParams.topMargin = 0;
            } else {
                layoutParams.bottomMargin = 0;
                layoutParams.topMargin = -min;
                layoutParams.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams);
        }
        if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams3.topMargin = 0;
                layoutParams3.bottomMargin = 0;
                return;
            }
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.p) {
            d(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        C1236e10 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.b.add(new JJ(shapeAppearanceModel.e, shapeAppearanceModel.h, shapeAppearanceModel.f, shapeAppearanceModel.g));
        Sb0.l(materialButton, new Y9(this, 2));
    }

    public final void b(int i, boolean z) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a();
        }
    }

    public final boolean c(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final boolean d(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.k && checkedButtonIds.isEmpty()) {
            View findViewById = findViewById(i);
            if (findViewById instanceof MaterialButton) {
                this.i = true;
                ((MaterialButton) findViewById).setChecked(true);
                this.i = false;
            }
            this.l = i;
            return false;
        }
        if (z && this.j) {
            checkedButtonIds.remove(Integer.valueOf(i));
            for (Integer num : checkedButtonIds) {
                int intValue = num.intValue();
                View findViewById2 = findViewById(intValue);
                if (findViewById2 instanceof MaterialButton) {
                    this.i = true;
                    ((MaterialButton) findViewById2).setChecked(false);
                    this.i = false;
                }
                b(intValue, false);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.g);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.h = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        boolean z;
        JJ jj;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                C1151d10 e = materialButton.getShapeAppearanceModel().e();
                JJ jj2 = (JJ) this.b.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C2462q c2462q = JJ.e;
                    if (i == firstVisibleChildIndex) {
                        if (z) {
                            Field field = Sb0.a;
                            if (getLayoutDirection() == 1) {
                                jj = new JJ(c2462q, c2462q, jj2.b, jj2.c);
                            } else {
                                jj = new JJ(jj2.a, jj2.d, c2462q, c2462q);
                            }
                        } else {
                            jj = new JJ(jj2.a, c2462q, jj2.b, c2462q);
                        }
                    } else if (i == lastVisibleChildIndex) {
                        if (z) {
                            Field field2 = Sb0.a;
                            if (getLayoutDirection() == 1) {
                                jj = new JJ(jj2.a, jj2.d, c2462q, c2462q);
                            } else {
                                jj = new JJ(c2462q, c2462q, jj2.b, jj2.c);
                            }
                        } else {
                            jj = new JJ(c2462q, jj2.d, c2462q, jj2.c);
                        }
                    } else {
                        jj2 = null;
                    }
                    jj2 = jj;
                }
                if (jj2 == null) {
                    e.e = new C2462q(0.0f);
                    e.f = new C2462q(0.0f);
                    e.g = new C2462q(0.0f);
                    e.h = new C2462q(0.0f);
                } else {
                    e.e = jj2.a;
                    e.h = jj2.d;
                    e.f = jj2.b;
                    e.g = jj2.c;
                }
                materialButton.setShapeAppearanceModel(e.a());
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.j) {
            return this.l;
        }
        return -1;
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.p) {
                arrayList.add(Integer.valueOf(materialButton.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.h;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        MaterialButton materialButton;
        super.onFinishInflate();
        int i = this.l;
        if (i != -1 && (materialButton = (MaterialButton) findViewById(i)) != null) {
            materialButton.setChecked(true);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.j) {
            i = 1;
        } else {
            i = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.g.remove(this.c);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.b.remove(indexOfChild);
        }
        e();
        a();
    }

    public void setSelectionRequired(boolean z) {
        this.k = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.i = true;
            for (int i = 0; i < getChildCount(); i++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i);
                materialButton.setChecked(false);
                b(materialButton.getId(), false);
            }
            this.i = false;
            setCheckedId(-1);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
