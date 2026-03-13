package com.google.firebase.auth;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import org.json.JSONObject;
/* loaded from: classes.dex */
public abstract class MultiFactorInfo extends AbstractSafeParcelable {
    public abstract String e();

    public abstract String getDisplayName();

    public abstract JSONObject toJson();

    public abstract long w();

    public abstract String x();
}
