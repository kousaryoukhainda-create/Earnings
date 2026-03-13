package defpackage;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
/* renamed from: wg  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3036wg {
    public static final Charset e = Charset.forName("UTF-8");
    public static final Pattern f = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    public static final Pattern g = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    public final HashSet a = new HashSet();
    public final Executor b;
    public final C2435pg c;
    public final C2435pg d;

    public C3036wg(Executor executor, C2435pg c2435pg, C2435pg c2435pg2) {
        this.b = executor;
        this.c = c2435pg;
        this.d = c2435pg2;
    }

    public static HashSet b(C2435pg c2435pg) {
        HashSet hashSet = new HashSet();
        C2606rg c = c2435pg.c();
        if (c == null) {
            return hashSet;
        }
        Iterator<String> keys = c.b.keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    public final void a(NV nv) {
        synchronized (this.a) {
            this.a.add(nv);
        }
    }
}
