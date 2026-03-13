package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import androidx.annotation.NonNull;
import java.io.File;
/* loaded from: classes.dex */
public class g implements Comparable<g> {
    public final String a;
    public final long b;
    public final long c;
    public final boolean d;
    public final File e;
    public final long f;

    public g(String str, long j, long j2, long j3, File file) {
        boolean z;
        this.a = str;
        this.b = j;
        this.c = j2;
        if (file != null) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        this.e = file;
        this.f = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(@NonNull g gVar) {
        if (!this.a.equals(gVar.a)) {
            return this.a.compareTo(gVar.a);
        }
        int i = ((this.b - gVar.b) > 0L ? 1 : ((this.b - gVar.b) == 0L ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i < 0) {
            return -1;
        }
        return 1;
    }
}
