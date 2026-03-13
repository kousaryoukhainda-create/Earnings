package defpackage;

import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.Objects;
/* renamed from: Nd0  reason: default package */
/* loaded from: classes.dex */
public class Nd0 {
    public static final Pd0 b;
    public final Pd0 a;

    static {
        Gd0 dd0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            dd0 = new Fd0();
        } else if (i >= 29) {
            dd0 = new Ed0();
        } else {
            dd0 = new Dd0();
        }
        b = dd0.b().a.a().a.b().a.c();
    }

    public Nd0(@NonNull Pd0 pd0) {
        this.a = pd0;
    }

    @NonNull
    public Pd0 a() {
        return this.a;
    }

    @NonNull
    public Pd0 b() {
        return this.a;
    }

    @NonNull
    public Pd0 c() {
        return this.a;
    }

    public C0383Jp e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nd0)) {
            return false;
        }
        Nd0 nd0 = (Nd0) obj;
        if (n() == nd0.n() && m() == nd0.m() && Objects.equals(j(), nd0.j()) && Objects.equals(h(), nd0.h()) && Objects.equals(e(), nd0.e())) {
            return true;
        }
        return false;
    }

    @NonNull
    public SD f(int i) {
        return SD.e;
    }

    @NonNull
    public SD g() {
        return j();
    }

    @NonNull
    public SD h() {
        return SD.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    @NonNull
    public SD i() {
        return j();
    }

    @NonNull
    public SD j() {
        return SD.e;
    }

    @NonNull
    public SD k() {
        return j();
    }

    @NonNull
    public Pd0 l(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void d(@NonNull View view) {
    }

    public void o(SD[] sdArr) {
    }

    public void p(Pd0 pd0) {
    }

    public void q(SD sd) {
    }
}
