package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.ykapps.earnings.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
/* renamed from: Sb0  reason: default package */
/* loaded from: classes.dex */
public abstract class Sb0 {
    public static Field a = null;
    public static boolean b = false;
    public static ThreadLocal c;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final Cb0 e = new Object();
    public static final Eb0 f = new Eb0();

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Mb0.a(view);
        }
        if (b) {
            return null;
        }
        if (a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                b = true;
                return null;
            }
        }
        try {
            Object obj = a.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            b = true;
            return null;
        }
    }

    public static ArrayList b(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static Rect c() {
        if (c == null) {
            c = new ThreadLocal();
        }
        Rect rect = (Rect) c.get();
        if (rect == null) {
            rect = new Rect();
            c.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] d(AbstractC0909b4 abstractC0909b4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return Ob0.a(abstractC0909b4);
        }
        return (String[]) abstractC0909b4.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void e(int i, View view) {
        Object tag;
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        CharSequence charSequence = null;
        if (i2 >= 28) {
            tag = Lb0.b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        if (((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = 32;
        if (view.getAccessibilityLiveRegion() == 0 && !z) {
            if (i == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                obtain.setContentChangeTypes(i);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                List<CharSequence> text = obtain.getText();
                if (i2 >= 28) {
                    charSequence = Lb0.b(view);
                } else {
                    Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                    if (CharSequence.class.isInstance(tag2)) {
                        charSequence = tag2;
                    }
                }
                text.add(charSequence);
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                    return;
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z) {
            i3 = 2048;
        }
        obtain2.setEventType(i3);
        obtain2.setContentChangeTypes(i);
        if (z) {
            List<CharSequence> text2 = obtain2.getText();
            if (i2 >= 28) {
                charSequence = Lb0.b(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequence = tag3;
                }
            }
            text2.add(charSequence);
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static void f(int i, View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect c2 = c();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            c2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !c2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            n(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                n((View) parent2);
            }
        }
        if (z && c2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(c2);
        }
    }

    public static void g(int i, View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect c2 = c();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            c2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !c2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            n(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                n((View) parent2);
            }
        }
        if (z && c2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(c2);
        }
    }

    public static C1295ei h(View view, C1295ei c1295ei) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c1295ei + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Ob0.b(view, c1295ei);
        }
        InterfaceC1269eQ interfaceC1269eQ = (InterfaceC1269eQ) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC1355fQ interfaceC1355fQ = e;
        if (interfaceC1269eQ != null) {
            C1295ei a2 = ((C1960k60) interfaceC1269eQ).a(view, c1295ei);
            if (a2 == null) {
                return null;
            }
            if (view instanceof InterfaceC1355fQ) {
                interfaceC1355fQ = (InterfaceC1355fQ) view;
            }
            return interfaceC1355fQ.a(a2);
        }
        if (view instanceof InterfaceC1355fQ) {
            interfaceC1355fQ = (InterfaceC1355fQ) view;
        }
        return interfaceC1355fQ.a(c1295ei);
    }

    public static void i(int i, View view) {
        ArrayList b2 = b(view);
        for (int i2 = 0; i2 < b2.size(); i2++) {
            if (((L0) b2.get(i2)).a() == i) {
                b2.remove(i2);
                return;
            }
        }
    }

    public static void j(View view, L0 l0, InterfaceC0988c1 interfaceC0988c1) {
        F0 f0;
        L0 l02 = new L0(null, l0.b, null, interfaceC0988c1, l0.c);
        View.AccessibilityDelegate a2 = a(view);
        if (a2 == null) {
            f0 = null;
        } else if (a2 instanceof E0) {
            f0 = ((E0) a2).a;
        } else {
            f0 = new F0(a2);
        }
        if (f0 == null) {
            f0 = new F0();
        }
        l(view, f0);
        i(l02.a(), view);
        b(view).add(l02);
        e(0, view);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Mb0.d(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void l(View view, F0 f0) {
        E0 e0;
        if (f0 == null && (a(view) instanceof E0)) {
            f0 = new F0();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (f0 == null) {
            e0 = null;
        } else {
            e0 = f0.b;
        }
        view.setAccessibilityDelegate(e0);
    }

    public static void m(View view, CharSequence charSequence) {
        boolean z;
        new Db0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 0).d(view, charSequence);
        Eb0 eb0 = f;
        if (charSequence != null) {
            WeakHashMap weakHashMap = eb0.b;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(eb0);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(eb0);
                return;
            }
            return;
        }
        eb0.b.remove(view);
        view.removeOnAttachStateChangeListener(eb0);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(eb0);
    }

    public static void n(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
