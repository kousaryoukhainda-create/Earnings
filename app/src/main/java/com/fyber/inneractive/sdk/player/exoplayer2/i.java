package com.fyber.inneractive.sdk.player.exoplayer2;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();
    public int A;
    public final String a;
    public final int b;
    public final String c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.metadata.a d;
    public final String e;
    public final String f;
    public final int g;
    public final List<byte[]> h;
    public final com.fyber.inneractive.sdk.player.exoplayer2.drm.a i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final float n;
    public final int o;
    public final byte[] p;
    public final com.fyber.inneractive.sdk.player.exoplayer2.video.b q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final long w;
    public final int x;
    public final String y;
    public final int z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public i[] newArray(int i) {
            return new i[i];
        }
    }

    public i(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, com.fyber.inneractive.sdk.player.exoplayer2.video.b bVar, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List<byte[]> list, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar, com.fyber.inneractive.sdk.player.exoplayer2.metadata.a aVar2) {
        this.a = str;
        this.e = str2;
        this.f = str3;
        this.c = str4;
        this.b = i;
        this.g = i2;
        this.j = i3;
        this.k = i4;
        this.l = f;
        this.m = i5;
        this.n = f2;
        this.p = bArr;
        this.o = i6;
        this.q = bVar;
        this.r = i7;
        this.s = i8;
        this.t = i9;
        this.u = i10;
        this.v = i11;
        this.x = i12;
        this.y = str5;
        this.z = i13;
        this.w = j;
        this.h = list == null ? Collections.emptyList() : list;
        this.i = aVar;
        this.d = aVar2;
    }

    public static i a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar) {
        return a(str, str2, (String) null, i, i2, i3, i4, f, list, i5, f2, (byte[]) null, -1, (com.fyber.inneractive.sdk.player.exoplayer2.video.b) null, (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) null);
    }

    public int b() {
        int i;
        int i2 = this.j;
        if (i2 == -1 || (i = this.k) == -1) {
            return -1;
        }
        return i2 * i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.b == iVar.b && this.g == iVar.g && this.j == iVar.j && this.k == iVar.k && this.l == iVar.l && this.m == iVar.m && this.n == iVar.n && this.o == iVar.o && this.r == iVar.r && this.s == iVar.s && this.t == iVar.t && this.u == iVar.u && this.v == iVar.v && this.w == iVar.w && this.x == iVar.x && u.a(this.a, iVar.a) && u.a(this.y, iVar.y) && this.z == iVar.z && u.a(this.e, iVar.e) && u.a(this.f, iVar.f) && u.a(this.c, iVar.c) && u.a(this.i, iVar.i) && u.a(this.d, iVar.d) && u.a(this.q, iVar.q) && Arrays.equals(this.p, iVar.p) && this.h.size() == iVar.h.size()) {
                for (int i = 0; i < this.h.size(); i++) {
                    if (!Arrays.equals(this.h.get(i), iVar.h.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        if (this.A == 0) {
            String str = this.a;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (hashCode + 527) * 31;
            String str2 = this.e;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str3 = this.f;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str4 = this.c;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i5 = (((((((((((i4 + hashCode4) * 31) + this.b) * 31) + this.j) * 31) + this.k) * 31) + this.r) * 31) + this.s) * 31;
            String str5 = this.y;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i6 = (((i5 + hashCode5) * 31) + this.z) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar = this.i;
            if (aVar == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = aVar.hashCode();
            }
            int i7 = (i6 + hashCode6) * 31;
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a aVar2 = this.d;
            if (aVar2 != null) {
                i = Arrays.hashCode(aVar2.a);
            }
            this.A = i7 + i;
        }
        return this.A;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.y);
        sb.append(", [");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.l);
        sb.append("], [");
        sb.append(this.r);
        sb.append(", ");
        return AbstractC2437ph.k(sb, this.s, "])");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.a);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.c);
        parcel.writeInt(this.b);
        parcel.writeInt(this.g);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeFloat(this.l);
        parcel.writeInt(this.m);
        parcel.writeFloat(this.n);
        if (this.p != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        byte[] bArr = this.p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.o);
        parcel.writeParcelable(this.q, i);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.z);
        parcel.writeLong(this.w);
        int size = this.h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.h.get(i3));
        }
        parcel.writeParcelable(this.i, 0);
        parcel.writeParcelable(this.d, 0);
    }

    public static i a(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List<byte[]> list, int i5, float f2, byte[] bArr, int i6, com.fyber.inneractive.sdk.player.exoplayer2.video.b bVar, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar) {
        return new i(str, null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, bVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, aVar, null);
    }

    public static i a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar, int i6, String str4) {
        return a(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, aVar, i6, str4, (com.fyber.inneractive.sdk.player.exoplayer2.metadata.a) null);
    }

    public static i a(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar, int i8, String str4, com.fyber.inneractive.sdk.player.exoplayer2.metadata.a aVar2) {
        return new i(str, null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, i8, str4, -1, Long.MAX_VALUE, list, aVar, aVar2);
    }

    public static i a(String str, String str2, String str3, String str4, int i, int i2, String str5, int i3) {
        return new i(str, str2, str3, str4, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str5, i3, Long.MAX_VALUE, null, null, null);
    }

    public static i a(String str, String str2, String str3, int i, int i2, String str4, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar) {
        return a(str, str2, null, i, i2, str4, -1, aVar, Long.MAX_VALUE, Collections.emptyList());
    }

    public static i a(String str, String str2, String str3, int i, int i2, String str4, int i3, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar, long j, List<byte[]> list) {
        return new i(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, aVar, null);
    }

    public static i a(String str, String str2, String str3, int i, List<byte[]> list, String str4, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar) {
        return new i(str, null, str2, null, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, aVar, null);
    }

    public static i a(String str, String str2, long j) {
        return new i(null, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, j, null, null, null);
    }

    public static i a(String str, String str2, String str3, int i, com.fyber.inneractive.sdk.player.exoplayer2.drm.a aVar) {
        return new i(str, null, str2, null, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, aVar, null);
    }

    public i a(long j) {
        return new i(this.a, this.e, this.f, this.c, this.b, this.g, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.y, this.z, j, this.h, this.i, this.d);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat a() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f);
        String str = this.y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        a(mediaFormat, "max-input-size", this.g);
        a(mediaFormat, "width", this.j);
        a(mediaFormat, "height", this.k);
        float f = this.l;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        a(mediaFormat, "rotation-degrees", this.m);
        a(mediaFormat, "channel-count", this.r);
        a(mediaFormat, "sample-rate", this.s);
        a(mediaFormat, "encoder-delay", this.u);
        a(mediaFormat, "encoder-padding", this.v);
        for (int i = 0; i < this.h.size(); i++) {
            mediaFormat.setByteBuffer(AbstractC0324Hi.e(i, "csd-"), ByteBuffer.wrap(this.h.get(i)));
        }
        com.fyber.inneractive.sdk.player.exoplayer2.video.b bVar = this.q;
        if (bVar != null) {
            a(mediaFormat, "color-transfer", bVar.c);
            a(mediaFormat, "color-standard", bVar.a);
            a(mediaFormat, "color-range", bVar.b);
            byte[] bArr = bVar.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public i(Parcel parcel) {
        this.a = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.c = parcel.readString();
        this.b = parcel.readInt();
        this.g = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readFloat();
        this.m = parcel.readInt();
        this.n = parcel.readFloat();
        this.p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.o = parcel.readInt();
        this.q = (com.fyber.inneractive.sdk.player.exoplayer2.video.b) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.video.b.class.getClassLoader());
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readString();
        this.z = parcel.readInt();
        this.w = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.h.add(parcel.createByteArray());
        }
        this.i = (com.fyber.inneractive.sdk.player.exoplayer2.drm.a) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.drm.a.class.getClassLoader());
        this.d = (com.fyber.inneractive.sdk.player.exoplayer2.metadata.a) parcel.readParcelable(com.fyber.inneractive.sdk.player.exoplayer2.metadata.a.class.getClassLoader());
    }

    @TargetApi(16)
    public static void a(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }
}
