package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: d40  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1157d40 extends AbstractC2205n0 implements InterfaceC3269zN, InterfaceC0649Tw, InterfaceC1511hA {
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(C1157d40.class, Object.class, "_state");
    private volatile Object _state;
    public int f;

    public C1157d40(Object obj) {
        this._state = obj;
    }

    public final boolean b(Object obj, Object obj2) {
        int i;
        AbstractC2291o0[] abstractC2291o0Arr;
        C0754Xx c0754Xx;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.a(obj3, obj)) {
                return false;
            }
            if (Intrinsics.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.f;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.f = i3;
                AbstractC2291o0[] abstractC2291o0Arr2 = this.b;
                while (true) {
                    C1242e40[] c1242e40Arr = (C1242e40[]) abstractC2291o0Arr2;
                    if (c1242e40Arr != null) {
                        for (C1242e40 c1242e40 : c1242e40Arr) {
                            if (c1242e40 != null) {
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1242e40.a;
                                    Object obj4 = atomicReferenceFieldUpdater2.get(c1242e40);
                                    if (obj4 != null && obj4 != (c0754Xx = Wh0.s)) {
                                        C0754Xx c0754Xx2 = Wh0.r;
                                        if (obj4 == c0754Xx2) {
                                            while (!atomicReferenceFieldUpdater2.compareAndSet(c1242e40, obj4, c0754Xx)) {
                                                if (atomicReferenceFieldUpdater2.get(c1242e40) != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReferenceFieldUpdater2.compareAndSet(c1242e40, obj4, c0754Xx2)) {
                                                if (atomicReferenceFieldUpdater2.get(c1242e40) != obj4) {
                                                    break;
                                                }
                                            }
                                            ((C1911jc) obj4).resumeWith(B90.a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.f;
                        if (i == i3) {
                            this.f = i3 + 1;
                            return true;
                        }
                        abstractC2291o0Arr = this.b;
                    }
                    abstractC2291o0Arr2 = abstractC2291o0Arr;
                    i3 = i;
                }
            } else {
                this.f = i2 + 2;
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e5, code lost:
        if (r0.equals(r4) != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00cb, B:52:0x00d3, B:55:0x00da, B:56:0x00de, B:58:0x00e1, B:68:0x0102, B:71:0x0115, B:72:0x012d, B:78:0x0141, B:80:0x0149, B:75:0x0138, B:77:0x013e, B:60:0x00e7, B:64:0x00ee, B:21:0x0053, B:24:0x005e, B:49:0x00bc), top: B:91:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0115 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00cb, B:52:0x00d3, B:55:0x00da, B:56:0x00de, B:58:0x00e1, B:68:0x0102, B:71:0x0115, B:72:0x012d, B:78:0x0141, B:80:0x0149, B:75:0x0138, B:77:0x013e, B:60:0x00e7, B:64:0x00ee, B:21:0x0053, B:24:0x005e, B:49:0x00bc), top: B:91:0x0026 }] */
    /* JADX WARN: Type inference failed for: r0v4, types: [o0[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0114 -> B:50:0x00cb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0151 -> B:85:0x0154). Please submit an issue!!! */
    @Override // defpackage.InterfaceC0649Tw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(defpackage.InterfaceC0675Uw r17, defpackage.InterfaceC2868ui r18) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1157d40.collect(Uw, ui):java.lang.Object");
    }

    @Override // defpackage.InterfaceC0675Uw
    public final Object emit(Object obj, InterfaceC2868ui interfaceC2868ui) {
        if (obj == null) {
            obj = AbstractC1906jZ.f;
        }
        b(null, obj);
        return B90.a;
    }

    @Override // defpackage.InterfaceC1511hA
    public final InterfaceC0649Tw p(InterfaceC0428Li interfaceC0428Li, int i, int i2) {
        if ((((i >= 0 && i < 2) || i == -2) && i2 == 2) || ((i == 0 || i == -3) && i2 == 1)) {
            return this;
        }
        return new C0681Vc(this, interfaceC0428Li, i, i2);
    }
}
