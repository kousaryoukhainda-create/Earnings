package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.C0887e;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: f30  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1326f30 {
    public boolean a;
    public boolean b;

    public boolean a() {
        return this instanceof C0887e;
    }

    public abstract void b(ViewGroup viewGroup);

    public abstract void c(ViewGroup viewGroup);

    public void d(C2652s9 backEvent, ViewGroup container) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
        Intrinsics.checkNotNullParameter(container, "container");
    }

    public void e(ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
    }
}
