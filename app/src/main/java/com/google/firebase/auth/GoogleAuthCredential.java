package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.flutter.plugins.firebase.auth.Constants;
@SafeParcelable.Class(creator = "GoogleAuthCredentialCreator")
/* loaded from: classes.dex */
public class GoogleAuthCredential extends AuthCredential {
    @NonNull
    public static final Parcelable.Creator<GoogleAuthCredential> CREATOR = new LQ(26);
    public final String b;
    public final String c;

    public GoogleAuthCredential(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.b = str;
        this.c = str2;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String w() {
        return Constants.SIGN_IN_METHOD_GOOGLE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.b, false);
        SafeParcelWriter.writeString(parcel, 2, this.c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String x() {
        return Constants.SIGN_IN_METHOD_GOOGLE;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential y() {
        return new GoogleAuthCredential(this.b, this.c);
    }
}
