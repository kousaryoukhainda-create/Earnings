package defpackage;
/* renamed from: nc  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2255nc extends Exception {
    public Throwable b;
    public final String c;

    public C2255nc(String str) {
        super(str);
        this.c = str;
        initCause(null);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        Throwable th;
        th = this.b;
        if (th == this) {
            th = null;
        }
        return th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable initCause(Throwable th) {
        this.b = th;
        return this;
    }

    public C2255nc(Exception exc) {
        super("by " + exc.toString());
        this.c = null;
        initCause(exc);
    }

    public C2255nc(String str, Exception exc) {
        this(str);
        initCause(exc);
    }

    public C2255nc(C2926vO c2926vO) {
        this("cannot find " + c2926vO.getMessage(), c2926vO);
    }

    public C2255nc(C2089lf c2089lf) {
        this("[source error] " + c2089lf.b, c2089lf);
    }
}
