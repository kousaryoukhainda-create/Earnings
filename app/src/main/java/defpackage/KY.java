package defpackage;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: KY  reason: default package */
/* loaded from: classes.dex */
public final class KY {
    public final LY a;
    public final JY b = new JY();
    public boolean c;

    public KY(LY ly) {
        this.a = ly;
    }

    public final void a() {
        LY ly = this.a;
        CG lifecycle = ly.getLifecycle();
        if (((JG) lifecycle).c == BG.c) {
            lifecycle.a(new TU(ly));
            final JY jy = this.b;
            jy.getClass();
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            if (!jy.b) {
                lifecycle.a(new FG() { // from class: GY
                    @Override // defpackage.FG
                    public final void onStateChanged(HG hg, AG event) {
                        JY this$0 = JY.this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(hg, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == AG.ON_START) {
                            this$0.f = true;
                        } else if (event == AG.ON_STOP) {
                            this$0.f = false;
                        }
                    }
                });
                jy.b = true;
                this.c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void b(Bundle bundle) {
        Bundle bundle2;
        if (!this.c) {
            a();
        }
        JG jg = (JG) this.a.getLifecycle();
        if (!jg.c.a(BG.f)) {
            JY jy = this.b;
            if (jy.b) {
                if (!jy.d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    jy.c = bundle2;
                    jy.d = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.");
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + jg.c).toString());
    }

    public final void c(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        JY jy = this.b;
        jy.getClass();
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = jy.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C2507qY c2507qY = jy.a;
        c2507qY.getClass();
        C2335oY c2335oY = new C2335oY(c2507qY);
        c2507qY.d.put(c2335oY, Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(c2335oY, "this.components.iteratorWithAdditions()");
        while (c2335oY.hasNext()) {
            Map.Entry entry = (Map.Entry) c2335oY.next();
            bundle.putBundle((String) entry.getKey(), ((IY) entry.getValue()).a());
        }
        if (!bundle.isEmpty()) {
            outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
    }
}
