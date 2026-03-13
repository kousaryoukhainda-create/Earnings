package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.mediation.MaxReward;
/* loaded from: classes.dex */
public class MaxRewardImpl implements MaxReward {
    private final String a;
    private final int b;

    private MaxRewardImpl(int i, String str) {
        if (i >= 0) {
            this.a = str;
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
    }

    public static MaxReward create(int i, String str) {
        return new MaxRewardImpl(i, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.a;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MaxReward{amount=");
        sb.append(this.b);
        sb.append(", label=");
        return AbstractC0324Hi.h(sb, this.a, "}");
    }
}
