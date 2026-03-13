package defpackage;

import android.graphics.Insets;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
/* renamed from: Kd0  reason: default package */
/* loaded from: classes.dex */
public class Kd0 extends Jd0 {
    public SD n;
    public SD o;
    public SD p;

    public Kd0(@NonNull Pd0 pd0, @NonNull WindowInsets windowInsets) {
        super(pd0, windowInsets);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override // defpackage.Nd0
    @NonNull
    public SD g() {
        Insets mandatorySystemGestureInsets;
        if (this.o == null) {
            mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
            this.o = SD.b(mandatorySystemGestureInsets);
        }
        return this.o;
    }

    @Override // defpackage.Nd0
    @NonNull
    public SD i() {
        Insets systemGestureInsets;
        if (this.n == null) {
            systemGestureInsets = this.c.getSystemGestureInsets();
            this.n = SD.b(systemGestureInsets);
        }
        return this.n;
    }

    @Override // defpackage.Nd0
    @NonNull
    public SD k() {
        Insets tappableElementInsets;
        if (this.p == null) {
            tappableElementInsets = this.c.getTappableElementInsets();
            this.p = SD.b(tappableElementInsets);
        }
        return this.p;
    }

    @Override // defpackage.Hd0, defpackage.Nd0
    @NonNull
    public Pd0 l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.c.inset(i, i2, i3, i4);
        return Pd0.g(inset, null);
    }

    @Override // defpackage.Id0, defpackage.Nd0
    public void q(SD sd) {
    }
}
