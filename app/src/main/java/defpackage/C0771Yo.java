package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Yo  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0771Yo implements NZ {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final InterfaceC0652Tz d;

    public C0771Yo(CharSequence input, int i, int i2, InterfaceC0652Tz getNextMatch) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(getNextMatch, "getNextMatch");
        this.a = input;
        this.b = i;
        this.c = i2;
        this.d = getNextMatch;
    }

    @Override // defpackage.NZ
    public final Iterator iterator() {
        return new C0745Xo(this);
    }
}
