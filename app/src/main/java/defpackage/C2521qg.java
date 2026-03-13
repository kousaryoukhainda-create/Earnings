package defpackage;

import j$.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: qg  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2521qg {
    public long a;
    public Object b;
    public Object c = new HashMap();
    public Object d;
    public Object e;
    public Object f;

    public C2521qg(String str) {
        this.b = str;
        DateTimeFormatter dateTimeFormatter = Kj0.a;
        this.a = System.currentTimeMillis();
        this.d = Lg0.c;
        this.f = new Exception(AbstractC0957bf.a("Error Report: ", str));
    }

    public void a(String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        ((HashMap) this.c).put(name, Integer.valueOf(i));
    }

    public void b(String name, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        ((HashMap) this.c).put(name, Long.valueOf(j));
    }

    public void c(String name, String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ((HashMap) this.c).put(name, value);
    }

    public void d(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        ((HashMap) this.c).put(name, Boolean.valueOf(z));
    }

    public void e() {
        try {
            Bg0 bg0 = (Bg0) AbstractC1930jl0.a.get();
            String tag = (String) this.b;
            if (bg0 == null) {
                AbstractC1930jl0.g(tag, "Error Report: " + ((String) this.e), (Throwable) this.f);
                return;
            }
            HashMap newFields = (HashMap) this.c;
            Intrinsics.checkNotNullParameter(newFields, "newFields");
            C3302zk c3302zk = new C3302zk(1);
            for (Map.Entry entry : newFields.entrySet()) {
                c3302zk.b((String) entry.getKey(), entry.getValue());
            }
            c3302zk.b("report.timestamp", Kj0.a(this.a));
            c3302zk.b("report.severity", ((Lg0) this.d).toString());
            Ok0 a = bg0.a(c3302zk);
            String message = "Error Report: " + ((String) this.e);
            Throwable th = (Throwable) this.f;
            Lg0 severity = (Lg0) this.d;
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(severity, "severity");
            a.b.d(tag, message, th, severity, a.a.b);
        } catch (Exception unused) {
        }
    }

    public C2606rg f() {
        return new C2606rg((JSONObject) this.b, (Date) this.d, (JSONArray) this.e, (JSONObject) this.c, this.a, (JSONArray) this.f);
    }
}
