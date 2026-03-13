package com.google.android.gms.auth;

import androidx.annotation.NonNull;
/* loaded from: classes3.dex */
public class GoogleAuthException extends Exception {
    public GoogleAuthException() {
    }

    public GoogleAuthException(String str) {
        super(str);
    }

    public GoogleAuthException(String str, @NonNull Throwable th) {
        super(str, th);
    }

    public GoogleAuthException(@NonNull Throwable th) {
        super(th);
    }
}
