package com.google.android.recaptcha;

import android.app.Application;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
@Metadata
/* loaded from: classes.dex */
public final class Recaptcha {
    @NotNull
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    @NotNull
    public static final Task<RecaptchaTasksClient> fetchTaskClient(@NonNull Application application, @NonNull String str) {
        return zzcq.zze(application, str);
    }

    @NonNull
    /* renamed from: getClient-BWLJW6A$default  reason: not valid java name */
    public static /* synthetic */ Object m11getClientBWLJW6A$default(@NonNull Recaptcha recaptcha, @NonNull Application application, @NonNull String str, long j, @NonNull InterfaceC2868ui interfaceC2868ui, int i, @NonNull Object obj) {
        if ((i & 4) != 0) {
            j = 10000;
        }
        return recaptcha.m12getClientBWLJW6A(application, str, j, interfaceC2868ui);
    }

    @NotNull
    public static final Task<RecaptchaTasksClient> getTasksClient(@NonNull Application application, @NonNull String str) {
        return zzcq.zzc(application, str, 10000L);
    }

    public final Object fetchClient(@NonNull Application application, @NonNull String str, @NonNull InterfaceC2868ui interfaceC2868ui) {
        return zzcq.zzd(application, str, interfaceC2868ui);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* renamed from: getClient-BWLJW6A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m12getClientBWLJW6A(@androidx.annotation.NonNull android.app.Application r5, @androidx.annotation.NonNull java.lang.String r6, long r7, @androidx.annotation.NonNull defpackage.InterfaceC2868ui r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.Recaptcha$getClient$1
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = (com.google.android.recaptcha.Recaptcha$getClient$1) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.Recaptcha$getClient$1 r0 = new com.google.android.recaptcha.Recaptcha$getClient$1
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.zza
            Ui r1 = defpackage.EnumC0661Ui.b
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.AbstractC1522hL.T(r9)     // Catch: java.lang.Throwable -> L27
            goto L3d
        L27:
            r5 = move-exception
            goto L40
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.AbstractC1522hL.T(r9)
            r0.zzc = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r9 = com.google.android.recaptcha.internal.zzcq.zzb(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L27
            if (r9 != r1) goto L3d
            return r1
        L3d:
            com.google.android.recaptcha.internal.zzdc r9 = (com.google.android.recaptcha.internal.zzdc) r9     // Catch: java.lang.Throwable -> L27
            goto L44
        L40:
            IW r9 = defpackage.AbstractC1522hL.k(r5)
        L44:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.Recaptcha.m12getClientBWLJW6A(android.app.Application, java.lang.String, long, ui):java.lang.Object");
    }

    @NotNull
    public static final Task<RecaptchaTasksClient> getTasksClient(@NonNull Application application, @NonNull String str, long j) {
        return zzcq.zzc(application, str, j);
    }
}
