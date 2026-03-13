package defpackage;

import android.view.View;
import android.view.Window;
/* renamed from: Sd0  reason: default package */
/* loaded from: classes.dex */
public final class Sd0 extends Rd0 {
    @Override // defpackage.AbstractC2870uj
    public final void U(boolean z) {
        Window window = this.z;
        if (z) {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
    }
}
