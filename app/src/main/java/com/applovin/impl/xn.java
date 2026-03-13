package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
final class xn {
    private static final Pattern d = Pattern.compile("\\s+");
    private static final hb e = hb.a("auto", DevicePublicKeyStringDef.NONE);
    private static final hb f = hb.a("dot", "sesame", "circle");
    private static final hb g = hb.a("filled", "open");
    private static final hb h = hb.a("after", "before", "outside");
    public final int a;
    public final int b;
    public final int c;

    private xn(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static xn a(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return a(hb.a((Object[]) TextUtils.split(lowerCase, d)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00eb, code lost:
        if (r9.equals("dot") != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.applovin.impl.xn a(com.applovin.impl.hb r9) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.xn.a(com.applovin.impl.hb):com.applovin.impl.xn");
    }
}
