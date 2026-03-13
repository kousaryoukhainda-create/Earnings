package defpackage;

import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
/* renamed from: Ye0  reason: default package */
/* loaded from: classes2.dex */
public final class Ye0 extends AbstractC1431gG implements InterfaceC0652Tz {
    public final /* synthetic */ C2589rV h;
    public final /* synthetic */ long i;
    public final /* synthetic */ C2761tV j;
    public final /* synthetic */ QU k;
    public final /* synthetic */ C2761tV l;
    public final /* synthetic */ C2761tV m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ye0(C2589rV c2589rV, long j, C2761tV c2761tV, QU qu, C2761tV c2761tV2, C2761tV c2761tV3) {
        super(2);
        this.h = c2589rV;
        this.i = j;
        this.j = c2761tV;
        this.k = qu;
        this.l = c2761tV2;
        this.m = c2761tV3;
    }

    @Override // defpackage.InterfaceC0652Tz
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            C2589rV c2589rV = this.h;
            if (!c2589rV.b) {
                c2589rV.b = true;
                if (longValue >= this.i) {
                    C2761tV c2761tV = this.j;
                    long j2 = c2761tV.b;
                    QU qu = this.k;
                    if (j2 == KeyboardMap.kValueMask) {
                        j2 = qu.k();
                    }
                    c2761tV.b = j2;
                    C2761tV c2761tV2 = this.l;
                    long j3 = 0;
                    if (c2761tV2.b == KeyboardMap.kValueMask) {
                        j = qu.k();
                    } else {
                        j = 0;
                    }
                    c2761tV2.b = j;
                    C2761tV c2761tV3 = this.m;
                    if (c2761tV3.b == KeyboardMap.kValueMask) {
                        j3 = qu.k();
                    }
                    c2761tV3.b = j3;
                } else {
                    throw new IOException("bad zip: zip64 extra too short");
                }
            } else {
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }
        return B90.a;
    }
}
