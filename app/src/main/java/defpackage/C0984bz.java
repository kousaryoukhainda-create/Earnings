package defpackage;

import android.graphics.Rect;
import android.transition.Transition;
/* renamed from: bz  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0984bz extends Transition.EpicenterCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;

    public /* synthetic */ C0984bz(int i, Rect rect) {
        this.a = i;
        this.b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                Rect rect = this.b;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
