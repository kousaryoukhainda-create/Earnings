package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzv  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzv {
    private final zzf zza;
    private final zzab zzb;
    private final int zzc;

    private zzv(zzab zzabVar) {
        this(zzabVar, false, zzj.zza, Integer.MAX_VALUE);
    }

    public static zzv zza(char c) {
        final zzh zzhVar = new zzh(c);
        zzw.zza(zzhVar);
        return new zzv(new zzab() { // from class: com.google.android.gms.internal.firebase-auth-api.zzy
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzab
            public final Iterator zza(zzv zzvVar, CharSequence charSequence) {
                return new zzaa(zzvVar, charSequence, zzf.this);
            }
        });
    }

    private zzv(zzab zzabVar, boolean z, zzf zzfVar, int i) {
        this.zzb = zzabVar;
        this.zza = zzfVar;
        this.zzc = Integer.MAX_VALUE;
    }

    public static zzv zza(String str) {
        final zzl zza = zzr.zza(str);
        if (!zza.zza("").zzc()) {
            return new zzv(new zzab() { // from class: com.google.android.gms.internal.firebase-auth-api.zzx
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzab
                public final Iterator zza(zzv zzvVar, CharSequence charSequence) {
                    return new zzz(zzvVar, charSequence, zzl.this.zza(charSequence));
                }
            });
        }
        throw new IllegalArgumentException(zzr.zza("The pattern may not match the empty string: %s", zza));
    }

    public final List<String> zza(CharSequence charSequence) {
        zzw.zza(charSequence);
        Iterator<String> zza = this.zzb.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza.hasNext()) {
            arrayList.add(zza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
