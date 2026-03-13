package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes.dex */
public class Guideline extends View {
    public boolean b;

    public Guideline(Context context) {
        super(context);
        this.b = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.b = z;
    }

    public void setGuidelineBegin(int i) {
        C3296zh c3296zh = (C3296zh) getLayoutParams();
        if (this.b && c3296zh.a == i) {
            return;
        }
        c3296zh.a = i;
        setLayoutParams(c3296zh);
    }

    public void setGuidelineEnd(int i) {
        C3296zh c3296zh = (C3296zh) getLayoutParams();
        if (this.b && c3296zh.b == i) {
            return;
        }
        c3296zh.b = i;
        setLayoutParams(c3296zh);
    }

    public void setGuidelinePercent(float f) {
        C3296zh c3296zh = (C3296zh) getLayoutParams();
        if (this.b && c3296zh.c == f) {
            return;
        }
        c3296zh.c = f;
        setLayoutParams(c3296zh);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
        super.setVisibility(8);
    }
}
