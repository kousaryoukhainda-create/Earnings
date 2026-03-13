package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaew  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzaew {
    private Context zza;
    private zzafp zzb;
    private String zzc;
    private final C1571hv zzd;
    private boolean zze;
    private String zzf;

    public zzaew(Context context, C1571hv c1571hv, String str) {
        this.zze = false;
        this.zza = (Context) Preconditions.checkNotNull(context);
        this.zzd = (C1571hv) Preconditions.checkNotNull(c1571hv);
        this.zzc = AbstractC2437ph.g("Android/Fallback/", str);
    }

    private static String zza(C1571hv c1571hv) {
        InterfaceC3088xE interfaceC3088xE = (InterfaceC3088xE) FirebaseAuth.getInstance(c1571hv).v.get();
        if (interfaceC3088xE == null) {
            return null;
        }
        try {
            C2620rn c2620rn = (C2620rn) interfaceC3088xE;
            C0406Km c0406Km = (C0406Km) Tasks.await(c2620rn.j.continueWithTask(c2620rn.h, new C2535qn(c2620rn)));
            C0285Fv c0285Fv = c0406Km.b;
            if (c0285Fv != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(c0285Fv)));
            }
            return c0406Km.a;
        } catch (InterruptedException e) {
            e = e;
            AbstractC0324Hi.v("Unexpected error getting App Check token: ", e.getMessage(), "LocalRequestInterceptor");
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            AbstractC0324Hi.v("Unexpected error getting App Check token: ", e.getMessage(), "LocalRequestInterceptor");
            return null;
        }
    }

    private static String zzb(C1571hv c1571hv) {
        InterfaceC3085xB interfaceC3085xB = (InterfaceC3085xB) FirebaseAuth.getInstance(c1571hv).w.get();
        if (interfaceC3085xB != null) {
            try {
                return (String) Tasks.await(((C3050wn) interfaceC3085xB).b());
            } catch (InterruptedException | ExecutionException e) {
                String message = e.getMessage();
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + message);
            }
        }
        return null;
    }

    public final void zzb(String str) {
        this.zzf = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzaew(C1571hv c1571hv, String str) {
        this(c1571hv.a, c1571hv, str);
        c1571hv.a();
    }

    public final void zza(URLConnection uRLConnection) {
        String f;
        if (this.zze) {
            f = AbstractC0324Hi.f(this.zzc, "/FirebaseUI-Android");
        } else {
            f = AbstractC0324Hi.f(this.zzc, "/FirebaseCore-Android");
        }
        if (this.zzb == null) {
            this.zzb = new zzafp(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzaev.zza());
        uRLConnection.setRequestProperty("X-Client-Version", f);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        C1571hv c1571hv = this.zzd;
        c1571hv.a();
        uRLConnection.setRequestProperty("X-Firebase-GMPID", c1571hv.c.b);
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String zza = zza(this.zzd);
        if (!TextUtils.isEmpty(zza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", zza);
        }
        this.zzf = null;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }
}
