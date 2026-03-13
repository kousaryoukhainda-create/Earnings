package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class wk extends sk {
    public static final Parcelable.Creator<wk> CREATOR = new a();
    public final List a;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public wk[] newArray(int i) {
            return new wk[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public wk createFromParcel(Parcel parcel) {
            return new wk(parcel, null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final long b;

        private b(int i, long j) {
            this.a = i;
            this.b = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b b(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.b);
        }

        public /* synthetic */ b(int i, long j, a aVar) {
            this(i, j);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final long a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        private c(long j, boolean z, boolean z2, boolean z3, List list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.a = j;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.f = Collections.unmodifiableList(list);
            this.e = j2;
            this.g = z4;
            this.h = j3;
            this.i = i;
            this.j = i2;
            this.k = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(ah ahVar) {
            ArrayList arrayList;
            boolean z;
            long j;
            boolean z2;
            long j2;
            int i;
            int i2;
            int i3;
            boolean z3;
            boolean z4;
            long j3;
            long y = ahVar.y();
            boolean z5 = (ahVar.w() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                j = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                i3 = 0;
                z3 = false;
            } else {
                int w = ahVar.w();
                boolean z6 = (w & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                boolean z7 = (w & 64) != 0;
                boolean z8 = (w & 32) != 0;
                long y2 = z7 ? ahVar.y() : -9223372036854775807L;
                if (!z7) {
                    int w2 = ahVar.w();
                    ArrayList arrayList3 = new ArrayList(w2);
                    for (int i4 = 0; i4 < w2; i4++) {
                        arrayList3.add(new b(ahVar.w(), ahVar.y(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long w3 = ahVar.w();
                    boolean z9 = (128 & w3) != 0;
                    j3 = ((((w3 & 1) << 32) | ahVar.y()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    j3 = -9223372036854775807L;
                }
                int C = ahVar.C();
                int w4 = ahVar.w();
                z3 = z7;
                i3 = ahVar.w();
                j2 = j3;
                arrayList = arrayList2;
                long j4 = y2;
                i = C;
                i2 = w4;
                j = j4;
                boolean z10 = z6;
                z2 = z4;
                z = z10;
            }
            return new c(y, z5, z, z3, arrayList, j, z2, j2, i, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(Parcel parcel) {
            parcel.writeLong(this.a);
            parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            int size = this.f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                ((b) this.f.get(i)).c(parcel);
            }
            parcel.writeLong(this.e);
            parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }

        private c(Parcel parcel) {
            this.a = parcel.readLong();
            this.b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(b.b(parcel));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.e = parcel.readLong();
            this.g = parcel.readByte() == 1;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(Parcel parcel) {
            return new c(parcel);
        }
    }

    private wk(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(c.b(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    public static wk a(ah ahVar) {
        int w = ahVar.w();
        ArrayList arrayList = new ArrayList(w);
        for (int i = 0; i < w; i++) {
            arrayList.add(c.b(ahVar));
        }
        return new wk(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((c) this.a.get(i2)).c(parcel);
        }
    }

    public /* synthetic */ wk(Parcel parcel, a aVar) {
        this(parcel);
    }

    private wk(List list) {
        this.a = Collections.unmodifiableList(list);
    }
}
