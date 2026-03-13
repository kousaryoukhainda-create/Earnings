package com.google.android.gms.analytics.ecommerce;

import androidx.annotation.NonNull;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class ProductAction {
    @NonNull
    public static final String ACTION_ADD = "add";
    @NonNull
    public static final String ACTION_CHECKOUT = "checkout";
    @NonNull
    public static final String ACTION_CHECKOUT_OPTION = "checkout_option";
    @NonNull
    @Deprecated
    public static final String ACTION_CHECKOUT_OPTIONS = "checkout_options";
    @NonNull
    public static final String ACTION_CLICK = "click";
    @NonNull
    public static final String ACTION_DETAIL = "detail";
    @NonNull
    public static final String ACTION_PURCHASE = "purchase";
    @NonNull
    public static final String ACTION_REFUND = "refund";
    @NonNull
    public static final String ACTION_REMOVE = "remove";
    final Map zza = new HashMap();

    public ProductAction(@NonNull String str) {
        zzb("&pa", str);
    }

    @NonNull
    public ProductAction setCheckoutOptions(@NonNull String str) {
        zzb("&col", str);
        return this;
    }

    @NonNull
    public ProductAction setCheckoutStep(int i) {
        zzb("&cos", Integer.toString(i));
        return this;
    }

    @NonNull
    public ProductAction setProductActionList(@NonNull String str) {
        zzb("&pal", str);
        return this;
    }

    @NonNull
    public ProductAction setProductListSource(@NonNull String str) {
        zzb("&pls", str);
        return this;
    }

    @NonNull
    public ProductAction setTransactionAffiliation(@NonNull String str) {
        zzb("&ta", str);
        return this;
    }

    @NonNull
    public ProductAction setTransactionCouponCode(@NonNull String str) {
        zzb("&tcc", str);
        return this;
    }

    @NonNull
    public ProductAction setTransactionId(@NonNull String str) {
        zzb("&ti", str);
        return this;
    }

    @NonNull
    public ProductAction setTransactionRevenue(double d) {
        zzb("&tr", Double.toString(d));
        return this;
    }

    @NonNull
    public ProductAction setTransactionShipping(double d) {
        zzb("&ts", Double.toString(d));
        return this;
    }

    @NonNull
    public ProductAction setTransactionTax(double d) {
        zzb("&tt", Double.toString(d));
        return this;
    }

    @NonNull
    public String toString() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.zza.entrySet()) {
            if (((String) entry.getKey()).startsWith(ContainerUtils.FIELD_DELIMITER)) {
                hashMap.put(((String) entry.getKey()).substring(1), (String) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return zzj.zzb(hashMap);
    }

    @NonNull
    public final Map zza() {
        return new HashMap(this.zza);
    }

    public final void zzb(String str, String str2) {
        Preconditions.checkNotNull(str, "Name should be non-null");
        this.zza.put(str, str2);
    }
}
