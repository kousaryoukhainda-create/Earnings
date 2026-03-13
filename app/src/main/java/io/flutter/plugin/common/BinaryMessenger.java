package io.flutter.plugin.common;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public interface BinaryMessenger {

    /* loaded from: classes2.dex */
    public interface BinaryMessageHandler {
        void onMessage(ByteBuffer byteBuffer, @NonNull BinaryReply binaryReply);
    }

    /* loaded from: classes2.dex */
    public interface BinaryReply {
        void reply(ByteBuffer byteBuffer);
    }

    /* loaded from: classes2.dex */
    public interface TaskQueue {
    }

    /* loaded from: classes2.dex */
    public static class TaskQueueOptions {
        private boolean isSerial = true;

        public boolean getIsSerial() {
            return this.isSerial;
        }

        public TaskQueueOptions setIsSerial(boolean z) {
            this.isSerial = z;
            return this;
        }
    }

    void disableBufferingIncomingMessages();

    void enableBufferingIncomingMessages();

    TaskQueue makeBackgroundTaskQueue();

    TaskQueue makeBackgroundTaskQueue(TaskQueueOptions taskQueueOptions);

    void send(@NonNull String str, ByteBuffer byteBuffer);

    void send(@NonNull String str, ByteBuffer byteBuffer, BinaryReply binaryReply);

    void setMessageHandler(@NonNull String str, BinaryMessageHandler binaryMessageHandler);

    void setMessageHandler(@NonNull String str, BinaryMessageHandler binaryMessageHandler, TaskQueue taskQueue);
}
