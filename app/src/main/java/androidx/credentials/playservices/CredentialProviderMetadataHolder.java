package androidx.credentials.playservices;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata
/* loaded from: classes.dex */
public final class CredentialProviderMetadataHolder extends Service {
    public final BinderC1385fk b = new Binder();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.b;
    }
}
