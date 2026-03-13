package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
/* loaded from: classes.dex */
public final class r1 {
    public static final int a = a(1, 3);
    public static final int b = a(1, 4);
    public static final int c = a(2, 0);
    public static final int d = a(3, 2);

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[b.BYTES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[b.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[b.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[b.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum INT64 uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes.dex */
    public static class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BOOL;
        public static final b BYTES;
        public static final b DOUBLE;
        public static final b ENUM;
        public static final b FIXED32;
        public static final b FIXED64;
        public static final b FLOAT;
        public static final b GROUP;
        public static final b INT32;
        public static final b INT64;
        public static final b MESSAGE;
        public static final b SFIXED32;
        public static final b SFIXED64;
        public static final b SINT32;
        public static final b SINT64;
        public static final b STRING;
        public static final b UINT32;
        public static final b UINT64;
        private final c javaType;
        private final int wireType;

        /* loaded from: classes.dex */
        public enum a extends b {
            public a(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2, null);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.protobuf.r1$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum C0105b extends b {
            public C0105b(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2, null);
            }

            @Override // com.fyber.inneractive.sdk.protobuf.r1.b
            public boolean g() {
                return false;
            }
        }

        /* loaded from: classes.dex */
        public enum c extends b {
            public c(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2, null);
            }

            @Override // com.fyber.inneractive.sdk.protobuf.r1.b
            public boolean g() {
                return false;
            }
        }

        /* loaded from: classes.dex */
        public enum d extends b {
            public d(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2, null);
            }

            @Override // com.fyber.inneractive.sdk.protobuf.r1.b
            public boolean g() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            DOUBLE = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            FLOAT = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            INT64 = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            UINT64 = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            INT32 = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            FIXED64 = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            FIXED32 = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            BOOL = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            STRING = aVar;
            c cVar3 = c.MESSAGE;
            C0105b c0105b = new C0105b("GROUP", 9, cVar3, 3);
            GROUP = c0105b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            MESSAGE = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            BYTES = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            UINT32 = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            ENUM = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            SFIXED32 = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            SFIXED64 = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            SINT32 = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            SINT64 = bVar14;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0105b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public /* synthetic */ b(String str, int i, c cVar, int i2, a aVar) {
            this(str, i, cVar, i2);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public c e() {
            return this.javaType;
        }

        public int f() {
            return this.wireType;
        }

        public boolean g() {
            return !(this instanceof a);
        }

        public b(String str, int i, c cVar, int i2) {
            this.javaType = cVar;
            this.wireType = i2;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(i.b),
        ENUM(null),
        MESSAGE(null);
        
        private final Object defaultDefault;

        c(Object obj) {
            this.defaultDefault = obj;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static abstract class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d LAZY;
        public static final d LOOSE;
        public static final d STRICT;

        /* loaded from: classes.dex */
        public enum a extends d {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.fyber.inneractive.sdk.protobuf.r1.d
            public Object a(j jVar) throws IOException {
                return jVar.r();
            }
        }

        /* loaded from: classes.dex */
        public enum b extends d {
            public b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.fyber.inneractive.sdk.protobuf.r1.d
            public Object a(j jVar) throws IOException {
                return jVar.s();
            }
        }

        /* loaded from: classes.dex */
        public enum c extends d {
            public c(String str, int i) {
                super(str, i, null);
            }

            @Override // com.fyber.inneractive.sdk.protobuf.r1.d
            public Object a(j jVar) throws IOException {
                return jVar.e();
            }
        }

        static {
            a aVar = new a("LOOSE", 0);
            LOOSE = aVar;
            b bVar = new b("STRICT", 1);
            STRICT = bVar;
            c cVar = new c("LAZY", 2);
            LAZY = cVar;
            $VALUES = new d[]{aVar, bVar, cVar};
        }

        public d(String str, int i) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        public abstract Object a(j jVar) throws IOException;

        public /* synthetic */ d(String str, int i, a aVar) {
            this(str, i);
        }
    }

    public static int a(int i, int i2) {
        return (i << 3) | i2;
    }

    public static Object a(j jVar, b bVar, d dVar) throws IOException {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(jVar.f());
            case 2:
                return Float.valueOf(jVar.j());
            case 3:
                return Long.valueOf(jVar.l());
            case 4:
                return Long.valueOf(jVar.v());
            case 5:
                return Integer.valueOf(jVar.k());
            case 6:
                return Long.valueOf(jVar.i());
            case 7:
                return Integer.valueOf(jVar.h());
            case 8:
                return Boolean.valueOf(jVar.d());
            case 9:
                return jVar.e();
            case 10:
                return Integer.valueOf(jVar.u());
            case 11:
                return Integer.valueOf(jVar.n());
            case 12:
                return Long.valueOf(jVar.o());
            case 13:
                return Integer.valueOf(jVar.p());
            case 14:
                return Long.valueOf(jVar.q());
            case 15:
                return dVar.a(jVar);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
