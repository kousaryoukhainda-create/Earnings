package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
/* renamed from: vL  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2923vL {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public Object k;
    public Object l;

    public C2923vL() {
        this.b = new C2208n10[4];
        this.c = new Matrix[4];
        this.d = new Matrix[4];
        this.e = new PointF();
        this.f = new Path();
        this.g = new Path();
        this.h = new C2208n10();
        this.i = new float[2];
        this.j = new float[2];
        this.k = new Path();
        this.l = new Path();
        this.a = true;
        for (int i = 0; i < 4; i++) {
            ((C2208n10[]) this.b)[i] = new C2208n10();
            ((Matrix[]) this.c)[i] = new Matrix();
            ((Matrix[]) this.d)[i] = new Matrix();
        }
    }

    public E60 a(int i, ArrayList arrayList, D10 d10) {
        if (!arrayList.isEmpty()) {
            this.k = d10;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                C2837uL c2837uL = (C2837uL) arrayList.get(i2 - i);
                ArrayList arrayList2 = (ArrayList) this.c;
                if (i2 > 0) {
                    C2837uL c2837uL2 = (C2837uL) arrayList2.get(i2 - 1);
                    c2837uL.d = c2837uL2.a.q.b.o() + c2837uL2.d;
                    c2837uL.e = false;
                    c2837uL.c.clear();
                } else {
                    c2837uL.d = 0;
                    c2837uL.e = false;
                    c2837uL.c.clear();
                }
                int o = c2837uL.a.q.b.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((C2837uL) arrayList2.get(i3)).d += o;
                }
                arrayList2.add(i2, c2837uL);
                ((HashMap) this.e).put(c2837uL.b, c2837uL);
                if (this.a) {
                    g(c2837uL);
                    if (((IdentityHashMap) this.d).isEmpty()) {
                        ((HashSet) this.h).add(c2837uL);
                    } else {
                        C2751tL c2751tL = (C2751tL) ((HashMap) this.f).get(c2837uL);
                        if (c2751tL != null) {
                            c2751tL.a.c(c2751tL.b);
                        }
                    }
                }
            }
        }
        return c();
    }

    public void b(C1236e10 c1236e10, float f, RectF rectF, WC wc, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        C2208n10[] c2208n10Arr;
        int i;
        float[] fArr;
        C0539Pq c0539Pq;
        InterfaceC0298Gi interfaceC0298Gi;
        AbstractC1906jZ abstractC1906jZ;
        int i2;
        C2923vL c2923vL = this;
        path.rewind();
        Path path2 = (Path) c2923vL.f;
        path2.rewind();
        Path path3 = (Path) c2923vL.g;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = (Matrix[]) c2923vL.d;
            matrixArr2 = (Matrix[]) c2923vL.c;
            c2208n10Arr = (C2208n10[]) c2923vL.b;
            i = 4;
            fArr = (float[]) c2923vL.i;
            if (i3 >= 4) {
                break;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        interfaceC0298Gi = c1236e10.f;
                    } else {
                        interfaceC0298Gi = c1236e10.e;
                    }
                } else {
                    interfaceC0298Gi = c1236e10.h;
                }
            } else {
                interfaceC0298Gi = c1236e10.g;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        abstractC1906jZ = c1236e10.b;
                    } else {
                        abstractC1906jZ = c1236e10.a;
                    }
                } else {
                    abstractC1906jZ = c1236e10.d;
                }
            } else {
                abstractC1906jZ = c1236e10.c;
            }
            C2208n10 c2208n10 = c2208n10Arr[i3];
            abstractC1906jZ.getClass();
            abstractC1906jZ.y(c2208n10, f, interfaceC0298Gi.a(rectF));
            int i4 = i3 + 1;
            float f2 = i4 * 90;
            matrixArr2[i3].reset();
            PointF pointF = (PointF) c2923vL.e;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        i2 = i4;
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        i2 = i4;
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    i2 = i4;
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                i2 = i4;
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f2);
            C2208n10 c2208n102 = c2208n10Arr[i3];
            fArr[0] = c2208n102.b;
            fArr[1] = c2208n102.c;
            matrixArr2[i3].mapPoints(fArr);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr[0], fArr[1]);
            matrixArr[i3].preRotate(f2);
            i3 = i2;
        }
        int i5 = 0;
        while (i5 < i) {
            C2208n10 c2208n103 = c2208n10Arr[i5];
            c2208n103.getClass();
            fArr[0] = 0.0f;
            fArr[1] = c2208n103.a;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            c2208n10Arr[i5].b(matrixArr2[i5], path);
            if (wc != null) {
                C2208n10 c2208n104 = c2208n10Arr[i5];
                Matrix matrix = matrixArr2[i5];
                OJ oj = (OJ) wc.c;
                BitSet bitSet = oj.f;
                c2208n104.getClass();
                bitSet.set(i5, false);
                c2208n104.a(c2208n104.e);
                oj.c[i5] = new C1408g10(new ArrayList(c2208n104.g), new Matrix(matrix));
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            C2208n10 c2208n105 = c2208n10Arr[i5];
            fArr[0] = c2208n105.b;
            fArr[1] = c2208n105.c;
            matrixArr2[i5].mapPoints(fArr);
            C2208n10 c2208n106 = c2208n10Arr[i7];
            c2208n106.getClass();
            float[] fArr2 = (float[]) c2923vL.j;
            fArr2[0] = 0.0f;
            fArr2[1] = c2208n106.a;
            matrixArr2[i7].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C2208n10 c2208n107 = c2208n10Arr[i5];
            fArr[0] = c2208n107.b;
            fArr[1] = c2208n107.c;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 != 1 && i5 != 3) {
                Math.abs(rectF.centerY() - fArr[1]);
            } else {
                Math.abs(rectF.centerX() - fArr[0]);
            }
            C2208n10 c2208n108 = (C2208n10) c2923vL.h;
            c2208n108.d(0.0f, 270.0f, 0.0f);
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 3) {
                        c0539Pq = c1236e10.j;
                    } else {
                        c0539Pq = c1236e10.i;
                    }
                } else {
                    c0539Pq = c1236e10.l;
                }
            } else {
                c0539Pq = c1236e10.k;
            }
            c0539Pq.getClass();
            c2208n108.c(max, 0.0f);
            Path path4 = (Path) c2923vL.k;
            path4.reset();
            c2208n108.b(matrixArr[i5], path4);
            if (c2923vL.a && (c2923vL.f(path4, i5) || c2923vL.f(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = c2208n108.a;
                matrixArr[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c2208n108.b(matrixArr[i5], path2);
            } else {
                c2208n108.b(matrixArr[i5], path);
            }
            if (wc != null) {
                Matrix matrix2 = matrixArr[i5];
                OJ oj2 = (OJ) wc.c;
                oj2.f.set(i5 + 4, false);
                c2208n108.a(c2208n108.e);
                oj2.d[i5] = new C1408g10(new ArrayList(c2208n108.g), new Matrix(matrix2));
            }
            i = 4;
            c2923vL = this;
            i5 = i6;
        }
        path.close();
        path2.close();
        if (!path2.isEmpty()) {
            path.op(path2, Path.Op.UNION);
        }
    }

    public E60 c() {
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList.isEmpty()) {
            return E60.a;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C2837uL c2837uL = (C2837uL) arrayList.get(i2);
            c2837uL.d = i;
            i += c2837uL.a.q.b.o();
        }
        return new C2243nS(arrayList, (D10) this.k);
    }

    public void d() {
        Iterator it = ((HashSet) this.h).iterator();
        while (it.hasNext()) {
            C2837uL c2837uL = (C2837uL) it.next();
            if (c2837uL.c.isEmpty()) {
                C2751tL c2751tL = (C2751tL) ((HashMap) this.f).get(c2837uL);
                if (c2751tL != null) {
                    c2751tL.a.c(c2751tL.b);
                }
                it.remove();
            }
        }
    }

    public void e(C2837uL c2837uL) {
        if (c2837uL.e && c2837uL.c.isEmpty()) {
            C2751tL c2751tL = (C2751tL) ((HashMap) this.f).remove(c2837uL);
            c2751tL.getClass();
            C2494qL c2494qL = c2751tL.b;
            P9 p9 = c2751tL.a;
            p9.q(c2494qL);
            C0647Tu c0647Tu = c2751tL.c;
            p9.t(c0647Tu);
            p9.s(c0647Tu);
            ((HashSet) this.h).remove(c2837uL);
        }
    }

    public boolean f(Path path, int i) {
        Path path2 = (Path) this.l;
        path2.reset();
        ((C2208n10[]) this.b)[i].b(((Matrix[]) this.c)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kL, qL] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, eq] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, nL] */
    public void g(C2837uL c2837uL) {
        AJ aj = c2837uL.a;
        ?? r1 = new InterfaceC1978kL() { // from class: qL
            @Override // defpackage.InterfaceC1978kL
            public final void a(P9 p9, E60 e60) {
                C3161y50 c3161y50 = ((C0979bt) C2923vL.this.g).j;
                c3161y50.d(2);
                c3161y50.e(22);
            }
        };
        C0647Tu c0647Tu = new C0647Tu(this, c2837uL);
        ((HashMap) this.f).put(c2837uL, new C2751tL(aj, r1, c0647Tu));
        int i = Ha0.a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        aj.getClass();
        C1394fq c1394fq = aj.d;
        c1394fq.getClass();
        ?? obj = new Object();
        obj.a = handler;
        obj.b = c0647Tu;
        c1394fq.c.add(obj);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        C1394fq c1394fq2 = aj.f;
        c1394fq2.getClass();
        ?? obj2 = new Object();
        obj2.a = c0647Tu;
        c1394fq2.c.add(obj2);
        aj.m(r1, (U70) this.l, (C1615iS) this.b);
    }

    public void h(InterfaceC1179dL interfaceC1179dL) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.d;
        C2837uL c2837uL = (C2837uL) identityHashMap.remove(interfaceC1179dL);
        c2837uL.getClass();
        c2837uL.a.p(interfaceC1179dL);
        c2837uL.c.remove(((C3093xJ) interfaceC1179dL).b);
        if (!identityHashMap.isEmpty()) {
            d();
        }
        e(c2837uL);
    }

    public void i(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = (ArrayList) this.c;
            C2837uL c2837uL = (C2837uL) arrayList.remove(i3);
            ((HashMap) this.e).remove(c2837uL.b);
            int i4 = -c2837uL.a.q.b.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((C2837uL) arrayList.get(i5)).d += i4;
            }
            c2837uL.e = true;
            if (this.a) {
                e(c2837uL);
            }
        }
    }

    public C2923vL(C0979bt c0979bt, C0354Im c0354Im, C3161y50 c3161y50, C1615iS c1615iS) {
        this.b = c1615iS;
        this.g = c0979bt;
        this.k = new D10();
        this.d = new IdentityHashMap();
        this.e = new HashMap();
        this.c = new ArrayList();
        this.i = c0354Im;
        this.j = c3161y50;
        this.f = new HashMap();
        this.h = new HashSet();
    }
}
