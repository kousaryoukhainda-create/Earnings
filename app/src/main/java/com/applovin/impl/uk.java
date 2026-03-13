package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class uk extends sk {
    public static final Parcelable.Creator<uk> CREATOR = new a();
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean f;
    public final long g;
    public final long h;
    public final List i;
    public final boolean j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public uk[] newArray(int i) {
            return new uk[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public uk createFromParcel(Parcel parcel) {
            return new uk(parcel, null);
        }
    }

    private uk(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = Collections.unmodifiableList(list);
        this.j = z5;
        this.k = j4;
        this.l = i;
        this.m = i2;
        this.n = i3;
    }

    public static uk a(ah ahVar, long j, ho hoVar) {
        boolean z;
        List list;
        boolean z2;
        boolean z3;
        long j2;
        boolean z4;
        long j3;
        int i;
        int i2;
        int i3;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        long j4;
        boolean z10;
        long j5;
        boolean z11;
        long j6;
        long y = ahVar.y();
        if ((ahVar.w() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z = true;
        } else {
            z = false;
        }
        List emptyList = Collections.emptyList();
        if (!z) {
            int w = ahVar.w();
            if ((w & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((w & 64) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((w & 32) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((w & 16) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z7 && !z9) {
                j4 = Cdo.a(ahVar, j);
            } else {
                j4 = -9223372036854775807L;
            }
            if (!z7) {
                int w2 = ahVar.w();
                ArrayList arrayList = new ArrayList(w2);
                for (int i4 = 0; i4 < w2; i4++) {
                    int w3 = ahVar.w();
                    if (!z9) {
                        j6 = Cdo.a(ahVar, j);
                    } else {
                        j6 = -9223372036854775807L;
                    }
                    arrayList.add(new b(w3, j6, hoVar.b(j6), null));
                }
                emptyList = arrayList;
            }
            if (z8) {
                long w4 = ahVar.w();
                if ((128 & w4) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j5 = ((((w4 & 1) << 32) | ahVar.y()) * 1000) / 90;
                z10 = z11;
            } else {
                z10 = false;
                j5 = -9223372036854775807L;
            }
            i = ahVar.C();
            z5 = z7;
            i2 = ahVar.w();
            i3 = ahVar.w();
            list = emptyList;
            long j7 = j4;
            z4 = z10;
            j3 = j5;
            z3 = z9;
            z2 = z6;
            j2 = j7;
        } else {
            list = emptyList;
            z2 = false;
            z3 = false;
            j2 = -9223372036854775807L;
            z4 = false;
            j3 = -9223372036854775807L;
            i = 0;
            i2 = 0;
            i3 = 0;
            z5 = false;
        }
        return new uk(y, z, z2, z5, z3, j2, hoVar.b(j2), list, z4, j3, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        int size = this.i.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((b) this.i.get(i2)).b(parcel);
        }
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final long b;
        public final long c;

        private b(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }

        public /* synthetic */ b(int i, long j, long j2, a aVar) {
            this(i, j, j2);
        }
    }

    private uk(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.f = parcel.readByte() == 1;
        this.g = parcel.readLong();
        this.h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(b.a(parcel));
        }
        this.i = Collections.unmodifiableList(arrayList);
        this.j = parcel.readByte() == 1;
        this.k = parcel.readLong();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readInt();
    }

    public /* synthetic */ uk(Parcel parcel, a aVar) {
        this(parcel);
    }
}
