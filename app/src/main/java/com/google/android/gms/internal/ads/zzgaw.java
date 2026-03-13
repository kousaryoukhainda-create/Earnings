package com.google.android.gms.internal.ads;
/* loaded from: classes3.dex */
abstract class zzgaw extends zzgbx implements Runnable {
    InterfaceFutureC2490qH zza;
    Class zzb;
    Object zzc;

    public zzgaw(InterfaceFutureC2490qH interfaceFutureC2490qH, Class cls, Object obj) {
        interfaceFutureC2490qH.getClass();
        this.zza = interfaceFutureC2490qH;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            qH r0 = r10.zza
            java.lang.Class r1 = r10.zzb
            java.lang.Object r2 = r10.zzc
            r3 = 0
            r4 = 1
            if (r0 != 0) goto Lc
            r5 = 1
            goto Ld
        Lc:
            r5 = 0
        Ld:
            if (r1 != 0) goto L11
            r6 = 1
            goto L12
        L11:
            r6 = 0
        L12:
            r5 = r5 | r6
            if (r2 != 0) goto L16
            r3 = 1
        L16:
            r3 = r3 | r5
            if (r3 != 0) goto L92
            boolean r3 = r10.isCancelled()
            if (r3 == 0) goto L21
            goto L92
        L21:
            r3 = 0
            r10.zza = r3
            boolean r4 = r0 instanceof com.google.android.gms.internal.ads.zzgdl     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            if (r4 == 0) goto L34
            r4 = r0
            com.google.android.gms.internal.ads.zzgdl r4 = (com.google.android.gms.internal.ads.zzgdl) r4     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            java.lang.Throwable r4 = r4.zzl()     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L35
        L30:
            r4 = move-exception
            goto L3c
        L32:
            r4 = move-exception
            goto L3e
        L34:
            r4 = r3
        L35:
            if (r4 != 0) goto L3c
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzgch.zzp(r0)     // Catch: java.lang.Throwable -> L30 java.util.concurrent.ExecutionException -> L32
            goto L65
        L3c:
            r5 = r3
            goto L65
        L3e:
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L63
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r7 = "Future type "
            java.lang.String r8 = " threw "
            java.lang.String r9 = " without a cause"
            java.lang.String r4 = defpackage.AbstractC2437ph.j(r7, r6, r8, r4, r9)
            r5.<init>(r4)
        L63:
            r4 = r5
            goto L3c
        L65:
            if (r4 != 0) goto L6b
            r10.zzc(r5)
            return
        L6b:
            boolean r1 = r1.isInstance(r4)
            if (r1 == 0) goto L8f
            java.lang.Object r0 = r10.zze(r2, r4)     // Catch: java.lang.Throwable -> L7d
            r10.zzb = r3
            r10.zzc = r3
            r10.zzf(r0)
            return
        L7d:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzgda.zza(r0)     // Catch: java.lang.Throwable -> L89
            r10.zzd(r0)     // Catch: java.lang.Throwable -> L89
            r10.zzb = r3
            r10.zzc = r3
            return
        L89:
            r0 = move-exception
            r10.zzb = r3
            r10.zzc = r3
            throw r0
        L8f:
            r10.zzs(r0)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgaw.run():void");
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final String zza() {
        String str;
        InterfaceFutureC2490qH interfaceFutureC2490qH = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zza = super.zza();
        if (interfaceFutureC2490qH != null) {
            str = AbstractC2437ph.h("inputFuture=[", interfaceFutureC2490qH.toString(), "], ");
        } else {
            str = "";
        }
        if (cls != null && obj != null) {
            String obj2 = cls.toString();
            String obj3 = obj.toString();
            return str + "exceptionType=[" + obj2 + "], fallback=[" + obj3 + "]";
        } else if (zza != null) {
            return str.concat(zza);
        } else {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public abstract Object zze(Object obj, Throwable th) throws Exception;

    public abstract void zzf(Object obj);
}
