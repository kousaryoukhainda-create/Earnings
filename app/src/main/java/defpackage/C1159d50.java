package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: d50  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1159d50 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public C1159d50(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v58 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r4;
        int i;
        char charAt;
        char charAt2;
        boolean z;
        ColorStateList colorStateList;
        int resourceId;
        C0997c50 c0997c50 = new C0997c50(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType != r4) {
                if (eventType != i) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z3 && name2.equals(str)) {
                            z3 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            c0997c50.b = 0;
                            c0997c50.c = 0;
                            c0997c50.d = 0;
                            c0997c50.e = 0;
                            c0997c50.f = r4;
                            c0997c50.g = r4;
                        } else if (name2.equals("item")) {
                            if (!c0997c50.h) {
                                c0997c50.h = r4;
                                c0997c50.b(c0997c50.a.add(c0997c50.b, c0997c50.i, c0997c50.j, c0997c50.k));
                            }
                        } else if (name2.equals("menu")) {
                            z2 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = 1;
                        i = 2;
                    }
                } else if (!z3) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C1159d50 c1159d50 = c0997c50.D;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c1159d50.c.obtainStyledAttributes(attributeSet, AbstractC3104xU.m);
                        c0997c50.b = obtainStyledAttributes.getResourceId(r4, 0);
                        c0997c50.c = obtainStyledAttributes.getInt(3, 0);
                        c0997c50.d = obtainStyledAttributes.getInt(4, 0);
                        c0997c50.e = obtainStyledAttributes.getInt(5, 0);
                        c0997c50.f = obtainStyledAttributes.getBoolean(2, r4);
                        c0997c50.g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = c1159d50.c;
                        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC3104xU.n);
                        c0997c50.i = obtainStyledAttributes2.getResourceId(2, 0);
                        c0997c50.j = (obtainStyledAttributes2.getInt(5, c0997c50.c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0997c50.d) & 65535);
                        c0997c50.k = obtainStyledAttributes2.getText(7);
                        c0997c50.l = obtainStyledAttributes2.getText(8);
                        c0997c50.m = obtainStyledAttributes2.getResourceId(0, 0);
                        String string = obtainStyledAttributes2.getString(9);
                        if (string == null) {
                            charAt = 0;
                        } else {
                            charAt = string.charAt(0);
                        }
                        c0997c50.n = charAt;
                        c0997c50.o = obtainStyledAttributes2.getInt(16, 4096);
                        String string2 = obtainStyledAttributes2.getString(10);
                        if (string2 == null) {
                            charAt2 = 0;
                        } else {
                            charAt2 = string2.charAt(0);
                        }
                        c0997c50.p = charAt2;
                        c0997c50.q = obtainStyledAttributes2.getInt(20, 4096);
                        if (obtainStyledAttributes2.hasValue(11)) {
                            c0997c50.r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            c0997c50.r = c0997c50.e;
                        }
                        c0997c50.s = obtainStyledAttributes2.getBoolean(3, false);
                        c0997c50.t = obtainStyledAttributes2.getBoolean(4, c0997c50.f);
                        c0997c50.u = obtainStyledAttributes2.getBoolean(1, c0997c50.g);
                        c0997c50.v = obtainStyledAttributes2.getInt(21, -1);
                        c0997c50.y = obtainStyledAttributes2.getString(12);
                        c0997c50.w = obtainStyledAttributes2.getResourceId(13, 0);
                        c0997c50.x = obtainStyledAttributes2.getString(15);
                        String string3 = obtainStyledAttributes2.getString(14);
                        if (string3 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z && c0997c50.w == 0 && c0997c50.x == null) {
                            if (c0997c50.a(string3, f, c1159d50.b) != null) {
                                throw new ClassCastException();
                            }
                        } else if (z) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        c0997c50.z = obtainStyledAttributes2.getText(17);
                        c0997c50.A = obtainStyledAttributes2.getText(22);
                        if (obtainStyledAttributes2.hasValue(19)) {
                            c0997c50.C = AbstractC1137cq.c(obtainStyledAttributes2.getInt(19, -1), c0997c50.C);
                        } else {
                            c0997c50.C = null;
                        }
                        if (obtainStyledAttributes2.hasValue(18)) {
                            if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC2525qi.getColorStateList(context, resourceId)) == null) {
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                            }
                            c0997c50.B = colorStateList;
                        } else {
                            c0997c50.B = null;
                        }
                        obtainStyledAttributes2.recycle();
                        c0997c50.h = false;
                    } else {
                        if (name3.equals("menu")) {
                            c0997c50.h = true;
                            SubMenu addSubMenu = c0997c50.a.addSubMenu(c0997c50.b, c0997c50.i, c0997c50.j, c0997c50.k);
                            c0997c50.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            str = name3;
                            z3 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = 1;
                        i = 2;
                    }
                }
                eventType = xmlResourceParser.next();
                r4 = 1;
                i = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof IL)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.c.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof IL) {
                    IL il = (IL) menu;
                    if (!il.n) {
                        il.s();
                        z = true;
                    }
                }
                b(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((IL) menu).r();
                }
                xmlResourceParser.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((IL) menu).r();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
