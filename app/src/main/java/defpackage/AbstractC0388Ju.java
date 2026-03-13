package defpackage;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Ju  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0388Ju {
    public final File a;

    public AbstractC0388Ju(File root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.a = root;
    }

    public abstract File a();
}
