package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
/* renamed from: n10  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2208n10 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();

    public C2208n10() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.d;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.b;
        float f5 = this.c;
        C1864j10 c1864j10 = new C1864j10(f4, f5, f4, f5);
        c1864j10.f = this.d;
        c1864j10.g = f3;
        this.g.add(new C1494h10(c1864j10));
        this.d = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2036l10) arrayList.get(i)).a(matrix, path);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l10, java.lang.Object, k10] */
    public final void c(float f, float f2) {
        ?? abstractC2036l10 = new AbstractC2036l10();
        abstractC2036l10.b = f;
        abstractC2036l10.c = f2;
        this.f.add(abstractC2036l10);
        C1580i10 c1580i10 = new C1580i10(abstractC2036l10, this.b, this.c);
        a(c1580i10.b() + 270.0f);
        this.g.add(c1580i10);
        this.d = c1580i10.b() + 270.0f;
        this.b = f;
        this.c = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.a = f;
        this.b = 0.0f;
        this.c = f;
        this.d = f2;
        this.e = (f2 + f3) % 360.0f;
        this.f.clear();
        this.g.clear();
    }
}
