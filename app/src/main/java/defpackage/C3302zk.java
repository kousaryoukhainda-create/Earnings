package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: zk  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3302zk {
    public final /* synthetic */ int a;
    public HashMap b;

    public C3302zk(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new HashMap();
                return;
            case 2:
                this.b = new HashMap();
                return;
            default:
                return;
        }
    }

    public void a(C3302zk newFields) {
        Intrinsics.checkNotNullParameter(newFields, "newFields");
        for (Map.Entry entry : newFields.b.entrySet()) {
            b((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public void b(String key, Object obj) {
        switch (this.a) {
            case 1:
                Intrinsics.checkNotNullParameter(key, "key");
                if (key != null && key.length() != 0) {
                    this.b.put(key, String.valueOf(obj));
                    return;
                }
                return;
            default:
                this.b.put(key, obj);
                return;
        }
    }
}
