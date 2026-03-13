package com.applovin.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.impl.a5;
import com.applovin.impl.b1;
import com.applovin.impl.zb;
/* loaded from: classes.dex */
abstract class h {
    public static float a(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else if (i != 1) {
            if (i != 2) {
                return -3.4028235E38f;
            }
            return f;
        } else {
            f2 = i2;
        }
        return f * f2;
    }

    public static void b(a5.b bVar) {
        bVar.b(-3.4028235E38f, Integer.MIN_VALUE);
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.a(SpannableString.valueOf(bVar.e()));
            }
            a((Spannable) b1.a(bVar.e()), new l(1));
        }
    }

    public static void a(a5.b bVar) {
        bVar.b();
        if (bVar.e() instanceof Spanned) {
            if (!(bVar.e() instanceof Spannable)) {
                bVar.a(SpannableString.valueOf(bVar.e()));
            }
            a((Spannable) b1.a(bVar.e()), new l(0));
        }
        b(bVar);
    }

    public static /* synthetic */ boolean b(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static /* synthetic */ boolean a(Object obj) {
        return !(obj instanceof zb);
    }

    private static void a(Spannable spannable, Predicate predicate) {
        Object[] spans;
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (predicate.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }
}
