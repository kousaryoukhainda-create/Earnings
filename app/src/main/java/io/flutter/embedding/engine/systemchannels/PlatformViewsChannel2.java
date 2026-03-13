package io.flutter.embedding.engine.systemchannels;

import androidx.annotation.NonNull;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public class PlatformViewsChannel2 {
    private static final String TAG = "PlatformViewsChannel2";
    private final MethodChannel channel;
    private PlatformViewsHandler handler;
    private final MethodChannel.MethodCallHandler parsingHandler;

    /* loaded from: classes2.dex */
    public static class PlatformViewCreationRequest {
        public final int direction;
        public final double logicalHeight;
        public final double logicalWidth;
        public final ByteBuffer params;
        public final int viewId;
        @NonNull
        public final String viewType;

        public PlatformViewCreationRequest(int i, @NonNull String str, double d, double d2, int i2, ByteBuffer byteBuffer) {
            this.viewId = i;
            this.viewType = str;
            this.logicalWidth = d;
            this.logicalHeight = d2;
            this.direction = i2;
            this.params = byteBuffer;
        }
    }

    /* loaded from: classes2.dex */
    public static class PlatformViewTouch {
        public final int action;
        public final int buttonState;
        public final int deviceId;
        @NonNull
        public final Number downTime;
        public final int edgeFlags;
        @NonNull
        public final Number eventTime;
        public final int flags;
        public final int metaState;
        public final long motionEventId;
        public final int pointerCount;
        @NonNull
        public final Object rawPointerCoords;
        @NonNull
        public final Object rawPointerPropertiesList;
        public final int source;
        public final int viewId;
        public final float xPrecision;
        public final float yPrecision;

        public PlatformViewTouch(int i, @NonNull Number number, @NonNull Number number2, int i2, int i3, @NonNull Object obj, @NonNull Object obj2, int i4, int i5, float f, float f2, int i6, int i7, int i8, int i9, long j) {
            this.viewId = i;
            this.downTime = number;
            this.eventTime = number2;
            this.action = i2;
            this.pointerCount = i3;
            this.rawPointerPropertiesList = obj;
            this.rawPointerCoords = obj2;
            this.metaState = i4;
            this.buttonState = i5;
            this.xPrecision = f;
            this.yPrecision = f2;
            this.deviceId = i6;
            this.edgeFlags = i7;
            this.source = i8;
            this.flags = i9;
            this.motionEventId = j;
        }
    }

    /* loaded from: classes2.dex */
    public interface PlatformViewsHandler {
        void clearFocus(int i);

        void createPlatformView(@NonNull PlatformViewCreationRequest platformViewCreationRequest);

        void dispose(int i);

        boolean isSurfaceControlEnabled();

        void onTouch(@NonNull PlatformViewTouch platformViewTouch);

        void setDirection(int i, int i2);
    }

    public PlatformViewsChannel2(@NonNull DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.PlatformViewsChannel2.1
            private void clearFocus(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                try {
                    PlatformViewsChannel2.this.handler.clearFocus(((Integer) methodCall.arguments()).intValue());
                    result.success(null);
                } catch (IllegalStateException e) {
                    result.error("error", PlatformViewsChannel2.detailedExceptionString(e), null);
                }
            }

            private void create(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                ByteBuffer byteBuffer;
                Map map = (Map) methodCall.arguments();
                if (map.containsKey("params")) {
                    byteBuffer = ByteBuffer.wrap((byte[]) map.get("params"));
                } else {
                    byteBuffer = null;
                }
                try {
                    PlatformViewsChannel2.this.handler.createPlatformView(new PlatformViewCreationRequest(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, ((Integer) map.get(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)).intValue(), byteBuffer));
                    result.success(null);
                } catch (IllegalStateException e) {
                    result.error("error", PlatformViewsChannel2.detailedExceptionString(e), null);
                }
            }

            private void dispose(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                try {
                    PlatformViewsChannel2.this.handler.dispose(((Integer) ((Map) methodCall.arguments()).get("id")).intValue());
                    result.success(null);
                } catch (IllegalStateException e) {
                    result.error("error", PlatformViewsChannel2.detailedExceptionString(e), null);
                }
            }

            private void isSurfaceControlEnabled(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                result.success(Boolean.valueOf(PlatformViewsChannel2.this.handler.isSurfaceControlEnabled()));
            }

            private void setDirection(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                Map map = (Map) methodCall.arguments();
                try {
                    PlatformViewsChannel2.this.handler.setDirection(((Integer) map.get("id")).intValue(), ((Integer) map.get(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)).intValue());
                    result.success(null);
                } catch (IllegalStateException e) {
                    result.error("error", PlatformViewsChannel2.detailedExceptionString(e), null);
                }
            }

            private void touch(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                MethodChannel.Result result2;
                List list = (List) methodCall.arguments();
                try {
                    PlatformViewsChannel2.this.handler.onTouch(new PlatformViewTouch(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                    result2 = result;
                } catch (IllegalStateException e) {
                    e = e;
                    result2 = result;
                }
                try {
                    result2.success(null);
                } catch (IllegalStateException e2) {
                    e = e2;
                    result2.error("error", PlatformViewsChannel2.detailedExceptionString(e), null);
                }
            }

            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result result) {
                if (PlatformViewsChannel2.this.handler == null) {
                    return;
                }
                Log.v(PlatformViewsChannel2.TAG, "Received '" + methodCall.method + "' message.");
                String str = methodCall.method;
                str.getClass();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1352294148:
                        if (str.equals("create")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -756050293:
                        if (str.equals("clearFocus")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 110550847:
                        if (str.equals("touch")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 576796989:
                        if (str.equals("setDirection")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 751366695:
                        if (str.equals("isSurfaceControlEnabled")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1671767583:
                        if (str.equals("dispose")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        create(methodCall, result);
                        return;
                    case 1:
                        clearFocus(methodCall, result);
                        return;
                    case 2:
                        touch(methodCall, result);
                        return;
                    case 3:
                        setDirection(methodCall, result);
                        return;
                    case 4:
                        isSurfaceControlEnabled(methodCall, result);
                        return;
                    case 5:
                        dispose(methodCall, result);
                        return;
                    default:
                        result.notImplemented();
                        return;
                }
            }
        };
        this.parsingHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/platform_views_2", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String detailedExceptionString(Exception exc) {
        return Log.getStackTraceString(exc);
    }

    public void invokeViewFocused(int i) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            return;
        }
        methodChannel.invokeMethod("viewFocused", Integer.valueOf(i));
    }

    public void setPlatformViewsHandler(PlatformViewsHandler platformViewsHandler) {
        this.handler = platformViewsHandler;
    }
}
