package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class b {
    public final File a;
    public final File b;

    /* loaded from: classes.dex */
    public static final class a extends OutputStream {
        public final FileOutputStream a;
        public boolean b = false;

        public a(File file) throws FileNotFoundException {
            this.a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.b) {
                return;
            }
            this.b = true;
            this.a.flush();
            try {
                this.a.getFD().sync();
            } catch (IOException e) {
                Log.w("AtomicFile", "Failed to sync file descriptor:", e);
            }
            this.a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            this.a.write(i);
        }

        @Override // java.io.OutputStream
        public void write(@NonNull byte[] bArr) throws IOException {
            this.a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(@NonNull byte[] bArr, int i, int i2) throws IOException {
            this.a.write(bArr, i, i2);
        }
    }

    public b(File file) {
        this.a = file;
        this.b = new File(file.getPath() + ".bak");
    }

    public InputStream a() throws FileNotFoundException {
        if (this.b.exists()) {
            this.a.delete();
            this.b.renameTo(this.a);
        }
        return new FileInputStream(this.a);
    }

    public OutputStream b() throws IOException {
        if (this.a.exists()) {
            if (!this.b.exists()) {
                if (!this.a.renameTo(this.b)) {
                    Log.w("AtomicFile", "Couldn't rename file " + this.a + " to backup file " + this.b);
                }
            } else {
                this.a.delete();
            }
        }
        try {
            return new a(this.a);
        } catch (FileNotFoundException unused) {
            if (this.a.getParentFile().mkdirs()) {
                try {
                    return new a(this.a);
                } catch (FileNotFoundException unused2) {
                    throw new IOException("Couldn't create " + this.a);
                }
            }
            throw new IOException("Couldn't create directory " + this.a);
        }
    }
}
