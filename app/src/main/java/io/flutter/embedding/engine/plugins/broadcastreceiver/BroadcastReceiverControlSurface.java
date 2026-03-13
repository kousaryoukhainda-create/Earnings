package io.flutter.embedding.engine.plugins.broadcastreceiver;

import android.content.BroadcastReceiver;
import androidx.annotation.NonNull;
/* loaded from: classes2.dex */
public interface BroadcastReceiverControlSurface {
    void attachToBroadcastReceiver(@NonNull BroadcastReceiver broadcastReceiver, @NonNull CG cg);

    void detachFromBroadcastReceiver();
}
