package defpackage;

import android.telephony.emergency.EmergencyNumber;
/* renamed from: rp  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2622rp {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public C2622rp(EmergencyNumber emergencyNumber) {
        String number;
        String countryIso;
        String mnc;
        boolean isFromSources;
        boolean isFromSources2;
        boolean isFromSources3;
        boolean isFromSources4;
        boolean isFromSources5;
        String str;
        number = emergencyNumber.getNumber();
        this.a = number;
        countryIso = emergencyNumber.getCountryIso();
        this.b = countryIso;
        mnc = emergencyNumber.getMnc();
        this.c = mnc;
        isFromSources = emergencyNumber.isFromSources(1);
        if (!isFromSources) {
            isFromSources2 = emergencyNumber.isFromSources(2);
            if (!isFromSources2) {
                isFromSources3 = emergencyNumber.isFromSources(16);
                if (!isFromSources3) {
                    isFromSources4 = emergencyNumber.isFromSources(8);
                    if (!isFromSources4) {
                        isFromSources5 = emergencyNumber.isFromSources(4);
                        if (isFromSources5) {
                            str = "modem config";
                        } else {
                            str = "unknown";
                        }
                    } else {
                        str = "default";
                    }
                } else {
                    str = "platform-maintained database";
                }
            } else {
                str = "sim";
            }
        } else {
            str = "network signaling";
        }
        this.d = str;
    }
}
