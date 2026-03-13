package com.google.android.recaptcha.internal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public abstract class zzfx implements InvocationHandler {
    private final Object zza;

    public zzfx(Object obj) {
        this.zza = obj;
    }

    @Override // java.lang.reflect.InvocationHandler
    @NotNull
    public final Object invoke(@NotNull Object obj, @NotNull Method method, Object[] objArr) {
        Object obj2;
        int i;
        if (Intrinsics.a(method.getName(), "toString") && method.getParameterTypes().length == 0) {
            return "Proxy@".concat(String.valueOf(Integer.toHexString(obj.hashCode())));
        }
        if (Intrinsics.a(method.getName(), "hashCode") && method.getParameterTypes().length == 0) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if (Intrinsics.a(method.getName(), "equals") && method.getParameterTypes().length != 0) {
            boolean z = false;
            if (objArr != null && objArr.length != 0) {
                Object obj3 = objArr[0];
                if (obj3 != null) {
                    i = obj3.hashCode();
                } else {
                    i = 0;
                }
                if (i == obj.hashCode()) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
        boolean zza = zza(obj, method, objArr);
        B90 b90 = B90.a;
        if (!zza) {
            return b90;
        }
        if ((this.zza == null && Intrinsics.a(method.getReturnType(), Void.TYPE)) || ((obj2 = this.zza) != null && Intrinsics.a(zzkm.zza(obj2.getClass()), zzkm.zza(method.getReturnType())))) {
            Object obj4 = this.zza;
            if (obj4 == null) {
                return b90;
            }
            return obj4;
        }
        Object obj5 = this.zza;
        Class<?> returnType = method.getReturnType();
        throw new IllegalArgumentException(obj5 + " cannot be returned from method with return type " + returnType);
    }

    public abstract boolean zza(@NotNull Object obj, @NotNull Method method, Object[] objArr);
}
