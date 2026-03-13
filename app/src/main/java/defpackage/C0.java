package defpackage;

import android.content.ClipData;
import android.media.AudioProfile;
import android.media.metrics.MediaMetricsManager;
import android.view.ContentInfo;
/* renamed from: C0  reason: default package */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class C0 {
    public static /* bridge */ /* synthetic */ AudioProfile f(Object obj) {
        return (AudioProfile) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager h(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ ContentInfo.Builder i(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo k(Object obj) {
        return (ContentInfo) obj;
    }
}
