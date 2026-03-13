package defpackage;
/* renamed from: ia  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1623ia implements Comparable {
    public int b;
    public C1510h90 c;
    public C1510h90[] d;
    public boolean f;
    public int g;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1623ia c1623ia = (C1623ia) obj;
        if (c1623ia == null) {
            return -1;
        }
        return this.b - c1623ia.b;
    }
}
