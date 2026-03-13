package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzhy {
    @NotNull
    private List zza = C2968vr.b;

    public final long zza(@NotNull long[] jArr) {
        Iterator it = C0553Qe.s(C2215n5.j(jArr), this.zza).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
            }
            return ((Number) next).longValue();
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public final void zzb(@NotNull long[] jArr) {
        this.zza = C2215n5.j(jArr);
    }
}
