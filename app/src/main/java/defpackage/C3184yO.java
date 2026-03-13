package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
/* renamed from: yO  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3184yO {
    public final Bundle a;
    public IconCompat b;
    public final UV[] c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final CharSequence h;
    public final PendingIntent i;

    public C3184yO(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, UV[] uvArr, UV[] uvArr2, boolean z, boolean z2, boolean z3) {
        this.e = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.i() == 2) {
            this.g = iconCompat.h();
        }
        this.h = EO.c(charSequence);
        this.i = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = uvArr;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final IconCompat a() {
        int i;
        if (this.b == null && (i = this.g) != 0) {
            this.b = IconCompat.f(null, "", i);
        }
        return this.b;
    }
}
