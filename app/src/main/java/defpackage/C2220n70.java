package defpackage;

import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;
/* renamed from: n70  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2220n70 {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public C2220n70(String str, String str2) {
        String str3;
        if (str2 != null && str2.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        } else {
            str3 = str2;
        }
        if (str3 != null && d.matcher(str3).matches()) {
            this.a = str3;
            this.b = str;
            this.c = AbstractC0324Hi.g(str, "!", str2);
            return;
        }
        throw new IllegalArgumentException(AbstractC2437ph.h("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2220n70)) {
            return false;
        }
        C2220n70 c2220n70 = (C2220n70) obj;
        if (!this.a.equals(c2220n70.a) || !this.b.equals(c2220n70.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, this.a);
    }
}
