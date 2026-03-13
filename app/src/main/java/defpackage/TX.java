package defpackage;

import java.util.HashMap;
/* renamed from: TX  reason: default package */
/* loaded from: classes2.dex */
public final class TX {
    public static final C2741tB a = new C2741tB(TX.class.getSimpleName(), 8);
    public static HashMap b;

    public static void a(String str, String str2, long j, long j2, String str3, long j3, long j4) {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put("referrer", str);
        b.put("referrer_source", str2);
        b.put("clickTimestampSeconds", Long.valueOf(j));
        b.put("installBeginTimestampSeconds", Long.valueOf(j2));
        HashMap hashMap2 = b;
        C2741tB c2741tB = Ka0.a;
        hashMap2.put("current_device_time", Long.valueOf(System.currentTimeMillis()));
        b.put("installVersion", str3);
        b.put("clickTimestampServerSeconds", Long.valueOf(j3));
        b.put("installBeginTimestampServerSeconds", Long.valueOf(j4));
    }
}
