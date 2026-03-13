package defpackage;
/* renamed from: w90  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2997w90 extends AbstractC0531Pi {
    public static final /* synthetic */ int d = 0;

    static {
        new AbstractC0531Pi();
    }

    @Override // defpackage.AbstractC0531Pi
    public final void e(InterfaceC0428Li interfaceC0428Li, Runnable runnable) {
        if (interfaceC0428Li.get(Ve0.c) == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        throw new ClassCastException();
    }

    @Override // defpackage.AbstractC0531Pi
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
