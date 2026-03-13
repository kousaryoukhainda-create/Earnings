package defpackage;

import androidx.annotation.NonNull;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Yu  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0777Yu {
    public static final EnumC0777Yu b;
    public static final EnumC0777Yu c;
    public static final /* synthetic */ EnumC0777Yu[] d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, Yu] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Yu] */
    static {
        ?? r2 = new Enum("GRANTED", 0);
        b = r2;
        ?? r3 = new Enum("DENIED", 1);
        c = r3;
        d = new EnumC0777Yu[]{r2, r3};
    }

    @NonNull
    public static EnumC0777Yu valueOf(@NonNull String str) {
        return (EnumC0777Yu) Enum.valueOf(EnumC0777Yu.class, str);
    }

    @NonNull
    public static EnumC0777Yu[] values() {
        return (EnumC0777Yu[]) d.clone();
    }
}
