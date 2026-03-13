package defpackage;
/* renamed from: oW  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC2333oW {
    DEVICE_NOT_SUPPORTED("Only devices with webkit installed and running Android API level 14 and above are supported"),
    CONNECTION_ERROR("Internet connection error"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_ERROR("An unknown error occurred"),
    SDK_NOT_STARTED("You need to start the SDK"),
    MISMATCH_CALLBACK_TYPE("You need to provide the correct callback for the requester"),
    NULL_CONTEXT_REFERENCE("The context reference cannot be null"),
    SECURITY_TOKEN_NOT_PROVIDED("The security token was not provided when starting the SDK."),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR_REQUESTING_ADS("An error happened while trying to retrieve ads"),
    /* JADX INFO: Fake field, exist only in values array */
    UNABLE_TO_REQUEST_ADS("The SDK is unable to request right now because it is either already performing a request or showing an ad");
    
    public final String b;

    EnumC2333oW(String str) {
        this.b = str;
    }
}
