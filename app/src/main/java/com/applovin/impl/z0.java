package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.af;
import com.applovin.impl.ud;
/* loaded from: classes.dex */
public final class z0 implements af.b {
    public static final Parcelable.Creator<z0> CREATOR = new a();
    public final int a;
    public final String b;

    public z0(int i, String str) {
        this.a = i;
        this.b = str;
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

    public String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.a);
        sb.append(",url=");
        return AbstractC0324Hi.h(sb, this.b, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.a);
    }

    @Override // com.applovin.impl.af.b
    public final /* synthetic */ byte[] a() {
        return AbstractC3207yf0.b(this);
    }

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public z0 createFromParcel(Parcel parcel) {
            return new z0(parcel.readInt(), (String) b1.a((Object) parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public z0[] newArray(int i) {
            return new z0[i];
        }
    }
}
