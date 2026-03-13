package defpackage;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Pu  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0543Pu implements InterfaceC0652Tz {
    public final /* synthetic */ InterfaceC0652Tz b;

    @Override // defpackage.InterfaceC0652Tz
    public final Object invoke(Object obj, Object obj2) {
        File file = (File) obj;
        IOException e = (IOException) obj2;
        Intrinsics.checkNotNullParameter(file, "f");
        Intrinsics.checkNotNullParameter(e, "e");
        if (this.b.invoke(file, e) != ZP.b) {
            return B90.a;
        }
        Intrinsics.checkNotNullParameter(file, "file");
        throw new C0216De(file, null, null);
    }
}
