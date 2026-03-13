package defpackage;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
/* renamed from: xs  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C3141xs extends InputStream implements DataInput {
    public static final ByteOrder g = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder h = ByteOrder.BIG_ENDIAN;
    public final DataInputStream b;
    public ByteOrder c;
    public int d;
    public byte[] f;

    public C3141xs(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public final void a(int i) {
        int i2 = 0;
        while (i2 < i) {
            DataInputStream dataInputStream = this.b;
            int i3 = i - i2;
            int skip = (int) dataInputStream.skip(i3);
            if (skip <= 0) {
                if (this.f == null) {
                    this.f = new byte[8192];
                }
                skip = dataInputStream.read(this.f, 0, Math.min(8192, i3));
                if (skip == -1) {
                    throw new EOFException(AbstractC2437ph.c(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += skip;
        }
        this.d += i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.b.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.d++;
        return this.b.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.d++;
        return this.b.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.d++;
        int read = this.b.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.d += 2;
        return this.b.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        this.d += i2;
        this.b.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.d += 4;
        DataInputStream dataInputStream = this.b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.c;
            if (byteOrder == g) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == h) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.c);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.d += 8;
        DataInputStream dataInputStream = this.b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.c;
            if (byteOrder == g) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == h) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.c);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.d += 2;
        DataInputStream dataInputStream = this.b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.c;
            if (byteOrder == g) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == h) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.c);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.d += 2;
        return this.b.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.d++;
        return this.b.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.d += 2;
        DataInputStream dataInputStream = this.b;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.c;
            if (byteOrder == g) {
                return (read2 << 8) + read;
            }
            if (byteOrder == h) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.c);
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public C3141xs(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public C3141xs(InputStream inputStream, ByteOrder byteOrder) {
        this.c = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.b = dataInputStream;
        dataInputStream.mark(0);
        this.d = 0;
        this.c = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.b.read(bArr, i, i2);
        this.d += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.d += bArr.length;
        this.b.readFully(bArr);
    }
}
