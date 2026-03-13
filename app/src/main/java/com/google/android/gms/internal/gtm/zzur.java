package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.List;
/* loaded from: classes3.dex */
final class zzur {
    private final zzuq zza;

    private zzur(zzuq zzuqVar) {
        byte[] bArr = zzye.zzd;
        this.zza = zzuqVar;
        zzuqVar.zze = this;
    }

    public static zzur zza(zzuq zzuqVar) {
        zzur zzurVar = zzuqVar.zze;
        if (zzurVar != null) {
            return zzurVar;
        }
        return new zzur(zzuqVar);
    }

    public final void zzA(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzj(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzB(int i, int i2) throws IOException {
        this.zza.zzt(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void zzC(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += zzuq.zzD((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                zzuq zzuqVar = this.zza;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                zzuqVar.zzu((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzuq zzuqVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            zzuqVar2.zzt(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    public final void zzD(int i, long j) throws IOException {
        this.zza.zzv(i, (j >> 63) ^ (j + j));
    }

    public final void zzE(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += zzuq.zzE((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                zzuq zzuqVar = this.zza;
                long longValue2 = ((Long) list.get(i2)).longValue();
                zzuqVar.zzw((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzuq zzuqVar2 = this.zza;
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzuqVar2.zzv(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Deprecated
    public final void zzF(int i) throws IOException {
        this.zza.zzs(i, 3);
    }

    public final void zzG(int i, String str) throws IOException {
        this.zza.zzq(i, str);
    }

    public final void zzH(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof zzyo) {
            zzyo zzyoVar = (zzyo) list;
            while (i2 < list.size()) {
                Object zzf = zzyoVar.zzf(i2);
                if (zzf instanceof String) {
                    this.zza.zzq(i, (String) zzf);
                } else {
                    this.zza.zzM(i, (zzud) zzf);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzq(i, (String) list.get(i2));
            i2++;
        }
    }

    public final void zzI(int i, int i2) throws IOException {
        this.zza.zzt(i, i2);
    }

    public final void zzJ(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuq.zzD(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzu(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzt(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzK(int i, long j) throws IOException {
        this.zza.zzv(i, j);
    }

    public final void zzL(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuq.zzE(((Long) list.get(i4)).longValue());
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzw(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzv(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzb(int i, boolean z) throws IOException {
        this.zza.zzL(i, z);
    }

    public final void zzc(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).getClass();
                i3++;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzK(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzL(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public final void zzd(int i, zzud zzudVar) throws IOException {
        this.zza.zzM(i, zzudVar);
    }

    public final void zze(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzM(i, (zzud) list.get(i2));
        }
    }

    public final void zzf(int i, double d) throws IOException {
        this.zza.zzj(i, Double.doubleToRawLongBits(d));
    }

    public final void zzg(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                i3 += 8;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzj(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzs(i, 4);
    }

    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    public final void zzj(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuq.zzz(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzm(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    public final void zzl(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzm(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }

    public final void zzn(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzj(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzo(int i, float f) throws IOException {
        this.zza.zzh(i, Float.floatToRawIntBits(f));
    }

    public final void zzp(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzh(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public final void zzq(int i, Object obj, zzzt zzztVar) throws IOException {
        zzuq zzuqVar = this.zza;
        zzuqVar.zzs(i, 3);
        zzztVar.zzm((zzzg) obj, zzuqVar.zze);
        zzuqVar.zzs(i, 4);
    }

    public final void zzr(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    public final void zzs(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuq.zzz(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzm(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzt(int i, long j) throws IOException {
        this.zza.zzv(i, j);
    }

    public final void zzu(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzuq.zzE(((Long) list.get(i4)).longValue());
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzw(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzv(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzv(int i, Object obj, zzzt zzztVar) throws IOException {
        this.zza.zzn(i, (zzzg) obj, zzztVar);
    }

    public final void zzw(int i, Object obj) throws IOException {
        if (obj instanceof zzud) {
            this.zza.zzp(i, (zzud) obj);
        } else {
            this.zza.zzo(i, (zzzg) obj);
        }
    }

    public final void zzx(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    public final void zzy(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzs(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            this.zza.zzu(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzz(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }
}
