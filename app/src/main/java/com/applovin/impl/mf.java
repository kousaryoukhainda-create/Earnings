package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.af;
import com.applovin.impl.ud;
/* loaded from: classes.dex */
public final class mf implements af.b {
    public static final Parcelable.Creator<mf> CREATOR = new a();
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long f;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public mf[] newArray(int i) {
            return new mf[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public mf createFromParcel(Parcel parcel) {
            return new mf(parcel, null);
        }
    }

    public mf(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.f = j5;
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
        if (obj == null || mf.class != obj.getClass()) {
            return false;
        }
        mf mfVar = (mf) obj;
        if (this.a == mfVar.a && this.b == mfVar.b && this.c == mfVar.c && this.d == mfVar.d && this.f == mfVar.f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int a2 = rc.a(this.b);
        int a3 = rc.a(this.c);
        int a4 = rc.a(this.d);
        return rc.a(this.f) + ((a4 + ((a3 + ((a2 + ((rc.a(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.f);
    }

    @Override // com.applovin.impl.af.b
    public final /* synthetic */ byte[] a() {
        return AbstractC3207yf0.b(this);
    }

    private mf(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.f = parcel.readLong();
    }

    public /* synthetic */ mf(Parcel parcel, a aVar) {
        this(parcel);
    }
}
