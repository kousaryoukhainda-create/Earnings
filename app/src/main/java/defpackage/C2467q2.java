package defpackage;
/* renamed from: q2  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2467q2 extends Exception {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2467q2(String str, int i) {
        super(str);
        this.b = i;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        switch (this.b) {
            case 0:
                return "AdjoeProtection: " + super.getMessage();
            default:
                return super.getMessage();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2467q2(String str, Throwable th) {
        super(str, th);
        this.b = 0;
    }
}
