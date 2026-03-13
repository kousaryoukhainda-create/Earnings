package com.google.android.ads.nativetemplates;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import io.flutter.plugins.googlemobileads.R;
/* loaded from: classes.dex */
public final class TemplateView extends FrameLayout {
    public final int b;
    public JN c;
    public NativeAd d;
    public NativeAdView f;
    public TextView g;
    public TextView h;
    public RatingBar i;
    public TextView j;
    public ImageView k;
    public MediaView l;
    public Button m;
    public ConstraintLayout n;

    public TemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.TemplateView, 0, 0);
        try {
            this.b = obtainStyledAttributes.getResourceId(R.styleable.TemplateView_gnt_template_type, R.layout.gnt_medium_template_view);
            obtainStyledAttributes.recycle();
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.b, this);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public NativeAdView getNativeAdView() {
        return this.f;
    }

    public String getTemplateTypeName() {
        int i = this.b;
        if (i == R.layout.gnt_medium_template_view) {
            return "medium_template";
        }
        if (i == R.layout.gnt_small_template_view) {
            return "small_template";
        }
        return "";
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f = (NativeAdView) findViewById(R.id.native_ad_view);
        this.g = (TextView) findViewById(R.id.primary);
        this.h = (TextView) findViewById(R.id.secondary);
        this.j = (TextView) findViewById(R.id.body);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.rating_bar);
        this.i = ratingBar;
        ratingBar.setEnabled(false);
        this.m = (Button) findViewById(R.id.cta);
        this.k = (ImageView) findViewById(R.id.icon);
        this.l = (MediaView) findViewById(R.id.media_view);
        this.n = (ConstraintLayout) findViewById(R.id.background);
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.d = nativeAd;
        String store = nativeAd.getStore();
        String advertiser = nativeAd.getAdvertiser();
        String headline = nativeAd.getHeadline();
        String body = nativeAd.getBody();
        String callToAction = nativeAd.getCallToAction();
        Double starRating = nativeAd.getStarRating();
        NativeAd.Image icon = nativeAd.getIcon();
        this.f.setCallToActionView(this.m);
        this.f.setHeadlineView(this.g);
        this.f.setMediaView(this.l);
        this.h.setVisibility(0);
        String store2 = nativeAd.getStore();
        String advertiser2 = nativeAd.getAdvertiser();
        if (!TextUtils.isEmpty(store2) && TextUtils.isEmpty(advertiser2)) {
            this.f.setStoreView(this.h);
        } else if (!TextUtils.isEmpty(advertiser)) {
            this.f.setAdvertiserView(this.h);
            store = advertiser;
        } else {
            store = "";
        }
        this.g.setText(headline);
        this.m.setText(callToAction);
        if (starRating != null && starRating.doubleValue() > 0.0d) {
            this.h.setVisibility(8);
            this.i.setVisibility(0);
            this.i.setRating(starRating.floatValue());
            this.f.setStarRatingView(this.i);
        } else {
            this.h.setText(store);
            this.h.setVisibility(0);
            this.i.setVisibility(8);
        }
        if (icon != null) {
            this.k.setVisibility(0);
            this.k.setImageDrawable(icon.getDrawable());
        } else {
            this.k.setVisibility(8);
        }
        TextView textView = this.j;
        if (textView != null) {
            textView.setText(body);
            this.f.setBodyView(this.j);
        }
        this.f.setNativeAd(nativeAd);
    }

    public void setStyles(JN jn) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        Button button;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        Button button2;
        Button button3;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        Button button4;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        this.c = jn;
        ColorDrawable colorDrawable = jn.q;
        if (colorDrawable != null) {
            this.n.setBackground(colorDrawable);
            TextView textView13 = this.g;
            if (textView13 != null) {
                textView13.setBackground(colorDrawable);
            }
            TextView textView14 = this.h;
            if (textView14 != null) {
                textView14.setBackground(colorDrawable);
            }
            TextView textView15 = this.j;
            if (textView15 != null) {
                textView15.setBackground(colorDrawable);
            }
        }
        Typeface typeface = this.c.e;
        if (typeface != null && (textView12 = this.g) != null) {
            textView12.setTypeface(typeface);
        }
        Typeface typeface2 = this.c.i;
        if (typeface2 != null && (textView11 = this.h) != null) {
            textView11.setTypeface(typeface2);
        }
        Typeface typeface3 = this.c.m;
        if (typeface3 != null && (textView10 = this.j) != null) {
            textView10.setTypeface(typeface3);
        }
        Typeface typeface4 = this.c.a;
        if (typeface4 != null && (button4 = this.m) != null) {
            button4.setTypeface(typeface4);
        }
        Integer num = this.c.g;
        if (num != null && (textView9 = this.g) != null) {
            textView9.setTextColor(num.intValue());
        }
        Integer num2 = this.c.k;
        if (num2 != null && (textView8 = this.h) != null) {
            textView8.setTextColor(num2.intValue());
        }
        Integer num3 = this.c.o;
        if (num3 != null && (textView7 = this.j) != null) {
            textView7.setTextColor(num3.intValue());
        }
        Integer num4 = this.c.c;
        if (num4 != null && (button3 = this.m) != null) {
            button3.setTextColor(num4.intValue());
        }
        float f = this.c.b;
        if (f > 0.0f && (button2 = this.m) != null) {
            button2.setTextSize(f);
        }
        float f2 = this.c.f;
        if (f2 > 0.0f && (textView6 = this.g) != null) {
            textView6.setTextSize(f2);
        }
        float f3 = this.c.j;
        if (f3 > 0.0f && (textView5 = this.h) != null) {
            textView5.setTextSize(f3);
        }
        float f4 = this.c.n;
        if (f4 > 0.0f && (textView4 = this.j) != null) {
            textView4.setTextSize(f4);
        }
        ColorDrawable colorDrawable2 = this.c.d;
        if (colorDrawable2 != null && (button = this.m) != null) {
            button.setBackground(colorDrawable2);
        }
        ColorDrawable colorDrawable3 = this.c.h;
        if (colorDrawable3 != null && (textView3 = this.g) != null) {
            textView3.setBackground(colorDrawable3);
        }
        ColorDrawable colorDrawable4 = this.c.l;
        if (colorDrawable4 != null && (textView2 = this.h) != null) {
            textView2.setBackground(colorDrawable4);
        }
        ColorDrawable colorDrawable5 = this.c.p;
        if (colorDrawable5 != null && (textView = this.j) != null) {
            textView.setBackground(colorDrawable5);
        }
        invalidate();
        requestLayout();
    }
}
