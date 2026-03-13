package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Uy  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0677Uy {
    public static final EnumC0677Uy b;
    public static final EnumC0677Uy c;
    public static final EnumC0677Uy d;
    public static final EnumC0677Uy f;
    public static final EnumC0677Uy g;
    public static final EnumC0677Uy h;
    public static final EnumC0677Uy i;
    public static final /* synthetic */ EnumC0677Uy[] j;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC0677Uy EF9;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, Uy] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, Uy] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, Uy] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, Uy] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, Uy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, Uy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, Uy] */
    static {
        Enum r9 = new Enum("PENALTY_LOG", 0);
        Enum r10 = new Enum("PENALTY_DEATH", 1);
        ?? r11 = new Enum("DETECT_FRAGMENT_REUSE", 2);
        b = r11;
        ?? r12 = new Enum("DETECT_FRAGMENT_TAG_USAGE", 3);
        c = r12;
        ?? r13 = new Enum("DETECT_WRONG_NESTED_HIERARCHY", 4);
        d = r13;
        ?? r14 = new Enum("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f = r14;
        ?? r15 = new Enum("DETECT_SET_USER_VISIBLE_HINT", 6);
        g = r15;
        ?? r3 = new Enum("DETECT_TARGET_FRAGMENT_USAGE", 7);
        h = r3;
        ?? r2 = new Enum("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        i = r2;
        j = new EnumC0677Uy[]{r9, r10, r11, r12, r13, r14, r15, r3, r2};
    }

    public static EnumC0677Uy valueOf(String str) {
        return (EnumC0677Uy) Enum.valueOf(EnumC0677Uy.class, str);
    }

    public static EnumC0677Uy[] values() {
        return (EnumC0677Uy[]) j.clone();
    }
}
