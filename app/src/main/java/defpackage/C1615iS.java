package defpackage;

import android.media.metrics.LogSessionId;
import java.util.Objects;
/* renamed from: iS  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1615iS {
    public final String a;
    public final C1529hS b;
    public final Object c;

    static {
        if (Ha0.a < 31) {
            new C1615iS("");
        } else {
            new C1615iS(C1529hS.b, "");
        }
    }

    public C1615iS(String str) {
        B10.u(Ha0.a < 31);
        this.a = str;
        this.b = null;
        this.c = new Object();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1615iS)) {
            return false;
        }
        C1615iS c1615iS = (C1615iS) obj;
        if (Objects.equals(this.a, c1615iS.a) && Objects.equals(this.b, c1615iS.b) && Objects.equals(this.c, c1615iS.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public C1615iS(LogSessionId logSessionId, String str) {
        this(new C1529hS(logSessionId), str);
    }

    public C1615iS(C1529hS c1529hS, String str) {
        this.b = c1529hS;
        this.a = str;
        this.c = new Object();
    }
}
