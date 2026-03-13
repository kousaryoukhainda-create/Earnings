package defpackage;

import android.os.Bundle;
import android.os.Process;
import com.fyber.fairbid.internal.Framework;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
/* renamed from: Zm0  reason: default package */
/* loaded from: classes3.dex */
public abstract class Zm0 {
    public static final HashMap a;

    static {
        new HashSet(Arrays.asList(Framework.NATIVE, "unity"));
        a = new HashMap();
        AbstractC2437ph.e("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("PlayCoreVersion");
    }

    public static Bundle a() {
        HashMap hashMap;
        Bundle bundle = new Bundle();
        synchronized (Zm0.class) {
            hashMap = a;
            hashMap.put("java", 11004);
        }
        bundle.putInt("playcore_version_code", ((Integer) hashMap.get("java")).intValue());
        if (hashMap.containsKey(Framework.NATIVE)) {
            bundle.putInt("playcore_native_version", ((Integer) hashMap.get(Framework.NATIVE)).intValue());
        }
        if (hashMap.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) hashMap.get("unity")).intValue());
        }
        return bundle;
    }
}
