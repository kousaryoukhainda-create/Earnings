package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.fyber.fairbid.sdk.session.UserSessionStorage;
/* loaded from: classes3.dex */
final class zzaku {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzaku(int i, int i2, int i3, int i4, int i5) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzaku zza(String str) {
        char c;
        zzcw.zzd(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            int length = split.length;
            if (i < length) {
                String zza = zzftt.zza(split[i].trim());
                switch (zza.hashCode()) {
                    case 100571:
                        if (zza.equals("end")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3556653:
                        if (zza.equals("text")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 109757538:
                        if (zza.equals(UserSessionStorage.START)) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 109780401:
                        if (zza.equals("style")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            if (c == 3) {
                                i5 = i;
                            }
                        } else {
                            i4 = i;
                        }
                    } else {
                        i3 = i;
                    }
                } else {
                    i2 = i;
                }
                i++;
            } else if (i2 != -1 && i3 != -1 && i5 != -1) {
                return new zzaku(i2, i3, i4, i5, length);
            } else {
                return null;
            }
        }
    }
}
