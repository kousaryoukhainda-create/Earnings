package com.applovin.mediation;

import com.applovin.impl.sdk.n;
import java.util.List;
/* loaded from: classes.dex */
public class MaxSegment {
    private final int a;
    private final List b;

    public MaxSegment(int i, List<Integer> list) {
        this.a = i;
        this.b = list;
        a(i);
        for (Integer num : list) {
            a(num.intValue());
        }
    }

    private void a(int i) {
        if (i >= 0) {
            return;
        }
        n.h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i);
    }

    public int getKey() {
        return this.a;
    }

    public List<Integer> getValues() {
        return this.b;
    }

    public String toString() {
        return "MaxSegment{key=" + this.a + ", values=" + this.b + '}';
    }
}
