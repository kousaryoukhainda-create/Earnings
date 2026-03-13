package com.google.android.gms.internal.gtm;

import java.io.IOException;
/* loaded from: classes3.dex */
public class zzyg extends IOException {
    private zzzg zza;
    private boolean zzb;

    public zzyg(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    public static zzyf zza() {
        return new zzyf("Protocol message tag had invalid wire type.");
    }

    public static zzyg zzb() {
        return new zzyg("Protocol message end-group tag did not match expected tag.");
    }

    public static zzyg zzc() {
        return new zzyg("Protocol message contained an invalid tag (zero).");
    }

    public static zzyg zzd() {
        return new zzyg("Protocol message had invalid UTF-8.");
    }

    public static zzyg zze() {
        return new zzyg("CodedInputStream encountered a malformed varint.");
    }

    public static zzyg zzf() {
        return new zzyg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzyg zzg() {
        return new zzyg("Failed to parse the message.");
    }

    public static zzyg zzi() {
        return new zzyg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static zzyg zzj() {
        return new zzyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzyg zzh(zzzg zzzgVar) {
        this.zza = zzzgVar;
        return this;
    }

    public final void zzk() {
        this.zzb = true;
    }

    public final boolean zzl() {
        return this.zzb;
    }

    public zzyg(String str) {
        super(str);
        this.zza = null;
    }
}
