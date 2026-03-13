package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
@SafeParcelable.Class(creator = "ShortDynamicLinkImplCreator")
/* loaded from: classes.dex */
public final class ShortDynamicLinkImpl extends AbstractSafeParcelable implements InterfaceC2981w10 {
    public static final Parcelable.Creator<ShortDynamicLinkImpl> CREATOR = new Object();
    public final Uri b;
    public final Uri c;
    public final List d;

    @SafeParcelable.Class(creator = "WarningImplCreator")
    /* loaded from: classes.dex */
    public static class WarningImpl extends AbstractSafeParcelable implements InterfaceC2895v10 {
        public static final Parcelable.Creator<WarningImpl> CREATOR = new Object();
        public final String b;

        public WarningImpl(String str) {
            this.b = str;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeString(parcel, 2, this.b, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }
    }

    public ShortDynamicLinkImpl(Uri uri, Uri uri2, ArrayList arrayList) {
        this.b = uri;
        this.c = uri2;
        this.d = arrayList == null ? new ArrayList() : arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.c, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
