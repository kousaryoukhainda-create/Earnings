package androidx.media3.extractor.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.b;
import androidx.media3.common.c;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR;
    public static final b i;
    public static final b j;
    public final String b;
    public final String c;
    public final long d;
    public final long f;
    public final byte[] g;
    public int h;

    static {
        C2717sy c2717sy = new C2717sy();
        c2717sy.l = UM.l("application/id3");
        i = new b(c2717sy);
        C2717sy c2717sy2 = new C2717sy();
        c2717sy2.l = UM.l("application/x-scte35");
        j = new b(c2717sy2);
        CREATOR = new I1(11);
    }

    public EventMessage(String str, String str2, long j2, long j3, byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.f = j3;
        this.g = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        if (this.d == eventMessage.d && this.f == eventMessage.f && Ha0.a(this.b, eventMessage.b) && Ha0.a(this.c, eventMessage.c) && Arrays.equals(this.g, eventMessage.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        if (this.h == 0) {
            int i3 = 0;
            String str = this.b;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i4 = (527 + i2) * 31;
            String str2 = this.c;
            if (str2 != null) {
                i3 = str2.hashCode();
            }
            long j2 = this.d;
            long j3 = this.f;
            this.h = Arrays.hashCode(this.g) + ((((((i4 + i3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
        }
        return this.h;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final b j() {
        String str = this.b;
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
                return j;
            case 1:
            case 2:
                return i;
            default:
                return null;
        }
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final /* synthetic */ void l(c cVar) {
    }

    public final String toString() {
        return "EMSG: scheme=" + this.b + ", id=" + this.f + ", durationMs=" + this.d + ", value=" + this.c;
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final byte[] u() {
        if (j() != null) {
            return this.g;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.f);
        parcel.writeByteArray(this.g);
    }

    public EventMessage(Parcel parcel) {
        String readString = parcel.readString();
        int i2 = Ha0.a;
        this.b = readString;
        this.c = parcel.readString();
        this.d = parcel.readLong();
        this.f = parcel.readLong();
        this.g = parcel.createByteArray();
    }
}
