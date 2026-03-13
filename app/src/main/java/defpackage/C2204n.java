package defpackage;

import java.util.concurrent.CancellationException;
/* renamed from: n  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2204n extends CancellationException {
    public final transient InterfaceC0675Uw b;

    public C2204n(InterfaceC0675Uw interfaceC0675Uw) {
        super("Flow was aborted, no more elements needed");
        this.b = interfaceC0675Uw;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
