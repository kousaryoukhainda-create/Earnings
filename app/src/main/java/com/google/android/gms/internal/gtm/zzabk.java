package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
public enum zzabk implements zzxx {
    RT_DEFAULT(0),
    RT_OBSOLETE(1),
    RT_WEEK(10),
    RT_MONTH(20),
    RT_5_WEEKS(21),
    RT_QUARTER(30),
    RT_HALF_A_YEAR(40),
    RT_YEAR(50),
    RT_16_MONTHS(58),
    RT_YEAR_AND_A_HALF(60),
    RT_2_YEARS(70),
    RT_3_YEARS(80),
    RT_ARCHIVAL(1000);
    
    private static final zzxy zzn = new zzxy() { // from class: com.google.android.gms.internal.gtm.zzabi
        @Override // com.google.android.gms.internal.gtm.zzxy
        public final /* synthetic */ zzxx zza(int i) {
            return zzabk.zzb(i);
        }
    };
    private final int zzp;

    zzabk(int i) {
        this.zzp = i;
    }

    public static zzabk zzb(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 10) {
                    if (i != 30) {
                        if (i != 40) {
                            if (i != 50) {
                                if (i != 58) {
                                    if (i != 60) {
                                        if (i != 70) {
                                            if (i != 80) {
                                                if (i != 1000) {
                                                    if (i != 20) {
                                                        if (i != 21) {
                                                            return null;
                                                        }
                                                        return RT_5_WEEKS;
                                                    }
                                                    return RT_MONTH;
                                                }
                                                return RT_ARCHIVAL;
                                            }
                                            return RT_3_YEARS;
                                        }
                                        return RT_2_YEARS;
                                    }
                                    return RT_YEAR_AND_A_HALF;
                                }
                                return RT_16_MONTHS;
                            }
                            return RT_YEAR;
                        }
                        return RT_HALF_A_YEAR;
                    }
                    return RT_QUARTER;
                }
                return RT_WEEK;
            }
            return RT_OBSOLETE;
        }
        return RT_DEFAULT;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzp);
    }

    @Override // com.google.android.gms.internal.gtm.zzxx
    public final int zza() {
        return this.zzp;
    }
}
