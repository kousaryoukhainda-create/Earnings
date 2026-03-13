package defpackage;

import android.net.Uri;
import java.util.Arrays;
/* renamed from: a2  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0814a2 {
    public final int a;
    public final int b;
    public final Uri[] c;
    public final VK[] d;
    public final int[] e;
    public final long[] f;

    static {
        AbstractC0324Hi.q(0, 1, 2, 3, 4);
        Ha0.H(5);
        Ha0.H(6);
        Ha0.H(7);
        Ha0.H(8);
    }

    public C0814a2(int i, int i2, int[] iArr, VK[] vkArr, long[] jArr) {
        boolean z;
        Uri uri;
        int i3 = 0;
        if (iArr.length == vkArr.length) {
            z = true;
        } else {
            z = false;
        }
        B10.j(z);
        this.a = i;
        this.b = i2;
        this.e = iArr;
        this.d = vkArr;
        this.f = jArr;
        this.c = new Uri[vkArr.length];
        while (true) {
            Uri[] uriArr = this.c;
            if (i3 < uriArr.length) {
                VK vk = vkArr[i3];
                if (vk == null) {
                    uri = null;
                } else {
                    SK sk = vk.b;
                    sk.getClass();
                    uri = sk.a;
                }
                uriArr[i3] = uri;
                i3++;
            } else {
                return;
            }
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.e;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0814a2.class != obj.getClass()) {
            return false;
        }
        C0814a2 c0814a2 = (C0814a2) obj;
        if (this.a == c0814a2.a && this.b == c0814a2.b && Arrays.equals(this.d, c0814a2.d) && Arrays.equals(this.e, c0814a2.e) && Arrays.equals(this.f, c0814a2.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = (int) 0;
        int hashCode = Arrays.hashCode(this.d);
        int hashCode2 = Arrays.hashCode(this.e);
        return (((Arrays.hashCode(this.f) + ((hashCode2 + ((hashCode + (((((this.a * 31) + this.b) * 31) + i) * 31)) * 31)) * 31)) * 31) + i) * 31;
    }
}
