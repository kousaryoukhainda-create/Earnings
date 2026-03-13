package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzws  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzws extends zzaky<zzws, zzb> implements zzame {
    private static final zzws zzc;
    private static volatile zzamp<zzws> zzd;
    private String zze = "";
    private zzajp zzf = zzajp.zza;
    private int zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzws$zzb */
    /* loaded from: classes3.dex */
    public static final class zzb extends zzaky.zza<zzws, zzb> implements zzame {
        public final zzb zza(zza zzaVar) {
            zzh();
            zzws.zza((zzws) this.zza, zzaVar);
            return this;
        }

        private zzb() {
            super(zzws.zzc);
        }

        public final zzb zza(String str) {
            zzh();
            zzws.zza((zzws) this.zza, str);
            return this;
        }

        public final zzb zza(zzajp zzajpVar) {
            zzh();
            zzws.zza((zzws) this.zza, zzajpVar);
            return this;
        }
    }

    static {
        zzws zzwsVar = new zzws();
        zzc = zzwsVar;
        zzaky.zza(zzws.class, zzwsVar);
    }

    private zzws() {
    }

    public static zzb zza() {
        return (zzb) zzc.zzm();
    }

    public static zzws zzd() {
        return zzc;
    }

    public final zza zzb() {
        zza zza2 = zza.zza(this.zzg);
        if (zza2 == null) {
            return zza.UNRECOGNIZED;
        }
        return zza2;
    }

    public final zzajp zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaky
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzwr.zza[i - 1]) {
            case 1:
                return new zzws();
            case 2:
                return new zzb();
            case 3:
                return zzaky.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzws> zzampVar = zzd;
                if (zzampVar == null) {
                    synchronized (zzws.class) {
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

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzws$zza */
    /* loaded from: classes3.dex */
    public enum zza implements zzala {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private final int zzh;

        zza(int i) {
            this.zzh = i;
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(zza.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(zza());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzala
        public final int zza() {
            if (this != UNRECOGNIZED) {
                return this.zzh;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static zza zza(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                return null;
                            }
                            return REMOTE;
                        }
                        return ASYMMETRIC_PUBLIC;
                    }
                    return ASYMMETRIC_PRIVATE;
                }
                return SYMMETRIC;
            }
            return UNKNOWN_KEYMATERIAL;
        }
    }

    public static /* synthetic */ void zza(zzws zzwsVar, zza zzaVar) {
        zzwsVar.zzg = zzaVar.zza();
    }

    public static /* synthetic */ void zza(zzws zzwsVar, String str) {
        str.getClass();
        zzwsVar.zze = str;
    }

    public static /* synthetic */ void zza(zzws zzwsVar, zzajp zzajpVar) {
        zzajpVar.getClass();
        zzwsVar.zzf = zzajpVar;
    }
}
