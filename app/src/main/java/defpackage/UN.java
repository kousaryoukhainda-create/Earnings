package defpackage;

import android.util.SparseArray;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: UN  reason: default package */
/* loaded from: classes.dex */
public final class UN {
    public static final SparseArray b;
    public static final /* synthetic */ UN[] c;
    /* JADX INFO: Fake field, exist only in values array */
    UN EF5;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Enum r5 = new Enum("UNKNOWN_MOBILE_SUBTYPE", 0);
        Enum r6 = new Enum("GPRS", 1);
        Enum r4 = new Enum("EDGE", 2);
        Enum r3 = new Enum("UMTS", 3);
        Enum r2 = new Enum("CDMA", 4);
        Enum r1 = new Enum("EVDO_0", 5);
        Enum r0 = new Enum("EVDO_A", 6);
        Enum r15 = new Enum("RTT", 7);
        Enum r14 = new Enum("HSDPA", 8);
        Enum r13 = new Enum("HSUPA", 9);
        Enum r12 = new Enum("HSPA", 10);
        Enum r11 = new Enum("IDEN", 11);
        Enum r10 = new Enum("EVDO_B", 12);
        Enum r9 = new Enum("LTE", 13);
        Enum r8 = new Enum("EHRPD", 14);
        Enum r7 = new Enum("HSPAP", 15);
        Enum r82 = new Enum("GSM", 16);
        Enum r72 = new Enum("TD_SCDMA", 17);
        Enum r83 = new Enum("IWLAN", 18);
        Enum r73 = new Enum("LTE_CA", 19);
        c = new UN[]{r5, r6, r4, r3, r2, r1, r0, r15, r14, r13, r12, r11, r10, r9, r8, r7, r82, r72, r83, r73, new Enum("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        b = sparseArray;
        sparseArray.put(0, r5);
        sparseArray.put(1, r6);
        sparseArray.put(2, r4);
        sparseArray.put(3, r3);
        sparseArray.put(4, r2);
        sparseArray.put(5, r1);
        sparseArray.put(6, r0);
        sparseArray.put(7, r15);
        sparseArray.put(8, r14);
        sparseArray.put(9, r13);
        sparseArray.put(10, r12);
        sparseArray.put(11, r11);
        sparseArray.put(12, r10);
        sparseArray.put(13, r9);
        sparseArray.put(14, r8);
        sparseArray.put(15, r7);
        sparseArray.put(16, r82);
        sparseArray.put(17, r72);
        sparseArray.put(18, r83);
        sparseArray.put(19, r73);
    }

    public static UN valueOf(String str) {
        return (UN) Enum.valueOf(UN.class, str);
    }

    public static UN[] values() {
        return (UN[]) c.clone();
    }
}
