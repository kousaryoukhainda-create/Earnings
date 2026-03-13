package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
/* renamed from: pa  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2423pa {
    public static final C2741tB c = new C2741tB(C2423pa.class.getSimpleName(), 8);
    public C2337oa a;
    public Application b;

    public final synchronized boolean a(String str, String str2) {
        C2741tB c2741tB = c;
        c2741tB.a("addEvent: key: " + str + " value: " + str2);
        return this.a.c(str, str2);
    }

    public final synchronized long b() {
        long j;
        Application application = this.b;
        C2741tB c2741tB = Ka0.a;
        j = application.getSharedPreferences("batch_send_id", 0).getLong("sendId", 0L) + 1;
        SharedPreferences.Editor edit = application.getSharedPreferences("batch_send_id", 0).edit();
        edit.putLong("sendId", j);
        edit.commit();
        return j;
    }

    public final synchronized boolean c(String str, String str2) {
        C2741tB c2741tB = c;
        c2741tB.a("updateEvent: key: " + str + " value: " + str2);
        return this.a.f(str, str2);
    }
}
