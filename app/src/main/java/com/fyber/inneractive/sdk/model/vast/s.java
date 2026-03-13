package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.c1;
import com.google.android.gms.tagmanager.DataLayer;
import org.w3c.dom.Node;
/* loaded from: classes.dex */
public class s {
    public String a;
    public String b;
    public String c;

    public static s a(Node node) {
        if (node == null) {
            return null;
        }
        s sVar = new s();
        sVar.a = c1.b(node, DataLayer.EVENT_KEY);
        sVar.b = c1.a(node);
        sVar.c = c1.b(node, "offset");
        return sVar;
    }

    public String toString() {
        return "VTracking:  name:" + this.a + " url:" + this.b + " offset:" + this.c;
    }
}
