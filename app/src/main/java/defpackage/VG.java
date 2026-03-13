package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: VG  reason: default package */
/* loaded from: classes2.dex */
public final class VG implements Iterator, RF {
    public final String b;
    public int c;
    public int d;
    public int f;
    public int g;

    public VG(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        this.b = string;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            return true;
        }
        int i3 = 2;
        if (this.g < 0) {
            this.c = 2;
            return false;
        }
        String str = this.b;
        int length = str.length();
        int length2 = str.length();
        for (int i4 = this.d; i4 < length2; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i3 = (charAt == '\r' && (i = i4 + 1) < str.length() && str.charAt(i) == '\n') ? 1 : 1;
                length = i4;
                this.c = 1;
                this.g = i3;
                this.f = length;
                return true;
            }
        }
        i3 = -1;
        this.c = 1;
        this.g = i3;
        this.f = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.c = 0;
            int i = this.f;
            int i2 = this.d;
            this.d = this.g + i;
            return this.b.subSequence(i2, i).toString();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
