package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: e  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1232e {
    public static final byte[] a;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "<this>");
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC1543hd.a);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        a = bytes;
    }

    public static final String a(long j, C1995kb c1995kb) {
        Intrinsics.checkNotNullParameter(c1995kb, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (c1995kb.c(j2) == 13) {
                String s = c1995kb.s(j2, AbstractC1543hd.a);
                c1995kb.w(2L);
                return s;
            }
        }
        c1995kb.getClass();
        String s2 = c1995kb.s(j, AbstractC1543hd.a);
        c1995kb.w(1L);
        return s2;
    }
}
