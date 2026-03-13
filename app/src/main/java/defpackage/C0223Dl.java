package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: Dl  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0223Dl {
    public static final /* synthetic */ int i = 0;
    public final Uri a;
    public final int b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;
    public final String g;
    public final int h;

    static {
        WK.a("media3.datasource");
    }

    public C0223Dl(Uri uri, int i2, byte[] bArr, Map map, long j, long j2, String str, int i3) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        B10.j(z);
        if (j >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        B10.j(z2);
        B10.j((j2 > 0 || j2 == -1) ? true : true);
        uri.getClass();
        this.a = uri;
        this.b = i2;
        this.c = (bArr == null || bArr.length == 0) ? null : null;
        this.d = Collections.unmodifiableMap(new HashMap(map));
        this.e = j;
        this.f = j2;
        this.g = str;
        this.h = i3;
    }

    public final C0223Dl a(long j) {
        long j2 = this.f;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        long j4 = j3;
        if (j == 0 && j2 == j4) {
            return this;
        }
        byte[] bArr = this.c;
        int i2 = this.h;
        return new C0223Dl(this.a, this.b, bArr, this.d, this.e + j, j4, this.g, i2);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i2 = this.b;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    str = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str = "POST";
            }
        } else {
            str = "GET";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        return AbstractC2437ph.k(sb, this.h, "]");
    }
}
