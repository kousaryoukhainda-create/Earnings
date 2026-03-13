package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* renamed from: Od  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500Od {
    public static final C0500Od c = new C0500Od();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, C0474Nd c0474Nd, AG ag, Class cls) {
        AG ag2 = (AG) hashMap.get(c0474Nd);
        if (ag2 != null && ag != ag2) {
            Method method = c0474Nd.b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + ag2 + ", new value " + ag);
        } else if (ag2 == null) {
            hashMap.put(c0474Nd, ag);
        }
    }

    public final C0448Md a(Class cls, Method[] methodArr) {
        Class<?>[] interfaces;
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            C0448Md c0448Md = (C0448Md) hashMap2.get(superclass);
            if (c0448Md == null) {
                c0448Md = a(superclass, null);
            }
            hashMap.putAll(c0448Md.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0448Md c0448Md2 = (C0448Md) hashMap2.get(cls2);
            if (c0448Md2 == null) {
                c0448Md2 = a(cls2, null);
            }
            for (Map.Entry entry : c0448Md2.b.entrySet()) {
                b(hashMap, (C0474Nd) entry.getKey(), (AG) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC0937bQ interfaceC0937bQ = (InterfaceC0937bQ) method.getAnnotation(InterfaceC0937bQ.class);
            if (interfaceC0937bQ != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (HG.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i = 0;
                }
                AG value = interfaceC0937bQ.value();
                if (parameterTypes.length > 1) {
                    if (AG.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == AG.ON_ANY) {
                            i = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new C0474Nd(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0448Md c0448Md3 = new C0448Md(hashMap);
        hashMap2.put(cls, c0448Md3);
        this.b.put(cls, Boolean.valueOf(z));
        return c0448Md3;
    }
}
