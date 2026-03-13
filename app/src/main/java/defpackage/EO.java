package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.ykapps.earnings.R;
import java.util.ArrayList;
/* renamed from: EO  reason: default package */
/* loaded from: classes.dex */
public final class EO {
    public Bundle A;
    public String D;
    public String F;
    public long G;
    public final boolean I;
    public final Notification J;
    public boolean K;
    public final ArrayList L;
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public PendingIntent h;
    public IconCompat i;
    public CharSequence j;
    public int k;
    public int l;
    public boolean n;
    public TO o;
    public CharSequence p;
    public int q;
    public int r;
    public boolean s;
    public String t;
    public boolean u;
    public String v;
    public boolean x;
    public boolean y;
    public String z;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean m = true;
    public boolean w = false;
    public int B = 0;
    public int C = 0;
    public int E = 0;
    public int H = 0;

    public EO(Context context, String str) {
        Notification notification = new Notification();
        this.J = notification;
        this.a = context;
        this.D = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.l = 0;
        this.L = new ArrayList();
        this.I = true;
    }

    public static CharSequence c(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    public final void a(int i, String str, PendingIntent pendingIntent) {
        IconCompat f;
        ArrayList arrayList = this.b;
        if (i == 0) {
            f = null;
        } else {
            f = IconCompat.f(null, "", i);
        }
        arrayList.add(new C3184yO(f, str, pendingIntent, new Bundle(), null, null, true, true, false));
    }

    public final Notification b() {
        Notification build;
        Bundle bundle;
        Q70 q70 = new Q70(this);
        EO eo = (EO) q70.f;
        TO to = eo.o;
        if (to != null) {
            to.b(q70);
        }
        if (to != null) {
            to.e();
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) q70.d;
        if (i >= 26) {
            build = builder.build();
        } else {
            int i2 = q70.b;
            if (i >= 24) {
                build = builder.build();
                if (i2 != 0) {
                    if (UO.f(build) != null && (build.flags & 512) != 0 && i2 == 2) {
                        Q70.f(build);
                    }
                    if (UO.f(build) != null && (build.flags & 512) == 0 && i2 == 1) {
                        Q70.f(build);
                    }
                }
            } else {
                builder.setExtras((Bundle) q70.g);
                build = builder.build();
                if (i2 != 0) {
                    if (UO.f(build) != null && (build.flags & 512) != 0 && i2 == 2) {
                        Q70.f(build);
                    }
                    if (UO.f(build) != null && (build.flags & 512) == 0 && i2 == 1) {
                        Q70.f(build);
                    }
                }
            }
        }
        if (to != null) {
            to.d();
        }
        if (to != null) {
            eo.o.f();
        }
        if (to != null && (bundle = build.extras) != null) {
            to.a(bundle);
        }
        return build;
    }

    public final void d(int i, boolean z) {
        Notification notification = this.J;
        if (z) {
            notification.flags = i | notification.flags;
            return;
        }
        notification.flags = (~i) & notification.flags;
    }

    public final void e(Bitmap bitmap) {
        IconCompat d;
        if (bitmap == null) {
            d = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            d = IconCompat.d(bitmap);
        }
        this.i = d;
    }

    public final void f(int i, int i2, int i3) {
        int i4;
        Notification notification = this.J;
        notification.ledARGB = i;
        notification.ledOnMS = i2;
        notification.ledOffMS = i3;
        if (i2 != 0 && i3 != 0) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        notification.flags = i4 | (notification.flags & (-2));
    }

    public final void g(Uri uri) {
        Notification notification = this.J;
        notification.sound = uri;
        notification.audioStreamType = -1;
        notification.audioAttributes = DO.a(DO.e(DO.c(DO.b(), 4), 5));
    }

    public final void h(TO to) {
        if (this.o != to) {
            this.o = to;
            if (to != null && to.a != this) {
                to.a = this;
                h(to);
            }
        }
    }
}
