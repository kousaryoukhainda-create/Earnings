package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONObject;
/* renamed from: e1  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1235e1 {
    public final /* synthetic */ int a;
    public String b;
    public String c;

    public /* synthetic */ C1235e1(String str, String str2, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return this.b + ", " + this.c;
            default:
                return super.toString();
        }
    }

    public C1235e1(int i) {
        this.a = i;
        switch (i) {
            case 3:
                return;
            default:
                this.b = "errorReading";
                this.c = "errorReading";
                return;
        }
    }

    public C1235e1(JSONObject jSONObject) {
        this.a = 6;
        this.b = jSONObject.getString("ClickUUID");
        this.c = jSONObject.getString("MarketLink");
    }

    public C1235e1(C0750Xt c0750Xt) {
        this.a = 1;
        int G = AbstractC0957bf.G((Context) c0750Xt.c, "com.google.firebase.crashlytics.unity_version", "string");
        Context context = (Context) c0750Xt.c;
        if (G != 0) {
            this.b = "Unity";
            String string = context.getResources().getString(G);
            this.c = string;
            String g = AbstractC2437ph.g("Unity Editor version is: ", string);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", g, null);
                return;
            }
            return;
        }
        if (context.getAssets() != null) {
            try {
                InputStream open = context.getAssets().open("flutter_assets/NOTICES.Z");
                if (open != null) {
                    open.close();
                }
                this.b = "Flutter";
                this.c = null;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Development platform is: Flutter", null);
                    return;
                }
                return;
            } catch (IOException unused) {
                this.b = null;
                this.c = null;
            }
        }
        this.b = null;
        this.c = null;
    }
}
