package defpackage;

import com.google.android.gms.common.internal.Objects;
import io.flutter.plugins.firebase.auth.Constants;
/* renamed from: wE  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3002wE {
    public String a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3002wE)) {
            return false;
        }
        return Objects.equal(this.a, ((C3002wE) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(Constants.TOKEN, this.a).toString();
    }
}
