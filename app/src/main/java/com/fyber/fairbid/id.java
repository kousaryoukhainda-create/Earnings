package com.fyber.fairbid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.fyber.fairbid.internal.Constants;
import com.fyber.fairbid.sdk.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class id extends t4<ci<? extends oh>> {
    public List<oh> b;
    public Map<eb, ci<? extends oh>> c;
    public boolean d;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Constants.AdType.values().length];
            a = iArr;
            try {
                iArr[Constants.AdType.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Constants.AdType.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Constants.AdType.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public id(LayoutInflater layoutInflater) {
        super(layoutInflater);
        this.b = Collections.emptyList();
        this.c = Collections.emptyMap();
        this.d = false;
    }

    @Override // com.fyber.fairbid.t4
    public final void a(@NonNull View view, @NonNull ci<? extends oh> ciVar) {
        ci<? extends oh> ciVar2 = ciVar;
        eb ebVar = ciVar2.a.a;
        ImageView imageView = (ImageView) view.findViewById(R.id.placement_icon);
        TextView textView = (TextView) view.findViewById(R.id.placement_type);
        int i = a.a[ebVar.c.ordinal()];
        if (i == 1) {
            imageView.setImageResource(R.drawable.fb_ic_banner);
            textView.setText(view.getResources().getString(R.string.fb_ts_network_placement_type_banner, ebVar.d.isMrec() ? "MREC" : "SMART"));
        } else if (i == 2) {
            imageView.setImageResource(R.drawable.fb_ic_interstitial);
            textView.setText(R.string.fb_ts_network_placement_type_interstitial);
        } else if (i == 3) {
            imageView.setImageResource(R.drawable.fb_ic_rewarded);
            textView.setText(R.string.fb_ts_network_placement_type_rewarded);
        }
        ((TextView) view.findViewById(R.id.placement_name)).setText(ebVar.b);
        if (this.d) {
            view.findViewById(R.id.placement_actions).setVisibility(0);
            ciVar2.a(view);
            return;
        }
        view.findViewById(R.id.placement_actions).setVisibility(8);
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
        if (this.b.get(i).a.c == Constants.AdType.BANNER) {
            return 2;
        }
        return 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // com.fyber.fairbid.t4
    public final View a(LayoutInflater layoutInflater, int i, ViewGroup viewGroup) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return layoutInflater.inflate(R.layout.fb_row_banner_placement, viewGroup, false);
        }
        return layoutInflater.inflate(R.layout.fb_row_full_screen_placement, viewGroup, false);
    }

    @Override // com.fyber.fairbid.t4
    public final ci<? extends oh> a(int i) {
        oh ohVar = this.b.get(i);
        eb ebVar = ohVar.a;
        ci<? extends oh> ciVar = this.c.get(ebVar);
        if (ciVar == null) {
            if (ebVar.c == Constants.AdType.BANNER) {
                ciVar = new w3((t3) ohVar);
            } else {
                ciVar = new n8((m8) ohVar);
            }
            this.c.put(ebVar, ciVar);
        }
        return ciVar;
    }
}
