package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: pJ  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2406pJ {
    public static final EnumC2406pJ b;
    public static final EnumC2406pJ c;
    public static final /* synthetic */ EnumC2406pJ[] d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, pJ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, pJ] */
    static {
        ?? r2 = new Enum("GENERIC_SHOW_ERROR", 0);
        b = r2;
        ?? r3 = new Enum("EXPIRED_AD_ERROR", 1);
        c = r3;
        d = new EnumC2406pJ[]{r2, r3};
    }

    public static EnumC2406pJ valueOf(String str) {
        return (EnumC2406pJ) Enum.valueOf(EnumC2406pJ.class, str);
    }

    public static EnumC2406pJ[] values() {
        return (EnumC2406pJ[]) d.clone();
    }
}
