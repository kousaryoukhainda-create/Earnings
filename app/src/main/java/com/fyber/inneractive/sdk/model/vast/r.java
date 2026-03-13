package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.c1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;
/* loaded from: classes.dex */
public class r {
    public String a;
    public List<e> b;

    public static r a(Node node) {
        e eVar;
        r rVar = new r();
        rVar.a = c1.b(node, "version");
        ArrayList arrayList = (ArrayList) c1.c(node, "Ad");
        if (!arrayList.isEmpty()) {
            rVar.b = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                if (node2 == null) {
                    eVar = null;
                } else {
                    e eVar2 = new e();
                    eVar2.a = c1.b(node2, "id");
                    Node d = c1.d(node2, "Wrapper");
                    if (d != null) {
                        eVar2.b = v.c(d);
                    }
                    Node d2 = c1.d(node2, "InLine");
                    if (d2 != null) {
                        eVar2.c = m.c(d2);
                    }
                    eVar = eVar2;
                }
                rVar.b.add(eVar);
            }
        }
        return rVar;
    }

    public String toString() {
        return new StringBuilder(AbstractC0324Hi.h(new StringBuilder("Vast: version - "), this.a, "\nAds: ")).toString();
    }
}
