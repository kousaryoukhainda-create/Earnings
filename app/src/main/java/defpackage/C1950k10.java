package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
/* renamed from: k10  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1950k10 extends AbstractC2036l10 {
    public float b;
    public float c;

    @Override // defpackage.AbstractC2036l10
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.b, this.c);
        path.transform(matrix);
    }
}
