package com.huawei.hms.flutter.iap.utils;

import android.util.Log;
import com.huawei.hms.iap.entity.ProductInfo;
import com.huawei.hms.iap.entity.ProductInfoResult;
import com.huawei.hms.iap.entity.PurchaseResultInfo;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public final class JSONUtils {
    private static final String TAG = "JSONUtils";

    private JSONUtils() {
    }

    public static JSONObject getJSONFromProductInfo(ProductInfo productInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productId", productInfo.getProductId());
            jSONObject.put("priceType", productInfo.getPriceType());
            jSONObject.put("price", productInfo.getPrice());
            jSONObject.put("microsPrice", productInfo.getMicrosPrice());
            jSONObject.put("originalLocalPrice", productInfo.getOriginalLocalPrice());
            jSONObject.put("originalMicroPrice", productInfo.getOriginalMicroPrice());
            jSONObject.put("currency", productInfo.getCurrency());
            jSONObject.put(HwPayConstant.KEY_PRODUCTNAME, productInfo.getProductName());
            jSONObject.put(HwPayConstant.KEY_PRODUCTDESC, productInfo.getProductDesc());
            jSONObject.put("subPeriod", productInfo.getSubPeriod());
            jSONObject.put("subSpecialPrice", productInfo.getSubSpecialPrice());
            jSONObject.put("subSpecialPriceMicros", productInfo.getSubSpecialPriceMicros());
            jSONObject.put("subSpecialPeriod", productInfo.getSubSpecialPeriod());
            jSONObject.put("subSpecialPeriodCycles", productInfo.getSubSpecialPeriodCycles());
            jSONObject.put("subFreeTrialPeriod", productInfo.getSubFreeTrialPeriod());
            jSONObject.put("subGroupId", productInfo.getSubGroupId());
            jSONObject.put("subGroupTitle", productInfo.getSubGroupTitle());
            jSONObject.put("subProductLevel", productInfo.getSubProductLevel());
            jSONObject.put("offerUsedStatus", productInfo.getOfferUsedStatus());
            jSONObject.put("status", productInfo.getStatus());
        } catch (JSONException e) {
            Log.e(TAG, e.toString());
        }
        return jSONObject;
    }

    public static JSONObject getJSONFromProductInfoResult(ProductInfoResult productInfoResult) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("returnCode", productInfoResult.getReturnCode());
            jSONObject.put("errMsg", productInfoResult.getErrMsg());
            jSONObject.put("productInfoList", mapList(productInfoResult.getProductInfoList()));
            jSONObject.put("status", getJSONFromStatus(productInfoResult.getStatus()));
        } catch (JSONException e) {
            Log.e(TAG, e.toString());
        }
        return jSONObject;
    }

    public static JSONObject getJSONFromPurchaseResultInfo(PurchaseResultInfo purchaseResultInfo) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("returnCode", purchaseResultInfo.getReturnCode());
            jSONObject.put("errMsg", purchaseResultInfo.getErrMsg());
            jSONObject.put("inAppPurchaseData", purchaseResultInfo.getInAppPurchaseData());
            jSONObject.put("inAppDataSignature", purchaseResultInfo.getInAppDataSignature());
            jSONObject.put("signatureAlgorithm", purchaseResultInfo.getSignatureAlgorithm());
        } catch (JSONException e) {
            Log.e(TAG, e.toString());
        }
        return jSONObject;
    }

    public static JSONObject getJSONFromStatus(Status status) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, status.getStatusCode());
            jSONObject.put("statusMessage", status.getStatusMessage());
        } catch (JSONException e) {
            Log.e(TAG, e.toString());
        }
        return jSONObject;
    }

    private static <T> JSONArray mapList(List<T> list) {
        JSONArray jSONArray = new JSONArray();
        for (T t : list) {
            jSONArray.put(getJSONFromProductInfo(t));
        }
        return jSONArray;
    }
}
