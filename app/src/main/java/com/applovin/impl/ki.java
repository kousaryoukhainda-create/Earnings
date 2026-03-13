package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.o2;
/* loaded from: classes.dex */
public abstract class ki implements o2 {
    public static final o2.a a = new Jh0(9);

    public static ki a(Bundle bundle) {
        int i = bundle.getInt(a(0), -1);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return (ki) co.d.a(bundle);
                    }
                    throw new IllegalArgumentException(AbstractC0324Hi.e(i, "Encountered unknown rating type: "));
                }
                return (ki) cl.d.a(bundle);
            }
            return (ki) fh.c.a(bundle);
        }
        return (ki) ma.d.a(bundle);
    }

    public static /* synthetic */ ki c(Bundle bundle) {
        return a(bundle);
    }

    private static String a(int i) {
        return Integer.toString(i, 36);
    }
}
