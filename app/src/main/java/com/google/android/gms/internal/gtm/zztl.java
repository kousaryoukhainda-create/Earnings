package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zztk;
import com.google.android.gms.internal.gtm.zztl;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes3.dex */
public abstract class zztl<MessageType extends zztl<MessageType, BuilderType>, BuilderType extends zztk<MessageType, BuilderType>> implements zzzg {
    protected int zzb = 0;

    public int zzQ(zzzt zzztVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final zzud zzR() {
        try {
            int zzX = zzX();
            zzud zzudVar = zzud.zzb;
            byte[] bArr = new byte[zzX];
            zzum zzumVar = new zzum(bArr, 0, zzX);
            zzaw(zzumVar);
            if (zzumVar.zzb() == 0) {
                return new zzua(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(AbstractC2437ph.h("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
        }
    }

    public final void zzS(OutputStream outputStream) throws IOException {
        int zzX = zzX();
        int i = zzuq.zzf;
        if (zzX > 4096) {
            zzX = 4096;
        }
        zzuo zzuoVar = new zzuo(outputStream, zzX);
        zzaw(zzuoVar);
        zzuoVar.zzJ();
    }
}
