package com.fyber.inneractive.sdk.config.global.features;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
/* loaded from: classes.dex */
public class r extends g {
    public static final b e = b.NONE;
    public static final c f = c.NONE;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[UnitDisplayType.values().length];
            a = iArr;
            try {
                iArr[UnitDisplayType.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[UnitDisplayType.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        NONE(DevicePublicKeyStringDef.NONE),
        OPEN("open");
        
        public String mKey;

        b(String str) {
            this.mKey = str;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        NONE(DevicePublicKeyStringDef.NONE),
        ZOOM_IN("endcard_zoom_in");
        
        public String mKey;

        c(String str) {
            this.mKey = str;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        LEGACY("legacy"),
        EXTRACTOR("extractor"),
        NONE(DevicePublicKeyStringDef.NONE);
        
        public String key;

        d(String str) {
            this.key = str;
        }
    }

    public r() {
        super("video_player");
    }

    public int a(UnitDisplayType unitDisplayType) {
        if (unitDisplayType == UnitDisplayType.INTERSTITIAL) {
            Integer b2 = b("prebuffer_interstitial");
            if (b2 == null) {
                return 3;
            }
            return b2.intValue();
        }
        Integer b3 = b("prebuffer_rewarded");
        if (b3 == null) {
            return 3;
        }
        return b3.intValue();
    }

    @Override // com.fyber.inneractive.sdk.config.global.features.g
    public g b() {
        r rVar = new r();
        a(rVar);
        return rVar;
    }

    public boolean d() {
        return a("cta_text_all_caps", false);
    }

    public int e() {
        Integer b2 = b("dl_retries");
        if (b2 != null) {
            return b2.intValue();
        }
        return 10;
    }

    public int f() {
        Integer b2 = b("dl_retry_delay");
        if (b2 != null) {
            return b2.intValue();
        }
        return 500;
    }

    public int g() {
        Integer b2 = b("max_tries");
        if (b2 != null) {
            return b2.intValue();
        }
        return 0;
    }

    public int h() {
        Integer b2 = b("second_checkpoint");
        if (b2 != null) {
            return b2.intValue();
        }
        return 25;
    }
}
