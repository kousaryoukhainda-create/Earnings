package defpackage;

import android.app.Notification;
/* renamed from: oy  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2374oy {
    public final int a;
    public final int b;
    public final Notification c;

    public C2374oy(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2374oy.class != obj.getClass()) {
            return false;
        }
        C2374oy c2374oy = (C2374oy) obj;
        if (this.a != c2374oy.a || this.b != c2374oy.b) {
            return false;
        }
        return this.c.equals(c2374oy.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
