package defpackage;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: fd  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1371fd extends AbstractC0862ad {
    public final int b;
    public final int c;
    public boolean d;
    public int f;

    public C1371fd(char c, char c2, int i) {
        this.b = i;
        this.c = c2;
        boolean z = false;
        if (i <= 0 ? Intrinsics.d(c, c2) >= 0 : Intrinsics.d(c, c2) <= 0) {
            z = true;
        }
        this.d = z;
        this.f = z ? c : c2;
    }

    @Override // defpackage.AbstractC0862ad
    public final char b() {
        int i = this.f;
        if (i == this.c) {
            if (this.d) {
                this.d = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f = this.b + i;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d;
    }
}
