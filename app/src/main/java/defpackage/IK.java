package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
/* renamed from: IK  reason: default package */
/* loaded from: classes.dex */
public abstract class IK {
    public static boolean a(Context context) {
        Display display;
        boolean isHdr;
        Display.HdrCapabilities hdrCapabilities;
        int[] supportedHdrTypes;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            display = displayManager.getDisplay(0);
        } else {
            display = null;
        }
        if (display != null) {
            isHdr = display.isHdr();
            if (isHdr) {
                hdrCapabilities = display.getHdrCapabilities();
                supportedHdrTypes = hdrCapabilities.getSupportedHdrTypes();
                for (int i : supportedHdrTypes) {
                    if (i == 1) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
