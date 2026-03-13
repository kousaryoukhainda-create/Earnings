package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import io.flutter.plugin.platform.PlatformPlugin;
/* loaded from: classes.dex */
public final class e {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, JosStatusCodes.RTN_CODE_COMMON_ERROR, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, UserVerificationMethods.USER_VERIFY_PATTERN, 192, 224, UserVerificationMethods.USER_VERIFY_HANDPRINT, 384, 448, 512, 640, 768, 896, UserVerificationMethods.USER_VERIFY_ALL, 1152, PlatformPlugin.DEFAULT_SYSTEM_UI, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
}
