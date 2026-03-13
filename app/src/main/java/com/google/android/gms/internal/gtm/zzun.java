package com.google.android.gms.internal.gtm;

import java.io.IOException;
/* loaded from: classes3.dex */
public final class zzun extends IOException {
    public zzun() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzun(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    public zzun(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
