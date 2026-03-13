package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class z {
    public final String a;
    public final String b;
    public final Map<String, String> c;

    public z(WebResourceRequest webResourceRequest) {
        Map<String, String> requestHeaders;
        this.a = webResourceRequest.getUrl().toString();
        this.b = webResourceRequest.getMethod();
        if (webResourceRequest.getRequestHeaders() == null) {
            requestHeaders = Collections.emptyMap();
        } else {
            requestHeaders = webResourceRequest.getRequestHeaders();
        }
        this.c = new HashMap(requestHeaders);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        if (!this.a.equals(zVar.a) || !this.b.equals(zVar.b)) {
            return false;
        }
        return this.c.equals(zVar.c);
    }

    public int hashCode() {
        return this.c.hashCode() + AbstractC2437ph.b(this.a.hashCode() * 31, 31, this.b);
    }
}
