package com.google.android.gms.analytics;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.fyber.fairbid.sdk.session.UserSessionStorage;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.internal.gtm.zzfc;
import com.google.android.gms.internal.gtm.zzfu;
import com.google.android.gms.tagmanager.DataLayer;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
public class HitBuilders {

    @Deprecated
    /* loaded from: classes3.dex */
    public static class AppViewBuilder extends HitBuilder<AppViewBuilder> {
        public AppViewBuilder() {
            set("&t", "screenview");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AppViewBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static class ExceptionBuilder extends HitBuilder<ExceptionBuilder> {
        public ExceptionBuilder() {
            set("&t", Constants.EXCEPTION);
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @NonNull
        public ExceptionBuilder setDescription(@NonNull String str) {
            set("&exd", str);
            return this;
        }

        @NonNull
        public ExceptionBuilder setFatal(boolean z) {
            set("&exf", zzfu.zzc(z));
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ExceptionBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static class HitBuilder<T extends HitBuilder> {
        ProductAction zza;
        private final Map zze = new HashMap();
        final Map zzb = new HashMap();
        final List zzc = new ArrayList();
        final List zzd = new ArrayList();

        private final HitBuilder zza(String str, String str2) {
            if (str2 != null) {
                this.zze.put(str, str2);
            }
            return this;
        }

        @NonNull
        public T addImpression(Product product, String str) {
            if (product == null) {
                zzfc.zze("product should be non-null");
                return this;
            }
            if (str == null) {
                str = "";
            }
            if (!this.zzb.containsKey(str)) {
                this.zzb.put(str, new ArrayList());
            }
            ((List) this.zzb.get(str)).add(product);
            return this;
        }

        @NonNull
        public T addProduct(Product product) {
            if (product == null) {
                zzfc.zze("product should be non-null");
                return this;
            }
            this.zzd.add(product);
            return this;
        }

        @NonNull
        public T addPromotion(Promotion promotion) {
            if (promotion == null) {
                zzfc.zze("promotion should be non-null");
                return this;
            }
            this.zzc.add(promotion);
            return this;
        }

        @NonNull
        public Map<String, String> build() {
            HashMap hashMap = new HashMap(this.zze);
            ProductAction productAction = this.zza;
            if (productAction != null) {
                hashMap.putAll(productAction.zza());
            }
            int i = 1;
            for (Promotion promotion : this.zzc) {
                hashMap.putAll(promotion.zza(zzd.zzl(i)));
                i++;
            }
            int i2 = 1;
            for (Product product : this.zzd) {
                hashMap.putAll(product.zza(zzd.zzj(i2)));
                i2++;
            }
            int i3 = 1;
            for (Map.Entry entry : this.zzb.entrySet()) {
                String zzg = zzd.zzg(i3);
                int i4 = 1;
                for (Product product2 : (List) entry.getValue()) {
                    hashMap.putAll(product2.zza(zzg.concat(zzd.zzi(i4))));
                    i4++;
                }
                if (!TextUtils.isEmpty((CharSequence) entry.getKey())) {
                    hashMap.put(zzg.concat("nm"), (String) entry.getKey());
                }
                i3++;
            }
            return hashMap;
        }

        public String get(@NonNull String str) {
            return (String) this.zze.get(str);
        }

        @NonNull
        public final T set(String str, String str2) {
            if (str != null) {
                this.zze.put(str, str2);
            } else {
                zzfc.zze("HitBuilder.set() called with a null paramName.");
            }
            return this;
        }

        @NonNull
        public final T setAll(Map<String, String> map) {
            if (map == null) {
                return this;
            }
            this.zze.putAll(new HashMap(map));
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
            if (r15.contains(com.huawei.hms.framework.common.ContainerUtils.KEY_VALUE_DELIMITER) == false) goto L30;
         */
        @androidx.annotation.NonNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public T setCampaignParamsFromUrl(@androidx.annotation.NonNull java.lang.String r15) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.HitBuilders.HitBuilder.setCampaignParamsFromUrl(java.lang.String):com.google.android.gms.analytics.HitBuilders$HitBuilder");
        }

        @NonNull
        public T setCustomDimension(int i, @NonNull String str) {
            set(zzd.zza(i), str);
            return this;
        }

        @NonNull
        public T setCustomMetric(int i, float f) {
            set(zzd.zzd(i), Float.toString(f));
            return this;
        }

        @NonNull
        public T setHitType(@NonNull String str) {
            set("&t", str);
            return this;
        }

        @NonNull
        public T setNewSession() {
            set("&sc", UserSessionStorage.START);
            return this;
        }

        @NonNull
        public T setNonInteraction(boolean z) {
            set("&ni", zzfu.zzc(z));
            return this;
        }

        @NonNull
        public T setProductAction(@NonNull ProductAction productAction) {
            this.zza = productAction;
            return this;
        }

        @NonNull
        public T setPromotionAction(@NonNull String str) {
            this.zze.put("&promoa", str);
            return this;
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public static class ItemBuilder extends HitBuilder<ItemBuilder> {
        public ItemBuilder() {
            set("&t", "item");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @NonNull
        public ItemBuilder setCategory(@NonNull String str) {
            set("&iv", str);
            return this;
        }

        @NonNull
        public ItemBuilder setCurrencyCode(@NonNull String str) {
            set("&cu", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @NonNull
        public ItemBuilder setName(@NonNull String str) {
            set("&in", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @NonNull
        public ItemBuilder setPrice(double d) {
            set("&ip", Double.toString(d));
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ItemBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @NonNull
        public ItemBuilder setQuantity(long j) {
            set("&iq", Long.toString(j));
            return this;
        }

        @NonNull
        public ItemBuilder setSku(@NonNull String str) {
            set("&ic", str);
            return this;
        }

        @NonNull
        public ItemBuilder setTransactionId(@NonNull String str) {
            set("&ti", str);
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static class ScreenViewBuilder extends HitBuilder<ScreenViewBuilder> {
        public ScreenViewBuilder() {
            set("&t", "screenview");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ ScreenViewBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static class SocialBuilder extends HitBuilder<SocialBuilder> {
        public SocialBuilder() {
            set("&t", "social");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @NonNull
        public SocialBuilder setAction(@NonNull String str) {
            set("&sa", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @NonNull
        public SocialBuilder setNetwork(@NonNull String str) {
            set("&sn", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ SocialBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @NonNull
        public SocialBuilder setTarget(@NonNull String str) {
            set("&st", str);
            return this;
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public static class TransactionBuilder extends HitBuilder<TransactionBuilder> {
        public TransactionBuilder() {
            set("&t", "transaction");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @NonNull
        public TransactionBuilder setAffiliation(@NonNull String str) {
            set("&ta", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @NonNull
        public TransactionBuilder setCurrencyCode(@NonNull String str) {
            set("&cu", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TransactionBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @NonNull
        public TransactionBuilder setRevenue(double d) {
            set("&tr", Double.toString(d));
            return this;
        }

        @NonNull
        public TransactionBuilder setShipping(double d) {
            set("&ts", Double.toString(d));
            return this;
        }

        @NonNull
        public TransactionBuilder setTax(double d) {
            set("&tt", Double.toString(d));
            return this;
        }

        @NonNull
        public TransactionBuilder setTransactionId(@NonNull String str) {
            set("&ti", str);
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static class EventBuilder extends HitBuilder<EventBuilder> {
        public EventBuilder() {
            set("&t", DataLayer.EVENT_KEY);
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @NonNull
        public EventBuilder setAction(@NonNull String str) {
            set("&ea", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @NonNull
        public EventBuilder setCategory(@NonNull String str) {
            set("&ec", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @NonNull
        public EventBuilder setLabel(@NonNull String str) {
            set("&el", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ EventBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @NonNull
        public EventBuilder setValue(long j) {
            set("&ev", Long.toString(j));
            return this;
        }

        public EventBuilder(@NonNull String str, @NonNull String str2) {
            this();
            setCategory(str);
            setAction(str2);
        }
    }

    /* loaded from: classes3.dex */
    public static class TimingBuilder extends HitBuilder<TimingBuilder> {
        public TimingBuilder() {
            set("&t", "timing");
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder addImpression(Product product, String str) {
            super.addImpression(product, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder addProduct(Product product) {
            super.addProduct(product);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder addPromotion(Promotion promotion) {
            super.addPromotion(promotion);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setCampaignParamsFromUrl(@NonNull String str) {
            super.setCampaignParamsFromUrl(str);
            return this;
        }

        @NonNull
        public TimingBuilder setCategory(@NonNull String str) {
            set("&utc", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setCustomDimension(int i, @NonNull String str) {
            super.setCustomDimension(i, str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setCustomMetric(int i, float f) {
            super.setCustomMetric(i, f);
            return this;
        }

        @NonNull
        public TimingBuilder setLabel(@NonNull String str) {
            set("&utl", str);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setNewSession() {
            super.setNewSession();
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setNonInteraction(boolean z) {
            super.setNonInteraction(z);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setProductAction(@NonNull ProductAction productAction) {
            super.setProductAction(productAction);
            return this;
        }

        @Override // com.google.android.gms.analytics.HitBuilders.HitBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ TimingBuilder setPromotionAction(@NonNull String str) {
            super.setPromotionAction(str);
            return this;
        }

        @NonNull
        public TimingBuilder setValue(long j) {
            set("&utt", Long.toString(j));
            return this;
        }

        @NonNull
        public TimingBuilder setVariable(@NonNull String str) {
            set("&utv", str);
            return this;
        }

        public TimingBuilder(@NonNull String str, @NonNull String str2, long j) {
            this();
            setVariable(str2);
            setValue(j);
            setCategory(str);
        }
    }
}
