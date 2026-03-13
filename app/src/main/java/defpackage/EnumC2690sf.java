package defpackage;

import android.util.SparseArray;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: sf  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2690sf {
    public static final EnumC2690sf b;
    public static final /* synthetic */ EnumC2690sf[] c;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC2690sf EF2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [sf, java.lang.Enum, java.lang.Object] */
    static {
        Enum r2 = new Enum("NOT_SET", 0);
        ?? r3 = new Enum("EVENT_OVERRIDE", 1);
        b = r3;
        c = new EnumC2690sf[]{r2, r3};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r2);
        sparseArray.put(5, r3);
    }

    public static EnumC2690sf valueOf(String str) {
        return (EnumC2690sf) Enum.valueOf(EnumC2690sf.class, str);
    }

    public static EnumC2690sf[] values() {
        return (EnumC2690sf[]) c.clone();
    }
}
