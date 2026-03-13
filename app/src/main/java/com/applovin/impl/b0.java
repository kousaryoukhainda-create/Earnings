package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.b0;
import com.applovin.impl.cc;
import com.applovin.impl.dc;
import com.applovin.impl.r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxDebuggerWaterfallSegmentsActivity;
import com.applovin.sdk.R;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public abstract class b0 extends re {
    private z a;
    private com.applovin.impl.sdk.j b;
    private dc c;

    /* loaded from: classes.dex */
    public class a extends dc {
        final /* synthetic */ z f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, z zVar) {
            super(context);
            this.f = zVar;
        }

        @Override // com.applovin.impl.dc
        public int b() {
            return this.f.g().size();
        }

        @Override // com.applovin.impl.dc
        public List c(int i) {
            ArrayList arrayList = new ArrayList();
            a0 a0Var = (a0) this.f.g().get(i);
            arrayList.add(b0.this.c(a0Var.c()));
            if (a0Var.b() != null) {
                arrayList.add(b0.this.a("AB Test Experiment Name", a0Var.b()));
            }
            kr d = a0Var.d();
            b0 b0Var = b0.this;
            arrayList.add(b0Var.a("Device ID Targeting", b0Var.a(d.a())));
            b0 b0Var2 = b0.this;
            arrayList.add(b0Var2.a("Device Type Targeting", b0Var2.b(d.b())));
            if (d.c() != null) {
                arrayList.add(b0.this.a(d.c()));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.dc
        public int d(int i) {
            int i2;
            a0 a0Var = (a0) this.f.g().get(i);
            int i3 = 0;
            if (a0Var.b() != null) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (a0Var.d().c() != null) {
                i3 = 1;
            }
            return i2 + 3 + i3;
        }

        @Override // com.applovin.impl.dc
        public cc e(int i) {
            if (i == b.TARGETED_WATERFALL.ordinal()) {
                return new fj("TARGETED WATERFALL FOR CURRENT DEVICE");
            }
            if (i == b.OTHER_WATERFALLS.ordinal()) {
                return new fj("OTHER WATERFALLS");
            }
            return new fj("");
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        TARGETED_WATERFALL,
        OTHER_WATERFALLS
    }

    @Override // com.applovin.impl.re
    public com.applovin.impl.sdk.j getSdk() {
        return this.b;
    }

    public void initialize(z zVar, com.applovin.impl.sdk.j jVar) {
        this.a = zVar;
        this.b = jVar;
        a aVar = new a(this, zVar);
        this.c = aVar;
        aVar.a(new C0140Ag(16, this, jVar, zVar));
        this.c.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.re, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle(this.a.d());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter((ListAdapter) this.c);
        listView.setDividerHeight(0);
    }

    @Override // com.applovin.impl.re, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dc dcVar = this.c;
        if (dcVar != null) {
            dcVar.a((dc.a) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        if (str.equals(Constants.SIGN_IN_METHOD_PHONE)) {
            return "Phones";
        }
        if (str.equals("tablet")) {
            return "Tablets";
        }
        return "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public cc c(String str) {
        return cc.a(cc.c.RIGHT_DETAIL).b(StringUtils.createSpannedString(str, -16777216, 18, 1)).a(this).a(true).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(String str) {
        if (str.equals("idfa")) {
            return "IDFA Only";
        }
        if (str.equals("dnt")) {
            return "No IDFA Only";
        }
        return "All";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(z zVar, kb kbVar, com.applovin.impl.sdk.j jVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(zVar, (a0) zVar.g().get(kbVar.b()), null, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(z zVar, kb kbVar, com.applovin.impl.sdk.j jVar, MaxDebuggerWaterfallSegmentsActivity maxDebuggerWaterfallSegmentsActivity) {
        a0 a0Var = (a0) zVar.g().get(kbVar.b());
        maxDebuggerWaterfallSegmentsActivity.initialize(a0Var.c(), a0Var.d().c(), jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.j jVar, final z zVar, final kb kbVar, cc ccVar) {
        if (kbVar.a() == 0) {
            r.a(this, MaxDebuggerAdUnitDetailActivity.class, jVar.e(), new r.b() { // from class: Sf0
                @Override // com.applovin.impl.r.b
                public final void a(Activity activity) {
                    switch (r4) {
                        case 0:
                            b0.a(zVar, kbVar, jVar, (MaxDebuggerAdUnitDetailActivity) activity);
                            return;
                        default:
                            b0.a(zVar, kbVar, jVar, (MaxDebuggerWaterfallSegmentsActivity) activity);
                            return;
                    }
                }
            });
        } else {
            r.a(this, MaxDebuggerWaterfallSegmentsActivity.class, jVar.e(), new r.b() { // from class: Sf0
                @Override // com.applovin.impl.r.b
                public final void a(Activity activity) {
                    switch (r4) {
                        case 0:
                            b0.a(zVar, kbVar, jVar, (MaxDebuggerAdUnitDetailActivity) activity);
                            return;
                        default:
                            b0.a(zVar, kbVar, jVar, (MaxDebuggerWaterfallSegmentsActivity) activity);
                            return;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public cc a(String str, String str2) {
        return cc.a(cc.c.RIGHT_DETAIL).d(str).c(str2).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public cc a(List list) {
        cc.b d = cc.a(cc.c.DETAIL).d("Segment Targeting");
        return d.a(StringUtils.createSpannedString(list.size() + " segment group(s)", -7829368, 14)).a(this).a(true).a();
    }
}
