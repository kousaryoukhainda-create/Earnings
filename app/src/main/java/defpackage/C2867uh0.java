package defpackage;

import java.util.concurrent.FutureTask;
/* renamed from: uh0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2867uh0 extends FutureTask implements Comparable {
    public final RunnableC3125xh0 b;

    public C2867uh0(RunnableC3125xh0 runnableC3125xh0) {
        super(runnableC3125xh0, null);
        this.b = runnableC3125xh0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2867uh0 c2867uh0 = (C2867uh0) obj;
        if (c2867uh0 == null) {
            return -1;
        }
        return this.b.compareTo(c2867uh0.b);
    }

    public final String toString() {
        StringBuilder b = Ki0.b("FutureLoaderTask{loaderTask=");
        b.append(this.b);
        b.append('}');
        return b.toString();
    }
}
