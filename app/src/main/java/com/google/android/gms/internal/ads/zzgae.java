package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
public final class zzgae implements FilenameFilter {
    private final Pattern zza;

    public zzgae(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.zza.matcher(str).matches();
    }
}
