package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: mU  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2159mU implements Closeable {
    public static final Logger i = Logger.getLogger(C2159mU.class.getName());
    public final RandomAccessFile b;
    public int c;
    public int d;
    public C1901jU f;
    public C1901jU g;
    public final byte[] h;

    public C2159mU(File file) {
        byte[] bArr = new byte[16];
        this.h = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    s(i2, bArr2, iArr[i3]);
                    i2 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.b = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int i4 = i(0, bArr);
        this.c = i4;
        if (i4 <= randomAccessFile2.length()) {
            this.d = i(4, bArr);
            int i5 = i(8, bArr);
            int i6 = i(12, bArr);
            this.f = h(i5);
            this.g = h(i6);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.c + ", Actual length: " + randomAccessFile2.length());
    }

    public static int i(int i2, byte[] bArr) {
        return ((bArr[i2] & 255) << 24) + ((bArr[i2 + 1] & 255) << 16) + ((bArr[i2 + 2] & 255) << 8) + (bArr[i2 + 3] & 255);
    }

    public static void s(int i2, byte[] bArr, int i3) {
        bArr[i2] = (byte) (i3 >> 24);
        bArr[i2 + 1] = (byte) (i3 >> 16);
        bArr[i2 + 2] = (byte) (i3 >> 8);
        bArr[i2 + 3] = (byte) i3;
    }

    public final void a(byte[] bArr) {
        int p;
        int i2;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    c(length);
                    boolean f = f();
                    if (f) {
                        p = 16;
                    } else {
                        C1901jU c1901jU = this.g;
                        p = p(c1901jU.b + 4 + c1901jU.c);
                    }
                    C1901jU c1901jU2 = new C1901jU(p, length, 0);
                    s(0, this.h, length);
                    l(p, this.h, 4);
                    l(p + 4, bArr, length);
                    if (f) {
                        i2 = p;
                    } else {
                        i2 = this.f.b;
                    }
                    q(this.c, this.d + 1, i2, p);
                    this.g = c1901jU2;
                    this.d++;
                    if (f) {
                        this.f = c1901jU2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public final synchronized void b() {
        q(4096, 0, 0, 0);
        this.d = 0;
        C1901jU c1901jU = C1901jU.d;
        this.f = c1901jU;
        this.g = c1901jU;
        if (this.c > 4096) {
            RandomAccessFile randomAccessFile = this.b;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.c = 4096;
    }

    public final void c(int i2) {
        int i3 = i2 + 4;
        int m = this.c - m();
        if (m >= i3) {
            return;
        }
        int i4 = this.c;
        do {
            m += i4;
            i4 <<= 1;
        } while (m < i3);
        RandomAccessFile randomAccessFile = this.b;
        randomAccessFile.setLength(i4);
        randomAccessFile.getChannel().force(true);
        C1901jU c1901jU = this.g;
        int p = p(c1901jU.b + 4 + c1901jU.c);
        if (p < this.f.b) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.c);
            long j = p - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i5 = this.g.b;
        int i6 = this.f.b;
        if (i5 < i6) {
            int i7 = (this.c + i5) - 16;
            q(i4, this.d, i6, i7);
            this.g = new C1901jU(i7, this.g.c, 0);
        } else {
            q(i4, this.d, i6, i5);
        }
        this.c = i4;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.b.close();
    }

    public final synchronized void e(InterfaceC2073lU interfaceC2073lU) {
        int i2 = this.f.b;
        for (int i3 = 0; i3 < this.d; i3++) {
            C1901jU h = h(i2);
            interfaceC2073lU.c(new C1987kU(this, h), h.c);
            i2 = p(h.b + 4 + h.c);
        }
    }

    public final synchronized boolean f() {
        boolean z;
        if (this.d == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final C1901jU h(int i2) {
        if (i2 == 0) {
            return C1901jU.d;
        }
        RandomAccessFile randomAccessFile = this.b;
        randomAccessFile.seek(i2);
        return new C1901jU(i2, randomAccessFile.readInt(), 0);
    }

    public final synchronized void j() {
        try {
            if (!f()) {
                if (this.d == 1) {
                    b();
                } else {
                    C1901jU c1901jU = this.f;
                    int p = p(c1901jU.b + 4 + c1901jU.c);
                    k(p, 0, 4, this.h);
                    int i2 = i(0, this.h);
                    q(this.c, this.d - 1, p, this.g.b);
                    this.d--;
                    this.f = new C1901jU(p, i2, 0);
                }
            } else {
                throw new NoSuchElementException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void k(int i2, int i3, int i4, byte[] bArr) {
        int p = p(i2);
        int i5 = p + i4;
        int i6 = this.c;
        RandomAccessFile randomAccessFile = this.b;
        if (i5 <= i6) {
            randomAccessFile.seek(p);
            randomAccessFile.readFully(bArr, i3, i4);
            return;
        }
        int i7 = i6 - p;
        randomAccessFile.seek(p);
        randomAccessFile.readFully(bArr, i3, i7);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i3 + i7, i4 - i7);
    }

    public final void l(int i2, byte[] bArr, int i3) {
        int p = p(i2);
        int i4 = p + i3;
        int i5 = this.c;
        RandomAccessFile randomAccessFile = this.b;
        if (i4 <= i5) {
            randomAccessFile.seek(p);
            randomAccessFile.write(bArr, 0, i3);
            return;
        }
        int i6 = i5 - p;
        randomAccessFile.seek(p);
        randomAccessFile.write(bArr, 0, i6);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i6, i3 - i6);
    }

    public final int m() {
        if (this.d == 0) {
            return 16;
        }
        C1901jU c1901jU = this.g;
        int i2 = c1901jU.b;
        int i3 = this.f.b;
        if (i2 >= i3) {
            return (i2 - i3) + 4 + c1901jU.c + 16;
        }
        return (((i2 + 4) + c1901jU.c) + this.c) - i3;
    }

    public final int p(int i2) {
        int i3 = this.c;
        if (i2 >= i3) {
            return (i2 + 16) - i3;
        }
        return i2;
    }

    public final void q(int i2, int i3, int i4, int i5) {
        int[] iArr = {i2, i3, i4, i5};
        byte[] bArr = this.h;
        int i6 = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            s(i6, bArr, iArr[i7]);
            i6 += 4;
        }
        RandomAccessFile randomAccessFile = this.b;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [ab, lU, java.lang.Object] */
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C2159mU.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.c);
        sb.append(", size=");
        sb.append(this.d);
        sb.append(", first=");
        sb.append(this.f);
        sb.append(", last=");
        sb.append(this.g);
        sb.append(", element lengths=[");
        try {
            ?? obj = new Object();
            obj.c = sb;
            obj.b = true;
            e(obj);
        } catch (IOException e) {
            i.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
