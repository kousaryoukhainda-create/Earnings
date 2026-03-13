package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.telephony.emergency.EmergencyNumber;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ykapps.earnings.R;
/* renamed from: J0  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class J0 {
    public static /* bridge */ /* synthetic */ EmergencyNumber b(Object obj) {
        return (EmergencyNumber) obj;
    }

    public static /* bridge */ /* synthetic */ void m(CoordinatorLayout coordinatorLayout, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray) {
        coordinatorLayout.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, R.attr.coordinatorLayoutStyle, 0);
    }
}
