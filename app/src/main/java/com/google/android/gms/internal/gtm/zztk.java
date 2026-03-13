package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zztk;
import com.google.android.gms.internal.gtm.zztl;
import java.io.IOException;
/* loaded from: classes3.dex */
public abstract class zztk<MessageType extends zztl<MessageType, BuilderType>, BuilderType extends zztk<MessageType, BuilderType>> implements zzzf {
    @Override // 
    /* renamed from: zzv */
    public abstract zztk clone();

    public abstract zztk zzw(zztl zztlVar);

    @Override // com.google.android.gms.internal.gtm.zzzf
    public final /* bridge */ /* synthetic */ zzzf zzx(zzzg zzzgVar) {
        if (zzax().getClass().isInstance(zzzgVar)) {
            return zzw((zztl) zzzgVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // com.google.android.gms.internal.gtm.zzzf
    public /* bridge */ /* synthetic */ zzzf zzy(zzuj zzujVar, zzxf zzxfVar) throws IOException {
        throw null;
    }
}
