package defpackage;

import android.view.View;
/* renamed from: nc0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C2256nc0 extends C2170mc0 {
    public static boolean w = true;

    @Override // defpackage.AbstractC1424g90
    public void f0(View view, int i, int i2, int i3, int i4) {
        if (w) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                w = false;
            }
        }
    }
}
