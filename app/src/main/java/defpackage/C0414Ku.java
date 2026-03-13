package defpackage;

import java.io.File;
import java.util.Iterator;
/* renamed from: Ku  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0414Ku implements NZ {
    public final File a;
    public final EnumC0439Lu b;
    public final C0543Pu c;
    public final int d;

    public C0414Ku(File file, EnumC0439Lu enumC0439Lu, C0543Pu c0543Pu, int i) {
        this.a = file;
        this.b = enumC0439Lu;
        this.c = c0543Pu;
        this.d = i;
    }

    @Override // defpackage.NZ
    public final Iterator iterator() {
        return new C0362Iu(this);
    }
}
