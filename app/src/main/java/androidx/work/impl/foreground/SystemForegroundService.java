package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.UUID;
/* loaded from: classes.dex */
public class SystemForegroundService extends KG {
    public static final String h = EI.e("SystemFgService");
    public Handler c;
    public boolean d;
    public C2989w50 f;
    public NotificationManager g;

    public final void a() {
        this.c = new Handler(Looper.getMainLooper());
        this.g = (NotificationManager) getApplicationContext().getSystemService("notification");
        C2989w50 c2989w50 = new C2989w50(getApplicationContext());
        this.f = c2989w50;
        if (c2989w50.k != null) {
            EI.c().b(C2989w50.l, "A callback already exists.", new Throwable[0]);
            return;
        }
        c2989w50.k = this;
    }

    @Override // defpackage.KG, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // defpackage.KG, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.d;
        String str = h;
        if (z) {
            EI.c().d(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f.g();
            a();
            this.d = false;
        }
        if (intent != null) {
            C2989w50 c2989w50 = this.f;
            c2989w50.getClass();
            String action = intent.getAction();
            boolean equals = "ACTION_START_FOREGROUND".equals(action);
            String str2 = C2989w50.l;
            C3291ze0 c3291ze0 = c2989w50.b;
            if (equals) {
                EI.c().d(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
                c2989w50.c.v(new N3(7, c2989w50, c3291ze0.C, intent.getStringExtra("KEY_WORKSPEC_ID")));
                c2989w50.e(intent);
                return 3;
            } else if ("ACTION_NOTIFY".equals(action)) {
                c2989w50.e(intent);
                return 3;
            } else if ("ACTION_CANCEL_WORK".equals(action)) {
                EI.c().d(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra != null && !TextUtils.isEmpty(stringExtra)) {
                    UUID fromString = UUID.fromString(stringExtra);
                    c3291ze0.getClass();
                    c3291ze0.D.v(new C1198dc(c3291ze0, fromString, 0));
                    return 3;
                }
                return 3;
            } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
                EI.c().d(str2, "Stopping foreground service", new Throwable[0]);
                SystemForegroundService systemForegroundService = c2989w50.k;
                if (systemForegroundService != null) {
                    systemForegroundService.d = true;
                    EI.c().a(str, "All commands completed.", new Throwable[0]);
                    if (Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService.stopForeground(true);
                    }
                    systemForegroundService.stopSelf();
                    return 3;
                }
                return 3;
            } else {
                return 3;
            }
        }
        return 3;
    }
}
