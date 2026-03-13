package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
/* renamed from: GL  reason: default package */
/* loaded from: classes.dex */
public final class GL extends BaseAdapter {
    public final IL b;
    public int c = -1;
    public boolean d;
    public final boolean f;
    public final LayoutInflater g;
    public final int h;

    public GL(IL il, LayoutInflater layoutInflater, boolean z, int i) {
        this.f = z;
        this.g = layoutInflater;
        this.b = il;
        this.h = i;
        a();
    }

    public final void a() {
        IL il = this.b;
        QL ql = il.t;
        if (ql != null) {
            il.i();
            ArrayList arrayList = il.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((QL) arrayList.get(i)) == ql) {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final QL getItem(int i) {
        ArrayList k;
        IL il = this.b;
        if (this.f) {
            il.i();
            k = il.j;
        } else {
            k = il.k();
        }
        int i2 = this.c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (QL) k.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList k;
        IL il = this.b;
        if (this.f) {
            il.i();
            k = il.j;
        } else {
            k = il.k();
        }
        if (this.c < 0) {
            return k.size();
        }
        return k.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = false;
        if (view == null) {
            view = this.g.inflate(this.h, viewGroup, false);
        }
        int i3 = getItem(i).b;
        int i4 = i - 1;
        if (i4 >= 0) {
            i2 = getItem(i4).b;
        } else {
            i2 = i3;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.b.l() && i3 != i2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC0933bM interfaceC0933bM = (InterfaceC0933bM) view;
        if (this.d) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0933bM.b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
