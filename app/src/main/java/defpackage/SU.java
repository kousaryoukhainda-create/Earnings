package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: SU  reason: default package */
/* loaded from: classes.dex */
public final class SU implements IY {
    public final LinkedHashSet a;

    public SU(JY registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.a = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.IY
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.a));
        return bundle;
    }
}
