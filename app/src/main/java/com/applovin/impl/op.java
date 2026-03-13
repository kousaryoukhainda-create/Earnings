package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.cc;
import com.applovin.impl.dc;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class op extends re {
    private com.applovin.impl.sdk.j a;
    private dc b;

    /* loaded from: classes.dex */
    public class a extends dc {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.dc
        public int b() {
            return d.values().length;
        }

        @Override // com.applovin.impl.dc
        public List c(int i) {
            return i == d.SETTINGS.ordinal() ? op.this.c() : op.this.a();
        }

        @Override // com.applovin.impl.dc
        public int d(int i) {
            if (i == d.SETTINGS.ordinal()) {
                return e.values().length;
            }
            return c.values().length;
        }

        @Override // com.applovin.impl.dc
        public cc e(int i) {
            if (i == d.SETTINGS.ordinal()) {
                return new fj("SETTINGS");
            }
            return new fj("GDPR APPLICABILITY");
        }
    }

    /* loaded from: classes.dex */
    public class b implements dc.a {
        final /* synthetic */ com.applovin.impl.sdk.j a;

        public b(com.applovin.impl.sdk.j jVar) {
            this.a = jVar;
        }

        @Override // com.applovin.impl.dc.a
        public void a(kb kbVar, cc ccVar) {
            if (kbVar.b() == d.SETTINGS.ordinal()) {
                if (kbVar.a() == e.PRIVACY_POLICY_URL.ordinal()) {
                    if (this.a.u().g() != null) {
                        tp.a(this.a.u().g(), com.applovin.impl.sdk.j.m(), this.a);
                    } else {
                        yp.a("Missing Privacy Policy URL", "You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL", op.this);
                    }
                } else if (kbVar.a() == e.TERMS_OF_SERVICE_URL.ordinal() && this.a.u().h() != null) {
                    tp.a(this.a.u().h(), com.applovin.impl.sdk.j.m(), this.a);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        DESCRIPTION,
        CONSENT_FLOW_GEOGRAPHY,
        DEBUG_USER_GEOGRAPHY
    }

    /* loaded from: classes.dex */
    public enum d {
        SETTINGS,
        GDPR_APPLICABILITY
    }

    /* loaded from: classes.dex */
    public enum e {
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(e.values().length);
        arrayList.add(b());
        arrayList.add(d());
        return arrayList;
    }

    private cc d() {
        cc.b d2 = cc.a().d("Terms of Service URL");
        if (this.a.u().h() != null) {
            d2.a(R.drawable.applovin_ic_check_mark_bordered);
            d2.b(t3.a(R.color.applovin_sdk_checkmarkColor, this));
            d2.a(true);
        } else {
            d2.c("None");
            d2.a(false);
        }
        return d2.a();
    }

    @Override // com.applovin.impl.re
    public com.applovin.impl.sdk.j getSdk() {
        return this.a;
    }

    public void initialize(com.applovin.impl.sdk.j jVar) {
        this.a = jVar;
        a aVar = new a(this);
        this.b = aVar;
        aVar.a(new b(jVar));
        this.b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("MAX Terms and Privacy Policy Flow");
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

    private cc a(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        return cc.a().d("Consent Flow Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown").b(z).a();
    }

    private cc b(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, boolean z) {
        return cc.a().d("Debug User Geography").c(consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "None").b(z).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        ArrayList arrayList = new ArrayList(c.values().length);
        AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.a.s().getConsentFlowUserGeography();
        AppLovinSdkConfiguration.ConsentFlowUserGeography e2 = this.a.u().e();
        boolean z = yp.c(this.a) && e2 != AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
        arrayList.add(cc.a().d("AppLovin determines whether the user is located in a GDPR region. If the user is in a GDPR region, the MAX SDK presents Google UMP.\n\nYou can test the flow on debug mode by overriding the region check by setting the debug user geography.").a());
        arrayList.add(a(consentFlowUserGeography, !z));
        arrayList.add(b(e2, z));
        return arrayList;
    }

    private cc b() {
        boolean z = this.a.u().g() != null;
        return cc.a().d("Privacy Policy URL").a(z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(t3.a(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this)).a(true).a();
    }
}
