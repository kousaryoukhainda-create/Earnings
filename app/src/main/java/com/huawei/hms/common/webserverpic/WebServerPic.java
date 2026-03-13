package com.huawei.hms.common.webserverpic;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Locale;
/* loaded from: classes2.dex */
public class WebServerPic {
    public static final Parcelable.Creator<WebServerPic> CREATOR = new WebServerPicCreator();
    private final Uri a;
    private final int b;
    private final int c;

    public WebServerPic(Uri uri, int i, int i2) throws IllegalArgumentException {
        this.a = uri;
        this.b = i;
        this.c = i2;
        if (uri == null) {
            throw new IllegalArgumentException("url is not able to be null");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("width and height should be positive or 0");
        }
    }

    public final int getHeight() {
        return this.c;
    }

    public final Uri getUrl() {
        return this.a;
    }

    public final int getWidth() {
        return this.b;
    }

    public final String toString() {
        Locale locale = Locale.ENGLISH;
        int i = this.b;
        int i2 = this.c;
        String uri = this.a.toString();
        StringBuilder n = AbstractC2437ph.n("Image ", i, "x", i2, " ");
        n.append(uri);
        return n.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkNotNull(parcel);
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getUrl(), i, false);
        SafeParcelWriter.writeInt(parcel, 2, getWidth());
        SafeParcelWriter.writeInt(parcel, 3, getHeight());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public WebServerPic(Uri uri) throws IllegalArgumentException {
        this(uri, 0, 0);
    }
}
