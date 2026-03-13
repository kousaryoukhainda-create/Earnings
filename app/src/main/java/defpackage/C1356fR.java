package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: fR  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1356fR {
    public final String a;
    public final long b;
    public final List c;
    public final List d;

    public C1356fR(String str, long j, ArrayList arrayList, List list) {
        this.a = str;
        this.b = j;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(list);
    }
}
