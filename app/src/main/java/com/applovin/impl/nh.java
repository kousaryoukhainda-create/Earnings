package com.applovin.impl;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.applovin.impl.o2;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.huawei.hms.support.api.entity.auth.AuthCode;
/* loaded from: classes.dex */
public class nh extends Exception implements o2 {
    public static final o2.a c = new Jh0(19);
    public final int a;
    public final long b;

    public nh(Bundle bundle) {
        this(bundle.getString(b(2)), a(bundle), bundle.getInt(b(0), 1000), bundle.getLong(b(1), SystemClock.elapsedRealtime()));
    }

    private static Throwable a(Class cls, String str) {
        return (Throwable) cls.getConstructor(String.class).newInstance(str);
    }

    public static String b(int i) {
        return Integer.toString(i, 36);
    }

    private static Throwable a(Bundle bundle) {
        String string = bundle.getString(b(3));
        String string2 = bundle.getString(b(4));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, nh.class.getClassLoader());
            Throwable a = Throwable.class.isAssignableFrom(cls) ? a(cls, string2) : null;
            if (a != null) {
                return a;
            }
        } catch (Throwable unused) {
        }
        return a(string2);
    }

    public nh(String str, Throwable th, int i, long j) {
        super(str, th);
        this.a = i;
        this.b = j;
    }

    public final String a() {
        return a(this.a);
    }

    public static String a(int i) {
        if (i != 5001) {
            if (i != 5002) {
                switch (i) {
                    case 1000:
                        return "ERROR_CODE_UNSPECIFIED";
                    case 1001:
                        return "ERROR_CODE_REMOTE_ERROR";
                    case 1002:
                        return "ERROR_CODE_BEHIND_LIVE_WINDOW";
                    case 1003:
                        return "ERROR_CODE_TIMEOUT";
                    case GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION /* 1004 */:
                        return "ERROR_CODE_FAILED_RUNTIME_CHECK";
                    default:
                        switch (i) {
                            case 2000:
                                return "ERROR_CODE_IO_UNSPECIFIED";
                            case 2001:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                            case 2002:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                            case 2003:
                                return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                            case 2004:
                                return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                            case 2005:
                                return "ERROR_CODE_IO_FILE_NOT_FOUND";
                            case 2006:
                                return "ERROR_CODE_IO_NO_PERMISSION";
                            case 2007:
                                return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                            case 2008:
                                return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                            default:
                                switch (i) {
                                    case AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN /* 3001 */:
                                        return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                    case AuthApiStatusCodes.AUTH_API_CLIENT_ERROR /* 3002 */:
                                        return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                    case AuthApiStatusCodes.AUTH_API_SERVER_ERROR /* 3003 */:
                                        return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                    case AuthApiStatusCodes.AUTH_TOKEN_ERROR /* 3004 */:
                                        return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                    default:
                                        switch (i) {
                                            case 4001:
                                                return "ERROR_CODE_DECODER_INIT_FAILED";
                                            case 4002:
                                                return "ERROR_CODE_DECODER_QUERY_FAILED";
                                            case 4003:
                                                return "ERROR_CODE_DECODING_FAILED";
                                            case 4004:
                                                return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                            case 4005:
                                                return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                            default:
                                                switch (i) {
                                                    case 6000:
                                                        return "ERROR_CODE_DRM_UNSPECIFIED";
                                                    case AuthCode.StatusCode.WAITING_CONNECT /* 6001 */:
                                                        return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                    case AuthCode.StatusCode.AUTH_INFO_NOT_EXIST /* 6002 */:
                                                        return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                    case AuthCode.StatusCode.CERT_FINGERPRINT_ERROR /* 6003 */:
                                                        return "ERROR_CODE_DRM_CONTENT_ERROR";
                                                    case AuthCode.StatusCode.PERMISSION_NOT_EXIST /* 6004 */:
                                                        return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                    case AuthCode.StatusCode.PERMISSION_NOT_AUTHORIZED /* 6005 */:
                                                        return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                    case AuthCode.StatusCode.PERMISSION_EXPIRED /* 6006 */:
                                                        return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                    case 6007:
                                                        return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                    case 6008:
                                                        return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                    default:
                                                        if (i >= 1000000) {
                                                            return "custom error code";
                                                        }
                                                        return "invalid error code";
                                                }
                                        }
                                }
                        }
                }
            }
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
    }

    private static RemoteException a(String str) {
        return new RemoteException(str);
    }
}
