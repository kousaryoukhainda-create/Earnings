package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import com.ykapps.earnings.R;
import java.util.Objects;
/* renamed from: Lb0  reason: default package */
/* loaded from: classes.dex */
public abstract class Lb0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(@NonNull View view, @NonNull Qb0 qb0) {
        Z10 z10 = (Z10) view.getTag(R.id.tag_unhandled_key_listeners);
        Z10 z102 = z10;
        if (z10 == null) {
            Z10 z103 = new Z10();
            view.setTag(R.id.tag_unhandled_key_listeners, z103);
            z102 = z103;
        }
        Objects.requireNonNull(qb0);
        ?? obj = new Object();
        z102.put(qb0, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(@NonNull View view, @NonNull Qb0 qb0) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        Z10 z10 = (Z10) view.getTag(R.id.tag_unhandled_key_listeners);
        if (z10 != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) z10.getOrDefault(qb0, null)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, AbstractC1251e9 abstractC1251e9) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
