package defpackage;

import android.os.Handler;
import android.os.Message;
import com.fyber.fairbid.sdk.testsuite.bus.EventBus;
/* renamed from: Rr  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0592Rr implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return EventBus.a(message);
    }
}
