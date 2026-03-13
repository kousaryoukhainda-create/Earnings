package defpackage;

import android.os.Bundle;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: JY  reason: default package */
/* loaded from: classes.dex */
public final class JY {
    public boolean b;
    public Bundle c;
    public boolean d;
    public SU e;
    public final C2507qY a = new C2507qY();
    public boolean f = true;

    public final Bundle a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.d) {
            Bundle bundle = this.c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(key);
            Bundle bundle3 = this.c;
            if (bundle3 != null) {
                bundle3.remove(key);
            }
            Bundle bundle4 = this.c;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public final IY b() {
        Map.Entry components;
        IY iy;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", Constants.KEY);
        Iterator it = this.a.iterator();
        do {
            C2163mY c2163mY = (C2163mY) it;
            if (c2163mY.hasNext()) {
                components = (Map.Entry) c2163mY.next();
                Intrinsics.checkNotNullExpressionValue(components, "components");
                iy = (IY) components.getValue();
            } else {
                return null;
            }
        } while (!Intrinsics.a((String) components.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return iy;
    }

    public final void c(String key, IY provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (((IY) this.a.c(key, provider)) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }

    public final void d() {
        Intrinsics.checkNotNullParameter(C2574rG.class, "clazz");
        if (this.f) {
            SU su = this.e;
            if (su == null) {
                su = new SU(this);
            }
            this.e = su;
            try {
                C2574rG.class.getDeclaredConstructor(null);
                SU su2 = this.e;
                if (su2 != null) {
                    String className = C2574rG.class.getName();
                    Intrinsics.checkNotNullExpressionValue(className, "clazz.name");
                    Intrinsics.checkNotNullParameter(className, "className");
                    su2.a.add(className);
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + C2574rG.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
}
