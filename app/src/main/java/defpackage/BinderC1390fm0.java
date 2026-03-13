package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.zzab;
import com.google.android.gms.internal.play_billing.zzbf;
import com.google.android.gms.internal.play_billing.zze;
import java.lang.ref.WeakReference;
/* renamed from: fm0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1390fm0 extends zzab {
    public final WeakReference b;
    public final ResultReceiver c;

    public /* synthetic */ BinderC1390fm0(WeakReference weakReference, ResultReceiver resultReceiver) {
        this.b = weakReference;
        this.c = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.zzac
    public final void zza(Bundle bundle) {
        ResultReceiver resultReceiver = this.c;
        if (bundle == null) {
            resultReceiver.send(6, null);
        } else if (!bundle.containsKey("RESPONSE_CODE")) {
            zze.zzl("BillingClient", "Response bundle doesn't contain a response code");
            resultReceiver.send(6, bundle);
        } else {
            int zzb = zze.zzb(bundle, "BillingClient");
            if (zzb != 0) {
                zze.zzl("BillingClient", "Unable to launch intent for alternative billing only dialog" + zzb);
                resultReceiver.send(zzb, bundle);
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            if (pendingIntent == null) {
                zze.zzk("BillingClient", "User has acknowledged the alternative billing only dialog before.");
                resultReceiver.send(0, bundle);
                return;
            }
            try {
                Activity activity = (Activity) this.b.get();
                Intent intent = new Intent(activity, ProxyBillingActivityV2.class);
                intent.putExtra("alternative_billing_only_dialog_result_receiver", resultReceiver);
                intent.putExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT", pendingIntent);
                activity.startActivity(intent);
            } catch (RuntimeException e) {
                zze.zzm("BillingClient", "Runtime error while launching intent for alternative billing only dialog.", e);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("RESPONSE_CODE", 6);
                bundle2.putString("DEBUG_MESSAGE", "An internal error occurred.");
                bundle2.putInt("INTERNAL_LOG_ERROR_REASON", 75);
                String name = e.getClass().getName();
                String zzb2 = zzbf.zzb(e.getMessage());
                bundle2.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", name + ": " + zzb2);
                resultReceiver.send(6, bundle2);
            }
        }
    }
}
