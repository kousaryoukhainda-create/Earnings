package defpackage;
/* renamed from: JA  reason: default package */
/* loaded from: classes.dex */
public final class JA implements OQ {
    static {
        if (C2197mt.a == null) {
            synchronized (C2197mt.class) {
                try {
                    if (C2197mt.a == null) {
                        Class cls = AbstractC2025kt.a;
                        C2197mt c2197mt = null;
                        if (cls != null) {
                            try {
                                c2197mt = (C2197mt) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c2197mt == null) {
                            c2197mt = C2197mt.b;
                        }
                        C2197mt.a = c2197mt;
                    }
                } finally {
                }
            }
        }
    }
}
