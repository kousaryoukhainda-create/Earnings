package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.dc;
import com.applovin.impl.r;
import com.applovin.impl.w4;
import com.applovin.sdk.R;
/* loaded from: classes.dex */
public abstract class v4 extends Activity {
    private w4 a;
    private FrameLayout b;
    private ListView c;

    /* loaded from: classes.dex */
    public class a implements dc.a {
        final /* synthetic */ C1076q a;

        /* renamed from: com.applovin.impl.v4$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0035a implements r.b {
            final /* synthetic */ kb a;

            public C0035a(kb kbVar) {
                this.a = kbVar;
            }

            @Override // com.applovin.impl.r.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((v6) v4.this.a.d().get(this.a.a()), v4.this.a.e());
            }
        }

        public a(C1076q c1076q) {
            this.a = c1076q;
        }

        @Override // com.applovin.impl.dc.a
        public void a(kb kbVar, cc ccVar) {
            if (kbVar.b() != w4.a.RECENT_ADS.ordinal()) {
                return;
            }
            r.a(v4.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.a, new C0035a(kbVar));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.b = (FrameLayout) findViewById(16908290);
        this.c = (ListView) findViewById(R.id.listView);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        w4 w4Var = this.a;
        if (w4Var != null) {
            w4Var.a((dc.a) null);
            this.a.g();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        w4 w4Var = this.a;
        if (w4Var == null) {
            finish();
            return;
        }
        this.c.setAdapter((ListAdapter) w4Var);
        w4 w4Var2 = this.a;
        if (w4Var2 != null && !w4Var2.e().v().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        w4 w4Var3 = this.a;
        if (w4Var3 != null && w4Var3.f()) {
            a(R.string.applovin_creative_debugger_no_ads_text);
        }
    }

    public void a(w4 w4Var, C1076q c1076q) {
        this.a = w4Var;
        w4Var.a(new a(c1076q));
    }

    private void a(int i) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i);
        this.b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.b.bringChildToFront(textView);
    }
}
