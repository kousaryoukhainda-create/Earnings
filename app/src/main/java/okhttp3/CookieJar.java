package okhttp3;

import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public interface CookieJar {
    public static final CookieJar a = new CookieJar() { // from class: okhttp3.CookieJar.1
        @Override // okhttp3.CookieJar
        public final List a() {
            return Collections.emptyList();
        }
    };

    List a();
}
