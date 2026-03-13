package io.flutter.plugins.webviewflutter;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes2.dex */
public final class ResultCompat<T> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final Throwable exception;
    private final boolean isFailure;
    private final boolean isSuccess;
    @NotNull
    private final Object result;
    private final T value;

    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final B90 asCompatCallback$lambda$0(Function1 function1, JW jw) {
            function1.invoke(new ResultCompat(jw.b));
            return B90.a;
        }

        @NotNull
        public final <T> Function1 asCompatCallback(@NotNull Function1 result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new r(result, 2);
        }

        public final <T> void success(T t, @NotNull Object callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            AbstractC1424g90.g(1, callback);
            ((Function1) callback).invoke(new JW(t));
        }

        private Companion() {
        }
    }

    public ResultCompat(@NotNull Object obj) {
        T t;
        this.result = obj;
        boolean z = obj instanceof IW;
        if (z) {
            t = null;
        } else {
            t = (T) obj;
        }
        this.value = t;
        this.exception = JW.a(obj);
        this.isSuccess = !z;
        this.isFailure = z;
    }

    @NotNull
    public static final <T> Function1 asCompatCallback(@NotNull Function1 function1) {
        return Companion.asCompatCallback(function1);
    }

    public static final <T> void success(T t, @NotNull Object obj) {
        Companion.success(t, obj);
    }

    public final Throwable exceptionOrNull() {
        return this.exception;
    }

    public final T getOrNull() {
        return this.value;
    }

    @NotNull
    /* renamed from: getResult-d1pmJ48  reason: not valid java name */
    public final Object m36getResultd1pmJ48() {
        return this.result;
    }

    public final boolean isFailure() {
        return this.isFailure;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }
}
