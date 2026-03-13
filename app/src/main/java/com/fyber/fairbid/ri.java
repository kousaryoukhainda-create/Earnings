package com.fyber.fairbid;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ri {
    public static final <T> T a(@NotNull String className, @NotNull String fieldName) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        try {
            Field declaredField = Class.forName(className).getDeclaredField(fieldName);
            declaredField.setAccessible(true);
            return (T) declaredField.get(null);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static final Field a(Class<?> cls, @NotNull String fieldName) {
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        if (cls == null) {
            return null;
        }
        try {
            Field declaredField = cls.getDeclaredField(fieldName);
            declaredField.setAccessible(true);
            Field.class.getDeclaredField("accessFlags").setAccessible(true);
            return declaredField;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static final Object a(@NotNull String fieldName, Object obj) {
        Field a;
        Intrinsics.checkNotNullParameter(fieldName, "fieldName");
        if (obj != null && (a = a(obj.getClass(), fieldName)) != null) {
            try {
                return a.get(obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
