package defpackage;

import android.animation.TimeInterpolator;
/* renamed from: i3  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1583i3 implements TimeInterpolator {
    public int[] a;
    public int b;
    public int c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        int i = (int) ((f * this.c) + 0.5f);
        int i2 = this.b;
        int[] iArr = this.a;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3];
            if (i < i4) {
                break;
            }
            i -= i4;
            i3++;
        }
        if (i3 < i2) {
            f2 = i / this.c;
        } else {
            f2 = 0.0f;
        }
        return (i3 / i2) + f2;
    }
}
