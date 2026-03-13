package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFc1uSDK;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class AFf1gSDK {

    /* loaded from: classes.dex */
    public enum AFa1vSDK {
        UNKNOWN("uk"),
        ACCELEROMETER("am"),
        MAGNETOMETER("mm"),
        RESERVED("rs"),
        GYROSCOPE("gs");
        
        String values;

        AFa1vSDK(String str) {
            this.values = str;
        }
    }

    /* loaded from: classes.dex */
    public enum AFa1xSDK {
        NONE,
        FIRST,
        ALL
    }

    /* loaded from: classes.dex */
    public enum AFa1zSDK {
        UNKNOWN(0),
        ACCELEROMETER(1),
        MAGNETOMETER(2),
        RESERVED(3),
        GYROSCOPE(4);
        
        private int afRDLog;

        AFa1zSDK(int i) {
            this.afRDLog = i;
        }
    }

    public static List<BigDecimal> AFKeystoreWrapper(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Float f = (Float) arrayList.get(0);
        Float f2 = (Float) arrayList.get(1);
        Float f3 = (Float) arrayList.get(2);
        ArrayList arrayList2 = new ArrayList();
        try {
            arrayList2.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.values(f.toString())));
            arrayList2.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.values(f2.toString())));
            arrayList2.add(BigDecimal.valueOf(AFc1uSDK.AFa1wSDK.values(f3.toString())));
        } catch (ParseException e) {
            AFLogger.afErrorLogForExcManagerOnly("failed to parse string to number", e);
        }
        return arrayList2;
    }
}
