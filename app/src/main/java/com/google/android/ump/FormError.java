package com.google.android.ump;

import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* loaded from: classes.dex */
public class FormError {
    public final int a;
    public final String b;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i, @RecentlyNonNull String str) {
        this.a = i;
        this.b = str;
    }

    public int getErrorCode() {
        return this.a;
    }

    @RecentlyNonNull
    public String getMessage() {
        return this.b;
    }
}
