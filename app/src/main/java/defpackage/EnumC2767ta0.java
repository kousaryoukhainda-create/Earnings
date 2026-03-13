package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ta0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2767ta0 {
    public static final EnumC2767ta0 b;
    public static final EnumC2767ta0 c;
    public static final EnumC2767ta0 d;
    public static final EnumC2767ta0 f;
    public static final EnumC2767ta0 g;
    public static final /* synthetic */ EnumC2767ta0[] h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [ta0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [ta0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [ta0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [ta0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [ta0, java.lang.Enum] */
    static {
        ?? r5 = new Enum("single", 0);
        b = r5;
        ?? r6 = new Enum("relationship", 1);
        c = r6;
        ?? r7 = new Enum("married", 2);
        d = r7;
        ?? r8 = new Enum("divorced", 3);
        f = r8;
        ?? r9 = new Enum("engaged", 4);
        g = r9;
        h = new EnumC2767ta0[]{r5, r6, r7, r8, r9};
    }

    public static EnumC2767ta0 valueOf(String str) {
        return (EnumC2767ta0) Enum.valueOf(EnumC2767ta0.class, str);
    }

    public static EnumC2767ta0[] values() {
        return (EnumC2767ta0[]) h.clone();
    }
}
