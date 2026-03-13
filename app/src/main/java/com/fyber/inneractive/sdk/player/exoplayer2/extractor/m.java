package com.fyber.inneractive.sdk.player.exoplayer2.extractor;
/* loaded from: classes.dex */
public interface m {

    /* loaded from: classes.dex */
    public static final class a implements m {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public long a(long j) {
            return 0L;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public long c() {
            return this.a;
        }

        @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.m
        public boolean a() {
            return false;
        }
    }

    long a(long j);

    boolean a();

    long c();
}
