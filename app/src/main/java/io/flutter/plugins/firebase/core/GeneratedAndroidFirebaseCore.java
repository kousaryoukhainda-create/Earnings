package io.flutter.plugins.firebase.core;

import android.util.Log;
import androidx.annotation.NonNull;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public class GeneratedAndroidFirebaseCore {

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes2.dex */
    public @interface CanIgnoreReturnValue {
    }

    /* loaded from: classes2.dex */
    public static final class CoreFirebaseOptions {
        private String androidClientId;
        @NonNull
        private String apiKey;
        private String appGroupId;
        @NonNull
        private String appId;
        private String authDomain;
        private String databaseURL;
        private String deepLinkURLScheme;
        private String iosBundleId;
        private String iosClientId;
        private String measurementId;
        @NonNull
        private String messagingSenderId;
        @NonNull
        private String projectId;
        private String storageBucket;
        private String trackingId;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String androidClientId;
            private String apiKey;
            private String appGroupId;
            private String appId;
            private String authDomain;
            private String databaseURL;
            private String deepLinkURLScheme;
            private String iosBundleId;
            private String iosClientId;
            private String measurementId;
            private String messagingSenderId;
            private String projectId;
            private String storageBucket;
            private String trackingId;

            @NonNull
            public CoreFirebaseOptions build() {
                CoreFirebaseOptions coreFirebaseOptions = new CoreFirebaseOptions();
                coreFirebaseOptions.setApiKey(this.apiKey);
                coreFirebaseOptions.setAppId(this.appId);
                coreFirebaseOptions.setMessagingSenderId(this.messagingSenderId);
                coreFirebaseOptions.setProjectId(this.projectId);
                coreFirebaseOptions.setAuthDomain(this.authDomain);
                coreFirebaseOptions.setDatabaseURL(this.databaseURL);
                coreFirebaseOptions.setStorageBucket(this.storageBucket);
                coreFirebaseOptions.setMeasurementId(this.measurementId);
                coreFirebaseOptions.setTrackingId(this.trackingId);
                coreFirebaseOptions.setDeepLinkURLScheme(this.deepLinkURLScheme);
                coreFirebaseOptions.setAndroidClientId(this.androidClientId);
                coreFirebaseOptions.setIosClientId(this.iosClientId);
                coreFirebaseOptions.setIosBundleId(this.iosBundleId);
                coreFirebaseOptions.setAppGroupId(this.appGroupId);
                return coreFirebaseOptions;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAndroidClientId(String str) {
                this.androidClientId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setApiKey(@NonNull String str) {
                this.apiKey = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAppGroupId(String str) {
                this.appGroupId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAppId(@NonNull String str) {
                this.appId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAuthDomain(String str) {
                this.authDomain = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setDatabaseURL(String str) {
                this.databaseURL = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setDeepLinkURLScheme(String str) {
                this.deepLinkURLScheme = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setIosBundleId(String str) {
                this.iosBundleId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setIosClientId(String str) {
                this.iosClientId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setMeasurementId(String str) {
                this.measurementId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setMessagingSenderId(@NonNull String str) {
                this.messagingSenderId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProjectId(@NonNull String str) {
                this.projectId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setStorageBucket(String str) {
                this.storageBucket = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setTrackingId(String str) {
                this.trackingId = str;
                return this;
            }
        }

        @NonNull
        public static CoreFirebaseOptions fromList(@NonNull ArrayList<Object> arrayList) {
            CoreFirebaseOptions coreFirebaseOptions = new CoreFirebaseOptions();
            coreFirebaseOptions.setApiKey((String) arrayList.get(0));
            coreFirebaseOptions.setAppId((String) arrayList.get(1));
            coreFirebaseOptions.setMessagingSenderId((String) arrayList.get(2));
            coreFirebaseOptions.setProjectId((String) arrayList.get(3));
            coreFirebaseOptions.setAuthDomain((String) arrayList.get(4));
            coreFirebaseOptions.setDatabaseURL((String) arrayList.get(5));
            coreFirebaseOptions.setStorageBucket((String) arrayList.get(6));
            coreFirebaseOptions.setMeasurementId((String) arrayList.get(7));
            coreFirebaseOptions.setTrackingId((String) arrayList.get(8));
            coreFirebaseOptions.setDeepLinkURLScheme((String) arrayList.get(9));
            coreFirebaseOptions.setAndroidClientId((String) arrayList.get(10));
            coreFirebaseOptions.setIosClientId((String) arrayList.get(11));
            coreFirebaseOptions.setIosBundleId((String) arrayList.get(12));
            coreFirebaseOptions.setAppGroupId((String) arrayList.get(13));
            return coreFirebaseOptions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || CoreFirebaseOptions.class != obj.getClass()) {
                return false;
            }
            CoreFirebaseOptions coreFirebaseOptions = (CoreFirebaseOptions) obj;
            if (this.apiKey.equals(coreFirebaseOptions.apiKey) && this.appId.equals(coreFirebaseOptions.appId) && this.messagingSenderId.equals(coreFirebaseOptions.messagingSenderId) && this.projectId.equals(coreFirebaseOptions.projectId) && Objects.equals(this.authDomain, coreFirebaseOptions.authDomain) && Objects.equals(this.databaseURL, coreFirebaseOptions.databaseURL) && Objects.equals(this.storageBucket, coreFirebaseOptions.storageBucket) && Objects.equals(this.measurementId, coreFirebaseOptions.measurementId) && Objects.equals(this.trackingId, coreFirebaseOptions.trackingId) && Objects.equals(this.deepLinkURLScheme, coreFirebaseOptions.deepLinkURLScheme) && Objects.equals(this.androidClientId, coreFirebaseOptions.androidClientId) && Objects.equals(this.iosClientId, coreFirebaseOptions.iosClientId) && Objects.equals(this.iosBundleId, coreFirebaseOptions.iosBundleId) && Objects.equals(this.appGroupId, coreFirebaseOptions.appGroupId)) {
                return true;
            }
            return false;
        }

        public String getAndroidClientId() {
            return this.androidClientId;
        }

        @NonNull
        public String getApiKey() {
            return this.apiKey;
        }

        public String getAppGroupId() {
            return this.appGroupId;
        }

        @NonNull
        public String getAppId() {
            return this.appId;
        }

        public String getAuthDomain() {
            return this.authDomain;
        }

        public String getDatabaseURL() {
            return this.databaseURL;
        }

        public String getDeepLinkURLScheme() {
            return this.deepLinkURLScheme;
        }

        public String getIosBundleId() {
            return this.iosBundleId;
        }

        public String getIosClientId() {
            return this.iosClientId;
        }

        public String getMeasurementId() {
            return this.measurementId;
        }

        @NonNull
        public String getMessagingSenderId() {
            return this.messagingSenderId;
        }

        @NonNull
        public String getProjectId() {
            return this.projectId;
        }

        public String getStorageBucket() {
            return this.storageBucket;
        }

        public String getTrackingId() {
            return this.trackingId;
        }

        public int hashCode() {
            return Objects.hash(this.apiKey, this.appId, this.messagingSenderId, this.projectId, this.authDomain, this.databaseURL, this.storageBucket, this.measurementId, this.trackingId, this.deepLinkURLScheme, this.androidClientId, this.iosClientId, this.iosBundleId, this.appGroupId);
        }

        public void setAndroidClientId(String str) {
            this.androidClientId = str;
        }

        public void setApiKey(@NonNull String str) {
            if (str != null) {
                this.apiKey = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }

        public void setAppGroupId(String str) {
            this.appGroupId = str;
        }

        public void setAppId(@NonNull String str) {
            if (str != null) {
                this.appId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }

        public void setAuthDomain(String str) {
            this.authDomain = str;
        }

        public void setDatabaseURL(String str) {
            this.databaseURL = str;
        }

        public void setDeepLinkURLScheme(String str) {
            this.deepLinkURLScheme = str;
        }

        public void setIosBundleId(String str) {
            this.iosBundleId = str;
        }

        public void setIosClientId(String str) {
            this.iosClientId = str;
        }

        public void setMeasurementId(String str) {
            this.measurementId = str;
        }

        public void setMessagingSenderId(@NonNull String str) {
            if (str != null) {
                this.messagingSenderId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }

        public void setProjectId(@NonNull String str) {
            if (str != null) {
                this.projectId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }

        public void setStorageBucket(String str) {
            this.storageBucket = str;
        }

        public void setTrackingId(String str) {
            this.trackingId = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(14);
            arrayList.add(this.apiKey);
            arrayList.add(this.appId);
            arrayList.add(this.messagingSenderId);
            arrayList.add(this.projectId);
            arrayList.add(this.authDomain);
            arrayList.add(this.databaseURL);
            arrayList.add(this.storageBucket);
            arrayList.add(this.measurementId);
            arrayList.add(this.trackingId);
            arrayList.add(this.deepLinkURLScheme);
            arrayList.add(this.androidClientId);
            arrayList.add(this.iosClientId);
            arrayList.add(this.iosBundleId);
            arrayList.add(this.appGroupId);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class CoreInitializeResponse {
        private Boolean isAutomaticDataCollectionEnabled;
        @NonNull
        private String name;
        @NonNull
        private CoreFirebaseOptions options;
        @NonNull
        private Map<String, Object> pluginConstants;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Boolean isAutomaticDataCollectionEnabled;
            private String name;
            private CoreFirebaseOptions options;
            private Map<String, Object> pluginConstants;

            @NonNull
            public CoreInitializeResponse build() {
                CoreInitializeResponse coreInitializeResponse = new CoreInitializeResponse();
                coreInitializeResponse.setName(this.name);
                coreInitializeResponse.setOptions(this.options);
                coreInitializeResponse.setIsAutomaticDataCollectionEnabled(this.isAutomaticDataCollectionEnabled);
                coreInitializeResponse.setPluginConstants(this.pluginConstants);
                return coreInitializeResponse;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setIsAutomaticDataCollectionEnabled(Boolean bool) {
                this.isAutomaticDataCollectionEnabled = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setName(@NonNull String str) {
                this.name = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOptions(@NonNull CoreFirebaseOptions coreFirebaseOptions) {
                this.options = coreFirebaseOptions;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPluginConstants(@NonNull Map<String, Object> map) {
                this.pluginConstants = map;
                return this;
            }
        }

        @NonNull
        public static CoreInitializeResponse fromList(@NonNull ArrayList<Object> arrayList) {
            CoreInitializeResponse coreInitializeResponse = new CoreInitializeResponse();
            coreInitializeResponse.setName((String) arrayList.get(0));
            coreInitializeResponse.setOptions((CoreFirebaseOptions) arrayList.get(1));
            coreInitializeResponse.setIsAutomaticDataCollectionEnabled((Boolean) arrayList.get(2));
            coreInitializeResponse.setPluginConstants((Map) arrayList.get(3));
            return coreInitializeResponse;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || CoreInitializeResponse.class != obj.getClass()) {
                return false;
            }
            CoreInitializeResponse coreInitializeResponse = (CoreInitializeResponse) obj;
            if (this.name.equals(coreInitializeResponse.name) && this.options.equals(coreInitializeResponse.options) && Objects.equals(this.isAutomaticDataCollectionEnabled, coreInitializeResponse.isAutomaticDataCollectionEnabled) && this.pluginConstants.equals(coreInitializeResponse.pluginConstants)) {
                return true;
            }
            return false;
        }

        public Boolean getIsAutomaticDataCollectionEnabled() {
            return this.isAutomaticDataCollectionEnabled;
        }

        @NonNull
        public String getName() {
            return this.name;
        }

        @NonNull
        public CoreFirebaseOptions getOptions() {
            return this.options;
        }

        @NonNull
        public Map<String, Object> getPluginConstants() {
            return this.pluginConstants;
        }

        public int hashCode() {
            return Objects.hash(this.name, this.options, this.isAutomaticDataCollectionEnabled, this.pluginConstants);
        }

        public void setIsAutomaticDataCollectionEnabled(Boolean bool) {
            this.isAutomaticDataCollectionEnabled = bool;
        }

        public void setName(@NonNull String str) {
            if (str != null) {
                this.name = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }

        public void setOptions(@NonNull CoreFirebaseOptions coreFirebaseOptions) {
            if (coreFirebaseOptions != null) {
                this.options = coreFirebaseOptions;
                return;
            }
            throw new IllegalStateException("Nonnull field \"options\" is null.");
        }

        public void setPluginConstants(@NonNull Map<String, Object> map) {
            if (map != null) {
                this.pluginConstants = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.name);
            arrayList.add(this.options);
            arrayList.add(this.isAutomaticDataCollectionEnabled);
            arrayList.add(this.pluginConstants);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public interface FirebaseAppHostApi {

        /* renamed from: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore$FirebaseAppHostApi$-CC  reason: invalid class name */
        /* loaded from: classes2.dex */
        public abstract /* synthetic */ class CC {
            public static MessageCodec a() {
                return PigeonCodec.INSTANCE;
            }

            public static /* synthetic */ void b(FirebaseAppHostApi firebaseAppHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAppHostApi.setAutomaticDataCollectionEnabled((String) arrayList2.get(0), (Boolean) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi.1
                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseCore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void c(FirebaseAppHostApi firebaseAppHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAppHostApi.setAutomaticResourceManagementEnabled((String) arrayList2.get(0), (Boolean) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi.2
                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseCore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(FirebaseAppHostApi firebaseAppHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseAppHostApi.delete((String) ((ArrayList) obj).get(0), new VoidResult() { // from class: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi.3
                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseCore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void e(BinaryMessenger binaryMessenger, FirebaseAppHostApi firebaseAppHostApi) {
                f(binaryMessenger, "", firebaseAppHostApi);
            }

            public static void f(BinaryMessenger binaryMessenger, String str, final FirebaseAppHostApi firebaseAppHostApi) {
                String concat;
                if (str.isEmpty()) {
                    concat = "";
                } else {
                    concat = ".".concat(str);
                }
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", concat), a());
                if (firebaseAppHostApi != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: DA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.b(firebaseAppHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.c(firebaseAppHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.d(firebaseAppHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", concat), a());
                if (firebaseAppHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: DA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.b(firebaseAppHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.c(firebaseAppHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.d(firebaseAppHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_core_platform_interface.FirebaseAppHostApi.delete", concat), a());
                if (firebaseAppHostApi != null) {
                    basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: DA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.b(firebaseAppHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.c(firebaseAppHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.d(firebaseAppHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel3.setMessageHandler(null);
                }
            }
        }

        void delete(@NonNull String str, @NonNull VoidResult voidResult);

        void setAutomaticDataCollectionEnabled(@NonNull String str, @NonNull Boolean bool, @NonNull VoidResult voidResult);

        void setAutomaticResourceManagementEnabled(@NonNull String str, @NonNull Boolean bool, @NonNull VoidResult voidResult);
    }

    /* loaded from: classes2.dex */
    public interface FirebaseCoreHostApi {

        /* renamed from: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore$FirebaseCoreHostApi$-CC  reason: invalid class name */
        /* loaded from: classes2.dex */
        public abstract /* synthetic */ class CC {
            public static MessageCodec a() {
                return PigeonCodec.INSTANCE;
            }

            public static /* synthetic */ void b(FirebaseCoreHostApi firebaseCoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseCoreHostApi.initializeApp((String) arrayList2.get(0), (CoreFirebaseOptions) arrayList2.get(1), new Result<CoreInitializeResponse>() { // from class: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.1
                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseCore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void success(CoreInitializeResponse coreInitializeResponse) {
                        arrayList.add(0, coreInitializeResponse);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void c(FirebaseCoreHostApi firebaseCoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseCoreHostApi.initializeCore(new Result<List<CoreInitializeResponse>>() { // from class: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.2
                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseCore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void success(List<CoreInitializeResponse> list) {
                        arrayList.add(0, list);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(FirebaseCoreHostApi firebaseCoreHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseCoreHostApi.optionsFromResource(new Result<CoreFirebaseOptions>() { // from class: io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.3
                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseCore.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.Result
                    public void success(CoreFirebaseOptions coreFirebaseOptions) {
                        arrayList.add(0, coreFirebaseOptions);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void e(BinaryMessenger binaryMessenger, FirebaseCoreHostApi firebaseCoreHostApi) {
                f(binaryMessenger, "", firebaseCoreHostApi);
            }

            public static void f(BinaryMessenger binaryMessenger, String str, final FirebaseCoreHostApi firebaseCoreHostApi) {
                String concat;
                if (str.isEmpty()) {
                    concat = "";
                } else {
                    concat = ".".concat(str);
                }
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.initializeApp", concat), a());
                if (firebaseCoreHostApi != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: EA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.b(firebaseCoreHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.c(firebaseCoreHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.d(firebaseCoreHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.initializeCore", concat), a());
                if (firebaseCoreHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: EA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.b(firebaseCoreHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.c(firebaseCoreHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.d(firebaseCoreHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_core_platform_interface.FirebaseCoreHostApi.optionsFromResource", concat), a());
                if (firebaseCoreHostApi != null) {
                    basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: EA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.b(firebaseCoreHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.c(firebaseCoreHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.d(firebaseCoreHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel3.setMessageHandler(null);
                }
            }
        }

        void initializeApp(@NonNull String str, @NonNull CoreFirebaseOptions coreFirebaseOptions, @NonNull Result<CoreInitializeResponse> result);

        void initializeCore(@NonNull Result<List<CoreInitializeResponse>> result);

        void optionsFromResource(@NonNull Result<CoreFirebaseOptions> result);
    }

    /* loaded from: classes2.dex */
    public static class FlutterError extends RuntimeException {
        public final String code;
        public final Object details;

        public FlutterError(@NonNull String str, String str2, Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    /* loaded from: classes2.dex */
    public interface NullableResult<T> {
        void error(@NonNull Throwable th);

        void success(T t);
    }

    /* loaded from: classes2.dex */
    public static class PigeonCodec extends StandardMessageCodec {
        public static final PigeonCodec INSTANCE = new PigeonCodec();

        private PigeonCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
            if (b != -127) {
                if (b != -126) {
                    return super.readValueOfType(b, byteBuffer);
                }
                return CoreInitializeResponse.fromList((ArrayList) readValue(byteBuffer));
            }
            return CoreFirebaseOptions.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof CoreFirebaseOptions) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((CoreFirebaseOptions) obj).toList());
            } else if (obj instanceof CoreInitializeResponse) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((CoreInitializeResponse) obj).toList());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface Result<T> {
        void error(@NonNull Throwable th);

        void success(@NonNull T t);
    }

    /* loaded from: classes2.dex */
    public interface VoidResult {
        void error(@NonNull Throwable th);

        void success();
    }

    @NonNull
    public static ArrayList<Object> wrapError(@NonNull Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof FlutterError) {
            FlutterError flutterError = (FlutterError) th;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
