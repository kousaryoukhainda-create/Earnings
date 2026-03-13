package defpackage;
/* renamed from: vI  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2920vI implements InterfaceC1982kP {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);
    
    public final int b;

    EnumC2920vI(int i) {
        this.b = i;
    }

    @Override // defpackage.InterfaceC1982kP
    public final int e() {
        return this.b;
    }
}
