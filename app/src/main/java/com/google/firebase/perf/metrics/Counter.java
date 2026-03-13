package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new I1(7);
    public final String b;
    public final AtomicLong c;

    public Counter(String str) {
        this.b = str;
        this.c = new AtomicLong(0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeLong(this.c.get());
    }

    public Counter(Parcel parcel) {
        this.b = parcel.readString();
        this.c = new AtomicLong(parcel.readLong());
    }
}
