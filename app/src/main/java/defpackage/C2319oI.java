package defpackage;

import android.os.LocaleList;
import java.util.Locale;
/* renamed from: oI  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2319oI implements InterfaceC2147mI {
    public final LocaleList a;

    public C2319oI(Object obj) {
        this.a = AbstractC2233nI.j(obj);
    }

    @Override // defpackage.InterfaceC2147mI
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.a.equals(((InterfaceC2147mI) obj).a());
        return equals;
    }

    @Override // defpackage.InterfaceC2147mI
    public final Locale get() {
        Locale locale;
        locale = this.a.get(0);
        return locale;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.a.hashCode();
        return hashCode;
    }

    @Override // defpackage.InterfaceC2147mI
    public final boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.a.isEmpty();
        return isEmpty;
    }

    public final String toString() {
        String localeList;
        localeList = this.a.toString();
        return localeList;
    }
}
