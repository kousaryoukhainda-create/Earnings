package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* renamed from: i40  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1586i40 implements InterfaceC3304zl {
    public final InterfaceC3304zl b;
    public long c;
    public Uri d;

    public C1586i40(InterfaceC3304zl interfaceC3304zl) {
        interfaceC3304zl.getClass();
        this.b = interfaceC3304zl;
        this.d = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // defpackage.InterfaceC3304zl
    public final Uri A() {
        return this.b.A();
    }

    @Override // defpackage.InterfaceC3304zl
    public final void close() {
        this.b.close();
    }

    @Override // defpackage.InterfaceC3304zl
    public final long g(C0223Dl c0223Dl) {
        this.d = c0223Dl.a;
        Collections.emptyMap();
        InterfaceC3304zl interfaceC3304zl = this.b;
        long g = interfaceC3304zl.g(c0223Dl);
        Uri A = interfaceC3304zl.A();
        A.getClass();
        this.d = A;
        interfaceC3304zl.t();
        return g;
    }

    @Override // defpackage.InterfaceC3304zl
    public final void i(U70 u70) {
        u70.getClass();
        this.b.i(u70);
    }

    @Override // defpackage.InterfaceC3046wl
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.b.read(bArr, i, i2);
        if (read != -1) {
            this.c += read;
        }
        return read;
    }

    @Override // defpackage.InterfaceC3304zl
    public final Map t() {
        return this.b.t();
    }
}
