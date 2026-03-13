package io.flutter.embedding.android;

import android.view.KeyEvent;
import androidx.annotation.NonNull;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
/* loaded from: classes2.dex */
public class KeyChannelResponder implements KeyboardManager.Responder {
    private static final String TAG = "KeyChannelResponder";
    @NonNull
    private final KeyboardManager.CharacterCombiner characterCombiner = new KeyboardManager.CharacterCombiner();
    @NonNull
    private final KeyEventChannel keyEventChannel;

    public KeyChannelResponder(@NonNull KeyEventChannel keyEventChannel) {
        this.keyEventChannel = keyEventChannel;
    }

    @Override // io.flutter.embedding.android.KeyboardManager.Responder
    public void handleEvent(@NonNull KeyEvent keyEvent, @NonNull KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        int action = keyEvent.getAction();
        boolean z = false;
        if (action != 0 && action != 1) {
            onKeyEventHandledCallback.onKeyEventHandled(false);
            return;
        }
        KeyEventChannel.FlutterKeyEvent flutterKeyEvent = new KeyEventChannel.FlutterKeyEvent(keyEvent, this.characterCombiner.applyCombiningCharacterToBaseCharacter(keyEvent.getUnicodeChar()));
        if (action != 0) {
            z = true;
        }
        this.keyEventChannel.sendFlutterKeyEvent(flutterKeyEvent, z, new C3318zx(onKeyEventHandledCallback, 10));
    }
}
