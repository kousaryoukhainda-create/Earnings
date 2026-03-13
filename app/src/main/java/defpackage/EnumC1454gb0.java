package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: gb0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1454gb0 {
    public static final EnumC1454gb0 b;
    public static final /* synthetic */ EnumC1454gb0[] c;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC1454gb0 EF3;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, gb0] */
    static {
        Enum r3 = new Enum("STRICT", 0);
        Enum r4 = new Enum("LOG", 1);
        ?? r5 = new Enum("QUIET", 2);
        b = r5;
        c = new EnumC1454gb0[]{r3, r4, r5};
    }

    public static EnumC1454gb0 valueOf(String str) {
        return (EnumC1454gb0) Enum.valueOf(EnumC1454gb0.class, str);
    }

    public static EnumC1454gb0[] values() {
        return (EnumC1454gb0[]) c.clone();
    }
}
