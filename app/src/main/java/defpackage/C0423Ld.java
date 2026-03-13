package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
/* renamed from: Ld  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0423Ld implements OF, InterfaceC0293Gd {
    public static final Map c;
    public static final HashMap d;
    public static final LinkedHashMap f;
    public final Class b;

    static {
        int i = 0;
        List c2 = C0346Ie.c(InterfaceC0263Ez.class, Function1.class, InterfaceC0652Tz.class, InterfaceC0704Vz.class, InterfaceC0730Wz.class, InterfaceC0756Xz.class, InterfaceC0782Yz.class, InterfaceC0808Zz.class, InterfaceC0830aA.class, InterfaceC0921bA.class, InterfaceC0289Fz.class, InterfaceC0315Gz.class, InterfaceC0341Hz.class, InterfaceC0367Iz.class, InterfaceC0393Jz.class, InterfaceC0419Kz.class, InterfaceC0444Lz.class, InterfaceC0470Mz.class, InterfaceC0496Nz.class, InterfaceC0522Oz.class, InterfaceC0574Qz.class, InterfaceC0600Rz.class, InterfaceC0626Sz.class);
        ArrayList arrayList = new ArrayList(C0372Je.f(c2));
        for (Object obj : c2) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new JQ((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                C0346Ie.e();
                throw null;
            }
        }
        c = C2148mJ.i(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            Intrinsics.b(str);
            sb.append(d.I(str, str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : c.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        d = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2062lJ.a(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            Intrinsics.b(str2);
            linkedHashMap.put(key, d.I(str2, str2));
        }
        f = linkedHashMap;
    }

    public C0423Ld(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.b = jClass;
    }

    @Override // defpackage.InterfaceC0293Gd
    public final Class a() {
        return this.b;
    }

    public final String b() {
        String str;
        Class jClass = this.b;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        String str2 = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (jClass.isLocalClass()) {
            String missingDelimiterValue = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                String H = d.H(missingDelimiterValue, enclosingMethod.getName() + '$', missingDelimiterValue);
                if (H != null) {
                    return H;
                }
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return d.H(missingDelimiterValue, enclosingConstructor.getName() + '$', missingDelimiterValue);
            }
            Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
            Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
            int v = d.v(missingDelimiterValue, '$', 0, false, 6);
            if (v == -1) {
                return missingDelimiterValue;
            }
            String substring = missingDelimiterValue.substring(v + 1, missingDelimiterValue.length());
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        boolean isArray = jClass.isArray();
        LinkedHashMap linkedHashMap = f;
        if (isArray) {
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                str2 = str.concat("Array");
            }
            if (str2 == null) {
                return "Array";
            }
            return str2;
        }
        String str3 = (String) linkedHashMap.get(jClass.getName());
        if (str3 == null) {
            return jClass.getSimpleName();
        }
        return str3;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0423Ld) && AbstractC1281eb.y(this).equals(AbstractC1281eb.y((OF) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1281eb.y(this).hashCode();
    }

    public final String toString() {
        return this.b + " (Kotlin reflection is not available)";
    }
}
