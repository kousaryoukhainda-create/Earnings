package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.af;
import com.applovin.impl.e9;
import com.applovin.impl.ud;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class v7 implements af.b {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] f;
    private int g;
    private static final e9 h = new e9.b().f("application/id3").a();
    private static final e9 i = new e9.b().f("application/x-scte35").a();
    public static final Parcelable.Creator<v7> CREATOR = new a();

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public v7[] newArray(int i) {
            return new v7[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public v7 createFromParcel(Parcel parcel) {
            return new v7(parcel);
        }
    }

    public v7(Parcel parcel) {
        this.a = (String) xp.a((Object) parcel.readString());
        this.b = (String) xp.a((Object) parcel.readString());
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.f = (byte[]) xp.a((Object) parcel.createByteArray());
    }

    @Override // com.applovin.impl.af.b
    public final /* synthetic */ void a(ud.b bVar) {
        AbstractC3207yf0.a(this, bVar);
    }

    @Override // com.applovin.impl.af.b
    public e9 b() {
        String str = this.a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return i;
            case 1:
            case 2:
                return h;
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v7.class != obj.getClass()) {
            return false;
        }
        v7 v7Var = (v7) obj;
        if (this.c == v7Var.c && this.d == v7Var.d && xp.a((Object) this.a, (Object) v7Var.a) && xp.a((Object) this.b, (Object) v7Var.b) && Arrays.equals(this.f, v7Var.f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i2;
        if (this.g == 0) {
            String str = this.a;
            int i3 = 0;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i4 = (i2 + 527) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            long j = this.c;
            long j2 = this.d;
            this.g = Arrays.hashCode(this.f) + ((((((i4 + i3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.g;
    }

    public String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.f);
    }

    @Override // com.applovin.impl.af.b
    public byte[] a() {
        if (b() != null) {
            return this.f;
        }
        return null;
    }

    public v7(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.f = bArr;
    }
}
