package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.o;
import com.fyber.inneractive.sdk.model.vast.q;
import java.util.Comparator;
/* loaded from: classes.dex */
public class h implements Comparator<o> {
    public int a;
    public int b;
    public int c;

    public h(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final Integer a(String str) {
        q a = q.a(str);
        if (a == q.MEDIA_TYPE_MP4) {
            return 3;
        }
        if (a == q.MEDIA_TYPE_3GPP) {
            return 2;
        }
        if (a == q.MEDIA_TYPE_WEBM) {
            return 1;
        }
        return -1;
    }

    @Override // java.util.Comparator
    public int compare(o oVar, o oVar2) {
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        o oVar3 = oVar;
        o oVar4 = oVar2;
        if (!TextUtils.equals("VPAID", oVar4.f)) {
            if (!TextUtils.equals("VPAID", oVar3.f)) {
                Integer num = oVar3.e;
                if (num == null) {
                    intValue = 0;
                } else {
                    intValue = num.intValue();
                }
                Integer num2 = oVar4.e;
                if (num2 == null) {
                    intValue2 = 0;
                } else {
                    intValue2 = num2.intValue();
                }
                int i = this.a;
                if (intValue2 <= i || intValue > i) {
                    if (intValue <= i || intValue2 > i) {
                        int compareTo = a(oVar4.d).compareTo(a(oVar3.d));
                        if (compareTo != 0) {
                            return compareTo;
                        }
                        if (intValue >= intValue2) {
                            if (intValue <= intValue2) {
                                Integer num3 = oVar3.b;
                                if (num3 == null) {
                                    intValue3 = 0;
                                } else {
                                    intValue3 = num3.intValue();
                                }
                                Integer num4 = oVar3.c;
                                if (num4 == null) {
                                    intValue4 = 0;
                                } else {
                                    intValue4 = num4.intValue();
                                }
                                Integer num5 = oVar4.b;
                                if (num5 == null) {
                                    intValue5 = 0;
                                } else {
                                    intValue5 = num5.intValue();
                                }
                                Integer num6 = oVar4.c;
                                if (num6 == null) {
                                    intValue6 = 0;
                                } else {
                                    intValue6 = num6.intValue();
                                }
                                int i2 = intValue3 * intValue4;
                                int i3 = intValue5 * intValue6;
                                int i4 = this.b * this.c;
                                int abs = Math.abs(i2 - i4);
                                int abs2 = Math.abs(i3 - i4);
                                if (abs >= abs2) {
                                    if (abs <= abs2) {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
