package io.flutter.plugin.editing;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
@Keep
@SuppressLint({"NewApi", "Override"})
@TargetApi(30)
/* loaded from: classes2.dex */
public class ImeSyncDeferringInsetsCallback {
    private boolean animating;
    private AnimationCallback animationCallback;
    private final int deferredInsetTypes;
    private InsetsListener insetsListener;
    private WindowInsets lastWindowInsets;
    private boolean needsSave;
    private View view;

    @Keep
    /* loaded from: classes2.dex */
    public class AnimationCallback extends WindowInsetsAnimation.Callback {
        public AnimationCallback() {
            super(1);
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
            int typeMask;
            if (ImeSyncDeferringInsetsCallback.this.animating) {
                typeMask = windowInsetsAnimation.getTypeMask();
                if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                    ImeSyncDeferringInsetsCallback.this.animating = false;
                    if (ImeSyncDeferringInsetsCallback.this.lastWindowInsets != null && ImeSyncDeferringInsetsCallback.this.view != null) {
                        ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                    }
                }
            }
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
            int typeMask;
            ImeSyncDeferringInsetsCallback.this.needsSave = true;
            typeMask = windowInsetsAnimation.getTypeMask();
            if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                ImeSyncDeferringInsetsCallback.this.animating = true;
            }
        }

        @Override // android.view.WindowInsetsAnimation.Callback
        public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
            int i;
            Insets insets;
            int i2;
            Insets of;
            WindowInsets build;
            int navigationBars;
            Insets insets2;
            int typeMask;
            if (ImeSyncDeferringInsetsCallback.this.animating && !ImeSyncDeferringInsetsCallback.this.needsSave) {
                boolean z = false;
                for (WindowInsetsAnimation windowInsetsAnimation : list) {
                    typeMask = K0.k(windowInsetsAnimation).getTypeMask();
                    if ((typeMask & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                        z = true;
                    }
                }
                if (!z) {
                    return windowInsets;
                }
                int windowSystemUiVisibility = ImeSyncDeferringInsetsCallback.this.view.getWindowSystemUiVisibility();
                if ((windowSystemUiVisibility & 512) == 0 && (windowSystemUiVisibility & 2) == 0) {
                    navigationBars = WindowInsets.Type.navigationBars();
                    insets2 = windowInsets.getInsets(navigationBars);
                    i = insets2.bottom;
                } else {
                    i = 0;
                }
                AbstractC2537qp.p();
                WindowInsets.Builder g = AbstractC3067x10.g(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                insets = windowInsets.getInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes);
                i2 = insets.bottom;
                of = Insets.of(0, 0, 0, Math.max(i2 - i, 0));
                g.setInsets(ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, of);
                View view = ImeSyncDeferringInsetsCallback.this.view;
                build = g.build();
                view.onApplyWindowInsets(build);
            }
            return windowInsets;
        }
    }

    /* loaded from: classes2.dex */
    public class InsetsListener implements View.OnApplyWindowInsetsListener {
        private InsetsListener() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            WindowInsets windowInsets2;
            ImeSyncDeferringInsetsCallback.this.view = view;
            if (ImeSyncDeferringInsetsCallback.this.needsSave) {
                ImeSyncDeferringInsetsCallback.this.lastWindowInsets = windowInsets;
                ImeSyncDeferringInsetsCallback.this.needsSave = false;
            }
            if (ImeSyncDeferringInsetsCallback.this.animating) {
                windowInsets2 = WindowInsets.CONSUMED;
                return windowInsets2;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
    }

    public ImeSyncDeferringInsetsCallback(@NonNull View view) {
        int ime;
        ime = WindowInsets.Type.ime();
        this.deferredInsetTypes = ime;
        this.animating = false;
        this.needsSave = false;
        this.view = view;
        this.animationCallback = new AnimationCallback();
        this.insetsListener = new InsetsListener();
    }

    public WindowInsetsAnimation.Callback getAnimationCallback() {
        return this.animationCallback;
    }

    public View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public void install() {
        this.view.setWindowInsetsAnimationCallback(this.animationCallback);
        this.view.setOnApplyWindowInsetsListener(this.insetsListener);
    }

    public void remove() {
        this.view.setWindowInsetsAnimationCallback(null);
        this.view.setOnApplyWindowInsetsListener(null);
    }
}
