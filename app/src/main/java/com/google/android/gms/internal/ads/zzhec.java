package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
public class zzhec implements Iterator, Closeable, zzara {
    private static final zzaqz zza = new zzheb("eof ");
    protected zzaqw zzb;
    protected zzhed zzc;
    zzaqz zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zzhej.zzb(zzhec.class);
    }

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzaqz zzaqzVar = this.zzd;
        if (zzaqzVar == zza) {
            return false;
        }
        if (zzaqzVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zzg.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzaqz) this.zzg.get(i)).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.Iterator
    /* renamed from: zzc */
    public final zzaqz next() {
        zzaqz zzb;
        zzaqz zzaqzVar = this.zzd;
        if (zzaqzVar != null && zzaqzVar != zza) {
            this.zzd = null;
            return zzaqzVar;
        }
        zzhed zzhedVar = this.zzc;
        if (zzhedVar != null && this.zze < this.zzf) {
            try {
                synchronized (zzhedVar) {
                    this.zzc.zze(this.zze);
                    zzb = this.zzb.zzb(this.zzc, this);
                    this.zze = this.zzc.zzb();
                }
                return zzb;
            } catch (EOFException unused) {
                throw new NoSuchElementException();
            } catch (IOException unused2) {
                throw new NoSuchElementException();
            }
        }
        this.zzd = zza;
        throw new NoSuchElementException();
    }

    public final List zzd() {
        if (this.zzc != null && this.zzd != zza) {
            return new zzhei(this.zzg, this);
        }
        return this.zzg;
    }

    public final void zze(zzhed zzhedVar, long j, zzaqw zzaqwVar) throws IOException {
        this.zzc = zzhedVar;
        this.zze = zzhedVar.zzb();
        zzhedVar.zze(zzhedVar.zzb() + j);
        this.zzf = zzhedVar.zzb();
        this.zzb = zzaqwVar;
    }
}
