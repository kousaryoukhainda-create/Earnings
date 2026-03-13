package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.EventChannel;
/* renamed from: Jx  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class ViewTreeObserver$OnGlobalLayoutListenerC0391Jx implements FlutterPlugin, ActivityAware, EventChannel.StreamHandler, ViewTreeObserver.OnGlobalLayoutListener {
    public EventChannel.EventSink b;
    public View c;
    public boolean d;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        View findViewById = activityPluginBinding.getActivity().findViewById(16908290);
        this.c = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        new EventChannel(flutterPluginBinding.getBinaryMessenger(), "flutter_keyboard_visibility").setStreamHandler(this);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        this.b = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        View view = this.c;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.c = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        View view = this.c;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.c = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        View view = this.c;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.c = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ?? r0;
        if (this.c != null) {
            Rect rect = new Rect();
            this.c.getWindowVisibleDisplayFrame(rect);
            if (rect.height() / this.c.getRootView().getHeight() < 0.85d) {
                r0 = 1;
            } else {
                r0 = 0;
            }
            if (r0 != this.d) {
                this.d = r0;
                EventChannel.EventSink eventSink = this.b;
                if (eventSink != null) {
                    eventSink.success(Integer.valueOf((int) r0));
                }
            }
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.b = eventSink;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        View findViewById = activityPluginBinding.getActivity().findViewById(16908290);
        this.c = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
