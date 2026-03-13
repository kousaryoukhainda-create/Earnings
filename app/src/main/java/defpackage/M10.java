package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: M10  reason: default package */
/* loaded from: classes.dex */
public final class M10 implements View.OnAttachStateChangeListener {
    public final N10 b;
    public final WeakReference c;

    public M10(N10 sidecarCompat, Activity activity) {
        Intrinsics.checkNotNullParameter(sidecarCompat, "sidecarCompat");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.b = sidecarCompat;
        this.c = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        IBinder iBinder;
        Window window;
        WindowManager.LayoutParams attributes;
        Intrinsics.checkNotNullParameter(view, "view");
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.c.get();
        if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            iBinder = attributes.token;
        } else {
            iBinder = null;
        }
        if (activity == null || iBinder == null) {
            return;
        }
        this.b.g(iBinder, activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
