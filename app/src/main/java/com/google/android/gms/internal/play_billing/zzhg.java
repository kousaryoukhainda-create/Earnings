package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzhg;
import com.google.android.gms.internal.play_billing.zzhk;
/* loaded from: classes3.dex */
public class zzhg<MessageType extends zzhk<MessageType, BuilderType>, BuilderType extends zzhg<MessageType, BuilderType>> extends zzfu<MessageType, BuilderType> {
    protected zzhk zza;
    private final zzhk zzb;

    public zzhg(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzA()) {
            this.zza = messagetype.zzp();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zza(Object obj, Object obj2) {
        zziu.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfu
    /* renamed from: zzd */
    public final zzhg zzb() {
        zzhg zzhgVar = (zzhg) this.zzb.zzd(5, null, null);
        zzhgVar.zza = zzh();
        return zzhgVar;
    }

    public final zzhg zze(zzhk zzhkVar) {
        if (!this.zzb.equals(zzhkVar)) {
            if (!this.zza.zzA()) {
                zzk();
            }
            zza(this.zza, zzhkVar);
        }
        return this;
    }

    public final MessageType zzf() {
        MessageType zzh = zzh();
        if (zzhk.zzz(zzh, true)) {
            return zzh;
        }
        throw new zzji(zzh);
    }

    @Override // com.google.android.gms.internal.play_billing.zzil
    /* renamed from: zzg */
    public MessageType zzh() {
        if (!this.zza.zzA()) {
            return (MessageType) this.zza;
        }
        this.zza.zzv();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzin
    public final /* bridge */ /* synthetic */ zzim zzi() {
        throw null;
    }

    public final void zzj() {
        if (!this.zza.zzA()) {
            zzk();
        }
    }

    public void zzk() {
        zzhk zzp = this.zzb.zzp();
        zza(zzp, this.zza);
        this.zza = zzp;
    }

    @Override // com.google.android.gms.internal.play_billing.zzin
    public final boolean zzl() {
        return zzhk.zzz(this.zza, false);
    }
}
