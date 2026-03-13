package defpackage;

import android.net.Uri;
import android.text.TextUtils;
/* renamed from: VV  reason: default package */
/* loaded from: classes.dex */
public final class VV {
    public final String a;
    public final String b;
    public final String[] c;
    public final String d;
    public final String e;
    public final String[] f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final Uri n;
    public final String o;
    public final Integer p;
    public final Integer q;
    public final Integer r;

    public VV(Oc0 oc0) {
        String[] strArr;
        String[] strArr2;
        this.a = oc0.I("gcm.n.title");
        this.b = oc0.E("gcm.n.title");
        Object[] D = oc0.D("gcm.n.title");
        if (D == null) {
            strArr = null;
        } else {
            strArr = new String[D.length];
            for (int i = 0; i < D.length; i++) {
                strArr[i] = String.valueOf(D[i]);
            }
        }
        this.c = strArr;
        this.d = oc0.I("gcm.n.body");
        this.e = oc0.E("gcm.n.body");
        Object[] D2 = oc0.D("gcm.n.body");
        if (D2 == null) {
            strArr2 = null;
        } else {
            strArr2 = new String[D2.length];
            for (int i2 = 0; i2 < D2.length; i2++) {
                strArr2[i2] = String.valueOf(D2[i2]);
            }
        }
        this.f = strArr2;
        this.g = oc0.I("gcm.n.icon");
        String I = oc0.I("gcm.n.sound2");
        this.i = TextUtils.isEmpty(I) ? oc0.I("gcm.n.sound") : I;
        this.j = oc0.I("gcm.n.tag");
        this.k = oc0.I("gcm.n.color");
        this.l = oc0.I("gcm.n.click_action");
        this.m = oc0.I("gcm.n.android_channel_id");
        String I2 = oc0.I("gcm.n.link_android");
        I2 = TextUtils.isEmpty(I2) ? oc0.I("gcm.n.link") : I2;
        this.n = TextUtils.isEmpty(I2) ? null : Uri.parse(I2);
        this.h = oc0.I("gcm.n.image");
        this.o = oc0.I("gcm.n.ticker");
        this.p = oc0.A("gcm.n.notification_priority");
        this.q = oc0.A("gcm.n.visibility");
        this.r = oc0.A("gcm.n.notification_count");
        oc0.y("gcm.n.sticky");
        oc0.y("gcm.n.local_only");
        oc0.y("gcm.n.default_sound");
        oc0.y("gcm.n.default_vibrate_timings");
        oc0.y("gcm.n.default_light_settings");
        oc0.F();
        oc0.C();
        oc0.J();
    }
}
