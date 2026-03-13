package defpackage;

import androidx.media3.common.StreamKey;
import androidx.media3.common.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: u30  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2813u30 implements InterfaceC0621Su {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final C2641s30 e;
    public final C2727t30[] f;
    public final long g;
    public final long h;

    public C2813u30(int i, int i2, long j, long j2, int i3, boolean z, C2641s30 c2641s30, C2727t30[] c2727t30Arr) {
        this.a = i;
        this.b = i2;
        this.g = j;
        this.h = j2;
        this.c = i3;
        this.d = z;
        this.e = c2641s30;
        this.f = c2727t30Arr;
    }

    @Override // defpackage.InterfaceC0621Su
    public final Object a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C2727t30 c2727t30 = null;
        int i = 0;
        while (i < arrayList.size()) {
            StreamKey streamKey = (StreamKey) arrayList.get(i);
            C2727t30 c2727t302 = this.f[streamKey.c];
            if (c2727t302 != c2727t30 && c2727t30 != null) {
                arrayList2.add(c2727t30.a((b[]) arrayList3.toArray(new b[0])));
                arrayList3.clear();
            }
            arrayList3.add(c2727t302.j[streamKey.d]);
            i++;
            c2727t30 = c2727t302;
        }
        if (c2727t30 != null) {
            arrayList2.add(c2727t30.a((b[]) arrayList3.toArray(new b[0])));
        }
        long j = this.h;
        int i2 = this.c;
        return new C2813u30(this.a, this.b, this.g, j, i2, this.d, this.e, (C2727t30[]) arrayList2.toArray(new C2727t30[0]));
    }
}
