package com.google.firebase.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "UserProfileChangeRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class UserProfileChangeRequest extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new Ql0(5);
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean f;
    public final Uri g;

    public UserProfileChangeRequest(String str, String str2, boolean z, boolean z2) {
        Uri parse;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.f = z2;
        if (TextUtils.isEmpty(str2)) {
            parse = null;
        } else {
            parse = Uri.parse(str2);
        }
        this.g = parse;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.b, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.d);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
