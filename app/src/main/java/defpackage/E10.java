package defpackage;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: E10  reason: default package */
/* loaded from: classes.dex */
public abstract class E10 {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                Intrinsics.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                return ((Integer) invoke).intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return 0;
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
        int a = a(sidecarDeviceState);
        if (a < 0 || a > 4) {
            return 0;
        }
        return a;
    }

    public static List c(SidecarWindowLayoutInfo info) {
        C2968vr c2968vr = C2968vr.b;
        Intrinsics.checkNotNullParameter(info, "info");
        try {
            try {
                List list = info.displayFeatures;
                if (list != null) {
                    return list;
                }
                return c2968vr;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(info, null);
                Intrinsics.c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                return (List) invoke;
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return c2968vr;
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int i) {
        Intrinsics.checkNotNullParameter(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                sidecarDeviceState.posture = i;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
    }
}
