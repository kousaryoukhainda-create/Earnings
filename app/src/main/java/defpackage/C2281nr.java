package defpackage;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;
/* renamed from: nr  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2281nr extends AbstractC0721Wq {
    public final /* synthetic */ int a = 0;
    public final WeakReference b;

    public C2281nr(EditText editText) {
        this.b = new WeakReference(editText);
    }

    @Override // defpackage.AbstractC0721Wq
    public void a() {
        switch (this.a) {
            case 1:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.AbstractC0721Wq
    public final void b() {
        switch (this.a) {
            case 0:
                C2367or.a((EditText) this.b.get(), 1);
                return;
            default:
                SwitchCompat switchCompat = (SwitchCompat) this.b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                    return;
                }
                return;
        }
    }

    public C2281nr(SwitchCompat switchCompat) {
        this.b = new WeakReference(switchCompat);
    }
}
