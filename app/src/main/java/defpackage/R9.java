package defpackage;

import androidx.media3.common.b;
import com.applovin.impl.e9;
import com.applovin.impl.f2;
import com.applovin.impl.jk;
import com.applovin.impl.l6;
import com.applovin.impl.nq;
import com.applovin.impl.oq;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* renamed from: R9  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class R9 implements Comparator {
    public final /* synthetic */ int b;

    public /* synthetic */ R9(int i) {
        this.b = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC3014wQ a;
        switch (this.b) {
            case 0:
                return ((b) obj2).i - ((b) obj).i;
            case 1:
                C1365fa c1365fa = (C1365fa) obj;
                C1365fa c1365fa2 = (C1365fa) obj2;
                int compare = Integer.compare(c1365fa.c, c1365fa2.c);
                if (compare == 0) {
                    return c1365fa.b.compareTo(c1365fa2.b);
                }
                return compare;
            case 2:
                return Integer.compare(((C0136Ac) obj2).b, ((C0136Ac) obj).b);
            case 3:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 4:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 5:
                String name = ((File) obj).getName();
                int i = C0610Sj.f;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 6:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    if (num2.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    return num.intValue() - num2.intValue();
                }
            case 7:
                return Integer.compare(((C2965vo) ((List) obj).get(0)).h, ((C2965vo) ((List) obj2).get(0)).h);
            case 8:
                return ((C2879uo) Collections.max((List) obj)).compareTo((C2879uo) Collections.max((List) obj2));
            case 9:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C1547hf.f(C0252Eo.g((C0252Eo) Collections.max(list, new R9(11)), (C0252Eo) Collections.max(list2, new R9(11)))).a(list.size(), list2.size()).b((C0252Eo) Collections.max(list, new R9(12)), (C0252Eo) Collections.max(list2, new R9(12)), new R9(12)).e();
            case 10:
                return ((C0174Bo) ((List) obj).get(0)).compareTo((C0174Bo) ((List) obj2).get(0));
            case 11:
                return C0252Eo.g((C0252Eo) obj, (C0252Eo) obj2);
            case 12:
                C0252Eo c0252Eo = (C0252Eo) obj;
                C0252Eo c0252Eo2 = (C0252Eo) obj2;
                if (c0252Eo.g && c0252Eo.j) {
                    a = C0278Fo.i;
                } else {
                    a = C0278Fo.i.a();
                }
                C1547hf c1547hf = AbstractC1917jf.a;
                c0252Eo.h.getClass();
                return c1547hf.b(Integer.valueOf(c0252Eo.m), Integer.valueOf(c0252Eo2.m), a).b(Integer.valueOf(c0252Eo.l), Integer.valueOf(c0252Eo2.l), a).e();
            case 13:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    byte b = bArr[i2];
                    byte b2 = bArr2[i2];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 14:
                return C1426gB.b(((C2420pX) obj).a.c, ((C2420pX) obj2).a.c);
            case 15:
                return ((Q7) ((AbstractC2612rj) obj)).a.compareTo(((Q7) ((AbstractC2612rj) obj2)).a);
            case 16:
                return ((G20) obj).a - ((G20) obj2).a;
            case 17:
                return Float.compare(((G20) obj).c, ((G20) obj2).c);
            case 18:
                return Integer.compare(((C2086ld0) obj).a.b, ((C2086ld0) obj2).a.b);
            case 19:
                return Long.compare(((C2000kd0) obj).b, ((C2000kd0) obj2).b);
            case 20:
                return f2.b((e9) obj, (e9) obj2);
            case 21:
                return jk.b.b((jk.b) obj, (jk.b) obj2);
            case 22:
                return l6.c((Integer) obj, (Integer) obj2);
            case 23:
                return l6.d((Integer) obj, (Integer) obj2);
            default:
                return nq.b((oq) obj, (oq) obj2);
        }
    }
}
