package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.cc;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class jr extends re {
    private String a;
    private com.applovin.impl.sdk.j b;
    private dc c;

    /* loaded from: classes.dex */
    public class a extends dc {
        final /* synthetic */ List f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list) {
            super(context);
            this.f = list;
        }

        @Override // com.applovin.impl.dc
        public cc a() {
            return new cc.b(cc.c.SECTION_CENTERED).d("A plus in front of each segment indicates inclusion and a minus indicates exclusion. The comma in comma-separated values functions as an ∨ (or) operator, and a new row functions as an ∧ (and) operator.").a();
        }

        @Override // com.applovin.impl.dc
        public int b() {
            return 1;
        }

        @Override // com.applovin.impl.dc
        public List c(int i) {
            return this.f;
        }

        @Override // com.applovin.impl.dc
        public int d(int i) {
            return this.f.size();
        }

        @Override // com.applovin.impl.dc
        public cc e(int i) {
            return new fj("SEGMENT TARGETING");
        }
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(cc.a(cc.c.DETAIL).d((String) it.next()).a());
        }
        return arrayList;
    }

    @Override // com.applovin.impl.re
    public com.applovin.impl.sdk.j getSdk() {
        return this.b;
    }

    public void initialize(String str, List<String> list, com.applovin.impl.sdk.j jVar) {
        this.a = str;
        this.b = jVar;
        a aVar = new a(this, a(list));
        this.c = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.a);
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.c);
    }
}
