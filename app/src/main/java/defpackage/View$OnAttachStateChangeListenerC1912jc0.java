package defpackage;

import android.view.View;
import java.lang.reflect.Field;
/* renamed from: jc0  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class View$OnAttachStateChangeListenerC1912jc0 implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        Field field = Sb0.a;
        Fb0.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
