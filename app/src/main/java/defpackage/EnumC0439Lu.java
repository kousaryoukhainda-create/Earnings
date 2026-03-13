package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Lu  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0439Lu {
    public static final EnumC0439Lu b;
    public static final EnumC0439Lu c;
    public static final /* synthetic */ EnumC0439Lu[] d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, Lu] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Lu] */
    static {
        ?? r2 = new Enum("TOP_DOWN", 0);
        b = r2;
        ?? r3 = new Enum("BOTTOM_UP", 1);
        c = r3;
        EnumC0439Lu[] enumC0439LuArr = {r2, r3};
        d = enumC0439LuArr;
        AbstractC1281eb.u(enumC0439LuArr);
    }

    public static EnumC0439Lu valueOf(String str) {
        return (EnumC0439Lu) Enum.valueOf(EnumC0439Lu.class, str);
    }

    public static EnumC0439Lu[] values() {
        return (EnumC0439Lu[]) d.clone();
    }
}
