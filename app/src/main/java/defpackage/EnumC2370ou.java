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
/* renamed from: ou  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2370ou {
    public static final EnumC2370ou c;
    public static final EnumC2370ou d;
    public static final EnumC2370ou[] f;
    public static final /* synthetic */ EnumC2370ou[] g;
    public final int b;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC2370ou EF6;

    static {
        VE ve = VE.DOUBLE;
        EnumC2370ou enumC2370ou = new EnumC2370ou("DOUBLE", 0, 0, 1, ve);
        VE ve2 = VE.FLOAT;
        EnumC2370ou enumC2370ou2 = new EnumC2370ou("FLOAT", 1, 1, 1, ve2);
        VE ve3 = VE.LONG;
        EnumC2370ou enumC2370ou3 = new EnumC2370ou("INT64", 2, 2, 1, ve3);
        EnumC2370ou enumC2370ou4 = new EnumC2370ou("UINT64", 3, 3, 1, ve3);
        VE ve4 = VE.INT;
        EnumC2370ou enumC2370ou5 = new EnumC2370ou("INT32", 4, 4, 1, ve4);
        EnumC2370ou enumC2370ou6 = new EnumC2370ou("FIXED64", 5, 5, 1, ve3);
        EnumC2370ou enumC2370ou7 = new EnumC2370ou("FIXED32", 6, 6, 1, ve4);
        VE ve5 = VE.BOOLEAN;
        EnumC2370ou enumC2370ou8 = new EnumC2370ou("BOOL", 7, 7, 1, ve5);
        VE ve6 = VE.STRING;
        EnumC2370ou enumC2370ou9 = new EnumC2370ou("STRING", 8, 8, 1, ve6);
        VE ve7 = VE.MESSAGE;
        EnumC2370ou enumC2370ou10 = new EnumC2370ou("MESSAGE", 9, 9, 1, ve7);
        VE ve8 = VE.BYTE_STRING;
        EnumC2370ou enumC2370ou11 = new EnumC2370ou("BYTES", 10, 10, 1, ve8);
        EnumC2370ou enumC2370ou12 = new EnumC2370ou("UINT32", 11, 11, 1, ve4);
        VE ve9 = VE.ENUM;
        EnumC2370ou enumC2370ou13 = new EnumC2370ou("ENUM", 12, 12, 1, ve9);
        EnumC2370ou enumC2370ou14 = new EnumC2370ou("SFIXED32", 13, 13, 1, ve4);
        EnumC2370ou enumC2370ou15 = new EnumC2370ou("SFIXED64", 14, 14, 1, ve3);
        EnumC2370ou enumC2370ou16 = new EnumC2370ou("SINT32", 15, 15, 1, ve4);
        EnumC2370ou enumC2370ou17 = new EnumC2370ou("SINT64", 16, 16, 1, ve3);
        EnumC2370ou enumC2370ou18 = new EnumC2370ou("GROUP", 17, 17, 1, ve7);
        EnumC2370ou enumC2370ou19 = new EnumC2370ou("DOUBLE_LIST", 18, 18, 2, ve);
        EnumC2370ou enumC2370ou20 = new EnumC2370ou("FLOAT_LIST", 19, 19, 2, ve2);
        EnumC2370ou enumC2370ou21 = new EnumC2370ou("INT64_LIST", 20, 20, 2, ve3);
        EnumC2370ou enumC2370ou22 = new EnumC2370ou("UINT64_LIST", 21, 21, 2, ve3);
        EnumC2370ou enumC2370ou23 = new EnumC2370ou("INT32_LIST", 22, 22, 2, ve4);
        EnumC2370ou enumC2370ou24 = new EnumC2370ou("FIXED64_LIST", 23, 23, 2, ve3);
        EnumC2370ou enumC2370ou25 = new EnumC2370ou("FIXED32_LIST", 24, 24, 2, ve4);
        EnumC2370ou enumC2370ou26 = new EnumC2370ou("BOOL_LIST", 25, 25, 2, ve5);
        EnumC2370ou enumC2370ou27 = new EnumC2370ou("STRING_LIST", 26, 26, 2, ve6);
        EnumC2370ou enumC2370ou28 = new EnumC2370ou("MESSAGE_LIST", 27, 27, 2, ve7);
        EnumC2370ou enumC2370ou29 = new EnumC2370ou("BYTES_LIST", 28, 28, 2, ve8);
        EnumC2370ou enumC2370ou30 = new EnumC2370ou("UINT32_LIST", 29, 29, 2, ve4);
        EnumC2370ou enumC2370ou31 = new EnumC2370ou("ENUM_LIST", 30, 30, 2, ve9);
        EnumC2370ou enumC2370ou32 = new EnumC2370ou("SFIXED32_LIST", 31, 31, 2, ve4);
        EnumC2370ou enumC2370ou33 = new EnumC2370ou("SFIXED64_LIST", 32, 32, 2, ve3);
        EnumC2370ou enumC2370ou34 = new EnumC2370ou("SINT32_LIST", 33, 33, 2, ve4);
        EnumC2370ou enumC2370ou35 = new EnumC2370ou("SINT64_LIST", 34, 34, 2, ve3);
        EnumC2370ou enumC2370ou36 = new EnumC2370ou("DOUBLE_LIST_PACKED", 35, 35, 3, ve);
        c = enumC2370ou36;
        EnumC2370ou enumC2370ou37 = new EnumC2370ou("FLOAT_LIST_PACKED", 36, 36, 3, ve2);
        EnumC2370ou enumC2370ou38 = new EnumC2370ou("INT64_LIST_PACKED", 37, 37, 3, ve3);
        EnumC2370ou enumC2370ou39 = new EnumC2370ou("UINT64_LIST_PACKED", 38, 38, 3, ve3);
        EnumC2370ou enumC2370ou40 = new EnumC2370ou("INT32_LIST_PACKED", 39, 39, 3, ve4);
        EnumC2370ou enumC2370ou41 = new EnumC2370ou("FIXED64_LIST_PACKED", 40, 40, 3, ve3);
        EnumC2370ou enumC2370ou42 = new EnumC2370ou("FIXED32_LIST_PACKED", 41, 41, 3, ve4);
        EnumC2370ou enumC2370ou43 = new EnumC2370ou("BOOL_LIST_PACKED", 42, 42, 3, ve5);
        EnumC2370ou enumC2370ou44 = new EnumC2370ou("UINT32_LIST_PACKED", 43, 43, 3, ve4);
        EnumC2370ou enumC2370ou45 = new EnumC2370ou("ENUM_LIST_PACKED", 44, 44, 3, ve9);
        EnumC2370ou enumC2370ou46 = new EnumC2370ou("SFIXED32_LIST_PACKED", 45, 45, 3, ve4);
        EnumC2370ou enumC2370ou47 = new EnumC2370ou("SFIXED64_LIST_PACKED", 46, 46, 3, ve3);
        EnumC2370ou enumC2370ou48 = new EnumC2370ou("SINT32_LIST_PACKED", 47, 47, 3, ve4);
        EnumC2370ou enumC2370ou49 = new EnumC2370ou("SINT64_LIST_PACKED", 48, 48, 3, ve3);
        d = enumC2370ou49;
        g = new EnumC2370ou[]{enumC2370ou, enumC2370ou2, enumC2370ou3, enumC2370ou4, enumC2370ou5, enumC2370ou6, enumC2370ou7, enumC2370ou8, enumC2370ou9, enumC2370ou10, enumC2370ou11, enumC2370ou12, enumC2370ou13, enumC2370ou14, enumC2370ou15, enumC2370ou16, enumC2370ou17, enumC2370ou18, enumC2370ou19, enumC2370ou20, enumC2370ou21, enumC2370ou22, enumC2370ou23, enumC2370ou24, enumC2370ou25, enumC2370ou26, enumC2370ou27, enumC2370ou28, enumC2370ou29, enumC2370ou30, enumC2370ou31, enumC2370ou32, enumC2370ou33, enumC2370ou34, enumC2370ou35, enumC2370ou36, enumC2370ou37, enumC2370ou38, enumC2370ou39, enumC2370ou40, enumC2370ou41, enumC2370ou42, enumC2370ou43, enumC2370ou44, enumC2370ou45, enumC2370ou46, enumC2370ou47, enumC2370ou48, enumC2370ou49, new EnumC2370ou("GROUP_LIST", 49, 49, 2, ve7), new EnumC2370ou("MAP", 50, 50, 4, VE.VOID)};
        EnumC2370ou[] values = values();
        f = new EnumC2370ou[values.length];
        for (EnumC2370ou enumC2370ou50 : values) {
            f[enumC2370ou50.b] = enumC2370ou50;
        }
    }

    public EnumC2370ou(String str, int i, int i2, int i3, VE ve) {
        this.b = i2;
        int A = AbstractC0324Hi.A(i3);
        if (A != 1) {
            if (A == 3) {
                ve.getClass();
            }
        } else {
            ve.getClass();
        }
        if (i3 == 1) {
            ve.ordinal();
        }
    }

    public static EnumC2370ou valueOf(String str) {
        return (EnumC2370ou) Enum.valueOf(EnumC2370ou.class, str);
    }

    public static EnumC2370ou[] values() {
        return (EnumC2370ou[]) g.clone();
    }

    public final int e() {
        return this.b;
    }
}
