package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
@KeepForSdk
/* loaded from: classes3.dex */
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(@NonNull StringBuilder sb, @NonNull HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = hashMap.get(str);
            AbstractC0324Hi.w(sb, "\"", str, "\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                AbstractC0324Hi.w(sb, "\"", str2, "\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
