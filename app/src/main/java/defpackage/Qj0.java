package defpackage;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: Qj0  reason: default package */
/* loaded from: classes2.dex */
public final class Qj0 implements Bg0 {
    public final Bl0 a;
    public final String b;
    public final String c;

    public Qj0(Bl0 sentryDataProvider, String sentryLogLevel, String platform) {
        Intrinsics.checkNotNullParameter(sentryDataProvider, "sentryDataProvider");
        Intrinsics.checkNotNullParameter(sentryLogLevel, "sentryLogLevel");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.a = sentryDataProvider;
        this.b = sentryLogLevel;
        this.c = platform;
    }

    @Override // defpackage.Bg0
    public final Qj0 a() {
        return this;
    }

    @Override // defpackage.Bg0
    public final void b(String tag, String message, Throwable t) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(t, "t");
        c(tag, message, t, Lg0.c);
    }

    public final void c(String tag, String message, Throwable th, Lg0 severity) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(severity, "severity");
        d(tag, message, th, severity, null);
    }

    public final void d(String tag, String message, Throwable th, Lg0 severity, HashMap hashMap) {
        Object extraTags;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(severity, "severity");
        String str = this.b;
        if (str != null && str.length() != 0) {
            if (hashMap != null) {
                hashMap.put("tag", tag);
            }
            C2016kl0 c2016kl0 = new C2016kl0(this.a, severity, new C1217dl0(message), th, this.c);
            if (hashMap == null || (extraTags = C2148mJ.j(hashMap)) == null) {
                extraTags = C3054wr.b;
            }
            Intrinsics.checkNotNullParameter(extraTags, "extraTags");
            c2016kl0.h.putAll(extraTags);
            C1049ci0 c1049ci0 = C1049ci0.a;
            Rj0 c = C1049ci0.c();
            c.getClass();
            try {
                c.p(new C0290Ga("/v1/frontend-error/sentry", c.v(C1049ci0.a()), (HashMap) null, c2016kl0.a().toString()), true, new C0335Ht(26));
            } catch (Exception unused) {
                AbstractC1930jl0.f("AdjoeBackend", "Failed to send Sentry event");
            }
        }
    }

    @Override // defpackage.Bg0
    public final void a(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        c(tag, message, null, Lg0.c);
    }

    @Override // defpackage.Bg0
    public final Ok0 a(C3302zk loggerFields) {
        Intrinsics.checkNotNullParameter(loggerFields, "loggerFields");
        return new Ok0(this, loggerFields);
    }
}
