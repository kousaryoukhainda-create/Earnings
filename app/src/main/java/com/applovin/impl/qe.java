package com.applovin.impl;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.dc;
import com.applovin.impl.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.se;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;
import com.applovin.sdk.R;
/* loaded from: classes.dex */
public abstract class qe extends re {
    private se a;
    private DataSetObserver b;
    private FrameLayout c;
    private ListView d;
    private C1074o f;

    /* loaded from: classes.dex */
    public class a extends DataSetObserver {
        public a() {
            qe.this = r1;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            qe.this.a();
            qe qeVar = qe.this;
            qeVar.b((Context) qeVar);
        }
    }

    /* loaded from: classes.dex */
    public class b implements dc.a {
        final /* synthetic */ C1076q a;

        /* loaded from: classes.dex */
        public class a implements r.b {
            public a() {
                b.this = r1;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(qe.this.a.s());
            }
        }

        /* renamed from: com.applovin.impl.qe$b$b */
        /* loaded from: classes.dex */
        public class C0027b implements r.b {
            public C0027b() {
                b.this = r1;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(qe.this.a.s());
            }
        }

        /* loaded from: classes.dex */
        public class c implements r.b {
            public c() {
                b.this = r1;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(qe.this.a.s());
            }
        }

        /* loaded from: classes.dex */
        public class d implements r.b {
            public d() {
                b.this = r1;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(qe.this.a.e(), false, qe.this.a.s());
            }
        }

        /* loaded from: classes.dex */
        public class e implements r.b {
            public e() {
                b.this = r1;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(qe.this.a.j(), qe.this.a.u(), qe.this.a.s());
            }
        }

        /* loaded from: classes.dex */
        public class f implements r.b {
            public f() {
                b.this = r1;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(qe.this.a.t(), qe.this.a.s());
            }
        }

        /* loaded from: classes.dex */
        public class g implements r.b {
            public g() {
                b.this = r1;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(qe.this.a.n(), true, qe.this.a.s());
            }
        }

        /* loaded from: classes.dex */
        public class h implements r.b {
            final /* synthetic */ cc a;

            public h(cc ccVar) {
                b.this = r1;
                this.a = ccVar;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((bg) this.a).r());
            }
        }

        public b(C1076q c1076q) {
            qe.this = r1;
            this.a = c1076q;
        }

        @Override // com.applovin.impl.dc.a
        public void a(kb kbVar, cc ccVar) {
            int b = kbVar.b();
            if (b == se.e.APP_INFO.ordinal()) {
                yp.a(ccVar.c(), ccVar.b(), qe.this);
            } else if (b == se.e.MAX.ordinal()) {
                if (qe.this.a.a(ccVar)) {
                    r.a(qe.this, MaxDebuggerUnifiedFlowActivity.class, this.a, new a());
                } else {
                    yp.a(ccVar.c(), ccVar.b(), qe.this);
                }
            } else if (b == se.e.PRIVACY.ordinal()) {
                if (kbVar.a() == se.d.CMP.ordinal()) {
                    if (StringUtils.isValidString(qe.this.a.s().j0().k())) {
                        r.a(qe.this, MaxDebuggerTcfInfoListActivity.class, this.a, new C0027b());
                    } else {
                        yp.a(ccVar.c(), ccVar.b(), qe.this);
                    }
                } else if (kbVar.a() == se.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                    r.a(qe.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.a, new c());
                }
            } else if (b == se.e.ADS.ordinal()) {
                if (kbVar.a() == se.b.AD_UNITS.ordinal()) {
                    if (qe.this.a.e().size() > 0) {
                        r.a(qe.this, MaxDebuggerAdUnitsListActivity.class, this.a, new d());
                    } else {
                        yp.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", qe.this);
                    }
                } else if (kbVar.a() == se.b.SELECT_LIVE_NETWORKS.ordinal()) {
                    if (qe.this.a.j().size() <= 0 && qe.this.a.u().size() <= 0) {
                        yp.a("Complete Integrations", "Please complete integrations in order to access this.", qe.this);
                    } else if (qe.this.a.s().k0().c()) {
                        yp.a("Restart Required", ccVar.b(), qe.this);
                    } else {
                        r.a(qe.this, MaxDebuggerTestLiveNetworkActivity.class, this.a, new e());
                    }
                } else if (kbVar.a() == se.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                    if (!qe.this.a.s().k0().c()) {
                        qe.this.getSdk().k0().a();
                        yp.a("Restart Required", ccVar.b(), qe.this);
                    } else if (qe.this.a.t().size() > 0) {
                        r.a(qe.this, MaxDebuggerTestModeNetworkActivity.class, this.a, new f());
                    } else {
                        yp.a("Complete Integrations", "Please complete integrations in order to access this.", qe.this);
                    }
                } else if (kbVar.a() == se.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    r.a(qe.this, MaxDebuggerAdUnitsListActivity.class, this.a, new g());
                }
            } else if ((b == se.e.MICRO_SDK_PARTNER_NETWORKS.ordinal() || b == se.e.INCOMPLETE_NETWORKS.ordinal() || b == se.e.COMPLETED_NETWORKS.ordinal()) && (ccVar instanceof bg)) {
                r.a(qe.this, MaxDebuggerDetailActivity.class, this.a, new h(ccVar));
            }
        }
    }

    public static /* synthetic */ void b(qe qeVar, Context context) {
        qeVar.a(context);
    }

    private void c() {
        a();
        C1074o c1074o = new C1074o(this, 50, 16842874);
        this.f = c1074o;
        c1074o.setColor(-3355444);
        this.c.addView(this.f, new FrameLayout.LayoutParams(-1, -1, 17));
        this.c.bringChildToFront(this.f);
        this.f.a();
    }

    @Override // com.applovin.impl.re
    public com.applovin.impl.sdk.j getSdk() {
        se seVar = this.a;
        if (seVar != null) {
            return seVar.s();
        }
        return null;
    }

    @Override // com.applovin.impl.re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.c = (FrameLayout) findViewById(16908290);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.d = listView;
        listView.setAdapter((ListAdapter) this.a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.re, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        se seVar = this.a;
        if (seVar != null) {
            seVar.unregisterDataSetObserver(this.b);
            this.a.a((dc.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share == menuItem.getItemId()) {
            b();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        se seVar = this.a;
        if (seVar != null && !seVar.v()) {
            c();
        }
    }

    public void setListAdapter(se seVar, C1076q c1076q) {
        DataSetObserver dataSetObserver;
        se seVar2 = this.a;
        if (seVar2 != null && (dataSetObserver = this.b) != null) {
            seVar2.unregisterDataSetObserver(dataSetObserver);
        }
        this.a = seVar;
        this.b = new a();
        b((Context) this);
        this.a.registerDataSetObserver(this.b);
        this.a.a(new b(c1076q));
    }

    public /* synthetic */ void a(Context context) {
        yp.a(this.a.h(), this.a.g(), context);
    }

    public void b(Context context) {
        if (!StringUtils.isValidString(this.a.g()) || this.a.d()) {
            return;
        }
        this.a.b(true);
        runOnUiThread(new Ij0(context, 6, this));
    }

    public void a() {
        C1074o c1074o = this.f;
        if (c1074o != null) {
            c1074o.b();
            this.c.removeView(this.f);
            this.f = null;
        }
    }

    private void b() {
        String o = this.a.o();
        if (TextUtils.isEmpty(o)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", o);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }
}
