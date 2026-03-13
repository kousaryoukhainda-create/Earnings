package j$.util.concurrent;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class r extends l {
    r e;
    r f;
    r g;
    r h;
    boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(int i, Object obj, Object obj2, l lVar, r rVar) {
        super(i, obj, obj2, lVar);
        this.e = rVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(Object obj, int i) {
        return b(i, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r b(int i, Object obj, Class cls) {
        if (obj != null) {
            r rVar = this;
            do {
                r rVar2 = rVar.f;
                r rVar3 = rVar.g;
                int i2 = rVar.a;
                if (i2 <= i) {
                    if (i2 >= i) {
                        Object obj2 = rVar.b;
                        if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                            return rVar;
                        }
                        if (rVar2 != null) {
                            if (rVar3 != null) {
                                if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                                    int i3 = ConcurrentHashMap.g;
                                    int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                    if (compareTo != 0) {
                                        if (compareTo >= 0) {
                                            rVar2 = rVar3;
                                        }
                                    }
                                }
                                r b = rVar3.b(i, obj, cls);
                                if (b != null) {
                                    return b;
                                }
                            }
                        }
                    }
                    rVar = rVar3;
                    continue;
                }
                rVar = rVar2;
                continue;
            } while (rVar != null);
            return null;
        }
        return null;
    }
}
