package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.cc;
import com.applovin.impl.dc;
import com.applovin.impl.r;
import com.applovin.impl.rn;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public abstract class pn extends re {
    private com.applovin.impl.sdk.j a;
    private dc b;
    private final List c = new ArrayList();
    private final List d = new ArrayList();
    private final List f = new ArrayList();
    private final List g = new ArrayList();
    private final List h = new ArrayList();

    /* loaded from: classes.dex */
    public class a extends dc {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.dc
        public int b() {
            return e.values().length;
        }

        @Override // com.applovin.impl.dc
        public List c(int i) {
            return i == e.IAB_TCF_PARAMETERS.ordinal() ? pn.this.c() : pn.this.a();
        }

        @Override // com.applovin.impl.dc
        public int d(int i) {
            if (i == e.IAB_TCF_PARAMETERS.ordinal()) {
                return d.values().length;
            }
            return c.values().length;
        }

        @Override // com.applovin.impl.dc
        public cc e(int i) {
            if (i == e.IAB_TCF_PARAMETERS.ordinal()) {
                return new fj("IAB TCF Parameters");
            }
            return new fj("CMP CONFIGURATION");
        }
    }

    /* loaded from: classes.dex */
    public class b implements dc.a {
        final /* synthetic */ qn a;
        final /* synthetic */ com.applovin.impl.sdk.j b;

        /* loaded from: classes.dex */
        public class a implements r.b {
            final /* synthetic */ String a;
            final /* synthetic */ String b;

            public a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.a, this.b, b.this.b);
            }
        }

        /* renamed from: com.applovin.impl.pn$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0023b implements r.b {
            public C0023b() {
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(pn.this.f, pn.this.g, pn.this.c, pn.this.d, pn.this.h, b.this.b);
            }
        }

        public b(qn qnVar, com.applovin.impl.sdk.j jVar) {
            this.a = qnVar;
            this.b = jVar;
        }

        @Override // com.applovin.impl.dc.a
        public void a(kb kbVar, cc ccVar) {
            String a2;
            String c;
            if (kbVar.b() == e.IAB_TCF_PARAMETERS.ordinal()) {
                if (kbVar.a() == d.TC_STRING.ordinal()) {
                    a2 = uj.s.a();
                    c = this.a.k();
                } else {
                    a2 = uj.t.a();
                    c = this.a.c();
                }
                r.a(pn.this, MaxDebuggerTcfStringActivity.class, this.b.e(), new a(a2, c));
            } else if (kbVar.a() == c.CONFIGURED_NETWORKS.ordinal()) {
                r.a(pn.this, MaxDebuggerCmpNetworksListActivity.class, this.b.e(), new C0023b());
            } else {
                yp.a(ccVar.c(), ccVar.b(), pn.this);
            }
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    /* loaded from: classes.dex */
    public enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    /* loaded from: classes.dex */
    public enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
    }

    @Override // com.applovin.impl.re
    public com.applovin.impl.sdk.j getSdk() {
        return this.a;
    }

    public void initialize(com.applovin.impl.sdk.j jVar) {
        this.a = jVar;
        qn j0 = jVar.j0();
        a(j0.i());
        a aVar = new a(this);
        this.b = aVar;
        aVar.a(new b(j0, jVar));
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }

    @Override // com.applovin.impl.re, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dc dcVar = this.b;
        if (dcVar != null) {
            dcVar.a((dc.a) null);
        }
    }

    private void a(rn rnVar, List list) {
        if (rnVar.d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (rnVar.d().equals(((rn) it.next()).d())) {
                    return;
                }
            }
        }
        list.add(rnVar);
    }

    private cc b() {
        cc.b a2;
        String a3 = uj.p.a();
        Integer e2 = this.a.j0().e();
        if (StringUtils.isValidString(this.a.j0().d())) {
            a2 = cc.a(cc.c.RIGHT_DETAIL);
        } else {
            cc.b b2 = cc.a(cc.c.DETAIL).b("Unknown CMP SDK ID");
            a2 = b2.a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + a3 + " is " + e2 + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(R.drawable.applovin_ic_warning).b(t3.a(R.color.applovin_sdk_warningColor, this)).a(true);
        }
        a2.d(a3);
        a2.c(e2 != null ? e2.toString() : "No value set");
        a2.c(e2 != null ? -16777216 : -65536);
        return a2.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer g = this.a.j0().g();
        String k = this.a.j0().k();
        String c2 = this.a.j0().c();
        arrayList.add(a(uj.r.a(), g));
        arrayList.add(a(uj.s.a(), k, !tn.b(k)));
        arrayList.add(a(uj.t.a(), c2, false));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        String str;
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.g.size() + this.f.size();
        arrayList.add(b());
        arrayList.add(a(uj.q.a(), this.a.j0().f()));
        arrayList.add(cc.a(cc.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        cc.b d2 = cc.a(cc.c.RIGHT_DETAIL).d("Configured CMP Networks");
        if (size > 0) {
            str = AbstractC2437ph.c(size, "Missing ", " network(s)");
        } else {
            str = "";
        }
        arrayList.add(d2.c(str).c(size > 0 ? -65536 : -16777216).a(this).a(true).a());
        return arrayList;
    }

    private cc a(String str, String str2, boolean z) {
        boolean isValidString = StringUtils.isValidString(str2);
        if (isValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        cc.b d2 = cc.a(cc.c.DETAIL).d(str);
        if (!isValidString) {
            str2 = "No value set";
        }
        cc.b a2 = d2.c(str2).c(z ? -65536 : -16777216).a(isValidString);
        if (isValidString) {
            a2.a(this);
        }
        return a2.a();
    }

    private cc a(String str, Integer num) {
        return cc.a(cc.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? -16777216 : -65536).a();
    }

    private void a(List list) {
        boolean b2 = this.a.j0().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rn rnVar = (rn) it.next();
            if (rnVar.f() == rn.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(rnVar.a())) {
                    a(rnVar, this.c);
                } else {
                    a(rnVar, this.f);
                }
            } else if (rnVar.f() != rn.a.ATP_NETWORK) {
                this.h.add(rnVar);
            } else if (b2) {
                if (Boolean.TRUE.equals(rnVar.a())) {
                    a(rnVar, this.d);
                } else {
                    a(rnVar, this.g);
                }
            } else {
                this.h.add(rnVar);
            }
        }
    }
}
