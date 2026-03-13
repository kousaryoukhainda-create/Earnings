package com.iab.omid.library.applovin.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.utils.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes2.dex */
public class a {
    private final HashMap<View, String> a = new HashMap<>();
    private final HashMap<View, C0126a> b = new HashMap<>();
    private final HashMap<String, View> c = new HashMap<>();
    private final HashSet<View> d = new HashSet<>();
    private final HashSet<String> e = new HashSet<>();
    private final HashSet<String> f = new HashSet<>();
    private final HashMap<String, String> g = new HashMap<>();
    private final Map<View, Boolean> h = new WeakHashMap();
    private boolean i;

    /* renamed from: com.iab.omid.library.applovin.walking.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0126a {
        private final e a;
        private final ArrayList<String> b = new ArrayList<>();

        public C0126a(e eVar, String str) {
            this.a = eVar;
            a(str);
        }

        public e a() {
            return this.a;
        }

        public ArrayList<String> b() {
            return this.b;
        }

        public void a(String str) {
            this.b.add(str);
        }
    }

    private Boolean b(View view) {
        if (view.hasWindowFocus()) {
            this.h.remove(view);
            return Boolean.FALSE;
        } else if (this.h.containsKey(view)) {
            return this.h.get(view);
        } else {
            Map<View, Boolean> map = this.h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    public View a(String str) {
        return this.c.get(str);
    }

    public C0126a c(View view) {
        C0126a c0126a = this.b.get(view);
        if (c0126a != null) {
            this.b.remove(view);
        }
        return c0126a;
    }

    public String d(View view) {
        if (this.a.size() == 0) {
            return null;
        }
        String str = this.a.get(view);
        if (str != null) {
            this.a.remove(view);
        }
        return str;
    }

    public c e(View view) {
        return this.d.contains(view) ? c.PARENT_VIEW : this.i ? c.OBSTRUCTION_VIEW : c.UNDERLYING_VIEW;
    }

    public boolean f(View view) {
        if (this.h.containsKey(view)) {
            this.h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    private String a(View view) {
        if (view.isAttachedToWindow()) {
            if (b(view).booleanValue()) {
                return "noWindowFocus";
            }
            HashSet hashSet = new HashSet();
            while (view != null) {
                String a = h.a(view);
                if (a != null) {
                    return a;
                }
                hashSet.add(view);
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    public String b(String str) {
        return this.g.get(str);
    }

    public HashSet<String> c() {
        return this.e;
    }

    public void d() {
        this.i = true;
    }

    public void e() {
        com.iab.omid.library.applovin.internal.c c = com.iab.omid.library.applovin.internal.c.c();
        if (c != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : c.a()) {
                View c2 = aVar.c();
                if (aVar.f()) {
                    String adSessionId = aVar.getAdSessionId();
                    if (c2 != null) {
                        String a = a(c2);
                        if (a == null) {
                            this.e.add(adSessionId);
                            this.a.put(c2, adSessionId);
                            a(aVar);
                        } else if (a != "noWindowFocus") {
                            this.f.add(adSessionId);
                            this.c.put(adSessionId, c2);
                            this.g.put(adSessionId, a);
                        }
                    } else {
                        this.f.add(adSessionId);
                        this.g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    public void a() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.i = false;
    }

    public HashSet<String> b() {
        return this.f;
    }

    private void a(com.iab.omid.library.applovin.adsession.a aVar) {
        for (e eVar : aVar.d()) {
            a(eVar, aVar);
        }
    }

    private void a(e eVar, com.iab.omid.library.applovin.adsession.a aVar) {
        View view = eVar.c().get();
        if (view == null) {
            return;
        }
        C0126a c0126a = this.b.get(view);
        if (c0126a != null) {
            c0126a.a(aVar.getAdSessionId());
        } else {
            this.b.put(view, new C0126a(eVar, aVar.getAdSessionId()));
        }
    }
}
