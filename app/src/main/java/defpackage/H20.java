package defpackage;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import javax.security.auth.x500.X500Principal;
/* renamed from: H20  reason: default package */
/* loaded from: classes.dex */
public final class H20 {
    public static final R9 h = new R9(16);
    public static final R9 i = new R9(17);
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Serializable f;
    public Object g;

    public H20(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f = name;
        this.a = name.length();
    }

    public int a(int i2) {
        int i3;
        int i4;
        int i5 = i2 + 1;
        int i6 = this.a;
        String str = (String) this.f;
        if (i5 < i6) {
            char[] cArr = (char[]) this.g;
            char c = cArr[i2];
            if (c >= '0' && c <= '9') {
                i3 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i3 = c - 'W';
            } else if (c >= 'A' && c <= 'F') {
                i3 = c - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            char c2 = cArr[i5];
            if (c2 >= '0' && c2 <= '9') {
                i4 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i4 = c2 - 'W';
            } else if (c2 >= 'A' && c2 <= 'F') {
                i4 = c2 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            return (i3 << 4) + i4;
        }
        throw new IllegalStateException("Malformed DN: " + str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(float f, int i2) {
        G20 g20;
        int i3 = this.b;
        ArrayList arrayList = (ArrayList) this.f;
        if (i3 != 1) {
            Collections.sort(arrayList, h);
            this.b = 1;
        }
        int i4 = this.e;
        G20[] g20Arr = (G20[]) this.g;
        if (i4 > 0) {
            int i5 = i4 - 1;
            this.e = i5;
            g20 = g20Arr[i5];
        } else {
            g20 = new Object();
        }
        int i6 = this.c;
        this.c = i6 + 1;
        g20.a = i6;
        g20.b = i2;
        g20.c = f;
        arrayList.add(g20);
        this.d += i2;
        while (true) {
            int i7 = this.d;
            int i8 = this.a;
            if (i7 > i8) {
                int i9 = i7 - i8;
                G20 g202 = (G20) arrayList.get(0);
                int i10 = g202.b;
                if (i10 <= i9) {
                    this.d -= i10;
                    arrayList.remove(0);
                    int i11 = this.e;
                    if (i11 < 5) {
                        this.e = i11 + 1;
                        g20Arr[i11] = g202;
                    }
                } else {
                    g202.b = i10 - i9;
                    this.d -= i9;
                }
            } else {
                return;
            }
        }
    }

    public char c() {
        int i2;
        int i3 = this.b + 1;
        this.b = i3;
        int i4 = this.a;
        if (i3 != i4) {
            char c = ((char[]) this.g)[i3];
            if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
                switch (c) {
                    case TokenParametersOuterClass$TokenParameters.SECURECONTENT_FIELD_NUMBER /* 42 */:
                    case TokenParametersOuterClass$TokenParameters.BATTERYCHARGING_FIELD_NUMBER /* 43 */:
                    case TokenParametersOuterClass$TokenParameters.BATTERYLEVEL_FIELD_NUMBER /* 44 */:
                        break;
                    default:
                        switch (c) {
                            case TokenParametersOuterClass$TokenParameters.PRIORCLICKS_FIELD_NUMBER /* 59 */:
                            case TokenParametersOuterClass$TokenParameters.PRIORSKIP_FIELD_NUMBER /* 60 */:
                            case TokenParametersOuterClass$TokenParameters.PRIORCLICKTYPES_FIELD_NUMBER /* 61 */:
                            case TokenParametersOuterClass$TokenParameters.USERSESSIONS_FIELD_NUMBER /* 62 */:
                                break;
                            default:
                                int a = a(i3);
                                this.b++;
                                if (a >= 128) {
                                    if (a >= 192 && a <= 247) {
                                        if (a <= 223) {
                                            a &= 31;
                                            i2 = 1;
                                        } else if (a <= 239) {
                                            a &= 15;
                                            i2 = 2;
                                        } else {
                                            a &= 7;
                                            i2 = 3;
                                        }
                                        for (int i5 = 0; i5 < i2; i5++) {
                                            int i6 = this.b;
                                            int i7 = i6 + 1;
                                            this.b = i7;
                                            if (i7 != i4 && ((char[]) this.g)[i7] == '\\') {
                                                int i8 = i6 + 2;
                                                this.b = i8;
                                                int a2 = a(i8);
                                                this.b++;
                                                if ((a2 & 192) == 128) {
                                                    a = (a << 6) + (a2 & 63);
                                                }
                                            }
                                        }
                                    }
                                    return '?';
                                }
                                return (char) a;
                        }
                }
            }
            return c;
        }
        throw new IllegalStateException("Unexpected end of DN: " + ((String) this.f));
    }

    public String d() {
        int i2;
        int i3;
        int i4;
        char c;
        char c2;
        char c3;
        int i5;
        char c4;
        char c5;
        while (true) {
            i2 = this.b;
            i3 = this.a;
            if (i2 >= i3 || ((char[]) this.g)[i2] != ' ') {
                break;
            }
            this.b = i2 + 1;
        }
        if (i2 == i3) {
            return null;
        }
        this.c = i2;
        this.b = i2 + 1;
        while (true) {
            i4 = this.b;
            if (i4 >= i3 || (c5 = ((char[]) this.g)[i4]) == '=' || c5 == ' ') {
                break;
            }
            this.b = i4 + 1;
        }
        String str = (String) this.f;
        if (i4 < i3) {
            this.d = i4;
            if (((char[]) this.g)[i4] == ' ') {
                while (true) {
                    i5 = this.b;
                    if (i5 >= i3 || (c4 = ((char[]) this.g)[i5]) == '=' || c4 != ' ') {
                        break;
                    }
                    this.b = i5 + 1;
                }
                if (((char[]) this.g)[i5] != '=' || i5 == i3) {
                    throw new IllegalStateException("Unexpected end of DN: " + str);
                }
            }
            this.b++;
            while (true) {
                int i6 = this.b;
                if (i6 >= i3 || ((char[]) this.g)[i6] != ' ') {
                    break;
                }
                this.b = i6 + 1;
            }
            int i7 = this.d;
            int i8 = this.c;
            if (i7 - i8 > 4) {
                char[] cArr = (char[]) this.g;
                if (cArr[i8 + 3] == '.' && (((c = cArr[i8]) == 'O' || c == 'o') && (((c2 = cArr[i8 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i8 + 2]) == 'D' || c3 == 'd')))) {
                    this.c = i8 + 4;
                }
            }
            int i9 = this.c;
            return new String((char[]) this.g, i9, i7 - i9);
        }
        throw new IllegalStateException("Unexpected end of DN: " + str);
    }

    public float e() {
        int i2 = this.b;
        ArrayList arrayList = (ArrayList) this.f;
        if (i2 != 0) {
            Collections.sort(arrayList, i);
            this.b = 0;
        }
        float f = 0.5f * this.d;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            G20 g20 = (G20) arrayList.get(i4);
            i3 += g20.b;
            if (i3 >= f) {
                return g20.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((G20) AbstractC0324Hi.c(1, arrayList)).c;
    }

    public H20(int i2) {
        this.a = i2;
        this.g = new G20[5];
        this.f = new ArrayList();
        this.b = -1;
    }
}
