package io.flutter.plugins.inapppurchase;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import io.flutter.plugins.firebase.auth.Constants;
import io.flutter.plugins.inapppurchase.Messages;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class Translator {

    /* renamed from: io.flutter.plugins.inapppurchase.Translator$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformProductType;
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformReplacementMode;

        static {
            int[] iArr = new int[Messages.PlatformReplacementMode.values().length];
            $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformReplacementMode = iArr;
            try {
                iArr[Messages.PlatformReplacementMode.CHARGE_FULL_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformReplacementMode[Messages.PlatformReplacementMode.CHARGE_PRORATED_PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformReplacementMode[Messages.PlatformReplacementMode.DEFERRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformReplacementMode[Messages.PlatformReplacementMode.WITHOUT_PRORATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformReplacementMode[Messages.PlatformReplacementMode.WITH_TIME_PRORATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformReplacementMode[Messages.PlatformReplacementMode.UNKNOWN_REPLACEMENT_MODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[Messages.PlatformBillingClientFeature.values().length];
            $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature = iArr2;
            try {
                iArr2[Messages.PlatformBillingClientFeature.ALTERNATIVE_BILLING_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature[Messages.PlatformBillingClientFeature.BILLING_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature[Messages.PlatformBillingClientFeature.EXTERNAL_OFFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature[Messages.PlatformBillingClientFeature.IN_APP_MESSAGING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature[Messages.PlatformBillingClientFeature.PRICE_CHANGE_CONFIRMATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature[Messages.PlatformBillingClientFeature.PRODUCT_DETAILS.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature[Messages.PlatformBillingClientFeature.SUBSCRIPTIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature[Messages.PlatformBillingClientFeature.SUBSCRIPTIONS_UPDATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            int[] iArr3 = new int[Messages.PlatformProductType.values().length];
            $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformProductType = iArr3;
            try {
                iArr3[Messages.PlatformProductType.INAPP.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformProductType[Messages.PlatformProductType.SUBS.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public static String currencySymbolFromCode(String str) {
        return Currency.getInstance(str).getSymbol();
    }

    @NonNull
    public static Messages.PlatformAlternativeBillingOnlyReportingDetailsResponse fromAlternativeBillingOnlyReportingDetails(@NonNull C0316Ha c0316Ha, G2 g2) {
        String str;
        Messages.PlatformAlternativeBillingOnlyReportingDetailsResponse.Builder billingResult = new Messages.PlatformAlternativeBillingOnlyReportingDetailsResponse.Builder().setBillingResult(fromBillingResult(c0316Ha));
        if (g2 == null) {
            str = "";
        } else {
            str = g2.a;
        }
        return billingResult.setExternalTransactionToken(str).build();
    }

    @NonNull
    public static Messages.PlatformBillingConfigResponse fromBillingConfig(@NonNull C0316Ha c0316Ha, C0186Ca c0186Ca) {
        String str;
        Messages.PlatformBillingConfigResponse.Builder billingResult = new Messages.PlatformBillingConfigResponse.Builder().setBillingResult(fromBillingResult(c0316Ha));
        if (c0186Ca == null) {
            str = "";
        } else {
            str = c0186Ca.a;
        }
        return billingResult.setCountryCode(str).build();
    }

    @NonNull
    public static Messages.PlatformBillingResponse fromBillingResponseCode(int i) {
        if (i != 12) {
            switch (i) {
                case -2:
                    return Messages.PlatformBillingResponse.FEATURE_NOT_SUPPORTED;
                case -1:
                    return Messages.PlatformBillingResponse.SERVICE_DISCONNECTED;
                case 0:
                    return Messages.PlatformBillingResponse.OK;
                case 1:
                    return Messages.PlatformBillingResponse.USER_CANCELED;
                case 2:
                    return Messages.PlatformBillingResponse.SERVICE_UNAVAILABLE;
                case 3:
                    return Messages.PlatformBillingResponse.BILLING_UNAVAILABLE;
                case 4:
                    return Messages.PlatformBillingResponse.ITEM_UNAVAILABLE;
                case 5:
                    return Messages.PlatformBillingResponse.DEVELOPER_ERROR;
                case 6:
                    return Messages.PlatformBillingResponse.ERROR;
                case 7:
                    return Messages.PlatformBillingResponse.ITEM_ALREADY_OWNED;
                case 8:
                    return Messages.PlatformBillingResponse.ITEM_NOT_OWNED;
                default:
                    return Messages.PlatformBillingResponse.ERROR;
            }
        }
        return Messages.PlatformBillingResponse.NETWORK_ERROR;
    }

    @NonNull
    public static Messages.PlatformBillingResult fromBillingResult(@NonNull C0316Ha c0316Ha) {
        return new Messages.PlatformBillingResult.Builder().setResponseCode(fromBillingResponseCode(c0316Ha.a)).setDebugMessage(c0316Ha.b).build();
    }

    public static Messages.PlatformInstallmentPlanDetails fromInstallmentPlanDetails(C2158mT c2158mT) {
        if (c2158mT == null) {
            return null;
        }
        return new Messages.PlatformInstallmentPlanDetails.Builder().setCommitmentPaymentsCount(Long.valueOf(c2158mT.a)).setSubsequentCommitmentPaymentsCount(Long.valueOf(c2158mT.b)).build();
    }

    public static Messages.PlatformOneTimePurchaseOfferDetails fromOneTimePurchaseOfferDetails(C2244nT c2244nT) {
        if (c2244nT == null) {
            return null;
        }
        return new Messages.PlatformOneTimePurchaseOfferDetails.Builder().setPriceAmountMicros(Long.valueOf(c2244nT.b)).setPriceCurrencyCode(c2244nT.c).setFormattedPrice(c2244nT.a).build();
    }

    public static Messages.PlatformPendingPurchaseUpdate fromPendingPurchaseUpdate(C1188dU c1188dU) {
        JSONArray optJSONArray;
        if (c1188dU == null) {
            return null;
        }
        Messages.PlatformPendingPurchaseUpdate.Builder builder = new Messages.PlatformPendingPurchaseUpdate.Builder();
        JSONObject jSONObject = c1188dU.a;
        Messages.PlatformPendingPurchaseUpdate.Builder purchaseToken = builder.setPurchaseToken(jSONObject.optString("purchaseToken"));
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has("productIds") && (optJSONArray = jSONObject.optJSONArray("productIds")) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(optJSONArray.optString(i));
            }
        }
        return purchaseToken.setProducts(arrayList).build();
    }

    @NonNull
    public static Messages.PlatformPricingPhase fromPricingPhase(@NonNull C2330oT c2330oT) {
        return new Messages.PlatformPricingPhase.Builder().setFormattedPrice(c2330oT.a).setPriceCurrencyCode(c2330oT.c).setPriceAmountMicros(Long.valueOf(c2330oT.b)).setBillingCycleCount(Long.valueOf(c2330oT.e)).setBillingPeriod(c2330oT.d).setRecurrenceMode(toPlatformRecurrenceMode(c2330oT.f)).build();
    }

    @NonNull
    public static List<Messages.PlatformPricingPhase> fromPricingPhases(@NonNull C2416pT c2416pT) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c2416pT.a.iterator();
        while (it.hasNext()) {
            arrayList.add(fromPricingPhase((C2330oT) it.next()));
        }
        return arrayList;
    }

    @NonNull
    public static Messages.PlatformProductDetails fromProductDetail(@NonNull C2587rT c2587rT) {
        return new Messages.PlatformProductDetails.Builder().setTitle(c2587rT.e).setDescription(c2587rT.g).setProductId(c2587rT.c).setProductType(toPlatformProductType(c2587rT.d)).setName(c2587rT.f).setOneTimePurchaseOfferDetails(fromOneTimePurchaseOfferDetails(c2587rT.a())).setSubscriptionOfferDetails(fromSubscriptionOfferDetailsList(c2587rT.j)).build();
    }

    @NonNull
    public static List<Messages.PlatformProductDetails> fromProductDetailsList(List<C2587rT> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (C2587rT c2587rT : list) {
            arrayList.add(fromProductDetail(c2587rT));
        }
        return arrayList;
    }

    @NonNull
    public static Messages.PlatformPurchase fromPurchase(@NonNull Purchase purchase) {
        int i;
        C1235e1 c1235e1;
        Messages.PlatformPurchase.Builder builder = new Messages.PlatformPurchase.Builder();
        String optString = purchase.c.optString("orderId");
        C1188dU c1188dU = null;
        if (TextUtils.isEmpty(optString)) {
            optString = null;
        }
        Messages.PlatformPurchase.Builder orderId = builder.setOrderId(optString);
        JSONObject jSONObject = purchase.c;
        Messages.PlatformPurchase.Builder signature = orderId.setPackageName(jSONObject.optString("packageName")).setPurchaseTime(Long.valueOf(jSONObject.optLong("purchaseTime"))).setPurchaseToken(jSONObject.optString(Constants.TOKEN, jSONObject.optString("purchaseToken"))).setSignature(purchase.b);
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    arrayList.add(optJSONArray.optString(i2));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        Messages.PlatformPurchase.Builder isAcknowledged = signature.setProducts(arrayList).setIsAutoRenewing(Boolean.valueOf(jSONObject.optBoolean("autoRenewing"))).setOriginalJson(purchase.a).setDeveloperPayload(jSONObject.optString("developerPayload")).setIsAcknowledged(Boolean.valueOf(jSONObject.optBoolean("acknowledged", true)));
        if (jSONObject.optInt("purchaseState", 1) != 4) {
            i = 1;
        } else {
            i = 2;
        }
        Messages.PlatformPurchase.Builder quantity = isAcknowledged.setPurchaseState(toPlatformPurchaseState(i)).setQuantity(Long.valueOf(jSONObject.optInt("quantity", 1)));
        String optString2 = jSONObject.optString("obfuscatedAccountId");
        String optString3 = jSONObject.optString("obfuscatedProfileId");
        if (optString2 == null && optString3 == null) {
            c1235e1 = null;
        } else {
            c1235e1 = new C1235e1(optString2, optString3, 0);
        }
        if (c1235e1 != null) {
            quantity.setAccountIdentifiers(new Messages.PlatformAccountIdentifiers.Builder().setObfuscatedAccountId(c1235e1.b).setObfuscatedProfileId(c1235e1.c).build());
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("pendingPurchaseUpdate");
        if (optJSONObject != null) {
            c1188dU = new C1188dU(optJSONObject);
        }
        if (c1188dU != null) {
            quantity.setPendingPurchaseUpdate(fromPendingPurchaseUpdate(c1188dU));
        }
        return quantity.build();
    }

    @NonNull
    public static Messages.PlatformPurchaseHistoryRecord fromPurchaseHistoryRecord(@NonNull PurchaseHistoryRecord purchaseHistoryRecord) {
        Messages.PlatformPurchaseHistoryRecord.Builder purchaseTime = new Messages.PlatformPurchaseHistoryRecord.Builder().setPurchaseTime(Long.valueOf(purchaseHistoryRecord.c.optLong("purchaseTime")));
        JSONObject jSONObject = purchaseHistoryRecord.c;
        Messages.PlatformPurchaseHistoryRecord.Builder signature = purchaseTime.setPurchaseToken(jSONObject.optString(Constants.TOKEN, jSONObject.optString("purchaseToken"))).setSignature(purchaseHistoryRecord.b);
        ArrayList arrayList = new ArrayList();
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return signature.setProducts(arrayList).setDeveloperPayload(jSONObject.optString("developerPayload")).setOriginalJson(purchaseHistoryRecord.a).setQuantity(Long.valueOf(jSONObject.optInt("quantity", 1))).build();
    }

    @NonNull
    public static List<Messages.PlatformPurchaseHistoryRecord> fromPurchaseHistoryRecordList(List<PurchaseHistoryRecord> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
            arrayList.add(fromPurchaseHistoryRecord(purchaseHistoryRecord));
        }
        return arrayList;
    }

    @NonNull
    public static List<Messages.PlatformPurchase> fromPurchasesList(List<Purchase> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (Purchase purchase : list) {
            arrayList.add(fromPurchase(purchase));
        }
        return arrayList;
    }

    @NonNull
    public static Messages.PlatformSubscriptionOfferDetails fromSubscriptionOfferDetails(@NonNull C2502qT c2502qT) {
        return new Messages.PlatformSubscriptionOfferDetails.Builder().setOfferId(c2502qT.b).setBasePlanId(c2502qT.a).setOfferTags(c2502qT.e).setOfferToken(c2502qT.c).setPricingPhases(fromPricingPhases(c2502qT.d)).setInstallmentPlanDetails(fromInstallmentPlanDetails(c2502qT.f)).build();
    }

    public static List<Messages.PlatformSubscriptionOfferDetails> fromSubscriptionOfferDetailsList(List<C2502qT> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C2502qT c2502qT : list) {
            arrayList.add(fromSubscriptionOfferDetails(c2502qT));
        }
        return arrayList;
    }

    @NonNull
    public static Messages.PlatformUserChoiceDetails fromUserChoiceDetails(@NonNull C2166ma0 c2166ma0) {
        Messages.PlatformUserChoiceDetails.Builder externalTransactionToken = new Messages.PlatformUserChoiceDetails.Builder().setExternalTransactionToken(c2166ma0.a.optString("externalTransactionToken"));
        String optString = c2166ma0.a.optString("originalExternalTransactionId");
        if (optString.isEmpty()) {
            optString = null;
        }
        return externalTransactionToken.setOriginalExternalTransactionId(optString).setProducts(fromUserChoiceProductsList(c2166ma0.b)).build();
    }

    @NonNull
    public static Messages.PlatformUserChoiceProduct fromUserChoiceProduct(@NonNull C2080la0 c2080la0) {
        return new Messages.PlatformUserChoiceProduct.Builder().setId(c2080la0.a).setOfferToken(c2080la0.c).setType(toPlatformProductType(c2080la0.b)).build();
    }

    @NonNull
    public static List<Messages.PlatformUserChoiceProduct> fromUserChoiceProductsList(@NonNull List<C2080la0> list) {
        if (list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (C2080la0 c2080la0 : list) {
            arrayList.add(fromUserChoiceProduct(c2080la0));
        }
        return arrayList;
    }

    @NonNull
    public static String toBillingClientFeature(@NonNull Messages.PlatformBillingClientFeature platformBillingClientFeature) {
        switch (AnonymousClass1.$SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformBillingClientFeature[platformBillingClientFeature.ordinal()]) {
            case 1:
                return "jjj";
            case 2:
                return "ggg";
            case 3:
                return "kkk";
            case 4:
                return "bbb";
            case 5:
                return "priceChangeConfirmation";
            case 6:
                return "fff";
            case 7:
                return "subscriptions";
            case 8:
                return "subscriptionsUpdate";
            default:
                throw new Messages.FlutterError("UNKNOWN_FEATURE", "Unknown client feature: " + platformBillingClientFeature, null);
        }
    }

    @NonNull
    public static YQ toPendingPurchasesParams(Messages.PlatformPendingPurchasesParams platformPendingPurchasesParams) {
        boolean z = false;
        if (platformPendingPurchasesParams != null && platformPendingPurchasesParams.getEnablePrepaidPlans().booleanValue()) {
            z = true;
        }
        return new YQ(z);
    }

    public static Messages.PlatformProductType toPlatformProductType(@NonNull String str) {
        int hashCode = str.hashCode();
        if (hashCode != 3541555) {
            if (hashCode == 100343516) {
                str.equals("inapp");
            }
        } else if (str.equals("subs")) {
            return Messages.PlatformProductType.SUBS;
        }
        return Messages.PlatformProductType.INAPP;
    }

    public static Messages.PlatformPurchaseState toPlatformPurchaseState(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return Messages.PlatformPurchaseState.UNSPECIFIED;
                }
                return Messages.PlatformPurchaseState.PENDING;
            }
            return Messages.PlatformPurchaseState.PURCHASED;
        }
        return Messages.PlatformPurchaseState.UNSPECIFIED;
    }

    public static Messages.PlatformRecurrenceMode toPlatformRecurrenceMode(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return Messages.PlatformRecurrenceMode.NON_RECURRING;
                }
                return Messages.PlatformRecurrenceMode.NON_RECURRING;
            }
            return Messages.PlatformRecurrenceMode.FINITE_RECURRING;
        }
        return Messages.PlatformRecurrenceMode.INFINITE_RECURRING;
    }

    @NonNull
    public static C1617iU toProduct(@NonNull Messages.PlatformQueryProduct platformQueryProduct) {
        C1235e1 c1235e1 = new C1235e1(3);
        c1235e1.b = platformQueryProduct.getProductId();
        String productTypeString = toProductTypeString(platformQueryProduct.getProductType());
        c1235e1.c = productTypeString;
        if (!"first_party".equals(productTypeString)) {
            if (c1235e1.b != null) {
                if (c1235e1.c != null) {
                    return new C1617iU(c1235e1);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }
            throw new IllegalArgumentException("Product id must be provided.");
        }
        throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
    }

    @NonNull
    public static List<C1617iU> toProductList(@NonNull List<Messages.PlatformQueryProduct> list) {
        ArrayList arrayList = new ArrayList();
        for (Messages.PlatformQueryProduct platformQueryProduct : list) {
            arrayList.add(toProduct(platformQueryProduct));
        }
        return arrayList;
    }

    @NonNull
    public static String toProductTypeString(Messages.PlatformProductType platformProductType) {
        int i = AnonymousClass1.$SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformProductType[platformProductType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return "subs";
            }
            throw new Messages.FlutterError("UNKNOWN_TYPE", "Unknown product type: " + platformProductType, null);
        }
        return "inapp";
    }

    public static int toReplacementMode(@NonNull Messages.PlatformReplacementMode platformReplacementMode) {
        int i = AnonymousClass1.$SwitchMap$io$flutter$plugins$inapppurchase$Messages$PlatformReplacementMode[platformReplacementMode.ordinal()];
        if (i == 1) {
            return 5;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            if (i == 4) {
                return 3;
            }
            if (i == 5) {
                return 1;
            }
            return 0;
        }
        return 6;
    }
}
