package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: PP  reason: default package */
/* loaded from: classes.dex */
public final class PP implements OnBackAnimationCallback {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ InterfaceC0263Ez c;
    public final /* synthetic */ InterfaceC0263Ez d;

    public PP(Function1 function1, Function1 function12, InterfaceC0263Ez interfaceC0263Ez, InterfaceC0263Ez interfaceC0263Ez2) {
        this.a = function1;
        this.b = function12;
        this.c = interfaceC0263Ez;
        this.d = interfaceC0263Ez2;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.b.invoke(new C2652s9(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        this.a.invoke(new C2652s9(backEvent));
    }
}
