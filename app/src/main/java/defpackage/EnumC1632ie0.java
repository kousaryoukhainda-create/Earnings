package defpackage;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF12 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: ie0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class EnumC1632ie0 {
    public static final C0865ae0 d;
    public static final C1041ce0 f;
    public static final C1288ee0 g;
    public static final /* synthetic */ EnumC1632ie0[] h;
    public final EnumC2002ke0 b;
    public final int c;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC1632ie0 EF10;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC1632ie0 EF11;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC1632ie0 EF12;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [ie0, ae0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ee0, ie0] */
    /* JADX WARN: Type inference failed for: r8v2, types: [ie0, ce0] */
    static {
        EnumC1632ie0 enumC1632ie0 = new EnumC1632ie0("DOUBLE", 0, EnumC2002ke0.DOUBLE, 1);
        EnumC1632ie0 enumC1632ie02 = new EnumC1632ie0("FLOAT", 1, EnumC2002ke0.FLOAT, 5);
        EnumC2002ke0 enumC2002ke0 = EnumC2002ke0.LONG;
        EnumC1632ie0 enumC1632ie03 = new EnumC1632ie0("INT64", 2, enumC2002ke0, 0);
        EnumC1632ie0 enumC1632ie04 = new EnumC1632ie0("UINT64", 3, enumC2002ke0, 0);
        EnumC2002ke0 enumC2002ke02 = EnumC2002ke0.INT;
        EnumC1632ie0 enumC1632ie05 = new EnumC1632ie0("INT32", 4, enumC2002ke02, 0);
        EnumC1632ie0 enumC1632ie06 = new EnumC1632ie0("FIXED64", 5, enumC2002ke0, 1);
        EnumC1632ie0 enumC1632ie07 = new EnumC1632ie0("FIXED32", 6, enumC2002ke02, 5);
        EnumC1632ie0 enumC1632ie08 = new EnumC1632ie0("BOOL", 7, EnumC2002ke0.BOOLEAN, 0);
        ?? enumC1632ie09 = new EnumC1632ie0("STRING", 8, EnumC2002ke0.STRING, 2);
        d = enumC1632ie09;
        EnumC2002ke0 enumC2002ke03 = EnumC2002ke0.MESSAGE;
        ?? enumC1632ie010 = new EnumC1632ie0("GROUP", 9, enumC2002ke03, 3);
        f = enumC1632ie010;
        ?? enumC1632ie011 = new EnumC1632ie0("MESSAGE", 10, enumC2002ke03, 2);
        g = enumC1632ie011;
        h = new EnumC1632ie0[]{enumC1632ie0, enumC1632ie02, enumC1632ie03, enumC1632ie04, enumC1632ie05, enumC1632ie06, enumC1632ie07, enumC1632ie08, enumC1632ie09, enumC1632ie010, enumC1632ie011, new EnumC1632ie0("BYTES", 11, EnumC2002ke0.BYTE_STRING, 2), new EnumC1632ie0("UINT32", 12, enumC2002ke02, 0), new EnumC1632ie0("ENUM", 13, EnumC2002ke0.ENUM, 0), new EnumC1632ie0("SFIXED32", 14, enumC2002ke02, 5), new EnumC1632ie0("SFIXED64", 15, enumC2002ke0, 1), new EnumC1632ie0("SINT32", 16, enumC2002ke02, 0), new EnumC1632ie0("SINT64", 17, enumC2002ke0, 0)};
    }

    public EnumC1632ie0(String str, int i, EnumC2002ke0 enumC2002ke0, int i2) {
        this.b = enumC2002ke0;
        this.c = i2;
    }

    public static EnumC1632ie0 valueOf(String str) {
        return (EnumC1632ie0) Enum.valueOf(EnumC1632ie0.class, str);
    }

    public static EnumC1632ie0[] values() {
        return (EnumC1632ie0[]) h.clone();
    }
}
