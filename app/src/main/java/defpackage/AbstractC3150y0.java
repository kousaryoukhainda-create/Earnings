package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.view.accessibility.AccessibilityNodeInfo;
/* renamed from: y0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3150y0 {
    public static /* bridge */ /* synthetic */ Context e(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern g() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern h(int i, int i2) {
        return new MediaCodec.CryptoInfo.Pattern(i, i2);
    }

    public static /* synthetic */ void p() {
    }

    public static /* bridge */ /* synthetic */ void s(MediaCodec.CryptoInfo.Pattern pattern, int i, int i2) {
        pattern.set(i, i2);
    }

    public static /* bridge */ /* synthetic */ void t(MediaCodec.CryptoInfo cryptoInfo, MediaCodec.CryptoInfo.Pattern pattern) {
        cryptoInfo.setPattern(pattern);
    }

    public static /* bridge */ /* synthetic */ void v(AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setImportantForAccessibility(false);
    }

    public static /* bridge */ /* synthetic */ void x(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setImportantForAccessibility(z);
    }
}
