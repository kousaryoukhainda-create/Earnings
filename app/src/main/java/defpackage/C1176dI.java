package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
/* renamed from: dI  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1176dI {
    public final IntentFilter a;
    public final BroadcastReceiver b;
    public boolean c;
    public boolean d;

    public C1176dI(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.a = intentFilter;
        this.b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) UserVerificationMethods.USER_VERIFY_PATTERN);
        sb.append("Receiver{");
        sb.append(this.b);
        sb.append(" filter=");
        sb.append(this.a);
        if (this.d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
