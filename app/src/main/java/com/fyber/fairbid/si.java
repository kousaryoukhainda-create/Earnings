package com.fyber.fairbid;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class si implements Callable<String> {
    public final String a;

    public si(@NonNull String str) {
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final String call() throws Exception {
        try {
            h9 a = new h9(this.a).a();
            if (a.c) {
                return a.f;
            }
            throw new IOException("The connection has not been opened yet.");
        } catch (IOException e) {
            C2053lA.c(e, "RemoteFileOperation", e.getMessage());
            return null;
        }
    }
}
