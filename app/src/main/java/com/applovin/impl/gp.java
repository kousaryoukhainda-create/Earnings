package com.applovin.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.applovin.impl.a5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class gp {
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final jp f;
    private final String[] g;
    public final String h;
    public final String i;
    public final gp j;
    private final HashMap k;
    private final HashMap l;
    private List m;

    private gp(String str, String str2, long j, long j2, jp jpVar, String[] strArr, String str3, String str4, gp gpVar) {
        boolean z;
        this.a = str;
        this.b = str2;
        this.i = str4;
        this.f = jpVar;
        this.g = strArr;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        this.d = j;
        this.e = j2;
        this.h = (String) b1.a((Object) str3);
        this.j = gpVar;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public void a(gp gpVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(gpVar);
    }

    public long[] b() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public String[] c() {
        return this.g;
    }

    private void a(Map map, a5.b bVar, int i, int i2, int i3) {
        jp a = ip.a(this.f, this.g, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) bVar.e();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            bVar.a(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (a != null) {
            ip.a(spannableStringBuilder2, i, i2, a, this.j, map, i3);
            if ("p".equals(this.a)) {
                if (a.j() != Float.MAX_VALUE) {
                    bVar.c((a.j() * (-90.0f)) / 100.0f);
                }
                if (a.l() != null) {
                    bVar.b(a.l());
                }
                if (a.g() != null) {
                    bVar.a(a.g());
                }
            }
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder) {
        n6[] n6VarArr;
        for (n6 n6Var : (n6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), n6.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(n6Var), spannableStringBuilder.getSpanEnd(n6Var), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }

    public gp a(int i) {
        List list = this.m;
        if (list != null) {
            return (gp) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int a() {
        List list = this.m;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private void a(TreeSet treeSet, boolean z) {
        boolean equals = "p".equals(this.a);
        boolean equals2 = "div".equals(this.a);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            ((gp) this.m.get(i)).a(treeSet, z || equals);
        }
    }

    private static SpannableStringBuilder a(String str, Map map) {
        if (!map.containsKey(str)) {
            a5.b bVar = new a5.b();
            bVar.a(new SpannableStringBuilder());
            map.put(str, bVar);
        }
        return (SpannableStringBuilder) b1.a(((a5.b) map.get(str)).e());
    }

    public boolean a(long j) {
        int i;
        long j2 = this.d;
        int i2 = (j2 > (-9223372036854775807L) ? 1 : (j2 == (-9223372036854775807L) ? 0 : -1));
        return (i2 == 0 && this.e == -9223372036854775807L) || (j2 <= j && this.e == -9223372036854775807L) || ((i2 == 0 && j < this.e) || (i <= 0 && j < this.e));
    }

    private void a(long j, String str, List list) {
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (a(j) && "div".equals(this.a) && this.i != null) {
            list.add(new Pair(str, this.i));
            return;
        }
        for (int i = 0; i < a(); i++) {
            a(i).a(j, str, list);
        }
    }

    private void a(long j, Map map, Map map2, String str, Map map3) {
        int i;
        if (a(j)) {
            String str2 = "".equals(this.h) ? str : this.h;
            Iterator it = this.l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                int intValue = this.k.containsKey(str3) ? ((Integer) this.k.get(str3)).intValue() : 0;
                int intValue2 = ((Integer) entry.getValue()).intValue();
                if (intValue != intValue2) {
                    a(map, (a5.b) b1.a((a5.b) map3.get(str3)), intValue, intValue2, ((hp) b1.a((hp) map2.get(str2))).j);
                }
            }
            for (i = 0; i < a(); i++) {
                a(i).a(j, map, map2, str2, map3);
            }
        }
    }

    private void a(long j, boolean z, String str, Map map) {
        this.k.clear();
        this.l.clear();
        if ("metadata".equals(this.a)) {
            return;
        }
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (this.c && z) {
            a(str, map).append((CharSequence) b1.a((Object) this.b));
        } else if ("br".equals(this.a) && z) {
            a(str, map).append('\n');
        } else if (a(j)) {
            for (Map.Entry entry : map.entrySet()) {
                this.k.put((String) entry.getKey(), Integer.valueOf(((CharSequence) b1.a(((a5.b) entry.getValue()).e())).length()));
            }
            boolean equals = "p".equals(this.a);
            for (int i = 0; i < a(); i++) {
                a(i).a(j, z || equals, str, map);
            }
            if (equals) {
                ip.a(a(str, map));
            }
            for (Map.Entry entry2 : map.entrySet()) {
                this.l.put((String) entry2.getKey(), Integer.valueOf(((CharSequence) b1.a(((a5.b) entry2.getValue()).e())).length()));
            }
        }
    }

    public static gp a(String str) {
        return new gp(null, ip.a(str), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static gp a(String str, long j, long j2, jp jpVar, String[] strArr, String str2, String str3, gp gpVar) {
        return new gp(str, null, j, j2, jpVar, strArr, str2, str3, gpVar);
    }

    public List a(long j, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        a(j, this.h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j, false, this.h, (Map) treeMap);
        a(j, map, map2, this.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                hp hpVar = (hp) b1.a((hp) map2.get(pair.first));
                arrayList2.add(new a5.b().a(decodeByteArray).b(hpVar.b).b(0).a(hpVar.c, 0).a(hpVar.e).d(hpVar.f).a(hpVar.g).c(hpVar.j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            hp hpVar2 = (hp) b1.a((hp) map2.get(entry.getKey()));
            a5.b bVar = (a5.b) entry.getValue();
            a((SpannableStringBuilder) b1.a(bVar.e()));
            bVar.a(hpVar2.c, hpVar2.d);
            bVar.a(hpVar2.e);
            bVar.b(hpVar2.b);
            bVar.d(hpVar2.f);
            bVar.b(hpVar2.i, hpVar2.h);
            bVar.c(hpVar2.j);
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }
}
