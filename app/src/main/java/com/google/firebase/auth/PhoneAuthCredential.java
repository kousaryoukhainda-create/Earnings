package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import io.flutter.plugins.firebase.auth.Constants;
@SafeParcelable.Class(creator = "PhoneAuthCredentialCreator")
/* loaded from: classes.dex */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {
    @NonNull
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new LQ(29);
    public final String b;
    public final String c;
    public final String d;
    public boolean f;
    public final String g;

    public PhoneAuthCredential(String str, boolean z, String str2, String str3, String str4) {
        boolean z2;
        if ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = z;
        this.g = str4;
    }

    public static PhoneAuthCredential z(String str, String str2) {
        return new PhoneAuthCredential(str, true, str2, null, null);
    }

    public final Object clone() {
        return new PhoneAuthCredential(this.b, this.f, this.c, this.d, this.g);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String w() {
        return Constants.SIGN_IN_METHOD_PHONE;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.b, false);
        SafeParcelWriter.writeString(parcel, 2, this.c, false);
        SafeParcelWriter.writeString(parcel, 4, this.d, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f);
        SafeParcelWriter.writeString(parcel, 6, this.g, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String x() {
        return Constants.SIGN_IN_METHOD_PHONE;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential y() {
        return (PhoneAuthCredential) clone();
    }
}
