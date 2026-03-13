package io.flutter.plugins.quickactions;

import android.util.Log;
import androidx.annotation.NonNull;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.quickactions.Messages;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* loaded from: classes2.dex */
public class Messages {

    /* loaded from: classes2.dex */
    public interface AndroidQuickActionsApi {

        /* renamed from: io.flutter.plugins.quickactions.Messages$AndroidQuickActionsApi$-CC  reason: invalid class name */
        /* loaded from: classes2.dex */
        public abstract /* synthetic */ class CC {
            public static MessageCodec a() {
                return PigeonCodec.INSTANCE;
            }

            public static /* synthetic */ void b(AndroidQuickActionsApi androidQuickActionsApi, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    arrayList.add(0, androidQuickActionsApi.getLaunchAction());
                } catch (Throwable th) {
                    arrayList = Messages.wrapError(th);
                }
                reply.reply(arrayList);
            }

            public static /* synthetic */ void c(AndroidQuickActionsApi androidQuickActionsApi, Object obj, final BasicMessageChannel.Reply reply) {
                final ArrayList arrayList = new ArrayList();
                androidQuickActionsApi.setShortcutItems((List) ((ArrayList) obj).get(0), new VoidResult() { // from class: io.flutter.plugins.quickactions.Messages.AndroidQuickActionsApi.1
                    @Override // io.flutter.plugins.quickactions.Messages.VoidResult
                    public void error(Throwable th) {
                        reply.reply(Messages.wrapError(th));
                    }

                    @Override // io.flutter.plugins.quickactions.Messages.VoidResult
                    public void success() {
                        arrayList.add(0, null);
                        reply.reply(arrayList);
                    }
                });
            }

            public static /* synthetic */ void d(AndroidQuickActionsApi androidQuickActionsApi, Object obj, BasicMessageChannel.Reply reply) {
                ArrayList<Object> arrayList = new ArrayList<>();
                try {
                    androidQuickActionsApi.clearShortcutItems();
                    arrayList.add(0, null);
                } catch (Throwable th) {
                    arrayList = Messages.wrapError(th);
                }
                reply.reply(arrayList);
            }

            public static void e(BinaryMessenger binaryMessenger, AndroidQuickActionsApi androidQuickActionsApi) {
                f(binaryMessenger, "", androidQuickActionsApi);
            }

