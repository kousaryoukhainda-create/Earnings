package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DISTINCT uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: j$.util.stream.c3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC1739c3 {
    public static final EnumC1739c3 DISTINCT;
    public static final EnumC1739c3 ORDERED;
    public static final EnumC1739c3 SHORT_CIRCUIT;
    public static final EnumC1739c3 SIZED;
    public static final EnumC1739c3 SORTED;
    static final int f;
    static final int g;
    static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    static final int l;
    static final int m;
    static final int n;
    static final int o;
    static final int p;
    static final int q;
    static final int r;
    static final int s;
    static final int t;
    static final int u;
    private static final /* synthetic */ EnumC1739c3[] v;
    private final EnumMap a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public static EnumC1739c3 valueOf(String str) {
        return (EnumC1739c3) Enum.valueOf(EnumC1739c3.class, str);
    }

    public static EnumC1739c3[] values() {
        return (EnumC1739c3[]) v.clone();
    }

    static {
        EnumC1734b3 enumC1734b3 = EnumC1734b3.SPLITERATOR;
        C1729a3 y = y(enumC1734b3);
        EnumC1734b3 enumC1734b32 = EnumC1734b3.STREAM;
        y.a(enumC1734b32);
        EnumC1734b3 enumC1734b33 = EnumC1734b3.OP;
        y.a.put((EnumMap) enumC1734b33, (EnumC1734b3) 3);
        EnumC1739c3 enumC1739c3 = new EnumC1739c3("DISTINCT", 0, 0, y);
        DISTINCT = enumC1739c3;
        C1729a3 y2 = y(enumC1734b3);
        y2.a(enumC1734b32);
        y2.a.put((EnumMap) enumC1734b33, (EnumC1734b3) 3);
        EnumC1739c3 enumC1739c32 = new EnumC1739c3("SORTED", 1, 1, y2);
        SORTED = enumC1739c32;
        C1729a3 y3 = y(enumC1734b3);
        y3.a(enumC1734b32);
        EnumMap enumMap = y3.a;
        enumMap.put((EnumMap) enumC1734b33, (EnumC1734b3) 3);
        EnumC1734b3 enumC1734b34 = EnumC1734b3.TERMINAL_OP;
        enumMap.put((EnumMap) enumC1734b34, (EnumC1734b3) 2);
        EnumC1734b3 enumC1734b35 = EnumC1734b3.UPSTREAM_TERMINAL_OP;
        enumMap.put((EnumMap) enumC1734b35, (EnumC1734b3) 2);
        EnumC1739c3 enumC1739c33 = new EnumC1739c3("ORDERED", 2, 2, y3);
        ORDERED = enumC1739c33;
        C1729a3 y4 = y(enumC1734b3);
        y4.a(enumC1734b32);
        y4.a.put((EnumMap) enumC1734b33, (EnumC1734b3) 2);
        EnumC1739c3 enumC1739c34 = new EnumC1739c3("SIZED", 3, 3, y4);
        SIZED = enumC1739c34;
        C1729a3 y5 = y(enumC1734b33);
        y5.a(enumC1734b34);
        EnumC1739c3 enumC1739c35 = new EnumC1739c3("SHORT_CIRCUIT", 4, 12, y5);
        SHORT_CIRCUIT = enumC1739c35;
        v = new EnumC1739c3[]{enumC1739c3, enumC1739c32, enumC1739c33, enumC1739c34, enumC1739c35};
        f = n(enumC1734b3);
        g = n(enumC1734b32);
        h = n(enumC1734b33);
        n(enumC1734b34);
        n(enumC1734b35);
        int i2 = 0;
        for (EnumC1739c3 enumC1739c36 : values()) {
            i2 |= enumC1739c36.e;
        }
        i = i2;
        int i3 = g;
        j = i3;
        int i4 = i3 << 1;
        k = i4;
        l = i3 | i4;
        EnumC1739c3 enumC1739c37 = DISTINCT;
        m = enumC1739c37.c;
        n = enumC1739c37.d;
        EnumC1739c3 enumC1739c38 = SORTED;
        o = enumC1739c38.c;
        p = enumC1739c38.d;
        EnumC1739c3 enumC1739c39 = ORDERED;
        q = enumC1739c39.c;
        r = enumC1739c39.d;
        EnumC1739c3 enumC1739c310 = SIZED;
        s = enumC1739c310.c;
        t = enumC1739c310.d;
        u = SHORT_CIRCUIT.c;
    }

    private static C1729a3 y(EnumC1734b3 enumC1734b3) {
        C1729a3 c1729a3 = new C1729a3(new EnumMap(EnumC1734b3.class));
        c1729a3.a(enumC1734b3);
        return c1729a3;
    }

    private EnumC1739c3(String str, int i2, int i3, C1729a3 c1729a3) {
        EnumC1734b3[] values = EnumC1734b3.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            EnumMap enumMap = c1729a3.a;
            if (i4 < length) {
                Map.EL.a(enumMap, values[i4], 0);
                i4++;
            } else {
                this.a = enumMap;
                int i5 = i3 * 2;
                this.b = i5;
                this.c = 1 << i5;
                this.d = 2 << i5;
                this.e = 3 << i5;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean q(int i2) {
        return (i2 & this.e) == this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean u(int i2) {
        int i3 = this.e;
        return (i2 & i3) == i3;
    }

    private static int n(EnumC1734b3 enumC1734b3) {
        EnumC1739c3[] values;
        int i2 = 0;
        for (EnumC1739c3 enumC1739c3 : values()) {
            i2 |= ((Integer) enumC1739c3.a.get(enumC1734b3)).intValue() << enumC1739c3.b;
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(int i2, int i3) {
        int i4;
        if (i2 == 0) {
            i4 = i;
        } else {
            i4 = ~(((j & i2) << 1) | i2 | ((k & i2) >> 1));
        }
        return i2 | (i3 & i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int z(int i2) {
        return i2 & ((~i2) >> 1) & j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i2 = characteristics & 4;
        int i3 = f;
        return (i2 == 0 || spliterator.getComparator() == null) ? characteristics & i3 : characteristics & i3 & (-5);
    }
}
