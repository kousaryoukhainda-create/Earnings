package defpackage;

import java.util.Set;
/* renamed from: Ff0  reason: default package */
/* loaded from: classes3.dex */
public abstract class Ff0 extends Bf0 implements Set, j$.util.Set {
    public static final /* synthetic */ int d = 0;
    public transient Gf0 c;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Ff0) {
            ((Ff0) obj).getClass();
            ((Hf0) obj).getClass();
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (set.size() == 0) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
