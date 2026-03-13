package defpackage;

import android.view.KeyEvent;
import io.flutter.embedding.android.KeyEmbedderResponder;
import io.flutter.embedding.android.KeyboardMap;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundExecutor;
/* renamed from: aG  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0836aG implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC0836aG(KeyEmbedderResponder keyEmbedderResponder, KeyboardMap.KeyPair keyPair, long j, KeyEvent keyEvent, int i) {
        this.b = i;
        this.c = keyEmbedderResponder;
        this.d = keyPair;
        this.f = j;
        this.g = keyEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((KeyEmbedderResponder) this.c).lambda$synchronizePressingKey$0((KeyboardMap.KeyPair) this.d, this.f, (KeyEvent) this.g);
                return;
            case 1:
                ((KeyEmbedderResponder) this.c).lambda$synchronizePressingKey$1((KeyboardMap.KeyPair) this.d, this.f, (KeyEvent) this.g);
                return;
            default:
                FlutterFirebaseMessagingBackgroundExecutor.b((FlutterFirebaseMessagingBackgroundExecutor) this.c, (FlutterLoader) this.d, (FlutterShellArgs) this.g, this.f);
                return;
        }
    }

    public /* synthetic */ RunnableC0836aG(FlutterFirebaseMessagingBackgroundExecutor flutterFirebaseMessagingBackgroundExecutor, FlutterLoader flutterLoader, FlutterShellArgs flutterShellArgs, long j) {
        this.b = 2;
        this.c = flutterFirebaseMessagingBackgroundExecutor;
        this.d = flutterLoader;
        this.g = flutterShellArgs;
        this.f = j;
    }
}
