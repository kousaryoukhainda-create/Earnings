package io.flutter.plugins.googlesignin;

import android.util.Log;
import androidx.annotation.NonNull;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.googlesignin.Messages;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public class Messages {

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes2.dex */
    public @interface CanIgnoreReturnValue {
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
    public interface GoogleSignInApi {

        /* renamed from: io.flutter.plugins.googlesignin.Messages$GoogleSignInApi$-CC  reason: invalid class name */
        /* loaded from: classes2.dex */
        public abstract /* synthetic */ class CC {
            public static MessageCodec a() {
                return PigeonCodec.INSTANCE;
            }

            public static /* synthetic */ void b(GoogleSignInApi googleSignInApi, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    googleSignInApi.init((InitParams) ((ArrayList) obj).get(0));
                    arrayList.add(0, null);
                } catch (Throwable th) {
                    arrayList = Messages.wrapError(th);
                }
                reply.reply(arrayList);
            }

            public static /* synthetic */ void c(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                googleSignInApi.signInSilently(new Result<UserData>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.1
                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void success(UserData userData) {
                        arrayList.add(0, userData);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                googleSignInApi.signIn(new Result<UserData>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.2
                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void success(UserData userData) {
                        arrayList.add(0, userData);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void e(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                googleSignInApi.getAccessToken((String) arrayList2.get(0), (Boolean) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.3
                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void f(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                googleSignInApi.signOut(new VoidResult() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.4
                    @Override // io.flutter.plugins.googlesignin.Messages.VoidResult
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.googlesignin.Messages.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void g(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                googleSignInApi.disconnect(new VoidResult() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.5
                    @Override // io.flutter.plugins.googlesignin.Messages.VoidResult
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.googlesignin.Messages.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void h(GoogleSignInApi googleSignInApi, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    arrayList.add(0, googleSignInApi.isSignedIn());
                } catch (Throwable th) {
                    arrayList = Messages.wrapError(th);
                }
                reply.reply(arrayList);
            }

            public static /* synthetic */ void i(GoogleSignInApi googleSignInApi, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    googleSignInApi.clearAuthCache((String) ((ArrayList) obj).get(0));
                    arrayList.add(0, null);
                } catch (Throwable th) {
                    arrayList = Messages.wrapError(th);
                }
                reply.reply(arrayList);
            }

            public static /* synthetic */ void j(GoogleSignInApi googleSignInApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                googleSignInApi.requestScopes((List) ((ArrayList) obj).get(0), new Result<Boolean>() { // from class: io.flutter.plugins.googlesignin.Messages.GoogleSignInApi.6
                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.googlesignin.Messages.Result
                    public void success(Boolean bool) {
                        arrayList.add(0, bool);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void k(BinaryMessenger binaryMessenger, GoogleSignInApi googleSignInApi) {
                l(binaryMessenger, "", googleSignInApi);
            }

            public static void l(BinaryMessenger binaryMessenger, String str, final GoogleSignInApi googleSignInApi) {
                String concat;
                if (str.isEmpty()) {
                    concat = "";
                } else {
                    concat = ".".concat(str);
                }
                BinaryMessenger.TaskQueue makeBackgroundTaskQueue = binaryMessenger.makeBackgroundTaskQueue();
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.init", concat), a());
                if (googleSignInApi != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: rM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.b(googleSignInApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.GoogleSignInApi.CC.c(googleSignInApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.GoogleSignInApi.CC.d(googleSignInApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.GoogleSignInApi.CC.e(googleSignInApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.GoogleSignInApi.CC.f(googleSignInApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.GoogleSignInApi.CC.g(googleSignInApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.GoogleSignInApi.CC.h(googleSignInApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.GoogleSignInApi.CC.i(googleSignInApi, obj, reply);
                                    return;
                                default:
                                    Messages.GoogleSignInApi.CC.j(googleSignInApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signInSilently", concat), a());
                if (googleSignInApi != null) {
                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: rM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.b(googleSignInApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.GoogleSignInApi.CC.c(googleSignInApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.GoogleSignInApi.CC.d(googleSignInApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.GoogleSignInApi.CC.e(googleSignInApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.GoogleSignInApi.CC.f(googleSignInApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.GoogleSignInApi.CC.g(googleSignInApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.GoogleSignInApi.CC.h(googleSignInApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.GoogleSignInApi.CC.i(googleSignInApi, obj, reply);
                                    return;
                                default:
                                    Messages.GoogleSignInApi.CC.j(googleSignInApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signIn", concat), a());
                if (googleSignInApi != null) {
                    basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: rM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.b(googleSignInApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.GoogleSignInApi.CC.c(googleSignInApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.GoogleSignInApi.CC.d(googleSignInApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.GoogleSignInApi.CC.e(googleSignInApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.GoogleSignInApi.CC.f(googleSignInApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.GoogleSignInApi.CC.g(googleSignInApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.GoogleSignInApi.CC.h(googleSignInApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.GoogleSignInApi.CC.i(googleSignInApi, obj, reply);
                                    return;
                                default:
                                    Messages.GoogleSignInApi.CC.j(googleSignInApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel3.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.getAccessToken", concat), a(), makeBackgroundTaskQueue);
                if (googleSignInApi != null) {
                    basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: rM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.b(googleSignInApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.GoogleSignInApi.CC.c(googleSignInApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.GoogleSignInApi.CC.d(googleSignInApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.GoogleSignInApi.CC.e(googleSignInApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.GoogleSignInApi.CC.f(googleSignInApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.GoogleSignInApi.CC.g(googleSignInApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.GoogleSignInApi.CC.h(googleSignInApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.GoogleSignInApi.CC.i(googleSignInApi, obj, reply);
                                    return;
                                default:
                                    Messages.GoogleSignInApi.CC.j(googleSignInApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel4.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.signOut", concat), a());
                if (googleSignInApi != null) {
                    basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: rM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.b(googleSignInApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.GoogleSignInApi.CC.c(googleSignInApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.GoogleSignInApi.CC.d(googleSignInApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.GoogleSignInApi.CC.e(googleSignInApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.GoogleSignInApi.CC.f(googleSignInApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.GoogleSignInApi.CC.g(googleSignInApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.GoogleSignInApi.CC.h(googleSignInApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.GoogleSignInApi.CC.i(googleSignInApi, obj, reply);
                                    return;
                                default:
                                    Messages.GoogleSignInApi.CC.j(googleSignInApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel5.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.disconnect", concat), a());
                if (googleSignInApi != null) {
                    basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: rM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.b(googleSignInApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.GoogleSignInApi.CC.c(googleSignInApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.GoogleSignInApi.CC.d(googleSignInApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.GoogleSignInApi.CC.e(googleSignInApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.GoogleSignInApi.CC.f(googleSignInApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.GoogleSignInApi.CC.g(googleSignInApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.GoogleSignInApi.CC.h(googleSignInApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.GoogleSignInApi.CC.i(googleSignInApi, obj, reply);
                                    return;
                                default:
                                    Messages.GoogleSignInApi.CC.j(googleSignInApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel6.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.isSignedIn", concat), a());
                if (googleSignInApi != null) {
                    basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: rM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.b(googleSignInApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.GoogleSignInApi.CC.c(googleSignInApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.GoogleSignInApi.CC.d(googleSignInApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.GoogleSignInApi.CC.e(googleSignInApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.GoogleSignInApi.CC.f(googleSignInApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.GoogleSignInApi.CC.g(googleSignInApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.GoogleSignInApi.CC.h(googleSignInApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.GoogleSignInApi.CC.i(googleSignInApi, obj, reply);
                                    return;
                                default:
                                    Messages.GoogleSignInApi.CC.j(googleSignInApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel7.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.clearAuthCache", concat), a(), makeBackgroundTaskQueue);
                if (googleSignInApi != null) {
                    basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: rM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.b(googleSignInApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.GoogleSignInApi.CC.c(googleSignInApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.GoogleSignInApi.CC.d(googleSignInApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.GoogleSignInApi.CC.e(googleSignInApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.GoogleSignInApi.CC.f(googleSignInApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.GoogleSignInApi.CC.g(googleSignInApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.GoogleSignInApi.CC.h(googleSignInApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.GoogleSignInApi.CC.i(googleSignInApi, obj, reply);
                                    return;
                                default:
                                    Messages.GoogleSignInApi.CC.j(googleSignInApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel8.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.google_sign_in_android.GoogleSignInApi.requestScopes", concat), a());
                if (googleSignInApi != null) {
                    basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: rM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.GoogleSignInApi.CC.b(googleSignInApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.GoogleSignInApi.CC.c(googleSignInApi, obj, reply);
                                    return;
                                case 2:
                                    Messages.GoogleSignInApi.CC.d(googleSignInApi, obj, reply);
                                    return;
                                case 3:
                                    Messages.GoogleSignInApi.CC.e(googleSignInApi, obj, reply);
                                    return;
                                case 4:
                                    Messages.GoogleSignInApi.CC.f(googleSignInApi, obj, reply);
                                    return;
                                case 5:
                                    Messages.GoogleSignInApi.CC.g(googleSignInApi, obj, reply);
                                    return;
                                case 6:
                                    Messages.GoogleSignInApi.CC.h(googleSignInApi, obj, reply);
                                    return;
                                case 7:
                                    Messages.GoogleSignInApi.CC.i(googleSignInApi, obj, reply);
                                    return;
                                default:
                                    Messages.GoogleSignInApi.CC.j(googleSignInApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel9.setMessageHandler(null);
                }
            }
        }

        void clearAuthCache(@NonNull String str);

        void disconnect(@NonNull VoidResult voidResult);

        void getAccessToken(@NonNull String str, @NonNull Boolean bool, @NonNull Result<String> result);

        void init(@NonNull InitParams initParams);

        @NonNull
        Boolean isSignedIn();

        void requestScopes(@NonNull List<String> list, @NonNull Result<Boolean> result);

        void signIn(@NonNull Result<UserData> result);

        void signInSilently(@NonNull Result<UserData> result);

        void signOut(@NonNull VoidResult voidResult);
    }

    /* loaded from: classes2.dex */
    public static final class InitParams {
        private String clientId;
        private String forceAccountName;
        @NonNull
        private Boolean forceCodeForRefreshToken;
        private String hostedDomain;
        @NonNull
        private List<String> scopes;
        private String serverClientId;
        @NonNull
        private SignInType signInType;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String clientId;
            private String forceAccountName;
            private Boolean forceCodeForRefreshToken;
            private String hostedDomain;
            private List<String> scopes;
            private String serverClientId;
            private SignInType signInType;

            @NonNull
            public InitParams build() {
                InitParams initParams = new InitParams();
                initParams.setScopes(this.scopes);
                initParams.setSignInType(this.signInType);
                initParams.setHostedDomain(this.hostedDomain);
                initParams.setClientId(this.clientId);
                initParams.setServerClientId(this.serverClientId);
                initParams.setForceCodeForRefreshToken(this.forceCodeForRefreshToken);
                initParams.setForceAccountName(this.forceAccountName);
                return initParams;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setClientId(String str) {
                this.clientId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setForceAccountName(String str) {
                this.forceAccountName = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setForceCodeForRefreshToken(@NonNull Boolean bool) {
                this.forceCodeForRefreshToken = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setHostedDomain(String str) {
                this.hostedDomain = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setScopes(@NonNull List<String> list) {
                this.scopes = list;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setServerClientId(String str) {
                this.serverClientId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSignInType(@NonNull SignInType signInType) {
                this.signInType = signInType;
                return this;
            }
        }

        @NonNull
        public static InitParams fromList(@NonNull ArrayList<Object> arrayList) {
            InitParams initParams = new InitParams();
            initParams.setScopes((List) arrayList.get(0));
            initParams.setSignInType((SignInType) arrayList.get(1));
            initParams.setHostedDomain((String) arrayList.get(2));
            initParams.setClientId((String) arrayList.get(3));
            initParams.setServerClientId((String) arrayList.get(4));
            initParams.setForceCodeForRefreshToken((Boolean) arrayList.get(5));
            initParams.setForceAccountName((String) arrayList.get(6));
            return initParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || InitParams.class != obj.getClass()) {
                return false;
            }
            InitParams initParams = (InitParams) obj;
            if (this.scopes.equals(initParams.scopes) && this.signInType.equals(initParams.signInType) && Objects.equals(this.hostedDomain, initParams.hostedDomain) && Objects.equals(this.clientId, initParams.clientId) && Objects.equals(this.serverClientId, initParams.serverClientId) && this.forceCodeForRefreshToken.equals(initParams.forceCodeForRefreshToken) && Objects.equals(this.forceAccountName, initParams.forceAccountName)) {
                return true;
            }
            return false;
        }

        public String getClientId() {
            return this.clientId;
        }

        public String getForceAccountName() {
            return this.forceAccountName;
        }

        @NonNull
        public Boolean getForceCodeForRefreshToken() {
            return this.forceCodeForRefreshToken;
        }

        public String getHostedDomain() {
            return this.hostedDomain;
        }

        @NonNull
        public List<String> getScopes() {
            return this.scopes;
        }

        public String getServerClientId() {
            return this.serverClientId;
        }

        @NonNull
        public SignInType getSignInType() {
            return this.signInType;
        }

        public int hashCode() {
            return Objects.hash(this.scopes, this.signInType, this.hostedDomain, this.clientId, this.serverClientId, this.forceCodeForRefreshToken, this.forceAccountName);
        }

        public void setClientId(String str) {
            this.clientId = str;
        }

        public void setForceAccountName(String str) {
            this.forceAccountName = str;
        }

        public void setForceCodeForRefreshToken(@NonNull Boolean bool) {
            if (bool != null) {
                this.forceCodeForRefreshToken = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"forceCodeForRefreshToken\" is null.");
        }

        public void setHostedDomain(String str) {
            this.hostedDomain = str;
        }

        public void setScopes(@NonNull List<String> list) {
            if (list != null) {
                this.scopes = list;
                return;
            }
            throw new IllegalStateException("Nonnull field \"scopes\" is null.");
        }

        public void setServerClientId(String str) {
            this.serverClientId = str;
        }

        public void setSignInType(@NonNull SignInType signInType) {
            if (signInType != null) {
                this.signInType = signInType;
                return;
            }
            throw new IllegalStateException("Nonnull field \"signInType\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.scopes);
            arrayList.add(this.signInType);
            arrayList.add(this.hostedDomain);
            arrayList.add(this.clientId);
            arrayList.add(this.serverClientId);
            arrayList.add(this.forceCodeForRefreshToken);
            arrayList.add(this.forceAccountName);
            return arrayList;
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
            switch (b) {
                case -127:
                    Object readValue = readValue(byteBuffer);
                    if (readValue == null) {
                        return null;
                    }
                    return SignInType.values()[((Long) readValue).intValue()];
                case -126:
                    return InitParams.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return UserData.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Integer valueOf;
            if (obj instanceof SignInType) {
                byteArrayOutputStream.write(129);
                if (obj == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(((SignInType) obj).index);
                }
                writeValue(byteArrayOutputStream, valueOf);
            } else if (obj instanceof InitParams) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((InitParams) obj).toList());
            } else if (obj instanceof UserData) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((UserData) obj).toList());
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
    public enum SignInType {
        STANDARD(0),
        GAMES(1);
        
        final int index;

        SignInType(int i) {
            this.index = i;
        }
    }

    /* loaded from: classes2.dex */
    public static final class UserData {
        private String displayName;
        @NonNull
        private String email;
        @NonNull
        private String id;
        private String idToken;
        private String photoUrl;
        private String serverAuthCode;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String displayName;
            private String email;
            private String id;
            private String idToken;
            private String photoUrl;
            private String serverAuthCode;

            @NonNull
            public UserData build() {
                UserData userData = new UserData();
                userData.setDisplayName(this.displayName);
                userData.setEmail(this.email);
                userData.setId(this.id);
                userData.setPhotoUrl(this.photoUrl);
                userData.setIdToken(this.idToken);
                userData.setServerAuthCode(this.serverAuthCode);
                return userData;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setDisplayName(String str) {
                this.displayName = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setEmail(@NonNull String str) {
                this.email = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setId(@NonNull String str) {
                this.id = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setIdToken(String str) {
                this.idToken = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPhotoUrl(String str) {
                this.photoUrl = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setServerAuthCode(String str) {
                this.serverAuthCode = str;
                return this;
            }
        }

        @NonNull
        public static UserData fromList(@NonNull ArrayList<Object> arrayList) {
            UserData userData = new UserData();
            userData.setDisplayName((String) arrayList.get(0));
            userData.setEmail((String) arrayList.get(1));
            userData.setId((String) arrayList.get(2));
            userData.setPhotoUrl((String) arrayList.get(3));
            userData.setIdToken((String) arrayList.get(4));
            userData.setServerAuthCode((String) arrayList.get(5));
            return userData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || UserData.class != obj.getClass()) {
                return false;
            }
            UserData userData = (UserData) obj;
            if (Objects.equals(this.displayName, userData.displayName) && this.email.equals(userData.email) && this.id.equals(userData.id) && Objects.equals(this.photoUrl, userData.photoUrl) && Objects.equals(this.idToken, userData.idToken) && Objects.equals(this.serverAuthCode, userData.serverAuthCode)) {
                return true;
            }
            return false;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        @NonNull
        public String getEmail() {
            return this.email;
        }

        @NonNull
        public String getId() {
            return this.id;
        }

        public String getIdToken() {
            return this.idToken;
        }

        public String getPhotoUrl() {
            return this.photoUrl;
        }

        public String getServerAuthCode() {
            return this.serverAuthCode;
        }

        public int hashCode() {
            return Objects.hash(this.displayName, this.email, this.id, this.photoUrl, this.idToken, this.serverAuthCode);
        }

        public void setDisplayName(String str) {
            this.displayName = str;
        }

        public void setEmail(@NonNull String str) {
            if (str != null) {
                this.email = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"email\" is null.");
        }

        public void setId(@NonNull String str) {
            if (str != null) {
                this.id = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"id\" is null.");
        }

        public void setIdToken(String str) {
            this.idToken = str;
        }

        public void setPhotoUrl(String str) {
            this.photoUrl = str;
        }

        public void setServerAuthCode(String str) {
            this.serverAuthCode = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.displayName);
            arrayList.add(this.email);
            arrayList.add(this.id);
            arrayList.add(this.photoUrl);
            arrayList.add(this.idToken);
            arrayList.add(this.serverAuthCode);
            return arrayList;
        }
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
