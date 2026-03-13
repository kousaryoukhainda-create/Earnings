package defpackage;

import java.io.Serializable;
/* renamed from: mD  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2142mD extends Y implements Serializable {
    public final Object b;
    public final Object c;

    public C2142mD(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
