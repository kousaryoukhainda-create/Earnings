package defpackage;

import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import android.view.AttachedSurfaceControl;
import android.view.SurfaceControl;
import android.view.WindowManager;
import io.flutter.embedding.android.FlutterView;
import java.util.concurrent.Executor;
/* renamed from: aL  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0841aL {
    public static /* bridge */ /* synthetic */ boolean A(WindowManager windowManager) {
        return windowManager.isCrossWindowBlurEnabled();
    }

    public static /* bridge */ /* synthetic */ int a(SparseArray sparseArray) {
        return sparseArray.contentHashCode();
    }

    public static /* synthetic */ NetworkEvent.Builder d() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder e() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* synthetic */ PlaybackMetrics.Builder f() {
        return new PlaybackMetrics.Builder();
    }

    public static /* synthetic */ PlaybackStateEvent.Builder g() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* bridge */ /* synthetic */ PlaybackStateEvent h(PlaybackStateEvent.Builder builder) {
        return builder.build();
    }

    public static /* synthetic */ TrackChangeEvent.Builder i(int i) {
        return new TrackChangeEvent.Builder(i);
    }

    public static /* bridge */ /* synthetic */ AttachedSurfaceControl k(FlutterView flutterView) {
        return flutterView.getRootSurfaceControl();
    }

    public static /* bridge */ /* synthetic */ SurfaceControl.Transaction l(AttachedSurfaceControl attachedSurfaceControl, SurfaceControl surfaceControl) {
        return attachedSurfaceControl.buildReparentTransaction(surfaceControl);
    }

    public static /* bridge */ /* synthetic */ void q(PlaybackSession playbackSession, PlaybackStateEvent playbackStateEvent) {
        playbackSession.reportPlaybackStateEvent(playbackStateEvent);
    }

    public static /* bridge */ /* synthetic */ void v(TelephonyManager telephonyManager, C1525hO c1525hO) {
        telephonyManager.unregisterTelephonyCallback(c1525hO);
    }

    public static /* bridge */ /* synthetic */ void w(TelephonyManager telephonyManager, Executor executor, C1525hO c1525hO) {
        telephonyManager.registerTelephonyCallback(executor, c1525hO);
    }

    public static /* bridge */ /* synthetic */ void x(AttachedSurfaceControl attachedSurfaceControl, SurfaceControl.Transaction transaction) {
        attachedSurfaceControl.applyTransactionOnDraw(transaction);
    }

    public static /* bridge */ /* synthetic */ boolean z(SparseArray sparseArray, SparseArray sparseArray2) {
        return sparseArray.contentEquals(sparseArray2);
    }
}
