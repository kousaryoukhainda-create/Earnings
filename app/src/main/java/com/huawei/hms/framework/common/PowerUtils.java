package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.PowerManager;
/* loaded from: classes2.dex */
public class PowerUtils {
    private static final String TAG = "PowerUtils";

    /* loaded from: classes2.dex */
    public static final class PowerMode {
        static final int POWER_MODE_DEFAULT_RETURN_VALUE = 0;
        static final int POWER_SAVER_MODE = 4;
        static final String SMART_MODE_STATUS = "SmartModeStatus";
    }

    public static boolean isAppIdleMode(Context context) {
        UsageStatsManager usageStatsManager;
        boolean isAppInactive;
        if (context != null) {
            String packageName = context.getPackageName();
            int i = Build.VERSION.SDK_INT;
            if (i >= 22) {
                Object systemService = context.getSystemService("usagestats");
                if (!(systemService instanceof UsageStatsManager)) {
                    return false;
                }
                usageStatsManager = (UsageStatsManager) systemService;
            } else {
                usageStatsManager = null;
            }
            if (usageStatsManager != null) {
                if (i >= 23) {
                    isAppInactive = usageStatsManager.isAppInactive(packageName);
                    return isAppInactive;
                }
                return false;
            }
            Logger.i(TAG, "isAppIdleMode statsManager is null!");
            return false;
        }
        Logger.i(TAG, "isAppIdleMode Context is null!");
        return false;
    }

    public static boolean isDozeIdleMode(Context context) {
        PowerManager powerManager;
        boolean isDeviceIdleMode;
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            if (systemService instanceof PowerManager) {
                powerManager = (PowerManager) systemService;
            } else {
                powerManager = null;
            }
            if (powerManager != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    try {
                        isDeviceIdleMode = powerManager.isDeviceIdleMode();
                        return isDeviceIdleMode;
                    } catch (RuntimeException e) {
                        Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
                        return false;
                    }
                }
                Logger.i(TAG, "isDozeIdleMode is version control state!");
                return false;
            }
            Logger.i(TAG, "isDozeIdleMode powerManager is null!");
            return false;
        }
        Logger.i(TAG, "isDozeIdleMode Context is null!");
        return false;
    }

    public static boolean isInteractive(Context context) {
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            if (systemService instanceof PowerManager) {
                try {
                    return ((PowerManager) systemService).isInteractive();
                } catch (RuntimeException e) {
                    Logger.i(TAG, "getActiveNetworkInfo failed, exception:" + e.getClass().getSimpleName() + e.getMessage());
                }
            }
        }
        return false;
    }

    public static boolean isWhilteList(Context context) {
        PowerManager powerManager;
        boolean isIgnoringBatteryOptimizations;
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "power");
            if (systemService instanceof PowerManager) {
                powerManager = (PowerManager) systemService;
            } else {
                powerManager = null;
            }
            String packageName = context.getPackageName();
            if (powerManager != null && Build.VERSION.SDK_INT >= 23) {
                try {
                    isIgnoringBatteryOptimizations = powerManager.isIgnoringBatteryOptimizations(packageName);
                    return isIgnoringBatteryOptimizations;
                } catch (RuntimeException e) {
                    Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
                }
            }
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public static int readDataSaverMode(Context context) {
        ConnectivityManager connectivityManager;
        int restrictBackgroundStatus;
        if (context != null) {
            Object systemService = context.getSystemService("connectivity");
            if (systemService instanceof ConnectivityManager) {
                connectivityManager = (ConnectivityManager) systemService;
            } else {
                connectivityManager = null;
            }
            if (connectivityManager != null) {
                int i = Build.VERSION.SDK_INT;
                if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    return 0;
                }
                if (connectivityManager.isActiveNetworkMetered()) {
                    if (i >= 24) {
                        restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
                        return restrictBackgroundStatus;
                    }
                    return 0;
                }
                Logger.v(TAG, "ConnectType is not Mobile Network!");
                return 0;
            }
            Logger.i(TAG, "readDataSaverMode Context is null!");
            return 0;
        }
        Logger.i(TAG, "readDataSaverMode manager is null!");
        return 0;
    }

    public static int readPowerSaverMode(Context context) {
        PowerManager powerManager;
        if (context != null) {
            int systemInt = SettingUtil.getSystemInt(context.getContentResolver(), "SmartModeStatus", 0);
            if (systemInt == 0) {
                Object systemService = ContextCompat.getSystemService(context, "power");
                if (systemService instanceof PowerManager) {
                    powerManager = (PowerManager) systemService;
                } else {
                    powerManager = null;
                }
                if (powerManager != null) {
                    try {
                        if (!powerManager.isPowerSaveMode()) {
                            return 0;
                        }
                        return 4;
                    } catch (RuntimeException e) {
                        Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
                    }
                }
            }
            return systemInt;
        }
        Logger.i(TAG, "readPowerSaverMode Context is null!");
        return 0;
    }
}
