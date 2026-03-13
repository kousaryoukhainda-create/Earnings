package com.applovin.impl;

import com.applovin.impl.db;
import com.applovin.impl.lf;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
/* loaded from: classes.dex */
abstract class hs {
    private static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static lf a(String str) {
        try {
            return b(str);
        } catch (ch | NumberFormatException | XmlPullParserException unused) {
            oc.d("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static lf b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (gs.c(newPullParser, "x:xmpmeta")) {
            db h = db.h();
            long j = -9223372036854775807L;
            do {
                newPullParser.next();
                if (gs.c(newPullParser, "rdf:Description")) {
                    if (!b(newPullParser)) {
                        return null;
                    }
                    j = c(newPullParser);
                    h = a(newPullParser);
                } else if (gs.c(newPullParser, "Container:Directory")) {
                    h = a(newPullParser, "Container", "Item");
                } else if (gs.c(newPullParser, "GContainer:Directory")) {
                    h = a(newPullParser, "GContainer", "GContainerItem");
                }
            } while (!gs.b(newPullParser, "x:xmpmeta"));
            if (h.isEmpty()) {
                return null;
            }
            return new lf(j, h);
        }
        throw ch.a("Couldn't find xmp metadata", null);
    }

    private static long c(XmlPullParser xmlPullParser) {
        for (String str : b) {
            String a2 = gs.a(xmlPullParser, str);
            if (a2 != null) {
                long parseLong = Long.parseLong(a2);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    private static db a(XmlPullParser xmlPullParser) {
        for (String str : c) {
            String a2 = gs.a(xmlPullParser, str);
            if (a2 != null) {
                return db.a(new lf.a("image/jpeg", "Primary", 0L, 0L), new lf.a("video/mp4", "MotionPhoto", Long.parseLong(a2), 0L));
            }
        }
        return db.h();
    }

    private static db a(XmlPullParser xmlPullParser, String str, String str2) {
        db.a f = db.f();
        String f2 = AbstractC0324Hi.f(str, ":Item");
        String f3 = AbstractC0324Hi.f(str, ":Directory");
        do {
            xmlPullParser.next();
            if (gs.c(xmlPullParser, f2)) {
                String f4 = AbstractC0324Hi.f(str2, ":Mime");
                String f5 = AbstractC0324Hi.f(str2, ":Semantic");
                String f6 = AbstractC0324Hi.f(str2, ":Length");
                String f7 = AbstractC0324Hi.f(str2, ":Padding");
                String a2 = gs.a(xmlPullParser, f4);
                String a3 = gs.a(xmlPullParser, f5);
                String a4 = gs.a(xmlPullParser, f6);
                String a5 = gs.a(xmlPullParser, f7);
                if (a2 != null && a3 != null) {
                    f.b(new lf.a(a2, a3, a4 != null ? Long.parseLong(a4) : 0L, a5 != null ? Long.parseLong(a5) : 0L));
                } else {
                    return db.h();
                }
            }
        } while (!gs.b(xmlPullParser, f3));
        return f.a();
    }

    private static boolean b(XmlPullParser xmlPullParser) {
        for (String str : a) {
            String a2 = gs.a(xmlPullParser, str);
            if (a2 != null) {
                return Integer.parseInt(a2) == 1;
            }
        }
        return false;
    }
}
