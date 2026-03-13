package defpackage;

import java.util.NoSuchElementException;
/* renamed from: sQ  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2670sQ {
    public final Object a;

    public C2670sQ() {
        this.a = null;
    }

    public final Object a() {
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean b() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public C2670sQ(Object obj) {
        if (obj != null) {
            this.a = obj;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
