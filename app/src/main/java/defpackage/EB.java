package defpackage;

import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: EB  reason: default package */
/* loaded from: classes.dex */
public final class EB extends AbstractC1431gG implements Function1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ HiddenActivity i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EB(HiddenActivity hiddenActivity, int i, int i2) {
        super(1);
        this.h = i2;
        this.i = hiddenActivity;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.h) {
            case 0:
                HiddenActivity hiddenActivity = this.i;
                BeginSignInResult beginSignInResult = (BeginSignInResult) obj;
                try {
                    hiddenActivity.c = true;
                    hiddenActivity.startIntentSenderForResult(beginSignInResult.getPendingIntent().getIntentSender(), this.j, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e) {
                    ResultReceiver resultReceiver = hiddenActivity.b;
                    Intrinsics.b(resultReceiver);
                    hiddenActivity.a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e.getMessage());
                }
                return B90.a;
            case 1:
                HiddenActivity hiddenActivity2 = this.i;
                SavePasswordResult savePasswordResult = (SavePasswordResult) obj;
                try {
                    hiddenActivity2.c = true;
                    hiddenActivity2.startIntentSenderForResult(savePasswordResult.getPendingIntent().getIntentSender(), this.j, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e2) {
                    ResultReceiver resultReceiver2 = hiddenActivity2.b;
                    Intrinsics.b(resultReceiver2);
                    hiddenActivity2.a(resultReceiver2, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e2.getMessage());
                }
                return B90.a;
            case 2:
                HiddenActivity hiddenActivity3 = this.i;
                PendingIntent result = (PendingIntent) obj;
                Intrinsics.checkNotNullParameter(result, "result");
                try {
                    hiddenActivity3.c = true;
                    hiddenActivity3.startIntentSenderForResult(result.getIntentSender(), this.j, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e3) {
                    ResultReceiver resultReceiver3 = hiddenActivity3.b;
                    Intrinsics.b(resultReceiver3);
                    hiddenActivity3.a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e3.getMessage());
                }
                return B90.a;
            default:
                HiddenActivity hiddenActivity4 = this.i;
                PendingIntent pendingIntent = (PendingIntent) obj;
                try {
                    hiddenActivity4.c = true;
                    hiddenActivity4.startIntentSenderForResult(pendingIntent.getIntentSender(), this.j, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e4) {
                    ResultReceiver resultReceiver4 = hiddenActivity4.b;
                    Intrinsics.b(resultReceiver4);
                    hiddenActivity4.a(resultReceiver4, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e4.getMessage());
                }
                return B90.a;
        }
    }
}
