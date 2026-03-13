package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
/* renamed from: B50  reason: default package */
/* loaded from: classes.dex */
public final class B50 {
    public static final String b = EI.e("SystemJobInfoConverter");
    public final ComponentName a;

    public B50(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
