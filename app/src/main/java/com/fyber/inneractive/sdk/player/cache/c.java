package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.util.IAlog;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class c implements Closeable {
    public static final Pattern p = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream q = new b();
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final int e;
    public long f;
    public final int g;
    public Writer i;
    public int k;
    public e l;
    public long h = 0;
    public final LinkedHashMap<String, d> j = new LinkedHashMap<>(0, 0.75f, true);
    public long m = 0;
    public final ThreadPoolExecutor n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final Callable<Void> o = new a();

    /* loaded from: classes.dex */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            synchronized (c.this) {
                try {
                    c cVar = c.this;
                    if (cVar.i != null) {
                        cVar.f();
                        if (c.this.b()) {
                            c.this.e();
                            c.this.k = 0;
                        }
                        return null;
                    }
                    return null;
                } finally {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b extends OutputStream {
        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.cache.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0079c {
        public final d a;
        public final boolean[] b;
        public boolean c;

        public C0079c(d dVar) {
            boolean[] zArr;
            this.a = dVar;
            if (dVar.c) {
                zArr = null;
            } else {
                zArr = new boolean[c.this.g];
            }
            this.b = zArr;
        }

        /* renamed from: com.fyber.inneractive.sdk.player.cache.c$c$a */
        /* loaded from: classes.dex */
        public class a extends FilterOutputStream {
            public a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0079c.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0079c.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    C0079c.this.c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C0079c.this.c = true;
                }
            }
        }

        public OutputStream a(int i) throws IOException {
            FileOutputStream fileOutputStream;
            a aVar;
            if (i >= 0) {
                c cVar = c.this;
                if (i < cVar.g) {
                    synchronized (cVar) {
                        try {
                            d dVar = this.a;
                            if (dVar.d == this) {
                                if (!dVar.c) {
                                    this.b[i] = true;
                                }
                                File b = dVar.b(i);
                                try {
                                    fileOutputStream = new FileOutputStream(b);
                                } catch (FileNotFoundException unused) {
                                    c.this.a.mkdirs();
                                    try {
                                        fileOutputStream = new FileOutputStream(b);
                                    } catch (FileNotFoundException unused2) {
                                        return c.q;
                                    }
                                }
                                aVar = new a(fileOutputStream);
                            } else {
                                throw new IllegalStateException();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return aVar;
                }
            }
            StringBuilder i2 = AbstractC0324Hi.i(i, "Expected index ", " to be greater than 0 and less than the maximum value count of ");
            i2.append(c.this.g);
            throw new IllegalArgumentException(i2.toString());
        }

        public void a() throws IOException {
            c.a(c.this, this, false);
        }
    }

    /* loaded from: classes.dex */
    public final class d {
        public final String a;
        public final long[] b;
        public boolean c;
        public C0079c d;
        public long e;

        public d(String str) {
            this.a = str;
            this.b = new long[c.this.g];
        }

        public File b(int i) {
            File file = c.this.a;
            return new File(file, this.a + "." + i + ".tmp");
        }

        public String a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        public File a(int i) {
            File file = c.this.a;
            return new File(file, this.a + "." + i);
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    /* loaded from: classes.dex */
    public final class f implements Closeable {
        public final InputStream[] a;

        public f(c cVar, String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.a = inputStreamArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.a) {
                m.a(inputStream);
            }
        }
    }

    public c(File file, int i, int i2, long j) {
        this.a = file;
        this.e = i;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.g = i2;
        this.f = j;
    }

    public synchronized f b(String str) throws IOException {
        InputStream inputStream;
        a();
        e(str);
        d dVar = this.j.get(str);
        if (dVar == null) {
            return null;
        }
        if (dVar.c) {
            InputStream[] inputStreamArr = new InputStream[this.g];
            for (int i = 0; i < this.g; i++) {
                try {
                    inputStreamArr[i] = new FileInputStream(dVar.a(i));
                } catch (FileNotFoundException unused) {
                    for (int i2 = 0; i2 < this.g && (inputStream = inputStreamArr[i2]) != null; i2++) {
                        m.a(inputStream);
                    }
                    return null;
                }
            }
            this.k++;
            this.i.append((CharSequence) ("READ " + str + '\n'));
            if (b()) {
                this.n.submit(this.o);
            }
            return new f(this, str, dVar.e, inputStreamArr, dVar.b);
        }
        return null;
    }

    public final void c(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            d dVar = this.j.get(substring);
            if (dVar == null) {
                dVar = new d(substring);
                this.j.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.c = true;
                dVar.d = null;
                if (split.length == c.this.g) {
                    for (int i2 = 0; i2 < split.length; i2++) {
                        try {
                            dVar.b[i2] = Long.parseLong(split[i2]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.d = new C0079c(dVar);
                return;
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(str));
            } else {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.i == null) {
                return;
            }
            Iterator it = new ArrayList(this.j.values()).iterator();
            while (it.hasNext()) {
                C0079c c0079c = ((d) it.next()).d;
                if (c0079c != null) {
                    c0079c.a();
                }
            }
            f();
            this.i.close();
            this.i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() throws IOException {
        l lVar = new l(new FileInputStream(this.b), 8192, m.a);
        try {
            String b2 = lVar.b();
            String b3 = lVar.b();
            String b4 = lVar.b();
            String b5 = lVar.b();
            String b6 = lVar.b();
            if (!"libcore.io.DiskLruCache".equals(b2) || !"1".equals(b3) || !Integer.toString(this.e).equals(b4) || !Integer.toString(this.g).equals(b5) || !"".equals(b6)) {
                throw new IOException("unexpected journal header: [" + b2 + ", " + b3 + ", " + b5 + ", " + b6 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    c(lVar.b());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.j.size();
                    if (lVar.e == -1) {
                        e();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), m.a));
                    }
                    m.a(lVar);
                    return;
                }
            }
        } catch (Throwable th) {
            m.a(lVar);
            throw th;
        }
    }

    public final synchronized void e() throws IOException {
        try {
            Writer writer = this.i;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), m.a));
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.e));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.g));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.j.values()) {
                if (dVar.d != null) {
                    bufferedWriter.write("DIRTY " + dVar.a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + dVar.a + dVar.a() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.b.exists()) {
                a(this.b, this.d, true);
            }
            a(this.c, this.b, false);
            this.d.delete();
            this.i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), m.a));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void f() throws IOException {
        while (this.h > this.f) {
            String key = this.j.entrySet().iterator().next().getKey();
            e eVar = this.l;
            if (eVar != null) {
                if (((n) eVar).a(this, key)) {
                    d(key);
                } else {
                    boolean z = false;
                    for (String str : this.j.keySet()) {
                        if (((n) this.l).a(this, str)) {
                            z |= d(str);
                        }
                    }
                    if (!z) {
                        return;
                    }
                }
            } else {
                d(key);
            }
        }
    }

    public static void a(c cVar, C0079c c0079c, boolean z) throws IOException {
        synchronized (cVar) {
            d dVar = c0079c.a;
            if (dVar.d == c0079c) {
                if (z && !dVar.c) {
                    for (int i = 0; i < cVar.g; i++) {
                        if (c0079c.b[i]) {
                            if (!dVar.b(i).exists()) {
                                c0079c.a();
                                return;
                            }
                        } else {
                            c0079c.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                        }
                    }
                }
                for (int i2 = 0; i2 < cVar.g; i2++) {
                    File b2 = dVar.b(i2);
                    if (z) {
                        if (b2.exists()) {
                            File a2 = dVar.a(i2);
                            b2.renameTo(a2);
                            long j = dVar.b[i2];
                            long length = a2.length();
                            dVar.b[i2] = length;
                            cVar.h = (cVar.h - j) + length;
                        }
                    } else {
                        a(b2);
                    }
                }
                cVar.k++;
                dVar.d = null;
                if (dVar.c | z) {
                    dVar.c = true;
                    cVar.i.write("CLEAN " + dVar.a + dVar.a() + '\n');
                    if (z) {
                        long j2 = cVar.m;
                        cVar.m = 1 + j2;
                        dVar.e = j2;
                    }
                } else {
                    cVar.j.remove(dVar.a);
                    cVar.i.write("REMOVE " + dVar.a + '\n');
                }
                cVar.i.flush();
                if (cVar.h > cVar.f || cVar.b()) {
                    cVar.n.submit(cVar.o);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final boolean b() {
        int i = this.k;
        return i >= 2000 && i >= this.j.size();
    }

    public synchronized boolean d(String str) throws IOException {
        synchronized (this) {
            try {
                IAlog.d("DiskLruCache remove %s", str);
                a();
                e(str);
                d dVar = this.j.get(str);
                if (dVar != null && dVar.d == null) {
                    for (int i = 0; i < this.g; i++) {
                        File a2 = dVar.a(i);
                        if (a2.exists() && !a2.delete()) {
                            throw new IOException("failed to delete " + a2);
                        }
                        long j = this.h;
                        long[] jArr = dVar.b;
                        this.h = j - jArr[i];
                        jArr[i] = 0;
                    }
                    this.k++;
                    this.i.append((CharSequence) ("REMOVE " + str + '\n'));
                    this.j.remove(str);
                    if (b()) {
                        this.n.submit(this.o);
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    public final void c() throws IOException {
        a(this.c);
        Iterator<d> it = this.j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.d == null) {
                while (i < this.g) {
                    this.h += next.b[i];
                    i++;
                }
            } else {
                next.d = null;
                while (i < this.g) {
                    a(next.a(i));
                    a(next.b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void e(String str) {
        if (!p.matcher(str).matches()) {
            throw new IllegalArgumentException(AbstractC2437ph.h("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public static c a(File file, int i, int i2, long j) throws IOException {
        if (j > 0) {
            if (i2 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        a(file2, file3, false);
                    }
                }
                c cVar = new c(file, i, i2, j);
                if (cVar.b.exists()) {
                    try {
                        cVar.d();
                        cVar.c();
                        return cVar;
                    } catch (IOException e2) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                        IAlog.d("DiskLruCache delete cache", new Object[0]);
                        cVar.close();
                        m.a(cVar.a);
                    }
                }
                file.mkdirs();
                c cVar2 = new c(file, i, i2, j);
                cVar2.e();
                return cVar2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void a(File file) throws IOException {
        IAlog.d("DiskLruCache deleteIfExists - %s", file);
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void a(File file, File file2, boolean z) throws IOException {
        if (z) {
            a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public File a(String str, int i) {
        a();
        e(str);
        d dVar = this.j.get(str);
        if (dVar == null) {
            return null;
        }
        return dVar.a(i);
    }

    public C0079c a(String str) throws IOException {
        synchronized (this) {
            try {
                a();
                e(str);
                d dVar = this.j.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.j.put(str, dVar);
                } else if (dVar.d != null) {
                    return null;
                }
                C0079c c0079c = new C0079c(dVar);
                dVar.d = c0079c;
                Writer writer = this.i;
                writer.write("DIRTY " + str + '\n');
                this.i.flush();
                return c0079c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
    }
}
