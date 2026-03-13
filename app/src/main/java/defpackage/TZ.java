package defpackage;

import java.util.Iterator;
/* renamed from: TZ  reason: default package */
/* loaded from: classes2.dex */
public final class TZ implements Iterable, RF {
    public final /* synthetic */ C0771Yo b;

    public TZ(C0771Yo c0771Yo) {
        this.b = c0771Yo;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0745Xo(this.b);
    }
}
