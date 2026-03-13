package defpackage;

import androidx.media3.common.b;
/* renamed from: iK  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1607iK extends AbstractC3202yd {
    public final long l;

    public AbstractC1607iK(InterfaceC3304zl interfaceC3304zl, C0223Dl c0223Dl, b bVar, int i, Object obj, long j, long j2, long j3) {
        super(interfaceC3304zl, c0223Dl, 1, bVar, i, obj, j, j2);
        bVar.getClass();
        this.l = j3;
    }

    public long b() {
        long j = this.l;
        if (j == -1) {
            return -1L;
        }
        return 1 + j;
    }

    public abstract boolean c();
}
