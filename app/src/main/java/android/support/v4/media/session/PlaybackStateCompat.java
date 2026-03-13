package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new LQ(4);
    public final int b;
    public final long c;
    public final long d;
    public final float f;
    public final long g;
    public final int h;
    public final CharSequence i;
    public final long j;
    public final ArrayList k;
    public final long l;
    public final Bundle m;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();
        public final String b;
        public final CharSequence c;
        public final int d;
        public final Bundle f;

        public CustomAction(Parcel parcel) {
            this.b = parcel.readString();
            this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.d = parcel.readInt();
            this.f = parcel.readBundle(AbstractC1522hL.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.c) + ", mIcon=" + this.d + ", mExtras=" + this.f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            TextUtils.writeToParcel(this.c, parcel, i);
            parcel.writeInt(this.d);
            parcel.writeBundle(this.f);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readLong();
        this.f = parcel.readFloat();
        this.j = parcel.readLong();
        this.d = parcel.readLong();
        this.g = parcel.readLong();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.l = parcel.readLong();
        this.m = parcel.readBundle(AbstractC1522hL.class.getClassLoader());
        this.h = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(this.c);
        sb.append(", buffered position=");
        sb.append(this.d);
        sb.append(", speed=");
        sb.append(this.f);
        sb.append(", updated=");
        sb.append(this.j);
        sb.append(", actions=");
        sb.append(this.g);
        sb.append(", error code=");
        sb.append(this.h);
        sb.append(", error message=");
        sb.append(this.i);
        sb.append(", custom actions=");
        sb.append(this.k);
        sb.append(", active item id=");
        return BK.n(sb, this.l, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
        parcel.writeFloat(this.f);
        parcel.writeLong(this.j);
        parcel.writeLong(this.d);
        parcel.writeLong(this.g);
        TextUtils.writeToParcel(this.i, parcel, i);
        parcel.writeTypedList(this.k);
        parcel.writeLong(this.l);
        parcel.writeBundle(this.m);
        parcel.writeInt(this.h);
    }
}
