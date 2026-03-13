package defpackage;

import android.app.ActivityManager;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.DisplayCutout;
/* renamed from: AQ  reason: default package */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AQ {
    public static /* synthetic */ ActivityManager.TaskDescription d(int i, String str) {
        return new ActivityManager.TaskDescription(str, 0, i);
    }

    public static /* synthetic */ PrecomputedText.Params.Builder j(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout n(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean y(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }

    public static /* bridge */ /* synthetic */ boolean z(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
