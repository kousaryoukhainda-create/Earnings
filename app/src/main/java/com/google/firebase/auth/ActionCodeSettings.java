package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "ActionCodeSettingsCreator")
/* loaded from: classes.dex */
public class ActionCodeSettings extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ActionCodeSettings> CREATOR = new Ql0(6);
    public final String b;
    public final String c;
    public final String d;
    public final String f;
    public final boolean g;
    public final String h;
    public final boolean i;
    public String j;
    public int k;
    public final String l;
    public final String m;

    public ActionCodeSettings(C2293o1 c2293o1) {
        this.b = (String) c2293o1.c;
        this.c = (String) c2293o1.d;
        this.d = null;
        this.f = (String) c2293o1.e;
        this.g = c2293o1.a;
        this.h = (String) c2293o1.f;
        this.i = c2293o1.b;
        this.l = (String) c2293o1.g;
        this.m = (String) c2293o1.h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.b, false);
        SafeParcelWriter.writeString(parcel, 2, this.c, false);
        SafeParcelWriter.writeString(parcel, 3, this.d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.g);
        SafeParcelWriter.writeString(parcel, 6, this.h, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.i);
        SafeParcelWriter.writeString(parcel, 8, this.j, false);
        SafeParcelWriter.writeInt(parcel, 9, this.k);
        SafeParcelWriter.writeString(parcel, 10, this.l, false);
        SafeParcelWriter.writeString(parcel, 11, this.m, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public ActionCodeSettings(String str, String str2, String str3, String str4, boolean z, String str5, boolean z2, String str6, int i, String str7, String str8) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.f = str4;
        this.g = z;
        this.h = str5;
        this.i = z2;
        this.j = str6;
        this.k = i;
        this.l = str7;
        this.m = str8;
    }
}
