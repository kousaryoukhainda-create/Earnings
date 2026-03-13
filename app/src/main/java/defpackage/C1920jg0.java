package defpackage;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Map;
/* renamed from: jg0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1920jg0 implements Serializable, Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Integer) ((Map.Entry) obj).getValue()).intValue() - ((Integer) ((Map.Entry) obj2).getValue()).intValue();
    }
}
