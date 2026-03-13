package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.cc;
import com.applovin.impl.dc;
import com.applovin.impl.rn;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class n3 extends re {
    private com.applovin.impl.sdk.j a;
    private dc b;

    /* loaded from: classes.dex */
    public class a extends dc {
        final /* synthetic */ List f;
        final /* synthetic */ List g;
        final /* synthetic */ List h;
        final /* synthetic */ List i;
        final /* synthetic */ List j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f = list;
            this.g = list2;
            this.h = list3;
            this.i = list4;
            this.j = list5;
        }

        @Override // com.applovin.impl.dc
        public int b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.dc
        public List c(int i) {
            List<rn> list;
            boolean z = true;
            if (i == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f;
            } else if (i == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.g;
            } else {
                z = false;
                if (i == c.LISTED_TC_NETWORKS.ordinal()) {
                    list = this.h;
                } else if (i == c.LISTED_AC_NETWORKS.ordinal()) {
                    list = this.i;
                } else {
                    list = this.j;
                }
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (rn rnVar : list) {
                arrayList.add(n3.this.a(rnVar, z));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.dc
        public int d(int i) {
            if (i == c.MISSING_TC_NETWORKS.ordinal()) {
                return this.f.size();
            }
            if (i == c.MISSING_AC_NETWORKS.ordinal()) {
                return this.g.size();
            }
            if (i == c.LISTED_TC_NETWORKS.ordinal()) {
                return this.h.size();
            }
            if (i == c.LISTED_AC_NETWORKS.ordinal()) {
                return this.i.size();
            }
            return this.j.size();
        }

        @Override // com.applovin.impl.dc
        public cc e(int i) {
            if (i == c.MISSING_TC_NETWORKS.ordinal()) {
                return new fj("MISSING TCF VENDORS (TC STRING)");
            }
            if (i == c.MISSING_AC_NETWORKS.ordinal()) {
                return new fj("MISSING ATP NETWORKS (AC STRING)");
            }
            if (i == c.LISTED_TC_NETWORKS.ordinal()) {
                return new fj("LISTED TCF VENDORS (TC STRING)");
            }
            if (i == c.LISTED_AC_NETWORKS.ordinal()) {
                return new fj("LISTED ATP NETWORKS (AC STRING)");
            }
            return new fj("NON-CONFIGURABLE NETWORKS");
        }
    }

    /* loaded from: classes.dex */
    public class b implements dc.a {
        public b() {
        }

        @Override // com.applovin.impl.dc.a
        public void a(kb kbVar, cc ccVar) {
            yp.a(ccVar.c(), ccVar.b(), n3.this);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    @Override // com.applovin.impl.re
    public com.applovin.impl.sdk.j getSdk() {
        return this.a;
    }

    public void initialize(List<rn> list, List<rn> list2, List<rn> list3, List<rn> list4, List<rn> list5, com.applovin.impl.sdk.j jVar) {
        this.a = jVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.b = aVar;
        aVar.a(new b());
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public cc a(rn rnVar, boolean z) {
        cc.b a2 = cc.a();
        boolean b2 = this.a.j0().b();
        rn.a f = rnVar.f();
        rn.a aVar = rn.a.TCF_VENDOR;
        if (f != aVar && (rnVar.f() != rn.a.ATP_NETWORK || !b2)) {
            a2.d(rnVar.b());
        } else {
            String c2 = rnVar.c();
            String str = rnVar.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            cc.b b3 = a2.d(c2).d(z ? -65536 : -16777216).b(c2);
            StringBuilder l = AbstractC0324Hi.l(str);
            l.append(rnVar.d());
            b3.a(l.toString()).a(true);
        }
        return a2.a();
    }
}
