package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Nr  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0488Nr extends K implements InterfaceC0462Mr, Serializable {
    public final Enum[] b;

    public C0488Nr(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.b = entries;
    }

    @Override // defpackage.AbstractC2633s, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Enum r0;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        Enum[] enumArr = this.b;
        Intrinsics.checkNotNullParameter(enumArr, "<this>");
        if (ordinal >= 0 && ordinal < enumArr.length) {
            r0 = enumArr[ordinal];
        } else {
            r0 = null;
        }
        if (r0 != element) {
            return false;
        }
        return true;
    }

    @Override // defpackage.AbstractC2633s
    public final int e() {
        return this.b.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.b;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        throw new IndexOutOfBoundsException(AbstractC0324Hi.d(i, length, "index: ", ", size: "));
    }

    @Override // defpackage.K, java.util.List
    public final int indexOf(Object obj) {
        Enum r2;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        Enum[] enumArr = this.b;
        Intrinsics.checkNotNullParameter(enumArr, "<this>");
        if (ordinal >= 0 && ordinal < enumArr.length) {
            r2 = enumArr[ordinal];
        } else {
            r2 = null;
        }
        if (r2 != element) {
            return -1;
        }
        return ordinal;
    }

    @Override // defpackage.K, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }
}
