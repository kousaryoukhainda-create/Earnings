package com.fyber.inneractive.sdk.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class i0 {

    /* loaded from: classes.dex */
    public class a extends BufferedInputStream {
        public final /* synthetic */ AtomicInteger a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InputStream inputStream, AtomicInteger atomicInteger) {
            super(inputStream);
            this.a = atomicInteger;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
            int read;
            read = super.read(bArr, i, i2);
            if (read != -1) {
                this.a.getAndAdd(read);
            }
            return read;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() throws IOException {
            this.a.set(0);
            super.reset();
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
        public synchronized long skip(long j) throws IOException {
            long skip;
            skip = super.skip(j);
            this.a.addAndGet((int) skip);
            return skip;
        }
    }

    public static Bitmap a(InputStream inputStream, int i) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Bitmap decodeStream = BitmapFactory.decodeStream(new a(inputStream, atomicInteger));
        if (atomicInteger.get() != i) {
            return null;
        }
        return decodeStream;
    }
}
