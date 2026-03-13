package defpackage;

import android.media.MediaCodecInfo;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import io.flutter.plugin.platform.PlatformPlugin;
/* renamed from: qp  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2537qp {
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint g() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(PlatformPlugin.DEFAULT_SYSTEM_UI, 720, 60);
    }

    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint h(int i, int i2, int i3) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, i3);
    }

    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint i(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    public static /* bridge */ /* synthetic */ CellSignalStrengthNr k(Object obj) {
        return (CellSignalStrengthNr) obj;
    }

    public static /* bridge */ /* synthetic */ CellSignalStrengthTdscdma l(Object obj) {
        return (CellSignalStrengthTdscdma) obj;
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return CellSignalStrengthNr.class;
    }

    public static /* synthetic */ void p() {
    }

    public static /* bridge */ /* synthetic */ Class v() {
        return CellSignalStrengthTdscdma.class;
    }

    public static /* synthetic */ void x() {
    }
}
