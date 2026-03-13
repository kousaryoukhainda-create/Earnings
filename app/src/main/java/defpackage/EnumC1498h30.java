package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h30  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1498h30 {
    public static final EnumC1498h30 b;
    public static final EnumC1498h30 c;
    public static final EnumC1498h30 d;
    public static final EnumC1498h30 f;
    public static final /* synthetic */ EnumC1498h30[] g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, h30] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, h30] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, h30] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, h30] */
    static {
        ?? r4 = new Enum("REMOVED", 0);
        b = r4;
        ?? r5 = new Enum("VISIBLE", 1);
        c = r5;
        ?? r6 = new Enum("GONE", 2);
        d = r6;
        ?? r7 = new Enum("INVISIBLE", 3);
        f = r7;
        g = new EnumC1498h30[]{r4, r5, r6, r7};
    }

    public static EnumC1498h30 valueOf(String str) {
        return (EnumC1498h30) Enum.valueOf(EnumC1498h30.class, str);
    }

    public static EnumC1498h30[] values() {
        return (EnumC1498h30[]) g.clone();
    }

    public final void a(ViewGroup container, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(container, "container");
        int ordinal = ordinal();
        ViewGroup viewGroup = null;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent;
            }
            if (viewGroup == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        ViewParent parent2 = view.getParent();
        if (parent2 instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent2;
        }
        if (viewGroup != null) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
            }
            viewGroup.removeView(view);
        }
    }
}
