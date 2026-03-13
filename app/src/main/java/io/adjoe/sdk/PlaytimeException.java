package io.adjoe.sdk;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes2.dex */
public class PlaytimeException extends Exception {
    public PlaytimeException(String str) {
        this(str, null, 2, null);
    }

    public PlaytimeException(String str, Throwable th) {
        super(str, th);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Errors implements InterfaceC2434pf0 {
        public static final Errors ACTIVITY_IS_NULL;
        public static final Errors CATALOG_NOT_AVAILABLE;
        public static final Errors CONTAINER_IS_NULL;
        public static final Errors CONTEXT_IS_NULL;
        public static final Errors DEVICE_ERROR;
        public static final Errors EMPTY_SDK_HASH;
        public static final Errors GET_CATALOG_INTENT_NOT_RUN_IN_MAIN;
        public static final Errors INIT_NOT_RUN_IN_MAIN;
        public static final Errors INTERNAL_ERROR;
        public static final Errors INVALID_SDK_HASH;
        public static final Errors MALFORMED_TIMESTAMP;
        public static final Errors OLD_GAID_EXIST;
        public static final Errors PARTNER_APP_IS_NULL;
        public static final Errors TOS_NOT_GIVEN;
        public static final Errors USAGE_PERMISSION_NOT_GIVEN;
        public static final /* synthetic */ Errors[] b;
        public static final /* synthetic */ C0488Nr c;

        static {
            Errors errors = new Errors("CONTEXT_IS_NULL", 0, null);
            CONTEXT_IS_NULL = errors;
            Errors errors2 = new Errors("ACTIVITY_IS_NULL", 1, null);
            ACTIVITY_IS_NULL = errors2;
            Errors errors3 = new Errors("CONTAINER_IS_NULL", 2, null);
            CONTAINER_IS_NULL = errors3;
            Errors errors4 = new Errors("INIT_NOT_RUN_IN_MAIN", 3, null);
            INIT_NOT_RUN_IN_MAIN = errors4;
            Errors errors5 = new Errors("GET_CATALOG_INTENT_NOT_RUN_IN_MAIN", 4, null);
            GET_CATALOG_INTENT_NOT_RUN_IN_MAIN = errors5;
            Errors errors6 = new Errors("DEVICE_ERROR", 5, null);
            DEVICE_ERROR = errors6;
            Errors errors7 = new Errors("CATALOG_NOT_AVAILABLE", 6, null);
            CATALOG_NOT_AVAILABLE = errors7;
            Errors errors8 = new Errors("USAGE_PERMISSION_NOT_GIVEN", 7, null);
            USAGE_PERMISSION_NOT_GIVEN = errors8;
            Errors errors9 = new Errors("TOS_NOT_GIVEN", 8, null);
            TOS_NOT_GIVEN = errors9;
            Errors errors10 = new Errors("PARTNER_APP_IS_NULL", 9, null);
            PARTNER_APP_IS_NULL = errors10;
            Errors errors11 = new Errors("OLD_GAID_EXIST", 10, null);
            OLD_GAID_EXIST = errors11;
            Errors errors12 = new Errors("MALFORMED_TIMESTAMP", 11, null);
            MALFORMED_TIMESTAMP = errors12;
            Errors errors13 = new Errors("EMPTY_SDK_HASH", 12, null);
            EMPTY_SDK_HASH = errors13;
            Errors errors14 = new Errors("INVALID_SDK_HASH", 13, null);
            INVALID_SDK_HASH = errors14;
            Errors errors15 = new Errors("INTERNAL_ERROR", 14, null);
            INTERNAL_ERROR = errors15;
            Errors[] errorsArr = {errors, errors2, errors3, errors4, errors5, errors6, errors7, errors8, errors9, errors10, errors11, errors12, errors13, errors14, errors15};
            b = errorsArr;
            c = AbstractC1281eb.u(errorsArr);
        }

        public Errors(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public static InterfaceC0462Mr getEntries() {
            return c;
        }

        public static Errors valueOf(String str) {
            return (Errors) Enum.valueOf(Errors.class, str);
        }

        public static Errors[] values() {
            return (Errors[]) b.clone();
        }

        @Override // defpackage.InterfaceC2434pf0
        @NotNull
        public String computeHash(@NotNull String str) {
            return AbstractC0867af0.c(str);
        }

        @NotNull
        public String getCode(@NotNull String str) {
            return AbstractC0867af0.b(this, str);
        }

        @Override // defpackage.InterfaceC2434pf0
        public abstract /* synthetic */ String getMessage();

        @Override // defpackage.InterfaceC2434pf0
        public /* bridge */ /* synthetic */ int getOrdinal() {
            return ordinal();
        }

        @NotNull
        /* renamed from: getThrowable */
        public PlaytimeException m30getThrowable() {
            return new PlaytimeException(getCode(String.valueOf(AbstractC3019wV.a(PlaytimeException.class).b())), null, 2, null);
        }

        @NotNull
        /* renamed from: getThrowable */
        public PlaytimeException m32getThrowable(@NotNull Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new PlaytimeException(getCode(String.valueOf(AbstractC3019wV.a(PlaytimeException.class).b())), cause);
        }

        @NotNull
        /* renamed from: getThrowable */
        public PlaytimeException m31getThrowable(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new PlaytimeException(message, null, 2, null);
        }
    }

    public /* synthetic */ PlaytimeException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaytimeException(@NotNull Exception exception) {
        super(exception);
        Intrinsics.checkNotNullParameter(exception, "exception");
    }
}
