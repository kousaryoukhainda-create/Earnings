package com.fyber.fairbid;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ie extends BaseAdapter {
    public final a a = new a();
    public List<Adapter> b = Collections.emptyList();
    public int c;

    /* loaded from: classes.dex */
    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            super.onChanged();
            ie.this.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            super.onInvalidated();
            ie.this.notifyDataSetInvalidated();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @NonNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("[adapter:");
            sb.append(this.a);
            sb.append(", position: ");
            sb.append(this.b);
            sb.append(", viewTypeBase: ");
            return AbstractC2437ph.k(sb, this.c, "]");
        }
    }

    public final void a(@NonNull List<Adapter> list) {
        if (list.size() != 0) {
            for (Adapter adapter : this.b) {
                adapter.unregisterDataSetObserver(this.a);
            }
            List<Adapter> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
            this.b = unmodifiableList;
            this.c = 0;
            for (Adapter adapter2 : unmodifiableList) {
                adapter2.registerDataSetObserver(this.a);
                this.c = adapter2.getViewTypeCount() + this.c;
            }
            notifyDataSetChanged();
            return;
        }
        throw new IllegalArgumentException("inner adapters cannot be empty list");
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int i = 0;
        for (Adapter adapter : this.b) {
            i += adapter.getCount();
        }
        return i;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        b a2 = a(i);
        return this.b.get(a2.a).getItem(a2.b);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        b a2 = a(i);
        return this.b.get(a2.a).getItemId(a2.b);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        b a2 = a(i);
        int itemViewType = this.b.get(a2.a).getItemViewType(a2.b);
        if (itemViewType >= 0) {
            return itemViewType + a2.c;
        }
        return itemViewType;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        b a2 = a(i);
        return this.b.get(a2.a).getView(a2.b, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return this.c;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return false;
    }

    public final b a(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Adapter adapter = this.b.get(i3);
            int count = adapter.getCount();
            int viewTypeCount = adapter.getViewTypeCount();
            int i5 = count + i2;
            if (i5 > i) {
                return new b(i3, i - i2, i4);
            }
            i4 += viewTypeCount;
            i3++;
            if (i3 >= this.b.size()) {
                return null;
            }
            i2 = i5;
        }
    }
}
