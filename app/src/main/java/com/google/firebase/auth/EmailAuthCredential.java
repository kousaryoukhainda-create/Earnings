package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.flutter.plugins.firebase.auth.Constants;
@SafeParcelable.Class(creator = "EmailAuthCredentialCreator")
/* loaded from: classes.dex */
public class EmailAuthCredential extends AuthCredential {
    @NonNull
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new Ql0(10);
    public final String b;
    public final String c;
    public final String d;
    public String f;
    public boolean g;

    public EmailAuthCredential(String str, boolean z, String str2, String str3, String str4) {
        this.b = Preconditions.checkNotEmpty(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.c = str2;
        this.d = str3;
        this.f = str4;
        this.g = z;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String w() {
        return Constants.SIGN_IN_METHOD_PASSWORD;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.b, false);
        SafeParcelWriter.writeString(parcel, 2, this.c, false);
        SafeParcelWriter.writeString(parcel, 3, this.d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.g);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String x() {
        if (!TextUtils.isEmpty(this.c)) {
            return Constants.SIGN_IN_METHOD_PASSWORD;
        }
        return "emailLink";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential y() {
        String str = this.f;
        return new EmailAuthCredential(this.b, this.g, this.c, this.d, str);
    }
}
