package defpackage;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzan;
import java.util.HashMap;
import java.util.Set;
/* renamed from: p1  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2379p1 {
    public static final zzan d;
    public final String a;
    public final String b;
    public final String c;

    static {
        HashMap hashMap = new HashMap();
        AbstractC0324Hi.t(2, hashMap, "recoverEmail", 0, "resetPassword");
        AbstractC0324Hi.t(4, hashMap, "signIn", 1, "verifyEmail");
        AbstractC0324Hi.t(5, hashMap, "verifyBeforeChangeEmail", 6, "revertSecondFactorAddition");
        d = zzan.zza(hashMap);
    }

    public C2379p1(String str) {
        String a = a(str, "apiKey");
        String a2 = a(str, "oobCode");
        String a3 = a(str, "mode");
        if (a != null && a2 != null && a3 != null) {
            Preconditions.checkNotEmpty(a);
            this.a = Preconditions.checkNotEmpty(a2);
            this.b = Preconditions.checkNotEmpty(a3);
            a(str, "continueUrl");
            a(str, "lang");
            this.c = a(str, "tenantId");
            return;
        }
        throw new IllegalArgumentException("apiKey, oobCode and mode are required in a valid action code URL");
    }

    public static String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(Preconditions.checkNotEmpty(parse.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
