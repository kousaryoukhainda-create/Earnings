package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.util.Log;
/* loaded from: classes2.dex */
public class SecurityRandomHelper {
    @SuppressLint({"StaticFieldLeak"})
    public static volatile SecurityRandomHelper instance;

    private SecurityRandomHelper() {
    }

    public static SecurityRandomHelper getInstance() {
        if (instance == null) {
            synchronized (SecurityRandomHelper.class) {
                try {
                    if (instance == null) {
                        Log.i("SecurityComp10200303: ".concat("EncryptUtil"), "setBouncycastleFlag: true");
                        instance = new SecurityRandomHelper();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public byte[] generateSecureRandom(int i) {
        return AbstractC0333Hr.b(i);
    }

    public String generateSecureRandomStr(int i) {
        return AbstractC0333Hr.c(i);
    }
}
