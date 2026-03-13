package com.fyber.fairbid;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
/* loaded from: classes.dex */
public final class z2 {
    @NotNull
    public final Map<String, String> a;
    @NotNull
    public final JSONObject b;
    public final int c;

    public z2(int i, @NotNull Map headers, @NotNull JSONObject response) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(response, "response");
        this.a = headers;
        this.b = response;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z2) {
            z2 z2Var = (z2) obj;
            return Intrinsics.a(this.a, z2Var.a) && Intrinsics.a(this.b, z2Var.b) && this.c == z2Var.c;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "AuctionRequestResponse(headers=" + this.a + ", response=" + this.b + ", statusCode=" + this.c + ')';
    }
}
