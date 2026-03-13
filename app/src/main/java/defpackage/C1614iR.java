package defpackage;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Objects;
/* renamed from: iR  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1614iR {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    /* JADX WARN: Type inference failed for: r5v1, types: [iR, java.lang.Object] */
    public static C1614iR a(Bundle bundle) {
        IconCompat iconCompat;
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        if (bundle2 != null) {
            iconCompat = IconCompat.a(bundle2);
        } else {
            iconCompat = null;
        }
        String string = bundle.getString("uri");
        String string2 = bundle.getString(Constants.KEY);
        boolean z = bundle.getBoolean("isBot");
        boolean z2 = bundle.getBoolean("isImportant");
        ?? obj = new Object();
        obj.a = charSequence;
        obj.b = iconCompat;
        obj.c = string;
        obj.d = string2;
        obj.e = z;
        obj.f = z2;
        return obj;
    }

    public final Bundle b() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        if (iconCompat != null) {
            bundle = iconCompat.k();
        } else {
            bundle = null;
        }
        bundle2.putBundle("icon", bundle);
        bundle2.putString("uri", this.c);
        bundle2.putString(Constants.KEY, this.d);
        bundle2.putBoolean("isBot", this.e);
        bundle2.putBoolean("isImportant", this.f);
        return bundle2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1614iR)) {
            return false;
        }
        C1614iR c1614iR = (C1614iR) obj;
        String str = this.d;
        String str2 = c1614iR.d;
        if (str == null && str2 == null) {
            if (!Objects.equals(Objects.toString(this.a), Objects.toString(c1614iR.a)) || !Objects.equals(this.c, c1614iR.c) || !Boolean.valueOf(this.e).equals(Boolean.valueOf(c1614iR.e)) || !Boolean.valueOf(this.f).equals(Boolean.valueOf(c1614iR.f))) {
                return false;
            }
            return true;
        }
        return Objects.equals(str, str2);
    }

    public final int hashCode() {
        String str = this.d;
        if (str != null) {
            return str.hashCode();
        }
        return Objects.hash(this.a, this.c, Boolean.valueOf(this.e), Boolean.valueOf(this.f));
    }
}
