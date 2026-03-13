package defpackage;

import android.media.AudioTrack;
/* renamed from: x6  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3076x6 {
    public final C2990w6 a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public C3076x6(AudioTrack audioTrack) {
        this.a = new C2990w6(audioTrack);
        a();
    }

    public final void a() {
        if (this.a != null) {
            b(0);
        }
    }

    public final void b(int i) {
        this.b = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        this.d = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.d = 10000000L;
                return;
            }
            this.d = 10000L;
            return;
        }
        this.e = 0L;
        this.f = -1L;
        this.c = System.nanoTime() / 1000;
        this.d = 10000L;
    }
}
