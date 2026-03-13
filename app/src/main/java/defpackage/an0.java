package defpackage;

import android.os.Binder;
import com.google.android.gms.internal.measurement.zzjt;
/* renamed from: an0  reason: default package */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class an0 {
    public static Object a(zzjt zzjtVar) {
        try {
            return zzjtVar.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return zzjtVar.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
