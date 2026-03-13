package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: Xc  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0733Xc extends C0759Yc {
    public final Throwable a;

    public C0733Xc(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0733Xc) {
            if (Intrinsics.a(this.a, ((C0733Xc) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.C0759Yc
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
