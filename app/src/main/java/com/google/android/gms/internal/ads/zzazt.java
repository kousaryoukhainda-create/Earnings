package com.google.android.gms.internal.ads;

import java.util.PriorityQueue;
/* loaded from: classes3.dex */
public final class zzazt {
    public static long zza(long j, int i) {
        if (i == 1) {
            return j;
        }
        int i2 = i >> 1;
        long j2 = (j * j) % 1073807359;
        return (i & 1) == 0 ? zza(j2, i2) % 1073807359 : ((zza(j2, i2) % 1073807359) * j) % 1073807359;
    }

    public static String zzb(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    public static void zzc(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzd(i, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr, 0, 6);
        zzd(i, zze, zzb(strArr, 0, 6), 6, priorityQueue);
        int i3 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i3 < length2 - 5) {
                String zzb = zzb(strArr, i3, 6);
                long zza = (zzazp.zza(strArr[i3 + 5]) + 2147483647L) % 1073807359;
                zze = (zza + (((((zze + 1073807359) - ((((zzazp.zza(strArr[i3 - 1]) + 2147483647L) % 1073807359) * zza(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
                zzd(i, zze, zzb, length2, priorityQueue);
                i3++;
            } else {
                return;
            }
        }
    }

    public static void zzd(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        zzazs zzazsVar = new zzazs(j, str, i2);
        if ((priorityQueue.size() != i || (((zzazs) priorityQueue.peek()).zzc <= zzazsVar.zzc && ((zzazs) priorityQueue.peek()).zza <= zzazsVar.zza)) && !priorityQueue.contains(zzazsVar)) {
            priorityQueue.add(zzazsVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i, int i2) {
        long zza = (zzazp.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            zza = (((zzazp.zza(strArr[i3]) + 2147483647L) % 1073807359) + ((zza * 16785407) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
