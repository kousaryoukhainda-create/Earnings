package com.applovin.impl;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class ip {
    public static void a(Spannable spannable, int i, int i2, jp jpVar, gp gpVar, Map map, int i3) {
        gp b;
        jp a;
        int i4;
        if (jpVar.k() != -1) {
            spannable.setSpan(new StyleSpan(jpVar.k()), i, i2, 33);
        }
        if (jpVar.q()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (jpVar.r()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (jpVar.p()) {
            pk.a(spannable, new ForegroundColorSpan(jpVar.b()), i, i2, 33);
        }
        if (jpVar.o()) {
            pk.a(spannable, new BackgroundColorSpan(jpVar.a()), i, i2, 33);
        }
        if (jpVar.c() != null) {
            pk.a(spannable, new TypefaceSpan(jpVar.c()), i, i2, 33);
        }
        if (jpVar.n() != null) {
            xn xnVar = (xn) b1.a(jpVar.n());
            int i5 = xnVar.a;
            if (i5 == -1) {
                i5 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i4 = 1;
            } else {
                i4 = xnVar.b;
            }
            int i6 = xnVar.c;
            if (i6 == -2) {
                i6 = 1;
            }
            pk.a(spannable, new yn(i5, i4, i6), i, i2, 33);
        }
        int i7 = jpVar.i();
        if (i7 == 2) {
            gp a2 = a(gpVar, map);
            if (a2 != null && (b = b(a2, map)) != null) {
                if (b.a() == 1 && b.a(0).b != null) {
                    String str = (String) xp.a((Object) b.a(0).b);
                    jp a3 = a(b.f, b.c(), map);
                    int h = a3 != null ? a3.h() : -1;
                    if (h == -1 && (a = a(a2.f, a2.c(), map)) != null) {
                        h = a.h();
                    }
                    spannable.setSpan(new zi(str, h), i, i2, 33);
                } else {
                    oc.c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                }
            }
        } else if (i7 == 3 || i7 == 4) {
            spannable.setSpan(new n6(), i, i2, 33);
        }
        if (jpVar.m()) {
            pk.a(spannable, new oa(), i, i2, 33);
        }
        int e = jpVar.e();
        if (e == 1) {
            pk.a(spannable, new AbsoluteSizeSpan((int) jpVar.d(), true), i, i2, 33);
        } else if (e == 2) {
            pk.a(spannable, new RelativeSizeSpan(jpVar.d()), i, i2, 33);
        } else if (e != 3) {
        } else {
            pk.a(spannable, new RelativeSizeSpan(jpVar.d() / 100.0f), i, i2, 33);
        }
    }

    private static gp b(gp gpVar, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gpVar);
        while (!arrayDeque.isEmpty()) {
            gp gpVar2 = (gp) arrayDeque.pop();
            jp a = a(gpVar2.f, gpVar2.c(), map);
            if (a != null && a.i() == 3) {
                return gpVar2;
            }
            for (int a2 = gpVar2.a() - 1; a2 >= 0; a2--) {
                arrayDeque.push(gpVar2.a(a2));
            }
        }
        return null;
    }

    public static String a(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    public static void a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    private static gp a(gp gpVar, Map map) {
        while (gpVar != null) {
            jp a = a(gpVar.f, gpVar.c(), map);
            if (a != null && a.i() == 1) {
                return gpVar;
            }
            gpVar = gpVar.j;
        }
        return null;
    }

    public static jp a(jp jpVar, String[] strArr, Map map) {
        int i = 0;
        if (jpVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (jp) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                jp jpVar2 = new jp();
                int length = strArr.length;
                while (i < length) {
                    jpVar2.a((jp) map.get(strArr[i]));
                    i++;
                }
                return jpVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            return jpVar.a((jp) map.get(strArr[0]));
        } else {
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    jpVar.a((jp) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return jpVar;
    }
}
