package defpackage;

import android.os.Build;
import java.util.Locale;
/* renamed from: kI  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1975kI {
    public static final C1975kI b = a(new Locale[0]);
    public final InterfaceC2147mI a;

    public C1975kI(InterfaceC2147mI interfaceC2147mI) {
        this.a = interfaceC2147mI;
    }

    public static C1975kI a(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C1975kI(new C2319oI(AbstractC1889jI.a(localeArr)));
        }
        return new C1975kI(new C2061lI(localeArr));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1975kI) {
            if (this.a.equals(((C1975kI) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
