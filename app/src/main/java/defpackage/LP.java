package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: LP  reason: default package */
/* loaded from: classes.dex */
public abstract class LP {
    @NotNull
    private final CopyOnWriteArrayList<InterfaceC1541hc> cancellables = new CopyOnWriteArrayList<>();
    private InterfaceC0263Ez enabledChangedCallback;
    private boolean isEnabled;

    public LP(boolean z) {
        this.isEnabled = z;
    }

    public final void addCancellable(@NotNull InterfaceC1541hc cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final InterfaceC0263Ez getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(@NotNull C2652s9 backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public void handleOnBackStarted(@NotNull C2652s9 backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        for (InterfaceC1541hc interfaceC1541hc : this.cancellables) {
            interfaceC1541hc.cancel();
        }
    }

    public final void removeCancellable(@NotNull InterfaceC1541hc cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        InterfaceC0263Ez interfaceC0263Ez = this.enabledChangedCallback;
        if (interfaceC0263Ez != null) {
            interfaceC0263Ez.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(InterfaceC0263Ez interfaceC0263Ez) {
        this.enabledChangedCallback = interfaceC0263Ez;
    }

    public void handleOnBackCancelled() {
    }
}
