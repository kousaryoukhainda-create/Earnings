package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import com.fyber.inneractive.sdk.util.m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class d0 {
    public final WeakHashMap<Context, WeakHashMap<View, e>> b = new WeakHashMap<>();
    public final Map<Context, Pair<ViewTreeObserver, ViewTreeObserver.OnPreDrawListener>> a = new WeakHashMap();
    public final m<Rect> c = new m<>(16, new a(this));
    public final m<HashSet<View>> d = new m<>(16, new b(this));

    /* loaded from: classes.dex */
    public class a implements m.a<Rect> {
        public a(d0 d0Var) {
        }

        @Override // com.fyber.inneractive.sdk.util.m.a
        public Rect a() {
            return new Rect();
        }
    }

    /* loaded from: classes.dex */
    public class b implements m.a<HashSet<View>> {
        public b(d0 d0Var) {
        }

        @Override // com.fyber.inneractive.sdk.util.m.a
        public HashSet<View> a() {
            return new HashSet<>();
        }
    }

    /* loaded from: classes.dex */
    public class c implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            WeakHashMap<View, e> weakHashMap;
            float f;
            d0 d0Var = d0.this;
            Context context = this.a;
            d0Var.getClass();
            if (context != null && (weakHashMap = d0Var.b.get(context)) != null) {
                HashSet<View> a = d0Var.d.a();
                a.addAll(weakHashMap.keySet());
                Iterator<View> it = a.iterator();
                while (it.hasNext()) {
                    View next = it.next();
                    e eVar = weakHashMap.get(next);
                    if (eVar != null) {
                        Rect a2 = d0Var.c.a();
                        if (next != null && next.getParent() != null && next.isShown() && next.getGlobalVisibleRect(a2)) {
                            f = (a2.width() * a2.height()) / (next.getWidth() * next.getHeight());
                        } else {
                            f = 0.0f;
                        }
                        eVar.a(next, f, a2);
                        d0Var.c.a.offer(a2);
                    }
                }
                a.clear();
                d0Var.d.a.offer(a);
                return true;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static final d0 a = new d0();
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(View view, float f, Rect rect);
    }

    public static d0 a() {
        return d.a;
    }

    public final String b() {
        return "IAVisibilityTracker: ";
    }

    public final void c() {
        for (Context context : this.b.keySet()) {
            IAlog.a("%stracking context: %s", b(), context);
            WeakHashMap<View, e> weakHashMap = this.b.get(context);
            if (weakHashMap != null) {
                Iterator<View> it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    IAlog.a("%stracking view: %s", b(), it.next());
                }
            }
        }
    }

    public void a(Context context, View view, e eVar) {
        View rootView;
        ViewTreeObserver viewTreeObserver;
        IAlog.a("%strackView called with context: %s view: %s", b(), context, view);
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            WeakHashMap<View, e> weakHashMap = this.b.get(applicationContext);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap<>();
                this.b.put(applicationContext, weakHashMap);
                if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (activity.getWindow() != null) {
                        rootView = activity.getWindow().getDecorView();
                        viewTreeObserver = rootView.getViewTreeObserver();
                        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                            c cVar = new c(applicationContext);
                            viewTreeObserver.addOnPreDrawListener(cVar);
                            this.a.put(applicationContext, new Pair<>(viewTreeObserver, cVar));
                        }
                    }
                }
                rootView = view.getRootView();
                viewTreeObserver = rootView.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    c cVar2 = new c(applicationContext);
                    viewTreeObserver.addOnPreDrawListener(cVar2);
                    this.a.put(applicationContext, new Pair<>(viewTreeObserver, cVar2));
                }
            }
            weakHashMap.put(view, eVar);
            c();
            return;
        }
        throw new IllegalStateException("View must be attached to an Activity context");
    }

    public void a(View view) {
        IAlog.a("%sunTrackView called with view", b());
        if (view == null) {
            IAlog.a("%sunTrackView called with a null view!", b());
            return;
        }
        Context context = view.getContext();
        if (context == null) {
            IAlog.a("%sview.getContext() returned null!", b());
            return;
        }
        WeakHashMap<View, e> weakHashMap = this.b.get(context);
        if (weakHashMap != null) {
            a(context, weakHashMap, view);
        } else {
            Iterator it = new HashSet(this.b.keySet()).iterator();
            while (it.hasNext()) {
                Context context2 = (Context) it.next();
                WeakHashMap<View, e> weakHashMap2 = this.b.get(context2);
                if (weakHashMap2 != null) {
                    a(context2, weakHashMap2, view);
                }
            }
        }
        c();
    }

    public final void a(Context context, Map<View, e> map, View view) {
        if (map.remove(view) != null) {
            if (IAlog.a <= 2) {
                IAlog.d("removeViewFromContext found view for removal!", new Object[0]);
            }
            if (map.isEmpty()) {
                this.b.remove(context);
                Pair<ViewTreeObserver, ViewTreeObserver.OnPreDrawListener> pair = this.a.get(context);
                if (pair != null) {
                    if (((ViewTreeObserver) pair.first).isAlive()) {
                        ((ViewTreeObserver) pair.first).removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) pair.second);
                    }
                    this.a.remove(context);
                }
            }
        }
    }
}
