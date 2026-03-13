package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "VersionInfoParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class VersionInfoParcel extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<VersionInfoParcel> CREATOR = new zzy();
    @NonNull
    @SafeParcelable.Field(id = 2)
    public String afmaVersion;
    @SafeParcelable.Field(id = 3)
    public int buddyApkVersion;
    @SafeParcelable.Field(id = 4)
    public int clientJarVersion;
    @SafeParcelable.Field(id = 5)
    public boolean isClientJar;
    @SafeParcelable.Field(id = 6)
    public boolean isLiteSdk;

    public VersionInfoParcel(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    @NonNull
    public static VersionInfoParcel forPackage() {
        return new VersionInfoParcel(GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.afmaVersion, false);
        SafeParcelWriter.writeInt(parcel, 3, this.buddyApkVersion);
        SafeParcelWriter.writeInt(parcel, 4, this.clientJarVersion);
        SafeParcelWriter.writeBoolean(parcel, 5, this.isClientJar);
        SafeParcelWriter.writeBoolean(parcel, 6, this.isLiteSdk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public VersionInfoParcel(int i, int i2, boolean z, boolean z2) {
        this(i, i2, z, false, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VersionInfoParcel(int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r10 == 0) goto L5
            java.lang.String r11 = "0"
            goto Lc
        L5:
            if (r11 == 0) goto La
            java.lang.String r11 = "2"
            goto Lc
        La:
            java.lang.String r11 = "1"
        Lc:
            java.lang.String r0 = "afma-sdk-a-v"
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = defpackage.AbstractC2437ph.n(r0, r8, r1, r9, r1)
            r0.append(r11)
            java.lang.String r2 = r0.toString()
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.client.VersionInfoParcel.<init>(int, int, boolean, boolean, boolean):void");
    }

    @SafeParcelable.Constructor
    public VersionInfoParcel(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) boolean z2) {
        this.afmaVersion = str;
        this.buddyApkVersion = i;
        this.clientJarVersion = i2;
        this.isClientJar = z;
        this.isLiteSdk = z2;
    }
}
