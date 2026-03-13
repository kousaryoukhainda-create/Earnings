package com.fyber.fairbid;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.fairbid.sdk.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class zh {
    @NotNull
    public final View a;
    @NotNull
    public final View b;
    @NotNull
    public final TextView c;
    @NotNull
    public final ImageView d;
    @NotNull
    public final View e;
    @NotNull
    public final TextView f;
    @NotNull
    public final ImageView g;
    @NotNull
    public final View h;
    @NotNull
    public final TextView i;
    @NotNull
    public final ImageView j;
    public final int k;
    public final int l;

    public zh(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        View findViewById = view.findViewById(R.id.fb_placement_request_status);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.f…placement_request_status)");
        this.a = findViewById;
        View findViewById2 = view.findViewById(R.id.request_status_audit_group);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.request_status_audit_group)");
        this.b = findViewById2;
        View findViewById3 = view.findViewById(R.id.request_status_audit_waterfall_group);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.r…us_audit_waterfall_group)");
        this.c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.waterfall_auditing_finish_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.w…uditing_finish_indicator)");
        this.d = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.request_status_auction_group);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "view.findViewById(R.id.r…est_status_auction_group)");
        this.e = findViewById5;
        View findViewById6 = view.findViewById(R.id.request_status_auction);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "view.findViewById(R.id.request_status_auction)");
        this.f = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.auction_finish_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "view.findViewById(R.id.auction_finish_indicator)");
        this.g = (ImageView) findViewById7;
        View findViewById8 = view.findViewById(R.id.request_status_programmatic_group);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "view.findViewById(R.id.r…tatus_programmatic_group)");
        this.h = findViewById8;
        View findViewById9 = view.findViewById(R.id.request_status_loading_ad);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "view.findViewById(R.id.request_status_loading_ad)");
        this.i = (TextView) findViewById9;
        View findViewById10 = view.findViewById(R.id.loading_ad_finish_indicator);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "view.findViewById(R.id.l…ding_ad_finish_indicator)");
        this.j = (ImageView) findViewById10;
        this.k = view.getResources().getColor(17170443);
        this.l = view.getResources().getColor(R.color.fb_ts_text_disabled);
    }
}
