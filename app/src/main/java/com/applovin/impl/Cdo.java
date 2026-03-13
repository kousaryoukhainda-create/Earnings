package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: com.applovin.impl.do  reason: invalid class name */
/* loaded from: classes.dex */
public final class Cdo extends sk {
    public static final Parcelable.Creator<Cdo> CREATOR = new a();
    public final long a;
    public final long b;

    /* renamed from: com.applovin.impl.do$a */
    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Cdo[] newArray(int i) {
            return new Cdo[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Cdo createFromParcel(Parcel parcel) {
            return new Cdo(parcel.readLong(), parcel.readLong(), null);
        }
    }

    private Cdo(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static Cdo a(ah ahVar, long j, ho hoVar) {
        long a2 = a(ahVar, j);
        return new Cdo(a2, hoVar.b(a2));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    public /* synthetic */ Cdo(long j, long j2, a aVar) {
        this(j, j2);
    }

    public static long a(ah ahVar, long j) {
        long w = ahVar.w();
        if ((128 & w) != 0) {
            return 8589934591L & ((((w & 1) << 32) | ahVar.y()) + j);
        }
        return -9223372036854775807L;
    }
}
