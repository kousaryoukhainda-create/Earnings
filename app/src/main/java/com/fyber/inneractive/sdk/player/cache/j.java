package com.fyber.inneractive.sdk.player.cache;
/* loaded from: classes.dex */
public final class j extends b {
    public final boolean b;

    public j(boolean z) {
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad A[Catch: all -> 0x00c5, TryCatch #0 {all -> 0x00c5, blocks: (B:35:0x009c, B:36:0x00a7, B:38:0x00ad, B:40:0x00b9), top: B:59:0x009c }] */
    @Override // com.fyber.inneractive.sdk.player.cache.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fyber.inneractive.sdk.player.cache.b.a a(com.fyber.inneractive.sdk.player.cache.a r7, java.lang.String r8) {
        /*
            r6 = this;
            com.fyber.inneractive.sdk.player.cache.b$a r8 = com.fyber.inneractive.sdk.player.cache.b.a.INVALID
            android.media.MediaPlayer r0 = new android.media.MediaPlayer
            r0.<init>()
            java.io.File r1 = r7.a
            r2 = 0
            if (r1 == 0) goto L89
            boolean r1 = r1.exists()
            if (r1 == 0) goto L89
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6e
            java.io.File r3 = r7.a()     // Catch: java.lang.Throwable -> L6e
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L6e
            java.io.File r3 = r7.a()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.lang.Throwable -> L5c
            r0.setDataSource(r3)     // Catch: java.lang.Throwable -> L5c
            r0.prepare()     // Catch: java.lang.Throwable -> L5c
            int r3 = r0.getDuration()     // Catch: java.lang.Throwable -> L5c
            if (r3 <= 0) goto L81
            com.fyber.inneractive.sdk.player.cache.b$a r8 = com.fyber.inneractive.sdk.player.cache.b.a.OK     // Catch: java.lang.Throwable -> L5c
            int r3 = r0.getVideoWidth()     // Catch: java.lang.Throwable -> L5c
            if (r3 <= 0) goto L5e
            int r3 = r0.getVideoHeight()     // Catch: java.lang.Throwable -> L5c
            if (r3 <= 0) goto L5e
            java.lang.String r3 = "video.width"
            int r4 = r0.getVideoWidth()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L5c
            java.util.Map<java.lang.String, java.lang.String> r5 = r6.a     // Catch: java.lang.Throwable -> L5c
            r5.put(r3, r4)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r3 = "video.height"
            int r4 = r0.getVideoHeight()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L5c
            java.util.Map<java.lang.String, java.lang.String> r5 = r6.a     // Catch: java.lang.Throwable -> L5c
            r5.put(r3, r4)     // Catch: java.lang.Throwable -> L5c
            goto L5e
        L5c:
            r3 = move-exception
            goto L71
        L5e:
            java.lang.String r3 = "video.duration"
            int r4 = r0.getDuration()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L5c
            java.util.Map<java.lang.String, java.lang.String> r5 = r6.a     // Catch: java.lang.Throwable -> L5c
            r5.put(r3, r4)     // Catch: java.lang.Throwable -> L5c
            goto L81
        L6e:
            r1 = move-exception
            r3 = r1
            r1 = 0
        L71:
            java.lang.String r4 = "Exception raised while trying to open a cache candidate"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L7f
            com.fyber.inneractive.sdk.util.IAlog.a(r4, r3, r5)     // Catch: java.lang.Throwable -> L7f
            boolean r3 = r7.c     // Catch: java.lang.Throwable -> L7f
            if (r3 == 0) goto L81
            com.fyber.inneractive.sdk.player.cache.b$a r8 = com.fyber.inneractive.sdk.player.cache.b.a.PARTIAL_CANNOT_VALIDATE     // Catch: java.lang.Throwable -> L7f
            goto L81
        L7f:
            r7 = move-exception
            goto L85
        L81:
            com.fyber.inneractive.sdk.player.cache.m.a(r1)
            goto L89
        L85:
            com.fyber.inneractive.sdk.player.cache.m.a(r1)
            throw r7
        L89:
            r0.release()     // Catch: java.lang.Throwable -> L8c
        L8c:
            boolean r0 = r6.b
            r1 = 1
            r3 = r0 ^ 1
            if (r0 == 0) goto Lcc
            com.fyber.inneractive.sdk.player.cache.b$a r0 = com.fyber.inneractive.sdk.player.cache.b.a.OK
            if (r8 != r0) goto Lcc
            android.media.MediaExtractor r0 = new android.media.MediaExtractor
            r0.<init>()
            java.io.File r4 = r7.a()     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> Lc5
            r0.setDataSource(r4)     // Catch: java.lang.Throwable -> Lc5
        La7:
            int r4 = r0.getTrackCount()     // Catch: java.lang.Throwable -> Lc5
            if (r2 >= r4) goto Lc5
            android.media.MediaFormat r4 = r0.getTrackFormat(r2)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r5 = "mime"
            java.lang.String r4 = r4.getString(r5)     // Catch: java.lang.Throwable -> Lc5
            if (r4 == 0) goto Lc2
            java.lang.String r5 = "video/"
            boolean r4 = r4.startsWith(r5)     // Catch: java.lang.Throwable -> Lc5
            if (r4 == 0) goto Lc2
            goto Lc6
        Lc2:
            int r2 = r2 + 1
            goto La7
        Lc5:
            r1 = r3
        Lc6:
            r0.release()     // Catch: java.lang.Throwable -> Lca
            goto Lcb
        Lca:
        Lcb:
            r3 = r1
        Lcc:
            com.fyber.inneractive.sdk.player.cache.b$a r0 = com.fyber.inneractive.sdk.player.cache.b.a.OK
            if (r8 != r0) goto Ldb
            if (r3 != 0) goto Ldb
            boolean r7 = r7.c
            if (r7 == 0) goto Ld9
            com.fyber.inneractive.sdk.player.cache.b$a r8 = com.fyber.inneractive.sdk.player.cache.b.a.PARTIAL_CANNOT_VALIDATE
            goto Ldb
        Ld9:
            com.fyber.inneractive.sdk.player.cache.b$a r8 = com.fyber.inneractive.sdk.player.cache.b.a.INVALID
        Ldb:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.j.a(com.fyber.inneractive.sdk.player.cache.a, java.lang.String):com.fyber.inneractive.sdk.player.cache.b$a");
    }
}
