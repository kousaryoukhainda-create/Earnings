package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
final class zzalb {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzfxs zze = zzfxs.zzp("auto", DevicePublicKeyStringDef.NONE);
    private static final zzfxs zzf = zzfxs.zzq("dot", "sesame", "circle");
    private static final zzfxs zzg = zzfxs.zzp("filled", "open");
    private static final zzfxs zzh = zzfxs.zzq("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzalb(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzalb zza(String str) {
        char c;
        int i;
        int i2;
        if (str != null) {
            String zza = zzftt.zza(str.trim());
            if (!zza.isEmpty()) {
                zzfxs zzm = zzfxs.zzm(TextUtils.split(zza, zzd));
                String str2 = (String) zzfxt.zza(zzfzp.zzb(zzh, zzm), "outside");
                int hashCode = str2.hashCode();
                int i3 = -1;
                int i4 = 0;
                if (hashCode != -1106037339) {
                    if (hashCode == 92734940 && str2.equals("after")) {
                        c = 0;
                    }
                    c = 65535;
                } else {
                    if (str2.equals("outside")) {
                        c = 1;
                    }
                    c = 65535;
                }
                if (c != 0) {
                    if (c != 1) {
                        i = 1;
                    } else {
                        i = -2;
                    }
                } else {
                    i = 2;
                }
                zzfzn zzb = zzfzp.zzb(zze, zzm);
                if (!zzb.isEmpty()) {
                    String str3 = (String) zzb.iterator().next();
                    if (str3.hashCode() == 3387192 && str3.equals(DevicePublicKeyStringDef.NONE)) {
                        i3 = 0;
                    }
                } else {
                    zzfzn zzb2 = zzfzp.zzb(zzg, zzm);
                    zzfzn zzb3 = zzfzp.zzb(zzf, zzm);
                    if (!zzb2.isEmpty() || !zzb3.isEmpty()) {
                        String str4 = (String) zzfxt.zza(zzb2, "filled");
                        if (str4.hashCode() == 3417674 && str4.equals("open")) {
                            i2 = 2;
                        } else {
                            i2 = 1;
                        }
                        String str5 = (String) zzfxt.zza(zzb3, "circle");
                        int hashCode2 = str5.hashCode();
                        if (hashCode2 != -905816648) {
                            if (hashCode2 == 99657 && str5.equals("dot")) {
                                i3 = 0;
                            }
                        } else if (str5.equals("sesame")) {
                            i3 = 1;
                        }
                        if (i3 != 0) {
                            if (i3 != 1) {
                                i4 = i2;
                                i3 = 1;
                            } else {
                                i3 = 3;
                                i4 = i2;
                            }
                        } else {
                            i4 = i2;
                            i3 = 2;
                        }
                    }
                }
                return new zzalb(i3, i4, i);
            }
            return null;
        }
        return null;
    }
}
