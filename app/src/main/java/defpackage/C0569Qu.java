package defpackage;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Qu  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0569Qu implements InterfaceC0652Tz {
    public static final C0569Qu b = new Object();

    @Override // defpackage.InterfaceC0652Tz
    public final Object invoke(Object obj, Object obj2) {
        IOException exception = (IOException) obj2;
        Intrinsics.checkNotNullParameter((File) obj, "<unused var>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        throw exception;
    }
}
