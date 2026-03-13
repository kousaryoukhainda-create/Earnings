package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.h0;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class k0 implements j0 {
    @Override // com.fyber.inneractive.sdk.protobuf.j0
    public Map<?, ?> a(Object obj) {
        return (i0) obj;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.j0
    public Object b(Object obj) {
        i0 i0Var = i0.b;
        if (i0Var.isEmpty()) {
            return new i0();
        }
        return new i0(i0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.j0
    public Map<?, ?> c(Object obj) {
        return (i0) obj;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.j0
    public boolean d(Object obj) {
        return !((i0) obj).a;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.j0
    public Object e(Object obj) {
        ((i0) obj).a = false;
        return obj;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.j0
    public h0.a<?, ?> f(Object obj) {
        ((h0) obj).getClass();
        return null;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.j0
    public Object a(Object obj, Object obj2) {
        i0 i0Var = (i0) obj;
        i0 i0Var2 = (i0) obj2;
        if (!i0Var2.isEmpty()) {
            if (!i0Var.a) {
                i0Var = i0Var.isEmpty() ? new i0() : new i0(i0Var);
            }
            i0Var.a();
            if (!i0Var2.isEmpty()) {
                i0Var.putAll(i0Var2);
            }
        }
        return i0Var;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.j0
    public int a(int i, Object obj, Object obj2) {
        i0 i0Var = (i0) obj;
        h0 h0Var = (h0) obj2;
        if (i0Var.isEmpty()) {
            return 0;
        }
        Iterator it = i0Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            h0Var.getClass();
            l.b(i);
            throw null;
        }
        return 0;
    }
}
