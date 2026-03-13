package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.C1074o;
import com.applovin.impl.t3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;
/* loaded from: classes.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {
    private final GradientDrawable a;
    private final Button b;
    private final C1074o c;
    private b d;
    private MaxAdFormat f;
    private a g;

    /* loaded from: classes.dex */
    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    /* loaded from: classes.dex */
    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    private int a(b bVar) {
        if (b.LOAD == bVar) {
            return t3.a(R.color.applovin_sdk_brand_color, getContext());
        }
        if (b.LOADING == bVar) {
            return t3.a(R.color.applovin_sdk_brand_color, getContext());
        }
        return t3.a(R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    private String b(b bVar) {
        if (b.LOAD == bVar) {
            return "Load";
        }
        if (b.LOADING == bVar) {
            return "";
        }
        return "Show";
    }

    private void c(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.c.a();
        } else {
            setEnabled(true);
            this.c.b();
        }
        this.b.setText(b(bVar));
        this.a.setColor(a(bVar));
    }

    public b getControlState() {
        return this.d;
    }

    public MaxAdFormat getFormat() {
        return this.f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.g;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.d != bVar) {
            c(bVar);
        }
        this.d = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.g = aVar;
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.a = gradientDrawable;
        Button button = new Button(getContext());
        this.b = button;
        C1074o c1074o = new C1074o(getContext(), 20, 16842873);
        this.c = c1074o;
        b bVar = b.LOAD;
        this.d = bVar;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        gradientDrawable.setCornerRadius(20.0f);
        button.setBackground(gradientDrawable);
        a();
        c1074o.setColor(-1);
        addView(c1074o, new FrameLayout.LayoutParams(-1, -1, 17));
        c(bVar);
    }

    private void a() {
        this.b.setTextColor(new ColorStateList(new int[][]{new int[]{16842919}, new int[0]}, new int[]{t3.a(R.color.applovin_sdk_highlightTextColor, getContext()), -1}));
    }
}
