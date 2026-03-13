package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannedString;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.cc;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class un extends re {
    private com.applovin.impl.sdk.j a;
    private List b;
    private List c;
    private dc d;
    private List f;
    private List g;
    private ListView h;

    /* loaded from: classes.dex */
    public class a extends dc {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context);
            un.this = r1;
        }

        @Override // com.applovin.impl.dc
        public cc a() {
            return new cc.b(cc.c.SECTION_CENTERED).d("Select a network to load ads using your MAX ad unit configuration. Once enabled, this functionality will reset on the next app session.").a();
        }

        @Override // com.applovin.impl.dc
        public int b() {
            return c.COUNT.ordinal();
        }

        @Override // com.applovin.impl.dc
        public List c(int i) {
            if (i != c.BIDDERS.ordinal()) {
                return un.this.g;
            }
            return un.this.f;
        }

        @Override // com.applovin.impl.dc
        public int d(int i) {
            if (i == c.BIDDERS.ordinal()) {
                return un.this.f.size();
            }
            return un.this.g.size();
        }

        @Override // com.applovin.impl.dc
        public cc e(int i) {
            if (i == c.BIDDERS.ordinal()) {
                return new fj("BIDDERS");
            }
            return new fj("WATERFALL");
        }
    }

    /* loaded from: classes.dex */
    public class b extends bg {
        final /* synthetic */ ic p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(je jeVar, Context context, ic icVar) {
            super(jeVar, context);
            un.this = r1;
            this.p = icVar;
        }

        @Override // com.applovin.impl.bg, com.applovin.impl.cc
        public int d() {
            if (un.this.a.k0().b() != null && un.this.a.k0().b().equals(this.p.b())) {
                return R.drawable.applovin_ic_check_mark_borderless;
            }
            return 0;
        }

        @Override // com.applovin.impl.bg, com.applovin.impl.cc
        public int e() {
            if (un.this.a.k0().b() != null && un.this.a.k0().b().equals(this.p.b())) {
                return -16776961;
            }
            return super.e();
        }

        @Override // com.applovin.impl.cc
        public SpannedString k() {
            int i;
            if (o()) {
                i = -16777216;
            } else {
                i = -7829368;
            }
            return StringUtils.createSpannedString(this.p.a(), i, 18, 1);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        BIDDERS,
        WATERFALL,
        COUNT
    }

    public un() {
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    public static /* synthetic */ void a(un unVar, com.applovin.impl.sdk.j jVar, kb kbVar, cc ccVar) {
        unVar.a(jVar, kbVar, ccVar);
    }

    @Override // com.applovin.impl.re
    public com.applovin.impl.sdk.j getSdk() {
        return this.a;
    }

    public void initialize(List<ic> list, List<ic> list2, com.applovin.impl.sdk.j jVar) {
        this.a = jVar;
        this.b = list;
        this.c = list2;
        this.f = a(list);
        this.g = a(list2);
        a aVar = new a(this);
        this.d = aVar;
        aVar.a(new C2959vk0(7, this, jVar));
        this.d.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Select Live Network");
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.h = listView;
        listView.setAdapter((ListAdapter) this.d);
    }

    @Override // com.applovin.impl.re, com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f = a(this.b);
        this.g = a(this.c);
        this.d.c();
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ic icVar = (ic) it.next();
            arrayList.add(new b(icVar.d(), this, icVar));
        }
        return arrayList;
    }

    private ic a(kb kbVar) {
        if (kbVar.b() == c.BIDDERS.ordinal()) {
            return (ic) this.b.get(kbVar.a());
        }
        return (ic) this.c.get(kbVar.a());
    }

    public /* synthetic */ void a(com.applovin.impl.sdk.j jVar, kb kbVar, cc ccVar) {
        List b2 = a(kbVar).b();
        if (b2.equals(jVar.k0().b())) {
            jVar.k0().a((List) null);
        } else {
            jVar.k0().a(b2);
        }
        this.d.notifyDataSetChanged();
    }
}
