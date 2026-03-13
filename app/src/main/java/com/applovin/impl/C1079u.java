package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.impl.o2;
import java.util.ArrayList;
import java.util.Arrays;
/* renamed from: com.applovin.impl.u */
/* loaded from: classes.dex */
public final class C1079u implements o2 {
    public static final C1079u h = new C1079u(null, new a[0], 0, -9223372036854775807L, 0);
    private static final a i = new a(0).c(0);
    public static final o2.a j = new Fk0(4);
    public final Object a;
    public final int b;
    public final long c;
    public final long d;
    public final int f;
    private final a[] g;

    /* renamed from: com.applovin.impl.u$a */
    /* loaded from: classes.dex */
    public static final class a implements o2 {
        public static final o2.a i = new Fk0(5);
        public final long a;
        public final int b;
        public final Uri[] c;
        public final int[] d;
        public final long[] f;
        public final long g;
        public final boolean h;

        public a(long j) {
            this(j, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private static long[] a(long[] jArr, int i2) {
            int length = jArr.length;
            int max = Math.max(i2, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        public static /* synthetic */ a b(Bundle bundle) {
            return a(bundle);
        }

        public boolean c() {
            return this.b == -1 || a() < this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && Arrays.equals(this.c, aVar.c) && Arrays.equals(this.d, aVar.d) && Arrays.equals(this.f, aVar.f) && this.g == aVar.g && this.h == aVar.h) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            long j = this.a;
            int hashCode = Arrays.hashCode(this.d);
            int hashCode2 = Arrays.hashCode(this.f);
            long j2 = this.g;
            return ((((hashCode2 + ((hashCode + (((((this.b * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.c)) * 31)) * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.h ? 1 : 0);
        }

        private a(long j, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            b1.a(iArr.length == uriArr.length);
            this.a = j;
            this.b = i2;
            this.d = iArr;
            this.c = uriArr;
            this.f = jArr;
            this.g = j2;
            this.h = z;
        }

        public boolean b() {
            if (this.b == -1) {
                return true;
            }
            for (int i2 = 0; i2 < this.b; i2++) {
                int i3 = this.d[i2];
                if (i3 == 0 || i3 == 1) {
                    return true;
                }
            }
            return false;
        }

        public a c(int i2) {
            int[] a = a(this.d, i2);
            long[] a2 = a(this.f, i2);
            return new a(this.a, i2, a, (Uri[]) Arrays.copyOf(this.c, i2), a2, this.g, this.h);
        }

        private static int[] a(int[] iArr, int i2) {
            int length = iArr.length;
            int max = Math.max(i2, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        private static String b(int i2) {
            return Integer.toString(i2, 36);
        }

        public static a a(Bundle bundle) {
            long j = bundle.getLong(b(0));
            int i2 = bundle.getInt(b(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(2));
            int[] intArray = bundle.getIntArray(b(3));
            long[] longArray = bundle.getLongArray(b(4));
            long j2 = bundle.getLong(b(5));
            boolean z = bundle.getBoolean(b(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new a(j, i2, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j2, z);
        }

        public int a() {
            return a(-1);
        }

        public int a(int i2) {
            int i3;
            int i4 = i2 + 1;
            while (true) {
                int[] iArr = this.d;
                if (i4 >= iArr.length || this.h || (i3 = iArr[i4]) == 0 || i3 == 1) {
                    break;
                }
                i4++;
            }
            return i4;
        }
    }

    private C1079u(Object obj, a[] aVarArr, long j2, long j3, int i2) {
        this.a = obj;
        this.c = j2;
        this.d = j3;
        this.b = aVarArr.length + i2;
        this.g = aVarArr;
        this.f = i2;
    }

    public static C1079u a(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(b(1));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                aVarArr2[i2] = (a) a.i.a((Bundle) parcelableArrayList.get(i2));
            }
            aVarArr = aVarArr2;
        }
        return new C1079u(null, aVarArr, bundle.getLong(b(2), 0L), bundle.getLong(b(3), -9223372036854775807L), bundle.getInt(b(4)));
    }

    public static /* synthetic */ C1079u b(Bundle bundle) {
        return a(bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1079u.class != obj.getClass()) {
            return false;
        }
        C1079u c1079u = (C1079u) obj;
        if (xp.a(this.a, c1079u.a) && this.b == c1079u.b && this.c == c1079u.c && this.d == c1079u.d && this.f == c1079u.f && Arrays.equals(this.g, c1079u.g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i2 = this.b * 31;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((((((((i2 + hashCode) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + this.f) * 31) + Arrays.hashCode(this.g);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.a);
        sb.append(", adResumePositionUs=");
        sb.append(this.c);
        sb.append(", adGroups=[");
        for (int i2 = 0; i2 < this.g.length; i2++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.g[i2].a);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < this.g[i2].d.length; i3++) {
                sb.append("ad(state=");
                int i4 = this.g[i2].d[i3];
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    sb.append('?');
                                } else {
                                    sb.append('!');
                                }
                            } else {
                                sb.append('P');
                            }
                        } else {
                            sb.append('S');
                        }
                    } else {
                        sb.append('R');
                    }
                } else {
                    sb.append('_');
                }
                sb.append(", durationUs=");
                sb.append(this.g[i2].f[i3]);
                sb.append(')');
                if (i3 < this.g[i2].d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < this.g.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    public int b(long j2, long j3) {
        int i2 = this.b - 1;
        while (i2 >= 0 && a(j2, j3, i2)) {
            i2--;
        }
        if (i2 < 0 || !a(i2).b()) {
            return -1;
        }
        return i2;
    }

    private static String b(int i2) {
        return Integer.toString(i2, 36);
    }

    public a a(int i2) {
        int i3 = this.f;
        if (i2 < i3) {
            return i;
        }
        return this.g[i2 - i3];
    }

    public int a(long j2, long j3) {
        if (j2 != Long.MIN_VALUE) {
            if (j3 == -9223372036854775807L || j2 < j3) {
                int i2 = this.f;
                while (i2 < this.b && ((a(i2).a != Long.MIN_VALUE && a(i2).a <= j2) || !a(i2).c())) {
                    i2++;
                }
                if (i2 < this.b) {
                    return i2;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }

    private boolean a(long j2, long j3, int i2) {
        if (j2 == Long.MIN_VALUE) {
            return false;
        }
        long j4 = a(i2).a;
        return j4 == Long.MIN_VALUE ? j3 == -9223372036854775807L || j2 < j3 : j2 < j4;
    }
}
