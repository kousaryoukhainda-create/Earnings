package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes3.dex */
public abstract class zzkl {
    public static final /* synthetic */ int zzc = 0;
    private static final Object zzd = new Object();
    private static volatile zzkg zze = null;
    private static volatile boolean zzf = false;
    private static final AtomicInteger zzh;
    final zzkf zza;
    final String zzb;
    private Object zzg;
    private volatile int zzi = -1;
    private volatile Object zzj;
    private volatile boolean zzk;

    static {
        new AtomicReference();
        B10.q(zzkj.zza, "BuildInfo must be non-null");
        zzh = new AtomicInteger();
    }

    public /* synthetic */ zzkl(zzkf zzkfVar, String str, Object obj, boolean z, byte[] bArr) {
        if (zzkfVar.zza != null) {
            this.zza = zzkfVar;
            this.zzb = str;
            this.zzg = obj;
            this.zzk = false;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static void zzb(final Context context) {
        if (zze == null && context != null) {
            Object obj = zzd;
            synchronized (obj) {
                try {
                    if (zze == null) {
                        synchronized (obj) {
                            zzkg zzkgVar = zze;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zzkgVar != null) {
                                if (zzkgVar.zza() != context) {
                                }
                            }
                            if (zzkgVar != null) {
                                zzjq.zzd();
                                zzkn.zzb();
                                zzjx.zzc();
                            }
                            zze = new zzjn(context, AbstractC1281eb.F(new X40() { // from class: com.google.android.gms.internal.measurement.zzkk
                                @Override // defpackage.X40
                                public final /* synthetic */ Object get() {
                                    int i = zzkl.zzc;
                                    return zzjy.zza(context);
                                }
                            }));
                            zzh.incrementAndGet();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public static void zzc() {
        zzh.incrementAndGet();
    }

    public abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001c, B:13:0x002f, B:20:0x004b, B:22:0x0056, B:24:0x0060, B:27:0x0072, B:29:0x007a, B:41:0x00a1, B:44:0x00a9, B:45:0x00ac, B:46:0x00b0, B:33:0x0083, B:35:0x0087, B:37:0x0097, B:39:0x009d, B:47:0x00b5, B:48:0x00b8, B:49:0x00b9), top: B:55:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x001c, B:13:0x002f, B:20:0x004b, B:22:0x0056, B:24:0x0060, B:27:0x0072, B:29:0x007a, B:41:0x00a1, B:44:0x00a9, B:45:0x00ac, B:46:0x00b0, B:33:0x0083, B:35:0x0087, B:37:0x0097, B:39:0x009d, B:47:0x00b5, B:48:0x00b8, B:49:0x00b9), top: B:55:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzd() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.measurement.zzkl.zzh
            int r0 = r0.get()
            int r1 = r9.zzi
            if (r1 >= r0) goto Lbd
            monitor-enter(r9)
            int r1 = r9.zzi     // Catch: java.lang.Throwable -> L42
            if (r1 >= r0) goto Lb9
            com.google.android.gms.internal.measurement.zzkg r1 = com.google.android.gms.internal.measurement.zzkl.zze     // Catch: java.lang.Throwable -> L42
            p r2 = defpackage.C2376p.b     // Catch: java.lang.Throwable -> L42
            r3 = 0
            if (r1 == 0) goto L45
            X40 r4 = r1.zzb()     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L45
            X40 r2 = r1.zzb()     // Catch: java.lang.Throwable -> L42
            r2.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L42
            tQ r2 = (defpackage.AbstractC2756tQ) r2     // Catch: java.lang.Throwable -> L42
            boolean r4 = r2.b()     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L45
            java.lang.Object r4 = r2.a()     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzjs r4 = (com.google.android.gms.internal.measurement.zzjs) r4     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzkf r5 = r9.zza     // Catch: java.lang.Throwable -> L42
            android.net.Uri r6 = r5.zza     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = r5.zzc     // Catch: java.lang.Throwable -> L42
            java.lang.String r7 = r9.zzb     // Catch: java.lang.Throwable -> L42
            java.lang.String r4 = r4.zza(r6, r3, r5, r7)     // Catch: java.lang.Throwable -> L42
            goto L46
        L42:
            r0 = move-exception
            goto Lbb
        L45:
            r4 = r3
        L46:
            if (r1 == 0) goto L4a
            r5 = 1
            goto L4b
        L4a:
            r5 = 0
        L4b:
            java.lang.String r6 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            defpackage.B10.v(r6, r5)     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzkf r5 = r9.zza     // Catch: java.lang.Throwable -> L42
            android.net.Uri r6 = r5.zza     // Catch: java.lang.Throwable -> L42
            if (r6 == 0) goto Lb5
            android.content.Context r7 = r1.zza()     // Catch: java.lang.Throwable -> L42
            boolean r7 = com.google.android.gms.internal.measurement.zzjz.zza(r7, r6)     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto L6f
            android.content.Context r7 = r1.zza()     // Catch: java.lang.Throwable -> L42
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzki r8 = com.google.android.gms.internal.measurement.zzki.zza     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzjq r6 = com.google.android.gms.internal.measurement.zzjq.zza(r7, r6, r8)     // Catch: java.lang.Throwable -> L42
            goto L70
        L6f:
            r6 = r3
        L70:
            if (r6 == 0) goto L7f
            java.lang.String r7 = r9.zzb     // Catch: java.lang.Throwable -> L42
            java.lang.Object r6 = r6.zze(r7)     // Catch: java.lang.Throwable -> L42
            if (r6 == 0) goto L7f
            java.lang.Object r6 = r9.zza(r6)     // Catch: java.lang.Throwable -> L42
            goto L80
        L7f:
            r6 = r3
        L80:
            if (r6 == 0) goto L83
            goto La1
        L83:
            boolean r5 = r5.zzd     // Catch: java.lang.Throwable -> L42
            if (r5 != 0) goto L9b
            android.content.Context r1 = r1.zza()     // Catch: java.lang.Throwable -> L42
            com.google.android.gms.internal.measurement.zzjx r1 = com.google.android.gms.internal.measurement.zzjx.zza(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = r9.zzb     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r1.zze(r5)     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L9b
            java.lang.Object r3 = r9.zza(r1)     // Catch: java.lang.Throwable -> L42
        L9b:
            if (r3 != 0) goto La0
            java.lang.Object r6 = r9.zzg     // Catch: java.lang.Throwable -> L42
            goto La1
        La0:
            r6 = r3
        La1:
            boolean r1 = r2.b()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto Lb0
            if (r4 != 0) goto Lac
            java.lang.Object r6 = r9.zzg     // Catch: java.lang.Throwable -> L42
            goto Lb0
        Lac:
            java.lang.Object r6 = r9.zza(r4)     // Catch: java.lang.Throwable -> L42
        Lb0:
            r9.zzj = r6     // Catch: java.lang.Throwable -> L42
            r9.zzi = r0     // Catch: java.lang.Throwable -> L42
            goto Lb9
        Lb5:
            r1.zza()     // Catch: java.lang.Throwable -> L42
            throw r3     // Catch: java.lang.Throwable -> L42
        Lb9:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L42
            goto Lbd
        Lbb:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L42
            throw r0
        Lbd:
            java.lang.Object r0 = r9.zzj
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkl.zzd():java.lang.Object");
    }
}
