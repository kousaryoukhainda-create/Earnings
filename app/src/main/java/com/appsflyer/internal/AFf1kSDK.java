package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class AFf1kSDK implements SensorEventListener {
    @NonNull
    private final String AFInAppEventType;
    @NonNull
    private final String AFKeystoreWrapper;
    private final int AFLogger;
    private long afDebugLog;
    private double afErrorLog;
    private Executor afRDLog;
    private final int valueOf;
    private final float[][] values = new float[2];
    private final long[] AFInAppEventParameterName = new long[2];

    public AFf1kSDK(Sensor sensor) {
        int type = sensor.getType();
        this.valueOf = type;
        String name = sensor.getName();
        name = name == null ? "" : name;
        this.AFInAppEventType = name;
        String vendor = sensor.getVendor();
        String str = vendor != null ? vendor : "";
        this.AFKeystoreWrapper = str;
        this.AFLogger = str.hashCode() + ((name.hashCode() + ((type + 31) * 31)) * 31);
    }

    @NonNull
    private synchronized Executor AFInAppEventParameterName() {
        try {
            if (this.afRDLog == null) {
                this.afRDLog = Executors.newSingleThreadExecutor();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.afRDLog;
    }

    @NonNull
    private static List<Float> AFInAppEventType(@NonNull float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    private static double AFKeystoreWrapper(@NonNull float[] fArr, @NonNull float[] fArr2) {
        int min = Math.min(fArr.length, fArr2.length);
        double d = 0.0d;
        for (int i = 0; i < min; i++) {
            d += StrictMath.pow(fArr[i] - fArr2[i], 2.0d);
        }
        return Math.sqrt(d);
    }

    /* renamed from: values */
    public void AFKeystoreWrapper(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long currentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.values;
        float[] fArr3 = fArr2[0];
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            this.AFInAppEventParameterName[0] = currentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            this.values[1] = copyOf;
            this.AFInAppEventParameterName[1] = currentTimeMillis;
            this.afErrorLog = AFKeystoreWrapper(fArr3, copyOf);
        } else if (50000000 <= j - this.afDebugLog) {
            this.afDebugLog = j;
            if (Arrays.equals(fArr4, fArr)) {
                this.AFInAppEventParameterName[1] = currentTimeMillis;
                return;
            }
            double AFKeystoreWrapper = AFKeystoreWrapper(fArr3, fArr);
            if (AFKeystoreWrapper > this.afErrorLog) {
                this.values[1] = Arrays.copyOf(fArr, fArr.length);
                this.AFInAppEventParameterName[1] = currentTimeMillis;
                this.afErrorLog = AFKeystoreWrapper;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AFf1kSDK) {
            AFf1kSDK aFf1kSDK = (AFf1kSDK) obj;
            return AFKeystoreWrapper(aFf1kSDK.valueOf, aFf1kSDK.AFInAppEventType, aFf1kSDK.AFKeystoreWrapper);
        }
        return false;
    }

    public final int hashCode() {
        return this.AFLogger;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AFInAppEventParameterName().execute(new b(1, this, sensorEvent));
        } else {
            AFKeystoreWrapper(sensorEvent);
        }
    }

    public final void valueOf(@NonNull Map<AFf1kSDK, Map<String, Object>> map, boolean z) {
        if (AFKeystoreWrapper()) {
            map.put(this, values());
            if (z) {
                int length = this.values.length;
                for (int i = 0; i < length; i++) {
                    this.values[i] = null;
                }
                int length2 = this.AFInAppEventParameterName.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.AFInAppEventParameterName[i2] = 0;
                }
                this.afErrorLog = 0.0d;
                this.afDebugLog = 0L;
            }
        } else if (!map.containsKey(this)) {
            map.put(this, values());
        }
    }

    private boolean AFKeystoreWrapper(int i, @NonNull String str, @NonNull String str2) {
        return this.valueOf == i && this.AFInAppEventType.equals(str) && this.AFKeystoreWrapper.equals(str2);
    }

    private boolean AFKeystoreWrapper() {
        return this.values[0] != null;
    }

    @NonNull
    private Map<String, Object> values() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.valueOf));
        concurrentHashMap.put("sN", this.AFInAppEventType);
        concurrentHashMap.put("sV", this.AFKeystoreWrapper);
        float[] fArr = this.values[0];
        if (fArr != null) {
            concurrentHashMap.put("sVS", AFInAppEventType(fArr));
        }
        float[] fArr2 = this.values[1];
        if (fArr2 != null) {
            concurrentHashMap.put("sVE", AFInAppEventType(fArr2));
        }
        return concurrentHashMap;
    }
}
