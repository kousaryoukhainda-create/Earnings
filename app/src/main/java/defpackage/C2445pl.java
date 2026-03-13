package defpackage;
/* renamed from: pl  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2445pl {
    public boolean a;

    public synchronized void a() {
        this.a = false;
    }

    public synchronized boolean b() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }
}
