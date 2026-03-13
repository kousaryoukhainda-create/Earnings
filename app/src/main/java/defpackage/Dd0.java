package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
/* renamed from: Dd0  reason: default package */
/* loaded from: classes.dex */
public final class Dd0 extends Gd0 {
    public static Field c = null;
    public static boolean d = false;
    public static Constructor e = null;
    public static boolean f = false;
    public WindowInsets a;
    public SD b;

    public Dd0() {
        this.a = e();
    }

    private static WindowInsets e() {
        if (!d) {
            try {
                c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            d = true;
        }
        Field field = c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f) {
            try {
                e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f = true;
        }
        Constructor constructor = e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // defpackage.Gd0
    @NonNull
    public Pd0 b() {
        a();
        Pd0 g = Pd0.g(this.a, null);
        Nd0 nd0 = g.a;
        nd0.o(null);
        nd0.q(this.b);
        return g;
    }

    @Override // defpackage.Gd0
    public void c(SD sd) {
        this.b = sd;
    }

    @Override // defpackage.Gd0
    public void d(@NonNull SD sd) {
        WindowInsets windowInsets = this.a;
        if (windowInsets != null) {
            this.a = windowInsets.replaceSystemWindowInsets(sd.a, sd.b, sd.c, sd.d);
        }
    }

    public Dd0(@NonNull Pd0 pd0) {
        super(pd0);
        this.a = pd0.f();
    }
}
