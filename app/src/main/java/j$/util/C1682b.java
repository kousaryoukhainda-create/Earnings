package j$.util;

import j$.util.function.Function;
import j$.util.function.m0;
import j$.util.function.p0;
import j$.util.function.s0;
import java.io.Serializable;
import java.util.Comparator;
/* renamed from: j$.util.b  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1682b implements Comparator, Serializable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C1682b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                p0 p0Var = (p0) this.b;
                return j$.com.android.tools.r8.a.d(p0Var.applyAsInt(obj), p0Var.applyAsInt(obj2));
            case 1:
                m0 m0Var = (m0) this.b;
                return Double.compare(m0Var.applyAsDouble(obj), m0Var.applyAsDouble(obj2));
            case 2:
                Function function = (Function) this.b;
                return ((Comparable) function.apply(obj)).compareTo(function.apply(obj2));
            default:
                s0 s0Var = (s0) this.b;
                return j$.com.android.tools.r8.a.e(s0Var.applyAsLong(obj), s0Var.applyAsLong(obj2));
        }
    }
}
