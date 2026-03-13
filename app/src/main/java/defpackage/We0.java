package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: We0  reason: default package */
/* loaded from: classes2.dex */
public final class We0 {
    public final UQ a;
    public final boolean b;
    public final long c;
    public final Long d;
    public final long e;
    public final ArrayList f;

    public /* synthetic */ We0(UQ uq) {
        this(uq, true, "", -1L, -1L, -1, null, -1L);
    }

    public We0(UQ canonicalPath, boolean z, String comment, long j, long j2, int i, Long l, long j3) {
        Intrinsics.checkNotNullParameter(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.a = canonicalPath;
        this.b = z;
        this.c = j2;
        this.d = l;
        this.e = j3;
        this.f = new ArrayList();
    }
}
