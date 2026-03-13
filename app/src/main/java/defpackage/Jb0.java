package defpackage;

import android.view.View;
import android.view.autofill.AutofillId;
import androidx.annotation.NonNull;
import java.util.Collection;
/* renamed from: Jb0  reason: default package */
/* loaded from: classes.dex */
public abstract class Jb0 {
    public static void a(@NonNull View view, Collection<View> collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    public static AutofillId b(View view) {
        return view.getAutofillId();
    }

    public static int c(View view) {
        return view.getImportantForAutofill();
    }

    public static int d(@NonNull View view) {
        return view.getNextClusterForwardId();
    }

    public static boolean e(@NonNull View view) {
        return view.hasExplicitFocusable();
    }

    public static boolean f(@NonNull View view) {
        return view.isFocusedByDefault();
    }

    public static boolean g(View view) {
        return view.isImportantForAutofill();
    }

    public static boolean h(@NonNull View view) {
        return view.isKeyboardNavigationCluster();
    }

    public static View i(@NonNull View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    public static boolean j(@NonNull View view) {
        return view.restoreDefaultFocus();
    }

    public static void k(@NonNull View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    public static void l(@NonNull View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    public static void m(View view, int i) {
        view.setImportantForAutofill(i);
    }

    public static void n(@NonNull View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    public static void o(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    public static void p(@NonNull View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
