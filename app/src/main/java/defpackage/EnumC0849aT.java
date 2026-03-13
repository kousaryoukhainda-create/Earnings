package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: aT  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0849aT {
    public static final EnumC0849aT b;
    public static final EnumC0849aT c;
    public static final EnumC0849aT d;
    public static final /* synthetic */ EnumC0849aT[] f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [aT, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aT, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [aT, java.lang.Enum] */
    static {
        ?? r3 = new Enum("DEFAULT", 0);
        b = r3;
        ?? r4 = new Enum("VERY_LOW", 1);
        c = r4;
        ?? r5 = new Enum("HIGHEST", 2);
        d = r5;
        f = new EnumC0849aT[]{r3, r4, r5};
    }

    public static EnumC0849aT valueOf(String str) {
        return (EnumC0849aT) Enum.valueOf(EnumC0849aT.class, str);
    }

    public static EnumC0849aT[] values() {
        return (EnumC0849aT[]) f.clone();
    }
}
