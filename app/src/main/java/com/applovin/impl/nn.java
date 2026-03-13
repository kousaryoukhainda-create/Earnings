package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.rn;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class nn extends re {
    private com.applovin.impl.sdk.j a;
    private dc b;

    /* loaded from: classes.dex */
    public class a extends dc {
        final /* synthetic */ ArrayList f;
        final /* synthetic */ ArrayList g;
        final /* synthetic */ boolean h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z) {
            super(context);
            this.f = arrayList;
            this.g = arrayList2;
            this.h = z;
        }

        @Override // com.applovin.impl.dc
        public int b() {
            return b.values().length;
        }

        @Override // com.applovin.impl.dc
        public List c(int i) {
            if (i == b.TC_NETWORKS.ordinal()) {
                return this.f;
            }
            return this.g;
        }

        @Override // com.applovin.impl.dc
        public int d(int i) {
            if (i == b.TC_NETWORKS.ordinal()) {
                return this.f.size();
            }
            return this.g.size();
        }

        @Override // com.applovin.impl.dc
        public cc e(int i) {
            String str;
            if (i == b.TC_NETWORKS.ordinal()) {
                return new fj("TCF VENDORS (TC STRING)");
            }
            if (this.h) {
                str = "ATP NETWORKS (AC STRING)";
            } else {
                str = "APPLOVIN PRIVACY SETTING";
            }
            return new fj(str);
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private cc a(String str, String str2) {
        return cc.a().d(str).c(str2).a();
    }

    @Override // com.applovin.impl.re
    public com.applovin.impl.sdk.j getSdk() {
        return this.a;
    }

    public void initialize(com.applovin.impl.sdk.j jVar) {
        this.a = jVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String a2 = a4.b().a(this);
        boolean b2 = jVar.j0().b();
        if (!b2) {
            arrayList2.add(a("Has User Consent", a2));
        }
        for (rn rnVar : jVar.j0().i()) {
            Boolean a3 = rnVar.a();
            if (a3 != null) {
                if (rnVar.f() == rn.a.TCF_VENDOR) {
                    arrayList.add(a(rnVar.b(), String.valueOf(a3)));
                } else if (rnVar.f() == rn.a.ATP_NETWORK) {
                    arrayList2.add(a(rnVar.b(), String.valueOf(a3)));
                }
            } else if (b2 && rnVar.f() == rn.a.ATP_NETWORK) {
                arrayList2.add(a(rnVar.b(), a2));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, b2);
        this.b = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.b);
    }
}
