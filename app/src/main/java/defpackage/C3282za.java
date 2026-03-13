package defpackage;

import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.internal.play_billing.zze;
/* renamed from: za  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3282za {
    public volatile YQ a;
    public final Context b;
    public volatile InterfaceC1273eU c;
    public volatile InterfaceC1994ka0 d;
    public volatile boolean e;

    public final boolean a() {
        Context context = this.b;
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e) {
            zze.zzm("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e);
            return false;
        }
    }
}
