package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.f;
import com.fyber.inneractive.sdk.protobuf.q;
import com.fyber.inneractive.sdk.protobuf.r1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class s extends r<GeneratedMessageLite.d> {

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[r1.b.values().length];
            a = iArr;
            try {
                iArr[r1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[r1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[r1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[r1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[r1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[r1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[r1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[r1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[r1.b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[r1.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[r1.b.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[r1.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[r1.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[r1.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[r1.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[r1.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[r1.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[r1.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public boolean a(o0 o0Var) {
        return o0Var instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public u<GeneratedMessageLite.d> b(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public void c(Object obj) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions.g();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public u<GeneratedMessageLite.d> a(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public <UT, UB> UB a(c1 c1Var, Object obj, q qVar, u<GeneratedMessageLite.d> uVar, UB ub, k1<UT, UB> k1Var) throws IOException {
        Object valueOf;
        Object a2;
        ArrayList arrayList;
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        GeneratedMessageLite.d dVar = eVar.d;
        int i = dVar.b;
        if (dVar.d && dVar.e) {
            switch (a.a[dVar.c.ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    c1Var.j(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    c1Var.d(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    c1Var.k(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    c1Var.a(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    c1Var.o(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    c1Var.n(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    c1Var.e(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    c1Var.l(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    c1Var.i(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    c1Var.f(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    c1Var.m(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    c1Var.c(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    c1Var.g(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    c1Var.p(arrayList);
                    ub = (UB) f1.a(i, arrayList, eVar.d.a, ub, k1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.d.c);
            }
            uVar.c(eVar.d, arrayList);
        } else {
            r1.b bVar = dVar.c;
            if (bVar == r1.b.ENUM) {
                int d = c1Var.d();
                if (eVar.d.a.a(d) == null) {
                    Class<?> cls = f1.a;
                    if (ub == null) {
                        ub = k1Var.a();
                    }
                    k1Var.b(ub, i, d);
                    return ub;
                }
                valueOf = Integer.valueOf(d);
            } else {
                switch (a.a[bVar.ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(c1Var.h());
                        break;
                    case 2:
                        valueOf = Float.valueOf(c1Var.k());
                        break;
                    case 3:
                        valueOf = Long.valueOf(c1Var.o());
                        break;
                    case 4:
                        valueOf = Long.valueOf(c1Var.f());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(c1Var.d());
                        break;
                    case 6:
                        valueOf = Long.valueOf(c1Var.g());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(c1Var.q());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(c1Var.r());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(c1Var.c());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(c1Var.m());
                        break;
                    case 11:
                        valueOf = Long.valueOf(c1Var.t());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(c1Var.j());
                        break;
                    case 13:
                        valueOf = Long.valueOf(c1Var.l());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = c1Var.a();
                        break;
                    case 16:
                        valueOf = c1Var.n();
                        break;
                    case 17:
                        valueOf = c1Var.a(eVar.c.getClass(), qVar);
                        break;
                    case 18:
                        valueOf = c1Var.b(eVar.c.getClass(), qVar);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            }
            GeneratedMessageLite.d dVar2 = eVar.d;
            if (dVar2.d) {
                uVar.a((u<GeneratedMessageLite.d>) dVar2, valueOf);
            } else {
                int i2 = a.a[dVar2.c.ordinal()];
                if ((i2 == 17 || i2 == 18) && (a2 = uVar.a((u<GeneratedMessageLite.d>) eVar.d)) != null) {
                    valueOf = y.a(a2, valueOf);
                }
                uVar.c(eVar.d, valueOf);
            }
        }
        return ub;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public Object a(q qVar, o0 o0Var, int i) {
        return qVar.a.get(new q.a(o0Var, i));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public int a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.d) entry.getKey()).b;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public void a(s1 s1Var, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.d dVar = (GeneratedMessageLite.d) entry.getKey();
        if (dVar.d) {
            switch (a.a[dVar.c.ordinal()]) {
                case 1:
                    f1.b(dVar.b, (List) entry.getValue(), s1Var, dVar.e);
                    return;
                case 2:
                    f1.f(dVar.b, (List) entry.getValue(), s1Var, dVar.e);
                    return;
                case 3:
                    f1.h(dVar.b, (List) entry.getValue(), s1Var, dVar.e);
                    return;
                case 4:
                    f1.n(dVar.b, (List) entry.getValue(), s1Var, dVar.e);
                    return;
                case 5:
                    f1.g(dVar.b, (List) entry.getValue(), s1Var, dVar.e);
                    return;
                case 6:
                    f1.e(dVar.b, (List) entry.getValue(), s1Var, dVar.e);
                    return;
                case 7:
                    f1.d(dVar.b, (List) entry.getValue(), s1Var, dVar.e);
                    return;
                case 8:
                    f1.a(dVar.b, (List) entry.getValue(), s1Var, dVar.e);
                    return;
                case 9:
                    f1.m(dVar.b, (List) entry.getValue(), s1Var, dVar.e);
                    return;
                case 10:
                    f1.i(dVar.b, (List) entry.getValue(), s1Var, dVar.e);
                    return;
                case 11:
                    f1.j(dVar.b, (List) entry.getValue(), s1Var, dVar.e);
                    return;
                case 12:
                    f1.k(dVar.b, (List) entry.getValue(), s1Var, dVar.e);
                    return;
                case 13:
                    f1.l(dVar.b, (List) entry.getValue(), s1Var, dVar.e);
                    return;
                case 14:
                    f1.g(dVar.b, (List) entry.getValue(), s1Var, dVar.e);
                    return;
                case 15:
                    f1.a(dVar.b, (List) entry.getValue(), s1Var);
                    return;
                case 16:
                    f1.b(dVar.b, (List) entry.getValue(), s1Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    f1.a(dVar.b, (List) entry.getValue(), s1Var, z0.c.a(list.get(0).getClass()));
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    f1.b(dVar.b, (List) entry.getValue(), s1Var, z0.c.a(list2.get(0).getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (a.a[dVar.c.ordinal()]) {
            case 1:
                ((m) s1Var).a(dVar.b, ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                ((m) s1Var).a(dVar.b, ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                ((m) s1Var).a.g(dVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                ((m) s1Var).a.g(dVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 5:
                ((m) s1Var).a.h(dVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                ((m) s1Var).a.f(dVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 7:
                ((m) s1Var).a.g(dVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                ((m) s1Var).a.b(dVar.b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                ((m) s1Var).a.j(dVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                ((m) s1Var).a.g(dVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                ((m) s1Var).a.f(dVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 12:
                ((m) s1Var).a(dVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                ((m) s1Var).a(dVar.b, ((Long) entry.getValue()).longValue());
                return;
            case 14:
                ((m) s1Var).a.h(dVar.b, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                ((m) s1Var).a.b(dVar.b, (i) entry.getValue());
                return;
            case 16:
                ((m) s1Var).a.b(dVar.b, (String) entry.getValue());
                return;
            case 17:
                ((m) s1Var).a(dVar.b, entry.getValue(), z0.c.a(entry.getValue().getClass()));
                return;
            case 18:
                ((m) s1Var).b(dVar.b, entry.getValue(), z0.c.a(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public void a(c1 c1Var, Object obj, q qVar, u<GeneratedMessageLite.d> uVar) throws IOException {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        uVar.c(eVar.d, c1Var.b(eVar.c.getClass(), qVar));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.r
    public void a(i iVar, Object obj, q qVar, u<GeneratedMessageLite.d> uVar) throws IOException {
        GeneratedMessageLite.e eVar = (GeneratedMessageLite.e) obj;
        GeneratedMessageLite b = ((GeneratedMessageLite.b) eVar.c.newBuilderForType()).b();
        ByteBuffer wrap = ByteBuffer.wrap(iVar.h());
        if (wrap.hasArray()) {
            f.b bVar = new f.b(wrap, true);
            z0 z0Var = z0.c;
            z0Var.getClass();
            z0Var.a(b.getClass()).a(b, bVar, qVar);
            uVar.c(eVar.d, b);
            if (bVar.s() != Integer.MAX_VALUE) {
                throw z.a();
            }
            return;
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
