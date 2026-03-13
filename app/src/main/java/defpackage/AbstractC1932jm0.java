package defpackage;

import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import java.util.HashMap;
import java.util.Map;
/* renamed from: jm0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1932jm0 {
    public static final Logger a = new Logger("GetTokenResultFactory", new String[0]);

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, RA] */
    public static RA a(String str) {
        Map hashMap;
        try {
            hashMap = AbstractC1647im0.c(str);
        } catch (zzaag e) {
            a.e("Error parsing token claims", e, new Object[0]);
            hashMap = new HashMap();
        }
        ?? obj = new Object();
        obj.a = str;
        obj.b = hashMap;
        return obj;
    }
}
