package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaez  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzaez implements zzaed {
    final /* synthetic */ zzaex zza;

    public zzaez(zzaex zzaexVar) {
        this.zza = zzaexVar;
    }

    private final void zza(zzafe zzafeVar) {
        this.zza.zzi.execute(new zzaff(this, zzafeVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zzb(String str) throws RemoteException {
        int i = this.zza.zza;
        boolean z = i == 8;
        Preconditions.checkState(z, "Unexpected response type " + i);
        zza(new zzafb(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zzc(String str) throws RemoteException {
        int i = this.zza.zza;
        boolean z = i == 7;
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzaex.zza(this.zza);
    }

    private final void zza(Status status, AuthCredential authCredential, String str, String str2) {
        zzaex.zza(this.zza, status);
        zzaex zzaexVar = this.zza;
        zzaexVar.zzn = authCredential;
        zzaexVar.zzo = str;
        zzaexVar.zzp = str2;
        Vl0 vl0 = zzaexVar.zzf;
        if (vl0 != null) {
            vl0.zza(status);
        }
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zzb() throws RemoteException {
        int i = this.zza.zza;
        boolean z = i == 6;
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzaex.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zzc() throws RemoteException {
        int i = this.zza.zza;
        boolean z = i == 9;
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzaex.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(String str) throws RemoteException {
        int i = this.zza.zza;
        boolean z = i == 8;
        Preconditions.checkState(z, "Unexpected response type " + i);
        this.zza.zzu = true;
        zza(new zzafd(this, str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzagn zzagnVar) throws RemoteException {
        int i = this.zza.zza;
        boolean z = i == 3;
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzaex zzaexVar = this.zza;
        zzaexVar.zzl = zzagnVar;
        zzaex.zza(zzaexVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza() throws RemoteException {
        int i = this.zza.zza;
        boolean z = i == 5;
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzaex.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzaak zzaakVar) {
        zza(zzaakVar.zza(), zzaakVar.zzb(), zzaakVar.zzc(), zzaakVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzaaj zzaajVar) {
        zzaex zzaexVar = this.zza;
        zzaexVar.zzq = zzaajVar;
        zzaexVar.zza(Li0.d("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(Status status, PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        int i = this.zza.zza;
        boolean z = i == 2;
        Preconditions.checkState(z, "Unexpected response type " + i);
        zza(status, phoneAuthCredential, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(Status status) throws RemoteException {
        String statusMessage = status.getStatusMessage();
        if (statusMessage != null) {
            if (statusMessage.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (statusMessage.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (statusMessage.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (statusMessage.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (statusMessage.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (statusMessage.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (statusMessage.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (statusMessage.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (statusMessage.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (statusMessage.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzaex zzaexVar = this.zza;
        if (zzaexVar.zza == 8) {
            zzaexVar.zzu = true;
            zza(new zzafc(this, status));
            return;
        }
        zzaex.zza(zzaexVar, status);
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzahj zzahjVar) throws RemoteException {
        zzaex zzaexVar = this.zza;
        zzaexVar.zzs = zzahjVar;
        zzaex.zza(zzaexVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzahk zzahkVar) throws RemoteException {
        zzaex zzaexVar = this.zza;
        zzaexVar.zzr = zzahkVar;
        zzaex.zza(zzaexVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzahn zzahnVar, zzahc zzahcVar) throws RemoteException {
        int i = this.zza.zza;
        boolean z = i == 2;
        Preconditions.checkState(z, "Unexpected response type: " + i);
        zzaex zzaexVar = this.zza;
        zzaexVar.zzj = zzahnVar;
        zzaexVar.zzk = zzahcVar;
        zzaex.zza(zzaexVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzahx zzahxVar) throws RemoteException {
        int i = this.zza.zza;
        boolean z = i == 4;
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzaex zzaexVar = this.zza;
        zzaexVar.zzm = zzahxVar;
        zzaex.zza(zzaexVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzahy zzahyVar) throws RemoteException {
        zzaex.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzaij zzaijVar) throws RemoteException {
        zzaex zzaexVar = this.zza;
        zzaexVar.zzt = zzaijVar;
        zzaex.zza(zzaexVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(zzahn zzahnVar) throws RemoteException {
        int i = this.zza.zza;
        boolean z = i == 1;
        Preconditions.checkState(z, "Unexpected response type: " + i);
        zzaex zzaexVar = this.zza;
        zzaexVar.zzj = zzahnVar;
        zzaex.zza(zzaexVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaed
    public final void zza(PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        int i = this.zza.zza;
        boolean z = i == 8;
        Preconditions.checkState(z, "Unexpected response type " + i);
        this.zza.zzu = true;
        zza(new zzafa(this, phoneAuthCredential));
    }
}
