package com.applovin.impl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class dc extends BaseAdapter implements View.OnClickListener {
    protected Context a;
    private List b = new ArrayList();
    private Map c = new HashMap();
    private a d;

    /* loaded from: classes.dex */
    public interface a {
        void a(kb kbVar, cc ccVar);
    }

    public dc(Context context) {
        this.a = context.getApplicationContext();
    }

    public cc a() {
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    public abstract int b();

    @Override // android.widget.Adapter
    /* renamed from: b */
    public cc getItem(int i) {
        return (cc) this.b.get(i);
    }

    public abstract List c(int i);

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new C30(this, 27));
    }

    public abstract int d(int i);

    public abstract cc e(int i);

    @Override // android.widget.Adapter
    public int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return getItem(i).m();
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        bc bcVar;
        cc item = getItem(i);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            bcVar = new bc();
            bcVar.a = (TextView) view.findViewById(16908308);
            bcVar.b = (TextView) view.findViewById(16908309);
            bcVar.c = (ImageView) view.findViewById(R.id.imageView);
            bcVar.d = (ImageView) view.findViewById(R.id.detailImageView);
            view.setTag(bcVar);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            bcVar = (bc) view.getTag();
        }
        bcVar.a(i);
        bcVar.a(item);
        view.setEnabled(item.o());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return cc.n();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return getItem(i).o();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i;
        this.b = new ArrayList();
        int b = b();
        this.c = new HashMap(b);
        cc a2 = a();
        if (a2 != null) {
            this.b.add(a2);
            i = 1;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < b; i2++) {
            int d = d(i2);
            if (d != 0) {
                this.b.add(e(i2));
                this.b.addAll(c(i2));
                this.c.put(Integer.valueOf(i2), Integer.valueOf(i));
                i = d + 1 + i;
            }
        }
        this.b.add(new fj(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        bc bcVar = (bc) view.getTag();
        cc b = bcVar.b();
        kb a2 = a(bcVar.a());
        a aVar = this.d;
        if (aVar != null && a2 != null) {
            aVar.a(a2, b);
        }
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(t3.a(R.color.applovin_sdk_highlightListItemColor, this.a));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }

    private kb a(int i) {
        for (int i2 = 0; i2 < b(); i2++) {
            Integer num = (Integer) this.c.get(Integer.valueOf(i2));
            if (num != null) {
                if (i <= num.intValue() + d(i2)) {
                    return new kb(i2, i - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    public void a(a aVar) {
        this.d = aVar;
    }
}
