package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes3.dex */
public final class zzaqi implements zzaow {
    private final zzaqh zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzaqi(zzaqh zzaqhVar, int i) {
        this.zzc = zzaqhVar;
    }

    public static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    public static long zzf(InputStream inputStream) throws IOException {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((zzn(inputStream) & 255) << 56);
    }

    public static String zzh(zzaqg zzaqgVar) throws IOException {
        return new String(zzm(zzaqgVar, zzf(zzaqgVar)), "UTF-8");
    }

    public static void zzj(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    public static void zzk(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) j);
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static byte[] zzm(zzaqg zzaqgVar, long j) throws IOException {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        long zza = zzaqgVar.zza();
        if (i >= 0 && j <= zza) {
            int i2 = (int) j;
            if (i2 == j) {
                byte[] bArr = new byte[i2];
                new DataInputStream(zzaqgVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder k = AbstractC0324Hi.k(j, "streamToBytes length=", ", maxLength=");
        k.append(zza);
        throw new IOException(k.toString());
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzaqf zzaqfVar) {
        if (!this.zza.containsKey(str)) {
            this.zzb += zzaqfVar.zza;
        } else {
            this.zzb = (zzaqfVar.zza - ((zzaqf) this.zza.get(str)).zza) + this.zzb;
        }
        this.zza.put(str, zzaqfVar);
    }

    private final void zzp(String str) {
        zzaqf zzaqfVar = (zzaqf) this.zza.remove(str);
        if (zzaqfVar != null) {
            this.zzb -= zzaqfVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final synchronized zzaov zza(String str) {
        zzaqf zzaqfVar = (zzaqf) this.zza.get(str);
        if (zzaqfVar == null) {
            return null;
        }
        File zzg = zzg(str);
        try {
            zzaqg zzaqgVar = new zzaqg(new BufferedInputStream(new FileInputStream(zzg)), zzg.length());
            try {
                zzaqf zza = zzaqf.zza(zzaqgVar);
                if (!TextUtils.equals(str, zza.zzb)) {
                    zzapy.zza("%s: key=%s, found=%s", zzg.getAbsolutePath(), str, zza.zzb);
                    zzp(str);
                    return null;
                }
                byte[] zzm = zzm(zzaqgVar, zzaqgVar.zza());
                zzaov zzaovVar = new zzaov();
                zzaovVar.zza = zzm;
                zzaovVar.zzb = zzaqfVar.zzc;
                zzaovVar.zzc = zzaqfVar.zzd;
                zzaovVar.zzd = zzaqfVar.zze;
                zzaovVar.zze = zzaqfVar.zzf;
                zzaovVar.zzf = zzaqfVar.zzg;
                List<zzape> list = zzaqfVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzape zzapeVar : list) {
                    treeMap.put(zzapeVar.zza(), zzapeVar.zzb());
                }
                zzaovVar.zzg = treeMap;
                zzaovVar.zzh = Collections.unmodifiableList(zzaqfVar.zzh);
                return zzaovVar;
            } finally {
                zzaqgVar.close();
            }
        } catch (IOException e) {
            zzapy.zza("%s: %s", zzg.getAbsolutePath(), e.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final synchronized void zzb() {
        synchronized (this) {
            File zza = this.zzc.zza();
            if (!zza.exists()) {
                if (!zza.mkdirs()) {
                    zzapy.zzb("Unable to create cache dir %s", zza.getAbsolutePath());
                }
            } else {
                File[] listFiles = zza.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        try {
                            long length = file.length();
                            zzaqg zzaqgVar = new zzaqg(new BufferedInputStream(new FileInputStream(file)), length);
                            try {
                                zzaqf zza2 = zzaqf.zza(zzaqgVar);
                                zza2.zza = length;
                                zzo(zza2.zzb, zza2);
                                zzaqgVar.close();
                            } catch (Throwable th) {
                                zzaqgVar.close();
                                throw th;
                                break;
                            }
                        } catch (IOException unused) {
                            file.delete();
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final synchronized void zzc(String str, boolean z) {
        zzaov zza = zza(str);
        if (zza != null) {
            zza.zzf = 0L;
            zza.zze = 0L;
            zzd(str, zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaow
    public final synchronized void zzd(String str, zzaov zzaovVar) {
        int i;
        try {
            long j = this.zzb;
            int length = zzaovVar.zza.length;
            long j2 = j + length;
            int i2 = this.zzd;
            if (j2 <= i2 || length <= i2 * 0.9f) {
                File zzg = zzg(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(zzg));
                    zzaqf zzaqfVar = new zzaqf(str, zzaovVar);
                    try {
                        zzj(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzaqfVar.zzb);
                        String str2 = zzaqfVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzk(bufferedOutputStream, zzaqfVar.zzd);
                        zzk(bufferedOutputStream, zzaqfVar.zze);
                        zzk(bufferedOutputStream, zzaqfVar.zzf);
                        zzk(bufferedOutputStream, zzaqfVar.zzg);
                        List<zzape> list = zzaqfVar.zzh;
                        if (list != null) {
                            zzj(bufferedOutputStream, list.size());
                            for (zzape zzapeVar : list) {
                                zzl(bufferedOutputStream, zzapeVar.zza());
                                zzl(bufferedOutputStream, zzapeVar.zzb());
                            }
                        } else {
                            zzj(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzaovVar.zza);
                        bufferedOutputStream.close();
                        zzaqfVar.zza = zzg.length();
                        zzo(str, zzaqfVar);
                        if (this.zzb >= this.zzd) {
                            if (zzapy.zzb) {
                                zzapy.zzd("Pruning old cache entries.", new Object[0]);
                            }
                            long j3 = this.zzb;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i3 = 0;
                            while (it.hasNext()) {
                                zzaqf zzaqfVar2 = (zzaqf) ((Map.Entry) it.next()).getValue();
                                if (zzg(zzaqfVar2.zzb).delete()) {
                                    this.zzb -= zzaqfVar2.zza;
                                    i = 1;
                                } else {
                                    String str3 = zzaqfVar2.zzb;
                                    String zzq = zzq(str3);
                                    i = 1;
                                    zzapy.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq);
                                }
                                it.remove();
                                i3 += i;
                                if (((float) this.zzb) < this.zzd * 0.9f) {
                                    break;
                                }
                            }
                            if (zzapy.zzb) {
                                zzapy.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i3), Long.valueOf(this.zzb - j3), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            }
                        }
                    } catch (IOException e) {
                        zzapy.zza("%s", e.toString());
                        bufferedOutputStream.close();
                        zzapy.zza("Failed to write header for %s", zzg.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!zzg.delete()) {
                        zzapy.zza("Could not clean up file %s", zzg.getAbsolutePath());
                    }
                    if (!this.zzc.zza().exists()) {
                        zzapy.zza("Re-initializing cache after external clearing.", new Object[0]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzb();
                    }
                }
            }
        } finally {
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean delete = zzg(str).delete();
        zzp(str);
        if (!delete) {
            zzapy.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
        }
    }

    public zzaqi(File file, int i) {
        this.zzc = new zzaqe(this, file);
    }
}
