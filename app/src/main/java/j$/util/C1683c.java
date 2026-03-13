package j$.util;

import j$.util.function.Function;
import java.io.Serializable;
import java.util.Comparator;
/* renamed from: j$.util.c  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1683c implements Comparator, Serializable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparator b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C1683c(Comparator comparator, Object obj, int i) {
        this.a = i;
        this.b = comparator;
        this.c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                int compare = this.b.compare(obj, obj2);
                return compare != 0 ? compare : ((Comparator) this.c).compare(obj, obj2);
            default:
                Function function = (Function) this.c;
                return this.b.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
