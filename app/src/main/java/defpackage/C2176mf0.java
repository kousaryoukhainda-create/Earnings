package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: mf0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2176mf0 {
    public static final C1314ew b = new C1314ew(23);
    public static volatile C2176mf0 c;
    public final C2474q50 a;

    public C2176mf0(Context context) {
        this.a = C2231nG.a(new C2887uw(context, 2));
    }

    public final Object b(String key, Class clazz, Object obj) {
        boolean a;
        boolean a2;
        boolean a3;
        boolean a4;
        long j;
        Object valueOf;
        float f;
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        try {
            Set<String> set = null;
            String str = null;
            Integer num = null;
            Boolean bool = null;
            Float f2 = null;
            Long l = null;
            if (Intrinsics.a(clazz, String.class)) {
                SharedPreferences d = d();
                if (obj instanceof String) {
                    str = (String) obj;
                }
                valueOf = d.getString(key, str);
            } else {
                boolean z2 = true;
                if (Intrinsics.a(clazz, Integer.TYPE)) {
                    a = true;
                } else {
                    a = Intrinsics.a(clazz, Integer.class);
                }
                if (a) {
                    SharedPreferences d2 = d();
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    }
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = -1;
                    }
                    valueOf = Integer.valueOf(d2.getInt(key, i));
                } else {
                    if (Intrinsics.a(clazz, Boolean.TYPE)) {
                        a2 = true;
                    } else {
                        a2 = Intrinsics.a(clazz, Boolean.class);
                    }
                    if (a2) {
                        SharedPreferences d3 = d();
                        if (obj instanceof Boolean) {
                            bool = (Boolean) obj;
                        }
                        if (bool != null) {
                            z = bool.booleanValue();
                        } else {
                            z = false;
                        }
                        valueOf = Boolean.valueOf(d3.getBoolean(key, z));
                    } else {
                        if (Intrinsics.a(clazz, Float.TYPE)) {
                            a3 = true;
                        } else {
                            a3 = Intrinsics.a(clazz, Float.class);
                        }
                        if (a3) {
                            SharedPreferences d4 = d();
                            if (obj instanceof Float) {
                                f2 = (Float) obj;
                            }
                            if (f2 != null) {
                                f = f2.floatValue();
                            } else {
                                f = -1.0f;
                            }
                            valueOf = Float.valueOf(d4.getFloat(key, f));
                        } else {
                            if (Intrinsics.a(clazz, Long.TYPE)) {
                                a4 = true;
                            } else {
                                a4 = Intrinsics.a(clazz, Long.class);
                            }
                            if (a4) {
                                SharedPreferences d5 = d();
                                if (obj instanceof Long) {
                                    l = (Long) obj;
                                }
                                if (l != null) {
                                    j = l.longValue();
                                } else {
                                    j = -1;
                                }
                                valueOf = Long.valueOf(d5.getLong(key, j));
                            } else {
                                if (!Intrinsics.a(clazz, Set.class)) {
                                    z2 = Intrinsics.a(clazz, Set.class);
                                }
                                if (z2) {
                                    SharedPreferences d6 = d();
                                    if (obj instanceof Set) {
                                        set = (Set) obj;
                                    }
                                    Set<String> stringSet = d6.getStringSet(key, set);
                                    if (stringSet != null) {
                                        return new ConcurrentSkipListSet(stringSet);
                                    }
                                    return obj;
                                }
                                throw new IllegalArgumentException("Unsupported type: ".concat(clazz.getSimpleName()));
                            }
                        }
                    }
                }
            }
            return valueOf;
        } catch (ClassCastException e) {
            e.printStackTrace();
            return obj;
        }
    }

    public final void c(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (obj != null) {
            SharedPreferences d = d();
            Intrinsics.checkNotNullParameter(d, "<this>");
            if (obj instanceof String) {
                SharedPreferences.Editor editor = d.edit();
                Intrinsics.checkNotNullExpressionValue(editor, "editor");
                editor.putString(key, (String) obj);
                editor.apply();
            } else if (obj instanceof Integer) {
                SharedPreferences.Editor editor2 = d.edit();
                Intrinsics.checkNotNullExpressionValue(editor2, "editor");
                editor2.putInt(key, ((Number) obj).intValue());
                editor2.apply();
            } else if (obj instanceof Boolean) {
                SharedPreferences.Editor editor3 = d.edit();
                Intrinsics.checkNotNullExpressionValue(editor3, "editor");
                editor3.putBoolean(key, ((Boolean) obj).booleanValue());
                editor3.apply();
            } else if (obj instanceof Float) {
                SharedPreferences.Editor editor4 = d.edit();
                Intrinsics.checkNotNullExpressionValue(editor4, "editor");
                editor4.putFloat(key, ((Number) obj).floatValue());
                editor4.apply();
            } else if (obj instanceof Long) {
                SharedPreferences.Editor editor5 = d.edit();
                Intrinsics.checkNotNullExpressionValue(editor5, "editor");
                editor5.putLong(key, ((Number) obj).longValue());
                editor5.apply();
            } else if (obj instanceof Set) {
                SharedPreferences.Editor editor6 = d.edit();
                Intrinsics.checkNotNullExpressionValue(editor6, "editor");
                Iterable<Object> iterable = (Iterable) obj;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (Object obj2 : iterable) {
                        if (!(obj2 instanceof String)) {
                            throw new IllegalArgumentException("Set contains non-string elements");
                        }
                    }
                }
                SharedPreferences.Editor editor7 = d.edit();
                Intrinsics.checkNotNullExpressionValue(editor7, "editor");
                editor7.putStringSet(key, (Set) obj);
                editor7.apply();
                editor6.apply();
            } else {
                StringBuilder b2 = Ki0.b("Unsupported type: ");
                b2.append(obj.getClass().getSimpleName());
                throw new IllegalArgumentException(b2.toString());
            }
        }
    }

    public final SharedPreferences d() {
        Object a = this.a.a();
        Intrinsics.checkNotNullExpressionValue(a, "getValue(...)");
        return (SharedPreferences) a;
    }

    public final boolean e() {
        Boolean bool = (Boolean) b("i", Boolean.TYPE, Boolean.FALSE);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
