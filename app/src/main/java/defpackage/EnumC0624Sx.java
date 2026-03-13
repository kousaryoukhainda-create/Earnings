package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Sx  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0624Sx {
    public static final EnumC0624Sx b;
    public static final EnumC0624Sx c;
    public static final EnumC0624Sx d;
    public static final EnumC0624Sx f;
    public static final /* synthetic */ EnumC0624Sx[] g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, Sx] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Sx] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Sx] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Sx] */
    static {
        ?? r4 = new Enum("None", 0);
        b = r4;
        ?? r5 = new Enum("RequestingNotificationPermission", 1);
        c = r5;
        ?? r6 = new Enum("RequestingExactAlarmsPermission", 2);
        d = r6;
        ?? r7 = new Enum("RequestingFullScreenIntentPermission", 3);
        f = r7;
        g = new EnumC0624Sx[]{r4, r5, r6, r7};
    }

    public static EnumC0624Sx valueOf(String str) {
        return (EnumC0624Sx) Enum.valueOf(EnumC0624Sx.class, str);
    }

    public static EnumC0624Sx[] values() {
        return (EnumC0624Sx[]) g.clone();
    }
}
