package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.af;
import com.applovin.impl.ud;
/* loaded from: classes.dex */
public final class kk implements af.b {
    public static final Parcelable.Creator<kk> CREATOR = new a();
    public final float a;
    public final int b;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public kk[] newArray(int i) {
            return new kk[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public kk createFromParcel(Parcel parcel) {
            return new kk(parcel, (a) null);
        }
    }

    public kk(float f, int i) {
        this.a = f;
        this.b = i;
    }

    @Override // com.applovin.impl.af.b
    public final /* synthetic */ void a(ud.b bVar) {
        AbstractC3207yf0.a(this, bVar);
    }

    @Override // com.applovin.impl.af.b
    public final /* synthetic */ e9 b() {
        return AbstractC3207yf0.c(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kk.class != obj.getClass()) {
            return false;
        }
        kk kkVar = (kk) obj;
        if (this.a == kkVar.a && this.b == kkVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((c9.a(this.a) + 527) * 31) + this.b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.a + ", svcTemporalLayerCount=" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeInt(this.b);
    }

    @Override // com.applovin.impl.af.b
    public final /* synthetic */ byte[] a() {
        return AbstractC3207yf0.b(this);
    }

    private kk(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readInt();
    }

    public /* synthetic */ kk(Parcel parcel, a aVar) {
        this(parcel);
    }
}
