package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: wu  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3057wu {
    public final boolean a;
    public final boolean b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Map g;

    public C3057wu(boolean z, boolean z2, Long l, Long l2, Long l3, Long l4) {
        C3054wr extras = C3054wr.b;
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.a = z;
        this.b = z2;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = C2148mJ.j(extras);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        Long l = this.c;
        if (l != null) {
            arrayList.add("byteCount=" + l);
        }
        Long l2 = this.d;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2);
        }
        Long l3 = this.e;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3);
        }
        Long l4 = this.f;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4);
        }
        Map map = this.g;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return C0553Qe.p(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
