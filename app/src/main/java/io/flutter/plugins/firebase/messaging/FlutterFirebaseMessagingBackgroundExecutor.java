package io.flutter.plugins.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.messaging.RemoteMessage;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.loader.FlutterLoader;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.FlutterCallbackInformation;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes2.dex */
public class FlutterFirebaseMessagingBackgroundExecutor implements MethodChannel.MethodCallHandler {
    private static final String CALLBACK_HANDLE_KEY = "callback_handle";
    private static final String TAG = "FLTFireBGExecutor";
    private static final String USER_CALLBACK_HANDLE_KEY = "user_callback_handle";
    private MethodChannel backgroundChannel;
    private FlutterEngine backgroundFlutterEngine;
    private final AtomicBoolean isCallbackDispatcherReady = new AtomicBoolean(false);

    private long getPluginCallbackHandle() {
        return ContextHolder.getApplicationContext().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong(CALLBACK_HANDLE_KEY, 0L);
    }

    public long getUserCallbackHandle() {
        return ContextHolder.getApplicationContext().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong(USER_CALLBACK_HANDLE_KEY, 0L);
    }

    private void initializeMethodChannel(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_messaging_background");
        this.backgroundChannel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    public /* synthetic */ void lambda$startBackgroundIsolate$0(FlutterLoader flutterLoader, FlutterShellArgs flutterShellArgs, long j) {
        String findAppBundlePath = flutterLoader.findAppBundlePath();
        AssetManager assets = ContextHolder.getApplicationContext().getAssets();
        if (isNotRunning()) {
            if (flutterShellArgs != null) {
                Log.i(TAG, "Creating background FlutterEngine instance, with args: " + Arrays.toString(flutterShellArgs.toArray()));
                this.backgroundFlutterEngine = new FlutterEngine(ContextHolder.getApplicationContext(), flutterShellArgs.toArray());
            } else {
                Log.i(TAG, "Creating background FlutterEngine instance.");
                this.backgroundFlutterEngine = new FlutterEngine(ContextHolder.getApplicationContext());
            }
            FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(j);
            if (lookupCallbackInformation == null) {
                Log.e(TAG, "Failed to find registered callback");
                return;
            }
            DartExecutor dartExecutor = this.backgroundFlutterEngine.getDartExecutor();
            initializeMethodChannel(dartExecutor);
            dartExecutor.executeDartCallback(new DartExecutor.DartCallback(assets, findAppBundlePath, lookupCallbackInformation));
        }
    }

    public /* synthetic */ void lambda$startBackgroundIsolate$1(FlutterLoader flutterLoader, Handler handler, FlutterShellArgs flutterShellArgs, long j) {
        flutterLoader.startInitialization(ContextHolder.getApplicationContext());
        flutterLoader.ensureInitializationCompleteAsync(ContextHolder.getApplicationContext(), null, handler, new RunnableC0836aG(this, flutterLoader, flutterShellArgs, j));
    }

    private void onInitialized() {
        this.isCallbackDispatcherReady.set(true);
        FlutterFirebaseMessagingBackgroundService.onInitialized();
    }

    public static void setCallbackDispatcher(long j) {
        Context applicationContext = ContextHolder.getApplicationContext();
        if (applicationContext == null) {
            Log.e(TAG, "Context is null, cannot continue.");
        } else {
            applicationContext.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong(CALLBACK_HANDLE_KEY, j).apply();
        }
    }

    public static void setUserCallbackHandle(long j) {
        ContextHolder.getApplicationContext().getSharedPreferences("io.flutter.firebase.messaging.callback", 0).edit().putLong(USER_CALLBACK_HANDLE_KEY, j).apply();
    }

    public void executeDartCallbackInBackgroundIsolate(Intent intent, final CountDownLatch countDownLatch) {
        MethodChannel.Result result;
        if (this.backgroundFlutterEngine == null) {
            Log.i(TAG, "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        if (countDownLatch != null) {
            result = new MethodChannel.Result() { // from class: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundExecutor.1
                {
                    FlutterFirebaseMessagingBackgroundExecutor.this = this;
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void error(String str, String str2, Object obj) {
                    countDownLatch.countDown();
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void notImplemented() {
                    countDownLatch.countDown();
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void success(Object obj) {
                    countDownLatch.countDown();
                }
            };
        } else {
            result = null;
        }
        byte[] byteArrayExtra = intent.getByteArrayExtra("notification");
        if (byteArrayExtra != null) {
            Parcel obtain = Parcel.obtain();
            try {
                obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
                obtain.setDataPosition(0);
                this.backgroundChannel.invokeMethod("MessagingBackground#onMessage", new HashMap<String, Object>(FlutterFirebaseMessagingUtils.remoteMessageToMap(RemoteMessage.CREATOR.createFromParcel(obtain))) { // from class: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundExecutor.2
                    final /* synthetic */ Map val$remoteMessageMap;

                    {
                        FlutterFirebaseMessagingBackgroundExecutor.this = this;
                        this.val$remoteMessageMap = r4;
                        put("userCallbackHandle", Long.valueOf(this.getUserCallbackHandle()));
                        put("message", r4);
                    }
                }, result);
                return;
            } finally {
                obtain.recycle();
            }
        }
        Log.e(TAG, "RemoteMessage byte array not found in Intent.");
    }

    public boolean isDartBackgroundHandlerRegistered() {
        if (getPluginCallbackHandle() != 0) {
            return true;
        }
        return false;
    }

    public boolean isNotRunning() {
        return !this.isCallbackDispatcherReady.get();
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, @NonNull MethodChannel.Result result) {
        try {
            if (methodCall.method.equals("MessagingBackground#initialized")) {
                onInitialized();
                result.success(Boolean.TRUE);
            } else {
                result.notImplemented();
            }
        } catch (PluginRegistrantException e) {
            result.error("error", "Flutter FCM error: " + e.getMessage(), null);
        }
    }

    public void startBackgroundIsolate() {
        if (isNotRunning()) {
            long pluginCallbackHandle = getPluginCallbackHandle();
            if (pluginCallbackHandle != 0) {
                startBackgroundIsolate(pluginCallbackHandle, null);
            }
        }
    }

    public void startBackgroundIsolate(long j, FlutterShellArgs flutterShellArgs) {
        if (this.backgroundFlutterEngine != null) {
            Log.e(TAG, "Background isolate already started.");
            return;
        }
        FlutterLoader flutterLoader = FlutterInjector.instance().flutterLoader();
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new RunnableC0261Ex(this, flutterLoader, handler, flutterShellArgs, j, 0));
    }
}
