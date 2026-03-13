package com.fyber.fairbid.common.lifecycle;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.fyber.fairbid.common.concurrency.ExecutorPool;
import com.fyber.fairbid.common.concurrency.SettableFuture;
import com.fyber.fairbid.internal.ActivityProvider;
import com.fyber.fairbid.internal.ContextReference;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
/* loaded from: classes.dex */
public class AdDisplay {
    public final ScheduledExecutorService a;
    public final boolean b;
    public final SettableFuture<Boolean> billableImpressionListener;
    public final EventStream<Boolean> clickEventStream;
    public final SettableFuture<Boolean> closeListener;
    public final EventStream<DisplayResult> displayEventStream;
    public final SettableFuture<JW> reportAdMetadataListener;
    public final SettableFuture<Boolean> rewardListener;
    public final SettableFuture<Boolean> adDisplayedListener = SettableFuture.create();
    public final SettableFuture<String> activityStarted = SettableFuture.create();

    /* loaded from: classes.dex */
    public static final class Builder {
        public EventStream<DisplayResult> a = EventStream.create();
        public EventStream<Boolean> b = EventStream.create();
        public SettableFuture<Boolean> c = SettableFuture.create();
        public SettableFuture<Boolean> d = SettableFuture.create();
        public SettableFuture<Boolean> e = SettableFuture.create();
        public SettableFuture<JW> f = SettableFuture.create();
        public ScheduledExecutorService g = ExecutorPool.getInstance();
        public boolean h = false;

        @NonNull
        public AdDisplay build() {
            return new AdDisplay(this);
        }

        public Builder setBillableImpressionListener(SettableFuture<Boolean> settableFuture) {
            this.e = settableFuture;
            return this;
        }

        public Builder setClickEventStream(EventStream<Boolean> eventStream) {
            this.b = eventStream;
            return this;
        }

        public Builder setCloseListener(SettableFuture<Boolean> settableFuture) {
            this.c = settableFuture;
            return this;
        }

        public Builder setDisplayEventStream(EventStream<DisplayResult> eventStream) {
            this.a = eventStream;
            return this;
        }

        public Builder setExecutorService(ScheduledExecutorService scheduledExecutorService) {
            this.g = scheduledExecutorService;
            return this;
        }

        public Builder setReportAdMetadataListener(SettableFuture<JW> settableFuture) {
            this.f = settableFuture;
            return this;
        }

        public Builder setRewardListener(SettableFuture<Boolean> settableFuture) {
            this.d = settableFuture;
            return this;
        }

        public Builder supportsBillableImpressionCallback(boolean z) {
            this.h = z;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public class a implements ActivityProvider.a {
        public final /* synthetic */ List a;

        public a(List list) {
            this.a = list;
        }

        @Override // com.fyber.fairbid.internal.ActivityProvider.a
        public final void a(@NonNull ActivityProvider activityProvider, Activity activity) {
            AdDisplay adDisplay = AdDisplay.this;
            List list = this.a;
            adDisplay.getClass();
            if (activity != null && list.contains(activity.getLocalClassName())) {
                AdDisplay.this.activityStarted.set(activity.getLocalClassName());
                ContextReference contextReference = (ContextReference) activityProvider;
                contextReference.getClass();
                Intrinsics.checkNotNullParameter(this, "l");
                contextReference.e.remove(this);
            }
        }
    }

    public AdDisplay(@NonNull Builder builder) {
        EventStream<DisplayResult> eventStream = builder.a;
        this.displayEventStream = eventStream;
        this.clickEventStream = builder.b;
        this.closeListener = builder.c;
        this.rewardListener = builder.d;
        this.reportAdMetadataListener = builder.f;
        this.b = builder.h;
        this.billableImpressionListener = builder.e;
        ScheduledExecutorService scheduledExecutorService = builder.g;
        this.a = scheduledExecutorService;
        eventStream.getFirstEventFuture().addListener(new V1(this, 0), scheduledExecutorService);
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    public void listenForActivities(@NonNull List<String> list, @NonNull ActivityProvider activityProvider) {
        Activity foregroundActivity = activityProvider.getForegroundActivity();
        if (foregroundActivity != null && list.contains(foregroundActivity.getLocalClassName())) {
            this.activityStarted.set(foregroundActivity.getLocalClassName());
            return;
        }
        a aVar = new a(list);
        activityProvider.b(aVar);
        this.adDisplayedListener.addListener(new W1(0, activityProvider, aVar), this.a);
    }

    public SettableFuture<Boolean> showResultFuture() {
        SettableFuture<Boolean> create = SettableFuture.create();
        this.activityStarted.addListener(new U1(create, 0), this.a);
        this.adDisplayedListener.addListener(new U1(create, 1), this.a);
        return create;
    }

    public boolean supportsBillableImpressionCallback() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DisplayResult displayResult, Throwable th) {
        if (th != null) {
            this.adDisplayedListener.set(Boolean.FALSE);
        } else if (displayResult.isBannerResult()) {
        } else {
            this.adDisplayedListener.set(Boolean.valueOf(displayResult.isSuccess()));
        }
    }
}
