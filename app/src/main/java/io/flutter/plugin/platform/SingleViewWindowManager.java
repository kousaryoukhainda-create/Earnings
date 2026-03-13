package io.flutter.plugin.platform;

import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.annotation.NonNull;
import io.flutter.Log;
import j$.util.function.Consumer;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
/* loaded from: classes2.dex */
abstract class SingleViewWindowManager implements WindowManager {
    private static final String TAG = "PlatformViewsController";
    final WindowManager delegate;
    SingleViewFakeWindowViewGroup fakeWindowRootView;

    public SingleViewWindowManager(WindowManager windowManager, SingleViewFakeWindowViewGroup singleViewFakeWindowViewGroup) {
        this.delegate = windowManager;
        this.fakeWindowRootView = singleViewFakeWindowViewGroup;
    }

    @Override // android.view.WindowManager
    public final /* synthetic */ void addCrossWindowBlurEnabledListener(Consumer consumer) {
        addCrossWindowBlurEnabledListener(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        SingleViewFakeWindowViewGroup singleViewFakeWindowViewGroup = this.fakeWindowRootView;
        if (singleViewFakeWindowViewGroup == null) {
            Log.w(TAG, "Embedded view called addView while detached from presentation");
        } else {
            singleViewFakeWindowViewGroup.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    @NonNull
    public WindowMetrics getCurrentWindowMetrics() {
        WindowMetrics currentWindowMetrics;
        currentWindowMetrics = this.delegate.getCurrentWindowMetrics();
        return currentWindowMetrics;
    }

    @Override // android.view.WindowManager
    @Deprecated
    public Display getDefaultDisplay() {
        return this.delegate.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    @NonNull
    public WindowMetrics getMaximumWindowMetrics() {
        WindowMetrics maximumWindowMetrics;
        maximumWindowMetrics = this.delegate.getMaximumWindowMetrics();
        return maximumWindowMetrics;
    }

    @Override // android.view.WindowManager
    public boolean isCrossWindowBlurEnabled() {
        return AbstractC0841aL.A(this.delegate);
    }

    @Override // android.view.WindowManager
    public final /* synthetic */ void removeCrossWindowBlurEnabledListener(java.util.function.Consumer consumer) {
        removeCrossWindowBlurEnabledListener(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // android.view.ViewManager
    public void removeView(View view) {
        SingleViewFakeWindowViewGroup singleViewFakeWindowViewGroup = this.fakeWindowRootView;
        if (singleViewFakeWindowViewGroup == null) {
            Log.w(TAG, "Embedded view called removeView while detached from presentation");
        } else {
            singleViewFakeWindowViewGroup.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public void removeViewImmediate(View view) {
        if (this.fakeWindowRootView == null) {
            Log.w(TAG, "Embedded view called removeViewImmediate while detached from presentation");
            return;
        }
        view.clearAnimation();
        this.fakeWindowRootView.removeView(view);
    }

    @Override // android.view.ViewManager
    public void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        SingleViewFakeWindowViewGroup singleViewFakeWindowViewGroup = this.fakeWindowRootView;
        if (singleViewFakeWindowViewGroup == null) {
            Log.w(TAG, "Embedded view called updateViewLayout while detached from presentation");
        } else {
            singleViewFakeWindowViewGroup.updateViewLayout(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public final /* synthetic */ void addCrossWindowBlurEnabledListener(Executor executor, java.util.function.Consumer consumer) {
        addCrossWindowBlurEnabledListener(executor, Consumer.VivifiedWrapper.convert(consumer));
    }

    public void removeCrossWindowBlurEnabledListener(@NonNull j$.util.function.Consumer<Boolean> consumer) {
        this.delegate.removeCrossWindowBlurEnabledListener(Consumer.Wrapper.convert(consumer));
    }

    public void addCrossWindowBlurEnabledListener(@NonNull j$.util.function.Consumer<Boolean> consumer) {
        this.delegate.addCrossWindowBlurEnabledListener(Consumer.Wrapper.convert(consumer));
    }

    public void addCrossWindowBlurEnabledListener(@NonNull Executor executor, @NonNull j$.util.function.Consumer<Boolean> consumer) {
        this.delegate.addCrossWindowBlurEnabledListener(executor, Consumer.Wrapper.convert(consumer));
    }
}
