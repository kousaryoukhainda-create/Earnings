package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
/* renamed from: zW  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3278zW {
    public static Drawable a(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    public static Drawable b(Resources resources, int i, int i2, Resources.Theme theme) {
        return resources.getDrawableForDensity(i, i2, theme);
    }
}
