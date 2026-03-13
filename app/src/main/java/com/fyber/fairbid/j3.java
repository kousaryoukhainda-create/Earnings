package com.fyber.fairbid;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.fairbid.sdk.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class j3 {
    @NotNull
    public final View a;
    @NotNull
    public final View b;
    @NotNull
    public final ImageView c;
    @NotNull
    public final TextView d;
    @NotNull
    public final TextView e;
    @NotNull
    public final TextView f;

    public j3(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a = view;
        View findViewById = view.findViewById(R.id.auction_summary_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.auction_summary_container)");
        this.b = findViewById;
        View findViewById2 = view.findViewById(R.id.auction_winner_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.auction_winner_icon)");
        this.c = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.auction_winner_name);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.auction_winner_name)");
        this.d = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.network_instance);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.network_instance)");
        this.e = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.winning_price);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "view.findViewById(R.id.winning_price)");
        this.f = (TextView) findViewById5;
    }
}
