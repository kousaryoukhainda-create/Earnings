package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.util.Objects;
/* renamed from: Jd0  reason: default package */
/* loaded from: classes.dex */
public class Jd0 extends Id0 {
    public Jd0(@NonNull Pd0 pd0, @NonNull WindowInsets windowInsets) {
        super(pd0, windowInsets);
    }

    @Override // defpackage.Nd0
    @NonNull
    public Pd0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.c.consumeDisplayCutout();
        return Pd0.g(consumeDisplayCutout, null);
    }

    @Override // defpackage.Nd0
    public C0383Jp e() {
        DisplayCutout displayCutout;
        displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0383Jp(displayCutout);
    }

    @Override // defpackage.Hd0, defpackage.Nd0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Jd0)) {
            return false;
        }
        Jd0 jd0 = (Jd0) obj;
        if (Objects.equals(this.c, jd0.c) && Objects.equals(this.g, jd0.g)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.Nd0
    public int hashCode() {
        return this.c.hashCode();
    }
}
