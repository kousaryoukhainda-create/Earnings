package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: g10  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1408g10 extends AbstractC2122m10 {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Matrix c;

    public C1408g10(ArrayList arrayList, Matrix matrix) {
        this.b = arrayList;
        this.c = matrix;
    }

    @Override // defpackage.AbstractC2122m10
    public final void a(Matrix matrix, C0989c10 c0989c10, int i, Canvas canvas) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((AbstractC2122m10) it.next()).a(this.c, c0989c10, i, canvas);
        }
    }
}
