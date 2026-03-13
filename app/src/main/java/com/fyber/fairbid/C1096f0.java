package com.fyber.fairbid;

import androidx.annotation.NonNull;
import com.fyber.fairbid.ads.banner.BannerOptions;
import com.fyber.fairbid.ads.banner.BannerSize;
import com.fyber.fairbid.internal.Constants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* renamed from: com.fyber.fairbid.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1096f0 implements x9 {
    public boolean a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final BannerSize f;
    public final BannerOptions.RefreshMode g;

    /* renamed from: com.fyber.fairbid.f0$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Constants.AdType.values().length];
            a = iArr;
            try {
                iArr[Constants.AdType.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Constants.AdType.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Constants.AdType.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C1096f0(String str, String str2, @NonNull int i, int i2) {
        this(str, str2, i, i2, null, null);
    }

    @Override // com.fyber.fairbid.u6
    @NonNull
    public final Map<String, ?> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("placement_id", Integer.valueOf(this.e));
        String str = this.b;
        if (str != null || this.a) {
            hashMap.put("ad_request_id", str);
        }
        String str2 = this.c;
        if (str2 != null || this.a) {
            hashMap.put("mediation_session_id", str2);
        }
        hashMap.put("placement_type", C1098g0.a(this.d));
        if (this.d == 1) {
            BannerSize bannerSize = this.f;
            if (bannerSize != null) {
                hashMap.put("banner_size", bannerSize.toString());
            }
            BannerOptions.RefreshMode refreshMode = this.g;
            if (refreshMode != null) {
                hashMap.put("banner_refresh_mode", refreshMode.toString().toLowerCase(Locale.getDefault()));
            }
        }
        return hashMap;
    }

    public C1096f0(String str, String str2, @NonNull int i, int i2, BannerSize bannerSize, BannerOptions.RefreshMode refreshMode) {
        this.a = true;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = bannerSize;
        this.g = refreshMode;
    }
}
