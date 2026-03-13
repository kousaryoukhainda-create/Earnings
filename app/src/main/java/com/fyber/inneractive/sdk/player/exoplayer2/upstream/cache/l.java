package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class l extends g {
    public static final Pattern g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public l(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    public static File a(File file, int i2, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, BK.n(sb, j2, ".v3.exo"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
        if (r1 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
        if (r16.renameTo(r1) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l a(java.io.File r16, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i r17) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l.a(java.io.File, com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i):com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l");
    }
}
