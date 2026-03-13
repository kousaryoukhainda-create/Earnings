package com.applovin.impl;

import java.util.UUID;
/* loaded from: classes.dex */
public final class k9 implements y4 {
    public static final boolean d;
    public final UUID a;
    public final byte[] b;
    public final boolean c;

    static {
        boolean z;
        if ("Amazon".equals(xp.c)) {
            String str = xp.d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                d = z;
            }
        }
        z = false;
        d = z;
    }

    public k9(UUID uuid, byte[] bArr, boolean z) {
        this.a = uuid;
        this.b = bArr;
        this.c = z;
    }
}
