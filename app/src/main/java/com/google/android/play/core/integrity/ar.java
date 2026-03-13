package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
/* loaded from: classes3.dex */
final class ar extends ResultReceiver {
    final /* synthetic */ as a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ar(as asVar, Handler handler) {
        super(handler);
        this.a = asVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.a.a.trySetResult(1);
                return;
            }
            this.a.a.trySetResult(2);
            return;
        }
        this.a.a.trySetResult(3);
    }
}
