package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.flutter.plugins.firebase.auth.Constants;
@SafeParcelable.Class(creator = "TwitterAuthCredentialCreator")
/* loaded from: classes.dex */
public class TwitterAuthCredential extends AuthCredential {
    @NonNull
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = new Ql0(4);
    public final String b;
    public final String c;

    public TwitterAuthCredential(String str, String str2) {
        this.b = Preconditions.checkNotEmpty(str);
        this.c = Preconditions.checkNotEmpty(str2);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String w() {
        return Constants.SIGN_IN_METHOD_TWITTER;
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
        return Constants.SIGN_IN_METHOD_TWITTER;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential y() {
        return new TwitterAuthCredential(this.b, this.c);
    }
}
