package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zzga extends zzfx {
    @NotNull
    private final zzfz zza;
    @NotNull
    private final String zzb;

    public zzga(@NotNull zzfz zzfzVar, @NotNull String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(@NotNull Object obj, @NotNull Method method, Object[] objArr) {
        List list;
        if (Intrinsics.a(method.getName(), this.zzb)) {
            zzfz zzfzVar = this.zza;
            if (objArr == null || (list = C2043l5.b(objArr)) == null) {
                list = C2968vr.b;
            }
            zzfzVar.zzb(list);
            return true;
        }
        return false;
    }
}
