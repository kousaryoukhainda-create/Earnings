package com.google.android.gms.tagmanager;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfl implements zzau {
    final /* synthetic */ TagManager zza;

    public zzfl(TagManager tagManager) {
        this.zza = tagManager;
    }

    @Override // com.google.android.gms.tagmanager.zzau
    public final void zza(Map map) {
        Object obj = map.get(DataLayer.EVENT_KEY);
        if (obj != null) {
            TagManager.zzb(this.zza, obj.toString());
        }
    }
}
