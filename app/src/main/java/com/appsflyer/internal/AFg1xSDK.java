package com.appsflyer.internal;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class AFg1xSDK extends FilterInputStream {
    private final int[] AFLogger;
    private int AFVersionDeclaration;
    private final byte[][] afDebugLog;
    private final byte[] afErrorLog;
    private int afErrorLogForExcManagerOnly;
    private final int[] afInfoLog;
    private final int afRDLog;
    private final byte[] afWarnLog;
    private int getLevel;
    private static final byte[] AFInAppEventParameterName = AFg1ySDK.AFInAppEventType;
    private static final int[] AFKeystoreWrapper = AFg1ySDK.valueOf;
    private static final int[] values = AFg1ySDK.AFInAppEventParameterName;
    private static final int[] AFInAppEventType = AFg1ySDK.values;
    private static final int[] valueOf = AFg1ySDK.AFKeystoreWrapper;

    public AFg1xSDK(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        super(inputStream);
        this.AFLogger = new int[4];
        this.afErrorLog = new byte[16];
        this.afWarnLog = new byte[16];
        this.getLevel = Integer.MAX_VALUE;
        this.AFVersionDeclaration = 16;
        this.afErrorLogForExcManagerOnly = 16;
        this.afRDLog = i;
        this.afInfoLog = AFg1ySDK.valueOf(bArr, i);
        this.afDebugLog = valueOf(bArr2);
    }

    private static byte[][] valueOf(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            int i2 = 0;
            while (true) {
                byte[] bArr3 = bArr[i];
                if (i2 < bArr3.length) {
                    bArr2[i][bArr3[i2]] = (byte) i2;
                    i2++;
                }
            }
        }
        return bArr2;
    }

    private int values() throws IOException {
        if (this.getLevel == Integer.MAX_VALUE) {
            this.getLevel = ((FilterInputStream) this).in.read();
        }
        if (this.AFVersionDeclaration == 16) {
            byte[] bArr = this.afErrorLog;
            int i = this.getLevel;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.afErrorLog, i2, 16 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 16);
            if (i2 >= 16) {
                values(this.afErrorLog, this.afWarnLog);
                int read2 = ((FilterInputStream) this).in.read();
                this.getLevel = read2;
                this.AFVersionDeclaration = 0;
                this.afErrorLogForExcManagerOnly = read2 < 0 ? 16 - (this.afWarnLog[15] & 255) : 16;
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.afErrorLogForExcManagerOnly;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        values();
        return this.afErrorLogForExcManagerOnly - this.AFVersionDeclaration;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        values();
        int i = this.AFVersionDeclaration;
        if (i >= this.afErrorLogForExcManagerOnly) {
            return -1;
        }
        byte[] bArr = this.afWarnLog;
        this.AFVersionDeclaration = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            values();
            int i5 = this.AFVersionDeclaration;
            if (i5 >= this.afErrorLogForExcManagerOnly) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.afWarnLog;
            this.AFVersionDeclaration = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    private void values(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.AFLogger;
        char c = 1;
        int i = (bArr[0] << Ascii.CAN) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.afInfoLog;
        iArr[0] = i ^ iArr2[0];
        iArr[1] = ((((bArr[4] << Ascii.CAN) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << Ascii.CAN) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        int i2 = bArr[12] << Ascii.CAN;
        iArr[3] = iArr2[3] ^ (((((bArr[13] & 255) << 16) | i2) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i3 = 1;
        int i4 = 4;
        while (i3 < this.afRDLog) {
            int[] iArr3 = AFKeystoreWrapper;
            int[] iArr4 = this.AFLogger;
            byte[][] bArr3 = this.afDebugLog;
            byte[] bArr4 = bArr3[0];
            int i5 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = values;
            byte[] bArr5 = bArr3[c];
            int i6 = i5 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = AFInAppEventType;
            byte[] bArr6 = bArr3[2];
            int i7 = iArr6[(iArr4[bArr6[0]] >>> 8) & 255] ^ i6;
            int[] iArr7 = valueOf;
            byte[] bArr7 = bArr3[3];
            int i8 = iArr7[iArr4[bArr7[0]] & 255] ^ i7;
            int[] iArr8 = this.afInfoLog;
            int i9 = i8 ^ iArr8[i4];
            int i10 = ((iArr6[(iArr4[bArr6[c]] >>> 8) & 255] ^ (iArr3[iArr4[bArr4[c]] >>> 24] ^ iArr5[(iArr4[bArr5[c]] >>> 16) & 255])) ^ iArr7[iArr4[bArr7[c]] & 255]) ^ iArr8[i4 + 1];
            int i11 = (((iArr5[(iArr4[bArr5[2]] >>> 16) & 255] ^ iArr3[iArr4[bArr4[2]] >>> 24]) ^ iArr6[(iArr4[bArr6[2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[2]] & 255]) ^ iArr8[i4 + 2];
            iArr4[0] = i9;
            iArr4[1] = i10;
            iArr4[2] = i11;
            iArr4[3] = (((iArr3[iArr4[bArr4[3]] >>> 24] ^ iArr5[(iArr4[bArr5[3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[3]] & 255]) ^ iArr8[i4 + 3];
            i3++;
            i4 += 4;
            c = 1;
        }
        int[] iArr9 = this.afInfoLog;
        int i12 = iArr9[i4];
        byte[] bArr8 = AFInAppEventParameterName;
        int[] iArr10 = this.AFLogger;
        byte[][] bArr9 = this.afDebugLog;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i12 >>> 24));
        byte[] bArr11 = bArr9[1];
        bArr2[1] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i12 >>> 16));
        byte[] bArr12 = bArr9[2];
        bArr2[2] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i12 >>> 8));
        byte[] bArr13 = bArr9[3];
        bArr2[3] = (byte) (bArr8[iArr10[bArr13[0]] & 255] ^ i12);
        int i13 = iArr9[i4 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[1]] >>> 24] ^ (i13 >>> 24));
        bArr2[5] = (byte) (bArr8[(iArr10[bArr11[1]] >>> 16) & 255] ^ (i13 >>> 16));
        bArr2[6] = (byte) (bArr8[(iArr10[bArr12[1]] >>> 8) & 255] ^ (i13 >>> 8));
        bArr2[7] = (byte) (i13 ^ bArr8[iArr10[bArr13[1]] & 255]);
        int i14 = iArr9[i4 + 2];
        bArr2[8] = (byte) (bArr8[iArr10[bArr10[2]] >>> 24] ^ (i14 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[2]] >>> 16) & 255] ^ (i14 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[2]] >>> 8) & 255] ^ (i14 >>> 8));
        bArr2[11] = (byte) (i14 ^ bArr8[iArr10[bArr13[2]] & 255]);
        int i15 = iArr9[i4 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[3]] >>> 24] ^ (i15 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[3]] >>> 16) & 255] ^ (i15 >>> 16));
        bArr2[14] = (byte) (bArr8[(iArr10[bArr12[3]] >>> 8) & 255] ^ (i15 >>> 8));
        bArr2[15] = (byte) (i15 ^ bArr8[iArr10[bArr13[3]] & 255]);
    }
}
