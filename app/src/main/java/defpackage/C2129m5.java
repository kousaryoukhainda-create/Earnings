package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: m5  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2129m5 implements NZ {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C2129m5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ui, java.util.Iterator, java.lang.Object, OZ] */
    @Override // defpackage.NZ
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                Object[] array = (Object[]) this.b;
                Intrinsics.checkNotNullParameter(array, "array");
                return new H(array);
            case 1:
                return ((Iterable) this.b).iterator();
            case 2:
                return new WG(this);
            case 3:
                C1886jF block = (C1886jF) this.b;
                Intrinsics.checkNotNullParameter(block, "block");
                ?? obj = new Object();
                obj.d = B10.A(obj, obj, block);
                return obj;
            case 4:
                return (Iterator) this.b;
            default:
                return new VG((String) this.b);
        }
    }

    public C2129m5(BufferedReader reader) {
        this.a = 2;
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.b = reader;
    }
}
