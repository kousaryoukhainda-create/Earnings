package defpackage;
/* renamed from: hk  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1557hk extends AbstractC2013kk {
    public C0397Kd l;
    public AbstractC2013kk[] m;

    @Override // defpackage.AbstractC2013kk
    public final C0397Kd g() {
        return this.l;
    }

    @Override // defpackage.AbstractC2013kk
    public final AbstractC2013kk h() {
        String str = this.a;
        return this.l.d(str.substring(0, str.length() - 2));
    }

    @Override // defpackage.AbstractC2013kk
    public final AbstractC2013kk[] n() {
        if (this.m == null) {
            Class<?>[] interfaces = Object[].class.getInterfaces();
            this.m = new AbstractC2013kk[interfaces.length];
            for (int i = 0; i < interfaces.length; i++) {
                this.m[i] = this.l.d(interfaces[i].getName());
            }
        }
        return this.m;
    }

    @Override // defpackage.AbstractC2013kk
    public final int o() {
        try {
            return 16 | (h().o() & 7);
        } catch (C2926vO unused) {
            return 16;
        }
    }

    @Override // defpackage.AbstractC2013kk
    public final AbstractC2013kk r() {
        return this.l.d("java.lang.Object");
    }

    @Override // defpackage.AbstractC2013kk
    public final boolean w(AbstractC2013kk abstractC2013kk) {
        if (super.w(abstractC2013kk) || abstractC2013kk.a.equals("java.lang.Object")) {
            return true;
        }
        for (AbstractC2013kk abstractC2013kk2 : n()) {
            if (abstractC2013kk2.w(abstractC2013kk)) {
                return true;
            }
        }
        if ((abstractC2013kk instanceof C1557hk) && h().w(abstractC2013kk.h())) {
            return true;
        }
        return false;
    }
}
