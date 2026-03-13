package defpackage;

import org.json.JSONObject;
/* renamed from: YX  reason: default package */
/* loaded from: classes2.dex */
public final class YX {
    public static final C2741tB d = new C2741tB(YX.class.getSimpleName(), 8);
    public final XX a;
    public final boolean b;
    public final C0780Yx c;

    public YX(JSONObject jSONObject) {
        this.b = false;
        try {
            if (jSONObject.has("admon_batching")) {
                this.a = new XX(jSONObject.getJSONObject("admon_batching"));
            } else {
                this.a = new XX(new JSONObject());
            }
            if (jSONObject.has("set_sdid_enabled")) {
                this.b = jSONObject.getBoolean("set_sdid_enabled");
            }
            if (jSONObject.has("resolve")) {
                this.c = new C0780Yx(jSONObject.getJSONObject("resolve"));
            } else {
                this.c = new C0780Yx(new JSONObject());
            }
        } catch (Throwable th) {
            C2741tB c2741tB = d;
            c2741tB.c("failed parsing remote configuration json with error: " + Ka0.c(th));
        }
    }

    public static YX a() {
        return new YX(new JSONObject());
    }

    public final String b() {
        C0780Yx c0780Yx = this.c;
        if (c0780Yx == null) {
            return a().b();
        }
        return c0780Yx.c;
    }

    public final boolean c() {
        XX xx = this.a;
        if (xx == null) {
            return a().c();
        }
        return xx.b;
    }

    public final boolean d() {
        XX xx = this.a;
        if (xx == null) {
            return a().d();
        }
        return xx.a;
    }

    public final JSONObject e() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("set_sdid_enabled", this.b);
            XX xx = this.a;
            if (xx != null) {
                jSONObject.put("admon_batching", xx.a());
            }
            C0780Yx c0780Yx = this.c;
            if (c0780Yx != null) {
                jSONObject.put("resolve", c0780Yx.g());
            }
            return jSONObject;
        } catch (Throwable th) {
            C2741tB c2741tB = d;
            c2741tB.c("failed to create json object with error: " + Ka0.c(th));
            return new JSONObject();
        }
    }
}
