package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class LocalizationChannel {
    private static final String TAG = "LocalizationChannel";
    @NonNull
    public final MethodChannel channel;
    @NonNull
    public final MethodChannel.MethodCallHandler handler;
    private LocalizationMessageHandler localizationMessageHandler;

    /* loaded from: classes2.dex */
    public interface LocalizationMessageHandler {
        @NonNull
        String getStringResource(@NonNull String str, @NonNull String str2);
    }

    public LocalizationChannel(@NonNull DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.LocalizationChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                String str;
                if (LocalizationChannel.this.localizationMessageHandler == null) {
                    return;
                }
                String str2 = methodCall.method;
                str2.getClass();
                if (!str2.equals("Localization.getStringResource")) {
                    result.notImplemented();
                    return;
                }
                JSONObject jSONObject = (JSONObject) methodCall.arguments();
                try {
                    String string = jSONObject.getString(Constants.KEY);
                    if (jSONObject.has("locale")) {
                        str = jSONObject.getString("locale");
                    } else {
                        str = null;
                    }
                    result.success(LocalizationChannel.this.localizationMessageHandler.getStringResource(string, str));
                } catch (JSONException e) {
                    result.error("error", e.getMessage(), null);
                }
            }
        };
        this.handler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/localization", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    public void sendLocales(@NonNull List<Locale> list) {
        Log.v(TAG, "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            Log.v(TAG, "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.channel.invokeMethod("setLocale", arrayList);
    }

    public void setLocalizationMessageHandler(LocalizationMessageHandler localizationMessageHandler) {
        this.localizationMessageHandler = localizationMessageHandler;
    }
}
