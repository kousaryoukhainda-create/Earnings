package com.fyber.inneractive.sdk.player.ui;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.r;
import com.fyber.inneractive.sdk.config.global.s;
import com.fyber.inneractive.sdk.ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.p0;
import com.fyber.inneractive.sdk.util.q0;
import com.fyber.inneractive.sdk.util.t0;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class l extends com.fyber.inneractive.sdk.player.ui.d {
    public static final p0 Q;
    public ViewGroup A;
    public View B;
    public q0 C;
    public q0 D;
    public int E;
    public int F;
    public Runnable G;
    public b1 H;
    public boolean I;
    public View J;
    public TextView K;
    public final s L;
    public ObjectAnimator M;
    public boolean N;
    public String O;
    public final q0 P;
    public ImageView i;
    public ViewGroup j;
    public TextView k;
    public Button l;
    public ImageView m;
    public TextView n;
    public TextView o;
    public View p;
    public com.fyber.inneractive.sdk.model.vast.h q;
    public TextView r;
    public int s;
    public int t;
    public boolean u;
    public ImageView v;
    public ImageView w;
    public IAsmoothProgressBar x;
    public View y;
    public View z;

    /* loaded from: classes.dex */
    public class a implements b1.b {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // com.fyber.inneractive.sdk.util.b1.b
        public void a(b1 b1Var) {
            if (!l.this.h) {
                IAlog.a("Autoclick is triggered", new Object[0]);
                ((com.fyber.inneractive.sdk.player.controller.n) l.this.g).a(this.a, l.Q);
            } else {
                IAlog.a("Autoclick is aborted - app in background", new Object[0]);
            }
            l.this.g();
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnLayoutChangeListener {
        public final /* synthetic */ Bitmap a;

        public b(Bitmap bitmap) {
            this.a = bitmap;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (l.this.getWidth() > 0 && l.this.getHeight() > 0) {
                l.this.b(true);
                l.this.removeOnLayoutChangeListener(this);
                l.this.a(this.a);
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends GestureDetector.SimpleOnGestureListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ int[] b;
        public final /* synthetic */ int c;

        public c(View view, int[] iArr, int i) {
            this.a = view;
            this.b = iArr;
            this.c = i;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            onSingleTapConfirmed(motionEvent);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            onSingleTapConfirmed(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.a.getRootView().getLocationOnScreen(this.b);
                float rawX = motionEvent.getRawX() - this.b[0];
                float rawY = motionEvent.getRawY() - this.b[1];
                p0 p0Var = l.this.a;
                p0Var.a = rawX;
                p0Var.b = rawY;
            }
            l lVar = l.this;
            i iVar = lVar.g;
            if (iVar != null) {
                ((com.fyber.inneractive.sdk.player.controller.n) iVar).a(this.c, lVar.a);
            }
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {
        public final /* synthetic */ GestureDetector a;

        public d(l lVar, GestureDetector gestureDetector) {
            this.a = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return this.a.onTouchEvent(motionEvent);
        }
    }

    static {
        p0 a2 = p0.a();
        a2.c = true;
        Q = a2;
    }

    public l(Context context, s sVar, String str) {
        this(context, null, 0, sVar, str);
    }

    private void setAppInfoButtonRound(TextView textView) {
        textView.setBackgroundResource(R.drawable.bg_circle_overlay);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = (int) getContext().getResources().getDimension(R.dimen.ia_image_control_size);
        layoutParams.height = (int) getContext().getResources().getDimension(R.dimen.ia_image_control_size);
        textView.setLayoutParams(layoutParams);
    }

    public abstract void a(com.fyber.inneractive.sdk.player.ui.b bVar);

    public void a(boolean z, String str) {
        TextView textView = this.r;
        if (textView != null) {
            textView.setText(str);
            if (str != null && str.length() == 1) {
                setAppInfoButtonRound(this.r);
            }
            if (z) {
                h();
            }
            this.r.setVisibility(z ? 0 : 8);
        }
    }

    public void b(com.fyber.inneractive.sdk.player.ui.b bVar) {
        if (this.A != null) {
            if (com.fyber.inneractive.sdk.model.vast.h.Static == bVar.f && !r.c.NONE.equals(bVar.k)) {
                a(this.A, bVar.k, bVar.l);
            } else {
                this.A.setVisibility(0);
            }
        }
    }

    public abstract void b(boolean z);

    public abstract void c();

    public void c(com.fyber.inneractive.sdk.player.ui.b bVar) {
        Integer num;
        com.fyber.inneractive.sdk.model.vast.h hVar = bVar.f;
        com.fyber.inneractive.sdk.model.vast.h hVar2 = com.fyber.inneractive.sdk.model.vast.h.Static;
        if (hVar2 == hVar) {
            a(this.p, 4);
        }
        if ((hVar2 != hVar && hVar != com.fyber.inneractive.sdk.model.vast.h.FMP_End_Card) || (num = bVar.d) == null || num == null) {
            return;
        }
        a(hVar != hVar2 ? 8 : 4, num.intValue());
    }

    public abstract void d();

    public void d(com.fyber.inneractive.sdk.player.ui.b bVar) {
        String string;
        Integer num;
        com.fyber.inneractive.sdk.ignite.k kVar;
        View view = this.z;
        if (view != null) {
            if (bVar.a) {
                if (!r.c.NONE.equals(bVar.k)) {
                    a(this.z, bVar.k, bVar.l);
                } else {
                    this.z.setVisibility(0);
                }
            } else {
                view.setVisibility(8);
            }
            this.l.setAllCaps(bVar.b);
            if (IAConfigManager.M.E.d() && (kVar = bVar.m) != null && kVar.e()) {
                this.l.setText(R.string.ia_video_instant_install_text);
                if (bVar.h) {
                    this.K.setVisibility(0);
                    String str = bVar.i;
                    if (str != null && str.length() == 1) {
                        setAppInfoButtonRound(this.K);
                    }
                    this.K.setText(str);
                }
            } else {
                this.K.setVisibility(8);
                String str2 = bVar.c;
                if (!TextUtils.isEmpty(str2)) {
                    string = t0.a(str2, 15);
                } else {
                    string = getContext().getString(R.string.ia_video_install_now_text);
                }
                this.l.setText(string);
            }
            UnitDisplayType unitDisplayType = ((a0) this.c).f.j;
            if (bVar.g) {
                this.l.setBackgroundResource(R.drawable.bg_green);
                this.m.setVisibility(0);
                ImageView imageView = this.m;
                float f = bVar.j;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat(View.SCALE_X, f), PropertyValuesHolder.ofFloat(View.SCALE_Y, f));
                ofPropertyValuesHolder.setRepeatCount(-1);
                ofPropertyValuesHolder.setRepeatMode(2);
                ofPropertyValuesHolder.setDuration(700L);
                ofPropertyValuesHolder.start();
            } else if (!unitDisplayType.equals(UnitDisplayType.LANDSCAPE) && !unitDisplayType.equals(UnitDisplayType.MRECT)) {
                this.l.setBackgroundResource(R.drawable.bg_green);
                this.l.setTextSize(0, getResources().getDimension(R.dimen.ia_video_overlay_text_large_plus));
            } else {
                this.l.setBackgroundResource(R.drawable.bg_green_medium);
                this.l.setTextSize(0, getResources().getDimension(R.dimen.ia_video_overlay_text_large));
            }
            this.l.setVisibility(0);
            if (!bVar.a || (num = bVar.d) == null || num == null) {
                return;
            }
            a(8, num.intValue());
        }
    }

    public abstract void d(boolean z);

    @Override // com.fyber.inneractive.sdk.player.ui.d, com.fyber.inneractive.sdk.player.ui.h
    public void destroy() {
        super.destroy();
        IAlog.a("%sdestroyed called", IAlog.a(this));
        Runnable runnable = this.G;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.G = null;
        }
        g();
        ViewGroup viewGroup = this.j;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
    }

    public void e() {
        this.i = (ImageView) findViewById(R.id.ia_iv_last_frame);
        this.j = (ViewGroup) findViewById(R.id.ia_texture_view_host);
        this.k = (TextView) findViewById(R.id.ia_tv_call_to_action);
        this.w = (ImageView) findViewById(R.id.ia_iv_expand_collapse_button);
        this.z = findViewById(R.id.ia_default_endcard_video_overlay);
        this.A = (ViewGroup) findViewById(R.id.ia_endcard_video_overlay);
        this.y = findViewById(R.id.ia_paused_video_overlay);
        this.B = findViewById(R.id.ia_buffering_overlay);
        this.l = (Button) findViewById(R.id.ia_b_end_card_call_to_action);
        this.K = (TextView) findViewById(R.id.ia_endcard_tv_app_info_button);
        this.m = (ImageView) findViewById(R.id.hand_animation);
        this.r = (TextView) findViewById(R.id.ia_tv_app_info_button);
        a(this, 7);
        a(this.v, 1);
        a(this.k, 3);
        a(this.r, 10);
        a(this.K, 10);
        a(this.l, 8);
        a(this.w, 5);
        a(this.j, 7);
        a(this.y, 9);
        a(findViewById(R.id.ia_default_endcard_video_overlay), -1);
    }

    public boolean f() {
        if (this.z.getVisibility() != 0 && this.A.getChildCount() <= 0) {
            return false;
        }
        return true;
    }

    public final void g() {
        if (this.H != null) {
            IAlog.a("Autoclick is removed ", new Object[0]);
            this.H.e = null;
            this.H = null;
        }
    }

    public View getEndCardView() {
        return this.p;
    }

    public ViewGroup getTextureHost() {
        return this.j;
    }

    public abstract View[] getTrackingFriendlyView();

    public abstract View[] getTrackingFriendlyViewObstructionPurposeOther();

    public int getVideoHeight() {
        return this.t;
    }

    public int getVideoWidth() {
        return this.s;
    }

    public abstract void h();

    public void i() {
        ImageView imageView = this.w;
        if (imageView != null) {
            imageView.setVisibility(0);
            this.w.setSelected(true);
        }
    }

    public abstract void j();

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        a(this.P, size, size2);
        q0 q0Var = this.P;
        int i3 = q0Var.a;
        if (i3 > 0 && q0Var.b > 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(this.P.b, 1073741824);
            i = makeMeasureSpec;
        } else {
            q0Var.a = size;
            q0Var.b = size2;
        }
        if (!this.C.equals(this.P)) {
            q0 q0Var2 = this.C;
            q0 q0Var3 = this.P;
            q0Var2.getClass();
            q0Var2.a = q0Var3.a;
            q0Var2.b = q0Var3.b;
            j();
        }
        super.onMeasure(i, i2);
    }

    public void setLastFrameBitmap(Bitmap bitmap) {
        IAlog.a("%ssetLastFrameBitmap - %s", IAlog.a(this), bitmap);
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
        q0 q0Var = this.C;
        if (q0Var.a != 0 && q0Var.b != 0) {
            a(bitmap);
            return;
        }
        b(false);
        addOnLayoutChangeListener(new b(bitmap));
    }

    public void setMuteButtonState(boolean z) {
        this.v.setSelected(z);
    }

    public abstract void setRemainingTime(String str);

    public abstract void setSkipText(String str);

    public l(Context context, AttributeSet attributeSet, int i, s sVar, String str) {
        super(context, null, i);
        this.s = -1;
        this.t = -1;
        this.u = false;
        this.C = new q0(0, 0);
        this.I = false;
        this.J = null;
        this.N = false;
        this.P = new q0(0, 0);
        IAlog.a("%sctor called", a());
        setBackgroundColor(getResources().getColor(R.color.ia_video_background_color));
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.L = sVar;
        this.O = str;
    }

    public void a(int i, int i2) {
        if (this.I || this.H != null) {
            return;
        }
        IAlog.a("Start Autoclick timer - %d seconds", Integer.valueOf(i2));
        b1 b1Var = new b1(TimeUnit.SECONDS, i2);
        this.H = b1Var;
        b1Var.e = new a(i);
        b1Var.c();
    }

    public void c(boolean z) {
        View view = this.y;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void a(View view, r.c cVar, int i) {
        if (this.N || !r.c.ZOOM_IN.equals(cVar)) {
            return;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, 0.0f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.0f, 1.0f));
        this.M = ofPropertyValuesHolder;
        ofPropertyValuesHolder.setDuration(i);
    }

    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            UnitDisplayType unitDisplayType = this.d;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            q0 q0Var = this.C;
            int i = q0Var.a;
            int i2 = q0Var.b;
            if (width > 0 && height > 0) {
                float f = width;
                float f2 = height;
                float f3 = f / f2;
                if (unitDisplayType == UnitDisplayType.SQUARE) {
                    i = (int) (i2 * f3);
                } else {
                    if (Math.abs(f3 - 1.7777778f) >= 0.1f) {
                        Math.abs(f3 - 1.3333334f);
                    }
                    float min = Math.min(i / f, 10.0f);
                    float f4 = i2;
                    float f5 = min * f2;
                    if (f4 > f5) {
                        i = (int) (min * f);
                        i2 = (int) f5;
                    } else {
                        float min2 = Math.min(f4 / f2, 10.0f);
                        i = (int) (f * min2);
                        i2 = (int) (min2 * f2);
                    }
                }
            }
            ImageView imageView = this.i;
            if (imageView != null) {
                imageView.getLayoutParams().width = i;
                this.i.getLayoutParams().height = i2;
            }
        }
    }

    public void a(boolean z) {
        View view = this.B;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void a(View view, int i) {
        if (view != null) {
            view.setOnTouchListener(new d(this, new GestureDetector(view.getContext(), new c(view, new int[2], i))));
        }
    }
}
