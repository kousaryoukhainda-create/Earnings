package defpackage;

import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
/* renamed from: WQ  reason: default package */
/* loaded from: classes.dex */
public final class WQ {
    public final WC a;
    public final DynamicLinkData b;

    public WQ(DynamicLinkData dynamicLinkData) {
        if (dynamicLinkData == null) {
            this.b = null;
            this.a = null;
            return;
        }
        if (dynamicLinkData.f == 0) {
            dynamicLinkData.f = DefaultClock.getInstance().currentTimeMillis();
        }
        this.b = dynamicLinkData;
        this.a = new WC(dynamicLinkData);
    }
}
