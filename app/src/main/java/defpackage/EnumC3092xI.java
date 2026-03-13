package defpackage;
/* renamed from: xI  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC3092xI implements OT {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);
    
    public final int b;

    EnumC3092xI(int i) {
        this.b = i;
    }

    @Override // defpackage.OT
    public final int e() {
        return this.b;
    }
}
