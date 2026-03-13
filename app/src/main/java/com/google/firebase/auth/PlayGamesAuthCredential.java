package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.flutter.plugins.firebase.auth.Constants;
@SafeParcelable.Class(creator = "PlayGamesAuthCredentialCreator")
/* loaded from: classes.dex */
public class PlayGamesAuthCredential extends AuthCredential {
    @NonNull
    public static final Parcelable.Creator<PlayGamesAuthCredential> CREATOR = new Ql0(2);
    public final String b;

    public PlayGamesAuthCredential(String str) {
        this.b = Preconditions.checkNotEmpty(str);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String w() {
        return Constants.SIGN_IN_METHOD_PLAY_GAMES;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String x() {
        return Constants.SIGN_IN_METHOD_PLAY_GAMES;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential y() {
        return new PlayGamesAuthCredential(this.b);
    }
}
