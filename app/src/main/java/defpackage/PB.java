package defpackage;

import androidx.media3.common.DrmInitData;
import java.util.List;
/* renamed from: PB  reason: default package */
/* loaded from: classes.dex */
public final class PB extends QB {
    public final String n;
    public final AbstractC2571rD o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PB(long j, String str, String str2, long j2, String str3) {
        this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, FV.g);
        C2400pD c2400pD = AbstractC2571rD.c;
    }

    public PB(String str, PB pb, String str2, long j, int i, long j2, DrmInitData drmInitData, String str3, String str4, long j3, long j4, boolean z, List list) {
        super(str, pb, j, i, j2, drmInitData, str3, str4, j3, j4, z);
        this.n = str2;
        this.o = AbstractC2571rD.r(list);
    }
}
