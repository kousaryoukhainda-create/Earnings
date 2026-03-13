package com.google.android.gms.internal.p002firebaseauthapi;

import io.flutter.plugins.firebase.auth.Constants;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzma  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzma {
    private static final byte[] zza = new byte[0];
    private final zzmb zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private BigInteger zzf = BigInteger.ZERO;

    private zzma(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzmb zzmbVar) {
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzmbVar;
    }

    public static zzma zza(byte[] bArr, zzmh zzmhVar, zzme zzmeVar, zzmf zzmfVar, zzmb zzmbVar, byte[] bArr2) throws GeneralSecurityException {
        byte[] zza2 = zzmeVar.zza(bArr, zzmhVar);
        byte[] zza3 = zzmn.zza(zzmeVar.zza(), zzmfVar.zzb(), zzmbVar.zzc());
        byte[] bArr3 = zzmn.zzl;
        byte[] bArr4 = zza;
        byte[] zza4 = zzyt.zza(zzmn.zza, zzmfVar.zza(bArr3, bArr4, "psk_id_hash", zza3), zzmfVar.zza(bArr3, bArr2, "info_hash", zza3));
        byte[] zza5 = zzmfVar.zza(zza2, bArr4, Constants.SECRET, zza3);
        byte[] zza6 = zzmfVar.zza(zza5, zza4, io.flutter.plugins.firebase.crashlytics.Constants.KEY, zza3, zzmbVar.zza());
        byte[] zza7 = zzmfVar.zza(zza5, zza4, "base_nonce", zza3, zzmbVar.zzb());
        zzmbVar.zzb();
        BigInteger bigInteger = BigInteger.ONE;
        return new zzma(bArr, zza6, zza7, bigInteger.shiftLeft(96).subtract(bigInteger), zzmbVar);
    }

    private final synchronized byte[] zza() throws GeneralSecurityException {
        byte[] zza2;
        zza2 = zzyt.zza(this.zze, zznh.zza(this.zzf, this.zzb.zzb()));
        if (this.zzf.compareTo(this.zzc) < 0) {
            this.zzf = this.zzf.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return zza2;
    }

    public final byte[] zza(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zza(this.zzd, zza(), bArr, i, bArr2);
    }
}
