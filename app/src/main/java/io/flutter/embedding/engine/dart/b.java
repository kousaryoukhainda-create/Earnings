package io.flutter.embedding.engine.dart;

import io.flutter.embedding.engine.dart.DartMessenger;
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ DartMessenger.SerialTaskQueue c;

    public /* synthetic */ b(DartMessenger.SerialTaskQueue serialTaskQueue, int i) {
        this.b = i;
        this.c = serialTaskQueue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                DartMessenger.SerialTaskQueue.a(this.c);
                return;
            default:
                DartMessenger.SerialTaskQueue.b(this.c);
                return;
        }
    }
}
