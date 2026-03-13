package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new I1(20);
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence f;
    public final Bitmap g;
    public final Uri h;
    public final Bundle i;
    public final Uri j;
    public MediaDescription k;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.b = str;
        this.c = charSequence;
        this.d = charSequence2;
        this.f = charSequence3;
        this.g = bitmap;
        this.h = uri;
        this.i = bundle;
        this.j = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.c) + ", " + ((Object) this.d) + ", " + ((Object) this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescription = this.k;
        if (mediaDescription == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.b);
            builder.setTitle(this.c);
            builder.setSubtitle(this.d);
            builder.setDescription(this.f);
            builder.setIconBitmap(this.g);
            builder.setIconUri(this.h);
            Uri uri = this.j;
            Bundle bundle = this.i;
            if (i2 < 23 && uri != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
            }
            builder.setExtras(bundle);
            if (i2 >= 23) {
                builder.setMediaUri(uri);
            }
            mediaDescription = builder.build();
            this.k = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i);
    }
}
