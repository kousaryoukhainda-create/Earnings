package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class B {
    private final Map a;
    private final HashMap b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(Map map) {
        Comparator comparator;
        Comparator comparator2;
        this.a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                int i = C.d;
                hashMap2.put((String) entry2.getValue(), new AbstractMap.SimpleImmutableEntry((String) entry2.getValue(), (Long) entry2.getKey()));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            comparator2 = C.b;
            Collections.sort(arrayList2, comparator2);
            hashMap.put((H) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        comparator = C.b;
        Collections.sort(arrayList, comparator);
        this.b = hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(long j, H h) {
        Map map = (Map) this.a.get(h);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator b(H h) {
        List list = (List) this.b.get(h);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
