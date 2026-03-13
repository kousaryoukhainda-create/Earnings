package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.c1;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;
/* loaded from: classes.dex */
public class f {
    public String a;
    public l e;
    public List<com.fyber.inneractive.sdk.measurement.f> d = new ArrayList();
    public List<String> b = new ArrayList();
    public List<k> c = new ArrayList();

    public final void a(Node node) {
        com.fyber.inneractive.sdk.measurement.f fVar;
        Node d = c1.d(node, "AdVerifications");
        if (d != null) {
            Iterator it = ((ArrayList) c1.c(d, "Verification")).iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                if (node2 == null) {
                    fVar = null;
                } else {
                    com.fyber.inneractive.sdk.measurement.f fVar2 = new com.fyber.inneractive.sdk.measurement.f();
                    fVar2.e = c1.b(node2, "vendor");
                    Node d2 = c1.d(node2, "JavaScriptResource");
                    if (d2 != null) {
                        fVar2.g = true;
                        try {
                            fVar2.f = c1.a(d2);
                            fVar2.b = c1.b(d2, "apiFramework");
                            fVar2.a = new URL(fVar2.f);
                        } catch (MalformedURLException unused) {
                        }
                    }
                    Node d3 = c1.d(node2, "TrackingEvents");
                    if (d3 != null) {
                        Iterator it2 = ((ArrayList) c1.c(d3, "Tracking")).iterator();
                        while (it2.hasNext()) {
                            Node node3 = (Node) it2.next();
                            s a = s.a(node3);
                            if (node3 != null && a.a.equalsIgnoreCase("verificationNotExecuted")) {
                                fVar2.a(t.EVENT_VERIFICATION_NOT_EXECUTED, a.b);
                            }
                        }
                    }
                    Node d4 = c1.d(node2, "VerificationParameters");
                    if (d4 != null) {
                        fVar2.d = c1.a(d4);
                    }
                    fVar = fVar2;
                }
                if (fVar != null) {
                    IAlog.a("Verification Found - %s", fVar.toString());
                    this.d.add(fVar);
                }
            }
        }
    }

    public void b(Node node) {
        Iterator it;
        k kVar;
        g gVar;
        Iterator it2;
        o oVar;
        Iterator it3;
        if (node == null) {
            return;
        }
        Node d = c1.d(node, "AdSystem");
        if (d != null) {
            c1.b(d, "version");
            c1.a(d);
        }
        Node d2 = c1.d(node, "Error");
        if (d2 != null) {
            String a = c1.a(d2);
            if (!TextUtils.isEmpty(a)) {
                this.a = a;
            }
        }
        Iterator it4 = ((ArrayList) c1.c(node, "Impression")).iterator();
        while (it4.hasNext()) {
            String a2 = c1.a((Node) it4.next());
            if (!TextUtils.isEmpty(a2)) {
                this.b.add(a2);
            }
        }
        Node d3 = c1.d(node, "Creatives");
        if (d3 != null) {
            Iterator it5 = ((ArrayList) c1.c(d3, "Creative")).iterator();
            while (it5.hasNext()) {
                Node node2 = (Node) it5.next();
                if (node2 == null) {
                    it = it5;
                    kVar = null;
                } else {
                    k kVar2 = new k();
                    c1.b(node2, "AdID");
                    c1.b(node2, "id");
                    c1.a(node2, "sequence");
                    Node d4 = c1.d(node2, "Linear");
                    if (d4 != null) {
                        n nVar = new n();
                        Node d5 = c1.d(d4, "MediaFiles");
                        if (d5 != null) {
                            ArrayList arrayList = (ArrayList) c1.c(d5, "MediaFile");
                            if (!arrayList.isEmpty()) {
                                nVar.a = new ArrayList();
                                Iterator it6 = arrayList.iterator();
                                while (it6.hasNext()) {
                                    Node node3 = (Node) it6.next();
                                    if (node3 == null) {
                                        it2 = it5;
                                        it3 = it6;
                                        oVar = null;
                                    } else {
                                        it2 = it5;
                                        oVar = new o();
                                        it3 = it6;
                                        oVar.a = c1.b(node3, "delivery");
                                        oVar.b = c1.a(node3, "width");
                                        oVar.c = c1.a(node3, "height");
                                        oVar.d = c1.b(node3, "type");
                                        c1.b(node3, "id");
                                        oVar.f = c1.b(node3, "apiFramework");
                                        oVar.e = c1.a(node3, "bitrate");
                                        String b = c1.b(node3, "maintainAspectRatio");
                                        if (!TextUtils.isEmpty(b)) {
                                            try {
                                                Boolean.valueOf(b);
                                            } catch (NumberFormatException unused) {
                                            }
                                        }
                                        String b2 = c1.b(node3, "scalable");
                                        if (!TextUtils.isEmpty(b2)) {
                                            try {
                                                Boolean.valueOf(b2);
                                            } catch (NumberFormatException unused2) {
                                            }
                                        }
                                        oVar.g = c1.a(node3);
                                    }
                                    if (oVar != null) {
                                        nVar.a.add(oVar);
                                    }
                                    it5 = it2;
                                    it6 = it3;
                                }
                            }
                        }
                        it = it5;
                        Node d6 = c1.d(d4, "VideoClicks");
                        if (d6 != null) {
                            nVar.c = c1.a(c1.d(d6, "ClickThrough"));
                            ArrayList arrayList2 = (ArrayList) c1.c(d6, "ClickTracking");
                            if (!arrayList2.isEmpty()) {
                                nVar.d = new ArrayList();
                                Iterator it7 = arrayList2.iterator();
                                while (it7.hasNext()) {
                                    String a3 = c1.a((Node) it7.next());
                                    if (!TextUtils.isEmpty(a3)) {
                                        nVar.d.add(a3);
                                    }
                                }
                            }
                        }
                        Node d7 = c1.d(d4, "TrackingEvents");
                        if (d7 != null) {
                            ArrayList arrayList3 = (ArrayList) c1.c(d7, "Tracking");
                            if (!arrayList3.isEmpty()) {
                                nVar.b = new ArrayList();
                                Iterator it8 = arrayList3.iterator();
                                while (it8.hasNext()) {
                                    s a4 = s.a((Node) it8.next());
                                    if (a4 != null) {
                                        nVar.b.add(a4);
                                    }
                                }
                            }
                        }
                        Node d8 = c1.d(d4, "Duration");
                        if (d8 != null) {
                            nVar.e = c1.a(d8);
                        }
                        kVar2.a = nVar;
                    } else {
                        it = it5;
                    }
                    Node d9 = c1.d(node2, "CompanionAds");
                    if (d9 != null) {
                        List<Node> c = c1.c(d9, "Companion");
                        kVar2.b = new ArrayList();
                        Iterator it9 = ((ArrayList) c).iterator();
                        while (it9.hasNext()) {
                            Node node4 = (Node) it9.next();
                            if (node4 == null) {
                                gVar = null;
                            } else {
                                gVar = new g();
                                gVar.a = c1.a(node4, "width");
                                gVar.b = c1.a(node4, "height");
                                gVar.c = c1.b(node4, "id");
                                c1.b(node4, "apiFramework");
                                c1.a(node4, "expandedWidth");
                                c1.a(node4, "expandedHeight");
                                Node d10 = c1.d(node4, "StaticResource");
                                if (d10 != null) {
                                    j jVar = new j();
                                    jVar.a = c1.b(d10, "creativeType");
                                    jVar.b = c1.a(d10);
                                    gVar.d = jVar;
                                }
                                Node d11 = c1.d(node4, "HTMLResource");
                                if (d11 != null) {
                                    gVar.f = c1.a(d11);
                                }
                                Node d12 = c1.d(node4, "IFrameResource");
                                if (d12 != null) {
                                    gVar.e = c1.a(d12);
                                }
                                Node d13 = c1.d(node4, "CompanionClickThrough");
                                if (d13 != null) {
                                    gVar.g = c1.a(d13);
                                }
                                ArrayList arrayList4 = (ArrayList) c1.c(node4, "CompanionClickTracking");
                                if (arrayList4.size() > 0) {
                                    gVar.h = new ArrayList();
                                    Iterator it10 = arrayList4.iterator();
                                    while (it10.hasNext()) {
                                        String a5 = c1.a((Node) it10.next());
                                        if (!TextUtils.isEmpty(a5)) {
                                            gVar.h.add(a5);
                                        }
                                    }
                                }
                                Node d14 = c1.d(node4, "TrackingEvents");
                                if (d14 != null) {
                                    ArrayList arrayList5 = (ArrayList) c1.c(d14, "Tracking");
                                    if (!arrayList5.isEmpty()) {
                                        gVar.j = new ArrayList();
                                        Iterator it11 = arrayList5.iterator();
                                        while (it11.hasNext()) {
                                            s a6 = s.a((Node) it11.next());
                                            if (a6 != null) {
                                                gVar.j.add(a6);
                                            }
                                        }
                                    }
                                }
                            }
                            if (gVar != null) {
                                kVar2.b.add(gVar);
                            }
                        }
                    }
                    kVar = kVar2;
                }
                if (kVar != null) {
                    this.c.add(kVar);
                }
                it5 = it;
            }
        }
        Node d15 = c1.d(node, "Extensions");
        if (d15 != null) {
            Iterator it12 = ((ArrayList) c1.c(d15, "Extension")).iterator();
            while (it12.hasNext()) {
                Node node5 = (Node) it12.next();
                if ("AdVerifications".equalsIgnoreCase(c1.b(node5, "type"))) {
                    a(node5);
                }
                if ("FMPCompanionAssets".equalsIgnoreCase(c1.b(node5, "type"))) {
                    IAlog.a("parseFMPCompanionAssetsTag", new Object[0]);
                    Node d16 = c1.d(node5, "FMPCompanionAssets");
                    if (d16 != null) {
                        l lVar = new l();
                        Node d17 = c1.d(d16, "Name");
                        if (d17 != null) {
                            lVar.a = c1.a(d17);
                        }
                        Node d18 = c1.d(d16, "Description");
                        if (d18 != null) {
                            lVar.b = c1.a(d18);
                        }
                        Node d19 = c1.d(d16, "Icons");
                        if (d19 != null) {
                            lVar.c = new ArrayList();
                            Iterator it13 = ((ArrayList) c1.c(d19, "Icon")).iterator();
                            while (it13.hasNext()) {
                                lVar.c.add(c1.a((Node) it13.next()));
                            }
                        }
                        Node d20 = c1.d(d16, "Rating");
                        if (d20 != null) {
                            try {
                                lVar.e = Float.parseFloat(c1.a(d20));
                            } catch (Exception unused3) {
                            }
                        }
                        Node d21 = c1.d(d16, "Screenshots");
                        if (d21 != null) {
                            lVar.f = new ArrayList();
                            Iterator it14 = ((ArrayList) c1.c(d21, "Screenshot")).iterator();
                            while (it14.hasNext()) {
                                String a7 = c1.a((Node) it14.next());
                                if (!TextUtils.isEmpty(a7)) {
                                    lVar.f.add(a7);
                                }
                            }
                        }
                        this.e = lVar;
                    }
                }
            }
        }
        a(node);
    }
}
