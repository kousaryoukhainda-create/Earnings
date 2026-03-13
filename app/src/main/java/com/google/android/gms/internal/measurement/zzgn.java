package com.google.android.gms.internal.measurement;
/* loaded from: classes3.dex */
public final class zzgn extends zzme implements zznm {
    private static final zzgn zzd;
    private zzmn zzb = zzme.zzcv();

    static {
        zzgn zzgnVar = new zzgn();
        zzd = zzgnVar;
        zzme.zzcp(zzgn.class, zzgnVar);
    }

    private zzgn() {
    }

    @Override // com.google.android.gms.internal.measurement.zzme
    public final Object zzl(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            return zzd;
                        }
                        throw null;
                    }
                    return new zzgm(null);
                }
                return new zzgn();
            }
            return zzme.zzcq(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        return (byte) 1;
    }
}
