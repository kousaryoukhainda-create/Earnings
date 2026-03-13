package com.google.firebase.messaging;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.gms.cloudmessaging.Rpc;
import java.util.ArrayDeque;
import java.util.Queue;
/* loaded from: classes.dex */
public class FirebaseMessagingService extends AbstractServiceC0411Kr {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private Rpc rpc;

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // defpackage.AbstractServiceC0411Kr
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) C0811a00.g().f).poll();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
        if (r4.equals("send_event") == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0159  */
    @Override // defpackage.AbstractServiceC0411Kr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleIntent(android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.handleIntent(android.content.Intent):void");
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
    }

    @Deprecated
    public void onMessageSent(@NonNull String str) {
    }

    public void onNewToken(String str) {
    }

    @Deprecated
    public void onSendError(@NonNull String str, @NonNull Exception exc) {
    }

    public void setRpcForTesting(Rpc rpc) {
        this.rpc = rpc;
    }
}
