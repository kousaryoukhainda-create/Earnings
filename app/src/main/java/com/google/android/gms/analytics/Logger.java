package com.google.android.gms.analytics;

import androidx.annotation.NonNull;
@Deprecated
/* loaded from: classes3.dex */
public interface Logger {

    @Deprecated
    /* loaded from: classes3.dex */
    public static class LogLevel {
        public static final int ERROR = 3;
        public static final int INFO = 1;
        public static final int VERBOSE = 0;
        public static final int WARNING = 2;
    }

    @Deprecated
    void error(@NonNull Exception exc);

    @Deprecated
    void error(@NonNull String str);

    @Deprecated
    int getLogLevel();

    @Deprecated
    void info(@NonNull String str);

    @Deprecated
    void setLogLevel(int i);

    @Deprecated
    void verbose(@NonNull String str);

    @Deprecated
    void warn(@NonNull String str);
}
