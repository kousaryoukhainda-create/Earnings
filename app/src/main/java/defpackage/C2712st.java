package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: st  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2712st implements InterfaceC2859ud0 {
    @Override // defpackage.InterfaceC2859ud0
    public final void a(Context context, S4 executor, C0650Tx callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        callback.accept(new Ud0(C2968vr.b));
    }

    @Override // defpackage.InterfaceC2859ud0
    public final void b(C0650Tx callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
    }
}
