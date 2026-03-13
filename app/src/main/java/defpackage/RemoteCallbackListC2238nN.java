package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
import java.util.HashMap;
/* renamed from: nN  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RemoteCallbackListC2238nN extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public RemoteCallbackListC2238nN(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        FC fc = (FC) iInterface;
        HashMap hashMap = this.a.c;
        Integer num = (Integer) obj;
        num.intValue();
        hashMap.remove(num);
    }
}
