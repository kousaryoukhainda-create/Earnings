package defpackage;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
/* renamed from: ZW  reason: default package */
/* loaded from: classes.dex */
public final class ZW implements InterfaceC1416g50, Closeable {
    public static final TreeMap k = new TreeMap();
    public volatile String b;
    public final long[] c;
    public final double[] d;
    public final String[] f;
    public final byte[][] g;
    public final int[] h;
    public final int i;
    public int j;

    public ZW(int i) {
        this.i = i;
        int i2 = i + 1;
        this.h = new int[i2];
        this.c = new long[i2];
        this.d = new double[i2];
        this.f = new String[i2];
        this.g = new byte[i2];
    }

    public static ZW c(int i, String str) {
        TreeMap treeMap = k;
        synchronized (treeMap) {
            try {
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    ZW zw = (ZW) ceilingEntry.getValue();
                    zw.b = str;
                    zw.j = i;
                    return zw;
                }
                ZW zw2 = new ZW(i);
                zw2.b = str;
                zw2.j = i;
                return zw2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC1416g50
    public final void a(C3148xz c3148xz) {
        for (int i = 1; i <= this.j; i++) {
            int i2 = this.h[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                c3148xz.b(i, this.g[i]);
                            }
                        } else {
                            c3148xz.f(i, this.f[i]);
                        }
                    } else {
                        ((SQLiteProgram) c3148xz.c).bindDouble(i, this.d[i]);
                    }
                } else {
                    c3148xz.c(i, this.c[i]);
                }
            } else {
                c3148xz.e(i);
            }
        }
    }

    @Override // defpackage.InterfaceC1416g50
    public final String b() {
        return this.b;
    }

    public final void e(int i, long j) {
        this.h[i] = 2;
        this.c[i] = j;
    }

    public final void f(int i) {
        this.h[i] = 1;
    }

    public final void h(int i, String str) {
        this.h[i] = 4;
        this.f[i] = str;
    }

    public final void release() {
        TreeMap treeMap = k;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.i), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
