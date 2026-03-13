package defpackage;
/* renamed from: ml0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2188ml0 extends RuntimeException {
    public final int b;

    public C2188ml0(int i, String str) {
        super(str);
        this.b = i;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        StringBuilder b = Ki0.b("statusCode:");
        b.append(this.b);
        b.append(", message: ");
        b.append(getMessage());
        return b.toString();
    }

    public C2188ml0(int i, String str, Throwable th) {
        super(str, th);
        this.b = i;
    }

    public C2188ml0(int i, Exception exc) {
        super(exc);
        this.b = i;
    }
}
