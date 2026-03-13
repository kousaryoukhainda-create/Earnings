package com.applovin.impl;
/* loaded from: classes.dex */
public final class wo {
    public final int a;
    public final si[] b;
    public final g8[] c;
    public final Object d;

    public wo(si[] siVarArr, g8[] g8VarArr, Object obj) {
        this.b = siVarArr;
        this.c = (g8[]) g8VarArr.clone();
        this.d = obj;
        this.a = siVarArr.length;
    }

    public boolean a(wo woVar) {
        if (woVar == null || woVar.c.length != this.c.length) {
            return false;
        }
        for (int i = 0; i < this.c.length; i++) {
            if (!a(woVar, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean a(wo woVar, int i) {
        return woVar != null && xp.a(this.b[i], woVar.b[i]) && xp.a(this.c[i], woVar.c[i]);
    }

    public boolean a(int i) {
        return this.b[i] != null;
    }
}
