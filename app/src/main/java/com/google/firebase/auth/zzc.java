package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzae;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;
@SafeParcelable.Class(creator = "DefaultOAuthCredentialCreator")
/* loaded from: classes.dex */
public class zzc extends OAuthCredential {
    public static final Parcelable.Creator<zzc> CREATOR = new Ql0(9);
    public final String b;
    public final String c;
    public final String d;
    public final zzait f;
    public final String g;
    public final String h;
    public final String i;

    public zzc(String str, String str2, String str3, zzait zzaitVar, String str4, String str5, String str6) {
        this.b = zzae.zzb(str);
        this.c = str2;
        this.d = str3;
        this.f = zzaitVar;
        this.g = str4;
        this.h = str5;
        this.i = str6;
    }

    public static zzc z(zzait zzaitVar) {
        Preconditions.checkNotNull(zzaitVar, "Must specify a non-null webSignInCredential");
        return new zzc(null, null, null, zzaitVar, null, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String w() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.b, false);
        SafeParcelWriter.writeString(parcel, 2, this.c, false);
        SafeParcelWriter.writeString(parcel, 3, this.d, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.g, false);
        SafeParcelWriter.writeString(parcel, 6, this.h, false);
        SafeParcelWriter.writeString(parcel, 7, this.i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String x() {
        return this.b;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential y() {
        return new zzc(this.b, this.c, this.d, this.f, this.g, this.h, this.i);
    }
}
