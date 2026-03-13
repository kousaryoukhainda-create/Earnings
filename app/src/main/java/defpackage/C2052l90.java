package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: l90  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C2052l90 extends C1880j90 {
    public final Class E;
    public final Constructor F;
    public final Method G;
    public final Method H;
    public final Method I;
    public final Method J;
    public final Method K;

    public C2052l90() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = r0(cls2);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = s0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.E = cls;
        this.F = constructor;
        this.G = method2;
        this.H = method3;
        this.I = method4;
        this.J = method5;
        this.K = method;
    }

    public static Method r0(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final void l0(Object obj) {
        try {
            this.J.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean m0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.G.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface n0(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.E, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.K.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.C1880j90, defpackage.AbstractC2870uj
    public final Typeface o(Context context, C1944jy c1944jy, Resources resources, int i) {
        C2030ky[] c2030kyArr;
        if (!p0()) {
            return super.o(context, c1944jy, resources, i);
        }
        Object q0 = q0();
        if (q0 == null) {
            return null;
        }
        for (C2030ky c2030ky : c1944jy.a) {
            if (!m0(context, q0, c2030ky.a, c2030ky.e, c2030ky.b, c2030ky.c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c2030ky.d))) {
                l0(q0);
                return null;
            }
        }
        if (!o0(q0)) {
            return null;
        }
        return n0(q0);
    }

    public final boolean o0(Object obj) {
        try {
            return ((Boolean) this.I.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // defpackage.C1880j90, defpackage.AbstractC2870uj
    public final Typeface p(Context context, C2202my[] c2202myArr, int i) {
        Typeface n0;
        boolean z;
        if (c2202myArr.length < 1) {
            return null;
        }
        if (!p0()) {
            C2202my x = x(c2202myArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(x.a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(x.c).setItalic(x.d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (C2202my c2202my : c2202myArr) {
            if (c2202my.e == 0) {
                Uri uri = c2202my.a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, AbstractC2618rm.D(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object q0 = q0();
        if (q0 == null) {
            return null;
        }
        boolean z2 = false;
        for (C2202my c2202my2 : c2202myArr) {
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c2202my2.a);
            if (byteBuffer != null) {
                try {
                    z = ((Boolean) this.H.invoke(q0, byteBuffer, Integer.valueOf(c2202my2.b), null, Integer.valueOf(c2202my2.c), Integer.valueOf(c2202my2.d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z = false;
                }
                if (!z) {
                    l0(q0);
                    return null;
                }
                z2 = true;
            }
        }
        if (!z2) {
            l0(q0);
            return null;
        } else if (!o0(q0) || (n0 = n0(q0)) == null) {
            return null;
        } else {
            return Typeface.create(n0, i);
        }
    }

    public final boolean p0() {
        Method method = this.G;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    public final Object q0() {
        try {
            return this.F.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.AbstractC2870uj
    public final Typeface r(Context context, Resources resources, int i, String str, int i2) {
        if (!p0()) {
            return super.r(context, resources, i, str, i2);
        }
        Object q0 = q0();
        if (q0 == null) {
            return null;
        }
        if (!m0(context, q0, str, 0, -1, -1, null)) {
            l0(q0);
            return null;
        } else if (!o0(q0)) {
            return null;
        } else {
            return n0(q0);
        }
    }

    public Method s0(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
