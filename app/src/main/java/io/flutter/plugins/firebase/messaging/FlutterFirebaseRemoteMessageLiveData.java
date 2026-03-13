package io.flutter.plugins.firebase.messaging;

import com.google.firebase.messaging.RemoteMessage;
/* loaded from: classes2.dex */
public class FlutterFirebaseRemoteMessageLiveData extends HH {
    private static FlutterFirebaseRemoteMessageLiveData instance;

    public static FlutterFirebaseRemoteMessageLiveData getInstance() {
        if (instance == null) {
            instance = new FlutterFirebaseRemoteMessageLiveData();
        }
        return instance;
    }

    public void postRemoteMessage(RemoteMessage remoteMessage) {
        postValue(remoteMessage);
    }
}
