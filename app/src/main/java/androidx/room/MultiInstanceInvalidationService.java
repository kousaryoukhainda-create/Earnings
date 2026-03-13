package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;
/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {
    public int b = 0;
    public final HashMap c = new HashMap();
    public final RemoteCallbackListC2238nN d = new RemoteCallbackListC2238nN(this);
    public final BinderC3004wG f = new BinderC3004wG(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f;
    }
}
