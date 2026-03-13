package defpackage;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import org.jetbrains.annotations.NotNull;
/* renamed from: ub  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2854ub {
    public static final void a(@NotNull Bundle bundle, @NotNull String str, Size size) {
        bundle.putSize(str, size);
    }

    public static final void b(@NotNull Bundle bundle, @NotNull String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
