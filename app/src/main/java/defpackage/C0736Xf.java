package defpackage;
/* renamed from: Xf  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0736Xf {
    public final C0710Wf a;

    public C0736Xf(C0710Wf c0710Wf) {
        this.a = c0710Wf;
    }

    public final void a() {
        try {
            ((C0736Xf) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(InterfaceC2340ob0.class).newInstance(this.a)).a();
        } catch (Exception e) {
            int i = C2254nb0.b;
            if (e instanceof C2254nb0) {
                throw ((C2254nb0) e);
            }
            throw new Exception(e);
        }
    }
}
