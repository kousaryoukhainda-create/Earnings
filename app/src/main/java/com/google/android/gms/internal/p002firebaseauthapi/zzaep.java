package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaep  reason: invalid package */
/* loaded from: classes3.dex */
public class zzaep {
    private zzaep() {
    }

    public static Object zza(String str, Type type) throws zzaci {
        if (type == String.class) {
            try {
                zzagl zzaglVar = (zzagl) new zzagl().zza(str);
                if (zzaglVar.zzb()) {
                    return zzaglVar.zza();
                }
                throw new zzaci("No error message: " + str);
            } catch (Exception e) {
                throw new zzaci(AbstractC2437ph.g("Json conversion failed! ", e.getMessage()), e);
            }
        } else if (type == Void.class) {
            return null;
        } else {
            try {
                try {
                    return ((zzaer) ((Class) type).getConstructor(null).newInstance(null)).zza(str);
                } catch (Exception e2) {
                    throw new zzaci(AbstractC2437ph.g("Json conversion failed! ", e2.getMessage()), e2);
                }
            } catch (Exception e3) {
                throw new zzaci("Instantiation of JsonResponse failed! ".concat(String.valueOf(type)), e3);
            }
        }
    }
}
