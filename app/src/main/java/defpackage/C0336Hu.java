package defpackage;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Hu  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0336Hu extends AbstractC0258Eu {
    public boolean b;
    public File[] c;
    public int d;
    public final /* synthetic */ C0362Iu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0336Hu(C0362Iu c0362Iu, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.e = c0362Iu;
    }

    @Override // defpackage.AbstractC0388Ju
    public final File a() {
        C0543Pu c0543Pu;
        boolean z = this.b;
        C0362Iu c0362Iu = this.e;
        File file = this.a;
        if (!z) {
            c0362Iu.f.getClass();
            this.b = true;
            return file;
        }
        File[] fileArr = this.c;
        if (fileArr != null && this.d >= fileArr.length) {
            c0362Iu.f.getClass();
            return null;
        }
        if (fileArr == null) {
            File[] listFiles = file.listFiles();
            this.c = listFiles;
            if (listFiles == null && (c0543Pu = c0362Iu.f.c) != null) {
                c0543Pu.invoke(file, new C3064x0(file, 0));
            }
            File[] fileArr2 = this.c;
            if (fileArr2 == null || fileArr2.length == 0) {
                c0362Iu.f.getClass();
                return null;
            }
        }
        File[] fileArr3 = this.c;
        Intrinsics.b(fileArr3);
        int i = this.d;
        this.d = i + 1;
        return fileArr3[i];
    }
}
