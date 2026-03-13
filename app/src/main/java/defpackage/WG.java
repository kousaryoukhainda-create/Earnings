package defpackage;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: WG  reason: default package */
/* loaded from: classes2.dex */
public final class WG implements Iterator, RF {
    public String b;
    public boolean c;
    public final /* synthetic */ C2129m5 d;

    public WG(C2129m5 c2129m5) {
        this.d = c2129m5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == null && !this.c) {
            String readLine = ((BufferedReader) this.d.b).readLine();
            this.b = readLine;
            if (readLine == null) {
                this.c = true;
            }
        }
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            String str = this.b;
            this.b = null;
            Intrinsics.b(str);
            return str;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
