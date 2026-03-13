package defpackage;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* renamed from: r0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2548r0 {
    public static final String[] g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    public static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
    public final String a;
    public final String b;
    public final String c;
    public final Date d;
    public final long e;
    public final long f;

    public C2548r0(String str, String str2, String str3, Date date, long j, long j2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = date;
        this.e = j;
        this.f = j2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [I2, java.lang.Object] */
    public final I2 a() {
        ?? obj = new Object();
        obj.a = "frc";
        obj.m = this.d.getTime();
        obj.b = this.a;
        obj.c = this.b;
        String str = this.c;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        obj.d = str;
        obj.e = this.e;
        obj.j = this.f;
        return obj;
    }
}
