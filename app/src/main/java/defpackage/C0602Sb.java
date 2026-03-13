package defpackage;
/* renamed from: Sb  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0602Sb extends AbstractC0629Tc {
    public final Bd0 f;
    public final Bd0 g;

    public C0602Sb(Bd0 bd0, InterfaceC0428Li interfaceC0428Li, int i, int i2) {
        super(interfaceC0428Li, i, i2);
        this.f = bd0;
        this.g = bd0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    @Override // defpackage.AbstractC0629Tc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.InterfaceC2072lT r6, defpackage.InterfaceC2868ui r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C0576Rb
            if (r0 == 0) goto L13
            r0 = r7
            Rb r0 = (defpackage.C0576Rb) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L1a
        L13:
            Rb r0 = new Rb
            wi r7 = (defpackage.AbstractC3040wi) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.c
            Ui r1 = defpackage.EnumC0661Ui.b
            int r2 = r0.f
            B90 r3 = defpackage.B90.a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            lT r6 = r0.b
            defpackage.AbstractC1522hL.T(r7)
            goto L49
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.AbstractC1522hL.T(r7)
            r0.b = r6
            r0.f = r4
            Bd0 r7 = r5.f
            java.lang.Object r7 = r7.invoke(r6, r0)
            if (r7 != r1) goto L45
            goto L46
        L45:
            r7 = r3
        L46:
            if (r7 != r1) goto L49
            return r1
        L49:
            kT r6 = (defpackage.C1986kT) r6
            mb r6 = r6.f
            boolean r6 = r6.r()
            if (r6 == 0) goto L54
            return r3
        L54:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0602Sb.a(lT, ui):java.lang.Object");
    }

    @Override // defpackage.AbstractC0629Tc
    public final AbstractC0629Tc b(InterfaceC0428Li interfaceC0428Li, int i, int i2) {
        return new C0602Sb(this.g, interfaceC0428Li, i, i2);
    }

    @Override // defpackage.AbstractC0629Tc
    public final String toString() {
        return "block[" + this.f + "] -> " + super.toString();
    }
}
