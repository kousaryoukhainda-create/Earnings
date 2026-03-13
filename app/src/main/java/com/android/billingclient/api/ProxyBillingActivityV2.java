package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zze;
import kotlin.jvm.internal.Intrinsics;
@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivityV2 extends AbstractActivityC0347If {
    public N1 b;
    public N1 c;
    public ResultReceiver d;
    public ResultReceiver f;

    @Override // defpackage.AbstractActivityC0347If, defpackage.AbstractActivityC0321Hf, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b = registerForActivityResult(new M1(2), new C2407pK(this, 25));
        this.c = registerForActivityResult(new M1(2), new C0942bV(this, 20));
        if (bundle == null) {
            zze.zzk("ProxyBillingActivityV2", "Launching Play Store billing dialog");
            if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
                PendingIntent pendingIntent = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                this.d = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                N1 n1 = this.b;
                Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
                IntentSender intentSender = pendingIntent.getIntentSender();
                Intrinsics.checkNotNullExpressionValue(intentSender, "pendingIntent.intentSender");
                Intrinsics.checkNotNullParameter(intentSender, "intentSender");
                n1.a(new IntentSenderRequest(intentSender, null, 0, 0));
            } else if (getIntent().hasExtra("external_payment_dialog_pending_intent")) {
                PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
                this.f = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
                N1 n12 = this.c;
                Intrinsics.checkNotNullParameter(pendingIntent2, "pendingIntent");
                IntentSender intentSender2 = pendingIntent2.getIntentSender();
                Intrinsics.checkNotNullExpressionValue(intentSender2, "pendingIntent.intentSender");
                Intrinsics.checkNotNullParameter(intentSender2, "intentSender");
                n12.a(new IntentSenderRequest(intentSender2, null, 0, 0));
            }
        } else if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
            this.d = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
        } else if (bundle.containsKey("external_payment_dialog_result_receiver")) {
            this.f = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
        }
    }

    @Override // defpackage.AbstractActivityC0347If, defpackage.AbstractActivityC0321Hf, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.d;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
