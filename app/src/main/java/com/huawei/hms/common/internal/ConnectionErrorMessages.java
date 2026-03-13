package com.huawei.hms.common.internal;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.adapter.AvailableUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.Util;
/* loaded from: classes2.dex */
public class ConnectionErrorMessages {
    private static boolean a(Context context) {
        if (context != null && Util.isAvailableLibExist(context) && AvailableUtil.isInstallerLibExist(context)) {
            return true;
        }
        return false;
    }

    public static String getErrorDialogButtonMessage(Activity activity, int i) {
        if (activity == null) {
            return null;
        }
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        if (i != 1) {
            if (i != 2) {
                return ResourceLoaderUtil.getString("hms_confirm");
            }
            if (a(activity)) {
                return ResourceLoaderUtil.getString("hms_update");
            }
            return ResourceLoaderUtil.getString("hms_confirm");
        } else if (a(activity)) {
            return ResourceLoaderUtil.getString("hms_install");
        } else {
            return ResourceLoaderUtil.getString("hms_confirm");
        }
    }

    public static String getErrorMessage(Activity activity, int i) {
        if (activity == null) {
            return null;
        }
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        if (i != 1 && i != 2) {
            return null;
        }
        if (a(activity)) {
            return ResourceLoaderUtil.getString("hms_update_title");
        }
        return activity.getString(ResourceLoaderUtil.getStringId("hms_apk_not_installed_hints"), Util.getAppName(activity, activity.getPackageName()));
    }

    public static String getErrorTitle(Activity activity, int i) {
        if (activity == null) {
            return null;
        }
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 9) {
                        HMSLog.e("HuaweiApiAvailability", "Unexpected error code " + i);
                        return null;
                    }
                    HMSLog.e("HuaweiApiAvailability", "Huawei Mobile Services is invalid. Cannot recover.");
                    return null;
                }
                return ResourceLoaderUtil.getString("hms_bindfaildlg_message");
            } else if (!a(activity)) {
                return null;
            } else {
                return ResourceLoaderUtil.getString("hms_update_message");
            }
        } else if (!a(activity)) {
            return null;
        } else {
            return ResourceLoaderUtil.getString("hms_install_message");
        }
    }
}
