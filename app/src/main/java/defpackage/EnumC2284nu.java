package defpackage;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF6 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: nu  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2284nu {
    public static final EnumC2284nu c;
    public static final EnumC2284nu d;
    public static final EnumC2284nu[] f;
    public static final /* synthetic */ EnumC2284nu[] g;
    public final int b;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC2284nu EF6;

    static {
        UE ue = UE.DOUBLE;
        EnumC2284nu enumC2284nu = new EnumC2284nu("DOUBLE", 0, 0, 1, ue);
        UE ue2 = UE.FLOAT;
        EnumC2284nu enumC2284nu2 = new EnumC2284nu("FLOAT", 1, 1, 1, ue2);
        UE ue3 = UE.LONG;
        EnumC2284nu enumC2284nu3 = new EnumC2284nu("INT64", 2, 2, 1, ue3);
        EnumC2284nu enumC2284nu4 = new EnumC2284nu("UINT64", 3, 3, 1, ue3);
        UE ue4 = UE.INT;
        EnumC2284nu enumC2284nu5 = new EnumC2284nu("INT32", 4, 4, 1, ue4);
        EnumC2284nu enumC2284nu6 = new EnumC2284nu("FIXED64", 5, 5, 1, ue3);
        EnumC2284nu enumC2284nu7 = new EnumC2284nu("FIXED32", 6, 6, 1, ue4);
        UE ue5 = UE.BOOLEAN;
        EnumC2284nu enumC2284nu8 = new EnumC2284nu("BOOL", 7, 7, 1, ue5);
        UE ue6 = UE.STRING;
        EnumC2284nu enumC2284nu9 = new EnumC2284nu("STRING", 8, 8, 1, ue6);
        UE ue7 = UE.MESSAGE;
        EnumC2284nu enumC2284nu10 = new EnumC2284nu("MESSAGE", 9, 9, 1, ue7);
        UE ue8 = UE.BYTE_STRING;
        EnumC2284nu enumC2284nu11 = new EnumC2284nu("BYTES", 10, 10, 1, ue8);
        EnumC2284nu enumC2284nu12 = new EnumC2284nu("UINT32", 11, 11, 1, ue4);
        UE ue9 = UE.ENUM;
        EnumC2284nu enumC2284nu13 = new EnumC2284nu("ENUM", 12, 12, 1, ue9);
        EnumC2284nu enumC2284nu14 = new EnumC2284nu("SFIXED32", 13, 13, 1, ue4);
        EnumC2284nu enumC2284nu15 = new EnumC2284nu("SFIXED64", 14, 14, 1, ue3);
        EnumC2284nu enumC2284nu16 = new EnumC2284nu("SINT32", 15, 15, 1, ue4);
        EnumC2284nu enumC2284nu17 = new EnumC2284nu("SINT64", 16, 16, 1, ue3);
        EnumC2284nu enumC2284nu18 = new EnumC2284nu("GROUP", 17, 17, 1, ue7);
        EnumC2284nu enumC2284nu19 = new EnumC2284nu("DOUBLE_LIST", 18, 18, 2, ue);
        EnumC2284nu enumC2284nu20 = new EnumC2284nu("FLOAT_LIST", 19, 19, 2, ue2);
        EnumC2284nu enumC2284nu21 = new EnumC2284nu("INT64_LIST", 20, 20, 2, ue3);
        EnumC2284nu enumC2284nu22 = new EnumC2284nu("UINT64_LIST", 21, 21, 2, ue3);
        EnumC2284nu enumC2284nu23 = new EnumC2284nu("INT32_LIST", 22, 22, 2, ue4);
        EnumC2284nu enumC2284nu24 = new EnumC2284nu("FIXED64_LIST", 23, 23, 2, ue3);
        EnumC2284nu enumC2284nu25 = new EnumC2284nu("FIXED32_LIST", 24, 24, 2, ue4);
        EnumC2284nu enumC2284nu26 = new EnumC2284nu("BOOL_LIST", 25, 25, 2, ue5);
        EnumC2284nu enumC2284nu27 = new EnumC2284nu("STRING_LIST", 26, 26, 2, ue6);
        EnumC2284nu enumC2284nu28 = new EnumC2284nu("MESSAGE_LIST", 27, 27, 2, ue7);
        EnumC2284nu enumC2284nu29 = new EnumC2284nu("BYTES_LIST", 28, 28, 2, ue8);
        EnumC2284nu enumC2284nu30 = new EnumC2284nu("UINT32_LIST", 29, 29, 2, ue4);
        EnumC2284nu enumC2284nu31 = new EnumC2284nu("ENUM_LIST", 30, 30, 2, ue9);
        EnumC2284nu enumC2284nu32 = new EnumC2284nu("SFIXED32_LIST", 31, 31, 2, ue4);
        EnumC2284nu enumC2284nu33 = new EnumC2284nu("SFIXED64_LIST", 32, 32, 2, ue3);
        EnumC2284nu enumC2284nu34 = new EnumC2284nu("SINT32_LIST", 33, 33, 2, ue4);
        EnumC2284nu enumC2284nu35 = new EnumC2284nu("SINT64_LIST", 34, 34, 2, ue3);
        EnumC2284nu enumC2284nu36 = new EnumC2284nu("DOUBLE_LIST_PACKED", 35, 35, 3, ue);
        c = enumC2284nu36;
        EnumC2284nu enumC2284nu37 = new EnumC2284nu("FLOAT_LIST_PACKED", 36, 36, 3, ue2);
        EnumC2284nu enumC2284nu38 = new EnumC2284nu("INT64_LIST_PACKED", 37, 37, 3, ue3);
        EnumC2284nu enumC2284nu39 = new EnumC2284nu("UINT64_LIST_PACKED", 38, 38, 3, ue3);
        EnumC2284nu enumC2284nu40 = new EnumC2284nu("INT32_LIST_PACKED", 39, 39, 3, ue4);
        EnumC2284nu enumC2284nu41 = new EnumC2284nu("FIXED64_LIST_PACKED", 40, 40, 3, ue3);
        EnumC2284nu enumC2284nu42 = new EnumC2284nu("FIXED32_LIST_PACKED", 41, 41, 3, ue4);
        EnumC2284nu enumC2284nu43 = new EnumC2284nu("BOOL_LIST_PACKED", 42, 42, 3, ue5);
        EnumC2284nu enumC2284nu44 = new EnumC2284nu("UINT32_LIST_PACKED", 43, 43, 3, ue4);
        EnumC2284nu enumC2284nu45 = new EnumC2284nu("ENUM_LIST_PACKED", 44, 44, 3, ue9);
        EnumC2284nu enumC2284nu46 = new EnumC2284nu("SFIXED32_LIST_PACKED", 45, 45, 3, ue4);
        EnumC2284nu enumC2284nu47 = new EnumC2284nu("SFIXED64_LIST_PACKED", 46, 46, 3, ue3);
        EnumC2284nu enumC2284nu48 = new EnumC2284nu("SINT32_LIST_PACKED", 47, 47, 3, ue4);
        EnumC2284nu enumC2284nu49 = new EnumC2284nu("SINT64_LIST_PACKED", 48, 48, 3, ue3);
        d = enumC2284nu49;
        g = new EnumC2284nu[]{enumC2284nu, enumC2284nu2, enumC2284nu3, enumC2284nu4, enumC2284nu5, enumC2284nu6, enumC2284nu7, enumC2284nu8, enumC2284nu9, enumC2284nu10, enumC2284nu11, enumC2284nu12, enumC2284nu13, enumC2284nu14, enumC2284nu15, enumC2284nu16, enumC2284nu17, enumC2284nu18, enumC2284nu19, enumC2284nu20, enumC2284nu21, enumC2284nu22, enumC2284nu23, enumC2284nu24, enumC2284nu25, enumC2284nu26, enumC2284nu27, enumC2284nu28, enumC2284nu29, enumC2284nu30, enumC2284nu31, enumC2284nu32, enumC2284nu33, enumC2284nu34, enumC2284nu35, enumC2284nu36, enumC2284nu37, enumC2284nu38, enumC2284nu39, enumC2284nu40, enumC2284nu41, enumC2284nu42, enumC2284nu43, enumC2284nu44, enumC2284nu45, enumC2284nu46, enumC2284nu47, enumC2284nu48, enumC2284nu49, new EnumC2284nu("GROUP_LIST", 49, 49, 2, ue7), new EnumC2284nu("MAP", 50, 50, 4, UE.VOID)};
        EnumC2284nu[] values = values();
        f = new EnumC2284nu[values.length];
        for (EnumC2284nu enumC2284nu50 : values) {
            f[enumC2284nu50.b] = enumC2284nu50;
        }
    }

    public EnumC2284nu(String str, int i, int i2, int i3, UE ue) {
        this.b = i2;
        int A = AbstractC0324Hi.A(i3);
        if (A != 1) {
            if (A == 3) {
                ue.getClass();
            }
        } else {
            ue.getClass();
        }
        if (i3 == 1) {
            ue.ordinal();
        }
    }

    public static EnumC2284nu valueOf(String str) {
        return (EnumC2284nu) Enum.valueOf(EnumC2284nu.class, str);
    }

    public static EnumC2284nu[] values() {
        return (EnumC2284nu[]) g.clone();
    }

    public final int e() {
        return this.b;
    }
}
