package com.google.android.recaptcha;

import androidx.annotation.NonNull;
import com.applovin.sdk.AppLovinEventTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class RecaptchaAction {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final RecaptchaAction LOGIN = new RecaptchaAction(AppLovinEventTypes.USER_LOGGED_IN);
    @NotNull
    public static final RecaptchaAction SIGNUP = new RecaptchaAction("signup");
    @NotNull
    private final String action;

    @Metadata
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final RecaptchaAction custom(@NonNull String str) {
            return new RecaptchaAction(str, null);
        }

        public /* synthetic */ Companion(@NonNull DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private RecaptchaAction(String str) {
        this.action = str;
    }

    @NonNull
    public static /* synthetic */ RecaptchaAction copy$default(@NonNull RecaptchaAction recaptchaAction, @NonNull String str, int i, @NonNull Object obj) {
        if ((i & 1) != 0) {
            str = recaptchaAction.action;
        }
        return recaptchaAction.copy(str);
    }

    @NotNull
    public static final RecaptchaAction custom(@NonNull String str) {
        return Companion.custom(str);
    }

    @NotNull
    public final String component1() {
        return this.action;
    }

    @NotNull
    public final RecaptchaAction copy(@NonNull String str) {
        return new RecaptchaAction(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecaptchaAction) && Intrinsics.a(this.action, ((RecaptchaAction) obj).action);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    public int hashCode() {
        return this.action.hashCode();
    }

    @NotNull
    public String toString() {
        return AbstractC0324Hi.h(new StringBuilder("RecaptchaAction(action="), this.action, ")");
    }

    public /* synthetic */ RecaptchaAction(@NonNull String str, @NonNull DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
