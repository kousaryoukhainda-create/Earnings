package defpackage;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.inapppurchase.Messages;
/* renamed from: tM  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2752tM implements BasicMessageChannel.Reply {
    public final /* synthetic */ int b;
    public final /* synthetic */ Messages.VoidResult c;
    public final /* synthetic */ String d;

    public /* synthetic */ C2752tM(Messages.VoidResult voidResult, String str, int i) {
        this.b = i;
        this.c = voidResult;
        this.d = str;
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
    public final void reply(Object obj) {
        switch (this.b) {
            case 0:
                Messages.InAppPurchaseCallbackApi.a(this.c, this.d, obj);
                return;
            case 1:
                Messages.InAppPurchaseCallbackApi.b(this.c, this.d, obj);
                return;
            default:
                Messages.InAppPurchaseCallbackApi.c(this.c, this.d, obj);
                return;
        }
    }
}
