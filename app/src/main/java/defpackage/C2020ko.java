package defpackage;

import android.animation.AnimatorSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* renamed from: ko  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2020ko {
    public static final C2020ko a = new Object();

    public final void a(@NotNull AnimatorSet animatorSet) {
        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(@NotNull AnimatorSet animatorSet, long j) {
        Intrinsics.checkNotNullParameter(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j);
    }
}
