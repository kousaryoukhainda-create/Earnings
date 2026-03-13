package defpackage;

import android.os.Build;
import android.view.View;
/* renamed from: oc0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C2342oc0 extends C2256nc0 {
    public static boolean x = true;

    @Override // defpackage.AbstractC1424g90
    public void g0(int i, View view) {
        if (Build.VERSION.SDK_INT == 28) {
            super.g0(i, view);
        } else if (x) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                x = false;
            }
        }
    }
}
