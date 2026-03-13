package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class vk extends sk {
    public static final Parcelable.Creator<vk> CREATOR = new a();

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public vk[] newArray(int i) {
            return new vk[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public vk createFromParcel(Parcel parcel) {
            return new vk();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
