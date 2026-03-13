package defpackage;

import androidx.annotation.NonNull;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Zu  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0803Zu {
    public static final EnumC0803Zu b;
    public static final EnumC0803Zu c;
    public static final EnumC0803Zu d;
    public static final EnumC0803Zu f;
    public static final /* synthetic */ EnumC0803Zu[] g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, Zu] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Zu] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, Zu] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Zu] */
    static {
        ?? r4 = new Enum("AD_STORAGE", 0);
        b = r4;
        ?? r5 = new Enum("ANALYTICS_STORAGE", 1);
        c = r5;
        ?? r6 = new Enum("AD_USER_DATA", 2);
        d = r6;
        ?? r7 = new Enum("AD_PERSONALIZATION", 3);
        f = r7;
        g = new EnumC0803Zu[]{r4, r5, r6, r7};
    }

    @NonNull
    public static EnumC0803Zu valueOf(@NonNull String str) {
        return (EnumC0803Zu) Enum.valueOf(EnumC0803Zu.class, str);
    }

    @NonNull
    public static EnumC0803Zu[] values() {
        return (EnumC0803Zu[]) g.clone();
    }
}
