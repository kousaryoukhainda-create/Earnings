package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
/* loaded from: classes3.dex */
final class zzalc {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzali zzf;
    public final String zzg;
    public final String zzh;
    public final zzalc zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzalc(String str, String str2, long j, long j2, zzali zzaliVar, String[] strArr, String str3, String str4, zzalc zzalcVar) {
        boolean z;
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzaliVar;
        this.zzj = strArr;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.zzc = z;
        this.zzd = j;
        this.zze = j2;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzalcVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzalc zzb(String str, long j, long j2, zzali zzaliVar, String[] strArr, String str2, String str3, zzalc zzalcVar) {
        return new zzalc(str, null, j, j2, zzaliVar, strArr, str2, str3, zzalcVar);
    }

    public static zzalc zzc(String str) {
        return new zzalc(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcm zzcmVar = new zzcm();
            zzcmVar.zzl(new SpannableStringBuilder());
            map.put(str, zzcmVar);
        }
        CharSequence zzq = ((zzcm) map.get(str)).zzq();
        zzq.getClass();
        return (SpannableStringBuilder) zzq;
    }

    private final void zzj(TreeSet treeSet, boolean z) {
        String str = this.zza;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.zzh != null)) {
            long j = this.zzd;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.zze;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                zzalc zzalcVar = (zzalc) this.zzm.get(i);
                boolean z2 = true;
                if (!z && !equals) {
                    z2 = false;
                }
                zzalcVar.zzj(treeSet, z2);
            }
        }
    }

    private final void zzk(long j, String str, List list) {
        String str2;
        if (!"".equals(this.zzg)) {
            str = this.zzg;
        }
        if (zzg(j) && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < zza(); i++) {
            zzd(i).zzk(j, str, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzl(long r18, java.util.Map r20, java.util.Map r21, java.lang.String r22, java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalc.zzl(long, java.util.Map, java.util.Map, java.lang.String, java.util.Map):void");
    }

    private final void zzm(long j, boolean z, String str, Map map) {
        boolean z2;
        this.zzk.clear();
        this.zzl.clear();
        if (!"metadata".equals(this.zza)) {
            if (!"".equals(this.zzg)) {
                str = this.zzg;
            }
            if (this.zzc && z) {
                SpannableStringBuilder zzi = zzi(str, map);
                String str2 = this.zzb;
                str2.getClass();
                zzi.append((CharSequence) str2);
            } else if ("br".equals(this.zza) && z) {
                zzi(str, map).append('\n');
            } else if (zzg(j)) {
                for (Map.Entry entry : map.entrySet()) {
                    CharSequence zzq = ((zzcm) entry.getValue()).zzq();
                    zzq.getClass();
                    this.zzk.put((String) entry.getKey(), Integer.valueOf(zzq.length()));
                }
                boolean equals = "p".equals(this.zza);
                for (int i = 0; i < zza(); i++) {
                    zzalc zzd = zzd(i);
                    if (z || equals) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zzd.zzm(j, z2, str, map);
                }
                if (equals) {
                    SpannableStringBuilder zzi2 = zzi(str, map);
                    int length = zzi2.length();
                    do {
                        length--;
                        if (length < 0) {
                            break;
                        }
                    } while (zzi2.charAt(length) == ' ');
                    if (length >= 0 && zzi2.charAt(length) != '\n') {
                        zzi2.append('\n');
                    }
                }
                for (Map.Entry entry2 : map.entrySet()) {
                    CharSequence zzq2 = ((zzcm) entry2.getValue()).zzq();
                    zzq2.getClass();
                    this.zzl.put((String) entry2.getKey(), Integer.valueOf(zzq2.length()));
                }
            }
        }
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzalc zzd(int i) {
        List list = this.zzm;
        if (list != null) {
            return (zzalc) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j, Map map, Map map2, Map map3) {
        zzala[] zzalaVarArr;
        ArrayList arrayList = new ArrayList();
        zzk(j, this.zzg, arrayList);
        TreeMap treeMap = new TreeMap();
        zzm(j, false, this.zzg, treeMap);
        zzl(j, map, map2, this.zzg, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                zzalg zzalgVar = (zzalg) map2.get(pair.first);
                zzalgVar.getClass();
                zzcm zzcmVar = new zzcm();
                zzcmVar.zzc(decodeByteArray);
                zzcmVar.zzh(zzalgVar.zzb);
                zzcmVar.zzi(0);
                zzcmVar.zze(zzalgVar.zzc, 0);
                zzcmVar.zzf(zzalgVar.zze);
                zzcmVar.zzk(zzalgVar.zzf);
                zzcmVar.zzd(zzalgVar.zzg);
                zzcmVar.zzo(zzalgVar.zzj);
                arrayList2.add(zzcmVar.zzp());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzalg zzalgVar2 = (zzalg) map2.get(entry.getKey());
            zzalgVar2.getClass();
            zzcm zzcmVar2 = (zzcm) entry.getValue();
            CharSequence zzq = zzcmVar2.zzq();
            zzq.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) zzq;
            for (zzala zzalaVar : (zzala[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzala.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzalaVar), spannableStringBuilder.getSpanEnd(zzalaVar), (CharSequence) "");
            }
            int i2 = 0;
            while (i2 < spannableStringBuilder.length()) {
                int i3 = i2 + 1;
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i4 = i3;
                    while (i4 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i4) == ' ') {
                        i4++;
                    }
                    int i5 = i4 - i3;
                    if (i5 > 0) {
                        spannableStringBuilder.delete(i2, i5 + i2);
                    }
                }
                i2 = i3;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i6 = 0;
            while (i6 < spannableStringBuilder.length() - 1) {
                int i7 = i6 + 1;
                if (spannableStringBuilder.charAt(i6) == '\n' && spannableStringBuilder.charAt(i7) == ' ') {
                    spannableStringBuilder.delete(i7, i6 + 2);
                }
                i6 = i7;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i8 = 0;
            while (i8 < spannableStringBuilder.length() - 1) {
                int i9 = i8 + 1;
                if (spannableStringBuilder.charAt(i8) == ' ' && spannableStringBuilder.charAt(i9) == '\n') {
                    spannableStringBuilder.delete(i8, i9);
                }
                i8 = i9;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcmVar2.zze(zzalgVar2.zzc, zzalgVar2.zzd);
            zzcmVar2.zzf(zzalgVar2.zze);
            zzcmVar2.zzh(zzalgVar2.zzb);
            zzcmVar2.zzk(zzalgVar2.zzf);
            zzcmVar2.zzn(zzalgVar2.zzi, zzalgVar2.zzh);
            zzcmVar2.zzo(zzalgVar2.zzj);
            arrayList2.add(zzcmVar2.zzp());
        }
        return arrayList2;
    }

    public final void zzf(zzalc zzalcVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzalcVar);
    }

    public final boolean zzg(long j) {
        long j2 = this.zzd;
        if (j2 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j2 = -9223372036854775807L;
        }
        int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        if (i > 0 || this.zze != -9223372036854775807L) {
            if (j2 != -9223372036854775807L || j >= this.zze) {
                return i <= 0 && j < this.zze;
            }
            return true;
        }
        return true;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }
}
