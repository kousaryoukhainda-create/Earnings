package defpackage;
/* renamed from: sp  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2708sp extends RuntimeException {
    public final transient InterfaceC0428Li b;

    public C2708sp(InterfaceC0428Li interfaceC0428Li) {
        this.b = interfaceC0428Li;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.b.toString();
    }
}
