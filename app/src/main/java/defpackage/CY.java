package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: CY  reason: default package */
/* loaded from: classes.dex */
public final class CY {
    public static final Class[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final IY e;

    public CY(HashMap initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new C3206yf(this, 2);
        linkedHashMap.putAll(initialState);
    }

    public static Bundle a(CY this$0) {
        C3011wN c3011wN;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = C2148mJ.j(this$0.b).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this$0.a;
            if (hasNext) {
                Map.Entry entry = (Map.Entry) it.next();
                String key = (String) entry.getKey();
                Object a = ((IY) entry.getValue()).a();
                Intrinsics.checkNotNullParameter(key, "key");
                if (a != null) {
                    Class[] clsArr = f;
                    for (int i = 0; i < 29; i++) {
                        Class cls = clsArr[i];
                        Intrinsics.b(cls);
                        if (!cls.isInstance(a)) {
                        }
                    }
                    throw new IllegalArgumentException("Can't put value with type " + a.getClass() + " into saved state");
                }
                Object obj = this$0.c.get(key);
                if (obj instanceof C3011wN) {
                    c3011wN = (C3011wN) obj;
                } else {
                    c3011wN = null;
                }
                if (c3011wN != null) {
                    c3011wN.setValue(a);
                } else {
                    linkedHashMap.put(key, a);
                }
                InterfaceC3269zN interfaceC3269zN = (InterfaceC3269zN) this$0.d.get(key);
                if (interfaceC3269zN != null) {
                    C1157d40 c1157d40 = (C1157d40) interfaceC3269zN;
                    if (a == null) {
                        a = AbstractC1906jZ.f;
                    }
                    c1157d40.b(null, a);
                }
            } else {
                Set<String> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                JQ[] jqArr = {new JQ("keys", arrayList), new JQ("values", arrayList2)};
                Bundle bundle = new Bundle(2);
                for (int i2 = 0; i2 < 2; i2++) {
                    JQ jq = jqArr[i2];
                    String str2 = (String) jq.b;
                    Object obj2 = jq.c;
                    if (obj2 == null) {
                        bundle.putString(str2, null);
                    } else if (obj2 instanceof Boolean) {
                        bundle.putBoolean(str2, ((Boolean) obj2).booleanValue());
                    } else if (obj2 instanceof Byte) {
                        bundle.putByte(str2, ((Number) obj2).byteValue());
                    } else if (obj2 instanceof Character) {
                        bundle.putChar(str2, ((Character) obj2).charValue());
                    } else if (obj2 instanceof Double) {
                        bundle.putDouble(str2, ((Number) obj2).doubleValue());
                    } else if (obj2 instanceof Float) {
                        bundle.putFloat(str2, ((Number) obj2).floatValue());
                    } else if (obj2 instanceof Integer) {
                        bundle.putInt(str2, ((Number) obj2).intValue());
                    } else if (obj2 instanceof Long) {
                        bundle.putLong(str2, ((Number) obj2).longValue());
                    } else if (obj2 instanceof Short) {
                        bundle.putShort(str2, ((Number) obj2).shortValue());
                    } else if (obj2 instanceof Bundle) {
                        bundle.putBundle(str2, (Bundle) obj2);
                    } else if (obj2 instanceof CharSequence) {
                        bundle.putCharSequence(str2, (CharSequence) obj2);
                    } else if (obj2 instanceof Parcelable) {
                        bundle.putParcelable(str2, (Parcelable) obj2);
                    } else if (obj2 instanceof boolean[]) {
                        bundle.putBooleanArray(str2, (boolean[]) obj2);
                    } else if (obj2 instanceof byte[]) {
                        bundle.putByteArray(str2, (byte[]) obj2);
                    } else if (obj2 instanceof char[]) {
                        bundle.putCharArray(str2, (char[]) obj2);
                    } else if (obj2 instanceof double[]) {
                        bundle.putDoubleArray(str2, (double[]) obj2);
                    } else if (obj2 instanceof float[]) {
                        bundle.putFloatArray(str2, (float[]) obj2);
                    } else if (obj2 instanceof int[]) {
                        bundle.putIntArray(str2, (int[]) obj2);
                    } else if (obj2 instanceof long[]) {
                        bundle.putLongArray(str2, (long[]) obj2);
                    } else if (obj2 instanceof short[]) {
                        bundle.putShortArray(str2, (short[]) obj2);
                    } else if (obj2 instanceof Object[]) {
                        Class<?> componentType = obj2.getClass().getComponentType();
                        Intrinsics.b(componentType);
                        if (Parcelable.class.isAssignableFrom(componentType)) {
                            bundle.putParcelableArray(str2, (Parcelable[]) obj2);
                        } else if (String.class.isAssignableFrom(componentType)) {
                            bundle.putStringArray(str2, (String[]) obj2);
                        } else if (CharSequence.class.isAssignableFrom(componentType)) {
                            bundle.putCharSequenceArray(str2, (CharSequence[]) obj2);
                        } else if (Serializable.class.isAssignableFrom(componentType)) {
                            bundle.putSerializable(str2, (Serializable) obj2);
                        } else {
                            throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str2 + '\"');
                        }
                    } else if (obj2 instanceof Serializable) {
                        bundle.putSerializable(str2, (Serializable) obj2);
                    } else if (obj2 instanceof IBinder) {
                        bundle.putBinder(str2, (IBinder) obj2);
                    } else if (obj2 instanceof Size) {
                        AbstractC2854ub.a(bundle, str2, (Size) obj2);
                    } else if (obj2 instanceof SizeF) {
                        AbstractC2854ub.b(bundle, str2, (SizeF) obj2);
                    } else {
                        throw new IllegalArgumentException("Illegal value type " + obj2.getClass().getCanonicalName() + " for key \"" + str2 + '\"');
                    }
                }
                return bundle;
            }
        }
    }

    public CY() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new C3206yf(this, 2);
    }
}
