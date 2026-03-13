package defpackage;

import java.util.Arrays;
/* renamed from: b2  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0905b2 {
    public static final C0905b2 c = new C0905b2(new C0814a2[0]);
    public static final C0814a2 d;
    public final int a;
    public final C0814a2[] b;

    static {
        C0814a2 c0814a2 = new C0814a2(-1, -1, new int[0], new VK[0], new long[0]);
        int[] iArr = c0814a2.e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = c0814a2.f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        d = new C0814a2(0, c0814a2.b, copyOf, (VK[]) Arrays.copyOf(c0814a2.d, 0), copyOf2);
        Ha0.H(1);
        Ha0.H(2);
        Ha0.H(3);
        Ha0.H(4);
    }

    public C0905b2(C0814a2[] c0814a2Arr) {
        this.a = c0814a2Arr.length;
        this.b = c0814a2Arr;
    }

    public final C0814a2 a(int i) {
        if (i < 0) {
            return d;
        }
        return this.b[i];
    }

    public final boolean b(int i) {
        if (i == this.a - 1) {
            a(i).getClass();
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0905b2.class != obj.getClass()) {
            return false;
        }
        C0905b2 c0905b2 = (C0905b2) obj;
        if (Ha0.a(null, null) && this.a == c0905b2.a && Arrays.equals(this.b, c0905b2.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (((((this.a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            C0814a2[] c0814a2Arr = this.b;
            if (i < c0814a2Arr.length) {
                sb.append("adGroup(timeUs=0, ads=[");
                c0814a2Arr[i].getClass();
                for (int i2 = 0; i2 < c0814a2Arr[i].e.length; i2++) {
                    sb.append("ad(state=");
                    int i3 = c0814a2Arr[i].e[i2];
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 4) {
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
                    sb.append(c0814a2Arr[i].f[i2]);
                    sb.append(')');
                    if (i2 < c0814a2Arr[i].e.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i < c0814a2Arr.length - 1) {
                    sb.append(", ");
                }
                i++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}
