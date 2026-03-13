package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
/* renamed from: Hd0  reason: default package */
/* loaded from: classes.dex */
public abstract class Hd0 extends Nd0 {
    public static boolean h = false;
    public static Method i;
    public static Class j;
    public static Field k;
    public static Field l;
    public final WindowInsets c;
    public SD[] d;
    public SD e;
    public Pd0 f;
    public SD g;

    public Hd0(@NonNull Pd0 pd0, @NonNull WindowInsets windowInsets) {
        super(pd0);
        this.e = null;
        this.c = windowInsets;
    }

    @NonNull
    @SuppressLint({"WrongConstant"})
    private SD r(int i2, boolean z) {
        SD sd = SD.e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                SD s = s(i3, z);
                sd = SD.a(Math.max(sd.a, s.a), Math.max(sd.b, s.b), Math.max(sd.c, s.c), Math.max(sd.d, s.d));
            }
        }
        return sd;
    }

    private SD t() {
        Pd0 pd0 = this.f;
        if (pd0 != null) {
            return pd0.a.h();
        }
        return SD.e;
    }

    private SD u(@NonNull View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!h) {
                v();
            }
            Method method = i;
            if (method != null && j != null && k != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) k.get(l.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return SD.a(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            j = cls;
            k = cls.getDeclaredField("mVisibleInsets");
            l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            k.setAccessible(true);
            l.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        h = true;
    }

    @Override // defpackage.Nd0
    public void d(@NonNull View view) {
        SD u = u(view);
        if (u == null) {
            u = SD.e;
        }
        w(u);
    }

    @Override // defpackage.Nd0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.g, ((Hd0) obj).g);
    }

    @Override // defpackage.Nd0
    @NonNull
    public SD f(int i2) {
        return r(i2, false);
    }

    @Override // defpackage.Nd0
    @NonNull
    public final SD j() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = SD.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.Nd0
    @NonNull
    public Pd0 l(int i2, int i3, int i4, int i5) {
        Gd0 dd0;
        Pd0 g = Pd0.g(this.c, null);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            dd0 = new Fd0(g);
        } else if (i6 >= 29) {
            dd0 = new Ed0(g);
        } else {
            dd0 = new Dd0(g);
        }
        dd0.d(Pd0.e(j(), i2, i3, i4, i5));
        dd0.c(Pd0.e(h(), i2, i3, i4, i5));
        return dd0.b();
    }

    @Override // defpackage.Nd0
    public boolean n() {
        return this.c.isRound();
    }

    @Override // defpackage.Nd0
    public void o(SD[] sdArr) {
        this.d = sdArr;
    }

    @Override // defpackage.Nd0
    public void p(Pd0 pd0) {
        this.f = pd0;
    }

    @NonNull
    public SD s(int i2, boolean z) {
        int i3;
        C0383Jp e;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (i2 != 1) {
            SD sd = null;
            if (i2 != 2) {
                SD sd2 = SD.e;
                if (i2 != 8) {
                    if (i2 != 16) {
                        if (i2 != 32) {
                            if (i2 != 64) {
                                if (i2 != 128) {
                                    return sd2;
                                }
                                Pd0 pd0 = this.f;
                                if (pd0 != null) {
                                    e = pd0.a.e();
                                } else {
                                    e = e();
                                }
                                if (e != null) {
                                    int i8 = Build.VERSION.SDK_INT;
                                    if (i8 >= 28) {
                                        i4 = AbstractC0357Ip.d(e.a);
                                    } else {
                                        i4 = 0;
                                    }
                                    if (i8 >= 28) {
                                        i5 = AbstractC0357Ip.f(e.a);
                                    } else {
                                        i5 = 0;
                                    }
                                    if (i8 >= 28) {
                                        i6 = AbstractC0357Ip.e(e.a);
                                    } else {
                                        i6 = 0;
                                    }
                                    if (i8 >= 28) {
                                        i7 = AbstractC0357Ip.c(e.a);
                                    }
                                    return SD.a(i4, i5, i6, i7);
                                }
                                return sd2;
                            }
                            return k();
                        }
                        return g();
                    }
                    return i();
                }
                SD[] sdArr = this.d;
                if (sdArr != null) {
                    sd = sdArr[3];
                }
                if (sd != null) {
                    return sd;
                }
                SD j2 = j();
                SD t = t();
                int i9 = j2.d;
                if (i9 > t.d) {
                    return SD.a(0, 0, 0, i9);
                }
                SD sd3 = this.g;
                if (sd3 != null && !sd3.equals(sd2) && (i3 = this.g.d) > t.d) {
                    return SD.a(0, 0, 0, i3);
                }
                return sd2;
            } else if (z) {
                SD t2 = t();
                SD h2 = h();
                return SD.a(Math.max(t2.a, h2.a), 0, Math.max(t2.c, h2.c), Math.max(t2.d, h2.d));
            } else {
                SD j3 = j();
                Pd0 pd02 = this.f;
                if (pd02 != null) {
                    sd = pd02.a.h();
                }
                int i10 = j3.d;
                if (sd != null) {
                    i10 = Math.min(i10, sd.d);
                }
                return SD.a(j3.a, 0, j3.c, i10);
            }
        } else if (z) {
            return SD.a(0, Math.max(t().b, j().b), 0, 0);
        } else {
            return SD.a(0, j().b, 0, 0);
        }
    }

    public void w(@NonNull SD sd) {
        this.g = sd;
    }
}
