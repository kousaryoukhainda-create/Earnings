package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import com.fyber.inneractive.sdk.player.exoplayer2.i;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class a extends c {
    public final List<C0089a> b;
    public final List<C0089a> c;
    public final List<C0089a> d;
    public final i e;
    public final List<i> f;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0089a {
        public final String a;
        public final i b;

        public C0089a(String str, i iVar) {
            this.a = str;
            this.b = iVar;
        }
    }

    public a(String str, List<C0089a> list, List<C0089a> list2, List<C0089a> list3, i iVar, List<i> list4) {
        super(str);
        List<i> list5;
        this.b = Collections.unmodifiableList(list);
        this.c = Collections.unmodifiableList(list2);
        this.d = Collections.unmodifiableList(list3);
        this.e = iVar;
        if (list4 != null) {
            list5 = Collections.unmodifiableList(list4);
        } else {
            list5 = null;
        }
        this.f = list5;
    }
}
