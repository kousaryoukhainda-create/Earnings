package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.ud;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class af implements Parcelable {
    public static final Parcelable.Creator<af> CREATOR = new a();
    private final b[] a;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public af[] newArray(int i) {
            return new af[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public af createFromParcel(Parcel parcel) {
            return new af(parcel);
        }
    }

    /* loaded from: classes.dex */
    public interface b extends Parcelable {
        void a(ud.b bVar);

        byte[] a();

        e9 b();
    }

    public af(Parcel parcel) {
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

    public af a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new af((b[]) xp.a((Object[]) this.a, (Object[]) bVarArr));
    }

    public int c() {
        return this.a.length;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && af.class == obj.getClass()) {
            return Arrays.equals(this.a, ((af) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.length);
        for (b bVar : this.a) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    public af a(af afVar) {
        return afVar == null ? this : a(afVar.a);
    }

    public b a(int i) {
        return this.a[i];
    }

    public af(List list) {
        this.a = (b[]) list.toArray(new b[0]);
    }

    public af(b... bVarArr) {
        this.a = bVarArr;
    }
}
