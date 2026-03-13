package defpackage;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Ou  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0517Ou extends C0491Nu {
    public static final C0414Ku e(File start, EnumC0439Lu direction) {
        Intrinsics.checkNotNullParameter(start, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new C0414Ku(start, direction, null, Integer.MAX_VALUE);
    }

    public static /* synthetic */ C0414Ku f(File file) {
        return e(file, EnumC0439Lu.b);
    }
}
