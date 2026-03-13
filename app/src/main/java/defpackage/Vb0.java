package defpackage;

import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
/* renamed from: Vb0  reason: default package */
/* loaded from: classes.dex */
public abstract class Vb0 {
    public static int a(@NonNull ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int b(@NonNull ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }
}
