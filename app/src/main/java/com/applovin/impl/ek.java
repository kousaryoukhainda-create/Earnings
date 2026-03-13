package com.applovin.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public abstract class ek extends bk implements ol {
    private final String n;

    public ek(String str) {
        super(new rl[2], new sl[2]);
        this.n = str;
        a(UserVerificationMethods.USER_VERIFY_ALL);
    }

    public static /* synthetic */ void n(ek ekVar, yg ygVar) {
        ekVar.a(ygVar);
    }

    public abstract nl a(byte[] bArr, int i, boolean z);

    @Override // com.applovin.impl.ol
    public void a(long j) {
    }

    @Override // com.applovin.impl.bk
    /* renamed from: b */
    public final pl a(Throwable th) {
        return new pl("Unexpected decode error", th);
    }

    @Override // com.applovin.impl.bk
    /* renamed from: o */
    public final sl g() {
        return new fk(new C2941vb0(this, 20));
    }

    @Override // com.applovin.impl.bk
    /* renamed from: n */
    public final rl f() {
        return new rl();
    }

    @Override // com.applovin.impl.bk
    public final pl a(rl rlVar, sl slVar, boolean z) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) b1.a(rlVar.c);
            slVar.a(rlVar.f, a(byteBuffer.array(), byteBuffer.limit(), z), rlVar.j);
            slVar.c(Integer.MIN_VALUE);
            return null;
        } catch (pl e) {
            return e;
        }
    }
}
