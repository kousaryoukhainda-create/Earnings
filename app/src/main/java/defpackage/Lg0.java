package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: Lg0  reason: default package */
/* loaded from: classes2.dex */
public final class Lg0 {
    public static final Lg0 b;
    public static final Lg0 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, Lg0] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Lg0] */
    static {
        ?? r5 = new Enum("FATAL", 0);
        b = r5;
        ?? r6 = new Enum("ERROR", 1);
        c = r6;
        AbstractC1281eb.u(new Lg0[]{r5, r6, new Enum("WARN", 2), new Enum("INFO", 3), new Enum("DEBUG", 4)});
    }

    @Override // java.lang.Enum
    public final String toString() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
