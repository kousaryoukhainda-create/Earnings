package defpackage;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
/* renamed from: o3  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2297o3 {
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final C0620St b = new NI(C0620St.d);
    public static final C0620St c = new NI(C0620St.c);
    public static final C0620St d = new NI(C0620St.e);

    /* JADX WARN: Type inference failed for: r0v1, types: [St, NI] */
    /* JADX WARN: Type inference failed for: r0v2, types: [St, NI] */
    /* JADX WARN: Type inference failed for: r0v3, types: [St, NI] */
    static {
        new DecelerateInterpolator();
    }

    public static float a(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }
}
