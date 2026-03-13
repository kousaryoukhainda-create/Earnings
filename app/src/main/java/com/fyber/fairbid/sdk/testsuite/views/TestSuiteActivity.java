package com.fyber.fairbid.sdk.testsuite.views;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import com.fyber.fairbid.ak;
import com.fyber.fairbid.hi;
import com.fyber.fairbid.hk;
import com.fyber.fairbid.internal.e;
import com.fyber.fairbid.internal.f;
import com.fyber.fairbid.jc;
import com.fyber.fairbid.l6;
import com.fyber.fairbid.qh;
import com.fyber.fairbid.sdk.R;
import com.fyber.fairbid.sdk.testsuite.bus.EventBus;
import com.fyber.fairbid.sdk.testsuite.views.TestSuiteActivity;
import com.fyber.fairbid.tj;
import com.fyber.fairbid.u1;
import com.fyber.fairbid.w1;
import com.fyber.fairbid.z1;
import com.google.android.gms.tagmanager.DataLayer;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes.dex */
public class TestSuiteActivity extends Activity {
    public static final String OPENING_METHOD = "opening_method";
    public static final String SPLASHSCREEN = "splashscreen";
    public static boolean i = true;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public final Handler.Callback f = new Handler.Callback(this) { // from class: S50
        public final /* synthetic */ TestSuiteActivity c;

        {
            this.c = this;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean a;
            boolean b;
            boolean c;
            switch (r2) {
                case 0:
                    a = this.c.a(message);
                    return a;
                case 1:
                    b = this.c.b(message);
                    return b;
                default:
                    c = this.c.c(message);
                    return c;
            }
        }
    };
    public final Handler.Callback g = new Handler.Callback(this) { // from class: S50
        public final /* synthetic */ TestSuiteActivity c;

        {
            this.c = this;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean a;
            boolean b;
            boolean c;
            switch (r2) {
                case 0:
                    a = this.c.a(message);
                    return a;
                case 1:
                    b = this.c.b(message);
                    return b;
                default:
                    c = this.c.c(message);
                    return c;
            }
        }
    };
    public final Handler.Callback h = new Handler.Callback(this) { // from class: S50
        public final /* synthetic */ TestSuiteActivity c;

        {
            this.c = this;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            boolean a;
            boolean b;
            boolean c;
            switch (r2) {
                case 0:
                    a = this.c.a(message);
                    return a;
                case 1:
                    b = this.c.b(message);
                    return b;
                default:
                    c = this.c.c(message);
                    return c;
            }
        }
    };

    @Override // android.app.Activity
    public void onBackPressed() {
        qh qhVar = (qh) getFragmentManager().findFragmentByTag("PlacementDetailsFragment");
        if (qhVar != null && qhVar.d()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        hi a;
        super.onCreate(bundle);
        e eVar = e.a;
        f fVar = e.b;
        hk hkVar = (hk) ((C2474q50) fVar.B).a();
        hkVar.b.setValue(hkVar, hk.d[0], Boolean.TRUE);
        String openingMethod = getIntent().getExtras().getString(OPENING_METHOD);
        z1 a2 = fVar.a();
        a2.getClass();
        Intrinsics.checkNotNullParameter(openingMethod, "openingMethod");
        u1 a3 = a2.a.a(w1.TEST_SUITE_OPENED);
        Intrinsics.checkNotNullParameter("test_suite_opened_using", Constants.KEY);
        a3.k.put("test_suite_opened_using", openingMethod);
        l6.a(a2.f, a3, DataLayer.EVENT_KEY, a3, false);
        EventBus.registerReceiver(2, this.h);
        eVar.n().a();
        setContentView(R.layout.fb_activity_test_suite);
        if (fVar.n().isTablet()) {
            setRequestedOrientation(3);
            if (bundle == null || bundle.getBoolean("animate_frame", true)) {
                View findViewById = findViewById(R.id.fragment_frame);
                findViewById.setVisibility(4);
                findViewById.addOnLayoutChangeListener(new ak(this, findViewById));
            }
        } else {
            setRequestedOrientation(1);
        }
        EventBus.registerReceiver(3, this.f);
        if (i) {
            EventBus.registerReceiver(6, this.g);
            eVar.b().publishCurrentState();
            hi.a().b();
        } else {
            this.c = true;
            synchronized (hi.class) {
                a = hi.g.a();
            }
            a.b();
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager.findFragmentByTag(SPLASHSCREEN) == null) {
            fragmentManager.beginTransaction().replace(R.id.fragment_frame, new tj(), SPLASHSCREEN).commit();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        f fVar = e.b;
        if (fVar.c().getApplicationContext() != null) {
            hk hkVar = (hk) ((C2474q50) fVar.B).a();
            hkVar.b.setValue(hkVar, hk.d[0], Boolean.FALSE);
            z1 a = fVar.a();
            u1 a2 = a.a.a(w1.TEST_SUITE_CLOSED);
            l6.a(a.f, a2, DataLayer.EVENT_KEY, a2, false);
        }
        EventBus.unregisterReceiver(3, this.f);
        EventBus.unregisterReceiver(6, this.g);
        EventBus.unregisterReceiver(2, this.h);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("animate_frame", !this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(Message message) {
        this.a = true;
        a();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b(Message message) {
        this.c = true;
        a();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean c(Message message) {
        this.d = true;
        a();
        return false;
    }

    public final void a() {
        if (this.c && this.d && this.a && this.e) {
            jc jcVar = new jc();
            Bundle bundle = new Bundle();
            bundle.putString("FB_APPID", e.a.i().d);
            jcVar.setArguments(bundle);
            getFragmentManager().beginTransaction().setTransition(4099).replace(R.id.fragment_frame, jcVar).commit();
            i = false;
            this.e = false;
        }
    }
}
