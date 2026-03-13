package com.google.android.play.core.review;

import android.app.PendingIntent;
/* loaded from: classes3.dex */
final class zza extends ReviewInfo {
    public final PendingIntent b;
    public final boolean c;

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            this.b = pendingIntent;
            this.c = z;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.b.equals(((zza) reviewInfo).b) && this.c == ((zza) reviewInfo).c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String obj = this.b.toString();
        return "ReviewInfo{pendingIntent=" + obj + ", isNoOp=" + this.c + "}";
    }
}
