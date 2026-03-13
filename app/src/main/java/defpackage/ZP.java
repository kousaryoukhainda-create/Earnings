package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: ZP  reason: default package */
/* loaded from: classes2.dex */
public final class ZP {
    public static final ZP b;
    public static final /* synthetic */ ZP[] c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, ZP] */
    static {
        Enum r2 = new Enum("SKIP", 0);
        ?? r3 = new Enum("TERMINATE", 1);
        b = r3;
        ZP[] zpArr = {r2, r3};
        c = zpArr;
        AbstractC1281eb.u(zpArr);
    }

    public static ZP valueOf(String str) {
        return (ZP) Enum.valueOf(ZP.class, str);
    }

    public static ZP[] values() {
        return (ZP[]) c.clone();
    }
}
