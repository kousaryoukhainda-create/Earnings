package defpackage;
/* renamed from: HA  reason: default package */
/* loaded from: classes.dex */
public abstract class HA implements Cloneable {
    public final LA b;
    public LA c;

    public HA(LA la) {
        this.b = la;
        if (!la.p()) {
            this.c = (LA) la.m(4);
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final Object clone() {
        HA ha = (HA) this.b.m(5);
        ha.c = j();
        return ha;
    }

    public final LA i() {
        LA j = j();
        j.getClass();
        boolean z = true;
        byte byteValue = ((Byte) j.m(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                RT rt = RT.c;
                rt.getClass();
                z = rt.a(j.getClass()).c(j);
                j.m(2);
            }
        }
        if (z) {
            return j;
        }
        throw new RuntimeException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final LA j() {
        if (!this.c.p()) {
            return this.c;
        }
        LA la = this.c;
        la.getClass();
        RT rt = RT.c;
        rt.getClass();
        rt.a(la.getClass()).b(la);
        la.q();
        return this.c;
    }

    public final void k() {
        if (!this.c.p()) {
            LA la = (LA) this.b.m(4);
            LA la2 = this.c;
            RT rt = RT.c;
            rt.getClass();
            rt.a(la.getClass()).a(la, la2);
            this.c = la;
        }
    }
}
