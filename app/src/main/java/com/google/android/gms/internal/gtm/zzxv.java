package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzxp;
import com.google.android.gms.internal.gtm.zzxv;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes3.dex */
public abstract class zzxv<MessageType extends zzxv<MessageType, BuilderType>, BuilderType extends zzxp<MessageType, BuilderType>> extends zztl<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzaal zzc = zzaal.zzc();

    public static zzxt zzaa(zzzg zzzgVar, zzzg zzzgVar2, zzxy zzxyVar, int i, zzaba zzabaVar, boolean z, Class cls) {
        return new zzxt(zzzgVar, Collections.emptyList(), zzzgVar2, new zzxs(null, i, zzabaVar, true, false), cls);
    }

    public static zzxt zzab(zzzg zzzgVar, Object obj, zzzg zzzgVar2, zzxy zzxyVar, int i, zzaba zzabaVar, Class cls) {
        return new zzxt(zzzgVar, obj, zzzgVar2, new zzxs(zzxyVar, i, zzabaVar, false, false), cls);
    }

    public static zzxv zzac(Class cls) {
        Map map = zza;
        zzxv zzxvVar = (zzxv) map.get(cls);
        if (zzxvVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzxvVar = (zzxv) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzxvVar == null) {
            zzxvVar = (zzxv) ((zzxv) zzaau.zze(cls)).zzb(6, null, null);
            if (zzxvVar != null) {
                map.put(cls, zzxvVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzxvVar;
    }

    public static zzxv zzae(zzxv zzxvVar, InputStream inputStream, zzxf zzxfVar) throws zzyg {
        zzuh zzuhVar = new zzuh(inputStream, 4096, null);
        zzxv zzad = zzxvVar.zzad();
        try {
            zzzt zzb = zzzp.zza().zzb(zzad.getClass());
            zzb.zzh(zzad, zzuk.zzq(zzuhVar), zzxfVar);
            zzb.zzf(zzad);
            zze(zzad);
            return zzad;
        } catch (zzaaj e) {
            zzyg zza2 = e.zza();
            zza2.zzh(zzad);
            throw zza2;
        } catch (zzyg e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzyg(e);
            }
            e.zzh(zzad);
            throw e;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzyg) {
                throw ((zzyg) e3.getCause());
            }
            zzyg zzygVar = new zzyg(e3);
            zzygVar.zzh(zzad);
            throw zzygVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzyg) {
                throw ((zzyg) e4.getCause());
            }
            throw e4;
        }
    }

    public static zzxv zzaf(zzxv zzxvVar, byte[] bArr, zzxf zzxfVar) throws zzyg {
        zzxv zzf = zzf(zzxvVar, bArr, 0, bArr.length, zzxfVar);
        zze(zzf);
        return zzf;
    }

    public static zzya zzag() {
        return zzxw.zzf();
    }

    public static zzyd zzah() {
        return zzzq.zze();
    }

    public static zzyd zzai(zzyd zzydVar) {
        int i;
        int size = zzydVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzydVar.zzd(i);
    }

    public static Object zzaj(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Object zzak(zzzg zzzgVar, String str, Object[] objArr) {
        return new zzzr(zzzgVar, str, objArr);
    }

    public static void zzan(Class cls, zzxv zzxvVar) {
        zzxvVar.zzam();
        zza.put(cls, zzxvVar);
    }

    public static final boolean zzap(zzxv zzxvVar, boolean z) {
        Object obj;
        byte byteValue = ((Byte) zzxvVar.zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzzp.zza().zzb(zzxvVar.getClass()).zzk(zzxvVar);
        if (z) {
            if (true != zzk) {
                obj = null;
            } else {
                obj = zzxvVar;
            }
            zzxvVar.zzb(2, obj, null);
        }
        return zzk;
    }

    private final int zzc(zzzt zzztVar) {
        return zzzp.zza().zzb(getClass()).zza(this);
    }

    private static zzxv zze(zzxv zzxvVar) throws zzyg {
        if (zzxvVar != null && !zzxvVar.zzay()) {
            zzyg zza2 = new zzaaj(zzxvVar).zza();
            zza2.zzh(zzxvVar);
            throw zza2;
        }
        return zzxvVar;
    }

    private static zzxv zzf(zzxv zzxvVar, byte[] bArr, int i, int i2, zzxf zzxfVar) throws zzyg {
        zzxv zzad = zzxvVar.zzad();
        try {
            zzzt zzb = zzzp.zza().zzb(zzad.getClass());
            zzb.zzi(zzad, bArr, 0, i2, new zztp(zzxfVar));
            zzb.zzf(zzad);
            return zzad;
        } catch (zzaaj e) {
            zzyg zza2 = e.zza();
            zza2.zzh(zzad);
            throw zza2;
        } catch (zzyg e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzyg(e);
            }
            e.zzh(zzad);
            throw e;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzyg) {
                throw ((zzyg) e3.getCause());
            }
            zzyg zzygVar = new zzyg(e3);
            zzygVar.zzh(zzad);
            throw zzygVar;
        } catch (IndexOutOfBoundsException unused) {
            zzyg zzj = zzyg.zzj();
            zzj.zzh(zzad);
            throw zzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzzp.zza().zzb(getClass()).zzj(this, (zzxv) obj);
    }

    public final int hashCode() {
        if (!zzaq()) {
            int i = this.zzb;
            if (i == 0) {
                int zzW = zzW();
                this.zzb = zzW;
                return zzW;
            }
            return i;
        }
        return zzW();
    }

    public final String toString() {
        return zzzi.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.gtm.zztl
    public final int zzQ(zzzt zzztVar) {
        if (zzaq()) {
            int zza2 = zzztVar.zza(this);
            if (zza2 >= 0) {
                return zza2;
            }
            throw new IllegalStateException(AbstractC0324Hi.e(zza2, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int zza3 = zzztVar.zza(this);
            if (zza3 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | zza3;
                return zza3;
            }
            throw new IllegalStateException(AbstractC0324Hi.e(zza3, "serialized size must be non-negative, was "));
        }
        return i;
    }

    public final int zzW() {
        return zzzp.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final int zzX() {
        int i;
        if (zzaq()) {
            i = zzc(null);
            if (i < 0) {
                throw new IllegalStateException(AbstractC0324Hi.e(i, "serialized size must be non-negative, was "));
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = zzc(null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException(AbstractC0324Hi.e(i, "serialized size must be non-negative, was "));
                }
            }
        }
        return i;
    }

    public final zzxp zzY() {
        return (zzxp) zzb(5, null, null);
    }

    public final zzxp zzZ() {
        zzxp zzxpVar = (zzxp) zzb(5, null, null);
        zzxpVar.zzA(this);
        return zzxpVar;
    }

    public final zzxv zzad() {
        return (zzxv) zzb(4, null, null);
    }

    public final void zzal() {
        zzzp.zza().zzb(getClass()).zzf(this);
        zzam();
    }

    public final void zzam() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void zzao(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean zzaq() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final /* synthetic */ zzzf zzau() {
        return (zzxp) zzb(5, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final /* synthetic */ zzzf zzav() {
        zzxp zzxpVar = (zzxp) zzb(5, null, null);
        zzxpVar.zzA(this);
        return zzxpVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzzg
    public final void zzaw(zzuq zzuqVar) throws IOException {
        zzzp.zza().zzb(getClass()).zzm(this, zzur.zza(zzuqVar));
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final /* synthetic */ zzzg zzax() {
        return (zzxv) zzb(6, null, null);
    }

    @Override // com.google.android.gms.internal.gtm.zzzh
    public final boolean zzay() {
        return zzap(this, true);
    }

    public abstract Object zzb(int i, Object obj, Object obj2);
}
