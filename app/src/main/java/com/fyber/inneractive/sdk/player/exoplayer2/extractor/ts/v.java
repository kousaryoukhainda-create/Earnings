package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts;

import android.util.SparseArray;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public interface v {

    /* loaded from: classes.dex */
    public static final class a {
        public final String a;
        public final byte[] b;

        public a(String str, int i, byte[] bArr) {
            this.a = str;
            this.b = bArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final String a;
        public final List<a> b;
        public final byte[] c;

        public b(int i, String str, List<a> list, byte[] bArr) {
            List<a> unmodifiableList;
            this.a = str;
            if (list == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.b = unmodifiableList;
            this.c = bArr;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        SparseArray<v> a();

        v a(int i, b bVar);
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final String a;
        public final int b;
        public final int c;
        public int d;
        public String e;

        public d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.a = str;
            this.b = i2;
            this.c = i3;
            this.d = Integer.MIN_VALUE;
        }

        public void a() {
            int i;
            int i2 = this.d;
            if (i2 == Integer.MIN_VALUE) {
                i = this.b;
            } else {
                i = i2 + this.c;
            }
            this.d = i;
            this.e = this.a + this.d;
        }

        public String b() {
            if (this.d != Integer.MIN_VALUE) {
                return this.e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public int c() {
            int i = this.d;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    void a();

    void a(com.fyber.inneractive.sdk.player.exoplayer2.util.k kVar, boolean z);

    void a(com.fyber.inneractive.sdk.player.exoplayer2.util.r rVar, com.fyber.inneractive.sdk.player.exoplayer2.extractor.h hVar, d dVar);
}
