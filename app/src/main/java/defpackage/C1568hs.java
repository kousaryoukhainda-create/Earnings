package defpackage;

import androidx.media3.extractor.metadata.emsg.EventMessage;
/* renamed from: hs  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1568hs {
    public final EventMessage[] a;
    public final long[] b;
    public final String c;
    public final String d;

    public C1568hs(String str, String str2, long[] jArr, EventMessage[] eventMessageArr) {
        this.c = str;
        this.d = str2;
        this.b = jArr;
        this.a = eventMessageArr;
    }

    public final String a() {
        return this.c + "/" + this.d;
    }
}
