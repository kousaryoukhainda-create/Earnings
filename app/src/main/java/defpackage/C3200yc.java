package defpackage;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
/* renamed from: yc  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3200yc {
    public final ArrayList a;
    public final ArrayList b;
    public final StringBuilder c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public C3200yc(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.c = sb;
        this.g = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.d = 15;
        this.e = 0;
        this.f = 0;
        this.h = i2;
    }

    public final void a(char c) {
        StringBuilder sb = this.c;
        if (sb.length() < 32) {
            sb.append(c);
        }
    }

    public final void b() {
        StringBuilder sb = this.c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C3114xc c3114xc = (C3114xc) arrayList.get(size);
                int i = c3114xc.c;
                if (i == length) {
                    c3114xc.c = i - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final C2786tk c(int i) {
        int i2;
        float f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i3 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i3));
            spannableStringBuilder.append('\n');
            i3++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i4 = this.e + this.f;
        int length = (32 - i4) - spannableStringBuilder.length();
        int i5 = i4 - length;
        if (i != Integer.MIN_VALUE) {
            i2 = i;
        } else if (this.g == 2 && (Math.abs(i5) < 3 || length < 0)) {
            i2 = 1;
        } else if (this.g == 2 && i5 > 0) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                i4 = 32 - length;
            }
            f = ((i4 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f = 0.5f;
        }
        int i6 = this.d;
        if (i6 > 7) {
            i6 -= 17;
        } else if (this.g == 1) {
            i6 -= this.h - 1;
        }
        return new C2786tk(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i6, 1, Integer.MIN_VALUE, f, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        int i;
        boolean z;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.c);
        int length = spannableStringBuilder.length();
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.a;
            if (i2 >= arrayList.size()) {
                break;
            }
            C3114xc c3114xc = (C3114xc) arrayList.get(i2);
            boolean z3 = c3114xc.b;
            int i8 = c3114xc.a;
            if (i8 != 8) {
                if (i8 == 7) {
                    z = true;
                } else {
                    z = false;
                }
                if (i8 != 7) {
                    i7 = C3286zc.B[i8];
                }
                z2 = z;
            }
            int i9 = c3114xc.c;
            i2++;
            if (i2 < arrayList.size()) {
                i = ((C3114xc) arrayList.get(i2)).c;
            } else {
                i = length;
            }
            if (i9 != i) {
                if (i3 != -1 && !z3) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i9, 33);
                    i3 = -1;
                } else if (i3 == -1 && z3) {
                    i3 = i9;
                }
                if (i4 != -1 && !z2) {
                    AbstractC0324Hi.r(2, spannableStringBuilder, i4, i9, 33);
                    i4 = -1;
                } else if (i4 == -1 && z2) {
                    i4 = i9;
                }
                if (i7 != i6) {
                    if (i6 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i5, i9, 33);
                    }
                    i6 = i7;
                    i5 = i9;
                }
            }
        }
        if (i3 != -1 && i3 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i3, length, 33);
        }
        if (i4 != -1 && i4 != length) {
            AbstractC0324Hi.r(2, spannableStringBuilder, i4, length, 33);
        }
        if (i5 != length && i6 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i5, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        if (this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0) {
            return true;
        }
        return false;
    }
}
