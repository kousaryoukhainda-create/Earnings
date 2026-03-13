package com.fyber.fairbid.mediation.abstr;

import com.fyber.fairbid.EnumC1119r0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class AdapterException extends Exception {
    @NotNull
    public final EnumC1119r0 a;
    @NotNull
    public final String b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AdapterException(com.fyber.fairbid.EnumC1119r0 r1, java.lang.String r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            java.lang.String r2 = r1.a()
            java.lang.String r3 = "reason.description"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
        Ld:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.fairbid.mediation.abstr.AdapterException.<init>(com.fyber.fairbid.r0, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.b;
    }

    @NotNull
    public final EnumC1119r0 getReason() {
        return this.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdapterException(@NotNull EnumC1119r0 reason, @NotNull String message) {
        super(message);
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(message, "message");
        this.a = reason;
        this.b = message;
    }
}
