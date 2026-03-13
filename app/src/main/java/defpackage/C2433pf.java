package defpackage;
/* renamed from: pf  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2433pf implements InterfaceC2868ui {
    public static final C2433pf c = new C2433pf(0);
    public static final C2433pf d = new C2433pf(1);
    public final /* synthetic */ int b;

    public /* synthetic */ C2433pf(int i) {
        this.b = i;
    }

    @Override // defpackage.InterfaceC2868ui
    public final InterfaceC0428Li getContext() {
        switch (this.b) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return C2710sr.b;
        }
    }

    @Override // defpackage.InterfaceC2868ui
    public final void resumeWith(Object obj) {
        switch (this.b) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.b) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
