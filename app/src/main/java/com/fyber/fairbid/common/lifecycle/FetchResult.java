package com.fyber.fairbid.common.lifecycle;

import androidx.annotation.NonNull;
import com.fyber.fairbid.internal.Utils;
/* loaded from: classes.dex */
public class FetchResult {
    public final FetchFailure a;
    public final long b;

    /* loaded from: classes.dex */
    public static class Factory {
        public final Utils.ClockHelper a;

        public Factory(Utils.ClockHelper clockHelper) {
            this.a = clockHelper;
        }

        public FetchResult getAdapterNotStarted() {
            return new FetchResult(this.a.getCurrentTimeMillis(), FetchFailure.ADAPTER_NOT_STARTED);
        }

        public FetchResult getCapped() {
            return new FetchResult(this.a.getCurrentTimeMillis(), FetchFailure.CAPPED);
        }

        public FetchResult getFailedFetchResult(FetchFailure fetchFailure) {
            return new FetchResult(this.a.getCurrentTimeMillis(), fetchFailure);
        }

        public FetchResult getNoFill() {
            return new FetchResult(this.a.getCurrentTimeMillis(), FetchFailure.NO_FILL);
        }

        public FetchResult getSuccess() {
            return new FetchResult(this.a.getCurrentTimeMillis());
        }

        public FetchResult getTimeout() {
            return new FetchResult(this.a.getCurrentTimeMillis(), FetchFailure.TIMEOUT);
        }

        public FetchResult getUnknown() {
            return new FetchResult(this.a.getCurrentTimeMillis(), FetchFailure.UNKNOWN);
        }
    }

    public FetchResult(long j) {
        this.b = j;
        this.a = null;
    }

    public FetchFailure getFetchFailure() {
        return this.a;
    }

    public long getTime() {
        return this.b;
    }

    public boolean isSuccess() {
        if (this.a == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "FetchResult{success=" + isSuccess() + ", fetchFailure=" + this.a + ", fetchTime" + this.b + '}';
    }

    public FetchResult(long j, @NonNull FetchFailure fetchFailure) {
        this.b = j;
        this.a = fetchFailure;
    }
}
