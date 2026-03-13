package defpackage;

import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* renamed from: mB  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2140mB {
    public final L70 a;
    public final boolean b;
    public final boolean c;
    public final C0188Cc f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public long l;
    public boolean o;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public C2054lB m = new Object();
    public C2054lB n = new Object();

    /* JADX WARN: Type inference failed for: r1v3, types: [lB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [lB, java.lang.Object] */
    public C2140mB(L70 l70, boolean z, boolean z2) {
        this.a = l70;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
        this.g = bArr;
        this.f = new C0188Cc(bArr, 0, 0);
        this.k = false;
        this.o = false;
        C2054lB c2054lB = this.n;
        c2054lB.b = false;
        c2054lB.a = false;
    }

    public final void a() {
        boolean z;
        int i;
        boolean z2 = false;
        if (this.b) {
            C2054lB c2054lB = this.n;
            if (c2054lB.b && ((i = c2054lB.e) == 7 || i == 2)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = this.s;
        }
        boolean z3 = this.r;
        int i2 = this.i;
        if (i2 == 5 || (z && i2 == 1)) {
            z2 = true;
        }
        this.r = z3 | z2;
    }
}
