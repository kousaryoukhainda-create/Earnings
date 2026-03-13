package com.google.android.gms.safetynet;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
@SafeParcelable.Class(creator = "SafeBrowsingDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class SafeBrowsingData extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<SafeBrowsingData> CREATOR = new zzj();
    private static final String zza = "SafeBrowsingData";
    @SafeParcelable.Field(getter = "getMetadata", id = 2)
    private String zzb;
    @SafeParcelable.Field(getter = "getListsDataHolder", id = 3)
    private DataHolder zzc;
    @SafeParcelable.Field(getter = "getFileDescriptor", id = 4)
    private ParcelFileDescriptor zzd;
    @SafeParcelable.Field(getter = "getLastUpdateTimeMs", id = 5)
    private long zze;
    @SafeParcelable.Field(getter = "getState", id = 6)
    private byte[] zzf;
    private byte[] zzg;
    private File zzh;

    public SafeBrowsingData() {
        this(null, null, null, 0L, null);
    }

    private static final void zza(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public ParcelFileDescriptor getFileDescriptor() {
        return this.zzd;
    }

    public long getLastUpdateTimeMs() {
        return this.zze;
    }

    public DataHolder getListsDataHolder() {
        return this.zzc;
    }

    public String getMetadata() {
        return this.zzb;
    }

    public byte[] getSerializedLists() {
        ParcelFileDescriptor parcelFileDescriptor = this.zzd;
        if (parcelFileDescriptor == null) {
            return null;
        }
        DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
        try {
            byte[] bArr = new byte[dataInputStream.readInt()];
            dataInputStream.read(bArr);
            return bArr;
        } catch (IOException unused) {
            return null;
        } finally {
            zza(dataInputStream);
            this.zzd = null;
        }
    }

    public byte[] getState() {
        return this.zzf;
    }

    public void setSerializedLists(@NonNull byte[] bArr) {
        this.zzg = bArr;
    }

    public void setTempDir(@NonNull File file) {
        if (file != null) {
            this.zzh = file;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r5, int r6) {
        /*
            r4 = this;
            android.os.ParcelFileDescriptor r0 = r4.zzd
            r1 = 0
            if (r0 != 0) goto L69
            byte[] r0 = r4.zzg
            if (r0 == 0) goto L69
            java.io.File r0 = r4.zzh
            if (r0 != 0) goto Lf
        Ld:
            r2 = r1
            goto L41
        Lf:
            java.lang.String r2 = "xlb"
            java.lang.String r3 = ".tmp"
            java.io.File r0 = java.io.File.createTempFile(r2, r3, r0)     // Catch: java.lang.Throwable -> L30 java.io.IOException -> L32
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r3 = android.os.ParcelFileDescriptor.open(r0, r3)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r4.zzd = r3     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            if (r0 == 0) goto L41
            r0.delete()
            goto L41
        L2a:
            r5 = move-exception
            goto L2e
        L2c:
            goto L3b
        L2e:
            r1 = r0
            goto L34
        L30:
            r5 = move-exception
            goto L34
        L32:
            goto L3a
        L34:
            if (r1 == 0) goto L39
            r1.delete()
        L39:
            throw r5
        L3a:
            r0 = r1
        L3b:
            if (r0 == 0) goto Ld
            r0.delete()
            goto Ld
        L41:
            if (r2 == 0) goto L69
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream
            r0.<init>(r2)
            java.io.DataOutputStream r2 = new java.io.DataOutputStream
            r2.<init>(r0)
            byte[] r0 = r4.zzg     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L66
            int r0 = r0.length     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L66
            r2.writeInt(r0)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L66
            byte[] r0 = r4.zzg     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L66
            r2.write(r0)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L66
            zza(r2)
            r6 = r6 | 1
            com.google.android.gms.safetynet.zzj.zza(r4, r5, r6)
            goto L6c
        L61:
            r5 = move-exception
            zza(r2)
            throw r5
        L66:
            zza(r2)
        L69:
            com.google.android.gms.safetynet.zzj.zza(r4, r5, r6)
        L6c:
            r4.zzd = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.safetynet.SafeBrowsingData.writeToParcel(android.os.Parcel, int):void");
    }

    public SafeBrowsingData(long j, @NonNull byte[] bArr) {
        this(null, null, null, j, bArr);
    }

    public SafeBrowsingData(@NonNull String str) {
        this(str, null, null, 0L, null);
    }

    public SafeBrowsingData(@NonNull String str, @NonNull DataHolder dataHolder) {
        this(str, dataHolder, null, 0L, null);
    }

    @SafeParcelable.Constructor
    public SafeBrowsingData(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) DataHolder dataHolder, @SafeParcelable.Param(id = 4) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 5) long j, @SafeParcelable.Param(id = 6) byte[] bArr) {
        this.zzb = str;
        this.zzc = dataHolder;
        this.zzd = parcelFileDescriptor;
        this.zze = j;
        this.zzf = bArr;
    }
}
