package com.fyber.fairbid.ads.offerwall;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public enum OfferWallError {
    UNKNOWN_ERROR,
    SDK_NOT_STARTED,
    CONNECTION_ERROR,
    INVALID_VIRTUAL_CURRENCY_RESPONSE,
    INVALID_VIRTUAL_CURRENCY_RESPONSE_SIGNATURE,
    VIRTUAL_CURRENCY_SERVER_RETURNED_ERROR,
    SECURITY_TOKEN_NOT_PROVIDED,
    DEVICE_NOT_SUPPORTED,
    NULL_CONTEXT_REFERENCE;
    
    @NotNull
    public static final a Companion = new a();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: com.fyber.fairbid.ads.offerwall.OfferWallError$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public /* synthetic */ class C0041a {
            public static final /* synthetic */ int[] a;
            public static final /* synthetic */ int[] b;

            static {
                int[] iArr = new int[EnumC2333oW.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[3] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[5] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[6] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[4] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                a = iArr;
                int[] iArr2 = new int[AbstractC0324Hi.B(4).length];
                try {
                    iArr2[0] = 1;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[1] = 2;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[2] = 3;
                } catch (NoSuchFieldError unused9) {
                }
                b = iArr2;
            }
        }
    }

    OfferWallError() {
    }
}
