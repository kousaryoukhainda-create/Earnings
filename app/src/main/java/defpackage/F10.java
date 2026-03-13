package defpackage;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: F10  reason: default package */
/* loaded from: classes.dex */
public final class F10 extends AbstractC1431gG implements Function1 {
    public static final F10 h = new AbstractC1431gG(1);

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a */
    public final Boolean invoke(SidecarDisplayFeature require) {
        Intrinsics.checkNotNullParameter(require, "$this$require");
        boolean z = true;
        if (require.getType() != 1 && require.getType() != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
