package com.fyber.inneractive.sdk.flow;

import android.app.Activity;
import android.content.res.Resources;
import android.os.CountDownTimer;
import android.view.View;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;
import com.fyber.inneractive.sdk.flow.q;
import com.fyber.inneractive.sdk.interfaces.c;
import com.fyber.inneractive.sdk.network.s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.b1;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class z<AdContent extends q, EventsListener extends InneractiveUnitController.EventsListener> extends r<AdContent, EventsListener> implements com.fyber.inneractive.sdk.interfaces.c {
    public c.a l;
    public Runnable m;
    public b1 n;
    public Runnable o;
    public b1 p;
    public long s;
    public CountDownTimer w;
    public boolean q = false;
    public boolean r = false;
    public boolean t = false;
    public boolean u = false;
    public final com.fyber.inneractive.sdk.util.a v = new com.fyber.inneractive.sdk.util.a();

    /* loaded from: classes.dex */
    public class a extends CountDownTimer {
        public a(long j, long j2) {
            super(j, j2);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            CountDownTimer countDownTimer = z.this.w;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            z.this.e(false);
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            int i = ((int) j) / 1000;
            c.a aVar = z.this.l;
            if (aVar != null) {
                aVar.updateCloseCountdown(i);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements b1.b {
        public b() {
        }

        @Override // com.fyber.inneractive.sdk.util.b1.b
        public void a(b1 b1Var) {
            com.fyber.inneractive.sdk.util.q.b.post(z.this.m);
            z zVar = z.this;
            b1 b1Var2 = zVar.n;
            if (b1Var2 != null) {
                b1Var2.e = null;
                zVar.n = null;
            }
            zVar.r = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.r
    public int A() {
        c.a aVar = this.l;
        if (aVar != null && aVar.getLayout() != null) {
            return this.l.getLayout().getWidth();
        }
        return 1;
    }

    @Override // com.fyber.inneractive.sdk.flow.r
    public void D() {
        super.D();
    }

    public abstract boolean J();

    public void K() {
        boolean z = false;
        if (this.m == null) {
            long N = N();
            this.s = N;
            this.m = new y(this, N);
            IAlog.a("%senabling close with delay %d", IAlog.a(this), Long.valueOf(this.s));
            AdContent adcontent = this.b;
            if (adcontent != null) {
                z = b((z<AdContent, EventsListener>) adcontent);
            }
            if (z && !J()) {
                if (z) {
                    c.a aVar = this.l;
                    if (aVar != null) {
                        aVar.showCloseCountdown();
                    }
                    a aVar2 = new a(100 + this.s, 1000L);
                    this.w = aVar2;
                    aVar2.start();
                    return;
                }
                return;
            }
            Q();
        }
    }

    public abstract int L();

    public abstract int M();

    public abstract long N();

    public abstract boolean O();

    public void P() {
        Runnable runnable = this.m;
        if (runnable != null) {
            com.fyber.inneractive.sdk.util.q.b.removeCallbacks(runnable);
            this.m = null;
        }
        Runnable runnable2 = this.o;
        if (runnable2 != null) {
            com.fyber.inneractive.sdk.util.q.b.removeCallbacks(runnable2);
            this.o = null;
        }
    }

    public void Q() {
        if (!this.r) {
            this.r = true;
            b1 b1Var = new b1(TimeUnit.MILLISECONDS, this.s);
            this.n = b1Var;
            b1Var.e = new b();
            b1Var.c();
        }
    }

    public abstract long a(long j);

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void b(boolean z) {
    }

    public abstract boolean b(AdContent adcontent);

    public void d(boolean z) {
        s.a aVar;
        if (this.b == null) {
            aVar = new s.a(com.fyber.inneractive.sdk.network.r.MRAID_CUSTOM_CLOSE_DETECTED, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null, (JSONArray) null);
        } else {
            com.fyber.inneractive.sdk.network.r rVar = com.fyber.inneractive.sdk.network.r.MRAID_CUSTOM_CLOSE_DETECTED;
            AdContent adcontent = this.b;
            aVar = new s.a(rVar, adcontent.a, adcontent.d(), this.b.c.c());
        }
        JSONObject jSONObject = new JSONObject();
        Boolean valueOf = Boolean.valueOf(z);
        try {
            jSONObject.put("fyber_close_enabled", valueOf);
        } catch (Exception unused) {
            IAlog.e("Got exception adding param to json object: %s, %s", "fyber_close_enabled", valueOf);
        }
        aVar.f.put(jSONObject);
        aVar.a((String) null);
    }

    @Override // com.fyber.inneractive.sdk.flow.r, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        P();
        c.a aVar = this.l;
        if (aVar != null) {
            aVar.destroy();
        }
        this.l = null;
        CountDownTimer countDownTimer = this.w;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.w = null;
        }
        b1 b1Var = this.p;
        if (b1Var != null) {
            b1Var.e = null;
            this.p = null;
        }
        b1 b1Var2 = this.n;
        if (b1Var2 != null) {
            b1Var2.e = null;
            this.n = null;
        }
        super.destroy();
    }

    public void e(boolean z) {
        s.a aVar;
        this.q = true;
        if (z) {
            if (this.b == null) {
                aVar = new s.a(com.fyber.inneractive.sdk.network.r.FAIL_SAFE_ACTIVATED, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null, (JSONArray) null);
            } else {
                com.fyber.inneractive.sdk.network.r rVar = com.fyber.inneractive.sdk.network.r.FAIL_SAFE_ACTIVATED;
                AdContent adcontent = this.b;
                aVar = new s.a(rVar, adcontent.a, adcontent.d(), this.b.c.c());
            }
            JSONObject jSONObject = new JSONObject();
            Boolean valueOf = Boolean.valueOf(O());
            try {
                jSONObject.put("is_endcard", valueOf);
            } catch (Exception unused) {
                IAlog.e("Got exception adding param to json object: %s, %s", "is_endcard", valueOf);
            }
            aVar.f.put(jSONObject);
            aVar.a((String) null);
        }
        c.a aVar2 = this.l;
        if (aVar2 != null) {
            aVar2.showCloseButton(z, M(), L());
            if (!z) {
                this.v.a();
                this.v.a(false);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.r, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void initialize(InneractiveAdSpot inneractiveAdSpot) {
        this.a = inneractiveAdSpot;
        this.b = (AdContent) inneractiveAdSpot.getAdContent();
        this.c = (EventsListener) inneractiveAdSpot.getSelectedUnitController().getEventsListener();
        this.v.a = inneractiveAdSpot;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void o() {
        b1 b1Var = this.n;
        if (b1Var != null) {
            b1Var.b();
        }
        b1 b1Var2 = this.p;
        if (b1Var2 != null) {
            b1Var2.b();
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.c
    public void t() {
        b1 b1Var = this.n;
        if (b1Var != null) {
            b1Var.a();
        }
        b1 b1Var2 = this.p;
        if (b1Var2 != null) {
            b1Var2.a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.r
    public View y() {
        c.a aVar = this.l;
        if (aVar != null) {
            return aVar.getLayout();
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.r
    public int z() {
        c.a aVar = this.l;
        if (aVar != null && aVar.getLayout() != null) {
            return this.l.getLayout().getHeight();
        }
        return 1;
    }

    public void a(c.a aVar, Activity activity) throws InneractiveUnitController.AdDisplayError, Resources.NotFoundException {
        if (this.a == null) {
            IAlog.e("%sYou must set the spot to render before calling renderAd", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("No spot ad to render");
        } else if (aVar != null) {
            this.l = aVar;
        } else {
            IAlog.e("%srenderAd called with a null activity!", IAlog.a(this));
            throw new InneractiveUnitController.AdDisplayError("Activity is null");
        }
    }
}
