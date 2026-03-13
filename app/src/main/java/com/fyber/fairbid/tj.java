package com.fyber.fairbid;

import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fyber.fairbid.plugin.adtransparency.AdTransparencyPlugin;
import com.fyber.fairbid.sdk.R;
import com.fyber.fairbid.sdk.testsuite.bus.EventBus;
/* loaded from: classes.dex */
public final class tj extends Fragment {
    public final Handler.Callback a = new C2919vH(this, 4);

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fb_fragment_splash_screen, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.sdk_version)).setText(getString(R.string.fb_ts_sdk_version, AdTransparencyPlugin.currentFairBidSdkVersion));
        inflate.findViewById(R.id.TestSuite_CloseImageButton).setOnClickListener(new TJ(this, 1));
        return inflate;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        EventBus.unregisterReceiver(3, this.a);
        EventBus.unregisterReceiver(7, this.a);
        Handler handler = EventBus.eventBusMainThread;
        handler.removeMessages(7);
        handler.removeMessages(3);
        super.onPause();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        EventBus.registerReceiver(3, this.a);
        EventBus.registerReceiver(7, this.a);
        Handler handler = EventBus.eventBusMainThread;
        handler.sendEmptyMessageDelayed(3, getResources().getInteger(R.integer.fb_splash_screen_min_duration));
        handler.sendEmptyMessageDelayed(7, getResources().getInteger(R.integer.fb_splash_screen_extended_duration));
    }

    public /* synthetic */ boolean a(Message message) {
        int i = message.what;
        if (i == 3) {
            getView().findViewById(R.id.progress_group).setVisibility(0);
            getView().findViewById(R.id.TestSuite_CloseImageButton).setVisibility(0);
        } else if (i == 7) {
            ((TextView) getView().findViewById(R.id.progress_message)).setText(R.string.fb_ts_configuration_fetching_extended);
        }
        return false;
    }

    public /* synthetic */ void a(View view) {
        getActivity().finish();
    }
}
