package com.applovin.impl;

import com.applovin.impl.af;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class y9 {
    private static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public boolean a() {
        return (this.a == -1 || this.b == -1) ? false : true;
    }

    public boolean a(af afVar) {
        for (int i = 0; i < afVar.c(); i++) {
            af.b a = afVar.a(i);
            if (a instanceof u3) {
                u3 u3Var = (u3) a;
                if ("iTunSMPB".equals(u3Var.c) && a(u3Var.d)) {
                    return true;
                }
            } else if (a instanceof rb) {
                rb rbVar = (rb) a;
                if ("com.apple.iTunes".equals(rbVar.b) && "iTunSMPB".equals(rbVar.c) && a(rbVar.d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean a(int i) {
        int i2 = i >> 12;
        int i3 = i & 4095;
        if (i2 > 0 || i3 > 0) {
            this.a = i2;
            this.b = i3;
            return true;
        }
        return false;
    }

    private boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (matcher.find()) {
            try {
                int parseInt = Integer.parseInt((String) xp.a((Object) matcher.group(1)), 16);
                int parseInt2 = Integer.parseInt((String) xp.a((Object) matcher.group(2)), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.a = parseInt;
                    this.b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }
}
