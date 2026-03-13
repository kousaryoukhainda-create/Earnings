package com.fyber.inneractive.sdk.protobuf;
/* loaded from: classes.dex */
public final class g0 implements e1 {
    public static final n0 b = new a();
    public final n0 a;

    /* loaded from: classes.dex */
    public class a implements n0 {
        @Override // com.fyber.inneractive.sdk.protobuf.n0
        public boolean a(Class<?> cls) {
            return false;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.n0
        public m0 b(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    /* loaded from: classes.dex */
    public static class b implements n0 {
        public n0[] a;

        public b(n0... n0VarArr) {
            this.a = n0VarArr;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.n0
        public boolean a(Class<?> cls) {
            for (n0 n0Var : this.a) {
                if (n0Var.a(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.fyber.inneractive.sdk.protobuf.n0
        public m0 b(Class<?> cls) {
            n0[] n0VarArr;
            for (n0 n0Var : this.a) {
                if (n0Var.a(cls)) {
                    return n0Var.b(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
        }
    }

    public g0() {
        this(a());
    }

    public static n0 a() {
        n0 n0Var;
        try {
            n0Var = (n0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            n0Var = b;
        }
        return new b(w.a, n0Var);
    }

    public g0(n0 n0Var) {
        this.a = (n0) y.a(n0Var, "messageInfoFactory");
    }
}
