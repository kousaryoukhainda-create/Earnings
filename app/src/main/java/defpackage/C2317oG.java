package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
/* renamed from: oG  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2317oG implements YT {
    public volatile Set a;
    public volatile Set b;

    public final synchronized void a() {
        try {
            for (YT yt : this.a) {
                this.b.add(yt.get());
            }
            this.a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.YT
    public final Object get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}
