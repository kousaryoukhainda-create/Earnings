package defpackage;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: qa0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2510qa0 {
    public static final EnumC2510qa0 b;
    public static final EnumC2510qa0 c;
    public static final EnumC2510qa0 d;
    public static final /* synthetic */ EnumC2510qa0[] f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [qa0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [qa0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [qa0, java.lang.Enum] */
    static {
        ?? r3 = new Enum("male", 0);
        b = r3;
        ?? r4 = new Enum("female", 1);
        c = r4;
        ?? r5 = new Enum(InneractiveMediationNameConsts.OTHER, 2);
        d = r5;
        f = new EnumC2510qa0[]{r3, r4, r5};
    }

    public static EnumC2510qa0 valueOf(String str) {
        return (EnumC2510qa0) Enum.valueOf(EnumC2510qa0.class, str);
    }

    public static EnumC2510qa0[] values() {
        return (EnumC2510qa0[]) f.clone();
    }
}
