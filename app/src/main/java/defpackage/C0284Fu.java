package defpackage;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Fu  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0284Fu extends AbstractC0258Eu {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final /* synthetic */ C0362Iu f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0284Fu(C0362Iu c0362Iu, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f = c0362Iu;
    }

    @Override // defpackage.AbstractC0388Ju
    public final File a() {
        boolean z = this.e;
        C0362Iu c0362Iu = this.f;
        File file = this.a;
        if (!z && this.c == null) {
            c0362Iu.f.getClass();
            File[] listFiles = file.listFiles();
            this.c = listFiles;
            if (listFiles == null) {
                C0543Pu c0543Pu = c0362Iu.f.c;
                if (c0543Pu != null) {
                    c0543Pu.invoke(file, new C3064x0(file, 0));
                }
                this.e = true;
            }
        }
        File[] fileArr = this.c;
        if (fileArr != null && this.d < fileArr.length) {
            Intrinsics.b(fileArr);
            int i = this.d;
            this.d = i + 1;
            return fileArr[i];
        } else if (!this.b) {
            this.b = true;
            return file;
        } else {
            c0362Iu.f.getClass();
            return null;
        }
    }
}
