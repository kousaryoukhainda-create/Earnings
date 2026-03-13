package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* renamed from: e10  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1236e10 {
    public AbstractC1906jZ a = new Object();
    public AbstractC1906jZ b = new Object();
    public AbstractC1906jZ c = new Object();
    public AbstractC1906jZ d = new Object();
    public InterfaceC0298Gi e = new C2462q(0.0f);
    public InterfaceC0298Gi f = new C2462q(0.0f);
    public InterfaceC0298Gi g = new C2462q(0.0f);
    public InterfaceC0298Gi h = new C2462q(0.0f);
    public C0539Pq i = new C0539Pq(0);
    public C0539Pq j = new C0539Pq(0);
    public C0539Pq k = new C0539Pq(0);
    public C0539Pq l = new C0539Pq(0);

    public static C1151d10 a(Context context, int i, int i2, C2462q c2462q) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC3018wU.t);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            InterfaceC0298Gi c = c(obtainStyledAttributes, 5, c2462q);
            InterfaceC0298Gi c2 = c(obtainStyledAttributes, 8, c);
            InterfaceC0298Gi c3 = c(obtainStyledAttributes, 9, c);
            InterfaceC0298Gi c4 = c(obtainStyledAttributes, 7, c);
            InterfaceC0298Gi c5 = c(obtainStyledAttributes, 6, c);
            C1151d10 c1151d10 = new C1151d10();
            AbstractC1906jZ r = AbstractC1906jZ.r(i4);
            c1151d10.a = r;
            C1151d10.b(r);
            c1151d10.e = c2;
            AbstractC1906jZ r2 = AbstractC1906jZ.r(i5);
            c1151d10.b = r2;
            C1151d10.b(r2);
            c1151d10.f = c3;
            AbstractC1906jZ r3 = AbstractC1906jZ.r(i6);
            c1151d10.c = r3;
            C1151d10.b(r3);
            c1151d10.g = c4;
            AbstractC1906jZ r4 = AbstractC1906jZ.r(i7);
            c1151d10.d = r4;
            C1151d10.b(r4);
            c1151d10.h = c5;
            return c1151d10;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static C1151d10 b(Context context, AttributeSet attributeSet, int i, int i2) {
        C2462q c2462q = new C2462q(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC3018wU.n, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, c2462q);
    }

    public static InterfaceC0298Gi c(TypedArray typedArray, int i, InterfaceC0298Gi interfaceC0298Gi) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return interfaceC0298Gi;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C2462q(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new MV(peekValue.getFraction(1.0f, 1.0f));
        }
        return interfaceC0298Gi;
    }

    public final boolean d(RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.l.getClass().equals(C0539Pq.class) && this.j.getClass().equals(C0539Pq.class) && this.i.getClass().equals(C0539Pq.class) && this.k.getClass().equals(C0539Pq.class)) {
            z = true;
        } else {
            z = false;
        }
        float a = this.e.a(rectF);
        if (this.f.a(rectF) == a && this.h.a(rectF) == a && this.g.a(rectF) == a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((this.b instanceof C0944bX) && (this.a instanceof C0944bX) && (this.c instanceof C0944bX) && (this.d instanceof C0944bX)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d10, java.lang.Object] */
    public final C1151d10 e() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        return obj;
    }
}
