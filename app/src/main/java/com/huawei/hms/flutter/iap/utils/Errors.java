package com.huawei.hms.flutter.iap.utils;
/* loaded from: classes2.dex */
public enum Errors {
    LOG_IN("ERR_CAN_NOT_LOG_IN", "Can not log in."),
    UNKNOWN_REQUEST_CODE("UNKNOWN_REQUEST_CODE", "This request code does not match with any available request codes."),
    ACTIVITY_RESULT("ACTIVITY_RESULT_ERROR", "Result is not OK"),
    IS_SANDBOX_READY("IS_SANDBOX_READY_ERROR", null),
    OBTAIN_PRODUCT_INFO("OBTAIN_PRODUCT_INFO_ERROR", null),
    PURCHASE_INTENT_EXCEPTION("PURCHASE_INTENT_EXCEPTION", null),
    CONSUME_OWNED_PURCHASE("CONSUME_OWNED_PURCHASE_ERROR", null),
    OBTAIN_OWNED_PURCHASES("OBTAIN_OWNED_PURCHASES_ERROR", null),
    START_IAP_ACTIVITY("START_IAP_ACTIVITY_ERROR", null),
    PURCHASE_INTENT_RESOLUTION("PURCHASE_INTENT_RESOLUTION_ERROR", null),
    NO_RESOLUTION("NO_RESOLUTION", "There is no resolution for error.");
    
    private final String errorCode;
    private final String errorMessage;

    Errors(String str, String str2) {
        this.errorCode = str;
        this.errorMessage = str2;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }
}
