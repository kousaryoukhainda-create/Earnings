package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Iu  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0362Iu extends G {
    public final ArrayDeque d;
    public final /* synthetic */ C0414Ku f;

    public C0362Iu(C0414Ku c0414Ku) {
        this.f = c0414Ku;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.d = arrayDeque;
        if (c0414Ku.a.isDirectory()) {
            arrayDeque.push(c(c0414Ku.a));
        } else if (c0414Ku.a.isFile()) {
            File rootFile = c0414Ku.a;
            Intrinsics.checkNotNullParameter(rootFile, "rootFile");
            arrayDeque.push(new AbstractC0388Ju(rootFile));
        } else {
            this.b = 2;
        }
    }

    @Override // defpackage.G
    public final void b() {
        File file;
        File a;
        while (true) {
            ArrayDeque arrayDeque = this.d;
            AbstractC0388Ju abstractC0388Ju = (AbstractC0388Ju) arrayDeque.peek();
            if (abstractC0388Ju == null) {
                file = null;
                break;
            }
            a = abstractC0388Ju.a();
            if (a == null) {
                arrayDeque.pop();
            } else if (a.equals(abstractC0388Ju.a) || !a.isDirectory() || arrayDeque.size() >= this.f.d) {
                break;
            } else {
                arrayDeque.push(c(a));
            }
        }
        file = a;
        if (file != null) {
            this.c = file;
            this.b = 1;
            return;
        }
        this.b = 2;
    }

    public final AbstractC0258Eu c(File file) {
        int ordinal = this.f.b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return new C0284Fu(this, file);
            }
            throw new RuntimeException();
        }
        return new C0336Hu(this, file);
    }
}
