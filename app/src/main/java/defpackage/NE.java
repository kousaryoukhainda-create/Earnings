package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: NE  reason: default package */
/* loaded from: classes.dex */
public final class NE implements Iterator {
    public static final NE b;
    public static final /* synthetic */ NE[] c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, NE] */
    static {
        ?? r1 = new Enum("INSTANCE", 0);
        b = r1;
        c = new NE[]{r1};
    }

    public static NE valueOf(String str) {
        return (NE) Enum.valueOf(NE.class, str);
    }

    public static NE[] values() {
        return (NE[]) c.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        B10.v("no calls to next() since the last call to remove()", false);
    }
}
