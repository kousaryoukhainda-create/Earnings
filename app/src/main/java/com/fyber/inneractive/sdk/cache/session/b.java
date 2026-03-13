package com.fyber.inneractive.sdk.cache.session;

import com.applovin.sdk.AppLovinEventTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class b implements Runnable {
    public final /* synthetic */ d a;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ JSONObject a;

        public a(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.fyber.inneractive.sdk.cache.session.enums.b[] values;
            d dVar = b.this.a;
            JSONObject jSONObject = this.a;
            dVar.getClass();
            for (com.fyber.inneractive.sdk.cache.session.enums.b bVar : com.fyber.inneractive.sdk.cache.session.enums.b.values()) {
                if (bVar != com.fyber.inneractive.sdk.cache.session.enums.b.NONE) {
                    String name = bVar.name();
                    JSONArray jSONArray = new JSONArray();
                    try {
                        jSONArray = jSONObject.getJSONArray(name);
                    } catch (JSONException unused) {
                    }
                    for (int i = 0; i < jSONArray.length(); i++) {
                        e a = e.a(jSONArray.optJSONObject(i));
                        if (a != null && a.a != 0) {
                            dVar.a(bVar, a);
                        }
                    }
                }
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("currentSession");
            if (optJSONObject != null) {
                f fVar = new f();
                JSONArray jSONArray2 = new JSONArray();
                try {
                    jSONArray2 = optJSONObject.getJSONArray(AppLovinEventTypes.USER_VIEWED_CONTENT);
                } catch (JSONException unused2) {
                }
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2 = jSONArray2.getJSONObject(i2);
                    } catch (JSONException unused3) {
                    }
                    com.fyber.inneractive.sdk.cache.session.enums.b a2 = com.fyber.inneractive.sdk.cache.session.enums.b.a(jSONObject2.optString("type"), jSONObject2.optString("subType"));
                    e a3 = e.a(jSONObject2.optJSONObject("session_data"));
                    if (a3 != null) {
                        fVar.a.put(a2, a3);
                    }
                }
                dVar.a(fVar);
            }
            b.this.a.getClass();
        }
    }

    public b(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r8 = this;
            r0 = 0
            android.app.Application r1 = com.fyber.inneractive.sdk.util.p.a
            java.lang.String r2 = "session_details.json"
            r3 = 0
            java.io.FileInputStream r4 = r1.openFileInput(r2)     // Catch: java.lang.Throwable -> L23
            int r5 = r4.available()     // Catch: java.lang.Throwable -> L24
            byte[] r6 = new byte[r5]     // Catch: java.lang.Throwable -> L24
            int r7 = r4.read(r6)     // Catch: java.lang.Throwable -> L24
            if (r7 != r5) goto L1e
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L24
            java.lang.String r7 = "UTF-8"
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L24
            goto L1f
        L1e:
            r5 = r3
        L1f:
            com.fyber.inneractive.sdk.util.u.a(r4)
            goto L32
        L23:
            r4 = r3
        L24:
            java.lang.String r5 = "readFileFromContext failed reading %s"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L62
            r6[r0] = r2     // Catch: java.lang.Throwable -> L62
            com.fyber.inneractive.sdk.util.IAlog.a(r5, r6)     // Catch: java.lang.Throwable -> L62
            com.fyber.inneractive.sdk.util.u.a(r4)
            r5 = r3
        L32:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L5c
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3f
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L3f
            r3 = r4
            goto L46
        L3f:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r4 = "Failed parsing SessionCache"
            com.fyber.inneractive.sdk.util.IAlog.e(r4, r0)
        L46:
            if (r3 == 0) goto L53
            android.os.Handler r0 = com.fyber.inneractive.sdk.util.q.b
            com.fyber.inneractive.sdk.cache.session.b$a r1 = new com.fyber.inneractive.sdk.cache.session.b$a
            r1.<init>(r3)
            r0.post(r1)
            goto L61
        L53:
            r1.deleteFile(r2)
            com.fyber.inneractive.sdk.cache.session.d r0 = r8.a
            r0.getClass()
            goto L61
        L5c:
            com.fyber.inneractive.sdk.cache.session.d r0 = r8.a
            r0.getClass()
        L61:
            return
        L62:
            r0 = move-exception
            com.fyber.inneractive.sdk.util.u.a(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.cache.session.b.run():void");
    }
}
