package io.flutter.plugins.googlemobileads;

import androidx.annotation.NonNull;
/* loaded from: classes2.dex */
public class FlutterAdValue {
    @NonNull
    final String currencyCode;
    final int precisionType;
    final long valueMicros;

    public FlutterAdValue(int i, @NonNull String str, long j) {
        this.precisionType = i;
        this.currencyCode = str;
        this.valueMicros = j;
    }
}
