package defpackage;

import java.util.Iterator;
/* renamed from: ed  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1285ed implements Iterable, RF {
    public final char b;
    public final char c;
    public final int d = 1;

    public AbstractC1285ed(char c, char c2) {
        this.b = c;
        this.c = (char) B10.K(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1371fd(this.b, this.c, this.d);
    }
}
