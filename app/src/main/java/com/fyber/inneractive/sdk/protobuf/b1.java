package com.fyber.inneractive.sdk.protobuf;
/* loaded from: classes.dex */
public final class b1 implements m0 {
    public final o0 a;
    public final String b;
    public final Object[] c;
    public final int d;

    public b1(o0 o0Var, String str, Object[] objArr) {
        char charAt;
        this.a = o0Var;
        this.b = str;
        this.c = objArr;
        try {
            charAt = str.charAt(0);
        } catch (StringIndexOutOfBoundsException unused) {
            char[] charArray = str.toCharArray();
            str = new String(charArray);
            try {
                try {
                    charAt = str.charAt(0);
                } catch (StringIndexOutOfBoundsException unused2) {
                    char[] cArr = new char[str.length()];
                    str.getChars(0, str.length(), cArr, 0);
                    String str2 = new String(cArr);
                    try {
                        charAt = str2.charAt(0);
                        str = str2;
                    } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
                        e = e;
                        str = str2;
                        throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str, Integer.valueOf(charArray.length)), e);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str, Integer.valueOf(charArray.length)), e);
            } catch (StringIndexOutOfBoundsException e3) {
                e = e3;
                throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str, Integer.valueOf(charArray.length)), e);
            }
        }
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            } else {
                this.d = i | (charAt2 << i3);
                return;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m0
    public y0 a() {
        if ((this.d & 1) == 1) {
            return y0.PROTO2;
        }
        return y0.PROTO3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m0
    public o0 b() {
        return this.a;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.m0
    public boolean c() {
        if ((this.d & 2) == 2) {
            return true;
        }
        return false;
    }
}
