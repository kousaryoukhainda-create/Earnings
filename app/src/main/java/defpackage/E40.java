package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
/* renamed from: E40  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class E40 implements InterfaceC0652Tz {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ E40(int i, Object obj, boolean z) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // defpackage.InterfaceC0652Tz
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        JQ jq;
        Object obj4;
        int i = this.b;
        CharSequence DelimitedRangesSequence = (CharSequence) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int w = d.w(DelimitedRangesSequence, (char[]) this.d, intValue, this.c);
                if (w < 0) {
                    return null;
                }
                return new JQ(Integer.valueOf(w), 1);
            default:
                Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                List list = (List) this.d;
                boolean z = this.c;
                if (!z && list.size() == 1) {
                    Intrinsics.checkNotNullParameter(list, "<this>");
                    Intrinsics.checkNotNullParameter(list, "<this>");
                    int size = list.size();
                    if (size != 0) {
                        if (size == 1) {
                            String str = (String) list.get(0);
                            int u = d.u(intValue, 4, DelimitedRangesSequence, str, false);
                            if (u >= 0) {
                                jq = new JQ(Integer.valueOf(u), str);
                            }
                            jq = null;
                        } else {
                            throw new IllegalArgumentException("List has more than one element.");
                        }
                    } else {
                        throw new NoSuchElementException("List is empty.");
                    }
                } else {
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    C1885jE c1885jE = new C1885jE(intValue, DelimitedRangesSequence.length(), 1);
                    boolean z2 = DelimitedRangesSequence instanceof String;
                    int i2 = c1885jE.d;
                    int i3 = c1885jE.c;
                    if (z2) {
                        if ((i2 > 0 && intValue <= i3) || (i2 < 0 && i3 <= intValue)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj4 = it.next();
                                        String str2 = (String) obj4;
                                        if (D40.k(0, intValue, str2.length(), str2, (String) DelimitedRangesSequence, z)) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    jq = new JQ(Integer.valueOf(intValue), str3);
                                } else if (intValue != i3) {
                                    intValue += i2;
                                }
                            }
                        }
                        jq = null;
                    } else {
                        if ((i2 > 0 && intValue <= i3) || (i2 < 0 && i3 <= intValue)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj3 = it2.next();
                                        String str4 = (String) obj3;
                                        if (d.C(intValue, str4.length(), DelimitedRangesSequence, str4, z)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    jq = new JQ(Integer.valueOf(intValue), str5);
                                } else if (intValue != i3) {
                                    intValue += i2;
                                }
                            }
                        }
                        jq = null;
                    }
                }
                if (jq == null) {
                    return null;
                }
                return new JQ(jq.b, Integer.valueOf(((String) jq.c).length()));
        }
    }
}
