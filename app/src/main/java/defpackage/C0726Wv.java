package defpackage;
/* renamed from: Wv  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726Wv extends AbstractC1023cR {
    public static final Z2 b = Z2.d();
    public final Q4 a;

    public C0726Wv(Q4 q4) {
        this.a = q4;
    }

    @Override // defpackage.AbstractC1023cR
    public final boolean a() {
        Z2 z2 = b;
        Q4 q4 = this.a;
        if (q4 == null) {
            z2.f("ApplicationInfo is null");
        } else if (!q4.E()) {
            z2.f("GoogleAppId is null");
        } else if (!q4.C()) {
            z2.f("AppInstanceId is null");
        } else if (!q4.D()) {
            z2.f("ApplicationProcessState is null");
        } else if (q4.B()) {
            if (!q4.z().y()) {
                z2.f("AndroidAppInfo.packageName is null");
            } else if (!q4.z().z()) {
                z2.f("AndroidAppInfo.sdkVersion is null");
            } else {
                return true;
            }
        } else {
            return true;
        }
        z2.f("ApplicationInfo is invalid");
        return false;
    }
}
