package defpackage;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
/* renamed from: XL  reason: default package */
/* loaded from: classes.dex */
public final class XL extends AbstractC2318oH implements PL {
    public static final Method C;
    public VA B;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                C = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.PL
    public final void b(IL il, QL ql) {
        VA va = this.B;
        if (va != null) {
            va.b(il, ql);
        }
    }

    @Override // defpackage.PL
    public final void f(IL il, QL ql) {
        VA va = this.B;
        if (va != null) {
            va.f(il, ql);
        }
    }
}
