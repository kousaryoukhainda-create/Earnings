package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* loaded from: classes3.dex */
public final class zzfrk {
    public static final int zza;
    public static final ClipData zzb;

    static {
        int i;
        if (Build.VERSION.SDK_INT > 22) {
            i = 67108864;
        } else {
            i = 0;
        }
        zza = i;
        zzb = ClipData.newIntent("", new Intent());
    }

    public static PendingIntent zza(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getActivity(context, 0, zzc(intent, 201326592, 0), 201326592);
    }

    public static PendingIntent zzb(Context context, int i, Intent intent, int i2, int i3) {
        return PendingIntent.getService(context, 0, zzc(intent, i2, 0), i2);
    }

    private static Intent zzc(Intent intent, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        if ((i & 88) == 0) {
            z = true;
        } else {
            z = false;
        }
        zzfun.zzf(z, "Cannot set any dangerous parts of intent to be mutable.");
        if ((i & 1) == 0 || zzd(0, 3)) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzfun.zzf(z2, "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        if ((i & 2) == 0 || zzd(0, 5)) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzfun.zzf(z3, "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        if ((i & 4) == 0 || zzd(0, 9)) {
            z4 = true;
        } else {
            z4 = false;
        }
        zzfun.zzf(z4, "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        if ((i & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 || zzd(0, 17)) {
            z5 = true;
        } else {
            z5 = false;
        }
        zzfun.zzf(z5, "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        if (intent.getComponent() != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        zzfun.zzf(z6, "Must set component on Intent.");
        if (zzd(0, 1)) {
            zzfun.zzf(!zzd(i, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !zzd(i, 67108864)) {
                z7 = false;
            }
            zzfun.zzf(z7, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !zzd(i, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zzd(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!zzd(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!zzd(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zzd(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(zzb);
            }
        }
        return intent2;
    }

    private static boolean zzd(int i, int i2) {
        return (i & i2) == i2;
    }
}
