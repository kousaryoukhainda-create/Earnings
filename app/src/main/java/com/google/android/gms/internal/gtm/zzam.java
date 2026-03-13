package com.google.android.gms.internal.gtm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes3.dex */
public final class zzam extends zzxr implements zzzh {
    private static final zzyb zzd = new zzyb<Integer, zzaq>() { // from class: com.google.android.gms.internal.gtm.zzam.1
        @Override // com.google.android.gms.internal.gtm.zzyb
        /* renamed from: zza */
        public zzaq zzb(Integer num) {
            zzaq zzb = zzaq.zzb(num.intValue());
            if (zzb == null) {
                return zzaq.ESCAPE_HTML;
            }
            return zzb;
        }
    };
    private static final zzam zze;
    private int zzf;
    private long zzn;
    private boolean zzo;
    private boolean zzr;
    private byte zzs = 2;
    private int zzg = 1;
    private String zzh = "";
    private zzyd zzi = zzxv.zzah();
    private zzyd zzj = zzxv.zzah();
    private zzyd zzk = zzxv.zzah();
    private String zzl = "";
    private String zzm = "";
    private zzyd zzp = zzxv.zzah();
    private zzya zzq = zzxv.zzag();

    static {
        zzam zzamVar = new zzam();
        zze = zzamVar;
        zzxv.zzan(zzam.class, zzamVar);
    }

