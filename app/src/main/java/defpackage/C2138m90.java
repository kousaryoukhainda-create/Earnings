package defpackage;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: m90  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2138m90 extends C2052l90 {
    @Override // defpackage.C2052l90
    public final Typeface n0(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.E, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.K.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.C2052l90
    public final Method s0(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
