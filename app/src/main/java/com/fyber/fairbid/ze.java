package com.fyber.fairbid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.fairbid.mediation.Network;
import com.fyber.fairbid.sdk.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class ze extends t4<ck> {
    @NotNull
    public List<ck> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze(@NotNull LayoutInflater inflater) {
        super(inflater);
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.b = C2968vr.b;
    }

    @Override // com.fyber.fairbid.t4
    public final void a(View view, ck ckVar) {
        Network network;
        String str;
        ck testSuiteNetworkInstance = ckVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(testSuiteNetworkInstance, "testSuiteNetworkInstance");
        TextView textView = (TextView) view.findViewById(R.id.network_name);
        TextView instanceAutoEcpmView = (TextView) view.findViewById(R.id.instance_auto_ecpm);
        TextView instanceManualEcpmView = (TextView) view.findViewById(R.id.instance_manual_ecpm);
        TextView textView2 = (TextView) view.findViewById(R.id.instance_id);
        textView2.setVisibility(0);
        ImageView instanceStatusView = (ImageView) view.findViewById(R.id.instance_status);
        ((ImageView) view.findViewById(R.id.network_icon)).setImageResource(testSuiteNetworkInstance.c);
        Network[] values = Network.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                network = null;
                break;
            }
            network = values[i];
            if (Intrinsics.a(testSuiteNetworkInstance.b, network.getCanonicalName())) {
                break;
            }
            i++;
        }
        if (network == null || (str = network.getMarketingName()) == null) {
            str = testSuiteNetworkInstance.b;
        }
        textView.setText(str);
        textView2.setText("ID: " + testSuiteNetworkInstance.a);
        mb mbVar = testSuiteNetworkInstance.h;
        if (mbVar == mb.a) {
            Intrinsics.checkNotNullExpressionValue(instanceAutoEcpmView, "instanceAutoEcpmView");
            Intrinsics.checkNotNullExpressionValue(instanceManualEcpmView, "instanceManualEcpmView");
            instanceAutoEcpmView.setText(view.getContext().getString(R.string.auto_ecpm, String.valueOf(testSuiteNetworkInstance.f)));
            if (testSuiteNetworkInstance.a()) {
                instanceManualEcpmView.setVisibility(0);
                instanceManualEcpmView.setTypeface(instanceManualEcpmView.getTypeface(), 1);
                instanceAutoEcpmView.setTypeface(instanceAutoEcpmView.getTypeface(), 0);
                instanceManualEcpmView.setText(view.getContext().getString(R.string.manual_ecpm, String.valueOf(testSuiteNetworkInstance.e)));
            } else {
                instanceManualEcpmView.setVisibility(8);
                instanceAutoEcpmView.setTypeface(instanceAutoEcpmView.getTypeface(), 1);
                instanceManualEcpmView.setTypeface(instanceManualEcpmView.getTypeface(), 0);
            }
        } else {
            if (mbVar == mb.b) {
                textView2.setVisibility(8);
            }
            instanceAutoEcpmView.setVisibility(8);
            instanceManualEcpmView.setVisibility(8);
        }
        Intrinsics.checkNotNullExpressionValue(instanceStatusView, "instanceStatusView");
        lb lbVar = testSuiteNetworkInstance.g;
        instanceStatusView.setVisibility(lbVar == lb.a ? 8 : 0);
        switch (lbVar.ordinal()) {
            case 1:
            case 6:
                instanceStatusView.setImageDrawable(view.getResources().getDrawable(R.drawable.fb_instance_requesting));
                return;
            case 2:
            case 7:
                instanceStatusView.setImageDrawable(view.getResources().getDrawable(R.drawable.fb_instance_fill));
                return;
            case 3:
            case 10:
            case 11:
            case 13:
            case 14:
                instanceStatusView.setImageDrawable(view.getResources().getDrawable(R.drawable.fb_instance_failure));
                return;
            case 4:
            case 9:
                instanceStatusView.setImageDrawable(view.getResources().getDrawable(R.drawable.fb_instance_timeout));
                return;
            case 5:
            case 12:
            default:
                return;
            case 8:
                instanceStatusView.setImageDrawable(view.getResources().getDrawable(R.drawable.fb_instance_no_fill));
                return;
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return -1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 2;
    }

    public final void a(@NotNull List<ck> model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.b = model;
        notifyDataSetChanged();
    }

    @Override // com.fyber.fairbid.t4
    @NotNull
    public final View a(@NotNull LayoutInflater inflater, int i, @NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = inflater.inflate(R.layout.fb_row_instance_in_placement, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflater.inflate(R.layou…placement, parent, false)");
        return inflate;
    }

    @Override // com.fyber.fairbid.t4
    public final ck a(int i) {
        return this.b.get(i);
    }
}
