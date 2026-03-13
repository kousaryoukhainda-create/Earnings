package com.fyber.fairbid.plugin.adtransparency;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class VersionNumber implements Comparable<VersionNumber> {
    @NotNull
    public static final Companion Companion;
    private static final DefaultScheme DEFAULT_SCHEME;
    private static final SchemeWithPatchVersion PATCH_SCHEME;
    @NotNull
    private static final VersionNumber UNKNOWN;
    private final int major;
    private final int micro;
    private final int minor;
    private final int patch;
    private final String qualifier;
    private final AbstractScheme scheme;

    @Metadata
    /* loaded from: classes.dex */
    public static abstract class AbstractScheme implements Scheme {
        private final int depth;

        @Metadata
        /* loaded from: classes.dex */
        public static final class Scanner {
            private int pos;
            @NotNull
            private final String str;

            public Scanner(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "str");
                this.str = str;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
                if (r2 < 0) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
                return false;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
                return true;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final boolean oneOf(char... r8) {
                /*
                    r7 = this;
                    java.lang.String r0 = "<this>"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                    lE r1 = new lE
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                    int r2 = r8.length
                    r3 = 1
                    int r2 = r2 - r3
                    r4 = 0
                    r1.<init>(r4, r2, r3)
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
                    m5 r2 = new m5
                    r5 = 1
                    r2.<init>(r1, r5)
                    com.fyber.fairbid.plugin.adtransparency.VersionNumber$AbstractScheme$Scanner$oneOf$1 r1 = new com.fyber.fairbid.plugin.adtransparency.VersionNumber$AbstractScheme$Scanner$oneOf$1
                    r1.<init>(r8)
                    Z70 r8 = defpackage.RZ.Z(r2, r1)
                    java.lang.String r1 = r7.str
                    int r2 = r7.pos
                    char r1 = r1.charAt(r2)
                    java.lang.Character r1 = java.lang.Character.valueOf(r1)
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
                    NZ r0 = r8.a
                    java.util.Iterator r0 = r0.iterator()
                    r2 = 0
                L3c:
                    boolean r5 = r0.hasNext()
                    if (r5 == 0) goto L5d
                    java.lang.Object r5 = r0.next()
                    kotlin.jvm.functions.Function1 r6 = r8.b
                    java.lang.Object r5 = r6.invoke(r5)
                    if (r2 < 0) goto L58
                    boolean r5 = r1.equals(r5)
                    if (r5 == 0) goto L55
                    goto L5e
                L55:
                    int r2 = r2 + 1
                    goto L3c
                L58:
                    defpackage.C0346Ie.e()
                    r8 = 0
                    throw r8
                L5d:
                    r2 = -1
                L5e:
                    if (r2 < 0) goto L61
                    goto L62
                L61:
                    r3 = 0
                L62:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.fyber.fairbid.plugin.adtransparency.VersionNumber.AbstractScheme.Scanner.oneOf(char[]):boolean");
            }

            public final int getPos() {
                return this.pos;
            }

            @NotNull
            public final String getStr() {
                return this.str;
            }

            public final boolean hasDigit() {
                if (this.pos < this.str.length() && Character.isDigit(this.str.charAt(this.pos))) {
                    return true;
                }
                return false;
            }

            public final boolean isEnd() {
                if (this.pos == this.str.length()) {
                    return true;
                }
                return false;
            }

            public final boolean isQualifier() {
                if (this.pos < this.str.length() - 1 && oneOf('.', '-')) {
                    return true;
                }
                return false;
            }

            public final boolean isSeparatorAndDigit(@NotNull char... separators) {
                Intrinsics.checkNotNullParameter(separators, "separators");
                if (this.pos < this.str.length() - 1 && oneOf(Arrays.copyOf(separators, separators.length)) && Character.isDigit(this.str.charAt(this.pos + 1))) {
                    return true;
                }
                return false;
            }

            public final String remainder() {
                if (this.pos == this.str.length()) {
                    return null;
                }
                String substring = this.str.substring(this.pos);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }

            public final int scanDigit() {
                int i = this.pos;
                while (hasDigit()) {
                    this.pos++;
                }
                String substring = this.str.substring(i, this.pos);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return Integer.parseInt(substring);
            }

            public final void setPos(int i) {
                this.pos = i;
            }

            public final void skipSeparator() {
                this.pos++;
            }
        }

        public AbstractScheme(int i) {
            this.depth = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
        @Override // com.fyber.fairbid.plugin.adtransparency.VersionNumber.Scheme
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.fyber.fairbid.plugin.adtransparency.VersionNumber parse(java.lang.String r9) {
            /*
                r8 = this;
                r0 = 1
                r1 = 0
                if (r9 == 0) goto L9c
                int r2 = r9.length()
                if (r2 != 0) goto Lc
                goto L9c
            Lc:
                com.fyber.fairbid.plugin.adtransparency.VersionNumber$AbstractScheme$Scanner r2 = new com.fyber.fairbid.plugin.adtransparency.VersionNumber$AbstractScheme$Scanner
                r2.<init>(r9)
                boolean r9 = r2.hasDigit()
                if (r9 != 0) goto L1e
                com.fyber.fairbid.plugin.adtransparency.VersionNumber$Companion r9 = com.fyber.fairbid.plugin.adtransparency.VersionNumber.Companion
                com.fyber.fairbid.plugin.adtransparency.VersionNumber r9 = r9.getUNKNOWN()
                return r9
            L1e:
                int r9 = r2.scanDigit()
                r3 = 46
                char[] r4 = new char[r0]
                r4[r1] = r3
                boolean r4 = r2.isSeparatorAndDigit(r4)
                if (r4 == 0) goto L66
                r2.skipSeparator()
                int r4 = r2.scanDigit()
                char[] r0 = new char[r0]
                r0[r1] = r3
                boolean r0 = r2.isSeparatorAndDigit(r0)
                if (r0 == 0) goto L64
                r2.skipSeparator()
                int r0 = r2.scanDigit()
                int r3 = r8.depth
                r5 = 3
                if (r3 <= r5) goto L61
                r3 = 2
                char[] r3 = new char[r3]
                r3 = {x00a4: FILL_ARRAY_DATA  , data: [46, 95} // fill-array
                boolean r3 = r2.isSeparatorAndDigit(r3)
                if (r3 == 0) goto L61
                r2.skipSeparator()
                int r1 = r2.scanDigit()
                r3 = r0
                r5 = r1
                goto L69
            L61:
                r3 = r0
            L62:
                r5 = 0
                goto L69
            L64:
                r3 = 0
                goto L62
            L66:
                r3 = 0
                r4 = 0
                goto L62
            L69:
                boolean r0 = r2.isEnd()
                if (r0 == 0) goto L7c
                com.fyber.fairbid.plugin.adtransparency.VersionNumber r7 = new com.fyber.fairbid.plugin.adtransparency.VersionNumber
                r6 = 0
                r0 = r7
                r1 = r9
                r2 = r4
                r4 = r5
                r5 = r6
                r6 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
            L7c:
                boolean r0 = r2.isQualifier()
                if (r0 == 0) goto L95
                r2.skipSeparator()
                com.fyber.fairbid.plugin.adtransparency.VersionNumber r7 = new com.fyber.fairbid.plugin.adtransparency.VersionNumber
                java.lang.String r6 = r2.remainder()
                r0 = r7
                r1 = r9
                r2 = r4
                r4 = r5
                r5 = r6
                r6 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
            L95:
                com.fyber.fairbid.plugin.adtransparency.VersionNumber$Companion r9 = com.fyber.fairbid.plugin.adtransparency.VersionNumber.Companion
                com.fyber.fairbid.plugin.adtransparency.VersionNumber r9 = r9.getUNKNOWN()
                return r9
            L9c:
                com.fyber.fairbid.plugin.adtransparency.VersionNumber$Companion r9 = com.fyber.fairbid.plugin.adtransparency.VersionNumber.Companion
                com.fyber.fairbid.plugin.adtransparency.VersionNumber r9 = r9.getUNKNOWN()
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.fairbid.plugin.adtransparency.VersionNumber.AbstractScheme.parse(java.lang.String):com.fyber.fairbid.plugin.adtransparency.VersionNumber");
        }
    }

    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ VersionNumber version$default(Companion companion, int i, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return companion.version(i, i2);
        }

        @NotNull
        public final VersionNumber getUNKNOWN() {
            return VersionNumber.UNKNOWN;
        }

        @NotNull
        public final VersionNumber parse(String str) {
            return VersionNumber.DEFAULT_SCHEME.parse(str);
        }

        @NotNull
        public final Scheme scheme() {
            return VersionNumber.DEFAULT_SCHEME;
        }

        @NotNull
        public final VersionNumber version(int i) {
            return version$default(this, i, 0, 2, null);
        }

        @NotNull
        public final Scheme withPatchNumber() {
            return VersionNumber.PATCH_SCHEME;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VersionNumber version(int i, int i2) {
            return new VersionNumber(i, i2, 0, 0, null, VersionNumber.DEFAULT_SCHEME);
        }
    }

    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultScheme extends AbstractScheme {
        @NotNull
        public static final Companion Companion = new Companion(null);
        private static final String VERSION_TEMPLATE = "%d.%d.%d%s";

        @Metadata
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public DefaultScheme() {
            super(3);
        }

        @Override // com.fyber.fairbid.plugin.adtransparency.VersionNumber.Scheme
        @NotNull
        public String format(@NotNull VersionNumber versionNumber) {
            String str;
            Intrinsics.checkNotNullParameter(versionNumber, "versionNumber");
            Integer valueOf = Integer.valueOf(versionNumber.getMajor());
            Integer valueOf2 = Integer.valueOf(versionNumber.getMinor());
            Integer valueOf3 = Integer.valueOf(versionNumber.getMicro());
            if (versionNumber.getQualifier() == null) {
                str = "";
            } else {
                str = "-" + versionNumber.getQualifier();
            }
            String format = String.format(VERSION_TEMPLATE, Arrays.copyOf(new Object[]{valueOf, valueOf2, valueOf3, str}, 4));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            return format;
        }
    }

    @Metadata
    /* loaded from: classes.dex */
    public interface Scheme {
        @NotNull
        String format(@NotNull VersionNumber versionNumber);

        @NotNull
        VersionNumber parse(String str);
    }

    @Metadata
    /* loaded from: classes.dex */
    public static final class SchemeWithPatchVersion extends AbstractScheme {
        @NotNull
        public static final Companion Companion = new Companion(null);
        private static final String VERSION_TEMPLATE = "%d.%d.%d.%d%s";

        @Metadata
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public SchemeWithPatchVersion() {
            super(4);
        }

        @Override // com.fyber.fairbid.plugin.adtransparency.VersionNumber.Scheme
        @NotNull
        public String format(@NotNull VersionNumber versionNumber) {
            String str;
            Intrinsics.checkNotNullParameter(versionNumber, "versionNumber");
            Integer valueOf = Integer.valueOf(versionNumber.getMajor());
            Integer valueOf2 = Integer.valueOf(versionNumber.getMinor());
            Integer valueOf3 = Integer.valueOf(versionNumber.getMicro());
            Integer valueOf4 = Integer.valueOf(versionNumber.getPatch());
            if (versionNumber.getQualifier() == null) {
                str = "";
            } else {
                str = "-" + versionNumber.getQualifier();
            }
            String format = String.format(VERSION_TEMPLATE, Arrays.copyOf(new Object[]{valueOf, valueOf2, valueOf3, valueOf4, str}, 5));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            return format;
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        DEFAULT_SCHEME = new DefaultScheme();
        PATCH_SCHEME = new SchemeWithPatchVersion();
        UNKNOWN = Companion.version$default(companion, 0, 0, 2, null);
    }

    public VersionNumber(int i, int i2, int i3, int i4, String str, @NotNull AbstractScheme scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        this.major = i;
        this.minor = i2;
        this.micro = i3;
        this.patch = i4;
        this.qualifier = str;
        this.scheme = scheme;
    }

    private final AbstractScheme component6() {
        return this.scheme;
    }

    public static /* synthetic */ VersionNumber copy$default(VersionNumber versionNumber, int i, int i2, int i3, int i4, String str, AbstractScheme abstractScheme, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = versionNumber.major;
        }
        if ((i5 & 2) != 0) {
            i2 = versionNumber.minor;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = versionNumber.micro;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = versionNumber.patch;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            str = versionNumber.qualifier;
        }
        String str2 = str;
        if ((i5 & 32) != 0) {
            abstractScheme = versionNumber.scheme;
        }
        return versionNumber.copy(i, i6, i7, i8, str2, abstractScheme);
    }

    @NotNull
    public static final VersionNumber parse(String str) {
        return Companion.parse(str);
    }

    private final String toLowerCase(String str) {
        Locale locale = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ENGLISH");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    public final int component1() {
        return this.major;
    }

    public final int component2() {
        return this.minor;
    }

    public final int component3() {
        return this.micro;
    }

    public final int component4() {
        return this.patch;
    }

    public final String component5() {
        return this.qualifier;
    }

    @NotNull
    public final VersionNumber copy(int i, int i2, int i3, int i4, String str, @NotNull AbstractScheme scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        return new VersionNumber(i, i2, i3, i4, str, scheme);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VersionNumber) {
                VersionNumber versionNumber = (VersionNumber) obj;
                return this.major == versionNumber.major && this.minor == versionNumber.minor && this.micro == versionNumber.micro && this.patch == versionNumber.patch && Intrinsics.a(this.qualifier, versionNumber.qualifier) && Intrinsics.a(this.scheme, versionNumber.scheme);
            }
            return false;
        }
        return true;
    }

    @NotNull
    public final VersionNumber getBaseVersion() {
        return new VersionNumber(this.major, this.minor, this.micro, this.patch, null, this.scheme);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMicro() {
        return this.micro;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public final String getQualifier() {
        return this.qualifier;
    }

    public int hashCode() {
        int i = ((((((this.major * 31) + this.minor) * 31) + this.micro) * 31) + this.patch) * 31;
        String str = this.qualifier;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        AbstractScheme abstractScheme = this.scheme;
        return hashCode + (abstractScheme != null ? abstractScheme.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return this.scheme.format(this);
    }

    public VersionNumber(int i, int i2, int i3, String str) {
        this(i, i2, i3, 0, str, DEFAULT_SCHEME);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull VersionNumber other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i = this.major;
        int i2 = other.major;
        if (i == i2 && (i = this.minor) == (i2 = other.minor) && (i = this.micro) == (i2 = other.micro)) {
            int i3 = this.patch;
            int i4 = other.patch;
            if (i3 != i4) {
                return i3 - i4;
            }
            return 0;
        }
        return i - i2;
    }

    public VersionNumber(int i, int i2, int i3, int i4, String str) {
        this(i, i2, i3, i4, str, PATCH_SCHEME);
    }
}
