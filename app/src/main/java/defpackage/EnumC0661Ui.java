package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Ui  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC0661Ui {
    public static final EnumC0661Ui b;
    public static final /* synthetic */ EnumC0661Ui[] c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, Ui] */
    static {
        ?? r3 = new Enum("COROUTINE_SUSPENDED", 0);
        b = r3;
        EnumC0661Ui[] enumC0661UiArr = {r3, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
        c = enumC0661UiArr;
        AbstractC1281eb.u(enumC0661UiArr);
    }

    public static EnumC0661Ui valueOf(String str) {
        return (EnumC0661Ui) Enum.valueOf(EnumC0661Ui.class, str);
    }

    public static EnumC0661Ui[] values() {
        return (EnumC0661Ui[]) c.clone();
    }
}
