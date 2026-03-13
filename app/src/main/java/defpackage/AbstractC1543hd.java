package defpackage;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: hd  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1543hd {
    public static final Charset a;

    static {
        Charset forName = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
        a = forName;
        Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-16"), "forName(...)");
        Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-16BE"), "forName(...)");
        Intrinsics.checkNotNullExpressionValue(Charset.forName("UTF-16LE"), "forName(...)");
        Intrinsics.checkNotNullExpressionValue(Charset.forName("US-ASCII"), "forName(...)");
        Intrinsics.checkNotNullExpressionValue(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
