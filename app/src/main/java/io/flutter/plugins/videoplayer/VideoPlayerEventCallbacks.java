package io.flutter.plugins.videoplayer;

import androidx.annotation.NonNull;
import com.fyber.fairbid.sdk.session.UserSessionStorage;
import com.google.android.gms.tagmanager.DataLayer;
import io.flutter.plugin.common.EventChannel;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes2.dex */
final class VideoPlayerEventCallbacks implements VideoPlayerCallbacks {
    private final EventChannel.EventSink eventSink;

    private VideoPlayerEventCallbacks(EventChannel.EventSink eventSink) {
        this.eventSink = eventSink;
    }

    public static VideoPlayerEventCallbacks bindTo(EventChannel eventChannel) {
        final QueuingEventSink queuingEventSink = new QueuingEventSink();
        eventChannel.setStreamHandler(new EventChannel.StreamHandler() { // from class: io.flutter.plugins.videoplayer.VideoPlayerEventCallbacks.1
            @Override // io.flutter.plugin.common.EventChannel.StreamHandler
            public void onCancel(Object obj) {
                QueuingEventSink.this.setDelegate(null);
            }

            @Override // io.flutter.plugin.common.EventChannel.StreamHandler
            public void onListen(Object obj, EventChannel.EventSink eventSink) {
                QueuingEventSink.this.setDelegate(eventSink);
            }
        });
        return withSink(queuingEventSink);
    }

    public static VideoPlayerEventCallbacks withSink(EventChannel.EventSink eventSink) {
        return new VideoPlayerEventCallbacks(eventSink);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onBufferingEnd() {
        this.eventSink.success(AbstractC0324Hi.o(DataLayer.EVENT_KEY, "bufferingEnd"));
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onBufferingStart() {
        this.eventSink.success(AbstractC0324Hi.o(DataLayer.EVENT_KEY, "bufferingStart"));
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onBufferingUpdate(long j) {
        HashMap o = AbstractC0324Hi.o(DataLayer.EVENT_KEY, "bufferingUpdate");
        o.put("values", Collections.singletonList(Arrays.asList(0, Long.valueOf(j))));
        this.eventSink.success(o);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onCompleted() {
        this.eventSink.success(AbstractC0324Hi.o(DataLayer.EVENT_KEY, "completed"));
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onError(@NonNull String str, String str2, Object obj) {
        this.eventSink.error(str, str2, obj);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onInitialized(int i, int i2, long j, int i3) {
        HashMap o = AbstractC0324Hi.o(DataLayer.EVENT_KEY, "initialized");
        AbstractC0324Hi.t(i, o, "width", i2, "height");
        o.put(UserSessionStorage.DURATION, Long.valueOf(j));
        if (i3 != 0) {
            o.put("rotationCorrection", Integer.valueOf(i3));
        }
        this.eventSink.success(o);
    }

    @Override // io.flutter.plugins.videoplayer.VideoPlayerCallbacks
    public void onIsPlayingStateUpdate(boolean z) {
        HashMap o = AbstractC0324Hi.o(DataLayer.EVENT_KEY, "isPlayingStateUpdate");
        o.put("isPlaying", Boolean.valueOf(z));
        this.eventSink.success(o);
    }
}
