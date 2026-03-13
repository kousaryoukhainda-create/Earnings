package defpackage;

import android.util.SparseArray;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: fU  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1359fU {
    public static final EnumC1359fU b;
    public static final /* synthetic */ EnumC1359fU[] c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, java.lang.Object, fU] */
    static {
        ?? r6 = new Enum("DEFAULT", 0);
        b = r6;
        Enum r7 = new Enum("UNMETERED_ONLY", 1);
        Enum r8 = new Enum("UNMETERED_OR_DAILY", 2);
        Enum r9 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        Enum r10 = new Enum("NEVER", 4);
        Enum r11 = new Enum("UNRECOGNIZED", 5);
        c = new EnumC1359fU[]{r6, r7, r8, r9, r10, r11};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r6);
        sparseArray.put(1, r7);
        sparseArray.put(2, r8);
        sparseArray.put(3, r9);
        sparseArray.put(4, r10);
        sparseArray.put(-1, r11);
    }

    public static EnumC1359fU valueOf(String str) {
        return (EnumC1359fU) Enum.valueOf(EnumC1359fU.class, str);
    }

    public static EnumC1359fU[] values() {
        return (EnumC1359fU[]) c.clone();
    }
}
