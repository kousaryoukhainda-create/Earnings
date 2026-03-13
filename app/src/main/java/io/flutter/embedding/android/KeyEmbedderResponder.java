package io.flutter.embedding.android;

import android.view.KeyEvent;
import androidx.annotation.NonNull;
import io.flutter.Log;
import io.flutter.embedding.android.KeyData;
import io.flutter.embedding.android.KeyEmbedderResponder;
import io.flutter.embedding.android.KeyboardManager;
import io.flutter.embedding.android.KeyboardMap;
import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class KeyEmbedderResponder implements KeyboardManager.Responder {
    private static final String TAG = "KeyEmbedderResponder";
    @NonNull
    private final BinaryMessenger messenger;
    @NonNull
    private final HashMap<Long, Long> pressingRecords = new HashMap<>();
    @NonNull
    private final HashMap<Long, KeyboardMap.TogglingGoal> togglingGoals = new HashMap<>();
    @NonNull
    private final KeyboardManager.CharacterCombiner characterCombiner = new KeyboardManager.CharacterCombiner();

    /* renamed from: io.flutter.embedding.android.KeyEmbedderResponder$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$embedding$android$KeyData$Type;

        static {
            int[] iArr = new int[KeyData.Type.values().length];
            $SwitchMap$io$flutter$embedding$android$KeyData$Type = iArr;
            try {
                iArr[KeyData.Type.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$embedding$android$KeyData$Type[KeyData.Type.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$embedding$android$KeyData$Type[KeyData.Type.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public KeyEmbedderResponder(BinaryMessenger binaryMessenger) {
        KeyboardMap.TogglingGoal[] togglingGoals;
        this.messenger = binaryMessenger;
        for (KeyboardMap.TogglingGoal togglingGoal : KeyboardMap.getTogglingGoals()) {
            this.togglingGoals.put(Long.valueOf(togglingGoal.logicalKey), togglingGoal);
        }
    }

    private static KeyData.Type getEventType(KeyEvent keyEvent) {
        boolean z;
        if (keyEvent.getRepeatCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return KeyData.Type.kUp;
            }
            throw new AssertionError("Unexpected event type");
        } else if (z) {
            return KeyData.Type.kRepeat;
        } else {
            return KeyData.Type.kDown;
        }
    }

    private Long getLogicalKey(@NonNull KeyEvent keyEvent) {
        Long l = KeyboardMap.keyCodeToLogical.get(Long.valueOf(keyEvent.getKeyCode()));
        if (l != null) {
            return l;
        }
        return Long.valueOf(keyOfPlane(keyEvent.getKeyCode(), KeyboardMap.kAndroidPlane));
    }

    private Long getPhysicalKey(@NonNull KeyEvent keyEvent) {
        long scanCode = keyEvent.getScanCode();
        if (scanCode == 0) {
            return Long.valueOf(keyOfPlane(keyEvent.getKeyCode(), KeyboardMap.kAndroidPlane));
        }
        Long l = KeyboardMap.scanCodeToPhysical.get(Long.valueOf(scanCode));
        if (l != null) {
            return l;
        }
        return Long.valueOf(keyOfPlane(keyEvent.getScanCode(), KeyboardMap.kAndroidPlane));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0145 A[LOOP:2: B:68:0x013f->B:70:0x0145, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean handleEventImpl(@androidx.annotation.NonNull android.view.KeyEvent r18, @androidx.annotation.NonNull io.flutter.embedding.android.KeyboardManager.Responder.OnKeyEventHandledCallback r19) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.KeyEmbedderResponder.handleEventImpl(android.view.KeyEvent, io.flutter.embedding.android.KeyboardManager$Responder$OnKeyEventHandledCallback):boolean");
    }

    private static long keyOfPlane(long j, long j2) {
        return (j & KeyboardMap.kValueMask) | j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendKeyEvent$2(KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback, ByteBuffer byteBuffer) {
        boolean z;
        Boolean bool = Boolean.FALSE;
        if (byteBuffer != null) {
            byteBuffer.rewind();
            if (byteBuffer.capacity() != 0) {
                if (byteBuffer.get() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
        } else {
            Log.w(TAG, "A null reply was received when sending a key event to the framework.");
        }
        onKeyEventHandledCallback.onKeyEventHandled(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$synchronizePressingKey$0(KeyboardMap.KeyPair keyPair, long j, KeyEvent keyEvent) {
        synthesizeEvent(false, Long.valueOf(keyPair.logicalKey), Long.valueOf(j), keyEvent.getEventTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$synchronizePressingKey$1(KeyboardMap.KeyPair keyPair, long j, KeyEvent keyEvent) {
        synthesizeEvent(false, Long.valueOf(keyPair.logicalKey), Long.valueOf(j), keyEvent.getEventTime());
    }

    private void sendKeyEvent(KeyData keyData, final KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        BinaryMessenger.BinaryReply binaryReply;
        if (onKeyEventHandledCallback == null) {
            binaryReply = null;
        } else {
            binaryReply = new BinaryMessenger.BinaryReply() { // from class: ZF
                @Override // io.flutter.plugin.common.BinaryMessenger.BinaryReply
                public final void reply(ByteBuffer byteBuffer) {
                    KeyEmbedderResponder.lambda$sendKeyEvent$2(KeyboardManager.Responder.OnKeyEventHandledCallback.this, byteBuffer);
                }
            };
        }
        this.messenger.send(KeyData.CHANNEL, keyData.toBytes(), binaryReply);
    }

    private void synthesizeEvent(boolean z, Long l, Long l2, long j) {
        KeyData.Type type;
        KeyData keyData = new KeyData();
        keyData.timestamp = j;
        if (z) {
            type = KeyData.Type.kDown;
        } else {
            type = KeyData.Type.kUp;
        }
        keyData.type = type;
        keyData.logicalKey = l.longValue();
        keyData.physicalKey = l2.longValue();
        keyData.character = null;
        keyData.synthesized = true;
        keyData.deviceType = KeyData.DeviceType.kKeyboard;
        if (l2.longValue() != 0 && l.longValue() != 0) {
            if (!z) {
                l = null;
            }
            updatePressingState(l2, l);
        }
        sendKeyEvent(keyData, null);
    }

    public Map<Long, Long> getPressedState() {
        return Collections.unmodifiableMap(this.pressingRecords);
    }

    @Override // io.flutter.embedding.android.KeyboardManager.Responder
    public void handleEvent(@NonNull KeyEvent keyEvent, @NonNull KeyboardManager.Responder.OnKeyEventHandledCallback onKeyEventHandledCallback) {
        if (!handleEventImpl(keyEvent, onKeyEventHandledCallback)) {
            synthesizeEvent(true, 0L, 0L, 0L);
            onKeyEventHandledCallback.onKeyEventHandled(true);
        }
    }

    public void synchronizePressingKey(KeyboardMap.PressingGoal pressingGoal, boolean z, long j, long j2, KeyEvent keyEvent, ArrayList<Runnable> arrayList) {
        KeyboardMap.KeyPair[] keyPairArr = pressingGoal.keys;
        boolean[] zArr = new boolean[keyPairArr.length];
        Boolean[] boolArr = new Boolean[keyPairArr.length];
        int i = 0;
        boolean z2 = false;
        while (true) {
            KeyboardMap.KeyPair[] keyPairArr2 = pressingGoal.keys;
            boolean z3 = true;
            if (i >= keyPairArr2.length) {
                break;
            }
            KeyboardMap.KeyPair keyPair = keyPairArr2[i];
            boolean containsKey = this.pressingRecords.containsKey(Long.valueOf(keyPair.physicalKey));
            zArr[i] = containsKey;
            if (keyPair.logicalKey == j) {
                int i2 = AnonymousClass1.$SwitchMap$io$flutter$embedding$android$KeyData$Type[getEventType(keyEvent).ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            if (!z) {
                                arrayList.add(new RunnableC0836aG(this, keyPair, j2, keyEvent, 1));
                            }
                            boolArr[i] = Boolean.valueOf(zArr[i]);
                        }
                    } else {
                        boolArr[i] = Boolean.valueOf(zArr[i]);
                    }
                } else {
                    boolArr[i] = Boolean.FALSE;
                    if (!z) {
                        arrayList.add(new RunnableC0836aG(this, keyPair, j2, keyEvent, 0));
                    }
                }
                z2 = true;
            } else {
                if (!z2 && !containsKey) {
                    z3 = false;
                }
                z2 = z3;
            }
            i++;
        }
        if (z) {
            for (int i3 = 0; i3 < pressingGoal.keys.length; i3++) {
                if (boolArr[i3] == null) {
                    if (z2) {
                        boolArr[i3] = Boolean.valueOf(zArr[i3]);
                    } else {
                        boolArr[i3] = Boolean.TRUE;
                        z2 = true;
                    }
                }
            }
            if (!z2) {
                boolArr[0] = Boolean.TRUE;
            }
        } else {
            for (int i4 = 0; i4 < pressingGoal.keys.length; i4++) {
                if (boolArr[i4] == null) {
                    boolArr[i4] = Boolean.FALSE;
                }
            }
        }
        for (int i5 = 0; i5 < pressingGoal.keys.length; i5++) {
            if (zArr[i5] != boolArr[i5].booleanValue()) {
                KeyboardMap.KeyPair keyPair2 = pressingGoal.keys[i5];
                synthesizeEvent(boolArr[i5].booleanValue(), Long.valueOf(keyPair2.logicalKey), Long.valueOf(keyPair2.physicalKey), keyEvent.getEventTime());
            }
        }
    }

    public void synchronizeTogglingKey(KeyboardMap.TogglingGoal togglingGoal, boolean z, long j, KeyEvent keyEvent) {
        if (togglingGoal.logicalKey != j && togglingGoal.enabled != z) {
            boolean containsKey = this.pressingRecords.containsKey(Long.valueOf(togglingGoal.physicalKey));
            boolean z2 = !containsKey;
            if (!containsKey) {
                togglingGoal.enabled = !togglingGoal.enabled;
            }
            synthesizeEvent(z2, Long.valueOf(togglingGoal.logicalKey), Long.valueOf(togglingGoal.physicalKey), keyEvent.getEventTime());
            if (containsKey) {
                togglingGoal.enabled = !togglingGoal.enabled;
            }
            synthesizeEvent(containsKey, Long.valueOf(togglingGoal.logicalKey), Long.valueOf(togglingGoal.physicalKey), keyEvent.getEventTime());
        }
    }

    public void updatePressingState(@NonNull Long l, Long l2) {
        if (l2 != null) {
            if (this.pressingRecords.put(l, l2) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (this.pressingRecords.remove(l) != null) {
        } else {
            throw new AssertionError("The key was empty");
        }
    }
}
