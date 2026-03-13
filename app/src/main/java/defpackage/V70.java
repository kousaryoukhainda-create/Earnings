package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/* renamed from: V70  reason: default package */
/* loaded from: classes.dex */
public final class V70 extends L9 implements InterfaceC1448gX {
    public final LinkedBlockingQueue g;
    public final long h;
    public byte[] i;
    public int j;

    public V70() {
        super(true);
        this.h = 8000L;
        this.g = new LinkedBlockingQueue();
        this.i = new byte[0];
        this.j = -1;
    }

    @Override // defpackage.InterfaceC3304zl
    public final Uri A() {
        return null;
    }

    @Override // defpackage.InterfaceC1448gX
    public final String b() {
        boolean z;
        if (this.j != -1) {
            z = true;
        } else {
            z = false;
        }
        B10.u(z);
        int i = Ha0.a;
        Locale locale = Locale.US;
        return AbstractC0324Hi.d(this.j, this.j + 1, "RTP/AVP/TCP;unicast;interleaved=", "-");
    }

    @Override // defpackage.InterfaceC1448gX
    public final int d() {
        return this.j;
    }

    @Override // defpackage.InterfaceC3304zl
    public final long g(C0223Dl c0223Dl) {
        this.j = c0223Dl.a.getPort();
        return -1L;
    }

    @Override // defpackage.InterfaceC1448gX
    public final boolean l() {
        return false;
    }

    @Override // defpackage.InterfaceC3046wl
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int min = Math.min(i2, this.i.length);
        System.arraycopy(this.i, 0, bArr, i, min);
        byte[] bArr2 = this.i;
        this.i = Arrays.copyOfRange(bArr2, min, bArr2.length);
        if (min == i2) {
            return min;
        }
        try {
            byte[] bArr3 = (byte[]) this.g.poll(this.h, TimeUnit.MILLISECONDS);
            if (bArr3 == null) {
                return -1;
            }
            int min2 = Math.min(i2 - min, bArr3.length);
            System.arraycopy(bArr3, 0, bArr, i + min, min2);
            if (min2 < bArr3.length) {
                this.i = Arrays.copyOfRange(bArr3, min2, bArr3.length);
            }
            return min + min2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }

    @Override // defpackage.InterfaceC3304zl
    public final void close() {
    }

    @Override // defpackage.InterfaceC1448gX
    public final V70 o() {
        return this;
    }
}
