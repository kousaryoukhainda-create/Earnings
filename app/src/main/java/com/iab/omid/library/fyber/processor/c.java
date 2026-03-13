package com.iab.omid.library.fyber.processor;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.fyber.processor.a;
import com.iab.omid.library.fyber.utils.e;
import com.iab.omid.library.fyber.utils.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class c implements a {
    private final a a;

    public c(a aVar) {
        this.a = aVar;
    }

    @NonNull
    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        com.iab.omid.library.fyber.internal.c c = com.iab.omid.library.fyber.internal.c.c();
        if (c != null) {
            Collection<com.iab.omid.library.fyber.adsession.a> a = c.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a.size() * 2) + 3);
            for (com.iab.omid.library.fyber.adsession.a aVar : a) {
                View c2 = aVar.c();
                if (c2 != null && h.e(c2) && (rootView = c2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c3 = h.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && h.c(arrayList.get(size - 1)) > c3) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.fyber.processor.a
    public JSONObject a(View view) {
        JSONObject a = com.iab.omid.library.fyber.utils.c.a(0, 0, 0, 0);
        com.iab.omid.library.fyber.utils.c.a(a, e.a());
        return a;
    }

    @Override // com.iab.omid.library.fyber.processor.a
    public void a(View view, JSONObject jSONObject, a.InterfaceC0128a interfaceC0128a, boolean z, boolean z2) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            interfaceC0128a.a(it.next(), this.a, jSONObject, z2);
        }
    }
}
