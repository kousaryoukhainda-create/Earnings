package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class C {
    private static final ConcurrentHashMap a = new ConcurrentHashMap(16, 0.75f, 2);
    private static final Comparator b = new Object();
    private static final C c = new Object();
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C d() {
        return c;
    }

    public String f(j$.time.temporal.s sVar, long j, H h, Locale locale) {
        Object b2 = b(sVar, locale);
        if (b2 instanceof B) {
            return ((B) b2).a(j, h);
        }
        return null;
    }

    public String e(j$.time.chrono.m mVar, j$.time.temporal.s sVar, long j, H h, Locale locale) {
        if (mVar == j$.time.chrono.t.d || !(sVar instanceof j$.time.temporal.a)) {
            return f(sVar, j, h, locale);
        }
        return null;
    }

    public Iterator h(j$.time.temporal.s sVar, H h, Locale locale) {
        Object b2 = b(sVar, locale);
        if (b2 instanceof B) {
            return ((B) b2).b(h);
        }
        return null;
    }

    public Iterator g(j$.time.chrono.m mVar, j$.time.temporal.s sVar, H h, Locale locale) {
        if (mVar == j$.time.chrono.t.d || !(sVar instanceof j$.time.temporal.a)) {
            return h(sVar, h, locale);
        }
        return null;
    }

    private static String c(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    private static Object b(j$.time.temporal.s sVar, Locale locale) {
        Object obj;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(sVar, locale);
        ConcurrentHashMap concurrentHashMap = a;
        Object obj2 = concurrentHashMap.get(simpleImmutableEntry);
        if (obj2 == null) {
            HashMap hashMap = new HashMap();
            int i = 0;
            if (sVar == j$.time.temporal.a.ERA) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                String[] eras = dateFormatSymbols.getEras();
                while (i < eras.length) {
                    if (!eras[i].isEmpty()) {
                        long j = i;
                        hashMap2.put(Long.valueOf(j), eras[i]);
                        hashMap3.put(Long.valueOf(j), c(eras[i]));
                    }
                    i++;
                }
                if (!hashMap2.isEmpty()) {
                    hashMap.put(H.FULL, hashMap2);
                    hashMap.put(H.SHORT, hashMap2);
                    hashMap.put(H.NARROW, hashMap3);
                }
                obj = new B(hashMap);
            } else if (sVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap4 = new HashMap();
                HashMap hashMap5 = new HashMap();
                String[] months = dateFormatSymbols2.getMonths();
                for (int i2 = 0; i2 < months.length; i2++) {
                    if (!months[i2].isEmpty()) {
                        long j2 = i2 + 1;
                        hashMap4.put(Long.valueOf(j2), months[i2]);
                        hashMap5.put(Long.valueOf(j2), c(months[i2]));
                    }
                }
                if (!hashMap4.isEmpty()) {
                    hashMap.put(H.FULL, hashMap4);
                    hashMap.put(H.NARROW, hashMap5);
                }
                HashMap hashMap6 = new HashMap();
                String[] shortMonths = dateFormatSymbols2.getShortMonths();
                while (i < shortMonths.length) {
                    if (!shortMonths[i].isEmpty()) {
                        hashMap6.put(Long.valueOf(i + 1), shortMonths[i]);
                    }
                    i++;
                }
                if (!hashMap6.isEmpty()) {
                    hashMap.put(H.SHORT, hashMap6);
                }
                obj = new B(hashMap);
            } else if (sVar == j$.time.temporal.a.DAY_OF_WEEK) {
                DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap7 = new HashMap();
                String[] weekdays = dateFormatSymbols3.getWeekdays();
                hashMap7.put(1L, weekdays[2]);
                hashMap7.put(2L, weekdays[3]);
                hashMap7.put(3L, weekdays[4]);
                hashMap7.put(4L, weekdays[5]);
                hashMap7.put(5L, weekdays[6]);
                hashMap7.put(6L, weekdays[7]);
                hashMap7.put(7L, weekdays[1]);
                hashMap.put(H.FULL, hashMap7);
                HashMap hashMap8 = new HashMap();
                hashMap8.put(1L, c(weekdays[2]));
                hashMap8.put(2L, c(weekdays[3]));
                hashMap8.put(3L, c(weekdays[4]));
                hashMap8.put(4L, c(weekdays[5]));
                hashMap8.put(5L, c(weekdays[6]));
                hashMap8.put(6L, c(weekdays[7]));
                hashMap8.put(7L, c(weekdays[1]));
                hashMap.put(H.NARROW, hashMap8);
                HashMap hashMap9 = new HashMap();
                String[] shortWeekdays = dateFormatSymbols3.getShortWeekdays();
                hashMap9.put(1L, shortWeekdays[2]);
                hashMap9.put(2L, shortWeekdays[3]);
                hashMap9.put(3L, shortWeekdays[4]);
                hashMap9.put(4L, shortWeekdays[5]);
                hashMap9.put(5L, shortWeekdays[6]);
                hashMap9.put(6L, shortWeekdays[7]);
                hashMap9.put(7L, shortWeekdays[1]);
                hashMap.put(H.SHORT, hashMap9);
                obj = new B(hashMap);
            } else if (sVar == j$.time.temporal.a.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
                HashMap hashMap10 = new HashMap();
                HashMap hashMap11 = new HashMap();
                String[] amPmStrings = dateFormatSymbols4.getAmPmStrings();
                while (i < amPmStrings.length) {
                    if (!amPmStrings[i].isEmpty()) {
                        long j3 = i;
                        hashMap10.put(Long.valueOf(j3), amPmStrings[i]);
                        hashMap11.put(Long.valueOf(j3), c(amPmStrings[i]));
                    }
                    i++;
                }
                if (!hashMap10.isEmpty()) {
                    hashMap.put(H.FULL, hashMap10);
                    hashMap.put(H.SHORT, hashMap10);
                    hashMap.put(H.NARROW, hashMap11);
                }
                obj = new B(hashMap);
            } else {
                obj = "";
            }
            concurrentHashMap.putIfAbsent(simpleImmutableEntry, obj);
            return concurrentHashMap.get(simpleImmutableEntry);
        }
        return obj2;
    }
}
