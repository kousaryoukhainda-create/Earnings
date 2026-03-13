package defpackage;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: x0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3064x0 extends C0216De {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3064x0(File file, int i) {
        super(file, null, "Cannot list files in a directory");
        switch (i) {
            case 2:
                Intrinsics.checkNotNullParameter(file, "file");
                super(file, null, "The source file doesn't exist.");
                return;
            default:
                Intrinsics.checkNotNullParameter(file, "file");
                return;
        }
    }
}
