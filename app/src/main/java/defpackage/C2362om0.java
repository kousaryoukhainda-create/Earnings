package defpackage;

import com.google.android.gms.internal.play_billing.zzav;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzr;
/* renamed from: om0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2362om0 {
    public final /* synthetic */ C3307zm0 a;
    public final /* synthetic */ int b;

    public /* synthetic */ C2362om0(C3307zm0 c3307zm0, int i) {
        this.a = c3307zm0;
        this.b = i;
    }

    public final void a(zzr zzrVar) {
        String str;
        C3307zm0 c3307zm0 = this.a;
        int i = this.b;
        c3307zm0.getClass();
        try {
            if (c3307zm0.H != null) {
                zzav zzavVar = c3307zm0.H;
                String packageName = c3307zm0.F.getPackageName();
                switch (i) {
                    case 2:
                        str = "LAUNCH_BILLING_FLOW";
                        break;
                    case 3:
                        str = "ACKNOWLEDGE_PURCHASE";
                        break;
                    case 4:
                        str = "CONSUME_ASYNC";
                        break;
                    case 5:
                        str = "IS_FEATURE_SUPPORTED";
                        break;
                    case 6:
                        str = "START_CONNECTION";
                        break;
                    case 7:
                        str = "QUERY_PRODUCT_DETAILS_ASYNC";
                        break;
                    default:
                        str = "QUERY_SKU_DETAILS_ASYNC";
                        break;
                }
                zzavVar.zza(packageName, str, new BinderC2619rm0(zzrVar));
                return;
            }
            throw null;
        } catch (Exception e) {
            c3307zm0.T(107, 28, Im0.E);
            zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", e);
            zzrVar.zzb(0);
        }
    }
}
