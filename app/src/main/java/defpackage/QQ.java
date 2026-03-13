package defpackage;

import java.io.IOException;
/* renamed from: QQ  reason: default package */
/* loaded from: classes.dex */
public class QQ extends IOException {
    public final boolean b;
    public final int c;

    public QQ(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.b = z;
        this.c = i;
    }

    public static QQ a(RuntimeException runtimeException, String str) {
        return new QQ(str, runtimeException, true, 1);
    }

    public static QQ b(String str, Exception exc) {
        return new QQ(str, exc, true, 4);
    }

    public static QQ c(String str) {
        return new QQ(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("{contentIsMalformed=");
        sb.append(this.b);
        sb.append(", dataType=");
        return AbstractC2437ph.k(sb, this.c, "}");
    }
}
