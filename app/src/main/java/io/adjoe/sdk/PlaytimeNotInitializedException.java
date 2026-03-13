package io.adjoe.sdk;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes2.dex */
public final class PlaytimeNotInitializedException extends Exception {
    public PlaytimeNotInitializedException(String str) {
        this(str, null, 2, null);
    }

    public PlaytimeNotInitializedException(String str, Throwable th) {
        super(str, th);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class Errors implements InterfaceC2434pf0 {
        public static final Errors SDK_NOT_FOUND_IN_MANIFEST;
        public static final Errors SDK_NOT_INITIALIZED;
        public static final /* synthetic */ Errors[] b;
        public static final /* synthetic */ C0488Nr c;

        static {
            Errors errors = new Errors("SDK_NOT_INITIALIZED", 0, null);
            SDK_NOT_INITIALIZED = errors;
            Errors errors2 = new Errors("SDK_NOT_FOUND_IN_MANIFEST", 1, null);
            SDK_NOT_FOUND_IN_MANIFEST = errors2;
            Errors[] errorsArr = {errors, errors2};
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
        public PlaytimeNotInitializedException m33getThrowable() {
            return new PlaytimeNotInitializedException(getCode(String.valueOf(AbstractC3019wV.a(PlaytimeNotInitializedException.class).b())), null, 2, null);
        }

        @NotNull
        /* renamed from: getThrowable */
        public PlaytimeNotInitializedException m35getThrowable(@NotNull Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new PlaytimeNotInitializedException(getCode(String.valueOf(AbstractC3019wV.a(PlaytimeNotInitializedException.class).b())), cause);
        }

        @NotNull
        /* renamed from: getThrowable */
        public PlaytimeNotInitializedException m34getThrowable(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new PlaytimeNotInitializedException(message, null, 2, null);
        }
    }

    public /* synthetic */ PlaytimeNotInitializedException(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
