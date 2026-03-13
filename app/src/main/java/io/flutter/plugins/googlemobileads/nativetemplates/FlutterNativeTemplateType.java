package io.flutter.plugins.googlemobileads.nativetemplates;

import io.flutter.plugins.googlemobileads.R;
/* loaded from: classes2.dex */
public enum FlutterNativeTemplateType {
    SMALL(R.layout.small_template_view_layout),
    MEDIUM(R.layout.medium_template_view_layout);
    
    private final int resourceId;

    FlutterNativeTemplateType(int i) {
        this.resourceId = i;
    }

    public static FlutterNativeTemplateType fromIntValue(int i) {
        if (i >= 0 && i < values().length) {
            return values()[i];
        }
        AbstractC2437ph.o(i, "Invalid template type index: ", "NativeTemplateType");
        return MEDIUM;
    }

    public int resourceId() {
        return this.resourceId;
    }
}
