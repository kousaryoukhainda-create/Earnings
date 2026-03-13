package defpackage;
/* renamed from: x  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3063x extends Throwable {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3063x(String str, int i) {
        super(str);
        this.b = i;
    }

    private final synchronized Throwable a() {
        return this;
    }

    private final synchronized Throwable b() {
        return this;
    }

    private final synchronized Throwable c() {
        return this;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.b) {
            case 0:
                a();
                return this;
            case 1:
                b();
                return this;
            default:
                c();
                return this;
        }
    }
}
