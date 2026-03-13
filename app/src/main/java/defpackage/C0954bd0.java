package defpackage;
/* renamed from: bd0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0954bd0 extends F3 {
    @Override // defpackage.G3
    public final boolean b() {
        if (!super.b() || !AbstractC0957bf.P("MULTI_PROCESS")) {
            return false;
        }
        int i = Zc0.a;
        if (AbstractC1039cd0.f.b()) {
            return AbstractC1372fd0.a.getStatics().isMultiProcessEnabled();
        }
        throw AbstractC1039cd0.a();
    }
}
