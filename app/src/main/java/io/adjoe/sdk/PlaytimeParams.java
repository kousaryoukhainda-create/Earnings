package io.adjoe.sdk;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes2.dex */
public final class PlaytimeParams {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final PlaytimeParams EMPTY = new PlaytimeParams(new Builder());
    public final String placement;
    public final String uaChannel;
    public final String uaNetwork;
    public final String uaSubPublisherCleartext;
    public final String uaSubPublisherEncrypted;

    /* loaded from: classes2.dex */
    public static final class Builder {
        public String placement;
        public String uaChannel;
        public String uaNetwork;
        public String uaSubPublisherCleartext;
        public String uaSubPublisherEncrypted;

        @NotNull
        public final PlaytimeParams build() {
            return new PlaytimeParams(this, null);
        }

        @NotNull
        public final Builder setPlacement(String str) {
            if (str == null) {
                str = "";
            }
            this.placement = str;
            return this;
        }

        @NotNull
        public final Builder setUaChannel(String str) {
            if (str == null) {
                str = "";
            }
            this.uaChannel = str;
            return this;
        }

        @NotNull
        public final Builder setUaNetwork(String str) {
            if (str == null) {
                str = "";
            }
            this.uaNetwork = str;
            return this;
        }

        @NotNull
        public final Builder setUaSubPublisherCleartext(String str) {
            if (str == null) {
                str = "";
            }
            this.uaSubPublisherCleartext = str;
            return this;
        }

        @NotNull
        public final Builder setUaSubPublisherEncrypted(String str) {
            if (str == null) {
                str = "";
            }
            this.uaSubPublisherEncrypted = str;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public /* synthetic */ PlaytimeParams(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public boolean equals(Object obj) {
        if (obj instanceof PlaytimeParams) {
            PlaytimeParams playtimeParams = (PlaytimeParams) obj;
            if (Intrinsics.a(this.uaNetwork, playtimeParams.uaNetwork) && Intrinsics.a(this.uaChannel, playtimeParams.uaChannel) && Intrinsics.a(this.uaSubPublisherEncrypted, playtimeParams.uaSubPublisherEncrypted) && Intrinsics.a(this.uaSubPublisherCleartext, playtimeParams.uaSubPublisherCleartext) && Intrinsics.a(this.placement, playtimeParams.placement)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.uaNetwork;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str2 = this.uaChannel;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.uaSubPublisherEncrypted;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.uaSubPublisherCleartext;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str5 = this.placement;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        return i9 + i5;
    }

    public final boolean isEmpty() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = this.uaNetwork;
        if ((str5 != null && str5.length() != 0) || (((str = this.uaChannel) != null && str.length() != 0) || (((str2 = this.uaSubPublisherCleartext) != null && str2.length() != 0) || (((str3 = this.uaSubPublisherEncrypted) != null && str3.length() != 0) || ((str4 = this.placement) != null && str4.length() != 0))))) {
            return false;
        }
        return true;
    }

    public PlaytimeParams(Builder builder) {
        this.placement = builder.placement;
        this.uaNetwork = builder.uaNetwork;
        this.uaChannel = builder.uaChannel;
        this.uaSubPublisherEncrypted = builder.uaSubPublisherEncrypted;
        this.uaSubPublisherCleartext = builder.uaSubPublisherCleartext;
    }
}
