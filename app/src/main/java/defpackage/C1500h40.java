package defpackage;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
/* renamed from: h40  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1500h40 {
    public static final int l;
    public static boolean m;
    public static Constructor n;
    public static TextDirectionHeuristic o;
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int d;
    public boolean j;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;
    public float g = 1.0f;
    public int h = l;
    public boolean i = true;
    public TextUtils.TruncateAt k = null;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 1;
        } else {
            i = 0;
        }
        l = i;
    }

    public C1500h40(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        boolean z;
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout.Builder obtain;
        TextDirectionHeuristic textDirectionHeuristic2;
        StaticLayout build;
        if (this.a == null) {
            this.a = "";
        }
        int max = Math.max(0, this.c);
        CharSequence charSequence = this.a;
        int i = this.f;
        TextPaint textPaint = this.b;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.k);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            if (this.j && this.f == 1) {
                this.e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
            obtain.setAlignment(this.e);
            obtain.setIncludePad(this.i);
            if (this.j) {
                textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic2 = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic2);
            TextUtils.TruncateAt truncateAt = this.k;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f);
            float f = this.g;
            if (f != 1.0f) {
                obtain.setLineSpacing(0.0f, f);
            }
            if (this.f > 1) {
                obtain.setHyphenationFrequency(this.h);
            }
            build = obtain.build();
            return build;
        }
        if (!m) {
            try {
                if (this.j && i2 >= 23) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
                o = textDirectionHeuristic;
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                n = declaredConstructor;
                declaredConstructor.setAccessible(true);
                m = true;
            } catch (Exception e) {
                throw new C1414g40(e);
            }
        }
        try {
            Constructor constructor = n;
            constructor.getClass();
            Integer valueOf = Integer.valueOf(this.d);
            Integer valueOf2 = Integer.valueOf(max);
            Layout.Alignment alignment = this.e;
            TextDirectionHeuristic textDirectionHeuristic3 = o;
            textDirectionHeuristic3.getClass();
            return (StaticLayout) constructor.newInstance(charSequence, 0, valueOf, textPaint, valueOf2, alignment, textDirectionHeuristic3, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.i), null, Integer.valueOf(max), Integer.valueOf(this.f));
        } catch (Exception e2) {
            throw new C1414g40(e2);
        }
    }
}
