package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* renamed from: D0  reason: default package */
/* loaded from: classes.dex */
public final class D0 extends ClickableSpan {
    public final int a;
    public final S0 b;
    public final int c;

    public D0(int i, S0 s0, int i2) {
        this.a = i;
        this.b = s0;
        this.c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.b.a.performAction(this.c, bundle);
    }
}
