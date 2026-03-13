package defpackage;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum d uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: he0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class EnumC1546he0 {
    public static final EnumC1546he0 d;
    public static final Zd0 f;
    public static final C0956be0 g;
    public static final /* synthetic */ EnumC1546he0[] h;
    public final EnumC1916je0 b;
    public final int c;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC1546he0 EF10;
    /* JADX INFO: Fake field, exist only in values array */
    EnumC1546he0 EF11;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [he0, Zd0] */
    /* JADX WARN: Type inference failed for: r8v2, types: [he0, be0] */
    static {
        EnumC1546he0 enumC1546he0 = new EnumC1546he0("DOUBLE", 0, EnumC1916je0.DOUBLE, 1);
        EnumC1546he0 enumC1546he02 = new EnumC1546he0("FLOAT", 1, EnumC1916je0.FLOAT, 5);
        EnumC1916je0 enumC1916je0 = EnumC1916je0.LONG;
        EnumC1546he0 enumC1546he03 = new EnumC1546he0("INT64", 2, enumC1916je0, 0);
        d = enumC1546he03;
        EnumC1546he0 enumC1546he04 = new EnumC1546he0("UINT64", 3, enumC1916je0, 0);
        EnumC1916je0 enumC1916je02 = EnumC1916je0.INT;
        EnumC1546he0 enumC1546he05 = new EnumC1546he0("INT32", 4, enumC1916je02, 0);
        EnumC1546he0 enumC1546he06 = new EnumC1546he0("FIXED64", 5, enumC1916je0, 1);
        EnumC1546he0 enumC1546he07 = new EnumC1546he0("FIXED32", 6, enumC1916je02, 5);
        EnumC1546he0 enumC1546he08 = new EnumC1546he0("BOOL", 7, EnumC1916je0.BOOLEAN, 0);
        ?? enumC1546he09 = new EnumC1546he0("STRING", 8, EnumC1916je0.STRING, 2);
        f = enumC1546he09;
        EnumC1916je0 enumC1916je03 = EnumC1916je0.MESSAGE;
        ?? enumC1546he010 = new EnumC1546he0("GROUP", 9, enumC1916je03, 3);
        g = enumC1546he010;
        h = new EnumC1546he0[]{enumC1546he0, enumC1546he02, enumC1546he03, enumC1546he04, enumC1546he05, enumC1546he06, enumC1546he07, enumC1546he08, enumC1546he09, enumC1546he010, new EnumC1546he0("MESSAGE", 10, enumC1916je03, 2), new EnumC1546he0("BYTES", 11, EnumC1916je0.BYTE_STRING, 2), new EnumC1546he0("UINT32", 12, enumC1916je02, 0), new EnumC1546he0("ENUM", 13, EnumC1916je0.ENUM, 0), new EnumC1546he0("SFIXED32", 14, enumC1916je02, 5), new EnumC1546he0("SFIXED64", 15, enumC1916je0, 1), new EnumC1546he0("SINT32", 16, enumC1916je02, 0), new EnumC1546he0("SINT64", 17, enumC1916je0, 0)};
    }

    public EnumC1546he0(String str, int i, EnumC1916je0 enumC1916je0, int i2) {
        this.b = enumC1916je0;
        this.c = i2;
    }

    public static EnumC1546he0 valueOf(String str) {
        return (EnumC1546he0) Enum.valueOf(EnumC1546he0.class, str);
    }

    public static EnumC1546he0[] values() {
        return (EnumC1546he0[]) h.clone();
    }
}
