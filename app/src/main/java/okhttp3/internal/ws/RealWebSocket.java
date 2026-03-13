package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.internal.ws.WebSocketReader;
/* loaded from: classes2.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback {
    public static final List a = Collections.singletonList(Protocol.HTTP_1_1);

    /* renamed from: okhttp3.internal.ws.RealWebSocket$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: okhttp3.internal.ws.RealWebSocket$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass2 implements Callback {
        @Override // okhttp3.Callback
        public final void a(Call call, Response response) {
            throw null;
        }

        @Override // okhttp3.Callback
        public final void b(Call call, IOException iOException) {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public final class CancelRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Close {
    }

    /* loaded from: classes2.dex */
    public static final class Message {
    }

    /* loaded from: classes2.dex */
    public final class PingRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class Streams implements Closeable {
    }
}
