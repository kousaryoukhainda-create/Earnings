package defpackage;

import io.adjoe.sdk.PlaytimeInitialisationListener;
import io.flutter.plugin.common.MethodChannel;
/* renamed from: uS  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2844uS implements PlaytimeInitialisationListener {
    public final /* synthetic */ MethodChannel.Result b;

    public C2844uS(MethodChannel.Result result) {
        this.b = result;
    }

    @Override // io.adjoe.sdk.PlaytimeInitialisationListener
    public final void onInitialisationError(Exception exc) {
        this.b.error("0", exc.getMessage(), null);
    }

    @Override // io.adjoe.sdk.PlaytimeInitialisationListener
    public final void onInitialisationFinished() {
        this.b.success(null);
    }
}
