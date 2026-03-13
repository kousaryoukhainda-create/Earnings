package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.plugins.webviewflutter.WebViewProxyApi;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes2.dex */
public final class AndroidWebkitLibraryPigeonInstanceManager {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final long minHostCreatedIdentifier = 65536;
    @NotNull
    private static final String tag = "PigeonInstanceManager";
    private long clearFinalizedWeakReferencesInterval;
    @NotNull
    private final PigeonFinalizationListener finalizationListener;
    @NotNull
    private final Handler handler;
    private boolean hasFinalizationListenerStopped;
    @NotNull
    private final WeakHashMap<Object, Long> identifiers;
    private long nextIdentifier;
    @NotNull
    private final ReferenceQueue<Object> referenceQueue;
    @NotNull
    private final Runnable releaseAllFinalizedInstancesRunnable;
    @NotNull
    private final HashMap<Long, Object> strongInstances;
    @NotNull
    private final HashMap<Long, WeakReference<Object>> weakInstances;
    @NotNull
    private final HashMap<WeakReference<Object>, Long> weakReferencesToIdentifiers;

    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AndroidWebkitLibraryPigeonInstanceManager create(@NotNull PigeonFinalizationListener finalizationListener) {
            Intrinsics.checkNotNullParameter(finalizationListener, "finalizationListener");
            return new AndroidWebkitLibraryPigeonInstanceManager(finalizationListener);
        }

        private Companion() {
        }
    }

    @Metadata
    /* loaded from: classes2.dex */
    public interface PigeonFinalizationListener {
        void onFinalize(long j);
    }

    public AndroidWebkitLibraryPigeonInstanceManager(@NotNull PigeonFinalizationListener finalizationListener) {
        Intrinsics.checkNotNullParameter(finalizationListener, "finalizationListener");
        this.finalizationListener = finalizationListener;
        this.identifiers = new WeakHashMap<>();
        this.weakInstances = new HashMap<>();
        this.strongInstances = new HashMap<>();
        this.referenceQueue = new ReferenceQueue<>();
        this.weakReferencesToIdentifiers = new HashMap<>();
        Handler handler = new Handler(Looper.getMainLooper());
        this.handler = handler;
        RunnableC1495h2 runnableC1495h2 = new RunnableC1495h2(this, 4);
        this.releaseAllFinalizedInstancesRunnable = runnableC1495h2;
        this.nextIdentifier = minHostCreatedIdentifier;
        this.clearFinalizedWeakReferencesInterval = 3000L;
        handler.postDelayed(runnableC1495h2, 3000L);
    }

    public static /* synthetic */ void a(AndroidWebkitLibraryPigeonInstanceManager androidWebkitLibraryPigeonInstanceManager) {
        androidWebkitLibraryPigeonInstanceManager.releaseAllFinalizedInstances();
    }

    private final void addInstance(Object obj, long j) {
        if (j >= 0) {
            if (!this.weakInstances.containsKey(Long.valueOf(j))) {
                WeakReference<Object> weakReference = new WeakReference<>(obj, this.referenceQueue);
                this.identifiers.put(obj, Long.valueOf(j));
                this.weakInstances.put(Long.valueOf(j), weakReference);
                this.weakReferencesToIdentifiers.put(weakReference, Long.valueOf(j));
                this.strongInstances.put(Long.valueOf(j), obj);
                return;
            }
            throw new IllegalArgumentException(BK.l(j, "Identifier has already been added: ").toString());
        }
        throw new IllegalArgumentException(BK.l(j, "Identifier must be >= 0: ").toString());
    }

    private final void logWarningIfFinalizationListenerHasStopped() {
        if (hasFinalizationListenerStopped()) {
            Log.w(tag, "The manager was used after calls to the PigeonFinalizationListener has been stopped.");
        }
    }

    public final void releaseAllFinalizedInstances() {
        if (hasFinalizationListenerStopped()) {
            return;
        }
        while (true) {
            WeakReference weakReference = (WeakReference) this.referenceQueue.poll();
            if (weakReference != null) {
                Long l = (Long) AbstractC1424g90.e(this.weakReferencesToIdentifiers).remove(weakReference);
                if (l != null) {
                    this.weakInstances.remove(l);
                    this.strongInstances.remove(l);
                    this.finalizationListener.onFinalize(l.longValue());
                }
            } else {
                this.handler.postDelayed(this.releaseAllFinalizedInstancesRunnable, this.clearFinalizedWeakReferencesInterval);
                return;
            }
        }
    }

    public final void addDartCreatedInstance(@NotNull Object instance, long j) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        logWarningIfFinalizationListenerHasStopped();
        addInstance(instance, j);
    }

    public final long addHostCreatedInstance(@NotNull Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        logWarningIfFinalizationListenerHasStopped();
        if (!containsInstance(instance)) {
            long j = this.nextIdentifier;
            this.nextIdentifier = 1 + j;
            addInstance(instance, j);
            return j;
        }
        Class<?> cls = instance.getClass();
        throw new IllegalArgumentException(("Instance of " + cls + " has already been added.").toString());
    }

    public final void clear() {
        this.identifiers.clear();
        this.weakInstances.clear();
        this.strongInstances.clear();
        this.weakReferencesToIdentifiers.clear();
    }

    public final boolean containsInstance(Object obj) {
        logWarningIfFinalizationListenerHasStopped();
        return this.identifiers.containsKey(obj);
    }

    public final long getClearFinalizedWeakReferencesInterval() {
        return this.clearFinalizedWeakReferencesInterval;
    }

    public final Long getIdentifierForStrongReference(Object obj) {
        logWarningIfFinalizationListenerHasStopped();
        Long l = this.identifiers.get(obj);
        if (l != null) {
            HashMap<Long, Object> hashMap = this.strongInstances;
            Intrinsics.b(obj);
            hashMap.put(l, obj);
        }
        return l;
    }

    public final <T> T getInstance(long j) {
        logWarningIfFinalizationListenerHasStopped();
        WeakReference<Object> weakReference = this.weakInstances.get(Long.valueOf(j));
        if (weakReference != null) {
            return (T) weakReference.get();
        }
        return null;
    }

    public final boolean hasFinalizationListenerStopped() {
        return this.hasFinalizationListenerStopped;
    }

    public final <T> T remove(long j) {
        logWarningIfFinalizationListenerHasStopped();
        Object androidWebkitLibraryPigeonInstanceManager = getInstance(j);
        if (androidWebkitLibraryPigeonInstanceManager instanceof WebViewProxyApi.WebViewPlatformView) {
            ((WebViewProxyApi.WebViewPlatformView) androidWebkitLibraryPigeonInstanceManager).destroy();
        }
        return (T) this.strongInstances.remove(Long.valueOf(j));
    }

    public final void setClearFinalizedWeakReferencesInterval(long j) {
        this.handler.removeCallbacks(this.releaseAllFinalizedInstancesRunnable);
        this.clearFinalizedWeakReferencesInterval = j;
        releaseAllFinalizedInstances();
    }

    public final void stopFinalizationListener() {
        this.handler.removeCallbacks(this.releaseAllFinalizedInstancesRunnable);
        this.hasFinalizationListenerStopped = true;
    }
}
