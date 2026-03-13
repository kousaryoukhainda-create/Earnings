package com.iab.omid.library.fyber;

import android.content.Context;
import com.iab.omid.library.fyber.internal.f;
import com.iab.omid.library.fyber.internal.h;
import com.iab.omid.library.fyber.utils.e;
import com.iab.omid.library.fyber.utils.g;
/* loaded from: classes2.dex */
public class b {
    private boolean a;

    private void b(Context context) {
        g.a(context, "Application Context cannot be null");
    }

    public String a() {
        return "1.4.9-Fyber";
    }

    public void c() {
        g.a();
        com.iab.omid.library.fyber.internal.a.a().d();
    }

    public void a(Context context) {
        b(context);
        if (b()) {
            return;
        }
        a(true);
        h.c().a(context);
        com.iab.omid.library.fyber.internal.b.g().a(context);
        com.iab.omid.library.fyber.utils.a.a(context);
        com.iab.omid.library.fyber.utils.c.a(context);
        e.a(context);
        f.b().a(context);
        com.iab.omid.library.fyber.internal.a.a().a(context);
    }

    public boolean b() {
        return this.a;
    }

    public void a(boolean z) {
        this.a = z;
    }
}
