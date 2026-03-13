package defpackage;

import androidx.media3.common.Metadata;
import java.util.List;
/* renamed from: bS  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0939bS {
    void onAudioAttributesChanged(S5 s5);

    void onAvailableCommandsChanged(ZR zr);

    void onCues(List list);

    void onCues(C2872uk c2872uk);

    void onEvents(InterfaceC1186dS interfaceC1186dS, C0848aS c0848aS);

    void onIsLoadingChanged(boolean z);

    void onIsPlayingChanged(boolean z);

    void onLoadingChanged(boolean z);

    void onMediaItemTransition(VK vk, int i);

    void onMediaMetadataChanged(YK yk);

    void onMetadata(Metadata metadata);

    void onPlayWhenReadyChanged(boolean z, int i);

    void onPlaybackParametersChanged(YR yr);

    void onPlaybackStateChanged(int i);

    void onPlaybackSuppressionReasonChanged(int i);

    void onPlayerError(WR wr);

    void onPlayerErrorChanged(WR wr);

    void onPlayerStateChanged(boolean z, int i);

    void onPositionDiscontinuity(int i);

    void onPositionDiscontinuity(C1024cS c1024cS, C1024cS c1024cS2, int i);

    void onRenderedFirstFrame();

    void onRepeatModeChanged(int i);

    void onSkipSilenceEnabledChanged(boolean z);

    void onSurfaceSizeChanged(int i, int i2);

    void onTimelineChanged(E60 e60, int i);

    void onTracksChanged(T70 t70);

    void onVideoSizeChanged(C3285zb0 c3285zb0);

    void onVolumeChanged(float f);
}
