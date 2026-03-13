package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdv {
    private final Deque zza = new ArrayDeque(16);

    private zzdv(boolean z) {
    }

    public static zzdv zza() {
        return new zzdv(false);
    }

    private final long zzh() {
        if (this.zza.isEmpty()) {
            return 0L;
        }
        return ((Long) this.zza.peek()).longValue();
    }

    private final void zzi(long j) {
        this.zza.pop();
        this.zza.push(Long.valueOf(j));
    }

    public final void zzb() throws IOException {
        if (this.zza.isEmpty()) {
            return;
        }
        int size = this.zza.size();
        long zzh = zzh();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + zzh);
    }

    public final void zzc() throws IOException {
        long zzh = zzh();
        if (zzh < 0) {
            if (zzh != -5) {
                this.zza.pop();
                return;
            }
            throw new IOException("expected a value for dangling key in indefinite-length map");
        }
        throw new IOException(BK.l(zzh, "expected indefinite length scope but found "));
    }

    public final void zzd() throws IOException {
        long zzh = zzh();
        if (zzh != -1) {
            if (zzh != -2) {
                return;
            }
            zzh = -2;
        }
        throw new IOException(BK.l(zzh, "expected non-string scope but found "));
    }

    public final void zze(long j) throws IOException {
        long zzh = zzh();
        if (zzh != j) {
            if (zzh != -1) {
                if (zzh == -2) {
                    zzh = -2;
                } else {
                    return;
                }
            }
            StringBuilder k = AbstractC0324Hi.k(j, "expected non-string scope or scope ", " but found ");
            k.append(zzh);
            throw new IOException(k.toString());
        }
    }

    public final void zzf() {
        long zzh = zzh();
        int i = (zzh > 1L ? 1 : (zzh == 1L ? 0 : -1));
        if (i == 0) {
            this.zza.pop();
        } else if (i > 0) {
            zzi(zzh - 1);
        } else if (zzh == -4) {
            zzi(-5L);
        } else if (zzh == -5) {
            zzi(-4L);
        }
    }

    public final void zzg(long j) {
        this.zza.push(Long.valueOf(j));
    }
}
