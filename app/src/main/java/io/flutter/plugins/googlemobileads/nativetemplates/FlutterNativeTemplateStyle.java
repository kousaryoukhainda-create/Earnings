package io.flutter.plugins.googlemobileads.nativetemplates;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.ads.nativetemplates.TemplateView;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class FlutterNativeTemplateStyle {
    final FlutterNativeTemplateTextStyle callToActionStyle;
    final ColorDrawable mainBackgroundColor;
    final FlutterNativeTemplateTextStyle primaryTextStyle;
    final FlutterNativeTemplateTextStyle secondaryTextStyle;
    @NonNull
    final FlutterNativeTemplateType templateType;
    final FlutterNativeTemplateTextStyle tertiaryTextStyle;

    public FlutterNativeTemplateStyle(@NonNull FlutterNativeTemplateType flutterNativeTemplateType, ColorDrawable colorDrawable, FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle, FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle2, FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle3, FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle4) {
        this.templateType = flutterNativeTemplateType;
        this.mainBackgroundColor = colorDrawable;
        this.callToActionStyle = flutterNativeTemplateTextStyle;
        this.primaryTextStyle = flutterNativeTemplateTextStyle2;
        this.secondaryTextStyle = flutterNativeTemplateTextStyle3;
        this.tertiaryTextStyle = flutterNativeTemplateTextStyle4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [JN, java.lang.Object] */
    public JN asNativeTemplateStyle() {
        ?? obj = new Object();
        ColorDrawable colorDrawable = this.mainBackgroundColor;
        if (colorDrawable != null) {
            obj.q = colorDrawable;
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle = this.callToActionStyle;
        if (flutterNativeTemplateTextStyle != null) {
            if (flutterNativeTemplateTextStyle.getBackgroundColor() != null) {
                obj.d = this.callToActionStyle.getBackgroundColor();
            }
            if (this.callToActionStyle.getTextColor() != null) {
                obj.c = Integer.valueOf(this.callToActionStyle.getTextColor().getColor());
            }
            if (this.callToActionStyle.getFontStyle() != null) {
                obj.a = this.callToActionStyle.getFontStyle().getTypeface();
            }
            if (this.callToActionStyle.getSize() != null) {
                obj.b = this.callToActionStyle.getSize().floatValue();
            }
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle2 = this.primaryTextStyle;
        if (flutterNativeTemplateTextStyle2 != null) {
            if (flutterNativeTemplateTextStyle2.getBackgroundColor() != null) {
                obj.h = this.primaryTextStyle.getBackgroundColor();
            }
            if (this.primaryTextStyle.getTextColor() != null) {
                obj.g = Integer.valueOf(this.primaryTextStyle.getTextColor().getColor());
            }
            if (this.primaryTextStyle.getFontStyle() != null) {
                obj.e = this.primaryTextStyle.getFontStyle().getTypeface();
            }
            if (this.primaryTextStyle.getSize() != null) {
                obj.f = this.primaryTextStyle.getSize().floatValue();
            }
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle3 = this.secondaryTextStyle;
        if (flutterNativeTemplateTextStyle3 != null) {
            if (flutterNativeTemplateTextStyle3.getBackgroundColor() != null) {
                obj.l = this.secondaryTextStyle.getBackgroundColor();
            }
            if (this.secondaryTextStyle.getTextColor() != null) {
                obj.k = Integer.valueOf(this.secondaryTextStyle.getTextColor().getColor());
            }
            if (this.secondaryTextStyle.getFontStyle() != null) {
                obj.i = this.secondaryTextStyle.getFontStyle().getTypeface();
            }
            if (this.secondaryTextStyle.getSize() != null) {
                obj.j = this.secondaryTextStyle.getSize().floatValue();
            }
        }
        FlutterNativeTemplateTextStyle flutterNativeTemplateTextStyle4 = this.tertiaryTextStyle;
        if (flutterNativeTemplateTextStyle4 != null) {
            if (flutterNativeTemplateTextStyle4.getBackgroundColor() != null) {
                obj.p = this.tertiaryTextStyle.getBackgroundColor();
            }
            if (this.tertiaryTextStyle.getTextColor() != null) {
                obj.o = Integer.valueOf(this.tertiaryTextStyle.getTextColor().getColor());
            }
            if (this.tertiaryTextStyle.getFontStyle() != null) {
                obj.m = this.tertiaryTextStyle.getFontStyle().getTypeface();
            }
            if (this.tertiaryTextStyle.getSize() != null) {
                obj.n = this.tertiaryTextStyle.getSize().floatValue();
            }
        }
        return obj;
    }

    public TemplateView asTemplateView(Context context) {
        TemplateView templateView = (TemplateView) ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.templateType.resourceId(), (ViewGroup) null);
        templateView.setStyles(asNativeTemplateStyle());
        return templateView;
    }

    public boolean equals(Object obj) {
        ColorDrawable colorDrawable;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlutterNativeTemplateStyle)) {
            return false;
        }
        FlutterNativeTemplateStyle flutterNativeTemplateStyle = (FlutterNativeTemplateStyle) obj;
        if (this.templateType == flutterNativeTemplateStyle.templateType && ((((colorDrawable = this.mainBackgroundColor) == null && flutterNativeTemplateStyle.mainBackgroundColor == null) || colorDrawable.getColor() == flutterNativeTemplateStyle.mainBackgroundColor.getColor()) && Objects.equals(this.callToActionStyle, flutterNativeTemplateStyle.callToActionStyle) && Objects.equals(this.primaryTextStyle, flutterNativeTemplateStyle.primaryTextStyle) && Objects.equals(this.secondaryTextStyle, flutterNativeTemplateStyle.secondaryTextStyle) && Objects.equals(this.tertiaryTextStyle, flutterNativeTemplateStyle.tertiaryTextStyle))) {
            return true;
        }
        return false;
    }

    public FlutterNativeTemplateTextStyle getCallToActionStyle() {
        return this.callToActionStyle;
    }

    public ColorDrawable getMainBackgroundColor() {
        return this.mainBackgroundColor;
    }

    public FlutterNativeTemplateTextStyle getPrimaryTextStyle() {
        return this.primaryTextStyle;
    }

    public FlutterNativeTemplateTextStyle getSecondaryTextStyle() {
        return this.secondaryTextStyle;
    }

    @NonNull
    public FlutterNativeTemplateType getTemplateType() {
        return this.templateType;
    }

    public FlutterNativeTemplateTextStyle getTertiaryTextStyle() {
        return this.tertiaryTextStyle;
    }

    public int hashCode() {
        Integer valueOf;
        ColorDrawable colorDrawable = this.mainBackgroundColor;
        if (colorDrawable == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(colorDrawable.getColor());
        }
        return Objects.hash(valueOf, this.callToActionStyle, this.primaryTextStyle, this.secondaryTextStyle, this.tertiaryTextStyle);
    }
}
