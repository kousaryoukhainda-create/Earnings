package defpackage;
/* renamed from: fx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1401fx implements InterfaceC0675Uw {
    public final /* synthetic */ int b = 1;
    public final Object c;
    public final Object d;
    public final AbstractC1502h50 f;

    public C1401fx(C2589rV c2589rV, InterfaceC0675Uw interfaceC0675Uw, C0456Ml c0456Ml) {
        this.c = c2589rV;
        this.d = interfaceC0675Uw;
        this.f = c0456Ml;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    @Override // defpackage.InterfaceC0675Uw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, defpackage.InterfaceC2868ui r9) {
        /*
            r7 = this;
            int r0 = r7.b
            switch(r0) {
                case 0: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r7.c
            Li r0 = (defpackage.InterfaceC0428Li) r0
            java.lang.Object r1 = r7.d
            h50 r2 = r7.f
            x90 r2 = (defpackage.C3083x90) r2
            java.lang.Object r8 = defpackage.AbstractC2870uj.f0(r0, r8, r1, r2, r9)
            Ui r9 = defpackage.EnumC0661Ui.b
            if (r8 != r9) goto L18
            goto L1a
        L18:
            B90 r8 = defpackage.B90.a
        L1a:
            return r8
        L1b:
            boolean r0 = r9 instanceof defpackage.C1315ex
            if (r0 == 0) goto L2e
            r0 = r9
            ex r0 = (defpackage.C1315ex) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L2e
            int r1 = r1 - r2
            r0.g = r1
            goto L33
        L2e:
            ex r0 = new ex
            r0.<init>(r7, r9)
        L33:
            java.lang.Object r9 = r0.d
            Ui r1 = defpackage.EnumC0661Ui.b
            int r2 = r0.g
            B90 r3 = defpackage.B90.a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L5b
            if (r2 == r6) goto L57
            if (r2 == r5) goto L4f
            if (r2 != r4) goto L47
            goto L57
        L47:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4f:
            java.lang.Object r8 = r0.c
            fx r2 = r0.b
            defpackage.AbstractC1522hL.T(r9)
            goto L87
        L57:
            defpackage.AbstractC1522hL.T(r9)
            goto L73
        L5b:
            defpackage.AbstractC1522hL.T(r9)
            java.lang.Object r9 = r7.c
            rV r9 = (defpackage.C2589rV) r9
            boolean r9 = r9.b
            if (r9 == 0) goto L75
            r0.g = r6
            java.lang.Object r9 = r7.d
            Uw r9 = (defpackage.InterfaceC0675Uw) r9
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L73
            goto La6
        L73:
            r1 = r3
            goto La6
        L75:
            r0.b = r7
            r0.c = r8
            r0.g = r5
            h50 r9 = r7.f
            Ml r9 = (defpackage.C0456Ml) r9
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r1) goto L86
            goto La6
        L86:
            r2 = r7
        L87:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L73
            java.lang.Object r9 = r2.c
            rV r9 = (defpackage.C2589rV) r9
            r9.b = r6
            r9 = 0
            r0.b = r9
            r0.c = r9
            r0.g = r4
            java.lang.Object r9 = r2.d
            Uw r9 = (defpackage.InterfaceC0675Uw) r9
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L73
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1401fx.emit(java.lang.Object, ui):java.lang.Object");
    }

    public C1401fx(InterfaceC0675Uw interfaceC0675Uw, InterfaceC0428Li interfaceC0428Li) {
        this.c = interfaceC0428Li;
        this.d = AbstractC1281eb.S(interfaceC0428Li);
        this.f = new C3083x90(interfaceC0675Uw, null);
    }
}
