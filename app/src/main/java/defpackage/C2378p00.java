package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: p00  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2378p00 {
    public final C3065x00 a;
    public final P4 b;

    public C2378p00(C3065x00 sessionData, P4 applicationInfo) {
        EnumC1653is eventType = EnumC1653is.SESSION_START;
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        this.a = sessionData;
        this.b = applicationInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2378p00)) {
            return false;
        }
        C2378p00 c2378p00 = (C2378p00) obj;
        c2378p00.getClass();
        if (this.a.equals(c2378p00.a) && this.b.equals(c2378p00.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        return this.b.hashCode() + ((hashCode + (EnumC1653is.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + EnumC1653is.SESSION_START + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
