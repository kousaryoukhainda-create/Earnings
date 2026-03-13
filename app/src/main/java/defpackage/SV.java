package defpackage;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import java.util.Set;
/* renamed from: SV  reason: default package */
/* loaded from: classes.dex */
public abstract class SV {
    public static void a(UV uv, Intent intent, Map<String, Uri> map) {
        RemoteInput.addDataResultToIntent(UV.a(uv), intent, map);
    }

    public static Set<String> b(Object obj) {
        return ((RemoteInput) obj).getAllowedDataTypes();
    }

    public static Map<String, Uri> c(Intent intent, String str) {
        return RemoteInput.getDataResultsFromIntent(intent, str);
    }

    public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z) {
        return builder.setAllowDataType(str, z);
    }
}
