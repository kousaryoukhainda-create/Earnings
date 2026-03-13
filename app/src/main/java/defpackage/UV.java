package defpackage;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
/* renamed from: UV  reason: default package */
/* loaded from: classes.dex */
public final class UV {
    public final String a;
    public final CharSequence[] b;
    public final boolean c;
    public final Bundle d;
    public final HashSet e;

    public UV(String str, CharSequence[] charSequenceArr, boolean z, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = charSequenceArr;
        this.c = z;
        this.d = bundle;
        this.e = hashSet;
    }

    public static RemoteInput a(UV uv) {
        uv.getClass();
        RemoteInput.Builder addExtras = new RemoteInput.Builder("FlutterLocalNotificationsPluginInputResult").setLabel(uv.a).setChoices(uv.b).setAllowFreeFormInput(uv.c).addExtras(uv.d);
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator it = uv.e.iterator();
            while (it.hasNext()) {
                SV.d(addExtras, (String) it.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            TV.b(addExtras, 0);
        }
        return addExtras.build();
    }
}
