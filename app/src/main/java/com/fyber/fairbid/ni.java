package com.fyber.fairbid;

import com.fyber.fairbid.internal.Constants;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public abstract class ni implements u6 {
    @NotNull
    public final Map<String, ?> a;

    /* loaded from: classes.dex */
    public static final class a {
        @NotNull
        public final pi a;

        public a(@NotNull pi privacyStore) {
            Intrinsics.checkNotNullParameter(privacyStore, "privacyStore");
            this.a = privacyStore;
        }

        @NotNull
        public final pj a() {
            return new pj(this.a.a(), this.a.b.contains(Constants.GDPR_CONSENT_STRING_URL_KEY), this.a.a.contains("IABUSPrivacy_String"), this.a.b());
        }
    }

    public ni(@NotNull Map<String, ?> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.a = map;
    }

    @Override // com.fyber.fairbid.u6
    @NotNull
    public final Map<String, ?> a() {
        return this.a;
    }
}
