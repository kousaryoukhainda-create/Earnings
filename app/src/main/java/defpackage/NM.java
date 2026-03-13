package defpackage;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Parcelable;
import android.view.Display;
/* renamed from: NM  reason: default package */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class NM {
    public static /* bridge */ /* synthetic */ int b(Display.Mode mode) {
        return mode.getPhysicalWidth();
    }

    public static /* bridge */ /* synthetic */ Icon e(Parcelable parcelable) {
        return (Icon) parcelable;
    }

    public static /* bridge */ /* synthetic */ Display.Mode i(Display display) {
        return display.getMode();
    }

    public static /* bridge */ /* synthetic */ Object k(Context context, Class cls) {
        return context.getSystemService(cls);
    }

    public static /* bridge */ /* synthetic */ boolean y(Parcelable parcelable) {
        return parcelable instanceof Icon;
    }
}
