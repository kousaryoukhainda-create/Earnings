package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class AFf1aSDK extends FilterInputStream {
    private byte[] AFInAppEventParameterName;
    private long[] AFInAppEventType;
    private short AFKeystoreWrapper;
    private int afDebugLog;
    private int afErrorLog;
    private int afInfoLog;
    private final int valueOf;
    private long[] values;

    public AFf1aSDK(InputStream inputStream, int i, int i2, short s, int i3, int i4) throws IOException {
        super(inputStream);
        this.afDebugLog = Integer.MAX_VALUE;
        int min = Math.min(Math.max((int) s, 4), 8);
        this.valueOf = min;
        this.AFInAppEventParameterName = new byte[min];
        this.AFInAppEventType = new long[4];
        this.values = new long[4];
        this.afInfoLog = min;
        this.afErrorLog = min;
        this.AFInAppEventType = AFg1zSDK.AFInAppEventType(i ^ i4, min ^ i4);
        this.values = AFg1zSDK.AFInAppEventType(i2 ^ i4, i3 ^ i4);
    }

    private void AFKeystoreWrapper() {
        long[] jArr = this.AFInAppEventType;
        long[] jArr2 = this.values;
        short s = this.AFKeystoreWrapper;
        long j = jArr2[(s + 2) % 4];
        int i = (s + 3) % 4;
        jArr2[i] = ((jArr[i] * 2147483085) + j) / 2147483647L;
        jArr[i] = ((jArr[s % 4] * 2147483085) + j) % 2147483647L;
        for (int i2 = 0; i2 < this.valueOf; i2++) {
            byte[] bArr = this.AFInAppEventParameterName;
            bArr[i2] = (byte) (bArr[i2] ^ ((this.AFInAppEventType[this.AFKeystoreWrapper] >> (i2 << 3)) & 255));
        }
        this.AFKeystoreWrapper = (short) ((this.AFKeystoreWrapper + 1) % 4);
    }

    private int valueOf() throws IOException {
        int i;
        if (this.afDebugLog == Integer.MAX_VALUE) {
            this.afDebugLog = ((FilterInputStream) this).in.read();
        }
        if (this.afInfoLog == this.valueOf) {
            byte[] bArr = this.AFInAppEventParameterName;
            int i2 = this.afDebugLog;
            bArr[0] = (byte) i2;
            if (i2 >= 0) {
                int i3 = 1;
                do {
                    int read = ((FilterInputStream) this).in.read(this.AFInAppEventParameterName, i3, this.valueOf - i3);
                    if (read <= 0) {
                        break;
                    }
                    i3 += read;
                } while (i3 < this.valueOf);
                if (i3 >= this.valueOf) {
                    AFKeystoreWrapper();
                    int read2 = ((FilterInputStream) this).in.read();
                    this.afDebugLog = read2;
                    this.afInfoLog = 0;
                    if (read2 < 0) {
                        int i4 = this.valueOf;
                        i = i4 - (this.AFInAppEventParameterName[i4 - 1] & 255);
                    } else {
                        i = this.valueOf;
                    }
                    this.afErrorLog = i;
                } else {
                    throw new IllegalStateException("unexpected block size");
                }
            } else {
                throw new IllegalStateException("unexpected block size");
            }
        }
        return this.afErrorLog;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        valueOf();
        return this.afErrorLog - this.afInfoLog;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        valueOf();
        int i = this.afInfoLog;
        if (i >= this.afErrorLog) {
            return -1;
        }
        byte[] bArr = this.AFInAppEventParameterName;
        this.afInfoLog = i + 1;
        return bArr[i] & 255;
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
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            valueOf();
            int i5 = this.afInfoLog;
            if (i5 >= this.afErrorLog) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.AFInAppEventParameterName;
            this.afInfoLog = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }
}
