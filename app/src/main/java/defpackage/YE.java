package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
/* renamed from: YE  reason: default package */
/* loaded from: classes2.dex */
public interface YE extends InterfaceC0376Ji {
    InterfaceC2085ld attachChild(InterfaceC2343od interfaceC2343od);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    NZ getChildren();

    YE getParent();

    InterfaceC0435Lp invokeOnCompletion(Function1 function1);

    InterfaceC0435Lp invokeOnCompletion(boolean z, boolean z2, Function1 function1);

    boolean isActive();

    boolean isCancelled();

    Object join(InterfaceC2868ui interfaceC2868ui);

    boolean start();
}
