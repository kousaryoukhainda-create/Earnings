package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
/* loaded from: classes3.dex */
final class zzbry implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrz zza;

    public zzbry(zzbrz zzbrzVar) {
        this.zza = zzbrzVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzh("Operation denied by user.");
    }
}
