package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class j0 extends f0<String> {
    public final String r;
    public final AtomicInteger s;

    /* loaded from: classes.dex */
    public class a implements w<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ long b;

        public a(String str, long j) {
            this.a = str;
            this.b = j;
        }

        @Override // com.fyber.inneractive.sdk.network.w
        public void a(String str, Exception exc, boolean z) {
            String str2 = str;
            IAlog.a("Hit Request: Hitting URL finished: %s", this.a);
            if (exc == null) {
                IAlog.a("Hit Request: Hitting URL response code: %s", str2);
            } else {
                IAlog.a("Hit Request: Hitting URL failed: %s", exc);
            }
            IAlog.a("Hit Request: Url hit took %s millis", Long.valueOf(System.currentTimeMillis() - this.b));
        }
    }

    public j0(w<String> wVar, String str, g gVar) {
        super(wVar, gVar);
        this.s = new AtomicInteger();
        this.r = str;
    }

    public static void b(String str) {
        j0 j0Var = new j0(new a(str, System.currentTimeMillis()), str, x.c.b());
        IAConfigManager.M.s.a.offer(j0Var);
        j0Var.a(r0.QUEUED);
    }

    @Override // com.fyber.inneractive.sdk.network.c0
    public String a() {
        return this.r;
    }

    @Override // com.fyber.inneractive.sdk.network.c0
    public p0 i() {
        return p0.LOW;
    }

    @Override // com.fyber.inneractive.sdk.network.c0
    public boolean o() {
        if (this.s.getAndIncrement() < 4) {
            return true;
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.network.c0
    public z r() {
        return z.GET;
    }

    @Override // com.fyber.inneractive.sdk.network.c0
    public int v() {
        return ((int) Math.pow(2.0d, this.s.get())) * 1000;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    @Override // com.fyber.inneractive.sdk.network.c0
    public b0 a(j jVar, Map<String, List<String>> map, int i) throws Exception {
        try {
            b0 b0Var = new b0();
            b0Var.a = String.valueOf(i);
            InputStream inputStream = jVar.c;
            if (inputStream != null) {
                b0Var.b = com.fyber.inneractive.sdk.util.u.a(inputStream, false).toString();
            }
            return b0Var;
        } catch (Exception e) {
            IAlog.a("failed parse hit network request", e, new Object[0]);
            throw new a0(e);
        }
    }
}
