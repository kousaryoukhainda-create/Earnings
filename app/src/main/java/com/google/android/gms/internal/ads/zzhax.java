package com.google.android.gms.internal.ads;

import com.google.android.gms.location.GeofenceStatusCodes;
/* loaded from: classes3.dex */
final class zzhax implements zzgxx {
    static final zzgxx zza = new zzhax();

    private zzhax() {
    }

    @Override // com.google.android.gms.internal.ads.zzgxx
    public final boolean zza(int i) {
        if (i != 0 && i != 1 && i != 2 && i != 1999) {
            switch (i) {
                case 1000:
                case 1001:
                case 1002:
                case 1003:
                case GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION /* 1004 */:
                case GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT /* 1005 */:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                case 1010:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
