package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
/* renamed from: r90  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2567r90 extends L9 {
    public final int g;
    public final byte[] h;
    public final DatagramPacket i;
    public Uri j;
    public DatagramSocket k;
    public MulticastSocket l;
    public InetAddress m;
    public boolean n;
    public int o;

    public C2567r90(int i) {
        super(true);
        this.g = i;
        byte[] bArr = new byte[2000];
        this.h = bArr;
        this.i = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.InterfaceC3304zl
    public final Uri A() {
        return this.j;
    }

    @Override // defpackage.InterfaceC3304zl
    public final void close() {
        this.j = null;
        MulticastSocket multicastSocket = this.l;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.m;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.l = null;
        }
        DatagramSocket datagramSocket = this.k;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.k = null;
        }
        this.m = null;
        this.o = 0;
        if (this.n) {
            this.n = false;
            e();
        }
    }

    @Override // defpackage.InterfaceC3304zl
    public final long g(C0223Dl c0223Dl) {
        Uri uri = c0223Dl.a;
        this.j = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.j.getPort();
        h();
        try {
            this.m = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.m, port);
            if (this.m.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.l = multicastSocket;
                multicastSocket.joinGroup(this.m);
                this.k = this.l;
            } else {
                this.k = new DatagramSocket(inetSocketAddress);
            }
            this.k.setSoTimeout(this.g);
            this.n = true;
            j(c0223Dl);
            return -1L;
        } catch (IOException e) {
            throw new C0145Al(2001, e);
        } catch (SecurityException e2) {
            throw new C0145Al(2006, e2);
        }
    }

    @Override // defpackage.InterfaceC3046wl
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.o;
        DatagramPacket datagramPacket = this.i;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.k;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.o = length;
                a(length);
            } catch (SocketTimeoutException e) {
                throw new C0145Al(2002, e);
            } catch (IOException e2) {
                throw new C0145Al(2001, e2);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.o;
        int min = Math.min(i4, i2);
        System.arraycopy(this.h, length2 - i4, bArr, i, min);
        this.o -= min;
        return min;
    }
}
