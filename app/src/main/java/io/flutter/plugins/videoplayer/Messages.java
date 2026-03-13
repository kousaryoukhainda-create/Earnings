package io.flutter.plugins.videoplayer;

import android.util.Log;
import androidx.annotation.NonNull;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public class Messages {

    /* loaded from: classes2.dex */
    public interface AndroidVideoPlayerApi {
        @NonNull
        Long create(@NonNull CreateMessage createMessage);

        void dispose(@NonNull Long l);

        void initialize();

        void pause(@NonNull Long l);

        void play(@NonNull Long l);

        @NonNull
        Long position(@NonNull Long l);

        void seekTo(@NonNull Long l, @NonNull Long l2);

        void setLooping(@NonNull Long l, @NonNull Boolean bool);

        void setMixWithOthers(@NonNull Boolean bool);

        void setPlaybackSpeed(@NonNull Long l, @NonNull Double d);

        void setVolume(@NonNull Long l, @NonNull Double d);
    }

    @Target({ElementType.METHOD})
    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes2.dex */
    public @interface CanIgnoreReturnValue {
    }

    /* loaded from: classes2.dex */
    public static final class CreateMessage {
        private String asset;
        private String formatHint;
        @NonNull
        private Map<String, String> httpHeaders;
        private String packageName;
        private String uri;
        private PlatformVideoViewType viewType;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private String asset;
            private String formatHint;
            private Map<String, String> httpHeaders;
            private String packageName;
            private String uri;
            private PlatformVideoViewType viewType;

            @NonNull
            public CreateMessage build() {
                CreateMessage createMessage = new CreateMessage();
                createMessage.setAsset(this.asset);
                createMessage.setUri(this.uri);
                createMessage.setPackageName(this.packageName);
                createMessage.setFormatHint(this.formatHint);
                createMessage.setHttpHeaders(this.httpHeaders);
                createMessage.setViewType(this.viewType);
                return createMessage;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setAsset(String str) {
                this.asset = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setFormatHint(String str) {
                this.formatHint = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setHttpHeaders(@NonNull Map<String, String> map) {
                this.httpHeaders = map;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPackageName(String str) {
                this.packageName = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setUri(String str) {
                this.uri = str;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setViewType(PlatformVideoViewType platformVideoViewType) {
                this.viewType = platformVideoViewType;
                return this;
            }
        }

        @NonNull
        public static CreateMessage fromList(@NonNull ArrayList<Object> arrayList) {
            CreateMessage createMessage = new CreateMessage();
            createMessage.setAsset((String) arrayList.get(0));
            createMessage.setUri((String) arrayList.get(1));
            createMessage.setPackageName((String) arrayList.get(2));
            createMessage.setFormatHint((String) arrayList.get(3));
            createMessage.setHttpHeaders((Map) arrayList.get(4));
            createMessage.setViewType((PlatformVideoViewType) arrayList.get(5));
            return createMessage;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || CreateMessage.class != obj.getClass()) {
                return false;
            }
            CreateMessage createMessage = (CreateMessage) obj;
            if (Objects.equals(this.asset, createMessage.asset) && Objects.equals(this.uri, createMessage.uri) && Objects.equals(this.packageName, createMessage.packageName) && Objects.equals(this.formatHint, createMessage.formatHint) && this.httpHeaders.equals(createMessage.httpHeaders) && Objects.equals(this.viewType, createMessage.viewType)) {
                return true;
            }
            return false;
        }

        public String getAsset() {
            return this.asset;
        }

        public String getFormatHint() {
            return this.formatHint;
        }

        @NonNull
        public Map<String, String> getHttpHeaders() {
            return this.httpHeaders;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getUri() {
            return this.uri;
        }

        public PlatformVideoViewType getViewType() {
            return this.viewType;
        }

        public int hashCode() {
            return Objects.hash(this.asset, this.uri, this.packageName, this.formatHint, this.httpHeaders, this.viewType);
        }

        public void setAsset(String str) {
            this.asset = str;
        }

        public void setFormatHint(String str) {
            this.formatHint = str;
        }

        public void setHttpHeaders(@NonNull Map<String, String> map) {
            if (map != null) {
                this.httpHeaders = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"httpHeaders\" is null.");
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        public void setUri(String str) {
            this.uri = str;
        }

        public void setViewType(PlatformVideoViewType platformVideoViewType) {
            this.viewType = platformVideoViewType;
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.asset);
            arrayList.add(this.uri);
            arrayList.add(this.packageName);
            arrayList.add(this.formatHint);
            arrayList.add(this.httpHeaders);
            arrayList.add(this.viewType);
            return arrayList;
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
                    return PlatformVideoViewType.values()[((Long) readValue).intValue()];
                case -126:
                    return PlatformVideoViewCreationParams.fromList((ArrayList) readValue(byteBuffer));
                case -125:
                    return CreateMessage.fromList((ArrayList) readValue(byteBuffer));
                default:
                    return super.readValueOfType(b, byteBuffer);
            }
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            Integer valueOf;
            if (obj instanceof PlatformVideoViewType) {
                byteArrayOutputStream.write(129);
                if (obj == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(((PlatformVideoViewType) obj).index);
                }
                writeValue(byteArrayOutputStream, valueOf);
            } else if (obj instanceof PlatformVideoViewCreationParams) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((PlatformVideoViewCreationParams) obj).toList());
            } else if (obj instanceof CreateMessage) {
                byteArrayOutputStream.write(131);
                writeValue(byteArrayOutputStream, ((CreateMessage) obj).toList());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class PlatformVideoViewCreationParams {
        @NonNull
        private Long playerId;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Long playerId;

            @NonNull
            public PlatformVideoViewCreationParams build() {
                PlatformVideoViewCreationParams platformVideoViewCreationParams = new PlatformVideoViewCreationParams();
                platformVideoViewCreationParams.setPlayerId(this.playerId);
                return platformVideoViewCreationParams;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setPlayerId(@NonNull Long l) {
                this.playerId = l;
                return this;
            }
        }

        @NonNull
        public static PlatformVideoViewCreationParams fromList(@NonNull ArrayList<Object> arrayList) {
            PlatformVideoViewCreationParams platformVideoViewCreationParams = new PlatformVideoViewCreationParams();
            platformVideoViewCreationParams.setPlayerId((Long) arrayList.get(0));
            return platformVideoViewCreationParams;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PlatformVideoViewCreationParams.class == obj.getClass()) {
                return this.playerId.equals(((PlatformVideoViewCreationParams) obj).playerId);
            }
            return false;
        }

        @NonNull
        public Long getPlayerId() {
            return this.playerId;
        }

        public int hashCode() {
            return Objects.hash(this.playerId);
        }

        public void setPlayerId(@NonNull Long l) {
            if (l != null) {
                this.playerId = l;
                return;
            }
            throw new IllegalStateException("Nonnull field \"playerId\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.playerId);
            return arrayList;
        }
    }

    /* loaded from: classes2.dex */
    public enum PlatformVideoViewType {
        TEXTURE_VIEW(0),
        PLATFORM_VIEW(1);
        
        final int index;

        PlatformVideoViewType(int i) {
            this.index = i;
        }
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
