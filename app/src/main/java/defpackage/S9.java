package defpackage;

import android.os.SystemClock;
import androidx.media3.common.b;
import java.util.Arrays;
import java.util.List;
/* renamed from: S9  reason: default package */
/* loaded from: classes.dex */
public abstract class S9 implements InterfaceC1225dt {
    public final I70 a;
    public final int b;
    public final int[] c;
    public final b[] d;
    public final long[] e;
    public int f;

    public S9(I70 i70, int[] iArr) {
        boolean z;
        int i = 0;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        B10.u(z);
        i70.getClass();
        this.a = i70;
        int length = iArr.length;
        this.b = length;
        this.d = new b[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = i70.d[iArr[i2]];
        }
        Arrays.sort(this.d, new R9(0));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i < i3) {
                this.c[i] = i70.b(this.d[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    @Override // defpackage.InterfaceC1225dt
    public final boolean a(int i, long j) {
        if (this.e[i] > j) {
            return true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC1225dt
    public final int c(b bVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == bVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.InterfaceC1225dt
    public final I70 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        S9 s9 = (S9) obj;
        if (this.a.equals(s9.a) && Arrays.equals(this.c, s9.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC1225dt
    public final /* synthetic */ boolean f(long j, AbstractC3202yd abstractC3202yd, List list) {
        return false;
    }

    @Override // defpackage.InterfaceC1225dt
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.InterfaceC1225dt
    public final b h(int i) {
        return this.d[i];
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // defpackage.InterfaceC1225dt
    public final int j(int i) {
        return this.c[i];
    }

    @Override // defpackage.InterfaceC1225dt
    public int k(long j, List list) {
        return list.size();
    }

    @Override // defpackage.InterfaceC1225dt
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.InterfaceC1225dt
    public final int m() {
        return this.c[e()];
    }

    @Override // defpackage.InterfaceC1225dt
    public final b n() {
        return this.d[e()];
    }

    @Override // defpackage.InterfaceC1225dt
    public final boolean p(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a = a(i, elapsedRealtime);
        for (int i2 = 0; i2 < this.b && !a; i2++) {
            if (i2 != i && !a(i2, elapsedRealtime)) {
                a = true;
            } else {
                a = false;
            }
        }
        if (!a) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        int i3 = Ha0.a;
        long j3 = elapsedRealtime + j;
        if (((j ^ j3) & (elapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // defpackage.InterfaceC1225dt
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.InterfaceC1225dt
    public final /* synthetic */ void t() {
    }

    @Override // defpackage.InterfaceC1225dt
    public final int u(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.InterfaceC1225dt
    public void i() {
    }

    @Override // defpackage.InterfaceC1225dt
    public void l() {
    }

    @Override // defpackage.InterfaceC1225dt
    public void q(float f) {
    }
}
