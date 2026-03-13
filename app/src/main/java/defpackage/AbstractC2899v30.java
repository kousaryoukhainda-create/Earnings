package defpackage;

import android.util.Pair;
import java.util.LinkedList;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: v30  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2899v30 {
    public final String a;
    public final String b;
    public final AbstractC2899v30 c;
    public final LinkedList d = new LinkedList();

    public AbstractC2899v30(AbstractC2899v30 abstractC2899v30, String str, String str2) {
        this.c = abstractC2899v30;
        this.a = str;
        this.b = str2;
    }

    public static int g(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw QQ.b(null, e);
            }
        }
        return -1;
    }

    public static long h(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw QQ.b(null, e);
            }
        }
        return j;
    }

    public static int i(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw QQ.b(null, e);
            }
        }
        throw new C2985w30(str, 0);
    }

    public abstract Object b();

    public final Object c(String str) {
        int i = 0;
        while (true) {
            LinkedList linkedList = this.d;
            if (i < linkedList.size()) {
                Pair pair = (Pair) linkedList.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
                i++;
            } else {
                AbstractC2899v30 abstractC2899v30 = this.c;
                if (abstractC2899v30 == null) {
                    return null;
                }
                return abstractC2899v30.c(str);
            }
        }
    }

    public boolean d(String str) {
        return false;
    }

    public final Object e(XmlPullParser xmlPullParser) {
        boolean z = false;
        int i = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            AbstractC2899v30 abstractC2899v30 = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType != 2) {
                if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        k(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name = xmlPullParser.getName();
                    f(xmlPullParser);
                    if (!d(name)) {
                        return b();
                    }
                }
            } else {
                String name2 = xmlPullParser.getName();
                if (this.b.equals(name2)) {
                    j(xmlPullParser);
                    z = true;
                } else if (z) {
                    if (i > 0) {
                        i++;
                    } else if (d(name2)) {
                        j(xmlPullParser);
                    } else {
                        boolean equals = "QualityLevel".equals(name2);
                        String str = this.a;
                        if (equals) {
                            abstractC2899v30 = new AbstractC2899v30(this, str, "QualityLevel");
                        } else if ("Protection".equals(name2)) {
                            abstractC2899v30 = new AbstractC2899v30(this, str, "Protection");
                        } else if ("StreamIndex".equals(name2)) {
                            abstractC2899v30 = new A30(this, str);
                        }
                        if (abstractC2899v30 == null) {
                            i = 1;
                        } else {
                            a(abstractC2899v30.e(xmlPullParser));
                        }
                    }
                }
            }
            xmlPullParser.next();
        }
    }

    public abstract void j(XmlPullParser xmlPullParser);

    public final void l(Object obj, String str) {
        this.d.add(Pair.create(str, obj));
    }

    public void a(Object obj) {
    }

    public void f(XmlPullParser xmlPullParser) {
    }

    public void k(XmlPullParser xmlPullParser) {
    }
}
