package defpackage;

import android.app.Activity;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Vh  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686Vh {
    public final ClassLoader a;

    public C0686Vh(ClassLoader loader, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(loader, "loader");
                this.a = loader;
                return;
            default:
                Intrinsics.checkNotNullParameter(loader, "loader");
                this.a = loader;
                return;
        }
    }

    public C0660Uh a(Object obj, C0423Ld clazz, Activity activity, C2798tt consumer) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter("addWindowLayoutInfoListener", "addMethodName");
        Intrinsics.checkNotNullParameter("removeWindowLayoutInfoListener", "removeMethodName");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Object newProxyInstance = Proxy.newProxyInstance(this.a, new Class[]{b()}, new C0634Th(clazz, consumer));
        Intrinsics.checkNotNullExpressionValue(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, b()).invoke(obj, activity, newProxyInstance);
        return new C0660Uh(obj.getClass().getMethod("removeWindowLayoutInfoListener", b()), obj, newProxyInstance);
    }

    public Class b() {
        Class<?> loadClass = this.a.loadClass("java.util.function.Consumer");
        Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
