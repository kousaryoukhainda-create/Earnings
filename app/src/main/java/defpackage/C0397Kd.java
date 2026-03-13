package defpackage;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
/* renamed from: Kd  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0397Kd {
    public static C0397Kd f;
    public int a;
    public final VA b;
    public final Hashtable c = new Hashtable(191);
    public Hashtable d;
    public final ArrayList e;

    public C0397Kd() {
        this.d = null;
        VA va = new VA(11, false);
        va.c = null;
        this.b = va;
        AbstractC2013kk[] abstractC2013kkArr = AbstractC2013kk.k;
        for (int i = 0; i < 9; i++) {
            Hashtable hashtable = this.c;
            AbstractC2013kk abstractC2013kk = abstractC2013kkArr[i];
            hashtable.put(abstractC2013kk.a, abstractC2013kk);
        }
        this.d = null;
        this.a = 0;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        arrayList.add("java.lang");
    }

    public static synchronized C0397Kd f() {
        C0397Kd c0397Kd;
        synchronized (C0397Kd.class) {
            try {
                if (f == null) {
                    C0397Kd c0397Kd2 = new C0397Kd();
                    f = c0397Kd2;
                    c0397Kd2.a();
                }
                c0397Kd = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0397Kd;
    }

    public final void a() {
        VA va = this.b;
        va.getClass();
        if (C0319Hd.n < 53) {
            Oc0 oc0 = new Oc0(8, false);
            oc0.c = Object.class;
            va.s(oc0);
            return;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        VA va2 = new VA(28, false);
        va2.c = new WeakReference(contextClassLoader);
        va.s(va2);
    }

    public final void b() {
        int i = this.a;
        this.a = i + 1;
        if (i > 100) {
            this.a = 0;
            Enumeration elements = this.c.elements();
            while (elements.hasMoreElements()) {
                ((AbstractC2013kk) elements.nextElement()).c();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kk, hk] */
    public final AbstractC2013kk c(String str) {
        URL url;
        URL url2;
        if (str.charAt(0) == '[') {
            str = AbstractC0957bf.m0(str);
        }
        if (str.endsWith("[]")) {
            String substring = str.substring(0, str.indexOf(91));
            if (((AbstractC2013kk) this.c.get(substring)) == null) {
                C0750Xt c0750Xt = (C0750Xt) this.b.c;
                while (true) {
                    if (c0750Xt != null) {
                        url2 = ((InterfaceC0371Jd) c0750Xt.d).j(substring);
                        if (url2 != null) {
                            break;
                        }
                        c0750Xt = (C0750Xt) c0750Xt.c;
                    } else {
                        url2 = null;
                        break;
                    }
                }
                if (url2 == null) {
                    return null;
                }
            }
            ?? abstractC2013kk = new AbstractC2013kk(str);
            abstractC2013kk.m = null;
            abstractC2013kk.l = this;
            return abstractC2013kk;
        }
        C0750Xt c0750Xt2 = (C0750Xt) this.b.c;
        while (true) {
            if (c0750Xt2 != null) {
                url = ((InterfaceC0371Jd) c0750Xt2.d).j(str);
                if (url != null) {
                    break;
                }
                c0750Xt2 = (C0750Xt) c0750Xt2.c;
            } else {
                url = null;
                break;
            }
        }
        if (url == null) {
            return null;
        }
        return new C2099lk(str, this);
    }

    public final AbstractC2013kk d(String str) {
        AbstractC2013kk abstractC2013kk;
        if (str == null) {
            abstractC2013kk = null;
        } else {
            synchronized (this) {
                abstractC2013kk = (AbstractC2013kk) this.c.get(str);
                if (abstractC2013kk == null) {
                    abstractC2013kk = c(str);
                    if (abstractC2013kk != null) {
                        this.c.put(abstractC2013kk.a, abstractC2013kk);
                    }
                }
            }
        }
        if (abstractC2013kk != null) {
            abstractC2013kk.s();
            return abstractC2013kk;
        }
        throw new Exception(str);
    }

    public final AbstractC2013kk e(String str) {
        if (str.charAt(0) == '[') {
            return AbstractC0957bf.o0(str, this);
        }
        return d(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [Tu] */
    /* JADX WARN: Type inference failed for: r1v5, types: [tB] */
    /* JADX WARN: Type inference failed for: r1v7, types: [VA] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.io.FilenameFilter, java.lang.Object] */
    public final void g(String str) {
        Object c0647Tu;
        VA va = this.b;
        va.getClass();
        String lowerCase = str.toLowerCase();
        if (!lowerCase.endsWith(".jar") && !lowerCase.endsWith(".zip")) {
            int length = str.length();
            if (length > 2 && str.charAt(length - 1) == '*') {
                int i = length - 2;
                if (str.charAt(i) == '/' || str.charAt(i) == File.separatorChar) {
                    String substring = str.substring(0, i);
                    c0647Tu = new VA(27, false);
                    File[] listFiles = new File(substring).listFiles((FilenameFilter) new Object());
                    if (listFiles != null) {
                        c0647Tu.c = new C0647Tu[listFiles.length];
                        for (int i2 = 0; i2 < listFiles.length; i2++) {
                            ((C0647Tu[]) c0647Tu.c)[i2] = new C0647Tu(listFiles[i2].getPath());
                        }
                    }
                }
            }
            c0647Tu = new C2741tB(4);
            c0647Tu.c = str;
        } else {
            c0647Tu = new C0647Tu(str);
        }
        synchronized (va) {
            va.c = new C0750Xt(12, c0647Tu, (C0750Xt) va.c);
        }
    }

    public final C2099lk h(C0319Hd c0319Hd) {
        b();
        C2099lk c2099lk = new C2099lk(null, this);
        c2099lk.p = c0319Hd;
        c2099lk.a = c0319Hd.k;
        c2099lk.b();
        this.c.put(c2099lk.a, c2099lk);
        return c2099lk;
    }

    public final void i(DataOutputStream dataOutputStream, String str) {
        InputStream n = this.b.n(str);
        if (n != null) {
            int i = 4096;
            byte[] bArr = null;
            for (int i2 = 0; i2 < 64; i2++) {
                if (i2 < 8) {
                    i *= 2;
                    try {
                        bArr = new byte[i];
                    } catch (Throwable th) {
                        n.close();
                        throw th;
                    }
                }
                int i3 = 0;
                do {
                    int read = n.read(bArr, i3, i - i3);
                    if (read >= 0) {
                        i3 += read;
                    } else {
                        dataOutputStream.write(bArr, 0, i3);
                        n.close();
                        return;
                    }
                } while (i3 < i);
                dataOutputStream.write(bArr);
            }
            throw new IOException("too much data");
        }
        throw new Exception(str);
    }

    public final String toString() {
        return this.b.toString();
    }
}
