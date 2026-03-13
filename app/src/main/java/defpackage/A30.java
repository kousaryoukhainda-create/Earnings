package defpackage;

import androidx.media3.common.b;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: A30  reason: default package */
/* loaded from: classes.dex */
public final class A30 extends AbstractC2899v30 {
    public final String e;
    public final LinkedList f;
    public int g;
    public String h;
    public long i;
    public String j;
    public String k;
    public int l;
    public int m;
    public int n;
    public int o;
    public String p;
    public ArrayList q;
    public long r;

    public A30(AbstractC2899v30 abstractC2899v30, String str) {
        super(abstractC2899v30, str, "StreamIndex");
        this.e = str;
        this.f = new LinkedList();
    }

    @Override // defpackage.AbstractC2899v30
    public final void a(Object obj) {
        if (obj instanceof b) {
            this.f.add((b) obj);
        }
    }

    @Override // defpackage.AbstractC2899v30
    public final Object b() {
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        ArrayList arrayList2;
        RoundingMode roundingMode;
        int i4;
        long[] jArr;
        int i5;
        ArrayList arrayList3;
        long[] jArr2;
        LinkedList linkedList = this.f;
        b[] bVarArr = new b[linkedList.size()];
        linkedList.toArray(bVarArr);
        String str = this.k;
        int i6 = this.g;
        String str2 = this.h;
        long j = this.i;
        String str3 = this.j;
        int i7 = this.l;
        int i8 = this.m;
        int i9 = this.n;
        int i10 = this.o;
        String str4 = this.p;
        ArrayList arrayList4 = this.q;
        long j2 = this.r;
        int i11 = Ha0.a;
        RoundingMode roundingMode2 = RoundingMode.FLOOR;
        int size = arrayList4.size();
        long[] jArr3 = new long[size];
        int i12 = (j > 1000000L ? 1 : (j == 1000000L ? 0 : -1));
        if (i12 >= 0 && j % 1000000 == 0) {
            i = i8;
            long M = AbstractC0867af0.M(j, 1000000L, RoundingMode.UNNECESSARY);
            int i13 = 0;
            while (i13 < size) {
                jArr3[i13] = AbstractC0867af0.M(((Long) arrayList4.get(i13)).longValue(), M, roundingMode2);
                i13++;
                i7 = i7;
                i9 = i9;
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
            i2 = i9;
            i3 = i7;
        } else {
            i = i8;
            i2 = i9;
            i3 = i7;
            if (i12 < 0 && 1000000 % j == 0) {
                long M2 = AbstractC0867af0.M(1000000L, j, RoundingMode.UNNECESSARY);
                for (int i14 = 0; i14 < size; i14++) {
                    jArr3[i14] = AbstractC0867af0.k0(((Long) arrayList4.get(i14)).longValue(), M2);
                }
            } else {
                int i15 = 0;
                while (i15 < size) {
                    long longValue = ((Long) arrayList4.get(i15)).longValue();
                    if (longValue == 0) {
                        arrayList2 = arrayList4;
                        roundingMode = roundingMode2;
                        i4 = size;
                        jArr = jArr3;
                        i5 = i15;
                    } else {
                        int i16 = (j > longValue ? 1 : (j == longValue ? 0 : -1));
                        if (i16 >= 0 && j % longValue == 0) {
                            arrayList = arrayList4;
                            jArr3[i15] = AbstractC0867af0.M(1000000L, AbstractC0867af0.M(j, longValue, RoundingMode.UNNECESSARY), roundingMode2);
                        } else {
                            arrayList = arrayList4;
                            if (i16 < 0 && longValue % j == 0) {
                                jArr3[i15] = AbstractC0867af0.k0(1000000L, AbstractC0867af0.M(longValue, j, RoundingMode.UNNECESSARY));
                            } else {
                                arrayList2 = arrayList;
                                roundingMode = roundingMode2;
                                i4 = size;
                                jArr = jArr3;
                                i5 = i15;
                                jArr[i5] = Ha0.V(longValue, 1000000L, j, roundingMode);
                            }
                        }
                        i4 = size;
                        jArr = jArr3;
                        i5 = i15;
                        arrayList2 = arrayList;
                        roundingMode = roundingMode2;
                    }
                    i15 = i5 + 1;
                    arrayList4 = arrayList2;
                    roundingMode2 = roundingMode;
                    size = i4;
                    jArr3 = jArr;
                }
            }
            arrayList3 = arrayList4;
            jArr2 = jArr3;
        }
        return new C2727t30(this.e, str, i6, str2, j, str3, i3, i, i2, i10, str4, bVarArr, arrayList3, jArr2, Ha0.U(j2, 1000000L, j, RoundingMode.FLOOR));
    }

    @Override // defpackage.AbstractC2899v30
    public final boolean d(String str) {
        return "c".equals(str);
    }

    @Override // defpackage.AbstractC2899v30
    public final void j(XmlPullParser xmlPullParser) {
        int i = 1;
        if ("c".equals(xmlPullParser.getName())) {
            int size = this.q.size();
            long h = AbstractC2899v30.h(xmlPullParser, "t", -9223372036854775807L);
            if (h == -9223372036854775807L) {
                if (size == 0) {
                    h = 0;
                } else if (this.r != -1) {
                    h = this.r + ((Long) this.q.get(size - 1)).longValue();
                } else {
                    throw QQ.b("Unable to infer start time", null);
                }
            }
            this.q.add(Long.valueOf(h));
            this.r = AbstractC2899v30.h(xmlPullParser, "d", -9223372036854775807L);
            long h2 = AbstractC2899v30.h(xmlPullParser, "r", 1L);
            if (h2 > 1 && this.r == -9223372036854775807L) {
                throw QQ.b("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j = i;
                if (j < h2) {
                    this.q.add(Long.valueOf((this.r * j) + h));
                    i++;
                } else {
                    return;
                }
            }
        } else {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue != null) {
                if (!"audio".equalsIgnoreCase(attributeValue)) {
                    if ("video".equalsIgnoreCase(attributeValue)) {
                        i = 2;
                    } else if ("text".equalsIgnoreCase(attributeValue)) {
                        i = 3;
                    } else {
                        throw QQ.b("Invalid key value[" + attributeValue + "]", null);
                    }
                }
                this.g = i;
                l(Integer.valueOf(i), "Type");
                if (this.g == 3) {
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, "Subtype");
                    if (attributeValue2 != null) {
                        this.h = attributeValue2;
                    } else {
                        throw new C2985w30("Subtype", 0);
                    }
                } else {
                    this.h = xmlPullParser.getAttributeValue(null, "Subtype");
                }
                l(this.h, "Subtype");
                String attributeValue3 = xmlPullParser.getAttributeValue(null, "Name");
                this.j = attributeValue3;
                l(attributeValue3, "Name");
                String attributeValue4 = xmlPullParser.getAttributeValue(null, "Url");
                if (attributeValue4 != null) {
                    this.k = attributeValue4;
                    this.l = AbstractC2899v30.g(xmlPullParser, "MaxWidth");
                    this.m = AbstractC2899v30.g(xmlPullParser, "MaxHeight");
                    this.n = AbstractC2899v30.g(xmlPullParser, "DisplayWidth");
                    this.o = AbstractC2899v30.g(xmlPullParser, "DisplayHeight");
                    String attributeValue5 = xmlPullParser.getAttributeValue(null, "Language");
                    this.p = attributeValue5;
                    l(attributeValue5, "Language");
                    long g = AbstractC2899v30.g(xmlPullParser, "TimeScale");
                    this.i = g;
                    if (g == -1) {
                        this.i = ((Long) c("TimeScale")).longValue();
                    }
                    this.q = new ArrayList();
                    return;
                }
                throw new C2985w30("Url", 0);
            }
            throw new C2985w30("Type", 0);
        }
    }
}
