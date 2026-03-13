package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
/* renamed from: wq  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3053wq implements Comparable {
    public static final long c;
    public static final long d;
    public static final /* synthetic */ int f = 0;
    public final long b;

    static {
        int i = AbstractC3139xq.a;
        c = Long.MAX_VALUE;
        d = -9223372036854775805L;
    }

    public static final void a(StringBuilder sb, int i, int i2, int i3, String str) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String B = d.B(i3, String.valueOf(i2));
            int i4 = -1;
            int length = B.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (B.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (i6 < 3) {
                sb.append((CharSequence) B, 0, i6);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) B, 0, ((i4 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final boolean b(long j) {
        if (j != c && j != d) {
            return false;
        }
        return true;
    }

    public static final long c(long j, EnumC3225yq targetUnit) {
        EnumC3225yq sourceUnit;
        Intrinsics.checkNotNullParameter(targetUnit, "unit");
        if (j == c) {
            return Long.MAX_VALUE;
        }
        if (j == d) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            sourceUnit = EnumC3225yq.c;
        } else {
            sourceUnit = EnumC3225yq.d;
        }
        Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
        Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
        return targetUnit.b.convert(j2, sourceUnit.b);
    }

    public static String d(long j) {
        boolean z;
        boolean z2;
        int c2;
        boolean z3;
        int c3;
        int c4;
        long j2;
        int i;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i2;
        long j3 = j;
        int i3 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i3 == 0) {
            return "0s";
        }
        if (j3 == c) {
            return "Infinity";
        }
        if (j3 == d) {
            return "-Infinity";
        }
        if (i3 < 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (i3 < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            j3 = (((int) j3) & 1) + ((-(j3 >> 1)) << 1);
            int i4 = AbstractC3139xq.a;
        }
        long c5 = c(j3, EnumC3225yq.i);
        if (b(j3)) {
            c2 = 0;
        } else {
            c2 = (int) (c(j3, EnumC3225yq.h) % 24);
        }
        if (b(j3)) {
            z3 = z;
            c3 = 0;
        } else {
            z3 = z;
            c3 = (int) (c(j3, EnumC3225yq.g) % 60);
        }
        if (b(j3)) {
            c4 = 0;
        } else {
            c4 = (int) (c(j3, EnumC3225yq.f) % 60);
        }
        if (b(j3)) {
            i = 0;
        } else {
            if ((((int) j3) & 1) == 1) {
                j2 = ((j3 >> 1) % 1000) * 1000000;
            } else {
                j2 = (j3 >> 1) % 1000000000;
            }
            i = (int) j2;
        }
        if (c5 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c2 != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (c3 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (c4 == 0 && i == 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (z4) {
            sb.append(c5);
            sb.append('d');
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (z5 || (z4 && (z6 || z7))) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(c2);
            sb.append('h');
            i2 = i5;
        }
        if (z6 || (z7 && (z5 || z4))) {
            int i6 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(c3);
            sb.append('m');
            i2 = i6;
        }
        if (z7) {
            int i7 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (c4 == 0 && !z4 && !z5 && !z6) {
                if (i >= 1000000) {
                    a(sb, i / 1000000, i % 1000000, 6, "ms");
                } else if (i >= 1000) {
                    a(sb, i / 1000, i % 1000, 3, "us");
                } else {
                    sb.append(i);
                    sb.append("ns");
                }
            } else {
                a(sb, c4, i, 9, "s");
            }
            i2 = i7;
        }
        if (z3 && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((C3053wq) obj).b;
        long j2 = this.b;
        long j3 = j2 ^ j;
        int i = 1;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i2 = (((int) j2) & 1) - (1 & ((int) j));
            if (j2 < 0) {
                return -i2;
            }
            return i2;
        }
        int i3 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        if (i3 < 0) {
            i = -1;
        } else if (i3 == 0) {
            i = 0;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3053wq)) {
            return false;
        }
        if (this.b != ((C3053wq) obj).b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.b;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return d(this.b);
    }
}
