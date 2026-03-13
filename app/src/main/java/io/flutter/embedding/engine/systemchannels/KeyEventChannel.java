package io.flutter.embedding.engine.systemchannels;

import android.view.KeyEvent;
import androidx.annotation.NonNull;
import io.flutter.Log;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.JSONMessageCodec;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class KeyEventChannel {
    private static final String TAG = "KeyEventChannel";
    @NonNull
    public final BasicMessageChannel<Object> channel;

    /* loaded from: classes2.dex */
    public interface EventResponseHandler {
        void onFrameworkResponse(boolean z);
    }

    /* loaded from: classes2.dex */
    public static class FlutterKeyEvent {
        public final Character complexCharacter;
        public final KeyEvent event;

        public FlutterKeyEvent(@NonNull KeyEvent keyEvent) {
            this(keyEvent, null);
        }

        public FlutterKeyEvent(@NonNull KeyEvent keyEvent, Character ch) {
            this.event = keyEvent;
            this.complexCharacter = ch;
        }
    }

    public KeyEventChannel(@NonNull BinaryMessenger binaryMessenger) {
        this.channel = new BasicMessageChannel<>(binaryMessenger, "flutter/keyevent", JSONMessageCodec.INSTANCE);
    }

    private static BasicMessageChannel.Reply<Object> createReplyHandler(@NonNull EventResponseHandler eventResponseHandler) {
        return new C3318zx(eventResponseHandler, 11);
    }

    private Map<String, Object> encodeKeyEvent(@NonNull FlutterKeyEvent flutterKeyEvent, boolean z) {
        String str;
        HashMap hashMap = new HashMap();
        if (z) {
            str = "keyup";
        } else {
            str = "keydown";
        }
        hashMap.put("type", str);
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(flutterKeyEvent.event.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(flutterKeyEvent.event.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(flutterKeyEvent.event.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(flutterKeyEvent.event.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(flutterKeyEvent.event.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(flutterKeyEvent.event.getMetaState()));
        Character ch = flutterKeyEvent.complexCharacter;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(flutterKeyEvent.event.getSource()));
        hashMap.put("deviceId", Integer.valueOf(flutterKeyEvent.event.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(flutterKeyEvent.event.getRepeatCount()));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createReplyHandler$0(EventResponseHandler eventResponseHandler, Object obj) {
        boolean z = false;
        if (obj != null) {
            try {
                z = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e) {
                Log.e(TAG, "Unable to unpack JSON message: " + e);
            }
        }
        eventResponseHandler.onFrameworkResponse(z);
    }

    public void sendFlutterKeyEvent(@NonNull FlutterKeyEvent flutterKeyEvent, boolean z, @NonNull EventResponseHandler eventResponseHandler) {
        this.channel.send(encodeKeyEvent(flutterKeyEvent, z), createReplyHandler(eventResponseHandler));
    }
}
