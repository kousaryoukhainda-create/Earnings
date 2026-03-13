package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.VideoContentListener;
/* loaded from: classes.dex */
public abstract class g0 extends x<VideoContentListener> implements VideoContentListener {
    public boolean isOverlayOutside = true;

    public boolean isOverlayOutside() {
        return this.isOverlayOutside;
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onCompleted() {
        EventsListenerT eventslistenert = this.mEventsListener;
        if (eventslistenert != 0) {
            ((VideoContentListener) eventslistenert).onCompleted();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onPlayerError() {
        EventsListenerT eventslistenert = this.mEventsListener;
        if (eventslistenert != 0) {
            ((VideoContentListener) eventslistenert).onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onProgress(int i, int i2) {
        EventsListenerT eventslistenert = this.mEventsListener;
        if (eventslistenert != 0) {
            ((VideoContentListener) eventslistenert).onProgress(i, i2);
        }
    }

    public g0 setOverlayOutside(boolean z) {
        this.isOverlayOutside = z;
        return this;
    }
}
