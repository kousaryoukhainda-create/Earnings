package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.af;
import com.applovin.impl.ud;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public final class jk implements af.b {
    public static final Parcelable.Creator<jk> CREATOR = new a();
    public final List a;

    public jk(List list) {
        this.a = list;
        b1.a(!a(list));
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
        if (obj != null && jk.class == obj.getClass()) {
            return this.a.equals(((jk) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
    }

    @Override // com.applovin.impl.af.b
    public final /* synthetic */ byte[] a() {
        return AbstractC3207yf0.b(this);
    }

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public jk createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new jk(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public jk[] newArray(int i) {
            return new jk[i];
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable {
        public final long a;
        public final long b;
        public final int c;
        public static final Comparator d = new R9(21);
        public static final Parcelable.Creator<b> CREATOR = new a();

        public b(long j, long j2, int i) {
            boolean z;
            if (j < j2) {
                z = true;
            } else {
                z = false;
            }
            b1.a(z);
            this.a = j;
            this.b = j2;
            this.c = i;
        }

        public static /* synthetic */ int a(b bVar, b bVar2) {
            return y3.e().a(bVar.a, bVar2.a).a(bVar.b, bVar2.b).a(bVar.c, bVar2.c).d();
        }

        public static /* synthetic */ int b(b bVar, b bVar2) {
            return a(bVar, bVar2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.a == bVar.a && this.b == bVar.b && this.c == bVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
        }

        public String toString() {
            return xp.a("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.a);
            parcel.writeLong(this.b);
            parcel.writeInt(this.c);
        }

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b[] newArray(int i) {
                return new b[i];
            }
        }
    }

    private static boolean a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = ((b) list.get(0)).b;
        for (int i = 1; i < list.size(); i++) {
            if (((b) list.get(i)).a < j) {
                return true;
            }
            j = ((b) list.get(i)).b;
        }
        return false;
    }
}
