package defpackage;

import android.content.Context;
/* renamed from: ak  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0876ak implements InterfaceC0438Lt {
    public final /* synthetic */ int b;
    public final XD c;

    public /* synthetic */ C0876ak(XD xd, int i) {
        this.b = i;
        this.c = xd;
    }

    @Override // defpackage.XT
    public final Object get() {
        switch (this.b) {
            case 0:
                return new C0792Zj((Context) this.c.b, new C0335Ht(22), new C1314ew(20));
            case 1:
                String packageName = ((Context) this.c.b).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new XY((Context) this.c.b, "com.google.android.datatransport.events", Integer.valueOf(XY.f).intValue());
        }
    }
}
