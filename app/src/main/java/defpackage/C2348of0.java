package defpackage;
/* renamed from: of0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2348of0 {
    public static final C2348of0 b = new C2348of0();
    public static final int c;
    public static final int d;
    public final ExecutorC0149Ap a = new ExecutorC0149Ap(1);

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        c = availableProcessors + 1;
        d = (availableProcessors * 2) + 1;
    }
}
