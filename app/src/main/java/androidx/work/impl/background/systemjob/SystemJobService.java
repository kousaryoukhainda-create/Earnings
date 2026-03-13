package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import java.util.HashMap;
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC2540qs {
    public static final String d = EI.e("SystemJobService");
    public C3291ze0 b;
    public final HashMap c = new HashMap();

    @Override // defpackage.InterfaceC2540qs
    public final void b(String str, boolean z) {
        JobParameters jobParameters;
        EI.c().a(d, AbstractC0324Hi.f(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.c) {
            jobParameters = (JobParameters) this.c.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            C3291ze0 b0 = C3291ze0.b0(getApplicationContext());
            this.b = b0;
            b0.F.a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                EI.c().f(d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C3291ze0 c3291ze0 = this.b;
        if (c3291ze0 != null) {
            c3291ze0.F.f(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStartJob(android.app.job.JobParameters r10) {
        /*
            r9 = this;
            java.lang.String r0 = "onStartJob for "
            java.lang.String r1 = "Job is already being executed by SystemJobService: "
            ze0 r2 = r9.b
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L1b
            EI r0 = defpackage.EI.c()
            java.lang.String r1 = androidx.work.impl.background.systemjob.SystemJobService.d
            java.lang.String r2 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r4]
            r0.a(r1, r2, r5)
            r9.jobFinished(r10, r3)
            return r4
        L1b:
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            r5 = 0
            android.os.PersistableBundle r6 = r10.getExtras()     // Catch: java.lang.NullPointerException -> L2f
            if (r6 == 0) goto L30
            boolean r7 = r6.containsKey(r2)     // Catch: java.lang.NullPointerException -> L2f
            if (r7 == 0) goto L30
            java.lang.String r2 = r6.getString(r2)     // Catch: java.lang.NullPointerException -> L2f
            goto L31
        L2f:
        L30:
            r2 = r5
        L31:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L45
            EI r10 = defpackage.EI.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.d
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]
            r10.b(r0, r1, r2)
            return r4
        L45:
            java.util.HashMap r6 = r9.c
            monitor-enter(r6)
            java.util.HashMap r7 = r9.c     // Catch: java.lang.Throwable -> L69
            boolean r7 = r7.containsKey(r2)     // Catch: java.lang.Throwable -> L69
            if (r7 == 0) goto L6b
            EI r10 = defpackage.EI.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.d     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L69
            r3.append(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L69
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L69
            r10.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L69
            return r4
        L69:
            r10 = move-exception
            goto Lc3
        L6b:
            EI r1 = defpackage.EI.c()     // Catch: java.lang.Throwable -> L69
            java.lang.String r7 = androidx.work.impl.background.systemjob.SystemJobService.d     // Catch: java.lang.Throwable -> L69
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L69
            r8.append(r2)     // Catch: java.lang.Throwable -> L69
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L69
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]     // Catch: java.lang.Throwable -> L69
            r1.a(r7, r0, r4)     // Catch: java.lang.Throwable -> L69
            java.util.HashMap r0 = r9.c     // Catch: java.lang.Throwable -> L69
            r0.put(r2, r10)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L69
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lbd
            YZ r5 = new YZ
            r5.<init>()
            android.net.Uri[] r1 = defpackage.AbstractC2233nI.A(r10)
            if (r1 == 0) goto La3
            android.net.Uri[] r1 = defpackage.AbstractC2233nI.A(r10)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r5.c = r1
        La3:
            java.lang.String[] r1 = defpackage.AbstractC2233nI.B(r10)
            if (r1 == 0) goto Lb3
            java.lang.String[] r1 = defpackage.AbstractC2233nI.B(r10)
            java.util.List r1 = java.util.Arrays.asList(r1)
            r5.b = r1
        Lb3:
            r1 = 28
            if (r0 < r1) goto Lbd
            android.net.Network r10 = defpackage.AQ.g(r10)
            r5.d = r10
        Lbd:
            ze0 r10 = r9.b
            r10.f0(r2, r5)
            return r3
        Lc3:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L69
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStopJob(android.app.job.JobParameters r6) {
        /*
            r5 = this;
            ze0 r0 = r5.b
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            EI r6 = defpackage.EI.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.d
            java.lang.String r3 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r6.a(r0, r3, r2)
            return r1
        L14:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r6 = r6.getExtras()     // Catch: java.lang.NullPointerException -> L27
            if (r6 == 0) goto L27
            boolean r3 = r6.containsKey(r0)     // Catch: java.lang.NullPointerException -> L27
            if (r3 == 0) goto L27
            java.lang.String r6 = r6.getString(r0)     // Catch: java.lang.NullPointerException -> L27
            goto L28
        L27:
            r6 = 0
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L3c
            EI r6 = defpackage.EI.c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.d
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r6.b(r0, r1, r3)
            return r2
        L3c:
            EI r0 = defpackage.EI.c()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.d
            java.lang.String r4 = "onStopJob for "
            java.lang.String r4 = defpackage.AbstractC2437ph.g(r4, r6)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.a(r3, r4, r2)
            java.util.HashMap r0 = r5.c
            monitor-enter(r0)
            java.util.HashMap r2 = r5.c     // Catch: java.lang.Throwable -> L65
            r2.remove(r6)     // Catch: java.lang.Throwable -> L65
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            ze0 r0 = r5.b
            r0.g0(r6)
            ze0 r0 = r5.b
            iT r0 = r0.F
            boolean r6 = r0.d(r6)
            r6 = r6 ^ r1
            return r6
        L65:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
