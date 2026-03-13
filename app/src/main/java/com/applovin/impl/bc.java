package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
/* loaded from: classes.dex */
public class bc {
    public TextView a;
    public TextView b;
    public ImageView c;
    public ImageView d;
    private cc e;
    private int f;

    public int a() {
        return this.f;
    }

    public cc b() {
        return this.e;
    }

    public void a(int i) {
        this.f = i;
    }

    public void a(cc ccVar) {
        this.e = ccVar;
        this.a.setText(ccVar.k());
        this.a.setTextColor(ccVar.l());
        if (this.b != null) {
            if (!TextUtils.isEmpty(ccVar.f())) {
                this.b.setTypeface(null, 0);
                this.b.setVisibility(0);
                this.b.setText(ccVar.f());
                this.b.setTextColor(ccVar.g());
                if (ccVar.p()) {
                    this.b.setTypeface(null, 1);
                }
            } else {
                this.b.setVisibility(8);
            }
        }
        if (this.c != null) {
            if (ccVar.h() > 0) {
                this.c.setImageResource(ccVar.h());
                this.c.setColorFilter(ccVar.i());
                this.c.setVisibility(0);
            } else {
                this.c.setVisibility(8);
            }
        }
        if (this.d != null) {
            if (ccVar.d() > 0) {
                this.d.setImageResource(ccVar.d());
                this.d.setColorFilter(ccVar.e());
                this.d.setVisibility(0);
                return;
            }
            this.d.setVisibility(8);
        }
    }
}
