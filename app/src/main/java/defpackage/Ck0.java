package defpackage;

import android.content.pm.PackageInfo;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* renamed from: Ck0  reason: default package */
/* loaded from: classes2.dex */
public final class Ck0 implements InterfaceC2092lg0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public Ck0(Bl0 provider) {
        String str;
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.a = provider.g;
        StringBuilder b = Ki0.b("production");
        Charset charset = Eg0.a;
        b.append("r".toUpperCase() + "elease");
        this.b = b.toString();
        this.c = provider.h;
        this.d = provider.i.toString();
        PackageInfo packageInfo = provider.j;
        if (packageInfo != null) {
            str = packageInfo.versionName;
        } else {
            str = null;
        }
        this.e = str;
        this.f = "production";
    }

    @Override // defpackage.InterfaceC2092lg0
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        String str = this.a;
        if (str != null) {
            jSONObject.put("device_app_hash", str);
        }
        String str2 = this.b;
        if (str2 != null) {
            jSONObject.put("build_type", str2);
        }
        String str3 = this.c;
        if (str3 != null) {
            jSONObject.put("app_identifier", str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            jSONObject.put("app_name", str4);
        }
        String str5 = this.e;
        if (str5 != null) {
            jSONObject.put("app_version", str5);
        }
        String str6 = this.f;
        if (str6 != null) {
            jSONObject.put("app_build", str6);
        }
        return jSONObject;
    }
}
