package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
/* loaded from: classes3.dex */
public final class zao extends AbstractC2525qi {
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent zaa(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i;
        Intent registerReceiver;
        if (zan.zaa()) {
            if (true != zan.zaa()) {
                i = 0;
            } else {
                i = 2;
            }
            registerReceiver = context.registerReceiver(broadcastReceiver, intentFilter, i);
            return registerReceiver;
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
