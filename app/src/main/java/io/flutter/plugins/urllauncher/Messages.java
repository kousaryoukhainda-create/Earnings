package io.flutter.plugins.urllauncher;

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
    public static final class BrowserOptions {
        @NonNull
        private Boolean showTitle;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Boolean showTitle;

            @NonNull
            public BrowserOptions build() {
                BrowserOptions browserOptions = new BrowserOptions();
                browserOptions.setShowTitle(this.showTitle);
                return browserOptions;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setShowTitle(@NonNull Boolean bool) {
                this.showTitle = bool;
                return this;
            }
        }

        @NonNull
        public static BrowserOptions fromList(@NonNull ArrayList<Object> arrayList) {
            BrowserOptions browserOptions = new BrowserOptions();
            browserOptions.setShowTitle((Boolean) arrayList.get(0));
            return browserOptions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && BrowserOptions.class == obj.getClass()) {
                return this.showTitle.equals(((BrowserOptions) obj).showTitle);
            }
            return false;
        }

        @NonNull
        public Boolean getShowTitle() {
            return this.showTitle;
        }

        public int hashCode() {
            return Objects.hash(this.showTitle);
        }

        public void setShowTitle(@NonNull Boolean bool) {
            if (bool != null) {
                this.showTitle = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.showTitle);
            return arrayList;
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
                return BrowserOptions.fromList((ArrayList) readValue(byteBuffer));
            }
            return WebViewOptions.fromList((ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(@NonNull ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof WebViewOptions) {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((WebViewOptions) obj).toList());
            } else if (obj instanceof BrowserOptions) {
                byteArrayOutputStream.write(130);
                writeValue(byteArrayOutputStream, ((BrowserOptions) obj).toList());
            } else {
                super.writeValue(byteArrayOutputStream, obj);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface UrlLauncherApi {
        @NonNull
        Boolean canLaunchUrl(@NonNull String str);

        void closeWebView();

        @NonNull
        Boolean launchUrl(@NonNull String str, @NonNull Map<String, String> map);

        @NonNull
        Boolean openUrlInApp(@NonNull String str, @NonNull Boolean bool, @NonNull WebViewOptions webViewOptions, @NonNull BrowserOptions browserOptions);

        @NonNull
        Boolean supportsCustomTabs();
    }

    /* loaded from: classes2.dex */
    public static final class WebViewOptions {
        @NonNull
        private Boolean enableDomStorage;
        @NonNull
        private Boolean enableJavaScript;
        @NonNull
        private Map<String, String> headers;

        /* loaded from: classes2.dex */
        public static final class Builder {
            private Boolean enableDomStorage;
            private Boolean enableJavaScript;
            private Map<String, String> headers;

            @NonNull
            public WebViewOptions build() {
                WebViewOptions webViewOptions = new WebViewOptions();
                webViewOptions.setEnableJavaScript(this.enableJavaScript);
                webViewOptions.setEnableDomStorage(this.enableDomStorage);
                webViewOptions.setHeaders(this.headers);
                return webViewOptions;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setEnableDomStorage(@NonNull Boolean bool) {
                this.enableDomStorage = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setEnableJavaScript(@NonNull Boolean bool) {
                this.enableJavaScript = bool;
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            public Builder setHeaders(@NonNull Map<String, String> map) {
                this.headers = map;
                return this;
            }
        }

        @NonNull
        public static WebViewOptions fromList(@NonNull ArrayList<Object> arrayList) {
            WebViewOptions webViewOptions = new WebViewOptions();
            webViewOptions.setEnableJavaScript((Boolean) arrayList.get(0));
            webViewOptions.setEnableDomStorage((Boolean) arrayList.get(1));
            webViewOptions.setHeaders((Map) arrayList.get(2));
            return webViewOptions;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || WebViewOptions.class != obj.getClass()) {
                return false;
            }
            WebViewOptions webViewOptions = (WebViewOptions) obj;
            if (this.enableJavaScript.equals(webViewOptions.enableJavaScript) && this.enableDomStorage.equals(webViewOptions.enableDomStorage) && this.headers.equals(webViewOptions.headers)) {
                return true;
            }
            return false;
        }

        @NonNull
        public Boolean getEnableDomStorage() {
            return this.enableDomStorage;
        }

        @NonNull
        public Boolean getEnableJavaScript() {
            return this.enableJavaScript;
        }

        @NonNull
        public Map<String, String> getHeaders() {
            return this.headers;
        }

        public int hashCode() {
            return Objects.hash(this.enableJavaScript, this.enableDomStorage, this.headers);
        }

        public void setEnableDomStorage(@NonNull Boolean bool) {
            if (bool != null) {
                this.enableDomStorage = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }

        public void setEnableJavaScript(@NonNull Boolean bool) {
            if (bool != null) {
                this.enableJavaScript = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        }

        public void setHeaders(@NonNull Map<String, String> map) {
            if (map != null) {
                this.headers = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"headers\" is null.");
        }

        @NonNull
        public ArrayList<Object> toList() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.enableJavaScript);
            arrayList.add(this.enableDomStorage);
            arrayList.add(this.headers);
            return arrayList;
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
