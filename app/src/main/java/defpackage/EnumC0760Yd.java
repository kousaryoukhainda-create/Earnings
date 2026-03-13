package defpackage;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Yd  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0760Yd {
    public static final EnumC0760Yd b;
    public static final /* synthetic */ EnumC0760Yd[] c;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC0760Yd EF2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Yd] */
    static {
        Enum r2 = new Enum(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        ?? r3 = new Enum("ANDROID_FIREBASE", 1);
        b = r3;
        c = new EnumC0760Yd[]{r2, r3};
    }

    public static EnumC0760Yd valueOf(String str) {
        return (EnumC0760Yd) Enum.valueOf(EnumC0760Yd.class, str);
    }

    public static EnumC0760Yd[] values() {
        return (EnumC0760Yd[]) c.clone();
    }
}
