package com.fyber.fairbid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public abstract class t4<T> extends BaseAdapter {
    public final LayoutInflater a;

    public t4(@NonNull LayoutInflater layoutInflater) {
        this.a = layoutInflater;
    }

    public abstract View a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup);

    public abstract T a(int i);

    public abstract void a(View view, T t);

    @Override // android.widget.Adapter
    public final T getItem(int i) {
        return a(i);
    }

    @Override // android.widget.Adapter
    @NonNull
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = a(this.a, getItemViewType(i), viewGroup);
        }
        T a = a(i);
        a(view, a);
        view.setTag(a);
        return view;
    }
}
