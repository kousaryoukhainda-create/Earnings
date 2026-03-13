package io.flutter.util;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.annotation.NonNull;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes2.dex */
public final class ViewUtils {

    /* loaded from: classes2.dex */
    public interface DisplayUpdater {
        void updateDisplayMetrics(float f, float f2, float f3);
    }

    /* loaded from: classes2.dex */
    public interface ViewVisitor {
        boolean run(@NonNull View view);
    }

    public static /* synthetic */ boolean a(View view) {
        return view.hasFocus();
    }

    public static void calculateMaximumDisplayMetrics(Context context, @NonNull DisplayUpdater displayUpdater) {
        Rect rect;
        Gd0 dd0;
        Pd0 _windowInsetsCompat;
        Object systemService;
        WindowMetrics maximumWindowMetrics;
        Activity context2 = getActivity(context);
        if (context2 != null) {
            int i = Wd0.a;
            Xd0.a.getClass();
            Yd0 it = Yd0.b;
            Intrinsics.checkNotNullParameter(it, "it");
            Intrinsics.checkNotNullParameter(context2, "activity");
            Intrinsics.checkNotNullParameter(context2, "context");
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                Intrinsics.checkNotNullParameter(context2, "context");
                systemService = context2.getSystemService(WindowManager.class);
                maximumWindowMetrics = ((WindowManager) systemService).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                Intrinsics.checkNotNullExpressionValue(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService2 = context2.getSystemService("window");
                Intrinsics.c(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
                Display display = ((WindowManager) systemService2).getDefaultDisplay();
                Intrinsics.checkNotNullExpressionValue(display, "display");
                Point c = Yd0.c(display);
                rect = new Rect(0, 0, c.x, c.y);
            }
            if (i2 >= 30) {
                Intrinsics.checkNotNullParameter(context2, "context");
                if (i2 >= 30) {
                    _windowInsetsCompat = C2610ri.a.a(context2);
                } else {
                    throw new Exception("Incompatible SDK version");
                }
            } else {
                if (i2 >= 30) {
                    dd0 = new Fd0();
                } else if (i2 >= 29) {
                    dd0 = new Ed0();
                } else {
                    dd0 = new Dd0();
                }
                _windowInsetsCompat = dd0.b();
                Intrinsics.checkNotNullExpressionValue(_windowInsetsCompat, "{\n            WindowInse…ilder().build()\n        }");
            }
            C1367fb _bounds = new C1367fb(rect);
            Intrinsics.checkNotNullParameter(_bounds, "_bounds");
            Intrinsics.checkNotNullParameter(_windowInsetsCompat, "_windowInsetsCompat");
            displayUpdater.updateDisplayMetrics(_bounds.c().width(), _bounds.c().height(), context.getResources().getDisplayMetrics().density);
        }
    }

    public static boolean childHasFocus(View view) {
        return traverseHierarchy(view, new C2394p80(4));
    }

    public static Activity getActivity(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return getActivity(((ContextWrapper) context).getBaseContext());
    }

    public static boolean hasChildViewOfType(View view, Class<? extends View>[] clsArr) {
        return traverseHierarchy(view, new C2941vb0(clsArr, 1));
    }

    public static /* synthetic */ boolean lambda$hasChildViewOfType$1(Class[] clsArr, View view) {
        for (Class cls : clsArr) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public static boolean traverseHierarchy(View view, @NonNull ViewVisitor viewVisitor) {
        if (view == null) {
            return false;
        }
        if (viewVisitor.run(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (traverseHierarchy(viewGroup.getChildAt(i), viewVisitor)) {
                    return true;
                }
            }
        }
        return false;
    }
}
