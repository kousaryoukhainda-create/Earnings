package defpackage;
/* renamed from: a20  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0815a20 extends Thread {
    public final /* synthetic */ C0549Qa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0815a20(C0549Qa c0549Qa) {
        super("ExoPlayer:SimpleDecoder");
        this.b = c0549Qa;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (this.b.h());
    }
}
