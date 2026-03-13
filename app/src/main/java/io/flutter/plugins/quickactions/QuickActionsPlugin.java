package io.flutter.plugins.quickactions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.quickactions.Messages;
/* loaded from: classes2.dex */
public class QuickActionsPlugin implements FlutterPlugin, ActivityAware, PluginRegistry.NewIntentListener {
    private static final String TAG = "QuickActionsAndroid";
    private QuickActions quickActions;
    private Messages.AndroidQuickActionsFlutterApi quickActionsFlutterApi;
    @NonNull
    private final AndroidSdkChecker sdkChecker;

    /* loaded from: classes2.dex */
    public interface AndroidSdkChecker {
        boolean sdkIsAtLeast(int i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.flutter.plugins.quickactions.QuickActionsPlugin$AndroidSdkChecker, java.lang.Object] */
    public QuickActionsPlugin() {
        this(new Object());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(int i) {
        if (Build.VERSION.SDK_INT >= i) {
            return true;
        }
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(@NonNull ActivityPluginBinding activityPluginBinding) {
        if (this.quickActions == null) {
            Log.wtf(TAG, "quickActions was never set.");
            return;
        }
        Activity activity = activityPluginBinding.getActivity();
        this.quickActions.setActivity(activity);
        activityPluginBinding.addOnNewIntentListener(this);
        onNewIntent(activity.getIntent());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.quickActions = new QuickActions(flutterPluginBinding.getApplicationContext());
        Messages.AndroidQuickActionsApi.CC.e(flutterPluginBinding.getBinaryMessenger(), this.quickActions);
        this.quickActionsFlutterApi = new Messages.AndroidQuickActionsFlutterApi(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.quickActions.setActivity(null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(@NonNull FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Messages.AndroidQuickActionsApi.CC.e(flutterPluginBinding.getBinaryMessenger(), null);
        this.quickActions = null;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public boolean onNewIntent(@NonNull Intent intent) {
        if (!this.sdkChecker.sdkIsAtLeast(25)) {
            return false;
        }
        Activity activity = this.quickActions.getActivity();
        if (intent.hasExtra("some unique action key") && activity != null) {
            Context applicationContext = activity.getApplicationContext();
            String stringExtra = intent.getStringExtra("some unique action key");
            if (stringExtra != null) {
                this.quickActionsFlutterApi.launchAction(stringExtra, new Messages.VoidResult() { // from class: io.flutter.plugins.quickactions.QuickActionsPlugin.1
                    @Override // io.flutter.plugins.quickactions.Messages.VoidResult
                    public void error(@NonNull Throwable th) {
                        Log.e(QuickActionsPlugin.TAG, "Failed to handle launch action: " + th.getMessage());
                    }

                    @Override // io.flutter.plugins.quickactions.Messages.VoidResult
                    public void success() {
                    }
                });
                B10.Z(applicationContext, stringExtra);
            }
        }
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(@NonNull ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.removeOnNewIntentListener(this);
        onAttachedToActivity(activityPluginBinding);
    }

    public QuickActionsPlugin(@NonNull AndroidSdkChecker androidSdkChecker) {
        this.sdkChecker = androidSdkChecker;
    }
}
