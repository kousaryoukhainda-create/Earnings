package defpackage;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Xi  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0739Xi extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0739Xi(String message) {
        super(message, null);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
