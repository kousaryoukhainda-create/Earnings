package com.applovin.impl;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.applovin.impl.a5;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class jl extends ek {
    private static final Pattern q = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    private static final Pattern r = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder o;
    private final ArrayList p;

    public jl() {
        super("SubripDecoder");
        this.o = new StringBuilder();
        this.p = new ArrayList();
    }

    private static long a(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = (Long.parseLong((String) b1.a((Object) matcher.group(i + 3))) * 1000) + (Long.parseLong((String) b1.a((Object) matcher.group(i + 2))) * 60000) + (group != null ? Long.parseLong(group) * 3600000 : 0L);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    public static float b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    private String a(String str, ArrayList arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = r.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb.replace(start, start + length, "");
            i += length;
        }
        return sb.toString();
    }

    @Override // com.applovin.impl.ek
    public nl a(byte[] bArr, int i, boolean z) {
        String str;
        ArrayList arrayList = new ArrayList();
        qc qcVar = new qc();
        ah ahVar = new ah(bArr, i);
        while (true) {
            String l = ahVar.l();
            int i2 = 0;
            if (l == null) {
                break;
            } else if (l.length() != 0) {
                try {
                    Integer.parseInt(l);
                    String l2 = ahVar.l();
                    if (l2 == null) {
                        oc.d("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = q.matcher(l2);
                    if (!matcher.matches()) {
                        oc.d("SubripDecoder", "Skipping invalid timing: ".concat(l2));
                    } else {
                        qcVar.a(a(matcher, 1));
                        qcVar.a(a(matcher, 6));
                        this.o.setLength(0);
                        this.p.clear();
                        for (String l3 = ahVar.l(); !TextUtils.isEmpty(l3); l3 = ahVar.l()) {
                            if (this.o.length() > 0) {
                                this.o.append("<br>");
                            }
                            this.o.append(a(l3, this.p));
                        }
                        Spanned fromHtml = Html.fromHtml(this.o.toString());
                        while (true) {
                            if (i2 >= this.p.size()) {
                                str = null;
                                break;
                            }
                            str = (String) this.p.get(i2);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(a(fromHtml, str));
                        arrayList.add(a5.s);
                    }
                } catch (NumberFormatException unused) {
                    oc.d("SubripDecoder", "Skipping invalid index: ".concat(l));
                }
            }
        }
        return new kl((a5[]) arrayList.toArray(new a5[0]), qcVar.b());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private a5 a(Spanned spanned, String str) {
        char c;
        char c2;
        a5.b a = new a5.b().a(spanned);
        if (str == null) {
            return a.a();
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1 || c == 2) {
            a.b(0);
        } else if (c != 3 && c != 4 && c != 5) {
            a.b(1);
        } else {
            a.b(2);
        }
        switch (str.hashCode()) {
            case -685620710:
                if (str.equals("{\\an1}")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -685620679:
                if (str.equals("{\\an2}")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -685620648:
                if (str.equals("{\\an3}")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -685620617:
                if (str.equals("{\\an4}")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -685620586:
                if (str.equals("{\\an5}")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -685620555:
                if (str.equals("{\\an6}")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -685620524:
                if (str.equals("{\\an7}")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -685620493:
                if (str.equals("{\\an8}")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -685620462:
                if (str.equals("{\\an9}")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        if (c2 == 0 || c2 == 1 || c2 == 2) {
            a.a(2);
        } else if (c2 != 3 && c2 != 4 && c2 != 5) {
            a.a(1);
        } else {
            a.a(0);
        }
        return a.b(b(a.d())).a(b(a.c()), 0).a();
    }
}
