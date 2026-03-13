package com.fyber.inneractive.sdk.player.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.b0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.p;
import com.fyber.inneractive.sdk.util.p0;
import com.fyber.inneractive.sdk.util.q;
import com.fyber.inneractive.sdk.util.q0;
/* loaded from: classes.dex */
public abstract class d extends RelativeLayout implements h {
    public final p0 a;
    public int b;
    public b0 c;
    public UnitDisplayType d;
    public boolean e;
    public boolean f;
    public i g;
    public boolean h;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.a == d.this.hasWindowFocus()) {
                d.this.b();
            }
        }
    }

    public d(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = p0.a();
        this.b = 0;
        this.e = false;
        this.f = false;
        this.h = false;
        this.b = Math.min(p.f(), p.e());
    }

    public String a() {
        return IAlog.a(this);
    }

    public abstract void a(q0 q0Var, int i, int i2);

    public void b() {
        boolean z;
        if (isShown() && hasWindowFocus() && this.f && !this.h) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            z = getGlobalVisibleRect(new Rect());
        }
        if (z != this.e && this.g != null) {
            IAlog.a("%supdateVisibility changing to %s", IAlog.a(this), Boolean.valueOf(z));
            this.e = z;
            this.g.a(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.ui.h
    public void destroy() {
        if (this.g != null) {
            this.g = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        IAlog.a("%sGot onAttachedToWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f));
        this.f = true;
        i iVar = this.g;
        if (iVar != null) {
            iVar.b();
        }
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IAlog.a("%sGot onDetachedFromWindow: mIsAttached = %s", IAlog.a(this), Boolean.valueOf(this.f));
        this.f = false;
        i iVar = this.g;
        if (iVar != null) {
            iVar.f();
        }
        b();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (equals(view)) {
            IAlog.a("%sgot onVisibilityChanged with %d", IAlog.a(this), Integer.valueOf(i));
            b();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAlog.a("%sgot onWindowFocusChanged with: %s", IAlog.a(this), Boolean.valueOf(z));
        q.b.postDelayed(new a(z), 500L);
    }

    public void setListener(i iVar) {
        this.g = iVar;
    }

    public void setUnitConfig(b0 b0Var) {
        UnitDisplayType unitDisplayType;
        this.c = b0Var;
        a0 a0Var = (a0) b0Var;
        if (a0Var.e == null) {
            unitDisplayType = a0Var.f.j;
        } else {
            unitDisplayType = UnitDisplayType.DEFAULT;
        }
        this.d = unitDisplayType;
    }
}
