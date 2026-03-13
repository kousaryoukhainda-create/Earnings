package defpackage;

import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: v00  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2893v00 {
    public final C3077x60 a;
    public final Ma0 b;
    public final String c;
    public int d;
    public C2292o00 e;

    public C2893v00(C3077x60 timeProvider, Ma0 uuidGenerator) {
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.a = timeProvider;
        this.b = uuidGenerator;
        this.c = a();
        this.d = -1;
    }

    public final String a() {
        this.b.getClass();
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
        String uuid = randomUUID.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "uuidGenerator.next().toString()");
        String lowerCase = D40.n(uuid, "-", "").toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
