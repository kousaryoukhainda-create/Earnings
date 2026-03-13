package com.google.android.gms.analytics;

import androidx.annotation.NonNull;
/* loaded from: classes3.dex */
public interface ExceptionParser {
    @NonNull
    String getDescription(String str, @NonNull Throwable th);
}
