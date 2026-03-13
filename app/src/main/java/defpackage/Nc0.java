package defpackage;

import java.util.Objects;
/* renamed from: Nc0  reason: default package */
/* loaded from: classes.dex */
public final class Nc0 {
    public final String a;
    public final int b;

    public Nc0(String str) {
        this.a = str;
        this.b = 0;
    }

    public final String a() {
        String str;
        int i = this.b;
        if (i == 0) {
            return this.a;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        if (i == 0) {
            str = "String";
        } else if (i != 1) {
            str = "Unknown";
        } else {
            str = "ArrayBuffer";
        }
        throw new IllegalStateException(BK.o(sb, str, " expected, but got ", "String"));
    }

    public Nc0(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.a = null;
        this.b = 1;
    }
}
