package defpackage;

import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
/* renamed from: ec0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1284ec0 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        for (AbstractC0952bc0 abstractC0952bc0 : this.a.values()) {
            abstractC0952bc0.c = true;
            HashMap hashMap = abstractC0952bc0.a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        for (Object obj : abstractC0952bc0.a.values()) {
                            AbstractC0952bc0.a(obj);
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC0952bc0.b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable closeable : abstractC0952bc0.b) {
                            AbstractC0952bc0.a(closeable);
                        }
                    } finally {
                    }
                }
                abstractC0952bc0.b.clear();
            }
            abstractC0952bc0.b();
        }
        this.a.clear();
    }
}
