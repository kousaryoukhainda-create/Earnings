package defpackage;

import io.adjoe.sdk.PlaytimeParams;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Ei0  reason: default package */
/* loaded from: classes2.dex */
public final class Ei0 {
    public final String a;
    public final Ri0 b;
    public final Map c;
    public final Map d;
    public final PlaytimeParams e;

    public Ei0(String name, Ri0 channel, Map extras, Map contexts, PlaytimeParams playtimeParams) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(contexts, "contexts");
        this.a = name;
        this.b = channel;
        this.c = extras;
        this.d = contexts;
        this.e = playtimeParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ei0)) {
            return false;
        }
        Ei0 ei0 = (Ei0) obj;
        if (Intrinsics.a(this.a, ei0.a) && this.b == ei0.b && Intrinsics.a(this.c, ei0.c) && Intrinsics.a(this.d, ei0.d) && Intrinsics.a(this.e, ei0.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = (this.d.hashCode() + ((hashCode3 + ((hashCode2 + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        PlaytimeParams playtimeParams = this.e;
        if (playtimeParams == null) {
            hashCode = 0;
        } else {
            hashCode = playtimeParams.hashCode();
        }
        return hashCode4 + hashCode;
    }

    public final String toString() {
        StringBuilder b = Ki0.b("PlaytimeEvent(name=");
        b.append(this.a);
        b.append(", channel=");
        b.append(this.b);
        b.append(", extras=");
        b.append(this.c);
        b.append(", contexts=");
        b.append(this.d);
        b.append(", params=");
        b.append(this.e);
        b.append(')');
        return b.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Ei0(java.lang.String r7, defpackage.Ri0 r8, defpackage.C3054wr r9, java.util.LinkedHashMap r10, io.adjoe.sdk.PlaytimeParams r11, int r12) {
        /*
            r6 = this;
            r0 = r12 & 2
            if (r0 == 0) goto L6
            Ri0 r8 = defpackage.Ri0.b
        L6:
            r2 = r8
            r8 = r12 & 4
            wr r0 = defpackage.C3054wr.b
            if (r8 == 0) goto Lf
            r3 = r0
            goto L10
        Lf:
            r3 = r9
        L10:
            r8 = r12 & 8
            if (r8 == 0) goto L16
            r4 = r0
            goto L17
        L16:
            r4 = r10
        L17:
            r8 = r12 & 16
            if (r8 == 0) goto L1c
            r11 = 0
        L1c:
            r5 = r11
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Ei0.<init>(java.lang.String, Ri0, wr, java.util.LinkedHashMap, io.adjoe.sdk.PlaytimeParams, int):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Ei0(String name, Ri0 channel) {
        this(name, channel, C3054wr.b, null, null, 24);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(channel, "channel");
    }
}
