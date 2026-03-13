package com.fyber.inneractive.sdk.response;

import android.util.Xml;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.g0;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class h {
    public boolean a;
    public String b;

    public h(String str) throws Exception {
        this.a = false;
        try {
            a(str);
            this.a = true;
            IAlog.a("parser: Parsing finished. parser is ready", new Object[0]);
        } catch (Exception e) {
            IAlog.b("Error parsing Ad XML: %s", e.getMessage());
            throw e;
        }
    }

    public final void a(String str) throws XmlPullParserException, IOException {
        String str2;
        String a;
        IAlog.a("Start reading Response", new Object[0]);
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        newPullParser.require(2, null, "tns:Response");
        while (newPullParser.next() != 3) {
            if (newPullParser.getEventType() == 2) {
                if (newPullParser.getName().equals("tns:Ad")) {
                    newPullParser.require(2, null, "tns:Ad");
                    IAlog.a("Start reading Ad", new Object[0]);
                    if (newPullParser.next() == 4) {
                        str2 = newPullParser.getText();
                        newPullParser.nextTag();
                    } else {
                        IAlog.e("No text: %s", newPullParser.getName());
                        str2 = "";
                    }
                    String trim = str2.trim();
                    IAlog.d("Ad content: %s", trim);
                    if (trim == null) {
                        a = null;
                    } else {
                        a = g0.f.a(trim);
                    }
                    this.b = a;
                } else if (newPullParser.getEventType() == 2) {
                    int i = 1;
                    while (i != 0) {
                        int next = newPullParser.next();
                        if (next != 2) {
                            if (next == 3) {
                                i--;
                            }
                        } else {
                            i++;
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
