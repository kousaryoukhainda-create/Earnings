package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: az  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0899az {
    public static final C1403fz a = new Object();
    public static final AbstractC1575hz b;

    /* JADX WARN: Type inference failed for: r0v0, types: [fz, java.lang.Object] */
    static {
        AbstractC1575hz abstractC1575hz = null;
        try {
            abstractC1575hz = (AbstractC1575hz) C2203mz.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = abstractC1575hz;
    }

    public static final void a(int i, ArrayList views) {
        Intrinsics.checkNotNullParameter(views, "views");
        Iterator it = views.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
