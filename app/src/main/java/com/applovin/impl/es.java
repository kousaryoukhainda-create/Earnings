package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class es {
    public static final es f = new es();
    private final es a;
    private final String b;
    private final Map c;
    protected String d;
    protected final List e;

    private es() {
        this.a = null;
        this.b = "";
        this.c = Collections.emptyMap();
        this.d = "";
        this.e = Collections.emptyList();
    }

    public List a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.e.size());
            for (es esVar : this.e) {
                if (str.equalsIgnoreCase(esVar.c())) {
                    arrayList.add(esVar);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public List b() {
        return Collections.unmodifiableList(this.e);
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.b + "', text='" + this.d + "', attributes=" + this.c + '}';
    }

    public es b(String str) {
        if (str != null) {
            if (this.e.size() > 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this);
                while (!arrayList.isEmpty()) {
                    es esVar = (es) arrayList.get(0);
                    arrayList.remove(0);
                    if (str.equalsIgnoreCase(esVar.c())) {
                        return esVar;
                    }
                    arrayList.addAll(esVar.b());
                }
                return null;
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public es c(String str) {
        if (str != null) {
            for (es esVar : this.e) {
                if (str.equalsIgnoreCase(esVar.c())) {
                    return esVar;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    public Map a() {
        return this.c;
    }

    public es(String str, Map map, es esVar) {
        this.a = esVar;
        this.b = str;
        this.c = Collections.unmodifiableMap(map);
        this.e = new ArrayList();
    }
}
