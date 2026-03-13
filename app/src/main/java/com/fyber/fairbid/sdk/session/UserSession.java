package com.fyber.fairbid.sdk.session;

import com.fyber.fairbid.internal.Constants;
import java.util.EnumMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class UserSession {
    public static final /* synthetic */ WF[] h;
    public final long a;
    @NotNull
    public final Storage b;
    @NotNull
    public final EnumMap<Constants.AdType, Integer> c;
    @NotNull
    public final EnumMap<Constants.AdType, Integer> d;
    public int e;
    @NotNull
    public final UserSession$special$$inlined$observable$1 f;
    @NotNull
    public final String g;

    static {
        C3183yN c3183yN = new C3183yN(UserSession.class, "lastInteraction", "getLastInteraction()J");
        AbstractC3019wV.a.getClass();
        h = new WF[]{c3183yN};
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.fyber.fairbid.sdk.session.UserSession$special$$inlined$observable$1] */
    public UserSession(long j, @NotNull Storage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.a = j;
        this.b = storage;
        this.c = new EnumMap<>(Constants.AdType.class);
        this.d = new EnumMap<>(Constants.AdType.class);
        final Long valueOf = Long.valueOf(j);
        this.f = new AbstractC2498qP(valueOf) { // from class: com.fyber.fairbid.sdk.session.UserSession$special$$inlined$observable$1
            @Override // defpackage.AbstractC2498qP
            public final void afterChange(@NotNull WF property, Long l, Long l2) {
                Storage storage2;
                Intrinsics.checkNotNullParameter(property, "property");
                l2.longValue();
                l.longValue();
                storage2 = this.b;
                storage2.saveDuration(UserSession.access$getDuration(this));
            }
        };
        storage.saveStart(j);
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.g = uuid;
    }

    public static final long access$getDuration(UserSession userSession) {
        return (((Number) userSession.f.getValue(userSession, h[0])).longValue() - userSession.a) / 1000;
    }

    @NotNull
    public final String getId() {
        return this.g;
    }

    @NotNull
    public final synchronized UserSessionState getState() {
        long j;
        long longValue;
        EnumMap<Constants.AdType, Integer> clone;
        EnumMap<Constants.AdType, Integer> clone2;
        j = this.a;
        longValue = (((Number) getValue(this, h[0])).longValue() - this.a) / 1000;
        clone = this.c.clone();
        Intrinsics.checkNotNullExpressionValue(clone, "impressions.clone()");
        clone2 = this.d.clone();
        Intrinsics.checkNotNullExpressionValue(clone2, "clicks.clone()");
        return new UserSessionState(j, longValue, clone, clone2, this.e);
    }

    public final synchronized void trackClick(@NotNull Constants.AdType adType, long j) {
        try {
            Intrinsics.checkNotNullParameter(adType, "adType");
            setValue(this, h[0], Long.valueOf(j));
            EnumMap<Constants.AdType, Integer> enumMap = this.d;
            int i = enumMap.get(adType);
            if (i == null) {
                i = 0;
                enumMap.put((EnumMap<Constants.AdType, Integer>) adType, (Constants.AdType) 0);
            }
            int intValue = i.intValue() + 1;
            this.d.put((EnumMap<Constants.AdType, Integer>) adType, (Constants.AdType) Integer.valueOf(intValue));
            this.b.saveClicks(adType, intValue);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void trackCompletion(long j) {
        setValue(this, h[0], Long.valueOf(j));
        int i = this.e + 1;
        this.e = i;
        this.b.saveCompletions(i);
    }

    public final synchronized void trackImpression(@NotNull Constants.AdType adType, long j) {
        try {
            Intrinsics.checkNotNullParameter(adType, "adType");
            setValue(this, h[0], Long.valueOf(j));
            EnumMap<Constants.AdType, Integer> enumMap = this.c;
            int i = enumMap.get(adType);
            if (i == null) {
                i = 0;
                enumMap.put((EnumMap<Constants.AdType, Integer>) adType, (Constants.AdType) 0);
            }
            int intValue = i.intValue() + 1;
            this.c.put((EnumMap<Constants.AdType, Integer>) adType, (Constants.AdType) Integer.valueOf(intValue));
            this.b.saveImpressions(adType, intValue);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void trackInteraction(long j) {
        setValue(this, h[0], Long.valueOf(j));
    }
}
