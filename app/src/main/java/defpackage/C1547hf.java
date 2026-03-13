package defpackage;

import java.util.Comparator;
/* renamed from: hf  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1547hf extends AbstractC1917jf {
    public static AbstractC1917jf f(int i) {
        if (i < 0) {
            return AbstractC1917jf.b;
        }
        if (i > 0) {
            return AbstractC1917jf.c;
        }
        return AbstractC1917jf.a;
    }

    @Override // defpackage.AbstractC1917jf
    public final AbstractC1917jf a(int i, int i2) {
        int i3;
        if (i < i2) {
            i3 = -1;
        } else if (i > i2) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        return f(i3);
    }

    @Override // defpackage.AbstractC1917jf
    public final AbstractC1917jf b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // defpackage.AbstractC1917jf
    public final AbstractC1917jf c(boolean z, boolean z2) {
        int i;
        if (z == z2) {
            i = 0;
        } else if (z) {
            i = 1;
        } else {
            i = -1;
        }
        return f(i);
    }

    @Override // defpackage.AbstractC1917jf
    public final AbstractC1917jf d(boolean z, boolean z2) {
        int i;
        if (z2 == z) {
            i = 0;
        } else if (z2) {
            i = 1;
        } else {
            i = -1;
        }
        return f(i);
    }

    @Override // defpackage.AbstractC1917jf
    public final int e() {
        return 0;
    }
}
