package defpackage;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
/* renamed from: RV  reason: default package */
/* loaded from: classes.dex */
public abstract class RV {
    public static void a(Object obj, Intent intent, Bundle bundle) {
        RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
    }

    public static Bundle b(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }
}
