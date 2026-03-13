package defpackage;

import android.util.Log;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.Writer;
/* renamed from: CI  reason: default package */
/* loaded from: classes.dex */
public final class CI extends Writer {
    public final /* synthetic */ int b;
    public final Object c;
    public final CharSequence d;

    public CI() {
        this.b = 0;
        this.d = new StringBuilder((int) UserVerificationMethods.USER_VERIFY_PATTERN);
        this.c = "FragmentManager";
    }

    public void c() {
        StringBuilder sb = (StringBuilder) this.d;
        if (sb.length() > 0) {
            Log.d((String) this.c, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.b) {
            case 0:
                c();
                return;
            default:
                return;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.b) {
            case 0:
                c();
                return;
            default:
                return;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        switch (this.b) {
            case 0:
                for (int i3 = 0; i3 < i2; i3++) {
                    char c = cArr[i + i3];
                    if (c == '\n') {
                        c();
                    } else {
                        ((StringBuilder) this.d).append(c);
                    }
                }
                return;
            default:
                C2643s40 c2643s40 = (C2643s40) this.d;
                c2643s40.b = cArr;
                ((Appendable) this.c).append(c2643s40, i, i2 + i);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.CharSequence, java.lang.Object] */
    public CI(Appendable appendable) {
        this.b = 1;
        this.d = new Object();
        this.c = appendable;
    }

    @Override // java.io.Writer
    public void write(int i) {
        switch (this.b) {
            case 1:
                ((Appendable) this.c).append((char) i);
                return;
            default:
                super.write(i);
                return;
        }
    }

    private final void a() {
    }

    private final void b() {
    }
}
