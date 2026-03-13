package defpackage;

import java.io.File;
/* renamed from: M7  reason: default package */
/* loaded from: classes.dex */
public final class M7 {
    public final L7 a;
    public final String b;
    public final File c;

    public M7(L7 l7, String str, File file) {
        this.a = l7;
        if (str != null) {
            this.b = str;
            this.c = file;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof M7)) {
            return false;
        }
        M7 m7 = (M7) obj;
        if (this.a.equals(m7.a) && this.b.equals(m7.b) && this.c.equals(m7.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
