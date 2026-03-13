package defpackage;

import android.media.Spatializer;
/* renamed from: zo  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3309zo implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ C0278Fo a;

    public C3309zo(C0278Fo c0278Fo) {
        this.a = c0278Fo;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        C0278Fo c0278Fo = this.a;
        AbstractC3014wQ abstractC3014wQ = C0278Fo.i;
        c0278Fo.e();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        C0278Fo c0278Fo = this.a;
        AbstractC3014wQ abstractC3014wQ = C0278Fo.i;
        c0278Fo.e();
    }
}
