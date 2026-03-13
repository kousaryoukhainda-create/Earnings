package com.google.android.gms.internal.auth;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes3.dex */
public abstract class zzdc {
    public static final /* synthetic */ int zzd = 0;
    private static volatile zzda zze = null;
    private static volatile boolean zzf = false;
    final zzcz zzb;
    final String zzc;
    private final Object zzj;
    private volatile int zzk = -1;
    private volatile Object zzl;
    private static final Object zza = new Object();
    private static final AtomicReference zzg = new AtomicReference();
    private static final zzde zzh = new zzde(new Object() { // from class: com.google.android.gms.internal.auth.zzcu
    });
    private static final AtomicInteger zzi = new AtomicInteger();

    public /* synthetic */ zzdc(zzcz zzczVar, String str, Object obj, boolean z, zzdb zzdbVar) {
        if (zzczVar.zza != null) {
            this.zzb = zzczVar;
            this.zzc = str;
            this.zzj = obj;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    public static void zzc() {
        zzi.incrementAndGet();
    }

    public static void zzd(final Context context) {
        if (zze == null && context != null) {
            Object obj = zza;
            synchronized (obj) {
                try {
                    if (zze == null) {
                        synchronized (obj) {
                            zzda zzdaVar = zze;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (zzdaVar != null) {
                                if (zzdaVar.zza() != context) {
                                }
                            }
                            zzcg.zzd();
                            zzdd.zzc();
                            zzco.zze();
                            zze = new zzcd(context, zzdo.zza(new zzdj() { // from class: com.google.android.gms.internal.auth.zzct
                                @Override // com.google.android.gms.internal.auth.zzdj
                                public final Object zza() {
                                    Context context2 = context;
                                    int i = zzdc.zzd;
                                    return zzcp.zza(context2);
                                }
                            }));
                            zzi.incrementAndGet();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public abstract Object zza(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzb() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = com.google.android.gms.internal.auth.zzdc.zzi
            int r0 = r0.get()
            int r1 = r8.zzk
            if (r1 >= r0) goto Lca
            monitor-enter(r8)
            int r1 = r8.zzk     // Catch: java.lang.Throwable -> L3b
            if (r1 >= r0) goto Lc6
            com.google.android.gms.internal.auth.zzda r1 = com.google.android.gms.internal.auth.zzdc.zze     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzdh r2 = com.google.android.gms.internal.auth.zzdh.zzc()     // Catch: java.lang.Throwable -> L3b
            r3 = 0
            if (r1 == 0) goto L3e
            com.google.android.gms.internal.auth.zzdj r2 = r1.zzb()     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r2 = r2.zza()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzdh r2 = (com.google.android.gms.internal.auth.zzdh) r2     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r2.zzb()     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L3e
            java.lang.Object r4 = r2.zza()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzci r4 = (com.google.android.gms.internal.auth.zzci) r4     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzcz r5 = r8.zzb     // Catch: java.lang.Throwable -> L3b
            android.net.Uri r6 = r5.zza     // Catch: java.lang.Throwable -> L3b
            java.lang.String r5 = r5.zzc     // Catch: java.lang.Throwable -> L3b
            java.lang.String r7 = r8.zzc     // Catch: java.lang.Throwable -> L3b
            java.lang.String r4 = r4.zza(r6, r3, r5, r7)     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r0 = move-exception
            goto Lc8
        L3e:
            r4 = r3
        L3f:
            java.lang.String r5 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto Lc0
            com.google.android.gms.internal.auth.zzcz r5 = r8.zzb     // Catch: java.lang.Throwable -> L3b
            android.net.Uri r5 = r5.zza     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L68
            android.content.Context r6 = r1.zza()     // Catch: java.lang.Throwable -> L3b
            boolean r5 = com.google.android.gms.internal.auth.zzcq.zza(r6, r5)     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L66
            android.content.Context r5 = r1.zza()     // Catch: java.lang.Throwable -> L3b
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzcz r6 = r8.zzb     // Catch: java.lang.Throwable -> L3b
            android.net.Uri r6 = r6.zza     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzcs r7 = new java.lang.Runnable() { // from class: com.google.android.gms.internal.auth.zzcs
                static {
                    /*
                        com.google.android.gms.internal.auth.zzcs r0 = new com.google.android.gms.internal.auth.zzcs
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.google.android.gms.internal.auth.zzcs) com.google.android.gms.internal.auth.zzcs.zza com.google.android.gms.internal.auth.zzcs
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcs.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcs.<init>():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        r0 = this;
                        com.google.android.gms.internal.auth.zzdc.zzc()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcs.run():void");
                }
            }     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzcg r5 = com.google.android.gms.internal.auth.zzcg.zza(r5, r6, r7)     // Catch: java.lang.Throwable -> L3b
            goto L72
        L66:
            r5 = r3
            goto L72
        L68:
            android.content.Context r5 = r1.zza()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzcs r6 = com.google.android.gms.internal.auth.zzcs.zza     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzdd r5 = com.google.android.gms.internal.auth.zzdd.zza(r5, r3, r6)     // Catch: java.lang.Throwable -> L3b
        L72:
            if (r5 == 0) goto L81
            java.lang.String r6 = r8.zzc     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r5 = r5.zzb(r6)     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L81
            java.lang.Object r5 = r8.zza(r5)     // Catch: java.lang.Throwable -> L3b
            goto L82
        L81:
            r5 = r3
        L82:
            if (r5 != 0) goto Lac
            com.google.android.gms.internal.auth.zzcz r5 = r8.zzb     // Catch: java.lang.Throwable -> L3b
            boolean r5 = r5.zzd     // Catch: java.lang.Throwable -> L3b
            if (r5 != 0) goto La6
            android.content.Context r1 = r1.zza()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzco r1 = com.google.android.gms.internal.auth.zzco.zza(r1)     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.auth.zzcz r5 = r8.zzb     // Catch: java.lang.Throwable -> L3b
            boolean r5 = r5.zzd     // Catch: java.lang.Throwable -> L3b
            if (r5 == 0) goto L9a
            r5 = r3
            goto L9c
        L9a:
            java.lang.String r5 = r8.zzc     // Catch: java.lang.Throwable -> L3b
        L9c:
            java.lang.String r1 = r1.zzb(r5)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto La6
            java.lang.Object r3 = r8.zza(r1)     // Catch: java.lang.Throwable -> L3b
        La6:
            if (r3 != 0) goto Lab
            java.lang.Object r5 = r8.zzj     // Catch: java.lang.Throwable -> L3b
            goto Lac
        Lab:
            r5 = r3
        Lac:
            boolean r1 = r2.zzb()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto Lbb
            if (r4 != 0) goto Lb7
            java.lang.Object r5 = r8.zzj     // Catch: java.lang.Throwable -> L3b
            goto Lbb
        Lb7:
            java.lang.Object r5 = r8.zza(r4)     // Catch: java.lang.Throwable -> L3b
        Lbb:
            r8.zzl = r5     // Catch: java.lang.Throwable -> L3b
            r8.zzk = r0     // Catch: java.lang.Throwable -> L3b
            goto Lc6
        Lc0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3b
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.Throwable -> L3b
        Lc6:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3b
            goto Lca
        Lc8:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3b
            throw r0
        Lca:
            java.lang.Object r0 = r8.zzl
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzdc.zzb():java.lang.Object");
    }
}
