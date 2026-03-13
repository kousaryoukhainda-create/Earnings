package defpackage;
/* renamed from: ql  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2531ql implements InterfaceC1982kP {
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_DISABLED_REMOTE(4),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_SAMPLED(5);
    
    public final int b;

    EnumC2531ql(int i) {
        this.b = i;
    }

    @Override // defpackage.InterfaceC1982kP
    public final int e() {
        return this.b;
    }
}
