package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: mJ  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2148mJ extends C2062lJ {
    public static Object c(Map map, Enum r3) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map instanceof InterfaceC1520hJ) {
            return ((InterfaceC1520hJ) map).j();
        }
        Object obj = map.get(r3);
        if (obj == null && !map.containsKey(r3)) {
            throw new NoSuchElementException("Key " + r3 + " is missing in the map.");
        }
        return obj;
    }

    public static HashMap d(JQ... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        HashMap hashMap = new HashMap(C2062lJ.a(pairs.length));
        h(hashMap, pairs);
        return hashMap;
    }

    public static Map e(JQ... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (pairs.length > 0) {
            LinkedHashMap destination = new LinkedHashMap(C2062lJ.a(pairs.length));
            Intrinsics.checkNotNullParameter(pairs, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            h(destination, pairs);
            return destination;
        }
        return C3054wr.b;
    }

    public static LinkedHashMap f(JQ... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2062lJ.a(pairs.length));
        h(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static LinkedHashMap g(Map map, Map map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void h(HashMap hashMap, JQ[] pairs) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (JQ jq : pairs) {
            hashMap.put(jq.b, jq.c);
        }
    }

    public static Map i(ArrayList pairs) {
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        C3054wr c3054wr = C3054wr.b;
        int size = pairs.size();
        if (size != 0) {
            if (size != 1) {
                LinkedHashMap destination = new LinkedHashMap(C2062lJ.a(pairs.size()));
                Intrinsics.checkNotNullParameter(pairs, "<this>");
                Intrinsics.checkNotNullParameter(destination, "destination");
                Intrinsics.checkNotNullParameter(destination, "<this>");
                Intrinsics.checkNotNullParameter(pairs, "pairs");
                Iterator it = pairs.iterator();
                while (it.hasNext()) {
                    JQ jq = (JQ) it.next();
                    destination.put(jq.b, jq.c);
                }
                return destination;
            }
            return C2062lJ.b((JQ) pairs.get(0));
        }
        return c3054wr;
    }

    public static Map j(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                Intrinsics.checkNotNullParameter(map, "<this>");
                return new LinkedHashMap(map);
            }
            Intrinsics.checkNotNullParameter(map, "<this>");
            Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
            Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
            Intrinsics.checkNotNullExpressionValue(singletonMap, "with(...)");
            return singletonMap;
        }
        return C3054wr.b;
    }
}
