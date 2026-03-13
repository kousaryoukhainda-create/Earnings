package j$.time.format;

import java.text.ParsePosition;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes4.dex */
class n {
    protected String a;
    protected String b;
    protected char c;
    protected n d;
    protected n e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ n(String str, String str2, n nVar, int i) {
        this(str, str2, nVar);
    }

    protected boolean c(char c, char c2) {
        return c == c2;
    }

    private n(String str, String str2, n nVar) {
        this.a = str;
        this.b = str2;
        this.d = nVar;
        if (str.isEmpty()) {
            this.c = (char) 65535;
        } else {
            this.c = this.a.charAt(0);
        }
    }

    public static n f(w wVar) {
        if (wVar.k()) {
            return new n("", null, null);
        }
        return new n("", null, null);
    }

    public static n g(Set set, w wVar) {
        n f = f(wVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            f.b(str, str);
        }
        return f;
    }

    public final void a(String str, String str2) {
        b(str, str2);
    }

    public final String d(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (h(charSequence, index, length)) {
            int length2 = this.a.length() + index;
            n nVar = this.d;
            if (nVar != null && length2 != length) {
                while (true) {
                    if (c(nVar.c, charSequence.charAt(length2))) {
                        parsePosition.setIndex(length2);
                        String d = nVar.d(charSequence, parsePosition);
                        if (d != null) {
                            return d;
                        }
                    } else {
                        nVar = nVar.e;
                        if (nVar == null) {
                            break;
                        }
                    }
                }
            }
            parsePosition.setIndex(length2);
            return this.b;
        }
        return null;
    }

    protected n e(String str, String str2, n nVar) {
        return new n(str, str2, nVar);
    }

    protected boolean h(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.a, i);
        }
        int length = this.a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!c(this.a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }

    private boolean b(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < this.a.length() && c(str.charAt(i), this.a.charAt(i))) {
            i++;
        }
        if (i == this.a.length()) {
            if (i < str.length()) {
                String substring = str.substring(i);
                for (n nVar = this.d; nVar != null; nVar = nVar.e) {
                    if (c(nVar.c, substring.charAt(0))) {
                        return nVar.b(substring, str2);
                    }
                }
                n e = e(substring, str2, null);
                e.e = this.d;
                this.d = e;
                return true;
            }
            this.b = str2;
            return true;
        }
        n e2 = e(this.a.substring(i), this.b, this.d);
        this.a = str.substring(0, i);
        this.d = e2;
        if (i < str.length()) {
            this.d.e = e(str.substring(i), str2, null);
            this.b = null;
        } else {
            this.b = str2;
        }
        return true;
    }
}
