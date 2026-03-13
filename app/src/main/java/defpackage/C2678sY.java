package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: sY  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2678sY extends AbstractC1431gG implements InterfaceC0263Ez {
    public final /* synthetic */ int h;
    public final /* synthetic */ C0686Vh i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2678sY(C0686Vh c0686Vh, int i) {
        super(0);
        this.h = i;
        this.i = c0686Vh;
    }

    @Override // defpackage.InterfaceC0263Ez
    public final Object invoke() {
        boolean z;
        switch (this.h) {
            case 0:
                Class<?> loadClass = this.i.a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                return loadClass;
            default:
                C0686Vh c0686Vh = this.i;
                Class<?> loadClass2 = c0686Vh.a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                Intrinsics.checkNotNullExpressionValue(loadClass2, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method getWindowExtensionsMethod = loadClass2.getDeclaredMethod("getWindowExtensions", null);
                Class<?> clazz = c0686Vh.a.loadClass("androidx.window.extensions.WindowExtensions");
                Intrinsics.checkNotNullExpressionValue(clazz, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                Intrinsics.checkNotNullExpressionValue(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                Intrinsics.checkNotNullParameter(getWindowExtensionsMethod, "<this>");
                Intrinsics.checkNotNullParameter(clazz, "clazz");
                if (getWindowExtensionsMethod.getReturnType().equals(clazz)) {
                    Intrinsics.checkNotNullParameter(getWindowExtensionsMethod, "<this>");
                    if (Modifier.isPublic(getWindowExtensionsMethod.getModifiers())) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }
}
