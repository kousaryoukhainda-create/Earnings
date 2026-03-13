package com.applovin.mediation;

import java.util.List;
/* loaded from: classes.dex */
public interface MaxSegmentCollection {

    /* loaded from: classes.dex */
    public interface Builder {
        Builder addSegment(MaxSegment maxSegment);

        MaxSegmentCollection build();
    }

    List<MaxSegment> getSegments();
}
