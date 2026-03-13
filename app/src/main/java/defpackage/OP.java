package defpackage;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: OP  reason: default package */
/* loaded from: classes.dex */
public final class OP {
    public static final OP a = new Object();

    @NotNull
    public final OnBackInvokedCallback a(@NotNull InterfaceC0263Ez onBackInvoked) {
        Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
        return new C2201mx(onBackInvoked, 1);
    }

    public final void b(@NotNull Object dispatcher, int i, @NotNull Object callback) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) callback);
    }

    public final void c(@NotNull Object dispatcher, @NotNull Object callback) {
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
