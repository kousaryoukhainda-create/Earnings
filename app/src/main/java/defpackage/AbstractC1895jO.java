package defpackage;

import android.view.Surface;
import android.view.SurfaceControl;
/* renamed from: jO  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1895jO {
    public static /* synthetic */ Surface b(SurfaceControl surfaceControl) {
        return new Surface(surfaceControl);
    }

    public static /* synthetic */ SurfaceControl.Builder c() {
        return new SurfaceControl.Builder();
    }

    public static /* synthetic */ SurfaceControl.Transaction d() {
        return new SurfaceControl.Transaction();
    }

    public static /* bridge */ /* synthetic */ SurfaceControl.Transaction f(Object obj) {
        return (SurfaceControl.Transaction) obj;
    }
}
