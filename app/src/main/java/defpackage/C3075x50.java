package defpackage;

import android.os.Message;
import java.util.ArrayList;
/* renamed from: x50  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3075x50 {
    public Message a;

    public final void a() {
        this.a = null;
        ArrayList arrayList = C3161y50.b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
