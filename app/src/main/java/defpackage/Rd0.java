package defpackage;

import android.view.View;
import android.view.Window;
/* renamed from: Rd0  reason: default package */
/* loaded from: classes.dex */
public class Rd0 extends Qd0 {
    @Override // defpackage.AbstractC2870uj
    public final void V(boolean z) {
        Window window = this.z;
        if (z) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
    }
}
