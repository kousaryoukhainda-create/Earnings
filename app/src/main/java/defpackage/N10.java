package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: N10  reason: default package */
/* loaded from: classes.dex */
public final class N10 {
    public final SidecarInterface a;
    public final J10 b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public YZ e;

    public N10(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SidecarInterface b = L10.b(context);
        J10 sidecarAdapter = new J10();
        Intrinsics.checkNotNullParameter(sidecarAdapter, "sidecarAdapter");
        this.a = b;
        this.b = sidecarAdapter;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public final SidecarInterface d() {
        return this.a;
    }

    public final Ud0 e(Activity activity) {
        SidecarWindowLayoutInfo sidecarWindowLayoutInfo;
        SidecarDeviceState sidecarDeviceState;
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder a = L10.a(activity);
        if (a == null) {
            return new Ud0(C2968vr.b);
        }
        SidecarInterface sidecarInterface = this.a;
        if (sidecarInterface != null) {
            sidecarWindowLayoutInfo = sidecarInterface.getWindowLayoutInfo(a);
        } else {
            sidecarWindowLayoutInfo = null;
        }
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.b.e(sidecarWindowLayoutInfo, sidecarDeviceState);
    }

    public final void f(Activity activity) {
        boolean z;
        SidecarInterface sidecarInterface;
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder a = L10.a(activity);
        if (a == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(a);
        }
        LinkedHashMap linkedHashMap = this.d;
        InterfaceC0608Sh interfaceC0608Sh = (InterfaceC0608Sh) linkedHashMap.get(activity);
        if (interfaceC0608Sh != null) {
            if (activity instanceof XP) {
                ((XP) activity).removeOnConfigurationChangedListener(interfaceC0608Sh);
            }
            linkedHashMap.remove(activity);
        }
        YZ yz = this.e;
        if (yz != null) {
            yz.u(activity);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        if (linkedHashMap2.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        linkedHashMap2.remove(a);
        if (z && (sidecarInterface = this.a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(true);
        }
    }

    public final void g(IBinder windowToken, final Activity activity) {
        SidecarInterface sidecarInterface;
        Intrinsics.checkNotNullParameter(windowToken, "windowToken");
        Intrinsics.checkNotNullParameter(activity, "activity");
        LinkedHashMap linkedHashMap = this.c;
        linkedHashMap.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        YZ yz = this.e;
        if (yz != null) {
            yz.F(activity, e(activity));
        }
        LinkedHashMap linkedHashMap2 = this.d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof XP)) {
            InterfaceC0608Sh interfaceC0608Sh = new InterfaceC0608Sh() { // from class: K10
                @Override // defpackage.InterfaceC0608Sh
                public final void accept(Object obj) {
                    Configuration configuration = (Configuration) obj;
                    N10 this$0 = N10.this;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Activity activity2 = activity;
                    Intrinsics.checkNotNullParameter(activity2, "$activity");
                    YZ yz2 = this$0.e;
                    if (yz2 != null) {
                        yz2.F(activity2, this$0.e(activity2));
                    }
                }
            };
            linkedHashMap2.put(activity, interfaceC0608Sh);
            ((XP) activity).addOnConfigurationChangedListener(interfaceC0608Sh);
        }
    }

    public final void h(C3279zX extensionCallback) {
        Intrinsics.checkNotNullParameter(extensionCallback, "extensionCallback");
        this.e = new YZ(extensionCallback);
        SidecarInterface sidecarInterface = this.a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(@NotNull SidecarDeviceState newDeviceState) {
                    LinkedHashMap linkedHashMap;
                    YZ yz;
                    J10 j10;
                    SidecarInterface d;
                    Intrinsics.checkNotNullParameter(newDeviceState, "newDeviceState");
                    linkedHashMap = N10.this.c;
                    N10 n10 = N10.this;
                    for (Activity activity : linkedHashMap.values()) {
                        IBinder a = L10.a(activity);
                        SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                        if (a != null && (d = n10.d()) != null) {
                            sidecarWindowLayoutInfo = d.getWindowLayoutInfo(a);
                        }
                        yz = n10.e;
                        if (yz != null) {
                            j10 = n10.b;
                            yz.F(activity, j10.e(sidecarWindowLayoutInfo, newDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(@NotNull IBinder windowToken, @NotNull SidecarWindowLayoutInfo newLayout) {
                    LinkedHashMap linkedHashMap;
                    J10 j10;
                    SidecarDeviceState sidecarDeviceState;
                    YZ yz;
                    Intrinsics.checkNotNullParameter(windowToken, "windowToken");
                    Intrinsics.checkNotNullParameter(newLayout, "newLayout");
                    linkedHashMap = N10.this.c;
                    Activity activity = (Activity) linkedHashMap.get(windowToken);
                    if (activity != null) {
                        j10 = N10.this.b;
                        SidecarInterface d = N10.this.d();
                        if (d == null || (sidecarDeviceState = d.getDeviceState()) == null) {
                            sidecarDeviceState = new SidecarDeviceState();
                        }
                        Ud0 e = j10.e(newLayout, sidecarDeviceState);
                        yz = N10.this.e;
                        if (yz != null) {
                            yz.F(activity, e);
                            return;
                        }
                        return;
                    }
                    Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                }
            }));
        }
    }

    public final boolean i() {
        Method method;
        Class<?> cls;
        Method method2;
        Class<?> cls2;
        Method method3;
        Class<?> cls3;
        Method method4;
        Class<?> cls4;
        Class<?> cls5;
        Class<?> cls6;
        Class<?> cls7;
        Class<?> cls8;
        try {
            SidecarInterface sidecarInterface = this.a;
            if (sidecarInterface != null && (cls8 = sidecarInterface.getClass()) != null) {
                method = cls8.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            } else {
                method = null;
            }
            if (method != null) {
                cls = method.getReturnType();
            } else {
                cls = null;
            }
            Class cls9 = Void.TYPE;
            if (Intrinsics.a(cls, cls9)) {
                SidecarInterface sidecarInterface2 = this.a;
                if (sidecarInterface2 != null) {
                    sidecarInterface2.getDeviceState();
                }
                SidecarInterface sidecarInterface3 = this.a;
                if (sidecarInterface3 != null) {
                    sidecarInterface3.onDeviceStateListenersChanged(true);
                }
                SidecarInterface sidecarInterface4 = this.a;
                if (sidecarInterface4 != null && (cls7 = sidecarInterface4.getClass()) != null) {
                    method2 = cls7.getMethod("getWindowLayoutInfo", IBinder.class);
                } else {
                    method2 = null;
                }
                if (method2 != null) {
                    cls2 = method2.getReturnType();
                } else {
                    cls2 = null;
                }
                if (Intrinsics.a(cls2, SidecarWindowLayoutInfo.class)) {
                    SidecarInterface sidecarInterface5 = this.a;
                    if (sidecarInterface5 != null && (cls6 = sidecarInterface5.getClass()) != null) {
                        method3 = cls6.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                    } else {
                        method3 = null;
                    }
                    if (method3 != null) {
                        cls3 = method3.getReturnType();
                    } else {
                        cls3 = null;
                    }
                    if (Intrinsics.a(cls3, cls9)) {
                        SidecarInterface sidecarInterface6 = this.a;
                        if (sidecarInterface6 != null && (cls5 = sidecarInterface6.getClass()) != null) {
                            method4 = cls5.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                        } else {
                            method4 = null;
                        }
                        if (method4 != null) {
                            cls4 = method4.getReturnType();
                        } else {
                            cls4 = null;
                        }
                        if (Intrinsics.a(cls4, cls9)) {
                            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                            try {
                                sidecarDeviceState.posture = 3;
                            } catch (NoSuchFieldError unused) {
                                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                                Intrinsics.c(invoke, "null cannot be cast to non-null type kotlin.Int");
                                if (((Integer) invoke).intValue() != 3) {
                                    throw new Exception("Invalid device posture getter/setter");
                                }
                            }
                            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
                            Rect rect = sidecarDisplayFeature.getRect();
                            Intrinsics.checkNotNullExpressionValue(rect, "displayFeature.rect");
                            sidecarDisplayFeature.setRect(rect);
                            sidecarDisplayFeature.getType();
                            sidecarDisplayFeature.setType(1);
                            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                            try {
                                List list = sidecarWindowLayoutInfo.displayFeatures;
                            } catch (NoSuchFieldError unused2) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(sidecarDisplayFeature);
                                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                                Object invoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                                Intrinsics.c(invoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                                if (!Intrinsics.a(arrayList, (List) invoke2)) {
                                    throw new Exception("Invalid display feature getter/setter");
                                }
                            }
                            return true;
                        }
                        throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + cls4);
                    }
                    throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + cls3);
                }
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + cls2);
            }
            throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + cls);
        } catch (Throwable unused3) {
            return false;
        }
    }
}
