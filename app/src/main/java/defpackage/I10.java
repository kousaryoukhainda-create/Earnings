package defpackage;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: I10  reason: default package */
/* loaded from: classes.dex */
public final class I10 extends AbstractC1431gG implements Function1 {
    public static final I10 h = new AbstractC1431gG(1);

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a */
    public final Boolean invoke(SidecarDisplayFeature require) {
        boolean z;
        Intrinsics.checkNotNullParameter(require, "$this$require");
        if (require.getRect().left != 0 && require.getRect().top != 0) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