    private zzam() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void zzA(zzam zzamVar, Iterable iterable) {
        zzamVar.zzat();
        zzyd zzydVar = zzamVar.zzk;
        byte[] bArr = zzye.zzd;
        if (zzydVar instanceof ArrayList) {
            ((ArrayList) zzydVar).ensureCapacity(iterable.size() + zzydVar.size());
        }
        int size = zzydVar.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String c = AbstractC2437ph.c(zzydVar.size() - size, "Element at index ", " is null.");
                int size2 = zzydVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    }
                    zzydVar.remove(size2);
                }
                throw new NullPointerException(c);
            }
            zzydVar.add(obj);
        }
    }

    public static /* synthetic */ void zzC(zzam zzamVar, String str) {
        str.getClass();
        zzamVar.zzf |= 4;
        zzamVar.zzl = str;
    }

    public static /* synthetic */ void zzD(zzam zzamVar, String str) {
        str.getClass();
        zzamVar.zzf |= 8;
        zzamVar.zzm = str;
    }

    public static /* synthetic */ void zzE(zzam zzamVar, String str) {
        str.getClass();
        zzamVar.zzf |= 2;
        zzamVar.zzh = str;
    }

    public static /* synthetic */ void zzF(zzam zzamVar, long j) {
        zzamVar.zzf |= 16;
        zzamVar.zzn = j;
    }

    public static /* synthetic */ void zzG(zzam zzamVar, boolean z) {
        zzamVar.zzf |= 32;
        zzamVar.zzo = z;
    }

    public static /* synthetic */ void zzH(zzam zzamVar, zzam zzamVar2) {
        zzamVar2.getClass();
        zzyd zzydVar = zzamVar.zzp;
        if (!zzydVar.zzc()) {
            zzamVar.zzp = zzxv.zzai(zzydVar);
        }
        zzamVar.zzp.add(zzamVar2);
    }

    public static /* synthetic */ void zzJ(zzam zzamVar, Iterable iterable) {
        int i;
        zzya zzyaVar = zzamVar.zzq;
        if (!zzyaVar.zzc()) {
            int size = zzyaVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            zzamVar.zzq = zzyaVar.zzg(i);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzamVar.zzq.zzh(((zzaq) it.next()).zza());
        }
    }

    public static /* synthetic */ void zzL(zzam zzamVar, boolean z) {
        zzamVar.zzf |= 64;
        zzamVar.zzr = z;
    }

    public static /* synthetic */ void zzM(zzam zzamVar, zzam zzamVar2) {
        zzamVar2.getClass();
        zzamVar.zzar();
        zzamVar.zzi.add(zzamVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void zzN(zzam zzamVar, Iterable iterable) {
        zzamVar.zzar();
        zzyd zzydVar = zzamVar.zzi;
        byte[] bArr = zzye.zzd;
        if (zzydVar instanceof ArrayList) {
            ((ArrayList) zzydVar).ensureCapacity(iterable.size() + zzydVar.size());
        }
        int size = zzydVar.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String c = AbstractC2437ph.c(zzydVar.size() - size, "Element at index ", " is null.");
                int size2 = zzydVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    }
                    zzydVar.remove(size2);
                }
                throw new NullPointerException(c);
            }
            zzydVar.add(obj);
        }
    }

    private final void zzar() {
        zzyd zzydVar = this.zzi;
        if (!zzydVar.zzc()) {
            this.zzi = zzxv.zzai(zzydVar);
        }
    }

    private final void zzas() {
        zzyd zzydVar = this.zzj;
        if (!zzydVar.zzc()) {
            this.zzj = zzxv.zzai(zzydVar);
        }
    }

    private final void zzat() {
        zzyd zzydVar = this.zzk;
        if (!zzydVar.zzc()) {
            this.zzk = zzxv.zzai(zzydVar);
        }
    }

    public static zzan zzg() {
        return (zzan) zze.zzY();
    }

    public static zzam zzj() {
        return zze;
    }

    public static /* synthetic */ void zzu(zzam zzamVar, zzat zzatVar) {
        zzamVar.zzg = zzatVar.zza();
        zzamVar.zzf |= 1;
    }

    public static /* synthetic */ void zzw(zzam zzamVar, zzam zzamVar2) {
        zzamVar2.getClass();
        zzamVar.zzas();
        zzamVar.zzj.add(zzamVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void zzx(zzam zzamVar, Iterable iterable) {
        zzamVar.zzas();
        zzyd zzydVar = zzamVar.zzj;
        byte[] bArr = zzye.zzd;
        if (zzydVar instanceof ArrayList) {
            ((ArrayList) zzydVar).ensureCapacity(iterable.size() + zzydVar.size());
        }
        int size = zzydVar.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String c = AbstractC2437ph.c(zzydVar.size() - size, "Element at index ", " is null.");
                int size2 = zzydVar.size();
                while (true) {
                    size2--;
                    if (size2 < size) {
                        break;
                    }
                    zzydVar.remove(size2);
                }
                throw new NullPointerException(c);
            }
            zzydVar.add(obj);
        }
    }

    public static /* synthetic */ void zzz(zzam zzamVar, zzam zzamVar2) {
        zzamVar2.getClass();
        zzamVar.zzat();
        zzamVar.zzk.add(zzamVar2);
    }

    public final boolean zzO() {
        return this.zzo;
    }

    public final boolean zzP() {
        return this.zzr;
    }

    public final int zza() {
        return this.zzi.size();
    }

    @Override // com.google.android.gms.internal.gtm.zzxv
    public final Object zzb(int i, Object obj, Object obj2) {
        byte b = 1;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b = 0;
                            }
                            this.zzs = b;
                            return null;
                        }
                        return zze;
                    }
                    return new zzan(null);
                }
                return new zzam();
            }
            return zzxv.zzak(zze, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0005\u0005\u0001ᴌ\u0000\u0002ဈ\u0001\u0003Л\u0004Л\u0005Л\u0006ဈ\u0002\u0007ဈ\u0003\bဂ\u0004\tဇ\u0006\nࠞ\u000bЛ\fဇ\u0005", new Object[]{"zzf", "zzg", zzas.zza, "zzh", "zzi", zzam.class, "zzj", zzam.class, "zzk", zzam.class, "zzl", "zzm", "zzn", "zzr", "zzq", zzap.zza, "zzp", zzam.class, "zzo"});
        }
        return Byte.valueOf(this.zzs);
    }

    public final int zzc() {
        return this.zzj.size();
    }

    public final int zzd() {
        return this.zzk.size();
    }

    public final int zze() {
        return this.zzp.size();
    }

    public final long zzf() {
        return this.zzn;
    }

    public final zzat zzh() {
        zzat zzb = zzat.zzb(this.zzg);
        if (zzb == null) {
            return zzat.STRING;
        }
        return zzb;
    }

    public final zzam zzk(int i) {
        return (zzam) this.zzi.get(i);
    }

    public final zzam zzl(int i) {
        return (zzam) this.zzj.get(i);
    }

    public final zzam zzm(int i) {
        return (zzam) this.zzk.get(i);
    }

    public final zzam zzn(int i) {
        return (zzam) this.zzp.get(i);
    }

    public final String zzo() {
        return this.zzm;
    }

    public final String zzp() {
        return this.zzl;
    }

    public final String zzq() {
        return this.zzh;
    }

    public final List zzr() {
        return new zzyc(this.zzq, zzd);
    }

    public final List zzs() {
        return this.zzi;
    }

    public final List zzt() {
        return this.zzp;
    }
}
