package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import java.util.Arrays;
/* loaded from: classes.dex */
public final class f {
    public final int a;
    public final e[] b;
    public int c;

    public f(e... eVarArr) {
        this.b = eVarArr;
        this.a = eVarArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            return Arrays.equals(this.b, ((f) obj).b);
        }
        return false;
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b) + 527;
        }
        return this.c;
    }
}
