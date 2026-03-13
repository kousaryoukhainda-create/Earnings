package defpackage;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: QP  reason: default package */
/* loaded from: classes.dex */
public final class QP {
    public static final QP a = new Object();

    @NotNull
    public final OnBackInvokedCallback a(@NotNull Function1 onBackStarted, @NotNull Function1 onBackProgressed, @NotNull InterfaceC0263Ez onBackInvoked, @NotNull InterfaceC0263Ez onBackCancelled) {
        Intrinsics.checkNotNullParameter(onBackStarted, "onBackStarted");
        Intrinsics.checkNotNullParameter(onBackProgressed, "onBackProgressed");
        Intrinsics.checkNotNullParameter(onBackInvoked, "onBackInvoked");
        Intrinsics.checkNotNullParameter(onBackCancelled, "onBackCancelled");
        return new PP(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
