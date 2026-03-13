package io.flutter.plugins.googlemobileads.nativetemplates;

import android.graphics.Typeface;
/* loaded from: classes2.dex */
public enum FlutterNativeTemplateFontStyle {
    NORMAL,
    BOLD,
    ITALIC,
    MONOSPACE;

    public static FlutterNativeTemplateFontStyle fromIntValue(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        AbstractC2437ph.o(i, "Invalid index for NativeTemplateFontStyle: ", "NativeTemplateFontStyle");
        return NORMAL;
    }

    public Typeface getTypeface() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return Typeface.DEFAULT;
                    }
                    return Typeface.MONOSPACE;
                }
                return Typeface.defaultFromStyle(2);
            }
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.DEFAULT;
    }
}
