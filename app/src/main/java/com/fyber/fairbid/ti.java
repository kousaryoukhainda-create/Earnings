package com.fyber.fairbid;

import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
/* loaded from: classes.dex */
public final class ti implements Runnable {
    public final el a;
    public final ui b;

    public ti(@NonNull el elVar, ui uiVar) {
        this.a = elVar;
        this.b = uiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            String a = this.a.a();
            C2053lA.b("ReporterOperation", "event will be sent to " + a);
            h9 a2 = new h9(a).a();
            if (a2.c) {
                int i = a2.d;
                C2053lA.b("ReporterOperation", "Server returned status code: " + i);
                if (i == 200) {
                    this.b.getClass();
                    return;
                }
                this.b.getClass();
                String str = "Report was unsuccessful. Response code: " + i;
                if (C2053lA.c) {
                    C2053lA.e("InstallReporter", str);
                    return;
                } else {
                    Log.i("InstallReporter", str);
                    return;
                }
            }
            throw new IOException("The connection has not been opened yet.");
        } catch (IOException e) {
            C2053lA.c(e, "ReporterOperation", "An error occurred");
        }
    }
}
