package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class q {
    public static volatile q b;
    public static final q c = new q(true);
    public final Map<a, GeneratedMessageLite.e<?, ?>> a;

    /* loaded from: classes.dex */
    public static final class a {
        public final Object a;
        public final int b;

        public a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a != aVar.a || this.b != aVar.b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    public q() {
        this.a = new HashMap();
    }

    public static q a() {
        q qVar = b;
        if (qVar == null) {
            synchronized (q.class) {
                qVar = b;
                if (qVar == null) {
                    Class<?> cls = p.a;
                    q qVar2 = null;
                    if (cls != null) {
                        try {
                            qVar2 = (q) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    if (qVar2 == null) {
                        qVar2 = c;
                    }
                    b = qVar2;
                    qVar = qVar2;
                }
            }
        }
        return qVar;
    }

    public q(boolean z) {
        this.a = Collections.emptyMap();
    }
}
