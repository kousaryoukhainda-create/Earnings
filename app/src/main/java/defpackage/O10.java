package defpackage;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: O10  reason: default package */
/* loaded from: classes.dex */
public final class O10 {
    public final Activity a;
    public final C0650Tx b;
    public Ud0 c;

    public O10(Activity activity, S4 executor, C0650Tx callback) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.a = activity;
        this.b = callback;
    }
}
