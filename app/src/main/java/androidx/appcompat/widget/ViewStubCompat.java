package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public int b;
    public int c;
    public WeakReference d;
    public LayoutInflater f;

    public ViewStubCompat(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3104xU.v, 0, 0);
        this.c = obtainStyledAttributes.getResourceId(2, -1);
        this.b = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f;
    }

    public int getLayoutResource() {
        return this.b;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.c = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.b = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.d;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                if (this.b != 0) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    LayoutInflater layoutInflater = this.f;
                    if (layoutInflater == null) {
                        layoutInflater = LayoutInflater.from(getContext());
                    }
                    View inflate = layoutInflater.inflate(this.b, viewGroup, false);
                    int i2 = this.c;
                    if (i2 != -1) {
                        inflate.setId(i2);
                    }
                    int indexOfChild = viewGroup.indexOfChild(this);
                    viewGroup.removeViewInLayout(this);
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams != null) {
                        viewGroup.addView(inflate, indexOfChild, layoutParams);
                    } else {
                        viewGroup.addView(inflate, indexOfChild);
                    }
                    this.d = new WeakReference(inflate);
                    return;
                }
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
    }

    public void setOnInflateListener(InterfaceC1628ic0 interfaceC1628ic0) {
    }
}
