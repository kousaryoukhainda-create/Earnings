package com.fyber.inneractive.sdk.network;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c implements com.fyber.inneractive.sdk.util.o0 {
    public Handler d;
    public int e;
    public final BlockingQueue<JSONObject> a = new LinkedBlockingQueue();
    public JSONArray b = new JSONArray();
    public boolean f = false;
    public boolean g = false;
    public final HandlerThread c = new HandlerThread("EventCollectorHandlerThread", 0);

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ long b;

        public a(int i, long j) {
            this.a = i;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.d.sendEmptyMessageDelayed(this.a, this.b);
        }
    }

    public final void a(int i, long j) {
        Handler handler = this.d;
        if (handler != null) {
            handler.post(new a(i, j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v21, types: [org.json.JSONObject] */
    @Override // com.fyber.inneractive.sdk.util.o0
    public void handleMessage(Message message) {
        String str;
        int i = message.what;
        if (i == 12312329 || i == 20150330) {
            if (this.f && this.a.size() > 0) {
                while (true) {
                    str = null;
                    if (this.a.size() <= 0) {
                        break;
                    }
                    try {
                        str = this.a.poll();
                    } catch (Throwable unused) {
                    }
                    if (str != null) {
                        this.b.put(str);
                    }
                }
                if (this.b.length() > 0) {
                    JSONArray jSONArray = this.b;
                    String b = com.fyber.inneractive.sdk.config.a.b();
                    long currentTimeMillis = System.currentTimeMillis();
                    try {
                        str = jSONArray.toString();
                    } catch (Throwable unused2) {
                    }
                    if (str != null) {
                        i0 i0Var = new i0(new e(this, b, jSONArray, currentTimeMillis), b, str, x.a().b());
                        IAConfigManager.M.s.a.offer(i0Var);
                        i0Var.a(r0.QUEUED);
                    }
                    this.b = new JSONArray();
                }
            }
            Handler handler = this.d;
            if (handler != null) {
                handler.removeMessages(12312329);
                a(12312329, this.e * 1000);
            }
        }
    }

    public void a(int i) {
        this.f = true;
        this.e = i;
        Handler handler = this.d;
        if (handler != null && handler.hasMessages(12312329)) {
            this.d.removeMessages(12312329);
        }
        a(12312329, this.e * 1000);
    }
}
