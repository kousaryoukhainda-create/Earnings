package defpackage;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
/* renamed from: pd  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2429pd extends AbstractC1906jZ {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    public /* synthetic */ C2429pd(Object obj, int i) {
        this.j = i;
        this.k = obj;
    }

    @Override // defpackage.AbstractC1906jZ
    public final void G(int i) {
        switch (this.j) {
            case 0:
                return;
            default:
                Y50 y50 = (Y50) this.k;
                y50.d = true;
                X50 x50 = (X50) y50.e.get();
                if (x50 != null) {
                    C2772td c2772td = (C2772td) x50;
                    c2772td.u();
                    c2772td.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.AbstractC1906jZ
    public final void H(Typeface typeface, boolean z) {
        CharSequence text;
        switch (this.j) {
            case 0:
                Chip chip = (Chip) this.k;
                C2772td c2772td = chip.g;
                if (c2772td.E0) {
                    text = c2772td.G;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z) {
                    Y50 y50 = (Y50) this.k;
                    y50.d = true;
                    X50 x50 = (X50) y50.e.get();
                    if (x50 != null) {
                        C2772td c2772td2 = (C2772td) x50;
                        c2772td2.u();
                        c2772td2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void S(int i) {
    }
}
