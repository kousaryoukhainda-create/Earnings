package defpackage;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.OutputStream;
/* renamed from: kk  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2013kk {
    public static final C2614rk b;
    public static final C2614rk c;
    public static final C2614rk d;
    public static final C2614rk e;
    public static final C2614rk f;
    public static final C2614rk g;
    public static final C2614rk h;
    public static final C2614rk i;
    public static final C2614rk j;
    public static final AbstractC2013kk[] k;
    public String a;

    static {
        k = r0;
        C2614rk c2614rk = new C2614rk("boolean", 'Z', "java.lang.Boolean", "booleanValue", "()Z", 172, 1);
        b = c2614rk;
        C2614rk c2614rk2 = new C2614rk("char", 'C', "java.lang.Character", "charValue", "()C", 172, 1);
        c = c2614rk2;
        C2614rk c2614rk3 = new C2614rk("byte", 'B', "java.lang.Byte", "byteValue", "()B", 172, 1);
        d = c2614rk3;
        C2614rk c2614rk4 = new C2614rk("short", 'S', "java.lang.Short", "shortValue", "()S", 172, 1);
        e = c2614rk4;
        C2614rk c2614rk5 = new C2614rk("int", 'I', "java.lang.Integer", "intValue", "()I", 172, 1);
        f = c2614rk5;
        C2614rk c2614rk6 = new C2614rk("long", 'J', "java.lang.Long", "longValue", "()J", 173, 2);
        g = c2614rk6;
        C2614rk c2614rk7 = new C2614rk("float", 'F', "java.lang.Float", "floatValue", "()F", 174, 1);
        h = c2614rk7;
        C2614rk c2614rk8 = new C2614rk("double", 'D', "java.lang.Double", "doubleValue", "()D", 175, 2);
        i = c2614rk8;
        C2614rk c2614rk9 = new C2614rk("void", 'V', "java.lang.Void", null, null, 177, 0);
        j = c2614rk9;
        AbstractC2013kk[] abstractC2013kkArr = {c2614rk, c2614rk2, c2614rk3, c2614rk4, c2614rk5, c2614rk6, c2614rk7, c2614rk8, c2614rk9};
    }

    public AbstractC2013kk(String str) {
        this.a = str;
    }

    public void a(C2529qk c2529qk) {
        b();
    }

    public void b() {
        if (!t()) {
            return;
        }
        throw new RuntimeException(AbstractC0324Hi.h(new StringBuilder(), this.a, " class is frozen"));
    }

    public void d(StringBuilder sb) {
        sb.append(this.a);
    }

    public C1150d1 e() {
        return null;
    }

    public C0319Hd f() {
        return null;
    }

    public C0397Kd g() {
        return null;
    }

    public AbstractC2013kk h() {
        return null;
    }

    public C2185mk[] i() {
        return new C2185mk[0];
    }

    public C2529qk[] j() {
        return new C2529qk[0];
    }

    public AbstractC2013kk k() {
        return null;
    }

    public C2271nk l(String str) {
        throw new Exception(str);
    }

    public C2271nk m(String str) {
        return null;
    }

    public AbstractC2013kk[] n() {
        return new AbstractC2013kk[0];
    }

    public abstract int o();

    public AbstractC2013kk[] p() {
        return new AbstractC2013kk[0];
    }

    public final String q() {
        String str = this.a;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    public AbstractC2013kk r() {
        return null;
    }

    public boolean t() {
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(hashCode()));
        sb.append('[');
        d(sb);
        sb.append(']');
        return sb.toString();
    }

    public boolean u() {
        return false;
    }

    public boolean v(AbstractC2013kk abstractC2013kk) {
        return false;
    }

    public boolean w(AbstractC2013kk abstractC2013kk) {
        if (this != abstractC2013kk && !this.a.equals(abstractC2013kk.a)) {
            return false;
        }
        return true;
    }

    public void x(DataOutputStream dataOutputStream) {
        throw new C2255nc("not a class");
    }

    public final byte[] y() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            x(dataOutputStream);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            dataOutputStream.close();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.OutputStream, jk] */
    public final void z(String str) {
        String str2 = this.a;
        StringBuilder l = AbstractC0324Hi.l(str);
        char c2 = File.separatorChar;
        l.append(c2);
        l.append(str2.replace('.', c2));
        l.append(".class");
        String sb = l.toString();
        int lastIndexOf = sb.lastIndexOf(c2);
        if (lastIndexOf > 0) {
            String substring = sb.substring(0, lastIndexOf);
            if (!substring.equals(".")) {
                new File(substring).mkdirs();
            }
        }
        ?? outputStream = new OutputStream();
        outputStream.b = null;
        outputStream.c = sb;
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(outputStream));
        try {
            x(dataOutputStream);
        } finally {
            dataOutputStream.close();
        }
    }

    public void c() {
    }

    public void s() {
    }
}
