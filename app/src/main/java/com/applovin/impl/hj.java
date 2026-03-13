package com.applovin.impl;

import com.applovin.impl.dp;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* loaded from: classes.dex */
public final class hj implements dp {
    private final gj a;
    private final ah b = new ah(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public hj(gj gjVar) {
        this.a = gjVar;
    }

    @Override // com.applovin.impl.dp
    public void a(ah ahVar, int i) {
        boolean z = (i & 1) != 0;
        int d = z ? ahVar.d() + ahVar.w() : -1;
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            ahVar.f(d);
            this.d = 0;
        }
        while (ahVar.a() > 0) {
            int i2 = this.d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int w = ahVar.w();
                    ahVar.f(ahVar.d() - 1);
                    if (w == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(ahVar.a(), 3 - this.d);
                ahVar.a(this.b.c(), this.d, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    this.b.f(0);
                    this.b.e(3);
                    this.b.g(1);
                    int w2 = this.b.w();
                    int w3 = this.b.w();
                    this.e = (w2 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                    this.c = (((w2 & 15) << 8) | w3) + 3;
                    int b = this.b.b();
                    int i4 = this.c;
                    if (b < i4) {
                        this.b.a(Math.min(4098, Math.max(i4, this.b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(ahVar.a(), this.c - this.d);
                ahVar.a(this.b.c(), this.d, min2);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.e) {
                        if (xp.a(this.b.c(), 0, this.c, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.e(this.c - 4);
                    } else {
                        this.b.e(i6);
                    }
                    this.b.f(0);
                    this.a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // com.applovin.impl.dp
    public void a(ho hoVar, l8 l8Var, dp.d dVar) {
        this.a.a(hoVar, l8Var, dVar);
        this.f = true;
    }

    @Override // com.applovin.impl.dp
    public void a() {
        this.f = true;
    }
}
