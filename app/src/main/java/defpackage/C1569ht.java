package defpackage;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: ht  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1569ht extends ByteArrayOutputStream {
    public final byte[] a() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(buf, "buf");
        return buf;
    }
}
