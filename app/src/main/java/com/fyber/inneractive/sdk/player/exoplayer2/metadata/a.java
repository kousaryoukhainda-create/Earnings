package com.fyber.inneractive.sdk.player.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0096a();
    public final b[] a;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0096a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i) {
            return new a[0];
        }
    }

    /* loaded from: classes.dex */
    public interface b extends Parcelable {
    }

    public a(List<? extends b> list) {
        b[] bVarArr = new b[list.size()];
        this.a = bVarArr;
        list.toArray(bVarArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            return Arrays.equals(this.a, ((a) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.length);
        for (b bVar : this.a) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    public a(Parcel parcel) {
        this.a = new b[parcel.readInt()];
        int i = 0;
        while (true) {
            b[] bVarArr = this.a;
            if (i >= bVarArr.length) {
                return;
            }
            bVarArr[i] = (b) parcel.readParcelable(b.class.getClassLoader());
            i++;
        }
    }
}