            public static void f(BinaryMessenger binaryMessenger, String str, final AndroidQuickActionsApi androidQuickActionsApi) {
                String concat;
                if (str.isEmpty()) {
                    concat = "";
                } else {
                    concat = ".".concat(str);
                }
                BasicMessageChannel basicMessageChannel = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.quick_actions_android.AndroidQuickActionsApi.getLaunchAction", concat), a());
                if (androidQuickActionsApi != null) {
                    basicMessageChannel.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: pM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.AndroidQuickActionsApi.CC.b(androidQuickActionsApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.AndroidQuickActionsApi.CC.c(androidQuickActionsApi, obj, reply);
                                    return;
                                default:
                                    Messages.AndroidQuickActionsApi.CC.d(androidQuickActionsApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel2 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.quick_actions_android.AndroidQuickActionsApi.setShortcutItems", concat), a());
                if (androidQuickActionsApi != null) {
                    basicMessageChannel2.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: pM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.AndroidQuickActionsApi.CC.b(androidQuickActionsApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.AndroidQuickActionsApi.CC.c(androidQuickActionsApi, obj, reply);
                                    return;
                                default:
                                    Messages.AndroidQuickActionsApi.CC.d(androidQuickActionsApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel2.setMessageHandler(null);
                }
                BasicMessageChannel basicMessageChannel3 = new BasicMessageChannel(binaryMessenger, AbstractC2437ph.g("dev.flutter.pigeon.quick_actions_android.AndroidQuickActionsApi.clearShortcutItems", concat), a());
                if (androidQuickActionsApi != null) {
                    basicMessageChannel3.setMessageHandler(new BasicMessageChannel.MessageHandler() { // from class: pM
                        @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                        public final void onMessage(Object obj, BasicMessageChannel.Reply reply) {
                            switch (r2) {
                                case 0:
                                    Messages.AndroidQuickActionsApi.CC.b(androidQuickActionsApi, obj, reply);
                                    return;
                                case 1:
                                    Messages.AndroidQuickActionsApi.CC.c(androidQuickActionsApi, obj, reply);
                                    return;
                                default:
                                    Messages.AndroidQuickActionsApi.CC.d(androidQuickActionsApi, obj, reply);
                                    return;
                            }
                        }
                    });
                } else {
                    basicMessageChannel3.setMessageHandler(null);
                }
            }
        }

        void clearShortcutItems();

        String getLaunchAction();

        void setShortcutItems(@NonNull List<ShortcutItemMessage> list, @NonNull VoidResult voidResult);
    }

    /* loaded from: classes2.dex */
    public static class AndroidQuickActionsFlutterApi {
        @NonNull
        private final BinaryMessenger binaryMessenger;
        private final String messageChannelSuffix;

        public AndroidQuickActionsFlutterApi(@NonNull BinaryMessenger binaryMessenger) {
            this(binaryMessenger, "");
        }

        @NonNull
        public static MessageCodec<Object> getCodec() {
            return PigeonCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$launchAction$0(VoidResult voidResult, String str, Object obj) {
            if (obj instanceof List) {
                List list = (List) obj;
                if (list.size() > 1) {
                    voidResult.error(new FlutterError((String) list.get(0), (String) list.get(1), list.get(2)));
                    return;
                } else {
                    voidResult.success();
                    return;
                }
            }
            voidResult.error(Messages.createConnectionError(str));
        }

        public void launchAction(@NonNull String str, @NonNull VoidResult voidResult) {
            String str2 = "dev.flutter.pigeon.quick_actions_android.AndroidQuickActionsFlutterApi.launchAction" + this.messageChannelSuffix;
            new BasicMessageChannel(this.binaryMessenger, str2, getCodec()).send(new ArrayList(Collections.singletonList(str)), new C1409g2(20, voidResult, str2));
        }

        public AndroidQuickActionsFlutterApi(@NonNull BinaryMessenger binaryMessenger, @NonNull String str) {
            this.binaryMessenger = binaryMessenger;
            this.messageChannelSuffix = str.isEmpty() ? "" : ".".concat(str);
        }
    }

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
                return super.readValueOfType(b, byteBuffer);
            }
            return ShortcutItemMessage.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof ShortcutItemMessage) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((ShortcutItemMessage) obj).toList());
                return;
            }
            super.writeValue(byteArrayOutputStream, obj);
        }
    }

    /* loaded from: classes2.dex */
    public interface Result<T> {
        void error(@NonNull Throwable th);

        void success(@NonNull T t);
    }

    /* loaded from: classes2.dex */
    public static final class ShortcutItemMessage {
        private String icon;
        @NonNull
        private String localizedTitle;
        @NonNull
        private String type;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String icon;
            private String localizedTitle;
            private String type;

            @NonNull
            public ShortcutItemMessage build() {
                ShortcutItemMessage shortcutItemMessage = new ShortcutItemMessage();
                shortcutItemMessage.setType(this.type);
                shortcutItemMessage.setLocalizedTitle(this.localizedTitle);
                shortcutItemMessage.setIcon(this.icon);
                return shortcutItemMessage;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setIcon(String str) {
                this.icon = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setLocalizedTitle(@NonNull String str) {
                this.localizedTitle = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setType(@NonNull String str) {
                this.type = str;
                return this;
            }
        }

        @NonNull
        public static ShortcutItemMessage fromList(@NonNull ArrayList<Object> arrayList) {
            ShortcutItemMessage shortcutItemMessage = new ShortcutItemMessage();
            shortcutItemMessage.setType((String) arrayList.get(0));
            shortcutItemMessage.setLocalizedTitle((String) arrayList.get(1));
            shortcutItemMessage.setIcon((String) arrayList.get(2));
            return shortcutItemMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ShortcutItemMessage.class != obj.getClass()) {
                return false;
            }
            ShortcutItemMessage shortcutItemMessage = (ShortcutItemMessage) obj;
            if (this.type.equals(shortcutItemMessage.type) && this.localizedTitle.equals(shortcutItemMessage.localizedTitle) && Objects.equals(this.icon, shortcutItemMessage.icon)) {
                return true;
            }
            return false;
        }

        public String getIcon() {
            return this.icon;
        }

        @NonNull
        public String getLocalizedTitle() {
            return this.localizedTitle;
        }

        @NonNull
        public String getType() {
            return this.type;
        }

        public int hashCode() {
            return Objects.hash(this.type, this.localizedTitle, this.icon);
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setLocalizedTitle(@NonNull String str) {
            if (str != null) {
                this.localizedTitle = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"localizedTitle\" is null.");
        }

        public void setType(@NonNull String str) {
            if (str != null) {
                this.type = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"type\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.type);
            arrayList.add(this.localizedTitle);
            arrayList.add(this.icon);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public interface VoidResult {
        void error(@NonNull Throwable th);

        void success();
    }

    @NonNull
    public static FlutterError createConnectionError(@NonNull String str) {
        return new FlutterError("channel-error", AbstractC2437ph.h("Unable to establish connection on channel: ", str, "."), "");
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
