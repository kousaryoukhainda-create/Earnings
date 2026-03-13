package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.auth.PhoneAuthCredential;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafu  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzafu {
    private static final Logger zza = new Logger("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    private final HashMap<String, zzagb> zzd = new HashMap<>();

    public zzafu(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzb = context;
        this.zzc = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(String str) {
        zzagb zzagbVar = this.zzd.get(str);
        if (zzagbVar == null) {
            return;
        }
        if (!zzagbVar.zzi) {
            zzd(str);
        }
        zzb(str);
    }

    public final String zzb() {
        SigningInfo signingInfo;
        Signature[] apkContentsSigners;
        try {
            String packageName = this.zzb.getPackageName();
            if (Build.VERSION.SDK_INT >= 28) {
                signingInfo = Wrappers.packageManager(this.zzb).getPackageInfo(packageName, 134217728).signingInfo;
                apkContentsSigners = signingInfo.getApkContentsSigners();
            } else {
                apkContentsSigners = Wrappers.packageManager(this.zzb).getPackageInfo(packageName, 64).signatures;
            }
            String zza2 = zza(packageName, apkContentsSigners[0].toCharsString());
            if (zza2 != null) {
                return zza2;
            }
            zza.e("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            zza.e("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd(String str) {
        zzagb zzagbVar = this.zzd.get(str);
        if (zzagbVar == null || zzagbVar.zzh || zzae.zzc(zzagbVar.zzd)) {
            return;
        }
        zza.w("Timed out waiting for SMS.", new Object[0]);
        for (zzaeg zzaegVar : zzagbVar.zzb) {
            zzaegVar.zza(zzagbVar.zzd);
        }
        zzagbVar.zzi = true;
    }

    public final boolean zzc(String str) {
        return this.zzd.get(str) != null;
    }

    public final zzaeg zza(zzaeg zzaegVar, String str) {
        return new zzafz(this, zzaegVar, str);
    }

    public static String zza(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    private static String zza(String str, String str2) {
        String g = AbstractC0324Hi.g(str, " ", str2);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(g.getBytes(StandardCharsets.UTF_8));
            String substring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            Logger logger = zza;
            logger.d("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e) {
            zza.e(AbstractC2437ph.g("NoSuchAlgorithm: ", e.getMessage()), new Object[0]);
            return null;
        }
    }

    public static /* synthetic */ void zzb(zzafu zzafuVar, String str) {
        zzagb zzagbVar = zzafuVar.zzd.get(str);
        if (zzagbVar == null || zzae.zzc(zzagbVar.zzd) || zzae.zzc(zzagbVar.zze) || zzagbVar.zzb.isEmpty()) {
            return;
        }
        for (zzaeg zzaegVar : zzagbVar.zzb) {
            zzaegVar.zza(PhoneAuthCredential.z(zzagbVar.zzd, zzagbVar.zze));
        }
        zzagbVar.zzh = true;
    }

    public final void zzb(zzaeg zzaegVar, String str) {
        zzagb zzagbVar = this.zzd.get(str);
        if (zzagbVar == null) {
            return;
        }
        zzagbVar.zzb.add(zzaegVar);
        if (zzagbVar.zzg) {
            zzaegVar.zzb(zzagbVar.zzd);
        }
        if (zzagbVar.zzh) {
            zzaegVar.zza(PhoneAuthCredential.z(zzagbVar.zzd, zzagbVar.zze));
        }
        if (zzagbVar.zzi) {
            zzaegVar.zza(zzagbVar.zzd);
        }
    }

    public final void zza(final String str, zzaeg zzaegVar, long j, boolean z) {
        this.zzd.put(str, new zzagb(j, z));
        zzb(zzaegVar, str);
        zzagb zzagbVar = this.zzd.get(str);
        if (zzagbVar.zza <= 0) {
            zza.w("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzagbVar.zzf = this.zzc.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.zzafx
            @Override // java.lang.Runnable
            public final void run() {
                zzafu.this.zze(str);
            }
        }, zzagbVar.zza, TimeUnit.SECONDS);
        if (!zzagbVar.zzc) {
            zza.w("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzafy zzafyVar = new zzafy(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
        AbstractC2525qi.registerReceiver(this.zzb.getApplicationContext(), zzafyVar, intentFilter, 2);
        SmsRetriever.getClient(this.zzb).startSmsRetriever().addOnFailureListener(new zzafw(this));
    }

    public final void zzb(String str) {
        zzagb zzagbVar = this.zzd.get(str);
        if (zzagbVar == null) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = zzagbVar.zzf;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            zzagbVar.zzf.cancel(false);
        }
        zzagbVar.zzb.clear();
        this.zzd.remove(str);
    }
}
