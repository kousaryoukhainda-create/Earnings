package com.appsflyer.internal;

import com.appsflyer.AFLogger;
@Deprecated
/* loaded from: classes.dex */
public final class AFb1xSDK implements AFa1wSDK {
    private final AFa1wSDK AFInAppEventType = this;

    /* loaded from: classes.dex */
    public interface AFa1wSDK {
        Class<?> AFInAppEventParameterName(String str) throws ClassNotFoundException;
    }

    /* loaded from: classes.dex */
    public enum AFa1zSDK {
        ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
        ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
        DEFAULT("android_native", "android_native"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
        M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
        NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
        EXPO("android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity"),
        REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
        UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
        UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
        XAMARIN("android_xamarin", "mono.android.Runtime"),
        CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");
        
        private final String afErrorLogForExcManagerOnly;
        private final String init;

        AFa1zSDK(String str, String str2) {
            this.afErrorLogForExcManagerOnly = str;
            this.init = str2;
        }
    }

    private boolean values(String str) {
        try {
            this.AFInAppEventType.AFInAppEventParameterName(str);
            StringBuilder sb = new StringBuilder("Class: ");
            sb.append(str);
            sb.append(" is found.");
            AFLogger.afRDLog(sb.toString());
            return true;
        } catch (ClassNotFoundException e) {
            StringBuilder sb2 = new StringBuilder("Class: ");
            sb2.append(str);
            sb2.append(" is  not found. (Platform extension)");
            AFLogger.afErrorLogForExcManagerOnly(sb2.toString(), e, true);
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }

    public final String AFInAppEventParameterName() {
        AFa1zSDK[] values;
        for (AFa1zSDK aFa1zSDK : AFa1zSDK.values()) {
            if (values(aFa1zSDK.init)) {
                return aFa1zSDK.afErrorLogForExcManagerOnly;
            }
        }
        return AFa1zSDK.DEFAULT.afErrorLogForExcManagerOnly;
    }

    @Override // com.appsflyer.internal.AFb1xSDK.AFa1wSDK
    public final Class<?> AFInAppEventParameterName(String str) throws ClassNotFoundException {
        return Class.forName(str);
    }
}
