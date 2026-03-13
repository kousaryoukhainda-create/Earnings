package io.flutter.plugins.firebase.auth;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class GeneratedAndroidFirebaseAuth {

    /* loaded from: classes2.dex */
    public enum ActionCodeInfoOperation {
        UNKNOWN(0),
        PASSWORD_RESET(1),
        VERIFY_EMAIL(2),
        RECOVER_EMAIL(3),
        EMAIL_SIGN_IN(4),
        VERIFY_AND_CHANGE_EMAIL(5),
        REVERT_SECOND_FACTOR_ADDITION(6);
        
        final int index;

        ActionCodeInfoOperation(int i) {
            this.index = i;
        }
    }

    /* loaded from: classes2.dex */
    public static final class AuthPigeonFirebaseApp {
        @NonNull
        private String appName;
        private String customAuthDomain;
        private String tenantId;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String appName;
            private String customAuthDomain;
            private String tenantId;

            @NonNull
            public AuthPigeonFirebaseApp build() {
                AuthPigeonFirebaseApp authPigeonFirebaseApp = new AuthPigeonFirebaseApp();
                authPigeonFirebaseApp.setAppName(this.appName);
                authPigeonFirebaseApp.setTenantId(this.tenantId);
                authPigeonFirebaseApp.setCustomAuthDomain(this.customAuthDomain);
                return authPigeonFirebaseApp;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAppName(@NonNull String str) {
                this.appName = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setCustomAuthDomain(String str) {
                this.customAuthDomain = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setTenantId(String str) {
                this.tenantId = str;
                return this;
            }
        }

        @NonNull
        public static AuthPigeonFirebaseApp fromList(@NonNull ArrayList<Object> arrayList) {
            AuthPigeonFirebaseApp authPigeonFirebaseApp = new AuthPigeonFirebaseApp();
            authPigeonFirebaseApp.setAppName((String) arrayList.get(0));
            authPigeonFirebaseApp.setTenantId((String) arrayList.get(1));
            authPigeonFirebaseApp.setCustomAuthDomain((String) arrayList.get(2));
            return authPigeonFirebaseApp;
        }

        @NonNull
        public String getAppName() {
            return this.appName;
        }

        public String getCustomAuthDomain() {
            return this.customAuthDomain;
        }

        public String getTenantId() {
            return this.tenantId;
        }

        public void setAppName(@NonNull String str) {
            if (str != null) {
                this.appName = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"appName\" is null.");
        }

        public void setCustomAuthDomain(String str) {
            this.customAuthDomain = str;
        }

        public void setTenantId(String str) {
            this.tenantId = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.appName);
            arrayList.add(this.tenantId);
            arrayList.add(this.customAuthDomain);
            return arrayList;
        }
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes2.dex */
    public @interface CanIgnoreReturnValue {
    }

    /* loaded from: classes2.dex */
    public interface FirebaseAuthHostApi {

        /* renamed from: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$FirebaseAuthHostApi$-CC */
        /* loaded from: classes2.dex */
        public abstract /* synthetic */ class CC {
            public static MessageCodec a() {
                return FirebaseAuthHostApiCodec.INSTANCE;
            }

            public static /* synthetic */ void b(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseAuthHostApi.registerIdTokenListener((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.1
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void c(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseAuthHostApi.registerAuthStateListener((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.2
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.signInWithEmailAndPassword((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.11
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void e(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.signInWithEmailLink((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.12
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void f(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.signInWithProvider((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonSignInProvider) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.13
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void g(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseAuthHostApi.signOut((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.14
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void h(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.fetchSignInMethodsForEmail((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<List<String>>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.15
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(List<String> list) {
                        arrayList.add(0, list);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void i(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.sendPasswordResetEmail((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (PigeonActionCodeSettings) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.16
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void j(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.sendSignInLinkToEmail((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (PigeonActionCodeSettings) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.17
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void k(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.setLanguageCode((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.18
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void l(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.setSettings((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonFirebaseAuthSettings) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.19
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void m(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.verifyPasswordResetCode((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.20
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void n(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                Long valueOf;
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                AuthPigeonFirebaseApp authPigeonFirebaseApp = (AuthPigeonFirebaseApp) arrayList2.get(0);
                String str = (String) arrayList2.get(1);
                Number number = (Number) arrayList2.get(2);
                VoidResult voidResult = new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.3
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                };
                if (number == null) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(number.longValue());
                }
                firebaseAuthHostApi.useEmulator(authPigeonFirebaseApp, str, valueOf, voidResult);
            }

            public static /* synthetic */ void o(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.verifyPhoneNumber((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonVerifyPhoneNumberRequest) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.21
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void p(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.revokeTokenWithAuthorizationCode((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.22
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void q(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseAuthHostApi.initializeRecaptchaConfig((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.23
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void r(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.applyActionCode((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.4
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void s(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.checkActionCode((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<PigeonActionCodeInfo>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.5
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonActionCodeInfo pigeonActionCodeInfo) {
                        arrayList.add(0, pigeonActionCodeInfo);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void t(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.confirmPasswordReset((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.6
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void u(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.createUserWithEmailAndPassword((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.7
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void v(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseAuthHostApi.signInAnonymously((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.8
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void w(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.signInWithCredential((AuthPigeonFirebaseApp) arrayList2.get(0), (Map) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.9
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void x(FirebaseAuthHostApi firebaseAuthHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthHostApi.signInWithCustomToken((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.10
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void y(BinaryMessenger binaryMessenger, FirebaseAuthHostApi firebaseAuthHostApi) {
                z(binaryMessenger, "", firebaseAuthHostApi);
            }

            public static void z(BinaryMessenger binaryMessenger, String str, final FirebaseAuthHostApi firebaseAuthHostApi) {
                String concat;
                if (str.isEmpty()) {
                    concat = "";
                } else {
                    concat = ".".concat(str);
                }
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.registerIdTokenListener", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.registerAuthStateListener", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.useEmulator", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel3.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.applyActionCode", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel4.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.checkActionCode", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel5.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.confirmPasswordReset", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel6.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.createUserWithEmailAndPassword", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel7.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInAnonymously", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel8.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithCredential", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel9.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithCustomToken", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel10.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithEmailAndPassword", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel11.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithEmailLink", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel12.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signInWithProvider", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel13.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.signOut", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel14.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel15 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.fetchSignInMethodsForEmail", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel15.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel15.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel16 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.sendPasswordResetEmail", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel16.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel16.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel17 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.sendSignInLinkToEmail", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel17.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel17.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel18 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.setLanguageCode", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel18.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel18.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel19 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.setSettings", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel19.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel19.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel20 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.verifyPasswordResetCode", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel20.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel20.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel21 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.verifyPhoneNumber", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel21.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel21.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel22 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.revokeTokenWithAuthorizationCode", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel22.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel22.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel23 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthHostApi.initializeRecaptchaConfig", concat), a());
                if (firebaseAuthHostApi != null) {
                    basicMessageChannel23.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: yA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.b(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.m(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.c(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.o(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.p(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.q(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.n(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.r(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.s(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.t(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.u(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.d(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.v(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 13:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.w(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 14:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.x(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 15:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.e(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 16:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.f(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 17:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.g(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 18:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.h(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 19:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.i(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 20:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.j(firebaseAuthHostApi, obj, reply);
                                    return;
                                case 21:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.k(firebaseAuthHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthHostApi.CC.l(firebaseAuthHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel23.setMessageHandler(null);
                }
            }
        }

        void applyActionCode(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull VoidResult voidResult);

        void checkActionCode(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull Result<PigeonActionCodeInfo> result);

        void confirmPasswordReset(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull String str2, @NonNull VoidResult voidResult);

        void createUserWithEmailAndPassword(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull String str2, @NonNull Result<PigeonUserCredential> result);

        void fetchSignInMethodsForEmail(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull Result<List<String>> result);

        void initializeRecaptchaConfig(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull VoidResult voidResult);

        void registerAuthStateListener(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Result<String> result);

        void registerIdTokenListener(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Result<String> result);

        void revokeTokenWithAuthorizationCode(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull VoidResult voidResult);

        void sendPasswordResetEmail(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, PigeonActionCodeSettings pigeonActionCodeSettings, @NonNull VoidResult voidResult);

        void sendSignInLinkToEmail(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull PigeonActionCodeSettings pigeonActionCodeSettings, @NonNull VoidResult voidResult);

        void setLanguageCode(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, String str, @NonNull Result<String> result);

        void setSettings(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull PigeonFirebaseAuthSettings pigeonFirebaseAuthSettings, @NonNull VoidResult voidResult);

        void signInAnonymously(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Result<PigeonUserCredential> result);

        void signInWithCredential(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Map<String, Object> map, @NonNull Result<PigeonUserCredential> result);

        void signInWithCustomToken(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull Result<PigeonUserCredential> result);

        void signInWithEmailAndPassword(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull String str2, @NonNull Result<PigeonUserCredential> result);

        void signInWithEmailLink(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull String str2, @NonNull Result<PigeonUserCredential> result);

        void signInWithProvider(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull PigeonSignInProvider pigeonSignInProvider, @NonNull Result<PigeonUserCredential> result);

        void signOut(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull VoidResult voidResult);

        void useEmulator(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull Long l, @NonNull VoidResult voidResult);

        void verifyPasswordResetCode(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull Result<String> result);

        void verifyPhoneNumber(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull PigeonVerifyPhoneNumberRequest pigeonVerifyPhoneNumberRequest, @NonNull Result<String> result);
    }

    /* loaded from: classes2.dex */
    public static class FirebaseAuthHostApiCodec extends StandardMessageCodec {
        public static final FirebaseAuthHostApiCodec INSTANCE = new FirebaseAuthHostApiCodec();

        private FirebaseAuthHostApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return AuthPigeonFirebaseApp.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return PigeonActionCodeInfo.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return PigeonActionCodeInfoData.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return PigeonActionCodeSettings.fromList((ArrayList) readValue(byteBuffer));
                case -124:
                    return PigeonAdditionalUserInfo.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return PigeonAuthCredential.fromList((ArrayList) readValue(byteBuffer));
                case -122:
                    return PigeonFirebaseAuthSettings.fromList((ArrayList) readValue(byteBuffer));
                case -121:
                    return PigeonIdTokenResult.fromList((ArrayList) readValue(byteBuffer));
                case -120:
                    return PigeonMultiFactorInfo.fromList((ArrayList) readValue(byteBuffer));
                case -119:
                    return PigeonMultiFactorSession.fromList((ArrayList) readValue(byteBuffer));
                case -118:
                    return PigeonPhoneMultiFactorAssertion.fromList((ArrayList) readValue(byteBuffer));
                case -117:
                    return PigeonSignInProvider.fromList((ArrayList) readValue(byteBuffer));
                case -116:
                    return PigeonTotpSecret.fromList((ArrayList) readValue(byteBuffer));
                case -115:
                    return PigeonUserCredential.fromList((ArrayList) readValue(byteBuffer));
                case -114:
                    return PigeonUserDetails.fromList((ArrayList) readValue(byteBuffer));
                case -113:
                    return PigeonUserInfo.fromList((ArrayList) readValue(byteBuffer));
                case -112:
                    return PigeonUserProfile.fromList((ArrayList) readValue(byteBuffer));
                case -111:
                    return PigeonVerifyPhoneNumberRequest.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof AuthPigeonFirebaseApp) {
                byteArrayOutputStream.write(UserVerificationMethods.USER_VERIFY_PATTERN);
                writeValue(byteArrayOutputStream, ((AuthPigeonFirebaseApp) obj).toList());
            } else if (obj instanceof PigeonActionCodeInfo) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((PigeonActionCodeInfo) obj).toList());
            } else if (obj instanceof PigeonActionCodeInfoData) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((PigeonActionCodeInfoData) obj).toList());
            } else if (obj instanceof PigeonActionCodeSettings) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((PigeonActionCodeSettings) obj).toList());
            } else if (obj instanceof PigeonAdditionalUserInfo) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((PigeonAdditionalUserInfo) obj).toList());
            } else if (obj instanceof PigeonAuthCredential) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((PigeonAuthCredential) obj).toList());
            } else if (obj instanceof PigeonFirebaseAuthSettings) {
                byteArrayOutputStream.write(134);
                writeValue(byteArrayOutputStream, ((PigeonFirebaseAuthSettings) obj).toList());
            } else if (obj instanceof PigeonIdTokenResult) {
                byteArrayOutputStream.write(135);
                writeValue(byteArrayOutputStream, ((PigeonIdTokenResult) obj).toList());
            } else if (obj instanceof PigeonMultiFactorInfo) {
                byteArrayOutputStream.write(136);
                writeValue(byteArrayOutputStream, ((PigeonMultiFactorInfo) obj).toList());
            } else if (obj instanceof PigeonMultiFactorSession) {
                byteArrayOutputStream.write(137);
                writeValue(byteArrayOutputStream, ((PigeonMultiFactorSession) obj).toList());
            } else if (obj instanceof PigeonPhoneMultiFactorAssertion) {
                byteArrayOutputStream.write(138);
                writeValue(byteArrayOutputStream, ((PigeonPhoneMultiFactorAssertion) obj).toList());
            } else if (obj instanceof PigeonSignInProvider) {
                byteArrayOutputStream.write(139);
                writeValue(byteArrayOutputStream, ((PigeonSignInProvider) obj).toList());
            } else if (obj instanceof PigeonTotpSecret) {
                byteArrayOutputStream.write(140);
                writeValue(byteArrayOutputStream, ((PigeonTotpSecret) obj).toList());
            } else if (obj instanceof PigeonUserCredential) {
                byteArrayOutputStream.write(141);
                writeValue(byteArrayOutputStream, ((PigeonUserCredential) obj).toList());
            } else if (obj instanceof PigeonUserDetails) {
                byteArrayOutputStream.write(142);
                writeValue(byteArrayOutputStream, ((PigeonUserDetails) obj).toList());
            } else if (obj instanceof PigeonUserInfo) {
                byteArrayOutputStream.write(143);
                writeValue(byteArrayOutputStream, ((PigeonUserInfo) obj).toList());
            } else if (obj instanceof PigeonUserProfile) {
                byteArrayOutputStream.write(144);
                writeValue(byteArrayOutputStream, ((PigeonUserProfile) obj).toList());
            } else if (obj instanceof PigeonVerifyPhoneNumberRequest) {
                byteArrayOutputStream.write(145);
                writeValue(byteArrayOutputStream, ((PigeonVerifyPhoneNumberRequest) obj).toList());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface FirebaseAuthUserHostApi {

        /* renamed from: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$FirebaseAuthUserHostApi$-CC */
        /* loaded from: classes2.dex */
        public abstract /* synthetic */ class CC {
            public static MessageCodec a() {
                return FirebaseAuthUserHostApiCodec.INSTANCE;
            }

            public static /* synthetic */ void b(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseAuthUserHostApi.delete((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.1
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void c(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.getIdToken((AuthPigeonFirebaseApp) arrayList2.get(0), (Boolean) arrayList2.get(1), new Result<PigeonIdTokenResult>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.2
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonIdTokenResult pigeonIdTokenResult) {
                        arrayList.add(0, pigeonIdTokenResult);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.updatePassword((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<PigeonUserDetails>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.11
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserDetails pigeonUserDetails) {
                        arrayList.add(0, pigeonUserDetails);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void e(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.updatePhoneNumber((AuthPigeonFirebaseApp) arrayList2.get(0), (Map) arrayList2.get(1), new Result<PigeonUserDetails>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.12
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserDetails pigeonUserDetails) {
                        arrayList.add(0, pigeonUserDetails);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void f(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.updateProfile((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonUserProfile) arrayList2.get(1), new Result<PigeonUserDetails>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.13
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserDetails pigeonUserDetails) {
                        arrayList.add(0, pigeonUserDetails);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void g(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.verifyBeforeUpdateEmail((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (PigeonActionCodeSettings) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.14
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void h(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.linkWithCredential((AuthPigeonFirebaseApp) arrayList2.get(0), (Map) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.3
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void i(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.linkWithProvider((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonSignInProvider) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.4
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void j(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.reauthenticateWithCredential((AuthPigeonFirebaseApp) arrayList2.get(0), (Map) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.5
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void k(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.reauthenticateWithProvider((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonSignInProvider) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.6
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void l(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                firebaseAuthUserHostApi.reload((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<PigeonUserDetails>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.7
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserDetails pigeonUserDetails) {
                        arrayList.add(0, pigeonUserDetails);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void m(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.sendEmailVerification((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonActionCodeSettings) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.8
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void n(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.unlink((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.9
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void o(FirebaseAuthUserHostApi firebaseAuthUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                firebaseAuthUserHostApi.updateEmail((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new Result<PigeonUserDetails>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.10
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserDetails pigeonUserDetails) {
                        arrayList.add(0, pigeonUserDetails);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void p(BinaryMessenger binaryMessenger, FirebaseAuthUserHostApi firebaseAuthUserHostApi) {
                q(binaryMessenger, "", firebaseAuthUserHostApi);
            }

            public static void q(BinaryMessenger binaryMessenger, String str, final FirebaseAuthUserHostApi firebaseAuthUserHostApi) {
                String concat;
                if (str.isEmpty()) {
                    concat = "";
                } else {
                    concat = ".".concat(str);
                }
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.delete", concat), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: zA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.l(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.m(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.e(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.f(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.h(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.i(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.getIdToken", concat), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: zA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.l(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.m(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.e(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.f(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.h(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.i(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.linkWithCredential", concat), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: zA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.l(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.m(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.e(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.f(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.h(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.i(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel3.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.linkWithProvider", concat), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: zA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.l(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.m(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.e(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.f(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.h(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.i(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel4.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reauthenticateWithCredential", concat), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: zA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.l(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.m(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.e(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.f(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.h(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.i(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel5.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel6 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reauthenticateWithProvider", concat), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel6.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: zA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.l(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.m(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.e(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.f(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.h(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.i(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel6.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel7 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.reload", concat), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel7.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: zA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.l(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.m(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.e(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.f(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.h(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.i(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel7.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel8 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.sendEmailVerification", concat), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel8.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: zA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.l(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.m(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.e(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.f(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.h(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.i(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel8.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel9 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.unlink", concat), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel9.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: zA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.l(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.m(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.e(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.f(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.h(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.i(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel9.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel10 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updateEmail", concat), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel10.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: zA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.l(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.m(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.e(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.f(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.h(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.i(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel10.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel11 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updatePassword", concat), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel11.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: zA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.l(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.m(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.e(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.f(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.h(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.i(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel11.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel12 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updatePhoneNumber", concat), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel12.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: zA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.l(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.m(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.e(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.f(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.h(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.i(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel12.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel13 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.updateProfile", concat), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel13.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: zA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.l(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.m(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.e(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.f(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.h(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.i(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel13.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel14 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.FirebaseAuthUserHostApi.verifyBeforeUpdateEmail", concat), a());
                if (firebaseAuthUserHostApi != null) {
                    basicMessageChannel14.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: zA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.b(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.l(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.m(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.n(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 4:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.o(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 5:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.d(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 6:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.e(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 7:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.f(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 8:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.g(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 9:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.c(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 10:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.h(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 11:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.i(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                case 12:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.j(firebaseAuthUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.FirebaseAuthUserHostApi.CC.k(firebaseAuthUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel14.setMessageHandler(null);
                }
            }
        }

        void delete(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull VoidResult voidResult);

        void getIdToken(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Boolean bool, @NonNull Result<PigeonIdTokenResult> result);

        void linkWithCredential(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Map<String, Object> map, @NonNull Result<PigeonUserCredential> result);

        void linkWithProvider(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull PigeonSignInProvider pigeonSignInProvider, @NonNull Result<PigeonUserCredential> result);

        void reauthenticateWithCredential(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Map<String, Object> map, @NonNull Result<PigeonUserCredential> result);

        void reauthenticateWithProvider(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull PigeonSignInProvider pigeonSignInProvider, @NonNull Result<PigeonUserCredential> result);

        void reload(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Result<PigeonUserDetails> result);

        void sendEmailVerification(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, PigeonActionCodeSettings pigeonActionCodeSettings, @NonNull VoidResult voidResult);

        void unlink(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull Result<PigeonUserCredential> result);

        void updateEmail(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull Result<PigeonUserDetails> result);

        void updatePassword(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull Result<PigeonUserDetails> result);

        void updatePhoneNumber(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Map<String, Object> map, @NonNull Result<PigeonUserDetails> result);

        void updateProfile(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull PigeonUserProfile pigeonUserProfile, @NonNull Result<PigeonUserDetails> result);

        void verifyBeforeUpdateEmail(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, PigeonActionCodeSettings pigeonActionCodeSettings, @NonNull VoidResult voidResult);
    }

    /* loaded from: classes2.dex */
    public static class FirebaseAuthUserHostApiCodec extends StandardMessageCodec {
        public static final FirebaseAuthUserHostApiCodec INSTANCE = new FirebaseAuthUserHostApiCodec();

        private FirebaseAuthUserHostApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return AuthPigeonFirebaseApp.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return PigeonActionCodeInfo.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return PigeonActionCodeInfoData.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return PigeonActionCodeSettings.fromList((ArrayList) readValue(byteBuffer));
                case -124:
                    return PigeonAdditionalUserInfo.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return PigeonAuthCredential.fromList((ArrayList) readValue(byteBuffer));
                case -122:
                    return PigeonFirebaseAuthSettings.fromList((ArrayList) readValue(byteBuffer));
                case -121:
                    return PigeonIdTokenResult.fromList((ArrayList) readValue(byteBuffer));
                case -120:
                    return PigeonMultiFactorInfo.fromList((ArrayList) readValue(byteBuffer));
                case -119:
                    return PigeonMultiFactorSession.fromList((ArrayList) readValue(byteBuffer));
                case -118:
                    return PigeonPhoneMultiFactorAssertion.fromList((ArrayList) readValue(byteBuffer));
                case -117:
                    return PigeonSignInProvider.fromList((ArrayList) readValue(byteBuffer));
                case -116:
                    return PigeonTotpSecret.fromList((ArrayList) readValue(byteBuffer));
                case -115:
                    return PigeonUserCredential.fromList((ArrayList) readValue(byteBuffer));
                case -114:
                    return PigeonUserDetails.fromList((ArrayList) readValue(byteBuffer));
                case -113:
                    return PigeonUserInfo.fromList((ArrayList) readValue(byteBuffer));
                case -112:
                    return PigeonUserProfile.fromList((ArrayList) readValue(byteBuffer));
                case -111:
                    return PigeonVerifyPhoneNumberRequest.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof AuthPigeonFirebaseApp) {
                byteArrayOutputStream.write(UserVerificationMethods.USER_VERIFY_PATTERN);
                writeValue(byteArrayOutputStream, ((AuthPigeonFirebaseApp) obj).toList());
            } else if (obj instanceof PigeonActionCodeInfo) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((PigeonActionCodeInfo) obj).toList());
            } else if (obj instanceof PigeonActionCodeInfoData) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((PigeonActionCodeInfoData) obj).toList());
            } else if (obj instanceof PigeonActionCodeSettings) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((PigeonActionCodeSettings) obj).toList());
            } else if (obj instanceof PigeonAdditionalUserInfo) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((PigeonAdditionalUserInfo) obj).toList());
            } else if (obj instanceof PigeonAuthCredential) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((PigeonAuthCredential) obj).toList());
            } else if (obj instanceof PigeonFirebaseAuthSettings) {
                byteArrayOutputStream.write(134);
                writeValue(byteArrayOutputStream, ((PigeonFirebaseAuthSettings) obj).toList());
            } else if (obj instanceof PigeonIdTokenResult) {
                byteArrayOutputStream.write(135);
                writeValue(byteArrayOutputStream, ((PigeonIdTokenResult) obj).toList());
            } else if (obj instanceof PigeonMultiFactorInfo) {
                byteArrayOutputStream.write(136);
                writeValue(byteArrayOutputStream, ((PigeonMultiFactorInfo) obj).toList());
            } else if (obj instanceof PigeonMultiFactorSession) {
                byteArrayOutputStream.write(137);
                writeValue(byteArrayOutputStream, ((PigeonMultiFactorSession) obj).toList());
            } else if (obj instanceof PigeonPhoneMultiFactorAssertion) {
                byteArrayOutputStream.write(138);
                writeValue(byteArrayOutputStream, ((PigeonPhoneMultiFactorAssertion) obj).toList());
            } else if (obj instanceof PigeonSignInProvider) {
                byteArrayOutputStream.write(139);
                writeValue(byteArrayOutputStream, ((PigeonSignInProvider) obj).toList());
            } else if (obj instanceof PigeonTotpSecret) {
                byteArrayOutputStream.write(140);
                writeValue(byteArrayOutputStream, ((PigeonTotpSecret) obj).toList());
            } else if (obj instanceof PigeonUserCredential) {
                byteArrayOutputStream.write(141);
                writeValue(byteArrayOutputStream, ((PigeonUserCredential) obj).toList());
            } else if (obj instanceof PigeonUserDetails) {
                byteArrayOutputStream.write(142);
                writeValue(byteArrayOutputStream, ((PigeonUserDetails) obj).toList());
            } else if (obj instanceof PigeonUserInfo) {
                byteArrayOutputStream.write(143);
                writeValue(byteArrayOutputStream, ((PigeonUserInfo) obj).toList());
            } else if (obj instanceof PigeonUserProfile) {
                byteArrayOutputStream.write(144);
                writeValue(byteArrayOutputStream, ((PigeonUserProfile) obj).toList());
            } else if (obj instanceof PigeonVerifyPhoneNumberRequest) {
                byteArrayOutputStream.write(145);
                writeValue(byteArrayOutputStream, ((PigeonVerifyPhoneNumberRequest) obj).toList());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
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
    public interface GenerateInterfaces {
        void pigeonInterface(@NonNull PigeonMultiFactorInfo pigeonMultiFactorInfo);
    }

    /* loaded from: classes2.dex */
    public static class GenerateInterfacesCodec extends StandardMessageCodec {
        public static final GenerateInterfacesCodec INSTANCE = new GenerateInterfacesCodec();

        private GenerateInterfacesCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
            if (b != Byte.MIN_VALUE) {
                return super.readValueOfType(b, byteBuffer);
            }
            return PigeonMultiFactorInfo.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof PigeonMultiFactorInfo) {
                byteArrayOutputStream.write(UserVerificationMethods.USER_VERIFY_PATTERN);
                writeValue(byteArrayOutputStream, ((PigeonMultiFactorInfo) obj).toList());
                return;
            }
            super.writeValue(byteArrayOutputStream, obj);
        }
    }

    /* loaded from: classes2.dex */
    public interface MultiFactoResolverHostApi {

        /* renamed from: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$MultiFactoResolverHostApi$-CC */
        /* loaded from: classes2.dex */
        public abstract /* synthetic */ class CC {
            public static MessageCodec a() {
                return MultiFactoResolverHostApiCodec.INSTANCE;
            }

            public static /* synthetic */ void b(MultiFactoResolverHostApi multiFactoResolverHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                multiFactoResolverHostApi.resolveSignIn((String) arrayList2.get(0), (PigeonPhoneMultiFactorAssertion) arrayList2.get(1), (String) arrayList2.get(2), new Result<PigeonUserCredential>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi.1
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonUserCredential pigeonUserCredential) {
                        arrayList.add(0, pigeonUserCredential);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void c(BinaryMessenger binaryMessenger, MultiFactoResolverHostApi multiFactoResolverHostApi) {
                d(binaryMessenger, "", multiFactoResolverHostApi);
            }

            public static void d(BinaryMessenger binaryMessenger, String str, MultiFactoResolverHostApi multiFactoResolverHostApi) {
                String concat;
                if (str.isEmpty()) {
                    concat = "";
                } else {
                    concat = ".".concat(str);
                }
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactoResolverHostApi.resolveSignIn", concat), a());
                if (multiFactoResolverHostApi != null) {
                    basicMessageChannel.setMessageHandler(new C3318zx(multiFactoResolverHostApi, 3));
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
            }
        }

        void resolveSignIn(@NonNull String str, PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion, String str2, @NonNull Result<PigeonUserCredential> result);
    }

    /* loaded from: classes2.dex */
    public static class MultiFactoResolverHostApiCodec extends StandardMessageCodec {
        public static final MultiFactoResolverHostApiCodec INSTANCE = new MultiFactoResolverHostApiCodec();

        private MultiFactoResolverHostApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return PigeonAdditionalUserInfo.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return PigeonAuthCredential.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return PigeonPhoneMultiFactorAssertion.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return PigeonUserCredential.fromList((ArrayList) readValue(byteBuffer));
                case -124:
                    return PigeonUserDetails.fromList((ArrayList) readValue(byteBuffer));
                case -123:
                    return PigeonUserInfo.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof PigeonAdditionalUserInfo) {
                byteArrayOutputStream.write(UserVerificationMethods.USER_VERIFY_PATTERN);
                writeValue(byteArrayOutputStream, ((PigeonAdditionalUserInfo) obj).toList());
            } else if (obj instanceof PigeonAuthCredential) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((PigeonAuthCredential) obj).toList());
            } else if (obj instanceof PigeonPhoneMultiFactorAssertion) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((PigeonPhoneMultiFactorAssertion) obj).toList());
            } else if (obj instanceof PigeonUserCredential) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((PigeonUserCredential) obj).toList());
            } else if (obj instanceof PigeonUserDetails) {
                byteArrayOutputStream.write(132);
                writeValue(byteArrayOutputStream, ((PigeonUserDetails) obj).toList());
            } else if (obj instanceof PigeonUserInfo) {
                byteArrayOutputStream.write(133);
                writeValue(byteArrayOutputStream, ((PigeonUserInfo) obj).toList());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface MultiFactorTotpHostApi {

        /* renamed from: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$MultiFactorTotpHostApi$-CC */
        /* loaded from: classes2.dex */
        public abstract /* synthetic */ class CC {
            public static MessageCodec a() {
                return MultiFactorTotpHostApiCodec.INSTANCE;
            }

            public static /* synthetic */ void b(MultiFactorTotpHostApi multiFactorTotpHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                multiFactorTotpHostApi.generateSecret((String) ((ArrayList) obj).get(0), new Result<PigeonTotpSecret>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.1
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonTotpSecret pigeonTotpSecret) {
                        arrayList.add(0, pigeonTotpSecret);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void c(MultiFactorTotpHostApi multiFactorTotpHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                multiFactorTotpHostApi.getAssertionForEnrollment((String) arrayList2.get(0), (String) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.2
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(MultiFactorTotpHostApi multiFactorTotpHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                multiFactorTotpHostApi.getAssertionForSignIn((String) arrayList2.get(0), (String) arrayList2.get(1), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.3
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void e(BinaryMessenger binaryMessenger, MultiFactorTotpHostApi multiFactorTotpHostApi) {
                f(binaryMessenger, "", multiFactorTotpHostApi);
            }

            public static void f(BinaryMessenger binaryMessenger, String str, final MultiFactorTotpHostApi multiFactorTotpHostApi) {
                String concat;
                if (str.isEmpty()) {
                    concat = "";
                } else {
                    concat = ".".concat(str);
                }
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.generateSecret", concat), a());
                if (multiFactorTotpHostApi != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: AA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.CC.b(multiFactorTotpHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.CC.c(multiFactorTotpHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.CC.d(multiFactorTotpHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForEnrollment", concat), a());
                if (multiFactorTotpHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: AA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.CC.b(multiFactorTotpHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.CC.c(multiFactorTotpHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.CC.d(multiFactorTotpHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpHostApi.getAssertionForSignIn", concat), a());
                if (multiFactorTotpHostApi != null) {
                    basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: AA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.CC.b(multiFactorTotpHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.CC.c(multiFactorTotpHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.MultiFactorTotpHostApi.CC.d(multiFactorTotpHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel3.setMessageHandler(null);
                }
            }
        }

        void generateSecret(@NonNull String str, @NonNull Result<PigeonTotpSecret> result);

        void getAssertionForEnrollment(@NonNull String str, @NonNull String str2, @NonNull Result<String> result);

        void getAssertionForSignIn(@NonNull String str, @NonNull String str2, @NonNull Result<String> result);
    }

    /* loaded from: classes2.dex */
    public static class MultiFactorTotpHostApiCodec extends StandardMessageCodec {
        public static final MultiFactorTotpHostApiCodec INSTANCE = new MultiFactorTotpHostApiCodec();

        private MultiFactorTotpHostApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
            if (b != Byte.MIN_VALUE) {
                return super.readValueOfType(b, byteBuffer);
            }
            return PigeonTotpSecret.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof PigeonTotpSecret) {
                byteArrayOutputStream.write(UserVerificationMethods.USER_VERIFY_PATTERN);
                writeValue(byteArrayOutputStream, ((PigeonTotpSecret) obj).toList());
                return;
            }
            super.writeValue(byteArrayOutputStream, obj);
        }
    }

    /* loaded from: classes2.dex */
    public interface MultiFactorTotpSecretHostApi {

        /* renamed from: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$MultiFactorTotpSecretHostApi$-CC */
        /* loaded from: classes2.dex */
        public abstract /* synthetic */ class CC {
            public static MessageCodec a() {
                return new StandardMessageCodec();
            }

            public static /* synthetic */ void b(MultiFactorTotpSecretHostApi multiFactorTotpSecretHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                multiFactorTotpSecretHostApi.generateQrCodeUrl((String) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new Result<String>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.1
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(String str) {
                        arrayList.add(0, str);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void c(MultiFactorTotpSecretHostApi multiFactorTotpSecretHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                multiFactorTotpSecretHostApi.openInOtpApp((String) arrayList2.get(0), (String) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.2
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void d(BinaryMessenger binaryMessenger, MultiFactorTotpSecretHostApi multiFactorTotpSecretHostApi) {
                e(binaryMessenger, "", multiFactorTotpSecretHostApi);
            }

            public static void e(BinaryMessenger binaryMessenger, String str, final MultiFactorTotpSecretHostApi multiFactorTotpSecretHostApi) {
                String concat;
                if (str.isEmpty()) {
                    concat = "";
                } else {
                    concat = ".".concat(str);
                }
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.generateQrCodeUrl", concat), a());
                if (multiFactorTotpSecretHostApi != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: BA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.CC.b(multiFactorTotpSecretHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.CC.c(multiFactorTotpSecretHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorTotpSecretHostApi.openInOtpApp", concat), a());
                if (multiFactorTotpSecretHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: BA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.CC.b(multiFactorTotpSecretHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.CC.c(multiFactorTotpSecretHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
            }
        }

        void generateQrCodeUrl(@NonNull String str, String str2, String str3, @NonNull Result<String> result);

        void openInOtpApp(@NonNull String str, @NonNull String str2, @NonNull VoidResult voidResult);
    }

    /* loaded from: classes2.dex */
    public interface MultiFactorUserHostApi {

        /* renamed from: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth$MultiFactorUserHostApi$-CC */
        /* loaded from: classes2.dex */
        public abstract /* synthetic */ class CC {
            public static MessageCodec a() {
                return MultiFactorUserHostApiCodec.INSTANCE;
            }

            public static /* synthetic */ void b(MultiFactorUserHostApi multiFactorUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                multiFactorUserHostApi.enrollPhone((AuthPigeonFirebaseApp) arrayList2.get(0), (PigeonPhoneMultiFactorAssertion) arrayList2.get(1), (String) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.1
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void c(MultiFactorUserHostApi multiFactorUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                multiFactorUserHostApi.enrollTotp((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), (String) arrayList2.get(2), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.2
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(MultiFactorUserHostApi multiFactorUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                multiFactorUserHostApi.getSession((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<PigeonMultiFactorSession>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.3
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(PigeonMultiFactorSession pigeonMultiFactorSession) {
                        arrayList.add(0, pigeonMultiFactorSession);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void e(MultiFactorUserHostApi multiFactorUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                multiFactorUserHostApi.unenroll((AuthPigeonFirebaseApp) arrayList2.get(0), (String) arrayList2.get(1), new VoidResult() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.4
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void f(MultiFactorUserHostApi multiFactorUserHostApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                multiFactorUserHostApi.getEnrolledFactors((AuthPigeonFirebaseApp) ((ArrayList) obj).get(0), new Result<List<PigeonMultiFactorInfo>>() { // from class: io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.5
                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void error(Throwable th) {
                        reply.reply(GeneratedAndroidFirebaseAuth.wrapError(th));
                    }

                    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.Result
                    public void success(List<PigeonMultiFactorInfo> list) {
                        arrayList.add(0, list);
                        reply.reply(arrayList);
                    }
                });
            }

            public static void g(BinaryMessenger binaryMessenger, MultiFactorUserHostApi multiFactorUserHostApi) {
                h(binaryMessenger, "", multiFactorUserHostApi);
            }

            public static void h(BinaryMessenger binaryMessenger, String str, final MultiFactorUserHostApi multiFactorUserHostApi) {
                String concat;
                if (str.isEmpty()) {
                    concat = "";
                } else {
                    concat = ".".concat(str);
                }
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollPhone", concat), a());
                if (multiFactorUserHostApi != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: CA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.b(multiFactorUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.c(multiFactorUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.d(multiFactorUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.e(multiFactorUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.f(multiFactorUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.enrollTotp", concat), a());
                if (multiFactorUserHostApi != null) {
                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: CA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.b(multiFactorUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.c(multiFactorUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.d(multiFactorUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.e(multiFactorUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.f(multiFactorUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getSession", concat), a());
                if (multiFactorUserHostApi != null) {
                    basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: CA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.b(multiFactorUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.c(multiFactorUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.d(multiFactorUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.e(multiFactorUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.f(multiFactorUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel3.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel4 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.unenroll", concat), a());
                if (multiFactorUserHostApi != null) {
                    basicMessageChannel4.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: CA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.b(multiFactorUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.c(multiFactorUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.d(multiFactorUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.e(multiFactorUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.f(multiFactorUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel4.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel5 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.firebase_auth_platform_interface.MultiFactorUserHostApi.getEnrolledFactors", concat), a());
                if (multiFactorUserHostApi != null) {
                    basicMessageChannel5.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: CA
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.b(multiFactorUserHostApi, obj, reply);
                                    return;
                                case 1:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.c(multiFactorUserHostApi, obj, reply);
                                    return;
                                case 2:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.d(multiFactorUserHostApi, obj, reply);
                                    return;
                                case 3:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.e(multiFactorUserHostApi, obj, reply);
                                    return;
                                default:
                                    GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.f(multiFactorUserHostApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel5.setMessageHandler(null);
                }
            }
        }

        void enrollPhone(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion, String str, @NonNull VoidResult voidResult);

        void enrollTotp(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, String str2, @NonNull VoidResult voidResult);

        void getEnrolledFactors(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Result<List<PigeonMultiFactorInfo>> result);

        void getSession(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull Result<PigeonMultiFactorSession> result);

        void unenroll(@NonNull AuthPigeonFirebaseApp authPigeonFirebaseApp, @NonNull String str, @NonNull VoidResult voidResult);
    }

    /* loaded from: classes2.dex */
    public static class MultiFactorUserHostApiCodec extends StandardMessageCodec {
        public static final MultiFactorUserHostApiCodec INSTANCE = new MultiFactorUserHostApiCodec();

        private MultiFactorUserHostApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public Object readValueOfType(byte b, @NonNull ByteBuffer byteBuffer) {
            switch (b) {
                case Byte.MIN_VALUE:
                    return AuthPigeonFirebaseApp.fromList((ArrayList) readValue(byteBuffer));
                case -127:
                    return PigeonMultiFactorInfo.fromList((ArrayList) readValue(byteBuffer));
                case -126:
                    return PigeonMultiFactorSession.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return PigeonPhoneMultiFactorAssertion.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof AuthPigeonFirebaseApp) {
                byteArrayOutputStream.write(UserVerificationMethods.USER_VERIFY_PATTERN);
                writeValue(byteArrayOutputStream, ((AuthPigeonFirebaseApp) obj).toList());
            } else if (obj instanceof PigeonMultiFactorInfo) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((PigeonMultiFactorInfo) obj).toList());
            } else if (obj instanceof PigeonMultiFactorSession) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((PigeonMultiFactorSession) obj).toList());
            } else if (obj instanceof PigeonPhoneMultiFactorAssertion) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((PigeonPhoneMultiFactorAssertion) obj).toList());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface NullableResult<T> {
        void error(@NonNull Throwable th);

        void success(T t);
    }

    /* loaded from: classes2.dex */
    public static final class PigeonActionCodeInfo {
        @NonNull
        private PigeonActionCodeInfoData data;
        @NonNull
        private ActionCodeInfoOperation operation;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private PigeonActionCodeInfoData data;
            private ActionCodeInfoOperation operation;

            @NonNull
            public PigeonActionCodeInfo build() {
                PigeonActionCodeInfo pigeonActionCodeInfo = new PigeonActionCodeInfo();
                pigeonActionCodeInfo.setOperation(this.operation);
                pigeonActionCodeInfo.setData(this.data);
                return pigeonActionCodeInfo;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setData(@NonNull PigeonActionCodeInfoData pigeonActionCodeInfoData) {
                this.data = pigeonActionCodeInfoData;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setOperation(@NonNull ActionCodeInfoOperation actionCodeInfoOperation) {
                this.operation = actionCodeInfoOperation;
                return this;
            }
        }

        @NonNull
        public static PigeonActionCodeInfo fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonActionCodeInfo pigeonActionCodeInfo = new PigeonActionCodeInfo();
            pigeonActionCodeInfo.setOperation(ActionCodeInfoOperation.values()[((Integer) arrayList.get(0)).intValue()]);
            pigeonActionCodeInfo.setData((PigeonActionCodeInfoData) arrayList.get(1));
            return pigeonActionCodeInfo;
        }

        @NonNull
        public PigeonActionCodeInfoData getData() {
            return this.data;
        }

        @NonNull
        public ActionCodeInfoOperation getOperation() {
            return this.operation;
        }

        public void setData(@NonNull PigeonActionCodeInfoData pigeonActionCodeInfoData) {
            if (pigeonActionCodeInfoData != null) {
                this.data = pigeonActionCodeInfoData;
                return;
            }
            throw new IllegalStateException("Nonnull field \"data\" is null.");
        }

        public void setOperation(@NonNull ActionCodeInfoOperation actionCodeInfoOperation) {
            if (actionCodeInfoOperation != null) {
                this.operation = actionCodeInfoOperation;
                return;
            }
            throw new IllegalStateException("Nonnull field \"operation\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            Integer valueOf;
            ArrayList<Object> arrayList = new ArrayList<>(2);
            ActionCodeInfoOperation actionCodeInfoOperation = this.operation;
            if (actionCodeInfoOperation == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(actionCodeInfoOperation.index);
            }
            arrayList.add(valueOf);
            arrayList.add(this.data);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonActionCodeInfoData {
        private String email;
        private String previousEmail;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String email;
            private String previousEmail;

            @NonNull
            public PigeonActionCodeInfoData build() {
                PigeonActionCodeInfoData pigeonActionCodeInfoData = new PigeonActionCodeInfoData();
                pigeonActionCodeInfoData.setEmail(this.email);
                pigeonActionCodeInfoData.setPreviousEmail(this.previousEmail);
                return pigeonActionCodeInfoData;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setEmail(String str) {
                this.email = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPreviousEmail(String str) {
                this.previousEmail = str;
                return this;
            }
        }

        @NonNull
        public static PigeonActionCodeInfoData fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonActionCodeInfoData pigeonActionCodeInfoData = new PigeonActionCodeInfoData();
            pigeonActionCodeInfoData.setEmail((String) arrayList.get(0));
            pigeonActionCodeInfoData.setPreviousEmail((String) arrayList.get(1));
            return pigeonActionCodeInfoData;
        }

        public String getEmail() {
            return this.email;
        }

        public String getPreviousEmail() {
            return this.previousEmail;
        }

        public void setEmail(String str) {
            this.email = str;
        }

        public void setPreviousEmail(String str) {
            this.previousEmail = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.email);
            arrayList.add(this.previousEmail);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonActionCodeSettings {
        @NonNull
        private Boolean androidInstallApp;
        private String androidMinimumVersion;
        private String androidPackageName;
        private String dynamicLinkDomain;
        @NonNull
        private Boolean handleCodeInApp;
        private String iOSBundleId;
        private String linkDomain;
        @NonNull
        private String url;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Boolean androidInstallApp;
            private String androidMinimumVersion;
            private String androidPackageName;
            private String dynamicLinkDomain;
            private Boolean handleCodeInApp;
            private String iOSBundleId;
            private String linkDomain;
            private String url;

            @NonNull
            public PigeonActionCodeSettings build() {
                PigeonActionCodeSettings pigeonActionCodeSettings = new PigeonActionCodeSettings();
                pigeonActionCodeSettings.setUrl(this.url);
                pigeonActionCodeSettings.setDynamicLinkDomain(this.dynamicLinkDomain);
                pigeonActionCodeSettings.setHandleCodeInApp(this.handleCodeInApp);
                pigeonActionCodeSettings.setIOSBundleId(this.iOSBundleId);
                pigeonActionCodeSettings.setAndroidPackageName(this.androidPackageName);
                pigeonActionCodeSettings.setAndroidInstallApp(this.androidInstallApp);
                pigeonActionCodeSettings.setAndroidMinimumVersion(this.androidMinimumVersion);
                pigeonActionCodeSettings.setLinkDomain(this.linkDomain);
                return pigeonActionCodeSettings;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAndroidInstallApp(@NonNull Boolean bool) {
                this.androidInstallApp = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAndroidMinimumVersion(String str) {
                this.androidMinimumVersion = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAndroidPackageName(String str) {
                this.androidPackageName = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setDynamicLinkDomain(String str) {
                this.dynamicLinkDomain = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setHandleCodeInApp(@NonNull Boolean bool) {
                this.handleCodeInApp = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setIOSBundleId(String str) {
                this.iOSBundleId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setLinkDomain(String str) {
                this.linkDomain = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUrl(@NonNull String str) {
                this.url = str;
                return this;
            }
        }

        @NonNull
        public static PigeonActionCodeSettings fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonActionCodeSettings pigeonActionCodeSettings = new PigeonActionCodeSettings();
            pigeonActionCodeSettings.setUrl((String) arrayList.get(0));
            pigeonActionCodeSettings.setDynamicLinkDomain((String) arrayList.get(1));
            pigeonActionCodeSettings.setHandleCodeInApp((Boolean) arrayList.get(2));
            pigeonActionCodeSettings.setIOSBundleId((String) arrayList.get(3));
            pigeonActionCodeSettings.setAndroidPackageName((String) arrayList.get(4));
            pigeonActionCodeSettings.setAndroidInstallApp((Boolean) arrayList.get(5));
            pigeonActionCodeSettings.setAndroidMinimumVersion((String) arrayList.get(6));
            pigeonActionCodeSettings.setLinkDomain((String) arrayList.get(7));
            return pigeonActionCodeSettings;
        }

        @NonNull
        public Boolean getAndroidInstallApp() {
            return this.androidInstallApp;
        }

        public String getAndroidMinimumVersion() {
            return this.androidMinimumVersion;
        }

        public String getAndroidPackageName() {
            return this.androidPackageName;
        }

        public String getDynamicLinkDomain() {
            return this.dynamicLinkDomain;
        }

        @NonNull
        public Boolean getHandleCodeInApp() {
            return this.handleCodeInApp;
        }

        public String getIOSBundleId() {
            return this.iOSBundleId;
        }

        public String getLinkDomain() {
            return this.linkDomain;
        }

        @NonNull
        public String getUrl() {
            return this.url;
        }

        public void setAndroidInstallApp(@NonNull Boolean bool) {
            if (bool != null) {
                this.androidInstallApp = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"androidInstallApp\" is null.");
        }

        public void setAndroidMinimumVersion(String str) {
            this.androidMinimumVersion = str;
        }

        public void setAndroidPackageName(String str) {
            this.androidPackageName = str;
        }

        public void setDynamicLinkDomain(String str) {
            this.dynamicLinkDomain = str;
        }

        public void setHandleCodeInApp(@NonNull Boolean bool) {
            if (bool != null) {
                this.handleCodeInApp = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"handleCodeInApp\" is null.");
        }

        public void setIOSBundleId(String str) {
            this.iOSBundleId = str;
        }

        public void setLinkDomain(String str) {
            this.linkDomain = str;
        }

        public void setUrl(@NonNull String str) {
            if (str != null) {
                this.url = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"url\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(8);
            arrayList.add(this.url);
            arrayList.add(this.dynamicLinkDomain);
            arrayList.add(this.handleCodeInApp);
            arrayList.add(this.iOSBundleId);
            arrayList.add(this.androidPackageName);
            arrayList.add(this.androidInstallApp);
            arrayList.add(this.androidMinimumVersion);
            arrayList.add(this.linkDomain);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonAdditionalUserInfo {
        private String authorizationCode;
        @NonNull
        private Boolean isNewUser;
        private Map<String, Object> profile;
        private String providerId;
        private String username;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String authorizationCode;
            private Boolean isNewUser;
            private Map<String, Object> profile;
            private String providerId;
            private String username;

            @NonNull
            public PigeonAdditionalUserInfo build() {
                PigeonAdditionalUserInfo pigeonAdditionalUserInfo = new PigeonAdditionalUserInfo();
                pigeonAdditionalUserInfo.setIsNewUser(this.isNewUser);
                pigeonAdditionalUserInfo.setProviderId(this.providerId);
                pigeonAdditionalUserInfo.setUsername(this.username);
                pigeonAdditionalUserInfo.setAuthorizationCode(this.authorizationCode);
                pigeonAdditionalUserInfo.setProfile(this.profile);
                return pigeonAdditionalUserInfo;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAuthorizationCode(String str) {
                this.authorizationCode = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setIsNewUser(@NonNull Boolean bool) {
                this.isNewUser = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProfile(Map<String, Object> map) {
                this.profile = map;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProviderId(String str) {
                this.providerId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUsername(String str) {
                this.username = str;
                return this;
            }
        }

        @NonNull
        public static PigeonAdditionalUserInfo fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonAdditionalUserInfo pigeonAdditionalUserInfo = new PigeonAdditionalUserInfo();
            pigeonAdditionalUserInfo.setIsNewUser((Boolean) arrayList.get(0));
            pigeonAdditionalUserInfo.setProviderId((String) arrayList.get(1));
            pigeonAdditionalUserInfo.setUsername((String) arrayList.get(2));
            pigeonAdditionalUserInfo.setAuthorizationCode((String) arrayList.get(3));
            pigeonAdditionalUserInfo.setProfile((Map) arrayList.get(4));
            return pigeonAdditionalUserInfo;
        }

        public String getAuthorizationCode() {
            return this.authorizationCode;
        }

        @NonNull
        public Boolean getIsNewUser() {
            return this.isNewUser;
        }

        public Map<String, Object> getProfile() {
            return this.profile;
        }

        public String getProviderId() {
            return this.providerId;
        }

        public String getUsername() {
            return this.username;
        }

        public void setAuthorizationCode(String str) {
            this.authorizationCode = str;
        }

        public void setIsNewUser(@NonNull Boolean bool) {
            if (bool != null) {
                this.isNewUser = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isNewUser\" is null.");
        }

        public void setProfile(Map<String, Object> map) {
            this.profile = map;
        }

        public void setProviderId(String str) {
            this.providerId = str;
        }

        public void setUsername(String str) {
            this.username = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.isNewUser);
            arrayList.add(this.providerId);
            arrayList.add(this.username);
            arrayList.add(this.authorizationCode);
            arrayList.add(this.profile);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonAuthCredential {
        private String accessToken;
        @NonNull
        private Long nativeId;
        @NonNull
        private String providerId;
        @NonNull
        private String signInMethod;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String accessToken;
            private Long nativeId;
            private String providerId;
            private String signInMethod;

            @NonNull
            public PigeonAuthCredential build() {
                PigeonAuthCredential pigeonAuthCredential = new PigeonAuthCredential();
                pigeonAuthCredential.setProviderId(this.providerId);
                pigeonAuthCredential.setSignInMethod(this.signInMethod);
                pigeonAuthCredential.setNativeId(this.nativeId);
                pigeonAuthCredential.setAccessToken(this.accessToken);
                return pigeonAuthCredential;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAccessToken(String str) {
                this.accessToken = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setNativeId(@NonNull Long l) {
                this.nativeId = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProviderId(@NonNull String str) {
                this.providerId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSignInMethod(@NonNull String str) {
                this.signInMethod = str;
                return this;
            }
        }

        @NonNull
        public static PigeonAuthCredential fromList(@NonNull ArrayList<Object> arrayList) {
            long longValue;
            Long valueOf;
            PigeonAuthCredential pigeonAuthCredential = new PigeonAuthCredential();
            pigeonAuthCredential.setProviderId((String) arrayList.get(0));
            pigeonAuthCredential.setSignInMethod((String) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                valueOf = null;
            } else {
                if (obj instanceof Integer) {
                    longValue = ((Integer) obj).intValue();
                } else {
                    longValue = ((Long) obj).longValue();
                }
                valueOf = Long.valueOf(longValue);
            }
            pigeonAuthCredential.setNativeId(valueOf);
            pigeonAuthCredential.setAccessToken((String) arrayList.get(3));
            return pigeonAuthCredential;
        }

        public String getAccessToken() {
            return this.accessToken;
        }

        @NonNull
        public Long getNativeId() {
            return this.nativeId;
        }

        @NonNull
        public String getProviderId() {
            return this.providerId;
        }

        @NonNull
        public String getSignInMethod() {
            return this.signInMethod;
        }

        public void setAccessToken(String str) {
            this.accessToken = str;
        }

        public void setNativeId(@NonNull Long l) {
            if (l != null) {
                this.nativeId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"nativeId\" is null.");
        }

        public void setProviderId(@NonNull String str) {
            if (str != null) {
                this.providerId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"providerId\" is null.");
        }

        public void setSignInMethod(@NonNull String str) {
            if (str != null) {
                this.signInMethod = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.providerId);
            arrayList.add(this.signInMethod);
            arrayList.add(this.nativeId);
            arrayList.add(this.accessToken);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonFirebaseAuthSettings {
        @NonNull
        private Boolean appVerificationDisabledForTesting;
        private Boolean forceRecaptchaFlow;
        private String phoneNumber;
        private String smsCode;
        private String userAccessGroup;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Boolean appVerificationDisabledForTesting;
            private Boolean forceRecaptchaFlow;
            private String phoneNumber;
            private String smsCode;
            private String userAccessGroup;

            @NonNull
            public PigeonFirebaseAuthSettings build() {
                PigeonFirebaseAuthSettings pigeonFirebaseAuthSettings = new PigeonFirebaseAuthSettings();
                pigeonFirebaseAuthSettings.setAppVerificationDisabledForTesting(this.appVerificationDisabledForTesting);
                pigeonFirebaseAuthSettings.setUserAccessGroup(this.userAccessGroup);
                pigeonFirebaseAuthSettings.setPhoneNumber(this.phoneNumber);
                pigeonFirebaseAuthSettings.setSmsCode(this.smsCode);
                pigeonFirebaseAuthSettings.setForceRecaptchaFlow(this.forceRecaptchaFlow);
                return pigeonFirebaseAuthSettings;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAppVerificationDisabledForTesting(@NonNull Boolean bool) {
                this.appVerificationDisabledForTesting = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setForceRecaptchaFlow(Boolean bool) {
                this.forceRecaptchaFlow = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPhoneNumber(String str) {
                this.phoneNumber = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSmsCode(String str) {
                this.smsCode = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUserAccessGroup(String str) {
                this.userAccessGroup = str;
                return this;
            }
        }

        @NonNull
        public static PigeonFirebaseAuthSettings fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonFirebaseAuthSettings pigeonFirebaseAuthSettings = new PigeonFirebaseAuthSettings();
            pigeonFirebaseAuthSettings.setAppVerificationDisabledForTesting((Boolean) arrayList.get(0));
            pigeonFirebaseAuthSettings.setUserAccessGroup((String) arrayList.get(1));
            pigeonFirebaseAuthSettings.setPhoneNumber((String) arrayList.get(2));
            pigeonFirebaseAuthSettings.setSmsCode((String) arrayList.get(3));
            pigeonFirebaseAuthSettings.setForceRecaptchaFlow((Boolean) arrayList.get(4));
            return pigeonFirebaseAuthSettings;
        }

        @NonNull
        public Boolean getAppVerificationDisabledForTesting() {
            return this.appVerificationDisabledForTesting;
        }

        public Boolean getForceRecaptchaFlow() {
            return this.forceRecaptchaFlow;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public String getSmsCode() {
            return this.smsCode;
        }

        public String getUserAccessGroup() {
            return this.userAccessGroup;
        }

        public void setAppVerificationDisabledForTesting(@NonNull Boolean bool) {
            if (bool != null) {
                this.appVerificationDisabledForTesting = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"appVerificationDisabledForTesting\" is null.");
        }

        public void setForceRecaptchaFlow(Boolean bool) {
            this.forceRecaptchaFlow = bool;
        }

        public void setPhoneNumber(String str) {
            this.phoneNumber = str;
        }

        public void setSmsCode(String str) {
            this.smsCode = str;
        }

        public void setUserAccessGroup(String str) {
            this.userAccessGroup = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.appVerificationDisabledForTesting);
            arrayList.add(this.userAccessGroup);
            arrayList.add(this.phoneNumber);
            arrayList.add(this.smsCode);
            arrayList.add(this.forceRecaptchaFlow);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonIdTokenResult {
        private Long authTimestamp;
        private Map<String, Object> claims;
        private Long expirationTimestamp;
        private Long issuedAtTimestamp;
        private String signInProvider;
        private String signInSecondFactor;
        private String token;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Long authTimestamp;
            private Map<String, Object> claims;
            private Long expirationTimestamp;
            private Long issuedAtTimestamp;
            private String signInProvider;
            private String signInSecondFactor;
            private String token;

            @NonNull
            public PigeonIdTokenResult build() {
                PigeonIdTokenResult pigeonIdTokenResult = new PigeonIdTokenResult();
                pigeonIdTokenResult.setToken(this.token);
                pigeonIdTokenResult.setExpirationTimestamp(this.expirationTimestamp);
                pigeonIdTokenResult.setAuthTimestamp(this.authTimestamp);
                pigeonIdTokenResult.setIssuedAtTimestamp(this.issuedAtTimestamp);
                pigeonIdTokenResult.setSignInProvider(this.signInProvider);
                pigeonIdTokenResult.setClaims(this.claims);
                pigeonIdTokenResult.setSignInSecondFactor(this.signInSecondFactor);
                return pigeonIdTokenResult;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAuthTimestamp(Long l) {
                this.authTimestamp = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setClaims(Map<String, Object> map) {
                this.claims = map;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setExpirationTimestamp(Long l) {
                this.expirationTimestamp = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setIssuedAtTimestamp(Long l) {
                this.issuedAtTimestamp = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSignInProvider(String str) {
                this.signInProvider = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSignInSecondFactor(String str) {
                this.signInSecondFactor = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setToken(String str) {
                this.token = str;
                return this;
            }
        }

        @NonNull
        public static PigeonIdTokenResult fromList(@NonNull ArrayList<Object> arrayList) {
            long longValue;
            Long valueOf;
            long longValue2;
            Long valueOf2;
            long longValue3;
            PigeonIdTokenResult pigeonIdTokenResult = new PigeonIdTokenResult();
            pigeonIdTokenResult.setToken((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            Long l = null;
            if (obj == null) {
                valueOf = null;
            } else {
                if (obj instanceof Integer) {
                    longValue = ((Integer) obj).intValue();
                } else {
                    longValue = ((Long) obj).longValue();
                }
                valueOf = Long.valueOf(longValue);
            }
            pigeonIdTokenResult.setExpirationTimestamp(valueOf);
            Object obj2 = arrayList.get(2);
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                if (obj2 instanceof Integer) {
                    longValue2 = ((Integer) obj2).intValue();
                } else {
                    longValue2 = ((Long) obj2).longValue();
                }
                valueOf2 = Long.valueOf(longValue2);
            }
            pigeonIdTokenResult.setAuthTimestamp(valueOf2);
            Object obj3 = arrayList.get(3);
            if (obj3 != null) {
                if (obj3 instanceof Integer) {
                    longValue3 = ((Integer) obj3).intValue();
                } else {
                    longValue3 = ((Long) obj3).longValue();
                }
                l = Long.valueOf(longValue3);
            }
            pigeonIdTokenResult.setIssuedAtTimestamp(l);
            pigeonIdTokenResult.setSignInProvider((String) arrayList.get(4));
            pigeonIdTokenResult.setClaims((Map) arrayList.get(5));
            pigeonIdTokenResult.setSignInSecondFactor((String) arrayList.get(6));
            return pigeonIdTokenResult;
        }

        public Long getAuthTimestamp() {
            return this.authTimestamp;
        }

        public Map<String, Object> getClaims() {
            return this.claims;
        }

        public Long getExpirationTimestamp() {
            return this.expirationTimestamp;
        }

        public Long getIssuedAtTimestamp() {
            return this.issuedAtTimestamp;
        }

        public String getSignInProvider() {
            return this.signInProvider;
        }

        public String getSignInSecondFactor() {
            return this.signInSecondFactor;
        }

        public String getToken() {
            return this.token;
        }

        public void setAuthTimestamp(Long l) {
            this.authTimestamp = l;
        }

        public void setClaims(Map<String, Object> map) {
            this.claims = map;
        }

        public void setExpirationTimestamp(Long l) {
            this.expirationTimestamp = l;
        }

        public void setIssuedAtTimestamp(Long l) {
            this.issuedAtTimestamp = l;
        }

        public void setSignInProvider(String str) {
            this.signInProvider = str;
        }

        public void setSignInSecondFactor(String str) {
            this.signInSecondFactor = str;
        }

        public void setToken(String str) {
            this.token = str;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.token);
            arrayList.add(this.expirationTimestamp);
            arrayList.add(this.authTimestamp);
            arrayList.add(this.issuedAtTimestamp);
            arrayList.add(this.signInProvider);
            arrayList.add(this.claims);
            arrayList.add(this.signInSecondFactor);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonMultiFactorInfo {
        private String displayName;
        @NonNull
        private Double enrollmentTimestamp;
        private String factorId;
        private String phoneNumber;
        @NonNull
        private String uid;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String displayName;
            private Double enrollmentTimestamp;
            private String factorId;
            private String phoneNumber;
            private String uid;

            @NonNull
            public PigeonMultiFactorInfo build() {
                PigeonMultiFactorInfo pigeonMultiFactorInfo = new PigeonMultiFactorInfo();
                pigeonMultiFactorInfo.setDisplayName(this.displayName);
                pigeonMultiFactorInfo.setEnrollmentTimestamp(this.enrollmentTimestamp);
                pigeonMultiFactorInfo.setFactorId(this.factorId);
                pigeonMultiFactorInfo.setUid(this.uid);
                pigeonMultiFactorInfo.setPhoneNumber(this.phoneNumber);
                return pigeonMultiFactorInfo;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setDisplayName(String str) {
                this.displayName = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setEnrollmentTimestamp(@NonNull Double d) {
                this.enrollmentTimestamp = d;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setFactorId(String str) {
                this.factorId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPhoneNumber(String str) {
                this.phoneNumber = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUid(@NonNull String str) {
                this.uid = str;
                return this;
            }
        }

        @NonNull
        public static PigeonMultiFactorInfo fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonMultiFactorInfo pigeonMultiFactorInfo = new PigeonMultiFactorInfo();
            pigeonMultiFactorInfo.setDisplayName((String) arrayList.get(0));
            pigeonMultiFactorInfo.setEnrollmentTimestamp((Double) arrayList.get(1));
            pigeonMultiFactorInfo.setFactorId((String) arrayList.get(2));
            pigeonMultiFactorInfo.setUid((String) arrayList.get(3));
            pigeonMultiFactorInfo.setPhoneNumber((String) arrayList.get(4));
            return pigeonMultiFactorInfo;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        @NonNull
        public Double getEnrollmentTimestamp() {
            return this.enrollmentTimestamp;
        }

        public String getFactorId() {
            return this.factorId;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        @NonNull
        public String getUid() {
            return this.uid;
        }

        public void setDisplayName(String str) {
            this.displayName = str;
        }

        public void setEnrollmentTimestamp(@NonNull Double d) {
            if (d != null) {
                this.enrollmentTimestamp = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enrollmentTimestamp\" is null.");
        }

        public void setFactorId(String str) {
            this.factorId = str;
        }

        public void setPhoneNumber(String str) {
            this.phoneNumber = str;
        }

        public void setUid(@NonNull String str) {
            if (str != null) {
                this.uid = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"uid\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.displayName);
            arrayList.add(this.enrollmentTimestamp);
            arrayList.add(this.factorId);
            arrayList.add(this.uid);
            arrayList.add(this.phoneNumber);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonMultiFactorSession {
        @NonNull
        private String id;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String id;

            @NonNull
            public PigeonMultiFactorSession build() {
                PigeonMultiFactorSession pigeonMultiFactorSession = new PigeonMultiFactorSession();
                pigeonMultiFactorSession.setId(this.id);
                return pigeonMultiFactorSession;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setId(@NonNull String str) {
                this.id = str;
                return this;
            }
        }

        @NonNull
        public static PigeonMultiFactorSession fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonMultiFactorSession pigeonMultiFactorSession = new PigeonMultiFactorSession();
            pigeonMultiFactorSession.setId((String) arrayList.get(0));
            return pigeonMultiFactorSession;
        }

        @NonNull
        public String getId() {
            return this.id;
        }

        public void setId(@NonNull String str) {
            if (str != null) {
                this.id = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"id\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.id);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonPhoneMultiFactorAssertion {
        @NonNull
        private String verificationCode;
        @NonNull
        private String verificationId;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String verificationCode;
            private String verificationId;

            @NonNull
            public PigeonPhoneMultiFactorAssertion build() {
                PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion = new PigeonPhoneMultiFactorAssertion();
                pigeonPhoneMultiFactorAssertion.setVerificationId(this.verificationId);
                pigeonPhoneMultiFactorAssertion.setVerificationCode(this.verificationCode);
                return pigeonPhoneMultiFactorAssertion;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setVerificationCode(@NonNull String str) {
                this.verificationCode = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setVerificationId(@NonNull String str) {
                this.verificationId = str;
                return this;
            }
        }

        @NonNull
        public static PigeonPhoneMultiFactorAssertion fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonPhoneMultiFactorAssertion pigeonPhoneMultiFactorAssertion = new PigeonPhoneMultiFactorAssertion();
            pigeonPhoneMultiFactorAssertion.setVerificationId((String) arrayList.get(0));
            pigeonPhoneMultiFactorAssertion.setVerificationCode((String) arrayList.get(1));
            return pigeonPhoneMultiFactorAssertion;
        }

        @NonNull
        public String getVerificationCode() {
            return this.verificationCode;
        }

        @NonNull
        public String getVerificationId() {
            return this.verificationId;
        }

        public void setVerificationCode(@NonNull String str) {
            if (str != null) {
                this.verificationCode = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"verificationCode\" is null.");
        }

        public void setVerificationId(@NonNull String str) {
            if (str != null) {
                this.verificationId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"verificationId\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.verificationId);
            arrayList.add(this.verificationCode);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonSignInProvider {
        private Map<String, String> customParameters;
        @NonNull
        private String providerId;
        private List<String> scopes;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Map<String, String> customParameters;
            private String providerId;
            private List<String> scopes;

            @NonNull
            public PigeonSignInProvider build() {
                PigeonSignInProvider pigeonSignInProvider = new PigeonSignInProvider();
                pigeonSignInProvider.setProviderId(this.providerId);
                pigeonSignInProvider.setScopes(this.scopes);
                pigeonSignInProvider.setCustomParameters(this.customParameters);
                return pigeonSignInProvider;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setCustomParameters(Map<String, String> map) {
                this.customParameters = map;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProviderId(@NonNull String str) {
                this.providerId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setScopes(List<String> list) {
                this.scopes = list;
                return this;
            }
        }

        @NonNull
        public static PigeonSignInProvider fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonSignInProvider pigeonSignInProvider = new PigeonSignInProvider();
            pigeonSignInProvider.setProviderId((String) arrayList.get(0));
            pigeonSignInProvider.setScopes((List) arrayList.get(1));
            pigeonSignInProvider.setCustomParameters((Map) arrayList.get(2));
            return pigeonSignInProvider;
        }

        public Map<String, String> getCustomParameters() {
            return this.customParameters;
        }

        @NonNull
        public String getProviderId() {
            return this.providerId;
        }

        public List<String> getScopes() {
            return this.scopes;
        }

        public void setCustomParameters(Map<String, String> map) {
            this.customParameters = map;
        }

        public void setProviderId(@NonNull String str) {
            if (str != null) {
                this.providerId = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"providerId\" is null.");
        }

        public void setScopes(List<String> list) {
            this.scopes = list;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.providerId);
            arrayList.add(this.scopes);
            arrayList.add(this.customParameters);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonTotpSecret {
        private Long codeIntervalSeconds;
        private Long codeLength;
        private Long enrollmentCompletionDeadline;
        private String hashingAlgorithm;
        @NonNull
        private String secretKey;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Long codeIntervalSeconds;
            private Long codeLength;
            private Long enrollmentCompletionDeadline;
            private String hashingAlgorithm;
            private String secretKey;

            @NonNull
            public PigeonTotpSecret build() {
                PigeonTotpSecret pigeonTotpSecret = new PigeonTotpSecret();
                pigeonTotpSecret.setCodeIntervalSeconds(this.codeIntervalSeconds);
                pigeonTotpSecret.setCodeLength(this.codeLength);
                pigeonTotpSecret.setEnrollmentCompletionDeadline(this.enrollmentCompletionDeadline);
                pigeonTotpSecret.setHashingAlgorithm(this.hashingAlgorithm);
                pigeonTotpSecret.setSecretKey(this.secretKey);
                return pigeonTotpSecret;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setCodeIntervalSeconds(Long l) {
                this.codeIntervalSeconds = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setCodeLength(Long l) {
                this.codeLength = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setEnrollmentCompletionDeadline(Long l) {
                this.enrollmentCompletionDeadline = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setHashingAlgorithm(String str) {
                this.hashingAlgorithm = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setSecretKey(@NonNull String str) {
                this.secretKey = str;
                return this;
            }
        }

        @NonNull
        public static PigeonTotpSecret fromList(@NonNull ArrayList<Object> arrayList) {
            long longValue;
            Long valueOf;
            long longValue2;
            Long valueOf2;
            long longValue3;
            PigeonTotpSecret pigeonTotpSecret = new PigeonTotpSecret();
            Object obj = arrayList.get(0);
            Long l = null;
            if (obj == null) {
                valueOf = null;
            } else {
                if (obj instanceof Integer) {
                    longValue = ((Integer) obj).intValue();
                } else {
                    longValue = ((Long) obj).longValue();
                }
                valueOf = Long.valueOf(longValue);
            }
            pigeonTotpSecret.setCodeIntervalSeconds(valueOf);
            Object obj2 = arrayList.get(1);
            if (obj2 == null) {
                valueOf2 = null;
            } else {
                if (obj2 instanceof Integer) {
                    longValue2 = ((Integer) obj2).intValue();
                } else {
                    longValue2 = ((Long) obj2).longValue();
                }
                valueOf2 = Long.valueOf(longValue2);
            }
            pigeonTotpSecret.setCodeLength(valueOf2);
            Object obj3 = arrayList.get(2);
            if (obj3 != null) {
                if (obj3 instanceof Integer) {
                    longValue3 = ((Integer) obj3).intValue();
                } else {
                    longValue3 = ((Long) obj3).longValue();
                }
                l = Long.valueOf(longValue3);
            }
            pigeonTotpSecret.setEnrollmentCompletionDeadline(l);
            pigeonTotpSecret.setHashingAlgorithm((String) arrayList.get(3));
            pigeonTotpSecret.setSecretKey((String) arrayList.get(4));
            return pigeonTotpSecret;
        }

        public Long getCodeIntervalSeconds() {
            return this.codeIntervalSeconds;
        }

        public Long getCodeLength() {
            return this.codeLength;
        }

        public Long getEnrollmentCompletionDeadline() {
            return this.enrollmentCompletionDeadline;
        }

        public String getHashingAlgorithm() {
            return this.hashingAlgorithm;
        }

        @NonNull
        public String getSecretKey() {
            return this.secretKey;
        }

        public void setCodeIntervalSeconds(Long l) {
            this.codeIntervalSeconds = l;
        }

        public void setCodeLength(Long l) {
            this.codeLength = l;
        }

        public void setEnrollmentCompletionDeadline(Long l) {
            this.enrollmentCompletionDeadline = l;
        }

        public void setHashingAlgorithm(String str) {
            this.hashingAlgorithm = str;
        }

        public void setSecretKey(@NonNull String str) {
            if (str != null) {
                this.secretKey = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"secretKey\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.codeIntervalSeconds);
            arrayList.add(this.codeLength);
            arrayList.add(this.enrollmentCompletionDeadline);
            arrayList.add(this.hashingAlgorithm);
            arrayList.add(this.secretKey);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonUserCredential {
        private PigeonAdditionalUserInfo additionalUserInfo;
        private PigeonAuthCredential credential;
        private PigeonUserDetails user;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private PigeonAdditionalUserInfo additionalUserInfo;
            private PigeonAuthCredential credential;
            private PigeonUserDetails user;

            @NonNull
            public PigeonUserCredential build() {
                PigeonUserCredential pigeonUserCredential = new PigeonUserCredential();
                pigeonUserCredential.setUser(this.user);
                pigeonUserCredential.setAdditionalUserInfo(this.additionalUserInfo);
                pigeonUserCredential.setCredential(this.credential);
                return pigeonUserCredential;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAdditionalUserInfo(PigeonAdditionalUserInfo pigeonAdditionalUserInfo) {
                this.additionalUserInfo = pigeonAdditionalUserInfo;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setCredential(PigeonAuthCredential pigeonAuthCredential) {
                this.credential = pigeonAuthCredential;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUser(PigeonUserDetails pigeonUserDetails) {
                this.user = pigeonUserDetails;
                return this;
            }
        }

        @NonNull
        public static PigeonUserCredential fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonUserCredential pigeonUserCredential = new PigeonUserCredential();
            pigeonUserCredential.setUser((PigeonUserDetails) arrayList.get(0));
            pigeonUserCredential.setAdditionalUserInfo((PigeonAdditionalUserInfo) arrayList.get(1));
            pigeonUserCredential.setCredential((PigeonAuthCredential) arrayList.get(2));
            return pigeonUserCredential;
        }

        public PigeonAdditionalUserInfo getAdditionalUserInfo() {
            return this.additionalUserInfo;
        }

        public PigeonAuthCredential getCredential() {
            return this.credential;
        }

        public PigeonUserDetails getUser() {
            return this.user;
        }

        public void setAdditionalUserInfo(PigeonAdditionalUserInfo pigeonAdditionalUserInfo) {
            this.additionalUserInfo = pigeonAdditionalUserInfo;
        }

        public void setCredential(PigeonAuthCredential pigeonAuthCredential) {
            this.credential = pigeonAuthCredential;
        }

        public void setUser(PigeonUserDetails pigeonUserDetails) {
            this.user = pigeonUserDetails;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.user);
            arrayList.add(this.additionalUserInfo);
            arrayList.add(this.credential);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonUserDetails {
        @NonNull
        private List<Map<Object, Object>> providerData;
        @NonNull
        private PigeonUserInfo userInfo;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private List<Map<Object, Object>> providerData;
            private PigeonUserInfo userInfo;

            @NonNull
            public PigeonUserDetails build() {
                PigeonUserDetails pigeonUserDetails = new PigeonUserDetails();
                pigeonUserDetails.setUserInfo(this.userInfo);
                pigeonUserDetails.setProviderData(this.providerData);
                return pigeonUserDetails;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setProviderData(@NonNull List<Map<Object, Object>> list) {
                this.providerData = list;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUserInfo(@NonNull PigeonUserInfo pigeonUserInfo) {
                this.userInfo = pigeonUserInfo;
                return this;
            }
        }

        @NonNull
        public static PigeonUserDetails fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonUserDetails pigeonUserDetails = new PigeonUserDetails();
            pigeonUserDetails.setUserInfo((PigeonUserInfo) arrayList.get(0));
            pigeonUserDetails.setProviderData((List) arrayList.get(1));
            return pigeonUserDetails;
        }

        @NonNull
        public List<Map<Object, Object>> getProviderData() {
            return this.providerData;
        }

        @NonNull
        public PigeonUserInfo getUserInfo() {
            return this.userInfo;
        }

        public void setProviderData(@NonNull List<Map<Object, Object>> list) {
            if (list != null) {
                this.providerData = list;
                return;
            }
            throw new IllegalStateException("Nonnull field \"providerData\" is null.");
        }

        public void setUserInfo(@NonNull PigeonUserInfo pigeonUserInfo) {
            if (pigeonUserInfo != null) {
                this.userInfo = pigeonUserInfo;
                return;
            }
            throw new IllegalStateException("Nonnull field \"userInfo\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.userInfo);
            arrayList.add(this.providerData);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonUserInfo {
        private Long creationTimestamp;
        private String displayName;
        private String email;
        @NonNull
        private Boolean isAnonymous;
        @NonNull
        private Boolean isEmailVerified;
        private Long lastSignInTimestamp;
        private String phoneNumber;
        private String photoUrl;
        private String providerId;
        private String refreshToken;
        private String tenantId;
        @NonNull
        private String uid;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Long creationTimestamp;
            private String displayName;
            private String email;
            private Boolean isAnonymous;
            private Boolean isEmailVerified;
            private Long lastSignInTimestamp;
            private String phoneNumber;
            private String photoUrl;
            private String providerId;
            private String refreshToken;
            private String tenantId;
            private String uid;

            @NonNull
            public PigeonUserInfo build() {
                PigeonUserInfo pigeonUserInfo = new PigeonUserInfo();
                pigeonUserInfo.setUid(this.uid);
                pigeonUserInfo.setEmail(this.email);
                pigeonUserInfo.setDisplayName(this.displayName);
                pigeonUserInfo.setPhotoUrl(this.photoUrl);
                pigeonUserInfo.setPhoneNumber(this.phoneNumber);
                pigeonUserInfo.setIsAnonymous(this.isAnonymous);
                pigeonUserInfo.setIsEmailVerified(this.isEmailVerified);
                pigeonUserInfo.setProviderId(this.providerId);
                pigeonUserInfo.setTenantId(this.tenantId);
                pigeonUserInfo.setRefreshToken(this.refreshToken);
                pigeonUserInfo.setCreationTimestamp(this.creationTimestamp);
                pigeonUserInfo.setLastSignInTimestamp(this.lastSignInTimestamp);
                return pigeonUserInfo;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setCreationTimestamp(Long l) {
                this.creationTimestamp = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setDisplayName(String str) {
                this.displayName = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setEmail(String str) {
                this.email = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setIsAnonymous(@NonNull Boolean bool) {
                this.isAnonymous = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setIsEmailVerified(@NonNull Boolean bool) {
                this.isEmailVerified = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setLastSignInTimestamp(Long l) {
                this.lastSignInTimestamp = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPhoneNumber(String str) {
                this.phoneNumber = str;
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
            public Builder setProviderId(String str) {
                this.providerId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setRefreshToken(String str) {
                this.refreshToken = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setTenantId(String str) {
                this.tenantId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUid(@NonNull String str) {
                this.uid = str;
                return this;
            }
        }

        @NonNull
        public static PigeonUserInfo fromList(@NonNull ArrayList<Object> arrayList) {
            long longValue;
            Long valueOf;
            long longValue2;
            PigeonUserInfo pigeonUserInfo = new PigeonUserInfo();
            pigeonUserInfo.setUid((String) arrayList.get(0));
            pigeonUserInfo.setEmail((String) arrayList.get(1));
            pigeonUserInfo.setDisplayName((String) arrayList.get(2));
            pigeonUserInfo.setPhotoUrl((String) arrayList.get(3));
            pigeonUserInfo.setPhoneNumber((String) arrayList.get(4));
            pigeonUserInfo.setIsAnonymous((Boolean) arrayList.get(5));
            pigeonUserInfo.setIsEmailVerified((Boolean) arrayList.get(6));
            pigeonUserInfo.setProviderId((String) arrayList.get(7));
            pigeonUserInfo.setTenantId((String) arrayList.get(8));
            pigeonUserInfo.setRefreshToken((String) arrayList.get(9));
            Object obj = arrayList.get(10);
            Long l = null;
            if (obj == null) {
                valueOf = null;
            } else {
                if (obj instanceof Integer) {
                    longValue = ((Integer) obj).intValue();
                } else {
                    longValue = ((Long) obj).longValue();
                }
                valueOf = Long.valueOf(longValue);
            }
            pigeonUserInfo.setCreationTimestamp(valueOf);
            Object obj2 = arrayList.get(11);
            if (obj2 != null) {
                if (obj2 instanceof Integer) {
                    longValue2 = ((Integer) obj2).intValue();
                } else {
                    longValue2 = ((Long) obj2).longValue();
                }
                l = Long.valueOf(longValue2);
            }
            pigeonUserInfo.setLastSignInTimestamp(l);
            return pigeonUserInfo;
        }

        public Long getCreationTimestamp() {
            return this.creationTimestamp;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public String getEmail() {
            return this.email;
        }

        @NonNull
        public Boolean getIsAnonymous() {
            return this.isAnonymous;
        }

        @NonNull
        public Boolean getIsEmailVerified() {
            return this.isEmailVerified;
        }

        public Long getLastSignInTimestamp() {
            return this.lastSignInTimestamp;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public String getPhotoUrl() {
            return this.photoUrl;
        }

        public String getProviderId() {
            return this.providerId;
        }

        public String getRefreshToken() {
            return this.refreshToken;
        }

        public String getTenantId() {
            return this.tenantId;
        }

        @NonNull
        public String getUid() {
            return this.uid;
        }

        public void setCreationTimestamp(Long l) {
            this.creationTimestamp = l;
        }

        public void setDisplayName(String str) {
            this.displayName = str;
        }

        public void setEmail(String str) {
            this.email = str;
        }

        public void setIsAnonymous(@NonNull Boolean bool) {
            if (bool != null) {
                this.isAnonymous = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isAnonymous\" is null.");
        }

        public void setIsEmailVerified(@NonNull Boolean bool) {
            if (bool != null) {
                this.isEmailVerified = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isEmailVerified\" is null.");
        }

        public void setLastSignInTimestamp(Long l) {
            this.lastSignInTimestamp = l;
        }

        public void setPhoneNumber(String str) {
            this.phoneNumber = str;
        }

        public void setPhotoUrl(String str) {
            this.photoUrl = str;
        }

        public void setProviderId(String str) {
            this.providerId = str;
        }

        public void setRefreshToken(String str) {
            this.refreshToken = str;
        }

        public void setTenantId(String str) {
            this.tenantId = str;
        }

        public void setUid(@NonNull String str) {
            if (str != null) {
                this.uid = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"uid\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(12);
            arrayList.add(this.uid);
            arrayList.add(this.email);
            arrayList.add(this.displayName);
            arrayList.add(this.photoUrl);
            arrayList.add(this.phoneNumber);
            arrayList.add(this.isAnonymous);
            arrayList.add(this.isEmailVerified);
            arrayList.add(this.providerId);
            arrayList.add(this.tenantId);
            arrayList.add(this.refreshToken);
            arrayList.add(this.creationTimestamp);
            arrayList.add(this.lastSignInTimestamp);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonUserProfile {
        private String displayName;
        @NonNull
        private Boolean displayNameChanged;
        private String photoUrl;
        @NonNull
        private Boolean photoUrlChanged;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String displayName;
            private Boolean displayNameChanged;
            private String photoUrl;
            private Boolean photoUrlChanged;

            @NonNull
            public PigeonUserProfile build() {
                PigeonUserProfile pigeonUserProfile = new PigeonUserProfile();
                pigeonUserProfile.setDisplayName(this.displayName);
                pigeonUserProfile.setPhotoUrl(this.photoUrl);
                pigeonUserProfile.setDisplayNameChanged(this.displayNameChanged);
                pigeonUserProfile.setPhotoUrlChanged(this.photoUrlChanged);
                return pigeonUserProfile;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setDisplayName(String str) {
                this.displayName = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setDisplayNameChanged(@NonNull Boolean bool) {
                this.displayNameChanged = bool;
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
            public Builder setPhotoUrlChanged(@NonNull Boolean bool) {
                this.photoUrlChanged = bool;
                return this;
            }
        }

        @NonNull
        public static PigeonUserProfile fromList(@NonNull ArrayList<Object> arrayList) {
            PigeonUserProfile pigeonUserProfile = new PigeonUserProfile();
            pigeonUserProfile.setDisplayName((String) arrayList.get(0));
            pigeonUserProfile.setPhotoUrl((String) arrayList.get(1));
            pigeonUserProfile.setDisplayNameChanged((Boolean) arrayList.get(2));
            pigeonUserProfile.setPhotoUrlChanged((Boolean) arrayList.get(3));
            return pigeonUserProfile;
        }

        public String getDisplayName() {
            return this.displayName;
        }

        @NonNull
        public Boolean getDisplayNameChanged() {
            return this.displayNameChanged;
        }

        public String getPhotoUrl() {
            return this.photoUrl;
        }

        @NonNull
        public Boolean getPhotoUrlChanged() {
            return this.photoUrlChanged;
        }

        public void setDisplayName(String str) {
            this.displayName = str;
        }

        public void setDisplayNameChanged(@NonNull Boolean bool) {
            if (bool != null) {
                this.displayNameChanged = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"displayNameChanged\" is null.");
        }

        public void setPhotoUrl(String str) {
            this.photoUrl = str;
        }

        public void setPhotoUrlChanged(@NonNull Boolean bool) {
            if (bool != null) {
                this.photoUrlChanged = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"photoUrlChanged\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.displayName);
            arrayList.add(this.photoUrl);
            arrayList.add(this.displayNameChanged);
            arrayList.add(this.photoUrlChanged);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public static final class PigeonVerifyPhoneNumberRequest {
        private String autoRetrievedSmsCodeForTesting;
        private Long forceResendingToken;
        private String multiFactorInfoId;
        private String multiFactorSessionId;
        private String phoneNumber;
        @NonNull
        private Long timeout;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String autoRetrievedSmsCodeForTesting;
            private Long forceResendingToken;
            private String multiFactorInfoId;
            private String multiFactorSessionId;
            private String phoneNumber;
            private Long timeout;

            @NonNull
            public PigeonVerifyPhoneNumberRequest build() {
                PigeonVerifyPhoneNumberRequest pigeonVerifyPhoneNumberRequest = new PigeonVerifyPhoneNumberRequest();
                pigeonVerifyPhoneNumberRequest.setPhoneNumber(this.phoneNumber);
                pigeonVerifyPhoneNumberRequest.setTimeout(this.timeout);
                pigeonVerifyPhoneNumberRequest.setForceResendingToken(this.forceResendingToken);
                pigeonVerifyPhoneNumberRequest.setAutoRetrievedSmsCodeForTesting(this.autoRetrievedSmsCodeForTesting);
                pigeonVerifyPhoneNumberRequest.setMultiFactorInfoId(this.multiFactorInfoId);
                pigeonVerifyPhoneNumberRequest.setMultiFactorSessionId(this.multiFactorSessionId);
                return pigeonVerifyPhoneNumberRequest;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAutoRetrievedSmsCodeForTesting(String str) {
                this.autoRetrievedSmsCodeForTesting = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setForceResendingToken(Long l) {
                this.forceResendingToken = l;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setMultiFactorInfoId(String str) {
                this.multiFactorInfoId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setMultiFactorSessionId(String str) {
                this.multiFactorSessionId = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPhoneNumber(String str) {
                this.phoneNumber = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setTimeout(@NonNull Long l) {
                this.timeout = l;
                return this;
            }
        }

        @NonNull
        public static PigeonVerifyPhoneNumberRequest fromList(@NonNull ArrayList<Object> arrayList) {
            long longValue;
            Long valueOf;
            long longValue2;
            PigeonVerifyPhoneNumberRequest pigeonVerifyPhoneNumberRequest = new PigeonVerifyPhoneNumberRequest();
            pigeonVerifyPhoneNumberRequest.setPhoneNumber((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            Long l = null;
            if (obj == null) {
                valueOf = null;
            } else {
                if (obj instanceof Integer) {
                    longValue = ((Integer) obj).intValue();
                } else {
                    longValue = ((Long) obj).longValue();
                }
                valueOf = Long.valueOf(longValue);
            }
            pigeonVerifyPhoneNumberRequest.setTimeout(valueOf);
            Object obj2 = arrayList.get(2);
            if (obj2 != null) {
                if (obj2 instanceof Integer) {
                    longValue2 = ((Integer) obj2).intValue();
                } else {
                    longValue2 = ((Long) obj2).longValue();
                }
                l = Long.valueOf(longValue2);
            }
            pigeonVerifyPhoneNumberRequest.setForceResendingToken(l);
            pigeonVerifyPhoneNumberRequest.setAutoRetrievedSmsCodeForTesting((String) arrayList.get(3));
            pigeonVerifyPhoneNumberRequest.setMultiFactorInfoId((String) arrayList.get(4));
            pigeonVerifyPhoneNumberRequest.setMultiFactorSessionId((String) arrayList.get(5));
            return pigeonVerifyPhoneNumberRequest;
        }

        public String getAutoRetrievedSmsCodeForTesting() {
            return this.autoRetrievedSmsCodeForTesting;
        }

        public Long getForceResendingToken() {
            return this.forceResendingToken;
        }

        public String getMultiFactorInfoId() {
            return this.multiFactorInfoId;
        }

        public String getMultiFactorSessionId() {
            return this.multiFactorSessionId;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        @NonNull
        public Long getTimeout() {
            return this.timeout;
        }

        public void setAutoRetrievedSmsCodeForTesting(String str) {
            this.autoRetrievedSmsCodeForTesting = str;
        }

        public void setForceResendingToken(Long l) {
            this.forceResendingToken = l;
        }

        public void setMultiFactorInfoId(String str) {
            this.multiFactorInfoId = str;
        }

        public void setMultiFactorSessionId(String str) {
            this.multiFactorSessionId = str;
        }

        public void setPhoneNumber(String str) {
            this.phoneNumber = str;
        }

        public void setTimeout(@NonNull Long l) {
            if (l != null) {
                this.timeout = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"timeout\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.phoneNumber);
            arrayList.add(this.timeout);
            arrayList.add(this.forceResendingToken);
            arrayList.add(this.autoRetrievedSmsCodeForTesting);
            arrayList.add(this.multiFactorInfoId);
            arrayList.add(this.multiFactorSessionId);
            return arrayList;
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
