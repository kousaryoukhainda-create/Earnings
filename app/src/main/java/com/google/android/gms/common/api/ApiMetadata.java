package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Objects;
@KeepForSdk
@SafeParcelable.Class(creator = "ApiMetadataCreator")
/* loaded from: classes3.dex */
public final class ApiMetadata extends AbstractSafeParcelable {
    @NonNull
    public static final Parcelable.Creator<ApiMetadata> CREATOR = zza.zza();
    private static final ApiMetadata zza = newBuilder().build();
    @SafeParcelable.Field(getter = "getComplianceOptions", id = 1)
    private final ComplianceOptions zzb;

    @KeepForSdk
    /* loaded from: classes3.dex */
    public static final class Builder {
        private ComplianceOptions zza;

        @NonNull
        @KeepForSdk
        public ApiMetadata build() {
            return new ApiMetadata(this.zza);
        }

        @NonNull
        @KeepForSdk
        public Builder setComplianceOptions(ComplianceOptions complianceOptions) {
            this.zza = complianceOptions;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public ApiMetadata(@SafeParcelable.Param(id = 1) ComplianceOptions complianceOptions) {
        this.zzb = complianceOptions;
    }

    @NonNull
    @KeepForSdk
    public static final ApiMetadata fromComplianceOptions(@NonNull ComplianceOptions complianceOptions) {
        Builder newBuilder = newBuilder();
        newBuilder.setComplianceOptions(complianceOptions);
        return newBuilder.build();
    }

    @NonNull
    @KeepForSdk
    public static final ApiMetadata getEmptyInstance() {
        return zza;
    }

    @NonNull
    @KeepForSdk
    public static Builder newBuilder() {
        return new Builder();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        return Objects.equals(this.zzb, ((ApiMetadata) obj).zzb);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb);
    }

    @NonNull
    public final String toString() {
        return AbstractC2437ph.h("ApiMetadata(complianceOptions=", String.valueOf(this.zzb), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(-204102970);
        ComplianceOptions complianceOptions = this.zzb;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, complianceOptions, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
