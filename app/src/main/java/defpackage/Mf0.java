package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.adview.b;
import com.applovin.impl.v9;
/* renamed from: Mf0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Mf0 implements View.OnTouchListener {
    public final /* synthetic */ int b;

    public /* synthetic */ Mf0(int i) {
        this.b = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                return b.c(view, motionEvent);
            default:
                return v9.d(view, motionEvent);
        }
    }
}
