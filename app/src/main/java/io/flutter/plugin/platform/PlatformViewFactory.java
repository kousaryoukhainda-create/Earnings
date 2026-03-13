package io.flutter.plugin.platform;

import android.content.Context;
import androidx.annotation.NonNull;
import io.flutter.plugin.common.MessageCodec;
/* loaded from: classes2.dex */
public abstract class PlatformViewFactory {
    private final MessageCodec<Object> createArgsCodec;

    public PlatformViewFactory(MessageCodec<Object> messageCodec) {
        this.createArgsCodec = messageCodec;
    }

    @NonNull
    public abstract PlatformView create(Context context, int i, Object obj);

    public final MessageCodec<Object> getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
