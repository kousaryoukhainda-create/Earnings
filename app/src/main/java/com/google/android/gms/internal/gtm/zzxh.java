package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.List;
import java.util.Map;
/* loaded from: classes3.dex */
final class zzxh extends zzxg {
    @Override // com.google.android.gms.internal.gtm.zzxg
    public final int zza(Map.Entry entry) {
        return ((zzxs) entry.getKey()).zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    public final zzxk zzb(Object obj) {
        return ((zzxr) obj).zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    public final zzxk zzc(Object obj) {
        return ((zzxr) obj).zzT();
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    public final Object zzd(zzxf zzxfVar, zzzg zzzgVar, int i) {
        return zzxfVar.zzb(zzzgVar, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0152, code lost:
        if (r4 != 10) goto L17;
     */
    @Override // com.google.android.gms.internal.gtm.zzxg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zze(java.lang.Object r3, com.google.android.gms.internal.gtm.zzzs r4, java.lang.Object r5, com.google.android.gms.internal.gtm.zzxf r6, com.google.android.gms.internal.gtm.zzxk r7, java.lang.Object r8, com.google.android.gms.internal.gtm.zzaak r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzxh.zze(java.lang.Object, com.google.android.gms.internal.gtm.zzzs, java.lang.Object, com.google.android.gms.internal.gtm.zzxf, com.google.android.gms.internal.gtm.zzxk, java.lang.Object, com.google.android.gms.internal.gtm.zzaak):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    public final void zzf(Object obj) {
        ((zzxr) obj).zza.zzi();
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    public final void zzg(zzzs zzzsVar, Object obj, zzxf zzxfVar, zzxk zzxkVar) throws IOException {
        zzxt zzxtVar = (zzxt) obj;
        zzxkVar.zzk(zzxtVar.zzd, zzzsVar.zzs(zzxtVar.zzc.getClass(), zzxfVar));
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    public final void zzh(zzud zzudVar, Object obj, zzxf zzxfVar, zzxk zzxkVar) throws IOException {
        zzua zzuaVar = (zzua) zzudVar;
        byte[] bArr = zzuaVar.zza;
        zzxt zzxtVar = (zzxt) obj;
        zzzf zzau = zzxtVar.zzc.zzau();
        zzuj zzH = zzuj.zzH(bArr, 0, zzuaVar.zzd(), true);
        zzau.zzy(zzH, zzxfVar);
        zzxkVar.zzk(zzxtVar.zzd, zzau.zzE());
        zzH.zzz(0);
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    public final boolean zzi(zzzg zzzgVar) {
        return zzzgVar instanceof zzxr;
    }

    @Override // com.google.android.gms.internal.gtm.zzxg
    public final void zzj(zzur zzurVar, Map.Entry entry) throws IOException {
        zzxs zzxsVar = (zzxs) entry.getKey();
        if (zzxsVar.zzd) {
            zzaba zzabaVar = zzaba.zza;
            switch (zzxsVar.zzc.ordinal()) {
                case 0:
                    zzzv.zzw(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                    return;
                case 1:
                    zzzv.zzA(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                    return;
                case 2:
                    zzzv.zzD(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                    return;
                case 3:
                    zzzv.zzL(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                    return;
                case 4:
                    zzzv.zzC(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                    return;
                case 5:
                    zzzv.zzz(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                    return;
                case 6:
                    zzzv.zzy(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                    return;
                case 7:
                    zzzv.zzu(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                    return;
                case 8:
                    zzzv.zzJ(zzxsVar.zzb, (List) entry.getValue(), zzurVar);
                    return;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        zzzv.zzB(zzxsVar.zzb, (List) entry.getValue(), zzurVar, zzzp.zza().zzb(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        zzzv.zzE(zzxsVar.zzb, (List) entry.getValue(), zzurVar, zzzp.zza().zzb(list2.get(0).getClass()));
                        return;
                    }
                    return;
                case 11:
                    zzzv.zzv(zzxsVar.zzb, (List) entry.getValue(), zzurVar);
                    return;
                case 12:
                    zzzv.zzK(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                    return;
                case 13:
                    zzzv.zzC(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                    return;
                case 14:
                    zzzv.zzF(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                    return;
                case 15:
                    zzzv.zzG(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                    return;
                case 16:
                    zzzv.zzH(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                    return;
                case 17:
                    zzzv.zzI(zzxsVar.zzb, (List) entry.getValue(), zzurVar, false);
                    return;
                default:
                    return;
            }
        }
        zzaba zzabaVar2 = zzaba.zza;
        switch (zzxsVar.zzc.ordinal()) {
            case 0:
                zzurVar.zzf(zzxsVar.zzb, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzurVar.zzo(zzxsVar.zzb, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzurVar.zzt(zzxsVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzurVar.zzK(zzxsVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzurVar.zzr(zzxsVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzurVar.zzm(zzxsVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzurVar.zzk(zzxsVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzurVar.zzb(zzxsVar.zzb, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzurVar.zzG(zzxsVar.zzb, (String) entry.getValue());
                return;
            case 9:
                zzurVar.zzq(zzxsVar.zzb, entry.getValue(), zzzp.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzurVar.zzv(zzxsVar.zzb, entry.getValue(), zzzp.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzurVar.zzd(zzxsVar.zzb, (zzud) entry.getValue());
                return;
            case 12:
                zzurVar.zzI(zzxsVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzurVar.zzr(zzxsVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzurVar.zzx(zzxsVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzurVar.zzz(zzxsVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzurVar.zzB(zzxsVar.zzb, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzurVar.zzD(zzxsVar.zzb, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
