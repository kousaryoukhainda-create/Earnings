package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzani  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzani extends zzaky<zzani, zza> implements zzame {
    private static final zzani zzc;
    private static volatile zzamp<zzani> zzd;
    private long zze;
    private int zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzani$zza */
    /* loaded from: classes3.dex */
    public static final class zza extends zzaky.zza<zzani, zza> implements zzame {
        public final zza zza(int i) {
            if (!this.zza.zzu()) {
                zzi();
            }
            ((zzani) this.zza).zzf = i;
            return this;
        }

        private zza() {
            super(zzani.zzc);
        }

        public final zza zza(long j) {
            if (!this.zza.zzu()) {
                zzi();
            }
            ((zzani) this.zza).zze = j;
            return this;
        }
    }

    static {
        zzani zzaniVar = new zzani();
        zzc = zzaniVar;
        zzaky.zza(zzani.class, zzaniVar);
    }

    private zzani() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzank.zza[i - 1]) {
            case 1:
                return new zzani();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzani> zzampVar = zzd;
                if (zzampVar == null) {
                    synchronized (zzani.class) {
                        try {
                            zzampVar = zzd;
                            if (zzampVar == null) {
                                zzampVar = new zzaky.zzc<>(zzc);
                                zzd = zzampVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzampVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }
}
