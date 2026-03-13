package defpackage;

import com.fyber.fairbid.http.connection.HttpConnection;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* renamed from: xX  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3107xX {
    public final C2657sD a;

    static {
        new C0942bV(2).A();
    }

    public C3107xX(C0942bV c0942bV) {
        C2657sD c2657sD;
        Set entrySet = ((C1375ff) ((WC) c0942bV.c).c).entrySet();
        if (((AbstractCollection) entrySet).isEmpty()) {
            c2657sD = C2796tr.g;
        } else {
            C1204df c1204df = (C1204df) entrySet;
            C1150d1 c1150d1 = new C1150d1(c1204df.c.size());
            Iterator it = c1204df.iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                AbstractC2571rD r = AbstractC2571rD.r((Collection) entry.getValue());
                if (!r.isEmpty()) {
                    c1150d1.k(key, r);
                    i = r.size() + i;
                }
            }
            c2657sD = new C2657sD(c1150d1.b(), i);
        }
        this.a = c2657sD;
    }

    public static String b(String str) {
        if (AbstractC1906jZ.t(str, "Accept")) {
            return "Accept";
        }
        if (AbstractC1906jZ.t(str, "Allow")) {
            return "Allow";
        }
        if (AbstractC1906jZ.t(str, "Authorization")) {
            return "Authorization";
        }
        if (AbstractC1906jZ.t(str, "Bandwidth")) {
            return "Bandwidth";
        }
        if (AbstractC1906jZ.t(str, "Blocksize")) {
            return "Blocksize";
        }
        if (AbstractC1906jZ.t(str, "Cache-Control")) {
            return "Cache-Control";
        }
        if (AbstractC1906jZ.t(str, "Connection")) {
            return "Connection";
        }
        if (AbstractC1906jZ.t(str, "Content-Base")) {
            return "Content-Base";
        }
        if (AbstractC1906jZ.t(str, HttpConnection.CONTENT_ENCODING)) {
            return HttpConnection.CONTENT_ENCODING;
        }
        if (AbstractC1906jZ.t(str, "Content-Language")) {
            return "Content-Language";
        }
        if (AbstractC1906jZ.t(str, "Content-Length")) {
            return "Content-Length";
        }
        if (AbstractC1906jZ.t(str, "Content-Location")) {
            return "Content-Location";
        }
        if (AbstractC1906jZ.t(str, HttpConnection.CONTENT_TYPE_HEADER)) {
            return HttpConnection.CONTENT_TYPE_HEADER;
        }
        if (AbstractC1906jZ.t(str, "CSeq")) {
            return "CSeq";
        }
        if (AbstractC1906jZ.t(str, "Date")) {
            return "Date";
        }
        if (AbstractC1906jZ.t(str, "Expires")) {
            return "Expires";
        }
        if (AbstractC1906jZ.t(str, "Location")) {
            return "Location";
        }
        if (AbstractC1906jZ.t(str, "Proxy-Authenticate")) {
            return "Proxy-Authenticate";
        }
        if (AbstractC1906jZ.t(str, "Proxy-Require")) {
            return "Proxy-Require";
        }
        if (AbstractC1906jZ.t(str, "Public")) {
            return "Public";
        }
        if (AbstractC1906jZ.t(str, "Range")) {
            return "Range";
        }
        if (AbstractC1906jZ.t(str, "RTP-Info")) {
            return "RTP-Info";
        }
        if (AbstractC1906jZ.t(str, "RTCP-Interval")) {
            return "RTCP-Interval";
        }
        if (AbstractC1906jZ.t(str, "Scale")) {
            return "Scale";
        }
        if (AbstractC1906jZ.t(str, "Session")) {
            return "Session";
        }
        if (AbstractC1906jZ.t(str, "Speed")) {
            return "Speed";
        }
        if (AbstractC1906jZ.t(str, "Supported")) {
            return "Supported";
        }
        if (AbstractC1906jZ.t(str, "Timestamp")) {
            return "Timestamp";
        }
        if (AbstractC1906jZ.t(str, "Transport")) {
            return "Transport";
        }
        if (AbstractC1906jZ.t(str, HttpConnection.USER_AGENT_HEADER)) {
            return HttpConnection.USER_AGENT_HEADER;
        }
        if (AbstractC1906jZ.t(str, "Via")) {
            return "Via";
        }
        if (AbstractC1906jZ.t(str, "WWW-Authenticate")) {
            return "WWW-Authenticate";
        }
        return str;
    }

    public final C2657sD a() {
        return this.a;
    }

    public final String c(String str) {
        AbstractC2571rD d = this.a.d(b(str));
        if (d.isEmpty()) {
            return null;
        }
        return (String) AbstractC0867af0.T(d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3107xX)) {
            return false;
        }
        return this.a.equals(((C3107xX) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
