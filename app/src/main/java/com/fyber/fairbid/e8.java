package com.fyber.fairbid;

import com.fyber.fairbid.internal.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class e8 implements v4 {
    public final int a;
    public final int b;
    public final int c;

    public e8(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // com.fyber.fairbid.v4
    public final boolean a(int i, @NotNull pa impressionsStore) {
        int a;
        String str;
        Intrinsics.checkNotNullParameter(impressionsStore, "impressionsStore");
        long currentTimeMillis = System.currentTimeMillis() - (this.b * 1000);
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    a = -1;
                } else {
                    a = impressionsStore.a("timestamp > ? AND network_id = ? ", currentTimeMillis, i);
                }
            } else {
                a = impressionsStore.a("timestamp > ? AND ad_unit_id = ? ", currentTimeMillis, i);
            }
        } else {
            a = impressionsStore.a("timestamp > ? AND placement_id = ? ", currentTimeMillis, i);
        }
        if (a >= this.a) {
            int i3 = this.c;
            if (i3 != 0) {
                if (i3 != 1) {
                    str = "Network";
                } else {
                    str = "Ad Unit";
                }
            } else {
                str = "Placement";
            }
            Logger.debug(str + " with id " + i + " has reached its frequency limit of " + this.a + " impressions every " + this.b + " seconds");
            return true;
        }
        return false;
    }
}
